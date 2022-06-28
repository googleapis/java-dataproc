/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.dataproc.v1.samples;

// [START dataproc_v1_generated_clustercontrollerclient_deletecluster_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dataproc.v1.ClusterControllerClient;
import com.google.cloud.dataproc.v1.DeleteClusterRequest;
import com.google.longrunning.Operation;

public class AsyncDeleteCluster {

  public static void main(String[] args) throws Exception {
    asyncDeleteCluster();
  }

  public static void asyncDeleteCluster() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
      DeleteClusterRequest request =
          DeleteClusterRequest.newBuilder()
              .setProjectId("projectId-894832108")
              .setRegion("region-934795532")
              .setClusterName("clusterName-1141738587")
              .setClusterUuid("clusterUuid-1141510955")
              .setRequestId("requestId693933066")
              .build();
      ApiFuture<Operation> future =
          clusterControllerClient.deleteClusterCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END dataproc_v1_generated_clustercontrollerclient_deletecluster_async]
