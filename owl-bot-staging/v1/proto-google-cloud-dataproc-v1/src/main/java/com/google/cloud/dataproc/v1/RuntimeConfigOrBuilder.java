// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

public interface RuntimeConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.RuntimeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. A mapping of property names to values, which are used to configure workload
   * execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getPropertiesCount();
  /**
   * <pre>
   * Optional. A mapping of property names to values, which are used to configure workload
   * execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsProperties(
      java.lang.String key);
  /**
   * Use {@link #getPropertiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getProperties();
  /**
   * <pre>
   * Optional. A mapping of property names to values, which are used to configure workload
   * execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getPropertiesMap();
  /**
   * <pre>
   * Optional. A mapping of property names to values, which are used to configure workload
   * execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  java.lang.String getPropertiesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. A mapping of property names to values, which are used to configure workload
   * execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  java.lang.String getPropertiesOrThrow(
      java.lang.String key);
}