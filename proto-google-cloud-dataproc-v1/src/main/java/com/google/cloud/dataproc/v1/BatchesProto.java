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
// source: google/cloud/dataproc/v1/batches.proto

package com.google.cloud.dataproc.v1;

public final class BatchesProto {
  private BatchesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_CreateBatchRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_CreateBatchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_GetBatchRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_GetBatchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_ListBatchesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ListBatchesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_ListBatchesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ListBatchesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_DeleteBatchRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_DeleteBatchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_Batch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_Batch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_Batch_StateHistory_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_Batch_StateHistory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_Batch_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_Batch_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_PySparkBatch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_PySparkBatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_SparkBatch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_SparkBatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_SparkRBatch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_SparkRBatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_SparkSqlBatch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_SparkSqlBatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1_SparkSqlBatch_QueryVariablesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_SparkSqlBatch_QueryVariablesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "&google/cloud/dataproc/v1/batches.proto"
          + "\022\030google.cloud.dataproc.v1\032\034google/api/a"
          + "nnotations.proto\032\027google/api/client.prot"
          + "o\032\037google/api/field_behavior.proto\032\031goog"
          + "le/api/resource.proto\032%google/cloud/dataproc/v1/shared.proto\032#google/longrunning"
          + "/operations.proto\032\033google/protobuf/empty"
          + ".proto\032\037google/protobuf/timestamp.proto\"\260\001\n"
          + "\022CreateBatchRequest\0225\n"
          + "\006parent\030\001 \001("
          + "\tB%\340A\002\372A\037\022\035dataproc.googleapis.com/Batch\0223\n"
          + "\005batch\030\002"
          + " \001(\0132\037.google.cloud.dataproc.v1.BatchB\003\340A\002\022\025\n"
          + "\010batch_id\030\003 \001(\tB\003\340A\001\022\027\n\n"
          + "request_id\030\004 \001(\tB\003\340A\001\"F\n"
          + "\017GetBatchRequest\0223\n"
          + "\004name\030\001 \001(\tB%\340A\002\372A\037\n"
          + "\035dataproc.googleapis.com/Batch\"|\n"
          + "\022ListBatchesRequest\0225\n"
          + "\006parent\030\001 \001("
          + "\tB%\340A\002\372A\037\022\035dataproc.googleapis.com/Batch\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\"`\n"
          + "\023ListBatchesResponse\0220\n"
          + "\007batches\030\001 \003(\0132\037.google.cloud.dataproc.v1.Batch\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"I\n"
          + "\022DeleteBatchRequest\0223\n"
          + "\004name\030\001 \001(\tB%\340A\002\372A\037\n"
          + "\035dataproc.googleapis.com/Batch\"\310\n\n"
          + "\005Batch\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\022\021\n"
          + "\004uuid\030\002 \001(\tB\003\340A\003\0224\n"
          + "\013create_time\030\003"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022D\n\r"
          + "pyspark_batch\030\004 \001(\0132&.goo"
          + "gle.cloud.dataproc.v1.PySparkBatchB\003\340A\001H\000\022@\n"
          + "\013spark_batch\030\005"
          + " \001(\0132$.google.cloud.dataproc.v1.SparkBatchB\003\340A\001H\000\022C\n\r"
          + "spark_r_batch\030\006"
          + " \001(\0132%.google.cloud.dataproc.v1.SparkRBatchB\003\340A\001H\000\022G\n"
          + "\017spark_sql_batch\030\007 \001("
          + "\0132\'.google.cloud.dataproc.v1.SparkSqlBatchB\003\340A\001H\000\022@\n"
          + "\014runtime_info\030\010"
          + " \001(\0132%.google.cloud.dataproc.v1.RuntimeInfoB\003\340A\003\0229\n"
          + "\005state\030\t"
          + " \001(\0162%.google.cloud.dataproc.v1.Batch.StateB\003\340A\003\022\032\n\r"
          + "state_message\030\n"
          + " \001(\tB\003\340A\003\0223\n\n"
          + "state_time\030\013 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\024\n"
          + "\007creator\030\014 \001(\tB\003\340A\003\022@\n"
          + "\006labels\030\r"
          + " \003(\0132+.google.cloud.dataproc.v1.Batch.LabelsEntryB\003\340A\001\022D\n"
          + "\016runtime_config\030\016"
          + " \001(\0132\'.google.cloud.dataproc.v1.RuntimeConfigB\003\340A\001\022L\n"
          + "\022environment_config\030\017 \001("
          + "\0132+.google.cloud.dataproc.v1.EnvironmentConfigB\003\340A\001\022\026\n"
          + "\toperation\030\020 \001(\tB\003\340A\003\022H\n\r"
          + "state_history\030\021"
          + " \003(\0132,.google.cloud.dataproc.v1.Batch.StateHistoryB\003\340A\003\032\240\001\n"
          + "\014StateHistory\0229\n"
          + "\005state\030\001"
          + " \001(\0162%.google.cloud.dataproc.v1.Batch.StateB\003\340A\003\022\032\n\r"
          + "state_message\030\002 \001(\tB\003\340A\003\0229\n"
          + "\020state_start_time\030\003"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"r\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\013\n"
          + "\007PENDING\020\001\022\013\n"
          + "\007RUNNING\020\002\022\016\n\n"
          + "CANCELLING\020\003\022\r\n"
          + "\tCANCELLED\020\004\022\r\n"
          + "\tSUCCEEDED\020\005\022\n\n"
          + "\006FAILED\020\006:[\352AX\n"
          + "\035dataproc.googleapis.com/Batch\0227project"
          + "s/{project}/locations/{location}/batches/{batch}B\016\n"
          + "\014batch_config\"\262\001\n"
          + "\014PySparkBatch\022!\n"
          + "\024main_python_file_uri\030\001 \001(\tB\003\340A\002\022\021\n"
          + "\004args\030\002 \003(\tB\003\340A\001\022\035\n"
          + "\020python_file_uris\030\003 \003(\tB\003\340A\001\022\032\n\r"
          + "jar_file_uris\030\004 \003(\tB\003\340A\001\022\026\n"
          + "\tfile_uris\030\005 \003(\tB\003\340A\001\022\031\n"
          + "\014archive_uris\030\006 \003(\tB\003\340A\001\"\265\001\n\n"
          + "SparkBatch\022 \n"
          + "\021main_jar_file_uri\030\001 \001(\tB\003\340A\001H\000\022\031\n\n"
          + "main_class\030\002 \001(\tB\003\340A\001H\000\022\021\n"
          + "\004args\030\003 \003(\tB\003\340A\001\022\032\n\r"
          + "jar_file_uris\030\004 \003(\tB\003\340A\001\022\026\n"
          + "\tfile_uris\030\005 \003(\tB\003\340A\001\022\031\n"
          + "\014archive_uris\030\006 \003(\tB\003\340A\001B\010\n"
          + "\006driver\"q\n"
          + "\013SparkRBatch\022\034\n"
          + "\017main_r_file_uri\030\001 \001(\tB\003\340A\002\022\021\n"
          + "\004args\030\002 \003(\tB\003\340A\001\022\026\n"
          + "\tfile_uris\030\003 \003(\tB\003\340A\001\022\031\n"
          + "\014archive_uris\030\004 \003(\tB\003\340A\001\"\332\001\n\r"
          + "SparkSqlBatch\022\033\n"
          + "\016query_file_uri\030\001 \001(\tB\003\340A\002\022Y\n"
          + "\017query_variables\030\002 \003(\0132;.google.cloud.dataproc"
          + ".v1.SparkSqlBatch.QueryVariablesEntryB\003\340A\001\022\032\n\r"
          + "jar_file_uris\030\003 \003(\tB\003\340A\001\0325\n"
          + "\023QueryVariablesEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\0012\235\006\n"
          + "\017BatchController\022\352\001\n"
          + "\013CreateBatch\022,.google.cloud.dataproc.v1.CreateBatch"
          + "Request\032\035.google.longrunning.Operation\"\215"
          + "\001\202\323\344\223\0024\"+/v1/{parent=projects/*/location"
          + "s/*}/batches:\005batch\332A\025parent,batch,batch_id\312A8\n"
          + "\005Batch\022/google.cloud.dataproc.v1.BatchOperationMetadata\022\222\001\n"
          + "\010GetBatch\022).google.cloud.dataproc.v1.GetBatchRequest\032\037"
          + ".google.cloud.dataproc.v1.Batch\":\202\323\344\223\002-\022"
          + "+/v1/{name=projects/*/locations/*/batches/*}\332A\004name\022\250\001\n"
          + "\013ListBatches\022,.google.cloud.dataproc.v1.ListBatchesRequest\032-.goog"
          + "le.cloud.dataproc.v1.ListBatchesResponse"
          + "\"<\202\323\344\223\002-\022+/v1/{parent=projects/*/locations/*}/batches\332A\006parent\022\217\001\n"
          + "\013DeleteBatch\022,.google.cloud.dataproc.v1.DeleteBatchReq"
          + "uest\032\026.google.protobuf.Empty\":\202\323\344\223\002-*+/v"
          + "1/{name=projects/*/locations/*/batches/*"
          + "}\332A\004name\032K\312A\027dataproc.googleapis.com\322A.h"
          + "ttps://www.googleapis.com/auth/cloud-platformBp\n"
          + "\034com.google.cloud.dataproc.v1B\014BatchesProtoP\001Z@google.golang.org/genprot"
          + "o/googleapis/cloud/dataproc/v1;dataprocb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dataproc.v1.SharedProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dataproc_v1_CreateBatchRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataproc_v1_CreateBatchRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_CreateBatchRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Batch", "BatchId", "RequestId",
            });
    internal_static_google_cloud_dataproc_v1_GetBatchRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataproc_v1_GetBatchRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_GetBatchRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dataproc_v1_ListBatchesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataproc_v1_ListBatchesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_ListBatchesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dataproc_v1_ListBatchesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dataproc_v1_ListBatchesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_ListBatchesResponse_descriptor,
            new java.lang.String[] {
              "Batches", "NextPageToken",
            });
    internal_static_google_cloud_dataproc_v1_DeleteBatchRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dataproc_v1_DeleteBatchRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_DeleteBatchRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dataproc_v1_Batch_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dataproc_v1_Batch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_Batch_descriptor,
            new java.lang.String[] {
              "Name",
              "Uuid",
              "CreateTime",
              "PysparkBatch",
              "SparkBatch",
              "SparkRBatch",
              "SparkSqlBatch",
              "RuntimeInfo",
              "State",
              "StateMessage",
              "StateTime",
              "Creator",
              "Labels",
              "RuntimeConfig",
              "EnvironmentConfig",
              "Operation",
              "StateHistory",
              "BatchConfig",
            });
    internal_static_google_cloud_dataproc_v1_Batch_StateHistory_descriptor =
        internal_static_google_cloud_dataproc_v1_Batch_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataproc_v1_Batch_StateHistory_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_Batch_StateHistory_descriptor,
            new java.lang.String[] {
              "State", "StateMessage", "StateStartTime",
            });
    internal_static_google_cloud_dataproc_v1_Batch_LabelsEntry_descriptor =
        internal_static_google_cloud_dataproc_v1_Batch_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dataproc_v1_Batch_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_Batch_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dataproc_v1_PySparkBatch_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dataproc_v1_PySparkBatch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_PySparkBatch_descriptor,
            new java.lang.String[] {
              "MainPythonFileUri",
              "Args",
              "PythonFileUris",
              "JarFileUris",
              "FileUris",
              "ArchiveUris",
            });
    internal_static_google_cloud_dataproc_v1_SparkBatch_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dataproc_v1_SparkBatch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_SparkBatch_descriptor,
            new java.lang.String[] {
              "MainJarFileUri",
              "MainClass",
              "Args",
              "JarFileUris",
              "FileUris",
              "ArchiveUris",
              "Driver",
            });
    internal_static_google_cloud_dataproc_v1_SparkRBatch_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dataproc_v1_SparkRBatch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_SparkRBatch_descriptor,
            new java.lang.String[] {
              "MainRFileUri", "Args", "FileUris", "ArchiveUris",
            });
    internal_static_google_cloud_dataproc_v1_SparkSqlBatch_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dataproc_v1_SparkSqlBatch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_SparkSqlBatch_descriptor,
            new java.lang.String[] {
              "QueryFileUri", "QueryVariables", "JarFileUris",
            });
    internal_static_google_cloud_dataproc_v1_SparkSqlBatch_QueryVariablesEntry_descriptor =
        internal_static_google_cloud_dataproc_v1_SparkSqlBatch_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataproc_v1_SparkSqlBatch_QueryVariablesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1_SparkSqlBatch_QueryVariablesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dataproc.v1.SharedProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
