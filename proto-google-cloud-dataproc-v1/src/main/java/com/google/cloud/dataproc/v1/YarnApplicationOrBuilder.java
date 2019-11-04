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

public interface YarnApplicationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.YarnApplication)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The application name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The application name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The application state.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.YarnApplication.State state = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Required. The application state.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.YarnApplication.State state = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1.YarnApplication.State getState();

  /**
   *
   *
   * <pre>
   * Required. The numerical progress of the application, from 1 to 100.
   * </pre>
   *
   * <code>float progress = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  float getProgress();

  /**
   *
   *
   * <pre>
   * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or
   * TimelineServer that provides application-specific information. The URL uses
   * the internal hostname, and requires a proxy server for resolution and,
   * possibly, access.
   * </pre>
   *
   * <code>string tracking_url = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getTrackingUrl();
  /**
   *
   *
   * <pre>
   * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or
   * TimelineServer that provides application-specific information. The URL uses
   * the internal hostname, and requires a proxy server for resolution and,
   * possibly, access.
   * </pre>
   *
   * <code>string tracking_url = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getTrackingUrlBytes();
}
