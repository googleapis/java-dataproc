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
// source: google/cloud/dataproc/v1beta2/clusters.proto

package com.google.cloud.dataproc.v1beta2;

public interface ClusterMetricsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.ClusterMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The HDFS metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
   */
  int getHdfsMetricsCount();
  /**
   *
   *
   * <pre>
   * The HDFS metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
   */
  boolean containsHdfsMetrics(java.lang.String key);
  /** Use {@link #getHdfsMetricsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long> getHdfsMetrics();
  /**
   *
   *
   * <pre>
   * The HDFS metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long> getHdfsMetricsMap();
  /**
   *
   *
   * <pre>
   * The HDFS metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
   */
  long getHdfsMetricsOrDefault(java.lang.String key, long defaultValue);
  /**
   *
   *
   * <pre>
   * The HDFS metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; hdfs_metrics = 1;</code>
   */
  long getHdfsMetricsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The YARN metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
   */
  int getYarnMetricsCount();
  /**
   *
   *
   * <pre>
   * The YARN metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
   */
  boolean containsYarnMetrics(java.lang.String key);
  /** Use {@link #getYarnMetricsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long> getYarnMetrics();
  /**
   *
   *
   * <pre>
   * The YARN metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long> getYarnMetricsMap();
  /**
   *
   *
   * <pre>
   * The YARN metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
   */
  long getYarnMetricsOrDefault(java.lang.String key, long defaultValue);
  /**
   *
   *
   * <pre>
   * The YARN metrics.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; yarn_metrics = 2;</code>
   */
  long getYarnMetricsOrThrow(java.lang.String key);
}
