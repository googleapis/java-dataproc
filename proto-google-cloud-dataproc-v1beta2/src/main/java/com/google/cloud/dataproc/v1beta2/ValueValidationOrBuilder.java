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
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

public interface ValueValidationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.ValueValidation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. List of allowed values for the parameter.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @return A list containing the values.
   */
  java.util.List<java.lang.String> getValuesList();
  /**
   *
   *
   * <pre>
   * Required. List of allowed values for the parameter.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @return The count of values.
   */
  int getValuesCount();
  /**
   *
   *
   * <pre>
   * Required. List of allowed values for the parameter.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   *
   *
   * <pre>
   * Required. List of allowed values for the parameter.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString getValuesBytes(int index);
}
