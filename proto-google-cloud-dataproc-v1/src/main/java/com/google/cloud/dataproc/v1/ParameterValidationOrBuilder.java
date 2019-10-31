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
// source: google/cloud/dataproc/v1/workflow_templates.proto

package com.google.cloud.dataproc.v1;

public interface ParameterValidationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ParameterValidation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Validation based on regular expressions.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
   */
  boolean hasRegex();
  /**
   *
   *
   * <pre>
   * Validation based on regular expressions.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
   */
  com.google.cloud.dataproc.v1.RegexValidation getRegex();
  /**
   *
   *
   * <pre>
   * Validation based on regular expressions.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.RegexValidation regex = 1;</code>
   */
  com.google.cloud.dataproc.v1.RegexValidationOrBuilder getRegexOrBuilder();

  /**
   *
   *
   * <pre>
   * Validation based on a list of allowed values.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
   */
  boolean hasValues();
  /**
   *
   *
   * <pre>
   * Validation based on a list of allowed values.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
   */
  com.google.cloud.dataproc.v1.ValueValidation getValues();
  /**
   *
   *
   * <pre>
   * Validation based on a list of allowed values.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ValueValidation values = 2;</code>
   */
  com.google.cloud.dataproc.v1.ValueValidationOrBuilder getValuesOrBuilder();

  public com.google.cloud.dataproc.v1.ParameterValidation.ValidationTypeCase
      getValidationTypeCase();
}
