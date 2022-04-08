// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface AuxiliaryServicesConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.AuxiliaryServicesConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The Hive Metastore configuration for this workload.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the metastoreConfig field is set.
   */
  boolean hasMetastoreConfig();
  /**
   * <pre>
   * Optional. The Hive Metastore configuration for this workload.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The metastoreConfig.
   */
  com.google.cloud.dataproc.v1.MetastoreConfig getMetastoreConfig();
  /**
   * <pre>
   * Optional. The Hive Metastore configuration for this workload.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.MetastoreConfig metastore_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.MetastoreConfigOrBuilder getMetastoreConfigOrBuilder();

  /**
   * <pre>
   * Optional. The Spark History Server configuration for the workload.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the sparkHistoryServerConfig field is set.
   */
  boolean hasSparkHistoryServerConfig();
  /**
   * <pre>
   * Optional. The Spark History Server configuration for the workload.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sparkHistoryServerConfig.
   */
  com.google.cloud.dataproc.v1.SparkHistoryServerConfig getSparkHistoryServerConfig();
  /**
   * <pre>
   * Optional. The Spark History Server configuration for the workload.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.SparkHistoryServerConfig spark_history_server_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.SparkHistoryServerConfigOrBuilder getSparkHistoryServerConfigOrBuilder();
}