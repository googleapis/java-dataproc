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

package com.google.cloud.dataproc.v1;

import static com.google.cloud.dataproc.v1.BatchControllerClient.ListBatchesPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.Timestamp;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class BatchControllerClientTest {
  private static MockBatchController mockBatchController;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private BatchControllerClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockBatchController = new MockBatchController();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockBatchController));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    BatchControllerSettings settings =
        BatchControllerSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BatchControllerClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createBatchTest() throws Exception {
    Batch expectedResponse =
        Batch.newBuilder()
            .setName(BatchName.of("[PROJECT]", "[LOCATION]", "[BATCH]").toString())
            .setUuid("uuid3601339")
            .setCreateTime(Timestamp.newBuilder().build())
            .setRuntimeInfo(RuntimeInfo.newBuilder().build())
            .setStateMessage("stateMessage1128185398")
            .setStateTime(Timestamp.newBuilder().build())
            .setCreator("creator1028554796")
            .putAllLabels(new HashMap<String, String>())
            .setRuntimeConfig(RuntimeConfig.newBuilder().build())
            .setEnvironmentConfig(EnvironmentConfig.newBuilder().build())
            .setOperation("operation1662702951")
            .addAllStateHistory(new ArrayList<Batch.StateHistory>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createBatchTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBatchController.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Batch batch = Batch.newBuilder().build();
    String batchId = "batchId-331744779";

    Batch actualResponse = client.createBatchAsync(parent, batch, batchId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateBatchRequest actualRequest = ((CreateBatchRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(batch, actualRequest.getBatch());
    Assert.assertEquals(batchId, actualRequest.getBatchId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createBatchExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchController.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Batch batch = Batch.newBuilder().build();
      String batchId = "batchId-331744779";
      client.createBatchAsync(parent, batch, batchId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createBatchTest2() throws Exception {
    Batch expectedResponse =
        Batch.newBuilder()
            .setName(BatchName.of("[PROJECT]", "[LOCATION]", "[BATCH]").toString())
            .setUuid("uuid3601339")
            .setCreateTime(Timestamp.newBuilder().build())
            .setRuntimeInfo(RuntimeInfo.newBuilder().build())
            .setStateMessage("stateMessage1128185398")
            .setStateTime(Timestamp.newBuilder().build())
            .setCreator("creator1028554796")
            .putAllLabels(new HashMap<String, String>())
            .setRuntimeConfig(RuntimeConfig.newBuilder().build())
            .setEnvironmentConfig(EnvironmentConfig.newBuilder().build())
            .setOperation("operation1662702951")
            .addAllStateHistory(new ArrayList<Batch.StateHistory>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createBatchTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBatchController.addResponse(resultOperation);

    String parent = "parent-995424086";
    Batch batch = Batch.newBuilder().build();
    String batchId = "batchId-331744779";

    Batch actualResponse = client.createBatchAsync(parent, batch, batchId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateBatchRequest actualRequest = ((CreateBatchRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(batch, actualRequest.getBatch());
    Assert.assertEquals(batchId, actualRequest.getBatchId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createBatchExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchController.addException(exception);

    try {
      String parent = "parent-995424086";
      Batch batch = Batch.newBuilder().build();
      String batchId = "batchId-331744779";
      client.createBatchAsync(parent, batch, batchId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getBatchTest() throws Exception {
    Batch expectedResponse =
        Batch.newBuilder()
            .setName(BatchName.of("[PROJECT]", "[LOCATION]", "[BATCH]").toString())
            .setUuid("uuid3601339")
            .setCreateTime(Timestamp.newBuilder().build())
            .setRuntimeInfo(RuntimeInfo.newBuilder().build())
            .setStateMessage("stateMessage1128185398")
            .setStateTime(Timestamp.newBuilder().build())
            .setCreator("creator1028554796")
            .putAllLabels(new HashMap<String, String>())
            .setRuntimeConfig(RuntimeConfig.newBuilder().build())
            .setEnvironmentConfig(EnvironmentConfig.newBuilder().build())
            .setOperation("operation1662702951")
            .addAllStateHistory(new ArrayList<Batch.StateHistory>())
            .build();
    mockBatchController.addResponse(expectedResponse);

    BatchName name = BatchName.of("[PROJECT]", "[LOCATION]", "[BATCH]");

    Batch actualResponse = client.getBatch(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBatchRequest actualRequest = ((GetBatchRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBatchExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchController.addException(exception);

    try {
      BatchName name = BatchName.of("[PROJECT]", "[LOCATION]", "[BATCH]");
      client.getBatch(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getBatchTest2() throws Exception {
    Batch expectedResponse =
        Batch.newBuilder()
            .setName(BatchName.of("[PROJECT]", "[LOCATION]", "[BATCH]").toString())
            .setUuid("uuid3601339")
            .setCreateTime(Timestamp.newBuilder().build())
            .setRuntimeInfo(RuntimeInfo.newBuilder().build())
            .setStateMessage("stateMessage1128185398")
            .setStateTime(Timestamp.newBuilder().build())
            .setCreator("creator1028554796")
            .putAllLabels(new HashMap<String, String>())
            .setRuntimeConfig(RuntimeConfig.newBuilder().build())
            .setEnvironmentConfig(EnvironmentConfig.newBuilder().build())
            .setOperation("operation1662702951")
            .addAllStateHistory(new ArrayList<Batch.StateHistory>())
            .build();
    mockBatchController.addResponse(expectedResponse);

    String name = "name3373707";

    Batch actualResponse = client.getBatch(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBatchController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBatchRequest actualRequest = ((GetBatchRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBatchExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchController.addException(exception);

    try {
      String name = "name3373707";
      client.getBatch(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBatchesTest() throws Exception {
    Batch responsesElement = Batch.newBuilder().build();
    ListBatchesResponse expectedResponse =
        ListBatchesResponse.newBuilder()
            .setNextPageToken("")
            .addAllBatches(Arrays.asList(responsesElement))
            .build();
    mockBatchController.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListBatchesPagedResponse pagedListResponse = client.listBatches(parent);

    List<Batch> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getBatchesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBatchController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListBatchesRequest actualRequest = ((ListBatchesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listBatchesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchController.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listBatches(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBatchesTest2() throws Exception {
    Batch responsesElement = Batch.newBuilder().build();
    ListBatchesResponse expectedResponse =
        ListBatchesResponse.newBuilder()
            .setNextPageToken("")
            .addAllBatches(Arrays.asList(responsesElement))
            .build();
    mockBatchController.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListBatchesPagedResponse pagedListResponse = client.listBatches(parent);

    List<Batch> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getBatchesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBatchController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListBatchesRequest actualRequest = ((ListBatchesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listBatchesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchController.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listBatches(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteBatchTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockBatchController.addResponse(expectedResponse);

    BatchName name = BatchName.of("[PROJECT]", "[LOCATION]", "[BATCH]");

    client.deleteBatch(name);

    List<AbstractMessage> actualRequests = mockBatchController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteBatchRequest actualRequest = ((DeleteBatchRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteBatchExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchController.addException(exception);

    try {
      BatchName name = BatchName.of("[PROJECT]", "[LOCATION]", "[BATCH]");
      client.deleteBatch(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteBatchTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockBatchController.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteBatch(name);

    List<AbstractMessage> actualRequests = mockBatchController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteBatchRequest actualRequest = ((DeleteBatchRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteBatchExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBatchController.addException(exception);

    try {
      String name = "name3373707";
      client.deleteBatch(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
