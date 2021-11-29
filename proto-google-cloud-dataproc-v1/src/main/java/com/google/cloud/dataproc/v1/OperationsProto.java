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
// source: google/cloud/dataproc/v1/operations.proto

package com.google.cloud.dataproc.v1;

public final class OperationsProto {
  private OperationsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_BatchOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_BatchOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_BatchOperationMetadata_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_BatchOperationMetadata_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_ClusterOperationStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ClusterOperationStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + ")google/cloud/dataproc/v1/operations.pr"
          + "oto\022\030google.cloud.dataproc.v1\032\037google/ap"
          + "i/field_behavior.proto\032\037google/protobuf/timestamp.proto\"\343\003\n"
          + "\026BatchOperationMetadata\022\r\n"
          + "\005batch\030\001 \001(\t\022\022\n\n"
          + "batch_uuid\030\002 \001(\t\022/\n"
          + "\013create_time\030\003 \001(\0132\032.google.protobuf.Timestamp\022-\n"
          + "\tdone_time\030\004 \001(\0132\032.google.protobuf.Timestamp\022[\n"
          + "\016operation_type\030\006 \001(\0162C."
          + "google.cloud.dataproc.v1.BatchOperationMetadata.BatchOperationType\022\023\n"
          + "\013description\030\007 \001(\t\022L\n"
          + "\006labels\030\010 \003(\0132<.google.cloud.d"
          + "ataproc.v1.BatchOperationMetadata.LabelsEntry\022\020\n"
          + "\010warnings\030\t \003(\t\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"E\n"
          + "\022BatchOperationType\022$\n"
          + " BATCH_OPERATION_TYPE_UNSPECIFIED\020\000\022\t\n"
          + "\005BATCH\020\001\"\211\002\n"
          + "\026ClusterOperationStatus\022J\n"
          + "\005state\030\001 \001(\01626.google.cloud.d"
          + "ataproc.v1.ClusterOperationStatus.StateB\003\340A\003\022\030\n"
          + "\013inner_state\030\002 \001(\tB\003\340A\003\022\024\n"
          + "\007details\030\003 \001(\tB\003\340A\003\0229\n"
          + "\020state_start_time\030\004"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\"8\n"
          + "\005State\022\013\n"
          + "\007UNKNOWN\020\000\022\013\n"
          + "\007PENDING\020\001\022\013\n"
          + "\007RUNNING\020\002\022\010\n"
          + "\004DONE\020\003\"\270\003\n"
          + "\030ClusterOperationMetadata\022\031\n"
          + "\014cluster_name\030\007 \001(\tB\003\340A\003\022\031\n"
          + "\014cluster_uuid\030\010 \001(\tB\003\340A\003\022E\n"
          + "\006status\030\t \001(\01320.google.cl"
          + "oud.dataproc.v1.ClusterOperationStatusB\003\340A\003\022M\n"
          + "\016status_history\030\n"
          + " \003(\01320.google.cloud.dataproc.v1.ClusterOperationStatusB\003\340A\003\022\033\n"
          + "\016operation_type\030\013 \001(\tB\003\340A\003\022\030\n"
          + "\013description\030\014 \001(\tB\003\340A\003\022S\n"
          + "\006labels\030\r"
          + " \003(\0132>.goog"
          + "le.cloud.dataproc.v1.ClusterOperationMetadata.LabelsEntryB\003\340A\003\022\025\n"
          + "\010warnings\030\016 \003(\tB\003\340A\003\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001Bs\n"
          + "\034com.google.cloud.dataproc.v1B\017OperationsProtoP\001Z@google.golang.o"
          + "rg/genproto/googleapis/cloud/dataproc/v1;dataprocb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dataproc_v1_BatchOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataproc_v1_BatchOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_BatchOperationMetadata_descriptor,
            new java.lang.String[] {
              "Batch",
              "BatchUuid",
              "CreateTime",
              "DoneTime",
              "OperationType",
              "Description",
              "Labels",
              "Warnings",
            });
    internal_static_google_cloud_dataproc_v1_BatchOperationMetadata_LabelsEntry_descriptor =
        internal_static_google_cloud_dataproc_v1_BatchOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataproc_v1_BatchOperationMetadata_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_BatchOperationMetadata_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dataproc_v1_ClusterOperationStatus_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataproc_v1_ClusterOperationStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_ClusterOperationStatus_descriptor,
            new java.lang.String[] {
              "State", "InnerState", "Details", "StateStartTime",
            });
    internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_descriptor,
            new java.lang.String[] {
              "ClusterName",
              "ClusterUuid",
              "Status",
              "StatusHistory",
              "OperationType",
              "Description",
              "Labels",
              "Warnings",
            });
    internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_LabelsEntry_descriptor =
        internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
