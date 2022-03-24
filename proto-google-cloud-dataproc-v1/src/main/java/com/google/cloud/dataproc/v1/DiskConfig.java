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
 * Specifies the config of disk options for a group of VM instances.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.DiskConfig}
 */
public final class DiskConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.DiskConfig)
    DiskConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DiskConfig.newBuilder() to construct.
  private DiskConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DiskConfig() {
    bootDiskType_ = "";
    localSsdInterface_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DiskConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DiskConfig(
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
          case 8:
            {
              bootDiskSizeGb_ = input.readInt32();
              break;
            }
          case 16:
            {
              numLocalSsds_ = input.readInt32();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              bootDiskType_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              localSsdInterface_ = s;
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
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_DiskConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.ClustersProto
        .internal_static_google_cloud_dataproc_v1_DiskConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.DiskConfig.class,
            com.google.cloud.dataproc.v1.DiskConfig.Builder.class);
  }

  public static final int BOOT_DISK_TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object bootDiskType_;
  /**
   *
   *
   * <pre>
   * Optional. Type of the boot disk (default is "pd-standard").
   * Valid values: "pd-balanced" (Persistent Disk Balanced Solid State Drive),
   * "pd-ssd" (Persistent Disk Solid State Drive),
   * or "pd-standard" (Persistent Disk Hard Disk Drive).
   * See [Disk types](https://cloud.google.com/compute/docs/disks#disk-types).
   * </pre>
   *
   * <code>string boot_disk_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bootDiskType.
   */
  @java.lang.Override
  public java.lang.String getBootDiskType() {
    java.lang.Object ref = bootDiskType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bootDiskType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Type of the boot disk (default is "pd-standard").
   * Valid values: "pd-balanced" (Persistent Disk Balanced Solid State Drive),
   * "pd-ssd" (Persistent Disk Solid State Drive),
   * or "pd-standard" (Persistent Disk Hard Disk Drive).
   * See [Disk types](https://cloud.google.com/compute/docs/disks#disk-types).
   * </pre>
   *
   * <code>string boot_disk_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for bootDiskType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBootDiskTypeBytes() {
    java.lang.Object ref = bootDiskType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      bootDiskType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BOOT_DISK_SIZE_GB_FIELD_NUMBER = 1;
  private int bootDiskSizeGb_;
  /**
   *
   *
   * <pre>
   * Optional. Size in GB of the boot disk (default is 500GB).
   * </pre>
   *
   * <code>int32 boot_disk_size_gb = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bootDiskSizeGb.
   */
  @java.lang.Override
  public int getBootDiskSizeGb() {
    return bootDiskSizeGb_;
  }

  public static final int NUM_LOCAL_SSDS_FIELD_NUMBER = 2;
  private int numLocalSsds_;
  /**
   *
   *
   * <pre>
   * Optional. Number of attached SSDs, from 0 to 4 (default is 0).
   * If SSDs are not attached, the boot disk is used to store runtime logs and
   * [HDFS](https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data.
   * If one or more SSDs are attached, this runtime bulk
   * data is spread across them, and the boot disk contains only basic
   * config and installed binaries.
   * </pre>
   *
   * <code>int32 num_local_ssds = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The numLocalSsds.
   */
  @java.lang.Override
  public int getNumLocalSsds() {
    return numLocalSsds_;
  }

  public static final int LOCAL_SSD_INTERFACE_FIELD_NUMBER = 4;
  private volatile java.lang.Object localSsdInterface_;
  /**
   *
   *
   * <pre>
   * Optional. Interface type of local SSDs (default is "scsi").
   * Valid values: "scsi" (Small Computer System Interface),
   * "nvme" (Non-Volatile Memory Express).
   * See [local SSD
   * performance](https://cloud.google.com/compute/docs/disks/local-ssd#performance).
   * </pre>
   *
   * <code>string local_ssd_interface = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The localSsdInterface.
   */
  @java.lang.Override
  public java.lang.String getLocalSsdInterface() {
    java.lang.Object ref = localSsdInterface_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      localSsdInterface_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Interface type of local SSDs (default is "scsi").
   * Valid values: "scsi" (Small Computer System Interface),
   * "nvme" (Non-Volatile Memory Express).
   * See [local SSD
   * performance](https://cloud.google.com/compute/docs/disks/local-ssd#performance).
   * </pre>
   *
   * <code>string local_ssd_interface = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for localSsdInterface.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLocalSsdInterfaceBytes() {
    java.lang.Object ref = localSsdInterface_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      localSsdInterface_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (bootDiskSizeGb_ != 0) {
      output.writeInt32(1, bootDiskSizeGb_);
    }
    if (numLocalSsds_ != 0) {
      output.writeInt32(2, numLocalSsds_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bootDiskType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, bootDiskType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(localSsdInterface_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, localSsdInterface_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bootDiskSizeGb_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, bootDiskSizeGb_);
    }
    if (numLocalSsds_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, numLocalSsds_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bootDiskType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, bootDiskType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(localSsdInterface_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, localSsdInterface_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.DiskConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.DiskConfig other = (com.google.cloud.dataproc.v1.DiskConfig) obj;

    if (!getBootDiskType().equals(other.getBootDiskType())) return false;
    if (getBootDiskSizeGb() != other.getBootDiskSizeGb()) return false;
    if (getNumLocalSsds() != other.getNumLocalSsds()) return false;
    if (!getLocalSsdInterface().equals(other.getLocalSsdInterface())) return false;
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
    hash = (37 * hash) + BOOT_DISK_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getBootDiskType().hashCode();
    hash = (37 * hash) + BOOT_DISK_SIZE_GB_FIELD_NUMBER;
    hash = (53 * hash) + getBootDiskSizeGb();
    hash = (37 * hash) + NUM_LOCAL_SSDS_FIELD_NUMBER;
    hash = (53 * hash) + getNumLocalSsds();
    hash = (37 * hash) + LOCAL_SSD_INTERFACE_FIELD_NUMBER;
    hash = (53 * hash) + getLocalSsdInterface().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.DiskConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.DiskConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.DiskConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.DiskConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.DiskConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.DiskConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.DiskConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.DiskConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.DiskConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.DiskConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.DiskConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.DiskConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.DiskConfig prototype) {
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
   * Specifies the config of disk options for a group of VM instances.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.DiskConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.DiskConfig)
      com.google.cloud.dataproc.v1.DiskConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_DiskConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_DiskConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.DiskConfig.class,
              com.google.cloud.dataproc.v1.DiskConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.DiskConfig.newBuilder()
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
      bootDiskType_ = "";

      bootDiskSizeGb_ = 0;

      numLocalSsds_ = 0;

      localSsdInterface_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.ClustersProto
          .internal_static_google_cloud_dataproc_v1_DiskConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.DiskConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.DiskConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.DiskConfig build() {
      com.google.cloud.dataproc.v1.DiskConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.DiskConfig buildPartial() {
      com.google.cloud.dataproc.v1.DiskConfig result =
          new com.google.cloud.dataproc.v1.DiskConfig(this);
      result.bootDiskType_ = bootDiskType_;
      result.bootDiskSizeGb_ = bootDiskSizeGb_;
      result.numLocalSsds_ = numLocalSsds_;
      result.localSsdInterface_ = localSsdInterface_;
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
      if (other instanceof com.google.cloud.dataproc.v1.DiskConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.DiskConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.DiskConfig other) {
      if (other == com.google.cloud.dataproc.v1.DiskConfig.getDefaultInstance()) return this;
      if (!other.getBootDiskType().isEmpty()) {
        bootDiskType_ = other.bootDiskType_;
        onChanged();
      }
      if (other.getBootDiskSizeGb() != 0) {
        setBootDiskSizeGb(other.getBootDiskSizeGb());
      }
      if (other.getNumLocalSsds() != 0) {
        setNumLocalSsds(other.getNumLocalSsds());
      }
      if (!other.getLocalSsdInterface().isEmpty()) {
        localSsdInterface_ = other.localSsdInterface_;
        onChanged();
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
      com.google.cloud.dataproc.v1.DiskConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1.DiskConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object bootDiskType_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Type of the boot disk (default is "pd-standard").
     * Valid values: "pd-balanced" (Persistent Disk Balanced Solid State Drive),
     * "pd-ssd" (Persistent Disk Solid State Drive),
     * or "pd-standard" (Persistent Disk Hard Disk Drive).
     * See [Disk types](https://cloud.google.com/compute/docs/disks#disk-types).
     * </pre>
     *
     * <code>string boot_disk_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bootDiskType.
     */
    public java.lang.String getBootDiskType() {
      java.lang.Object ref = bootDiskType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bootDiskType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Type of the boot disk (default is "pd-standard").
     * Valid values: "pd-balanced" (Persistent Disk Balanced Solid State Drive),
     * "pd-ssd" (Persistent Disk Solid State Drive),
     * or "pd-standard" (Persistent Disk Hard Disk Drive).
     * See [Disk types](https://cloud.google.com/compute/docs/disks#disk-types).
     * </pre>
     *
     * <code>string boot_disk_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for bootDiskType.
     */
    public com.google.protobuf.ByteString getBootDiskTypeBytes() {
      java.lang.Object ref = bootDiskType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        bootDiskType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Type of the boot disk (default is "pd-standard").
     * Valid values: "pd-balanced" (Persistent Disk Balanced Solid State Drive),
     * "pd-ssd" (Persistent Disk Solid State Drive),
     * or "pd-standard" (Persistent Disk Hard Disk Drive).
     * See [Disk types](https://cloud.google.com/compute/docs/disks#disk-types).
     * </pre>
     *
     * <code>string boot_disk_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bootDiskType to set.
     * @return This builder for chaining.
     */
    public Builder setBootDiskType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      bootDiskType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Type of the boot disk (default is "pd-standard").
     * Valid values: "pd-balanced" (Persistent Disk Balanced Solid State Drive),
     * "pd-ssd" (Persistent Disk Solid State Drive),
     * or "pd-standard" (Persistent Disk Hard Disk Drive).
     * See [Disk types](https://cloud.google.com/compute/docs/disks#disk-types).
     * </pre>
     *
     * <code>string boot_disk_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBootDiskType() {

      bootDiskType_ = getDefaultInstance().getBootDiskType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Type of the boot disk (default is "pd-standard").
     * Valid values: "pd-balanced" (Persistent Disk Balanced Solid State Drive),
     * "pd-ssd" (Persistent Disk Solid State Drive),
     * or "pd-standard" (Persistent Disk Hard Disk Drive).
     * See [Disk types](https://cloud.google.com/compute/docs/disks#disk-types).
     * </pre>
     *
     * <code>string boot_disk_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for bootDiskType to set.
     * @return This builder for chaining.
     */
    public Builder setBootDiskTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      bootDiskType_ = value;
      onChanged();
      return this;
    }

    private int bootDiskSizeGb_;
    /**
     *
     *
     * <pre>
     * Optional. Size in GB of the boot disk (default is 500GB).
     * </pre>
     *
     * <code>int32 boot_disk_size_gb = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bootDiskSizeGb.
     */
    @java.lang.Override
    public int getBootDiskSizeGb() {
      return bootDiskSizeGb_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Size in GB of the boot disk (default is 500GB).
     * </pre>
     *
     * <code>int32 boot_disk_size_gb = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bootDiskSizeGb to set.
     * @return This builder for chaining.
     */
    public Builder setBootDiskSizeGb(int value) {

      bootDiskSizeGb_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Size in GB of the boot disk (default is 500GB).
     * </pre>
     *
     * <code>int32 boot_disk_size_gb = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBootDiskSizeGb() {

      bootDiskSizeGb_ = 0;
      onChanged();
      return this;
    }

    private int numLocalSsds_;
    /**
     *
     *
     * <pre>
     * Optional. Number of attached SSDs, from 0 to 4 (default is 0).
     * If SSDs are not attached, the boot disk is used to store runtime logs and
     * [HDFS](https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data.
     * If one or more SSDs are attached, this runtime bulk
     * data is spread across them, and the boot disk contains only basic
     * config and installed binaries.
     * </pre>
     *
     * <code>int32 num_local_ssds = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The numLocalSsds.
     */
    @java.lang.Override
    public int getNumLocalSsds() {
      return numLocalSsds_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Number of attached SSDs, from 0 to 4 (default is 0).
     * If SSDs are not attached, the boot disk is used to store runtime logs and
     * [HDFS](https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data.
     * If one or more SSDs are attached, this runtime bulk
     * data is spread across them, and the boot disk contains only basic
     * config and installed binaries.
     * </pre>
     *
     * <code>int32 num_local_ssds = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The numLocalSsds to set.
     * @return This builder for chaining.
     */
    public Builder setNumLocalSsds(int value) {

      numLocalSsds_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Number of attached SSDs, from 0 to 4 (default is 0).
     * If SSDs are not attached, the boot disk is used to store runtime logs and
     * [HDFS](https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data.
     * If one or more SSDs are attached, this runtime bulk
     * data is spread across them, and the boot disk contains only basic
     * config and installed binaries.
     * </pre>
     *
     * <code>int32 num_local_ssds = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNumLocalSsds() {

      numLocalSsds_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object localSsdInterface_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Interface type of local SSDs (default is "scsi").
     * Valid values: "scsi" (Small Computer System Interface),
     * "nvme" (Non-Volatile Memory Express).
     * See [local SSD
     * performance](https://cloud.google.com/compute/docs/disks/local-ssd#performance).
     * </pre>
     *
     * <code>string local_ssd_interface = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The localSsdInterface.
     */
    public java.lang.String getLocalSsdInterface() {
      java.lang.Object ref = localSsdInterface_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        localSsdInterface_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Interface type of local SSDs (default is "scsi").
     * Valid values: "scsi" (Small Computer System Interface),
     * "nvme" (Non-Volatile Memory Express).
     * See [local SSD
     * performance](https://cloud.google.com/compute/docs/disks/local-ssd#performance).
     * </pre>
     *
     * <code>string local_ssd_interface = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for localSsdInterface.
     */
    public com.google.protobuf.ByteString getLocalSsdInterfaceBytes() {
      java.lang.Object ref = localSsdInterface_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        localSsdInterface_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Interface type of local SSDs (default is "scsi").
     * Valid values: "scsi" (Small Computer System Interface),
     * "nvme" (Non-Volatile Memory Express).
     * See [local SSD
     * performance](https://cloud.google.com/compute/docs/disks/local-ssd#performance).
     * </pre>
     *
     * <code>string local_ssd_interface = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The localSsdInterface to set.
     * @return This builder for chaining.
     */
    public Builder setLocalSsdInterface(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      localSsdInterface_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Interface type of local SSDs (default is "scsi").
     * Valid values: "scsi" (Small Computer System Interface),
     * "nvme" (Non-Volatile Memory Express).
     * See [local SSD
     * performance](https://cloud.google.com/compute/docs/disks/local-ssd#performance).
     * </pre>
     *
     * <code>string local_ssd_interface = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocalSsdInterface() {

      localSsdInterface_ = getDefaultInstance().getLocalSsdInterface();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Interface type of local SSDs (default is "scsi").
     * Valid values: "scsi" (Small Computer System Interface),
     * "nvme" (Non-Volatile Memory Express).
     * See [local SSD
     * performance](https://cloud.google.com/compute/docs/disks/local-ssd#performance).
     * </pre>
     *
     * <code>string local_ssd_interface = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for localSsdInterface to set.
     * @return This builder for chaining.
     */
    public Builder setLocalSsdInterfaceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      localSsdInterface_ = value;
      onChanged();
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.DiskConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.DiskConfig)
  private static final com.google.cloud.dataproc.v1.DiskConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.DiskConfig();
  }

  public static com.google.cloud.dataproc.v1.DiskConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiskConfig> PARSER =
      new com.google.protobuf.AbstractParser<DiskConfig>() {
        @java.lang.Override
        public DiskConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DiskConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DiskConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiskConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.DiskConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
