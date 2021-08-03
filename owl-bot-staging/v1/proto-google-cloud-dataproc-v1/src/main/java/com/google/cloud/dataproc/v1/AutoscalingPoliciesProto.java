// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/autoscaling_policies.proto

package com.google.cloud.dataproc.v1;

public final class AutoscalingPoliciesProto {
  private AutoscalingPoliciesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/dataproc/v1/autoscaling_p" +
      "olicies.proto\022\030google.cloud.dataproc.v1\032" +
      "\034google/api/annotations.proto\032\027google/ap" +
      "i/client.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\032\036goog" +
      "le/protobuf/duration.proto\032\033google/proto" +
      "buf/empty.proto\"\250\004\n\021AutoscalingPolicy\022\n\n" +
      "\002id\030\001 \001(\t\022\021\n\004name\030\002 \001(\tB\003\340A\003\022S\n\017basic_al" +
      "gorithm\030\003 \001(\01323.google.cloud.dataproc.v1" +
      ".BasicAutoscalingAlgorithmB\003\340A\002H\000\022Z\n\rwor" +
      "ker_config\030\004 \001(\0132>.google.cloud.dataproc" +
      ".v1.InstanceGroupAutoscalingPolicyConfig" +
      "B\003\340A\002\022d\n\027secondary_worker_config\030\005 \001(\0132>" +
      ".google.cloud.dataproc.v1.InstanceGroupA" +
      "utoscalingPolicyConfigB\003\340A\001:\317\001\352A\313\001\n)data" +
      "proc.googleapis.com/AutoscalingPolicy\022Pp" +
      "rojects/{project}/locations/{location}/a" +
      "utoscalingPolicies/{autoscaling_policy}\022" +
      "Lprojects/{project}/regions/{region}/aut" +
      "oscalingPolicies/{autoscaling_policy}B\013\n" +
      "\talgorithm\"\244\001\n\031BasicAutoscalingAlgorithm" +
      "\022N\n\013yarn_config\030\001 \001(\01324.google.cloud.dat" +
      "aproc.v1.BasicYarnAutoscalingConfigB\003\340A\002" +
      "\0227\n\017cooldown_period\030\002 \001(\0132\031.google.proto" +
      "buf.DurationB\003\340A\001\"\371\001\n\032BasicYarnAutoscali" +
      "ngConfig\022E\n\035graceful_decommission_timeou" +
      "t\030\005 \001(\0132\031.google.protobuf.DurationB\003\340A\002\022" +
      "\034\n\017scale_up_factor\030\001 \001(\001B\003\340A\002\022\036\n\021scale_d" +
      "own_factor\030\002 \001(\001B\003\340A\002\022)\n\034scale_up_min_wo" +
      "rker_fraction\030\003 \001(\001B\003\340A\001\022+\n\036scale_down_m" +
      "in_worker_fraction\030\004 \001(\001B\003\340A\001\"s\n$Instanc" +
      "eGroupAutoscalingPolicyConfig\022\032\n\rmin_ins" +
      "tances\030\001 \001(\005B\003\340A\001\022\032\n\rmax_instances\030\002 \001(\005" +
      "B\003\340A\002\022\023\n\006weight\030\003 \001(\005B\003\340A\001\"\245\001\n\036CreateAut" +
      "oscalingPolicyRequest\022A\n\006parent\030\001 \001(\tB1\340" +
      "A\002\372A+\022)dataproc.googleapis.com/Autoscali" +
      "ngPolicy\022@\n\006policy\030\002 \001(\0132+.google.cloud." +
      "dataproc.v1.AutoscalingPolicyB\003\340A\002\"^\n\033Ge" +
      "tAutoscalingPolicyRequest\022?\n\004name\030\001 \001(\tB" +
      "1\340A\002\372A+\n)dataproc.googleapis.com/Autosca" +
      "lingPolicy\"b\n\036UpdateAutoscalingPolicyReq" +
      "uest\022@\n\006policy\030\001 \001(\0132+.google.cloud.data" +
      "proc.v1.AutoscalingPolicyB\003\340A\002\"a\n\036Delete" +
      "AutoscalingPolicyRequest\022?\n\004name\030\001 \001(\tB1" +
      "\340A\002\372A+\n)dataproc.googleapis.com/Autoscal" +
      "ingPolicy\"\224\001\n\036ListAutoscalingPoliciesReq" +
      "uest\022A\n\006parent\030\001 \001(\tB1\340A\002\372A+\022)dataproc.g" +
      "oogleapis.com/AutoscalingPolicy\022\026\n\tpage_" +
      "size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001" +
      "\"\203\001\n\037ListAutoscalingPoliciesResponse\022B\n\010" +
      "policies\030\001 \003(\0132+.google.cloud.dataproc.v" +
      "1.AutoscalingPolicyB\003\340A\003\022\034\n\017next_page_to" +
      "ken\030\002 \001(\tB\003\340A\0032\256\013\n\030AutoscalingPolicyServ" +
      "ice\022\234\002\n\027CreateAutoscalingPolicy\0228.google" +
      ".cloud.dataproc.v1.CreateAutoscalingPoli" +
      "cyRequest\032+.google.cloud.dataproc.v1.Aut" +
      "oscalingPolicy\"\231\001\202\323\344\223\002\202\001\"7/v1/{parent=pr" +
      "ojects/*/locations/*}/autoscalingPolicie" +
      "s:\006policyZ?\"5/v1/{parent=projects/*/regi" +
      "ons/*}/autoscalingPolicies:\006policy\332A\rpar" +
      "ent,policy\022\243\002\n\027UpdateAutoscalingPolicy\0228" +
      ".google.cloud.dataproc.v1.UpdateAutoscal" +
      "ingPolicyRequest\032+.google.cloud.dataproc" +
      ".v1.AutoscalingPolicy\"\240\001\202\323\344\223\002\220\001\032>/v1/{po" +
      "licy.name=projects/*/locations/*/autosca" +
      "lingPolicies/*}:\006policyZF\032</v1/{policy.n" +
      "ame=projects/*/regions/*/autoscalingPoli" +
      "cies/*}:\006policy\332A\006policy\022\373\001\n\024GetAutoscal" +
      "ingPolicy\0225.google.cloud.dataproc.v1.Get" +
      "AutoscalingPolicyRequest\032+.google.cloud." +
      "dataproc.v1.AutoscalingPolicy\"\177\202\323\344\223\002r\0227/" +
      "v1/{name=projects/*/locations/*/autoscal" +
      "ingPolicies/*}Z7\0225/v1/{name=projects/*/r" +
      "egions/*/autoscalingPolicies/*}\332A\004name\022\222" +
      "\002\n\027ListAutoscalingPolicies\0228.google.clou" +
      "d.dataproc.v1.ListAutoscalingPoliciesReq" +
      "uest\0329.google.cloud.dataproc.v1.ListAuto" +
      "scalingPoliciesResponse\"\201\001\202\323\344\223\002r\0227/v1/{p" +
      "arent=projects/*/locations/*}/autoscalin" +
      "gPoliciesZ7\0225/v1/{parent=projects/*/regi" +
      "ons/*}/autoscalingPolicies\332A\006parent\022\354\001\n\027" +
      "DeleteAutoscalingPolicy\0228.google.cloud.d" +
      "ataproc.v1.DeleteAutoscalingPolicyReques" +
      "t\032\026.google.protobuf.Empty\"\177\202\323\344\223\002r*7/v1/{" +
      "name=projects/*/locations/*/autoscalingP" +
      "olicies/*}Z7*5/v1/{name=projects/*/regio" +
      "ns/*/autoscalingPolicies/*}\332A\004name\032K\312A\027d" +
      "ataproc.googleapis.com\322A.https://www.goo" +
      "gleapis.com/auth/cloud-platformB\304\001\n\034com." +
      "google.cloud.dataproc.v1B\030AutoscalingPol" +
      "iciesProtoP\001Z@google.golang.org/genproto" +
      "/googleapis/cloud/dataproc/v1;dataproc\352A" +
      "E\n\036dataproc.googleapis.com/Region\022#proje" +
      "cts/{project}/regions/{region}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
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
    internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataproc_v1_AutoscalingPolicy_descriptor,
        new java.lang.String[] { "Id", "Name", "BasicAlgorithm", "WorkerConfig", "SecondaryWorkerConfig", "Algorithm", });
    internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataproc_v1_BasicAutoscalingAlgorithm_descriptor,
        new java.lang.String[] { "YarnConfig", "CooldownPeriod", });
    internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataproc_v1_BasicYarnAutoscalingConfig_descriptor,
        new java.lang.String[] { "GracefulDecommissionTimeout", "ScaleUpFactor", "ScaleDownFactor", "ScaleUpMinWorkerFraction", "ScaleDownMinWorkerFraction", });
    internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataproc_v1_InstanceGroupAutoscalingPolicyConfig_descriptor,
        new java.lang.String[] { "MinInstances", "MaxInstances", "Weight", });
    internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataproc_v1_CreateAutoscalingPolicyRequest_descriptor,
        new java.lang.String[] { "Parent", "Policy", });
    internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataproc_v1_GetAutoscalingPolicyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataproc_v1_UpdateAutoscalingPolicyRequest_descriptor,
        new java.lang.String[] { "Policy", });
    internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataproc_v1_DeleteAutoscalingPolicyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataproc_v1_ListAutoscalingPoliciesResponse_descriptor,
        new java.lang.String[] { "Policies", "NextPageToken", });
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
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
