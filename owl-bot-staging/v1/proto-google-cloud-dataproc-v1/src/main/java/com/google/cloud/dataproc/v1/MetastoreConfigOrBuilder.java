// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface MetastoreConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.MetastoreConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of an existing Dataproc Metastore service.
   * Example:
   * * `projects/[project_id]/locations/[dataproc_region]/services/[service-name]`
   * </pre>
   *
   * <code>string dataproc_metastore_service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The dataprocMetastoreService.
   */
  java.lang.String getDataprocMetastoreService();
  /**
   * <pre>
   * Required. Resource name of an existing Dataproc Metastore service.
   * Example:
   * * `projects/[project_id]/locations/[dataproc_region]/services/[service-name]`
   * </pre>
   *
   * <code>string dataproc_metastore_service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for dataprocMetastoreService.
   */
  com.google.protobuf.ByteString
      getDataprocMetastoreServiceBytes();
}
