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

/**
 *
 *
 * <pre>
 * A request to update a workflow template.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest}
 */
public final class UpdateWorkflowTemplateRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest)
    UpdateWorkflowTemplateRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateWorkflowTemplateRequest.newBuilder() to construct.
  private UpdateWorkflowTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateWorkflowTemplateRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateWorkflowTemplateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateWorkflowTemplateRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.cloud.dataproc.v1.WorkflowTemplate.Builder subBuilder = null;
              if (template_ != null) {
                subBuilder = template_.toBuilder();
              }
              template_ =
                  input.readMessage(
                      com.google.cloud.dataproc.v1.WorkflowTemplate.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(template_);
                template_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
        .internal_static_google_cloud_dataproc_v1_UpdateWorkflowTemplateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
        .internal_static_google_cloud_dataproc_v1_UpdateWorkflowTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest.class,
            com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest.Builder.class);
  }

  public static final int TEMPLATE_FIELD_NUMBER = 1;
  private com.google.cloud.dataproc.v1.WorkflowTemplate template_;
  /**
   *
   *
   * <pre>
   * Required. The updated workflow template.
   * The `template.version` field must match the current version.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return Whether the template field is set.
   */
  public boolean hasTemplate() {
    return template_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The updated workflow template.
   * The `template.version` field must match the current version.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The template.
   */
  public com.google.cloud.dataproc.v1.WorkflowTemplate getTemplate() {
    return template_ == null
        ? com.google.cloud.dataproc.v1.WorkflowTemplate.getDefaultInstance()
        : template_;
  }
  /**
   *
   *
   * <pre>
   * Required. The updated workflow template.
   * The `template.version` field must match the current version.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  public com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder getTemplateOrBuilder() {
    return getTemplate();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (template_ != null) {
      output.writeMessage(1, getTemplate());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (template_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTemplate());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest other =
        (com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest) obj;

    if (hasTemplate() != other.hasTemplate()) return false;
    if (hasTemplate()) {
      if (!getTemplate().equals(other.getTemplate())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTemplate()) {
      hash = (37 * hash) + TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getTemplate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A request to update a workflow template.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest)
      com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_UpdateWorkflowTemplateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_UpdateWorkflowTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest.class,
              com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (templateBuilder_ == null) {
        template_ = null;
      } else {
        template_ = null;
        templateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_UpdateWorkflowTemplateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest build() {
      com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest buildPartial() {
      com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest result =
          new com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest(this);
      if (templateBuilder_ == null) {
        result.template_ = template_;
      } else {
        result.template_ = templateBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest) {
        return mergeFrom((com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest other) {
      if (other == com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest.getDefaultInstance())
        return this;
      if (other.hasTemplate()) {
        mergeTemplate(other.getTemplate());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.dataproc.v1.WorkflowTemplate template_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.WorkflowTemplate,
            com.google.cloud.dataproc.v1.WorkflowTemplate.Builder,
            com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder>
        templateBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return Whether the template field is set.
     */
    public boolean hasTemplate() {
      return templateBuilder_ != null || template_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The template.
     */
    public com.google.cloud.dataproc.v1.WorkflowTemplate getTemplate() {
      if (templateBuilder_ == null) {
        return template_ == null
            ? com.google.cloud.dataproc.v1.WorkflowTemplate.getDefaultInstance()
            : template_;
      } else {
        return templateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder setTemplate(com.google.cloud.dataproc.v1.WorkflowTemplate value) {
      if (templateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        template_ = value;
        onChanged();
      } else {
        templateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder setTemplate(
        com.google.cloud.dataproc.v1.WorkflowTemplate.Builder builderForValue) {
      if (templateBuilder_ == null) {
        template_ = builderForValue.build();
        onChanged();
      } else {
        templateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder mergeTemplate(com.google.cloud.dataproc.v1.WorkflowTemplate value) {
      if (templateBuilder_ == null) {
        if (template_ != null) {
          template_ =
              com.google.cloud.dataproc.v1.WorkflowTemplate.newBuilder(template_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          template_ = value;
        }
        onChanged();
      } else {
        templateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder clearTemplate() {
      if (templateBuilder_ == null) {
        template_ = null;
        onChanged();
      } else {
        template_ = null;
        templateBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public com.google.cloud.dataproc.v1.WorkflowTemplate.Builder getTemplateBuilder() {

      onChanged();
      return getTemplateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder getTemplateOrBuilder() {
      if (templateBuilder_ != null) {
        return templateBuilder_.getMessageOrBuilder();
      } else {
        return template_ == null
            ? com.google.cloud.dataproc.v1.WorkflowTemplate.getDefaultInstance()
            : template_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The updated workflow template.
     * The `template.version` field must match the current version.
     * </pre>
     *
     * <code>
     * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.WorkflowTemplate,
            com.google.cloud.dataproc.v1.WorkflowTemplate.Builder,
            com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder>
        getTemplateFieldBuilder() {
      if (templateBuilder_ == null) {
        templateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataproc.v1.WorkflowTemplate,
                com.google.cloud.dataproc.v1.WorkflowTemplate.Builder,
                com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder>(
                getTemplate(), getParentForChildren(), isClean());
        template_ = null;
      }
      return templateBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest)
  private static final com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest();
  }

  public static com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateWorkflowTemplateRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateWorkflowTemplateRequest>() {
        @java.lang.Override
        public UpdateWorkflowTemplateRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateWorkflowTemplateRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateWorkflowTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateWorkflowTemplateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
