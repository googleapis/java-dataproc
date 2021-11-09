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
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface GkeClusterConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.GkeClusterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A target for the deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.GkeClusterConfig.NamespacedGkeDeploymentTarget namespaced_gke_deployment_target = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the namespacedGkeDeploymentTarget field is set.
   */
  boolean hasNamespacedGkeDeploymentTarget();
  /**
   *
   *
   * <pre>
   * Optional. A target for the deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.GkeClusterConfig.NamespacedGkeDeploymentTarget namespaced_gke_deployment_target = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The namespacedGkeDeploymentTarget.
   */
  com.google.cloud.dataproc.v1.GkeClusterConfig.NamespacedGkeDeploymentTarget
      getNamespacedGkeDeploymentTarget();
  /**
   *
   *
   * <pre>
   * Optional. A target for the deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.GkeClusterConfig.NamespacedGkeDeploymentTarget namespaced_gke_deployment_target = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.GkeClusterConfig.NamespacedGkeDeploymentTargetOrBuilder
      getNamespacedGkeDeploymentTargetOrBuilder();
}
