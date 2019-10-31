/*
 * Copyright 2019 Google LLC
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

public interface BasicAutoscalingAlgorithmOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.BasicAutoscalingAlgorithm)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. YARN autoscaling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean hasYarnConfig();
  /**
   *
   *
   * <pre>
   * Required. YARN autoscaling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfig getYarnConfig();
  /**
   *
   *
   * <pre>
   * Required. YARN autoscaling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.BasicYarnAutoscalingConfig yarn_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1.BasicYarnAutoscalingConfigOrBuilder getYarnConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Duration between scaling events. A scaling period starts after
   * the update operation from the previous event has completed.
   * Bounds: [2m, 1d]. Default: 2m.
   * </pre>
   *
   * <code>.google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean hasCooldownPeriod();
  /**
   *
   *
   * <pre>
   * Optional. Duration between scaling events. A scaling period starts after
   * the update operation from the previous event has completed.
   * Bounds: [2m, 1d]. Default: 2m.
   * </pre>
   *
   * <code>.google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.Duration getCooldownPeriod();
  /**
   *
   *
   * <pre>
   * Optional. Duration between scaling events. A scaling period starts after
   * the update operation from the previous event has completed.
   * Bounds: [2m, 1d]. Default: 2m.
   * </pre>
   *
   * <code>.google.protobuf.Duration cooldown_period = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getCooldownPeriodOrBuilder();
}
