// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/autoscaling_policies.proto

package com.google.cloud.dataproc.v1;

public interface UpdateAutoscalingPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.UpdateAutoscalingPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The updated autoscaling policy.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   * <pre>
   * Required. The updated autoscaling policy.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The policy.
   */
  com.google.cloud.dataproc.v1.AutoscalingPolicy getPolicy();
  /**
   * <pre>
   * Required. The updated autoscaling policy.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.AutoscalingPolicy policy = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataproc.v1.AutoscalingPolicyOrBuilder getPolicyOrBuilder();
}
