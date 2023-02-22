// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

public interface GkeClusterConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.GkeClusterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. A target GKE cluster to deploy to. It must be in the same project
   * and region as the Dataproc cluster (the GKE cluster can be zonal or
   * regional). Format:
   * 'projects/{project}/locations/{location}/clusters/{cluster_id}'
   * </pre>
   *
   * <code>string gke_cluster_target = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The gkeClusterTarget.
   */
  java.lang.String getGkeClusterTarget();
  /**
   * <pre>
   * Optional. A target GKE cluster to deploy to. It must be in the same project
   * and region as the Dataproc cluster (the GKE cluster can be zonal or
   * regional). Format:
   * 'projects/{project}/locations/{location}/clusters/{cluster_id}'
   * </pre>
   *
   * <code>string gke_cluster_target = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for gkeClusterTarget.
   */
  com.google.protobuf.ByteString
      getGkeClusterTargetBytes();

  /**
   * <pre>
   * Optional. GKE node pools where workloads will be scheduled. At least one
   * node pool must be assigned the `DEFAULT`
   * [GkeNodePoolTarget.Role][google.cloud.dataproc.v1.GkeNodePoolTarget.Role].
   * If a `GkeNodePoolTarget` is not specified, Dataproc constructs a `DEFAULT`
   * `GkeNodePoolTarget`. Each role can be given to only one
   * `GkeNodePoolTarget`. All node pools must have the same location settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.GkeNodePoolTarget node_pool_target = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.dataproc.v1.GkeNodePoolTarget> 
      getNodePoolTargetList();
  /**
   * <pre>
   * Optional. GKE node pools where workloads will be scheduled. At least one
   * node pool must be assigned the `DEFAULT`
   * [GkeNodePoolTarget.Role][google.cloud.dataproc.v1.GkeNodePoolTarget.Role].
   * If a `GkeNodePoolTarget` is not specified, Dataproc constructs a `DEFAULT`
   * `GkeNodePoolTarget`. Each role can be given to only one
   * `GkeNodePoolTarget`. All node pools must have the same location settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.GkeNodePoolTarget node_pool_target = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.GkeNodePoolTarget getNodePoolTarget(int index);
  /**
   * <pre>
   * Optional. GKE node pools where workloads will be scheduled. At least one
   * node pool must be assigned the `DEFAULT`
   * [GkeNodePoolTarget.Role][google.cloud.dataproc.v1.GkeNodePoolTarget.Role].
   * If a `GkeNodePoolTarget` is not specified, Dataproc constructs a `DEFAULT`
   * `GkeNodePoolTarget`. Each role can be given to only one
   * `GkeNodePoolTarget`. All node pools must have the same location settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.GkeNodePoolTarget node_pool_target = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getNodePoolTargetCount();
  /**
   * <pre>
   * Optional. GKE node pools where workloads will be scheduled. At least one
   * node pool must be assigned the `DEFAULT`
   * [GkeNodePoolTarget.Role][google.cloud.dataproc.v1.GkeNodePoolTarget.Role].
   * If a `GkeNodePoolTarget` is not specified, Dataproc constructs a `DEFAULT`
   * `GkeNodePoolTarget`. Each role can be given to only one
   * `GkeNodePoolTarget`. All node pools must have the same location settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.GkeNodePoolTarget node_pool_target = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.GkeNodePoolTargetOrBuilder> 
      getNodePoolTargetOrBuilderList();
  /**
   * <pre>
   * Optional. GKE node pools where workloads will be scheduled. At least one
   * node pool must be assigned the `DEFAULT`
   * [GkeNodePoolTarget.Role][google.cloud.dataproc.v1.GkeNodePoolTarget.Role].
   * If a `GkeNodePoolTarget` is not specified, Dataproc constructs a `DEFAULT`
   * `GkeNodePoolTarget`. Each role can be given to only one
   * `GkeNodePoolTarget`. All node pools must have the same location settings.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1.GkeNodePoolTarget node_pool_target = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataproc.v1.GkeNodePoolTargetOrBuilder getNodePoolTargetOrBuilder(
      int index);
}
