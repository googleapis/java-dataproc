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

/**
 *
 *
 * <pre>
 * Identity related configuration, including service account based
 * secure multi-tenancy user mappings.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.IdentityConfig}
 */
public final class IdentityConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.IdentityConfig)
    IdentityConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IdentityConfig.newBuilder() to construct.
  private IdentityConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IdentityConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IdentityConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_IdentityConfig_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 1:
        return internalGetUserServiceAccountMapping();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_IdentityConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.IdentityConfig.class,
            com.google.cloud.dataproc.v1.IdentityConfig.Builder.class);
  }

  public static final int USER_SERVICE_ACCOUNT_MAPPING_FIELD_NUMBER = 1;

  private static final class UserServiceAccountMappingDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.dataproc.v1.ClustersProto
                .internal_static_google_cloud_dataproc_v1_IdentityConfig_UserServiceAccountMappingEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      userServiceAccountMapping_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetUserServiceAccountMapping() {
    if (userServiceAccountMapping_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          UserServiceAccountMappingDefaultEntryHolder.defaultEntry);
    }
    return userServiceAccountMapping_;
  }

  public int getUserServiceAccountMappingCount() {
    return internalGetUserServiceAccountMapping().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Required. Map of user to service account.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public boolean containsUserServiceAccountMapping(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetUserServiceAccountMapping().getMap().containsKey(key);
  }
  /** Use {@link #getUserServiceAccountMappingMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getUserServiceAccountMapping() {
    return getUserServiceAccountMappingMap();
  }
  /**
   *
   *
   * <pre>
   * Required. Map of user to service account.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getUserServiceAccountMappingMap() {
    return internalGetUserServiceAccountMapping().getMap();
  }
  /**
   *
   *
   * <pre>
   * Required. Map of user to service account.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.lang.String getUserServiceAccountMappingOrDefault(
      java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetUserServiceAccountMapping().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Required. Map of user to service account.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.lang.String getUserServiceAccountMappingOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetUserServiceAccountMapping().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output,
        internalGetUserServiceAccountMapping(),
        UserServiceAccountMappingDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetUserServiceAccountMapping().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> userServiceAccountMapping__ =
          UserServiceAccountMappingDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, userServiceAccountMapping__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.dataproc.v1.IdentityConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.IdentityConfig other =
        (com.google.cloud.dataproc.v1.IdentityConfig) obj;

    if (!internalGetUserServiceAccountMapping()
        .equals(other.internalGetUserServiceAccountMapping())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetUserServiceAccountMapping().getMap().isEmpty()) {
      hash = (37 * hash) + USER_SERVICE_ACCOUNT_MAPPING_FIELD_NUMBER;
      hash = (53 * hash) + internalGetUserServiceAccountMapping().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.IdentityConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.IdentityConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.IdentityConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.IdentityConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.IdentityConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.IdentityConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.IdentityConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.IdentityConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.IdentityConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.IdentityConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.IdentityConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.IdentityConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.IdentityConfig prototype) {
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
   * Identity related configuration, including service account based
   * secure multi-tenancy user mappings.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.IdentityConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.IdentityConfig)
      com.google.cloud.dataproc.v1.IdentityConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_IdentityConfig_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 1:
          return internalGetUserServiceAccountMapping();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMutableUserServiceAccountMapping();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_IdentityConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.IdentityConfig.class,
              com.google.cloud.dataproc.v1.IdentityConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.IdentityConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableUserServiceAccountMapping().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_IdentityConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.IdentityConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.IdentityConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.IdentityConfig build() {
      com.google.cloud.dataproc.v1.IdentityConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.IdentityConfig buildPartial() {
      com.google.cloud.dataproc.v1.IdentityConfig result =
          new com.google.cloud.dataproc.v1.IdentityConfig(this);
      int from_bitField0_ = bitField0_;
      result.userServiceAccountMapping_ = internalGetUserServiceAccountMapping();
      result.userServiceAccountMapping_.makeImmutable();
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
      if (other instanceof com.google.cloud.dataproc.v1.IdentityConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.IdentityConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.IdentityConfig other) {
      if (other == com.google.cloud.dataproc.v1.IdentityConfig.getDefaultInstance()) return this;
      internalGetMutableUserServiceAccountMapping()
          .mergeFrom(other.internalGetUserServiceAccountMapping());
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
                    userServiceAccountMapping__ =
                        input.readMessage(
                            UserServiceAccountMappingDefaultEntryHolder.defaultEntry
                                .getParserForType(),
                            extensionRegistry);
                internalGetMutableUserServiceAccountMapping()
                    .getMutableMap()
                    .put(
                        userServiceAccountMapping__.getKey(),
                        userServiceAccountMapping__.getValue());
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        userServiceAccountMapping_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetUserServiceAccountMapping() {
      if (userServiceAccountMapping_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            UserServiceAccountMappingDefaultEntryHolder.defaultEntry);
      }
      return userServiceAccountMapping_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableUserServiceAccountMapping() {
      onChanged();
      ;
      if (userServiceAccountMapping_ == null) {
        userServiceAccountMapping_ =
            com.google.protobuf.MapField.newMapField(
                UserServiceAccountMappingDefaultEntryHolder.defaultEntry);
      }
      if (!userServiceAccountMapping_.isMutable()) {
        userServiceAccountMapping_ = userServiceAccountMapping_.copy();
      }
      return userServiceAccountMapping_;
    }

    public int getUserServiceAccountMappingCount() {
      return internalGetUserServiceAccountMapping().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Required. Map of user to service account.
     * </pre>
     *
     * <code>
     * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    @java.lang.Override
    public boolean containsUserServiceAccountMapping(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetUserServiceAccountMapping().getMap().containsKey(key);
    }
    /** Use {@link #getUserServiceAccountMappingMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getUserServiceAccountMapping() {
      return getUserServiceAccountMappingMap();
    }
    /**
     *
     *
     * <pre>
     * Required. Map of user to service account.
     * </pre>
     *
     * <code>
     * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getUserServiceAccountMappingMap() {
      return internalGetUserServiceAccountMapping().getMap();
    }
    /**
     *
     *
     * <pre>
     * Required. Map of user to service account.
     * </pre>
     *
     * <code>
     * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    @java.lang.Override
    public java.lang.String getUserServiceAccountMappingOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetUserServiceAccountMapping().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Required. Map of user to service account.
     * </pre>
     *
     * <code>
     * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    @java.lang.Override
    public java.lang.String getUserServiceAccountMappingOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetUserServiceAccountMapping().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearUserServiceAccountMapping() {
      internalGetMutableUserServiceAccountMapping().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Map of user to service account.
     * </pre>
     *
     * <code>
     * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeUserServiceAccountMapping(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableUserServiceAccountMapping().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableUserServiceAccountMapping() {
      return internalGetMutableUserServiceAccountMapping().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Required. Map of user to service account.
     * </pre>
     *
     * <code>
     * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder putUserServiceAccountMapping(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }

      internalGetMutableUserServiceAccountMapping().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Map of user to service account.
     * </pre>
     *
     * <code>
     * map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder putAllUserServiceAccountMapping(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableUserServiceAccountMapping().getMutableMap().putAll(values);
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.IdentityConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.IdentityConfig)
  private static final com.google.cloud.dataproc.v1.IdentityConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.IdentityConfig();
  }

  public static com.google.cloud.dataproc.v1.IdentityConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IdentityConfig> PARSER =
      new com.google.protobuf.AbstractParser<IdentityConfig>() {
        @java.lang.Override
        public IdentityConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<IdentityConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IdentityConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.IdentityConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
