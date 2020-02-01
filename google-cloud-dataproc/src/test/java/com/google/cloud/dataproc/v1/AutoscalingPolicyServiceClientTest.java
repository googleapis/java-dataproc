/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.dataproc.v1;

import static com.google.cloud.dataproc.v1.AutoscalingPolicyServiceClient.ListAutoscalingPoliciesPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.common.collect.Lists;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@javax.annotation.Generated("by GAPIC")
public class AutoscalingPolicyServiceClientTest {
  private static MockClusterController mockClusterController;
  private static MockJobController mockJobController;
  private static MockWorkflowTemplateService mockWorkflowTemplateService;
  private static MockAutoscalingPolicyService mockAutoscalingPolicyService;
  private static MockServiceHelper serviceHelper;
  private AutoscalingPolicyServiceClient client;
  private LocalChannelProvider channelProvider;

  @BeforeClass
  public static void startStaticServer() {
    mockClusterController = new MockClusterController();
    mockJobController = new MockJobController();
    mockWorkflowTemplateService = new MockWorkflowTemplateService();
    mockAutoscalingPolicyService = new MockAutoscalingPolicyService();
    serviceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(
                mockClusterController,
                mockJobController,
                mockWorkflowTemplateService,
                mockAutoscalingPolicyService));
    serviceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    serviceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    serviceHelper.reset();
    channelProvider = serviceHelper.createChannelProvider();
    AutoscalingPolicyServiceSettings settings =
        AutoscalingPolicyServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AutoscalingPolicyServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  @SuppressWarnings("all")
  public void createAutoscalingPolicyTest() {
    String id = "id3355";
    String name = "name3373707";
    AutoscalingPolicy expectedResponse =
        AutoscalingPolicy.newBuilder().setId(id).setName(name).build();
    mockAutoscalingPolicyService.addResponse(expectedResponse);

    String formattedParent = RegionName.format("[PROJECT]", "[REGION]");
    AutoscalingPolicy policy = AutoscalingPolicy.newBuilder().build();

    AutoscalingPolicy actualResponse = client.createAutoscalingPolicy(formattedParent, policy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoscalingPolicyService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAutoscalingPolicyRequest actualRequest =
        (CreateAutoscalingPolicyRequest) actualRequests.get(0);

    Assert.assertEquals(formattedParent, actualRequest.getParent());
    Assert.assertEquals(policy, actualRequest.getPolicy());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void createAutoscalingPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAutoscalingPolicyService.addException(exception);

    try {
      String formattedParent = RegionName.format("[PROJECT]", "[REGION]");
      AutoscalingPolicy policy = AutoscalingPolicy.newBuilder().build();

      client.createAutoscalingPolicy(formattedParent, policy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void updateAutoscalingPolicyTest() {
    String id = "id3355";
    String name = "name3373707";
    AutoscalingPolicy expectedResponse =
        AutoscalingPolicy.newBuilder().setId(id).setName(name).build();
    mockAutoscalingPolicyService.addResponse(expectedResponse);

    AutoscalingPolicy policy = AutoscalingPolicy.newBuilder().build();

    AutoscalingPolicy actualResponse = client.updateAutoscalingPolicy(policy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoscalingPolicyService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateAutoscalingPolicyRequest actualRequest =
        (UpdateAutoscalingPolicyRequest) actualRequests.get(0);

    Assert.assertEquals(policy, actualRequest.getPolicy());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void updateAutoscalingPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAutoscalingPolicyService.addException(exception);

    try {
      AutoscalingPolicy policy = AutoscalingPolicy.newBuilder().build();

      client.updateAutoscalingPolicy(policy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void getAutoscalingPolicyTest() {
    String id = "id3355";
    String name2 = "name2-1052831874";
    AutoscalingPolicy expectedResponse =
        AutoscalingPolicy.newBuilder().setId(id).setName(name2).build();
    mockAutoscalingPolicyService.addResponse(expectedResponse);

    String formattedName =
        AutoscalingPolicyName.format("[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]");

    AutoscalingPolicy actualResponse = client.getAutoscalingPolicy(formattedName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockAutoscalingPolicyService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAutoscalingPolicyRequest actualRequest = (GetAutoscalingPolicyRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void getAutoscalingPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAutoscalingPolicyService.addException(exception);

    try {
      String formattedName =
          AutoscalingPolicyName.format("[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]");

      client.getAutoscalingPolicy(formattedName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void listAutoscalingPoliciesTest() {
    String nextPageToken = "";
    AutoscalingPolicy policiesElement = AutoscalingPolicy.newBuilder().build();
    List<AutoscalingPolicy> policies = Arrays.asList(policiesElement);
    ListAutoscalingPoliciesResponse expectedResponse =
        ListAutoscalingPoliciesResponse.newBuilder()
            .setNextPageToken(nextPageToken)
            .addAllPolicies(policies)
            .build();
    mockAutoscalingPolicyService.addResponse(expectedResponse);

    String formattedParent = RegionName.format("[PROJECT]", "[REGION]");

    ListAutoscalingPoliciesPagedResponse pagedListResponse =
        client.listAutoscalingPolicies(formattedParent);

    List<AutoscalingPolicy> resources = Lists.newArrayList(pagedListResponse.iterateAll());
    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getPoliciesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockAutoscalingPolicyService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAutoscalingPoliciesRequest actualRequest =
        (ListAutoscalingPoliciesRequest) actualRequests.get(0);

    Assert.assertEquals(formattedParent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void listAutoscalingPoliciesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAutoscalingPolicyService.addException(exception);

    try {
      String formattedParent = RegionName.format("[PROJECT]", "[REGION]");

      client.listAutoscalingPolicies(formattedParent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }

  @Test
  @SuppressWarnings("all")
  public void deleteAutoscalingPolicyTest() {
    Empty expectedResponse = Empty.newBuilder().build();
    mockAutoscalingPolicyService.addResponse(expectedResponse);

    String formattedName =
        AutoscalingPolicyName.format("[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]");

    client.deleteAutoscalingPolicy(formattedName);

    List<AbstractMessage> actualRequests = mockAutoscalingPolicyService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAutoscalingPolicyRequest actualRequest =
        (DeleteAutoscalingPolicyRequest) actualRequests.get(0);

    Assert.assertEquals(formattedName, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  @SuppressWarnings("all")
  public void deleteAutoscalingPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(Status.INVALID_ARGUMENT);
    mockAutoscalingPolicyService.addException(exception);

    try {
      String formattedName =
          AutoscalingPolicyName.format("[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]");

      client.deleteAutoscalingPolicy(formattedName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception
    }
  }
}
