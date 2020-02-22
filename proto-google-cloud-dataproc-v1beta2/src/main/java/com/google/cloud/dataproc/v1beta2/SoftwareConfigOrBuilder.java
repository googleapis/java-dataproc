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

public interface SoftwareConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.SoftwareConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The version of software inside the cluster. It must be one of the
   * supported [Dataproc
   * Versions](/dataproc/docs/concepts/versioning/dataproc-versions#supported_cloud_dataproc_versions),
   * such as "1.2" (including a subminor version, such as "1.2.29"), or the
   * ["preview"
   * version](/dataproc/docs/concepts/versioning/dataproc-versions#other_versions).
   * If unspecified, it defaults to the latest Debian version.
   * </pre>
   *
   * <code>string image_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The imageVersion.
   */
  java.lang.String getImageVersion();
  /**
   *
   *
   * <pre>
   * Optional. The version of software inside the cluster. It must be one of the
   * supported [Dataproc
   * Versions](/dataproc/docs/concepts/versioning/dataproc-versions#supported_cloud_dataproc_versions),
   * such as "1.2" (including a subminor version, such as "1.2.29"), or the
   * ["preview"
   * version](/dataproc/docs/concepts/versioning/dataproc-versions#other_versions).
   * If unspecified, it defaults to the latest Debian version.
   * </pre>
   *
   * <code>string image_version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for imageVersion.
   */
  com.google.protobuf.ByteString getImageVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `core:hadoop.tmp.dir`. The following are supported prefixes
   * and their mappings:
   * * capacity-scheduler: `capacity-scheduler.xml`
   * * core:   `core-site.xml`
   * * distcp: `distcp-default.xml`
   * * hdfs:   `hdfs-site.xml`
   * * hive:   `hive-site.xml`
   * * mapred: `mapred-site.xml`
   * * pig:    `pig.properties`
   * * spark:  `spark-defaults.conf`
   * * yarn:   `yarn-site.xml`
   * For more information, see
   * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getPropertiesCount();
  /**
   *
   *
   * <pre>
   * Optional. The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `core:hadoop.tmp.dir`. The following are supported prefixes
   * and their mappings:
   * * capacity-scheduler: `capacity-scheduler.xml`
   * * core:   `core-site.xml`
   * * distcp: `distcp-default.xml`
   * * hdfs:   `hdfs-site.xml`
   * * hive:   `hive-site.xml`
   * * mapred: `mapred-site.xml`
   * * pig:    `pig.properties`
   * * spark:  `spark-defaults.conf`
   * * yarn:   `yarn-site.xml`
   * For more information, see
   * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsProperties(java.lang.String key);
  /** Use {@link #getPropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getProperties();
  /**
   *
   *
   * <pre>
   * Optional. The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `core:hadoop.tmp.dir`. The following are supported prefixes
   * and their mappings:
   * * capacity-scheduler: `capacity-scheduler.xml`
   * * core:   `core-site.xml`
   * * distcp: `distcp-default.xml`
   * * hdfs:   `hdfs-site.xml`
   * * hive:   `hive-site.xml`
   * * mapred: `mapred-site.xml`
   * * pig:    `pig.properties`
   * * spark:  `spark-defaults.conf`
   * * yarn:   `yarn-site.xml`
   * For more information, see
   * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getPropertiesMap();
  /**
   *
   *
   * <pre>
   * Optional. The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `core:hadoop.tmp.dir`. The following are supported prefixes
   * and their mappings:
   * * capacity-scheduler: `capacity-scheduler.xml`
   * * core:   `core-site.xml`
   * * distcp: `distcp-default.xml`
   * * hdfs:   `hdfs-site.xml`
   * * hive:   `hive-site.xml`
   * * mapred: `mapred-site.xml`
   * * pig:    `pig.properties`
   * * spark:  `spark-defaults.conf`
   * * yarn:   `yarn-site.xml`
   * For more information, see
   * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getPropertiesOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The properties to set on daemon config files.
   * Property keys are specified in `prefix:property` format, for example
   * `core:hadoop.tmp.dir`. The following are supported prefixes
   * and their mappings:
   * * capacity-scheduler: `capacity-scheduler.xml`
   * * core:   `core-site.xml`
   * * distcp: `distcp-default.xml`
   * * hdfs:   `hdfs-site.xml`
   * * hive:   `hive-site.xml`
   * * mapred: `mapred-site.xml`
   * * pig:    `pig.properties`
   * * spark:  `spark-defaults.conf`
   * * yarn:   `yarn-site.xml`
   * For more information, see
   * [Cluster properties](/dataproc/docs/concepts/cluster-properties).
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getPropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The set of optional components to activate on the cluster.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.Component optional_components = 3;</code>
   *
   * @return A list containing the optionalComponents.
   */
  java.util.List<com.google.cloud.dataproc.v1beta2.Component> getOptionalComponentsList();
  /**
   *
   *
   * <pre>
   * The set of optional components to activate on the cluster.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.Component optional_components = 3;</code>
   *
   * @return The count of optionalComponents.
   */
  int getOptionalComponentsCount();
  /**
   *
   *
   * <pre>
   * The set of optional components to activate on the cluster.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.Component optional_components = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The optionalComponents at the given index.
   */
  com.google.cloud.dataproc.v1beta2.Component getOptionalComponents(int index);
  /**
   *
   *
   * <pre>
   * The set of optional components to activate on the cluster.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.Component optional_components = 3;</code>
   *
   * @return A list containing the enum numeric values on the wire for optionalComponents.
   */
  java.util.List<java.lang.Integer> getOptionalComponentsValueList();
  /**
   *
   *
   * <pre>
   * The set of optional components to activate on the cluster.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.Component optional_components = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of optionalComponents at the given index.
   */
  int getOptionalComponentsValue(int index);
}
