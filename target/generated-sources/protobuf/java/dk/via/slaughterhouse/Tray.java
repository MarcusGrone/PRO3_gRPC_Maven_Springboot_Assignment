// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: slaughterhouse.proto

package dk.via.slaughterhouse;

/**
 * Protobuf type {@code dk.via.slaughterhouse.Tray}
 */
public  final class Tray extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dk.via.slaughterhouse.Tray)
    TrayOrBuilder {
  // Use Tray.newBuilder() to construct.
  private Tray(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Tray() {
    trayId_ = "";
    partType_ = "";
    parts_ = java.util.Collections.emptyList();
    maxWeight_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Tray(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            trayId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            partType_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              parts_ = new java.util.ArrayList<dk.via.slaughterhouse.Part>();
              mutable_bitField0_ |= 0x00000004;
            }
            parts_.add(
                input.readMessage(dk.via.slaughterhouse.Part.parser(), extensionRegistry));
            break;
          }
          case 33: {

            maxWeight_ = input.readDouble();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        parts_ = java.util.Collections.unmodifiableList(parts_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return dk.via.slaughterhouse.Slaughterhouse.internal_static_dk_via_slaughterhouse_Tray_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return dk.via.slaughterhouse.Slaughterhouse.internal_static_dk_via_slaughterhouse_Tray_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            dk.via.slaughterhouse.Tray.class, dk.via.slaughterhouse.Tray.Builder.class);
  }

  private int bitField0_;
  public static final int TRAYID_FIELD_NUMBER = 1;
  private volatile java.lang.Object trayId_;
  /**
   * <code>string trayId = 1;</code>
   */
  public java.lang.String getTrayId() {
    java.lang.Object ref = trayId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      trayId_ = s;
      return s;
    }
  }
  /**
   * <code>string trayId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTrayIdBytes() {
    java.lang.Object ref = trayId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      trayId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTTYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object partType_;
  /**
   * <code>string partType = 2;</code>
   */
  public java.lang.String getPartType() {
    java.lang.Object ref = partType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      partType_ = s;
      return s;
    }
  }
  /**
   * <code>string partType = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPartTypeBytes() {
    java.lang.Object ref = partType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      partType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTS_FIELD_NUMBER = 3;
  private java.util.List<dk.via.slaughterhouse.Part> parts_;
  /**
   * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
   */
  public java.util.List<dk.via.slaughterhouse.Part> getPartsList() {
    return parts_;
  }
  /**
   * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
   */
  public java.util.List<? extends dk.via.slaughterhouse.PartOrBuilder> 
      getPartsOrBuilderList() {
    return parts_;
  }
  /**
   * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
   */
  public int getPartsCount() {
    return parts_.size();
  }
  /**
   * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
   */
  public dk.via.slaughterhouse.Part getParts(int index) {
    return parts_.get(index);
  }
  /**
   * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
   */
  public dk.via.slaughterhouse.PartOrBuilder getPartsOrBuilder(
      int index) {
    return parts_.get(index);
  }

  public static final int MAXWEIGHT_FIELD_NUMBER = 4;
  private double maxWeight_;
  /**
   * <code>double maxWeight = 4;</code>
   */
  public double getMaxWeight() {
    return maxWeight_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTrayIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, trayId_);
    }
    if (!getPartTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, partType_);
    }
    for (int i = 0; i < parts_.size(); i++) {
      output.writeMessage(3, parts_.get(i));
    }
    if (maxWeight_ != 0D) {
      output.writeDouble(4, maxWeight_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTrayIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, trayId_);
    }
    if (!getPartTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, partType_);
    }
    for (int i = 0; i < parts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, parts_.get(i));
    }
    if (maxWeight_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, maxWeight_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof dk.via.slaughterhouse.Tray)) {
      return super.equals(obj);
    }
    dk.via.slaughterhouse.Tray other = (dk.via.slaughterhouse.Tray) obj;

    boolean result = true;
    result = result && getTrayId()
        .equals(other.getTrayId());
    result = result && getPartType()
        .equals(other.getPartType());
    result = result && getPartsList()
        .equals(other.getPartsList());
    result = result && (
        java.lang.Double.doubleToLongBits(getMaxWeight())
        == java.lang.Double.doubleToLongBits(
            other.getMaxWeight()));
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TRAYID_FIELD_NUMBER;
    hash = (53 * hash) + getTrayId().hashCode();
    hash = (37 * hash) + PARTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getPartType().hashCode();
    if (getPartsCount() > 0) {
      hash = (37 * hash) + PARTS_FIELD_NUMBER;
      hash = (53 * hash) + getPartsList().hashCode();
    }
    hash = (37 * hash) + MAXWEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMaxWeight()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static dk.via.slaughterhouse.Tray parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.slaughterhouse.Tray parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.slaughterhouse.Tray parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.slaughterhouse.Tray parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.slaughterhouse.Tray parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static dk.via.slaughterhouse.Tray parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static dk.via.slaughterhouse.Tray parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dk.via.slaughterhouse.Tray parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static dk.via.slaughterhouse.Tray parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static dk.via.slaughterhouse.Tray parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static dk.via.slaughterhouse.Tray parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static dk.via.slaughterhouse.Tray parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(dk.via.slaughterhouse.Tray prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code dk.via.slaughterhouse.Tray}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dk.via.slaughterhouse.Tray)
      dk.via.slaughterhouse.TrayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return dk.via.slaughterhouse.Slaughterhouse.internal_static_dk_via_slaughterhouse_Tray_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return dk.via.slaughterhouse.Slaughterhouse.internal_static_dk_via_slaughterhouse_Tray_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              dk.via.slaughterhouse.Tray.class, dk.via.slaughterhouse.Tray.Builder.class);
    }

    // Construct using dk.via.slaughterhouse.Tray.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getPartsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      trayId_ = "";

      partType_ = "";

      if (partsBuilder_ == null) {
        parts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        partsBuilder_.clear();
      }
      maxWeight_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return dk.via.slaughterhouse.Slaughterhouse.internal_static_dk_via_slaughterhouse_Tray_descriptor;
    }

    public dk.via.slaughterhouse.Tray getDefaultInstanceForType() {
      return dk.via.slaughterhouse.Tray.getDefaultInstance();
    }

    public dk.via.slaughterhouse.Tray build() {
      dk.via.slaughterhouse.Tray result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public dk.via.slaughterhouse.Tray buildPartial() {
      dk.via.slaughterhouse.Tray result = new dk.via.slaughterhouse.Tray(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.trayId_ = trayId_;
      result.partType_ = partType_;
      if (partsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          parts_ = java.util.Collections.unmodifiableList(parts_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.parts_ = parts_;
      } else {
        result.parts_ = partsBuilder_.build();
      }
      result.maxWeight_ = maxWeight_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof dk.via.slaughterhouse.Tray) {
        return mergeFrom((dk.via.slaughterhouse.Tray)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(dk.via.slaughterhouse.Tray other) {
      if (other == dk.via.slaughterhouse.Tray.getDefaultInstance()) return this;
      if (!other.getTrayId().isEmpty()) {
        trayId_ = other.trayId_;
        onChanged();
      }
      if (!other.getPartType().isEmpty()) {
        partType_ = other.partType_;
        onChanged();
      }
      if (partsBuilder_ == null) {
        if (!other.parts_.isEmpty()) {
          if (parts_.isEmpty()) {
            parts_ = other.parts_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensurePartsIsMutable();
            parts_.addAll(other.parts_);
          }
          onChanged();
        }
      } else {
        if (!other.parts_.isEmpty()) {
          if (partsBuilder_.isEmpty()) {
            partsBuilder_.dispose();
            partsBuilder_ = null;
            parts_ = other.parts_;
            bitField0_ = (bitField0_ & ~0x00000004);
            partsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPartsFieldBuilder() : null;
          } else {
            partsBuilder_.addAllMessages(other.parts_);
          }
        }
      }
      if (other.getMaxWeight() != 0D) {
        setMaxWeight(other.getMaxWeight());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      dk.via.slaughterhouse.Tray parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (dk.via.slaughterhouse.Tray) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object trayId_ = "";
    /**
     * <code>string trayId = 1;</code>
     */
    public java.lang.String getTrayId() {
      java.lang.Object ref = trayId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        trayId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string trayId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTrayIdBytes() {
      java.lang.Object ref = trayId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        trayId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string trayId = 1;</code>
     */
    public Builder setTrayId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      trayId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string trayId = 1;</code>
     */
    public Builder clearTrayId() {
      
      trayId_ = getDefaultInstance().getTrayId();
      onChanged();
      return this;
    }
    /**
     * <code>string trayId = 1;</code>
     */
    public Builder setTrayIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      trayId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object partType_ = "";
    /**
     * <code>string partType = 2;</code>
     */
    public java.lang.String getPartType() {
      java.lang.Object ref = partType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        partType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string partType = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPartTypeBytes() {
      java.lang.Object ref = partType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        partType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string partType = 2;</code>
     */
    public Builder setPartType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      partType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string partType = 2;</code>
     */
    public Builder clearPartType() {
      
      partType_ = getDefaultInstance().getPartType();
      onChanged();
      return this;
    }
    /**
     * <code>string partType = 2;</code>
     */
    public Builder setPartTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      partType_ = value;
      onChanged();
      return this;
    }

    private java.util.List<dk.via.slaughterhouse.Part> parts_ =
      java.util.Collections.emptyList();
    private void ensurePartsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        parts_ = new java.util.ArrayList<dk.via.slaughterhouse.Part>(parts_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        dk.via.slaughterhouse.Part, dk.via.slaughterhouse.Part.Builder, dk.via.slaughterhouse.PartOrBuilder> partsBuilder_;

    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public java.util.List<dk.via.slaughterhouse.Part> getPartsList() {
      if (partsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(parts_);
      } else {
        return partsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public int getPartsCount() {
      if (partsBuilder_ == null) {
        return parts_.size();
      } else {
        return partsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public dk.via.slaughterhouse.Part getParts(int index) {
      if (partsBuilder_ == null) {
        return parts_.get(index);
      } else {
        return partsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public Builder setParts(
        int index, dk.via.slaughterhouse.Part value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.set(index, value);
        onChanged();
      } else {
        partsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public Builder setParts(
        int index, dk.via.slaughterhouse.Part.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.set(index, builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public Builder addParts(dk.via.slaughterhouse.Part value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.add(value);
        onChanged();
      } else {
        partsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public Builder addParts(
        int index, dk.via.slaughterhouse.Part value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.add(index, value);
        onChanged();
      } else {
        partsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public Builder addParts(
        dk.via.slaughterhouse.Part.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.add(builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public Builder addParts(
        int index, dk.via.slaughterhouse.Part.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.add(index, builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public Builder addAllParts(
        java.lang.Iterable<? extends dk.via.slaughterhouse.Part> values) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, parts_);
        onChanged();
      } else {
        partsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public Builder clearParts() {
      if (partsBuilder_ == null) {
        parts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        partsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public Builder removeParts(int index) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.remove(index);
        onChanged();
      } else {
        partsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public dk.via.slaughterhouse.Part.Builder getPartsBuilder(
        int index) {
      return getPartsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public dk.via.slaughterhouse.PartOrBuilder getPartsOrBuilder(
        int index) {
      if (partsBuilder_ == null) {
        return parts_.get(index);  } else {
        return partsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public java.util.List<? extends dk.via.slaughterhouse.PartOrBuilder> 
         getPartsOrBuilderList() {
      if (partsBuilder_ != null) {
        return partsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(parts_);
      }
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public dk.via.slaughterhouse.Part.Builder addPartsBuilder() {
      return getPartsFieldBuilder().addBuilder(
          dk.via.slaughterhouse.Part.getDefaultInstance());
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public dk.via.slaughterhouse.Part.Builder addPartsBuilder(
        int index) {
      return getPartsFieldBuilder().addBuilder(
          index, dk.via.slaughterhouse.Part.getDefaultInstance());
    }
    /**
     * <code>repeated .dk.via.slaughterhouse.Part parts = 3;</code>
     */
    public java.util.List<dk.via.slaughterhouse.Part.Builder> 
         getPartsBuilderList() {
      return getPartsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        dk.via.slaughterhouse.Part, dk.via.slaughterhouse.Part.Builder, dk.via.slaughterhouse.PartOrBuilder> 
        getPartsFieldBuilder() {
      if (partsBuilder_ == null) {
        partsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            dk.via.slaughterhouse.Part, dk.via.slaughterhouse.Part.Builder, dk.via.slaughterhouse.PartOrBuilder>(
                parts_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        parts_ = null;
      }
      return partsBuilder_;
    }

    private double maxWeight_ ;
    /**
     * <code>double maxWeight = 4;</code>
     */
    public double getMaxWeight() {
      return maxWeight_;
    }
    /**
     * <code>double maxWeight = 4;</code>
     */
    public Builder setMaxWeight(double value) {
      
      maxWeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double maxWeight = 4;</code>
     */
    public Builder clearMaxWeight() {
      
      maxWeight_ = 0D;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:dk.via.slaughterhouse.Tray)
  }

  // @@protoc_insertion_point(class_scope:dk.via.slaughterhouse.Tray)
  private static final dk.via.slaughterhouse.Tray DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new dk.via.slaughterhouse.Tray();
  }

  public static dk.via.slaughterhouse.Tray getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Tray>
      PARSER = new com.google.protobuf.AbstractParser<Tray>() {
    public Tray parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Tray(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Tray> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Tray> getParserForType() {
    return PARSER;
  }

  public dk.via.slaughterhouse.Tray getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

