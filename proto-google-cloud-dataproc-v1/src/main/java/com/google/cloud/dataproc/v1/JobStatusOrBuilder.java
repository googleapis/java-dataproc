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
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

public interface JobStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.JobStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. A state message specifying the overall job state.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobStatus.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. A state message specifying the overall job state.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobStatus.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.JobStatus.State getState();

  /**
   *
   *
   * <pre>
   * Optional. Output only. Job state details, such as an error
   * description if the state is &lt;code&gt;ERROR&lt;/code&gt;.
   * </pre>
   *
   * <code>
   * string details = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getDetails();
  /**
   *
   *
   * <pre>
   * Optional. Output only. Job state details, such as an error
   * description if the state is &lt;code&gt;ERROR&lt;/code&gt;.
   * </pre>
   *
   * <code>
   * string details = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.ByteString getDetailsBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when this state was entered.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp state_start_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean hasStateStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when this state was entered.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp state_start_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.Timestamp getStateStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when this state was entered.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp state_start_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStateStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Additional state information, which includes
   * status reported by the agent.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobStatus.Substate substate = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getSubstateValue();
  /**
   *
   *
   * <pre>
   * Output only. Additional state information, which includes
   * status reported by the agent.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobStatus.Substate substate = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.JobStatus.Substate getSubstate();
}
