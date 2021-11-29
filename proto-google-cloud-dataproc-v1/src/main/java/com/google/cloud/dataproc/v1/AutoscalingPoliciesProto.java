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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/autoscaling_policies.proto

package com.google.cloud.dataproc.v1;

public final class AutoscalingPoliciesProto {
  private AutoscalingPoliciesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "3google/cloud/dataproc/v1/autoscaling_p"
          + "olicies.proto\022\030google.cloud.dataproc.v1\032"
          + "\034google/api/annotations.proto\032\027google/api/client.proto\032\037google/api/field_behavior.proto\032\031google/api/resource.proto\032\036google/protobuf/duration.proto\032\033google/protobuf/empty.proto\"\245\005\n"
          + "\021AutoscalingPolicy\022\n\n"
          + "\002id\030\001 \001(\t\022\021\n"
          + "\004name\030\002 \001(\tB\003\340A\003\022S\n"
          + "\017basic_algorithm\030\003"
          + " \001(\01323.google.cloud.dataproc.v1.BasicAutoscalingAlgorithmB\003\340A\002H\000\022Z\n\r"
          + "worker_config\030\004"
          + " \001(\0132>.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfigB\003\340A\002\022d\n"
          + "\027secondary_worker_config\030\005"
          + " \001(\0132>.google.cloud.dataproc.v1.InstanceGroupAutoscalingPolicyConfigB\003\340A\001\022L\n"
          + "\006labels\030\006"
          + " \003(\01327.google.cloud.dataproc.v1.AutoscalingPolicy.LabelsEntryB\003\340A\001\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001:\317\001\352A\313\001\n"
          + ")dataproc.googleapis.com/AutoscalingPolicy\022Pprojects/{project}/locations/{location}/autoscalingPolicies/{autoscaling_policy}\022Lprojects/{project}/regions/{region}/autoscalingPolicies/{autoscaling_policy}B\013\n"
          + "\talgorithm\"\244\001\n"
          + "\031BasicAutoscalingAlgorithm\022N\n"
          + "\013yarn_config\030\001"
          + " \001(\01324.google.cloud.dataproc.v1.BasicYarnAutoscalingConfigB\003\340A\002\0227\n"
          + "\017cooldown_period\030\002"
          + " \001(\0132\031.google.protobuf.DurationB\003\340A\001\"\371\001\n"
          + "\032BasicYarnAutoscalingConfig\022E\n"
          + "\035graceful_decommission_timeout\030\005"
          + " \001(\0132\031.google.protobuf.DurationB\003\340A\002\022\034\n"
          + "\017scale_up_factor\030\001 \001(\001B\003\340A\002\022\036\n"
          + "\021scale_down_factor\030\002 \001(\001B\003\340A\002\022)\n"
          + "\034scale_up_min_worker_fraction\030\003 \001(\001B\003\340A\001\022+\n"
          + "\036scale_down_min_worker_fraction\030\004 \001(\001B\003\340A\001\"s\n"
          + "$InstanceGroupAutoscalingPolicyConfig\022\032\n\r"
          + "min_instances\030\001 \001(\005B\003\340A\001\022\032\n\r"
          + "max_instances\030\002 \001(\005B\003\340A\002\022\023\n"
          + "\006weight\030\003 \001(\005B\003\340A\001\"\245\001\n"
          + "\036CreateAutoscalingPolicyRequest\022A\n"
          + "\006parent\030\001 \001("
          + "\tB1\340A\002\372A+\022)dataproc.googleapis.com/AutoscalingPolicy\022@\n"
          + "\006policy\030\002"
          + " \001(\0132+.google.cloud.dataproc.v1.AutoscalingPolicyB\003\340A\002\"^\n"
          + "\033GetAutoscalingPolicyRequest\022?\n"
          + "\004name\030\001 \001(\tB1\340A\002\372A+\n"
          + ")dataproc.googleapis.com/AutoscalingPolicy\"b\n"
          + "\036UpdateAutoscalingPolicyRequest\022@\n"
          + "\006policy\030\001"
          + " \001(\0132+.google.cloud.dataproc.v1.AutoscalingPolicyB\003\340A\002\"a\n"
          + "\036DeleteAutoscalingPolicyRequest\022?\n"
          + "\004name\030\001 \001(\tB1\340A\002\372A+\n"
          + ")dataproc.googleapis.com/AutoscalingPolicy\"\224\001\n"
          + "\036ListAutoscalingPoliciesRequest\022A\n"
          + "\006parent\030\001 \001("
          + "\tB1\340A\002\372A+\022)dataproc.googleapis.com/AutoscalingPolicy\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\"\203\001\n"
          + "\037ListAutoscalingPoliciesResponse\022B\n"
          + "\010policies\030\001"
          + " \003(\0132+.google.cloud.dataproc.v1.AutoscalingPolicyB\003\340A\003\022\034\n"
          + "\017next_page_token\030\002 \001(\tB\003\340A\0032\256\013\n"
          + "\030AutoscalingPolicyService\022\234\002\n"
          + "\027CreateAutoscalingPolicy\0228.google.cloud.dataproc.v1.CreateAutoscalin"
          + "gPolicyRequest\032+.google.cloud.dataproc.v1.AutoscalingPolicy\"\231\001\202\323\344\223\002\202\001\"7/v1/{parent=projects/*/locations/*}/autoscalingPolicies:\006policyZ?\"5/v1/{parent=projects/*/regions/*}/autoscalingPolicies:\006policy\332A\r"
          + "parent,policy\022\243\002\n"
          + "\027UpdateAutoscalingPolicy\0228.google.cloud.dataproc.v1.UpdateAut"
          + "oscalingPolicyRequest\032+.google.cloud.dataproc.v1.AutoscalingPolicy\"\240\001\202\323\344\223\002\220\001\032>/v1/{policy.name=projects/*/locations/*/autoscalingPolicies/*}:\006policyZF\032</v1/{policy.name=projects/*/regions/*/autoscalingPolicies/*}:\006policy\332A\006policy\022\373\001\n"
          + "\024GetAutoscalingPolicy\0225.google.cloud.dataproc.v"
          + "1.GetAutoscalingPolicyRequest\032+.google.c"
          + "loud.dataproc.v1.AutoscalingPolicy\"\177\202\323\344\223\002r\0227/v1/{name=projects/*/locations/*/autoscalingPolicies/*}Z7\0225/v1/{name=projects/*/regions/*/autoscalingPolicies/*}\332A\004name\022\222\002\n"
          + "\027ListAutoscalingPolicies\0228.google.cloud.dataproc.v1.ListAutoscalingPolici"
          + "esRequest\0329.google.cloud.dataproc.v1.ListAutoscalingPoliciesResponse\"\201\001\202\323\344\223\002r\0227/v1/{parent=projects/*/locations/*}/autoscalingPoliciesZ7\0225/v1/{parent=projects/*/regions/*}/autoscalingPolicies\332A\006parent\022\354\001\n"
          + "\027DeleteAutoscalingPolicy\0228.google.cloud.dataproc.v1.DeleteAutoscalingPolicyR"
          + "equest\032\026.google.protobuf.Empty\"\177\202\323\344\223\002r*7/v1/{name=projects/*/locations/*/autoscalingPolicies/*}Z7*5/v1/{name=projects/*/regions/*/autoscalingPolicies/*}\332A\004name\032K\312A\027dataproc.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platformB\304\001\n"
          + "\034com.google.cloud.dataproc.v1B\030AutoscalingPoliciesProtoP\001Z@google.golang.org/genproto/googleapis/cloud/dataproc/v1;dataproc\352AE\n"
          + "\036dataproc.googleapis.com/Region\022#projects/{project}/regions/{region}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_descriptor,
            new java.lang.String[] {
              "Id",
              "Name",
              "BasicAlgorithm",
              "WorkerConfig",
              "SecondaryWorkerConfig",
              "Labels",
              "Algorithm",
            });
    internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_LabelsEntry_descriptor =
        internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_descriptor,
            new java.lang.String[] {
              "YarnConfig", "CooldownPeriod",
            });
    internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_descriptor,
            new java.lang.String[] {
              "GracefulDecommissionTimeout",
              "ScaleUpFactor",
              "ScaleDownFactor",
              "ScaleUpMinWorkerFraction",
              "ScaleDownMinWorkerFraction",
            });
    internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_descriptor,
            new java.lang.String[] {
              "MinInstances", "MaxInstances", "Weight",
            });
    internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Policy",
            });
    internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_descriptor,
            new java.lang.String[] {
              "Policy",
            });
    internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_descriptor,
            new java.lang.String[] {
              "Policies", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
