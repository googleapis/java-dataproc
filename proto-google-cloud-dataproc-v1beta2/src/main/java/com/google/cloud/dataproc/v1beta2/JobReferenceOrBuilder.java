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
// source: google/cloud/dataproc/v1beta2/jobs.proto

package com.google.cloud.dataproc.v1beta2;

public interface JobReferenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.JobReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the job
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the job
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The job ID, which must be unique within the project.
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), or hyphens (-). The maximum length is 100 characters.
   * If not specified by the caller, the job ID will be provided by the server.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   *
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   *
   *
   * <pre>
   * Optional. The job ID, which must be unique within the project.
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), or hyphens (-). The maximum length is 100 characters.
   * If not specified by the caller, the job ID will be provided by the server.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   *
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString getJobIdBytes();
}
