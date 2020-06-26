/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;

import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.dataproc.v1.Cluster;
import com.google.cloud.dataproc.v1.ClusterControllerClient;
import com.google.cloud.dataproc.v1.ClusterControllerSettings;
import com.google.cloud.dataproc.v1.ClusterOperationMetadata;
import com.google.protobuf.Empty;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SubmitHadoopFsJobTest {

  private static final String CLUSTER_NAME =
      String.format("java-fs-test--%s", UUID.randomUUID().toString());
  private static final String REGION = "us-central1";
  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static final String ENDPOINT = String.format("%s-dataproc.googleapis.com:443", REGION);
  private static final String HADOOP_FS_QUERY = "-ls /";

  private ByteArrayOutputStream bout;

  private static void requireEnv(String varName) {
    assertNotNull(
        String.format("Environment variable '%s' is required to perform these tests.", varName),
        System.getenv(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnv("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnv("GOOGLE_CLOUD_PROJECT");
  }

  @Before
  public void setUp() throws IOException, ExecutionException, InterruptedException {
    bout = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bout));

    ClusterControllerSettings clusterControllerSettings =
        ClusterControllerSettings.newBuilder().setEndpoint(ENDPOINT).build();

    try (ClusterControllerClient clusterControllerClient =
        ClusterControllerClient.create(clusterControllerSettings)) {
      // Create the Dataproc cluster.
      Cluster cluster = Cluster.newBuilder().setClusterName(CLUSTER_NAME).build();
      OperationFuture<Cluster, ClusterOperationMetadata> createClusterAsyncRequest =
          clusterControllerClient.createClusterAsync(PROJECT_ID, REGION, cluster);
      createClusterAsyncRequest.get();
    }
  }

  @Test
  public void submitHadoopFsJobTest() throws IOException, InterruptedException {
    SubmitHadoopFsJob.submitHadoopFsJob(PROJECT_ID, REGION, CLUSTER_NAME, HADOOP_FS_QUERY);
    String output = bout.toString();

    assertThat(output, CoreMatchers.containsString("/tmp"));
  }

  @After
  public void tearDown() throws IOException, InterruptedException, ExecutionException {

    ClusterControllerSettings clusterControllerSettings =
        ClusterControllerSettings.newBuilder().setEndpoint(ENDPOINT).build();

    try (ClusterControllerClient clusterControllerClient =
        ClusterControllerClient.create(clusterControllerSettings)) {
      OperationFuture<Empty, ClusterOperationMetadata> deleteClusterAsyncRequest =
          clusterControllerClient.deleteClusterAsync(PROJECT_ID, REGION, CLUSTER_NAME);
      deleteClusterAsyncRequest.get();
    }
  }
}
