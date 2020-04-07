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
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * Cluster components that can be activated.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.dataproc.v1.Component}
 */
public enum Component implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified component.
   * </pre>
   *
   * <code>COMPONENT_UNSPECIFIED = 0;</code>
   */
  COMPONENT_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The Anaconda python distribution.
   * </pre>
   *
   * <code>ANACONDA = 5;</code>
   */
  ANACONDA(5),
  /**
   *
   *
   * <pre>
   * The Hive Web HCatalog (the REST service for accessing HCatalog).
   * </pre>
   *
   * <code>HIVE_WEBHCAT = 3;</code>
   */
  HIVE_WEBHCAT(3),
  /**
   *
   *
   * <pre>
   * The Jupyter Notebook.
   * </pre>
   *
   * <code>JUPYTER = 1;</code>
   */
  JUPYTER(1),
  /**
   *
   *
   * <pre>
   * The Presto query engine.
   * </pre>
   *
   * <code>PRESTO = 6;</code>
   */
  PRESTO(6),
  /**
   *
   *
   * <pre>
   * The Zeppelin notebook.
   * </pre>
   *
   * <code>ZEPPELIN = 4;</code>
   */
  ZEPPELIN(4),
  /**
   *
   *
   * <pre>
   * The Zookeeper service.
   * </pre>
   *
   * <code>ZOOKEEPER = 8;</code>
   */
  ZOOKEEPER(8),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified component.
   * </pre>
   *
   * <code>COMPONENT_UNSPECIFIED = 0;</code>
   */
  public static final int COMPONENT_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The Anaconda python distribution.
   * </pre>
   *
   * <code>ANACONDA = 5;</code>
   */
  public static final int ANACONDA_VALUE = 5;
  /**
   *
   *
   * <pre>
   * The Hive Web HCatalog (the REST service for accessing HCatalog).
   * </pre>
   *
   * <code>HIVE_WEBHCAT = 3;</code>
   */
  public static final int HIVE_WEBHCAT_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The Jupyter Notebook.
   * </pre>
   *
   * <code>JUPYTER = 1;</code>
   */
  public static final int JUPYTER_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The Presto query engine.
   * </pre>
   *
   * <code>PRESTO = 6;</code>
   */
  public static final int PRESTO_VALUE = 6;
  /**
   *
   *
   * <pre>
   * The Zeppelin notebook.
   * </pre>
   *
   * <code>ZEPPELIN = 4;</code>
   */
  public static final int ZEPPELIN_VALUE = 4;
  /**
   *
   *
   * <pre>
   * The Zookeeper service.
   * </pre>
   *
   * <code>ZOOKEEPER = 8;</code>
   */
  public static final int ZOOKEEPER_VALUE = 8;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Component valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Component forNumber(int value) {
    switch (value) {
      case 0:
        return COMPONENT_UNSPECIFIED;
      case 5:
        return ANACONDA;
      case 3:
        return HIVE_WEBHCAT;
      case 1:
        return JUPYTER;
      case 6:
        return PRESTO;
      case 4:
        return ZEPPELIN;
      case 8:
        return ZOOKEEPER;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Component> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<Component> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<Component>() {
        public Component findValueByNumber(int number) {
          return Component.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.SharedProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Component[] VALUES = values();

  public static Component valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Component(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.dataproc.v1.Component)
}
