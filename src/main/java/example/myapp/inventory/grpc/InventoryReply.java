// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory.proto

package example.myapp.inventory.grpc;

/**
 * Protobuf type {@code inventory.InventoryReply}
 */
public  final class InventoryReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:inventory.InventoryReply)
    InventoryReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InventoryReply.newBuilder() to construct.
  private InventoryReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InventoryReply() {
    inventoryID_ = "";
    name_ = "";
    description_ = "";
    unitPrice_ = 0L;
    quantityInStock_ = 0L;
    inventoryValue_ = 0L;
    reOrderValue_ = 0L;
    reOrderTime_ = 0L;
    quantityInReorder_ = 0L;
    disContinued_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InventoryReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            inventoryID_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 32: {

            unitPrice_ = input.readInt64();
            break;
          }
          case 40: {

            quantityInStock_ = input.readInt64();
            break;
          }
          case 48: {

            inventoryValue_ = input.readInt64();
            break;
          }
          case 56: {

            reOrderValue_ = input.readInt64();
            break;
          }
          case 64: {

            reOrderTime_ = input.readInt64();
            break;
          }
          case 72: {

            quantityInReorder_ = input.readInt64();
            break;
          }
          case 80: {

            disContinued_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return example.myapp.inventory.grpc.InventoryProto.internal_static_inventory_InventoryReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return example.myapp.inventory.grpc.InventoryProto.internal_static_inventory_InventoryReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            example.myapp.inventory.grpc.InventoryReply.class, example.myapp.inventory.grpc.InventoryReply.Builder.class);
  }

  public static final int INVENTORYID_FIELD_NUMBER = 1;
  private volatile java.lang.Object inventoryID_;
  /**
   * <code>string InventoryID = 1;</code>
   */
  public java.lang.String getInventoryID() {
    java.lang.Object ref = inventoryID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inventoryID_ = s;
      return s;
    }
  }
  /**
   * <code>string InventoryID = 1;</code>
   */
  public com.google.protobuf.ByteString
      getInventoryIDBytes() {
    java.lang.Object ref = inventoryID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inventoryID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string Name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string Name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
  /**
   * <code>string Description = 3;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string Description = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UNITPRICE_FIELD_NUMBER = 4;
  private long unitPrice_;
  /**
   * <code>int64 UnitPrice = 4;</code>
   */
  public long getUnitPrice() {
    return unitPrice_;
  }

  public static final int QUANTITYINSTOCK_FIELD_NUMBER = 5;
  private long quantityInStock_;
  /**
   * <code>int64 QuantityInStock = 5;</code>
   */
  public long getQuantityInStock() {
    return quantityInStock_;
  }

  public static final int INVENTORYVALUE_FIELD_NUMBER = 6;
  private long inventoryValue_;
  /**
   * <code>int64 InventoryValue = 6;</code>
   */
  public long getInventoryValue() {
    return inventoryValue_;
  }

  public static final int REORDERVALUE_FIELD_NUMBER = 7;
  private long reOrderValue_;
  /**
   * <code>int64 ReOrderValue = 7;</code>
   */
  public long getReOrderValue() {
    return reOrderValue_;
  }

  public static final int REORDERTIME_FIELD_NUMBER = 8;
  private long reOrderTime_;
  /**
   * <code>int64 ReOrderTime = 8;</code>
   */
  public long getReOrderTime() {
    return reOrderTime_;
  }

  public static final int QUANTITYINREORDER_FIELD_NUMBER = 9;
  private long quantityInReorder_;
  /**
   * <code>int64 QuantityInReorder = 9;</code>
   */
  public long getQuantityInReorder() {
    return quantityInReorder_;
  }

  public static final int DISCONTINUED_FIELD_NUMBER = 10;
  private boolean disContinued_;
  /**
   * <code>bool DisContinued = 10;</code>
   */
  public boolean getDisContinued() {
    return disContinued_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getInventoryIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inventoryID_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    if (unitPrice_ != 0L) {
      output.writeInt64(4, unitPrice_);
    }
    if (quantityInStock_ != 0L) {
      output.writeInt64(5, quantityInStock_);
    }
    if (inventoryValue_ != 0L) {
      output.writeInt64(6, inventoryValue_);
    }
    if (reOrderValue_ != 0L) {
      output.writeInt64(7, reOrderValue_);
    }
    if (reOrderTime_ != 0L) {
      output.writeInt64(8, reOrderTime_);
    }
    if (quantityInReorder_ != 0L) {
      output.writeInt64(9, quantityInReorder_);
    }
    if (disContinued_ != false) {
      output.writeBool(10, disContinued_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInventoryIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inventoryID_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    if (unitPrice_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, unitPrice_);
    }
    if (quantityInStock_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, quantityInStock_);
    }
    if (inventoryValue_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, inventoryValue_);
    }
    if (reOrderValue_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, reOrderValue_);
    }
    if (reOrderTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(8, reOrderTime_);
    }
    if (quantityInReorder_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(9, quantityInReorder_);
    }
    if (disContinued_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(10, disContinued_);
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
    if (!(obj instanceof example.myapp.inventory.grpc.InventoryReply)) {
      return super.equals(obj);
    }
    example.myapp.inventory.grpc.InventoryReply other = (example.myapp.inventory.grpc.InventoryReply) obj;

    boolean result = true;
    result = result && getInventoryID()
        .equals(other.getInventoryID());
    result = result && getName()
        .equals(other.getName());
    result = result && getDescription()
        .equals(other.getDescription());
    result = result && (getUnitPrice()
        == other.getUnitPrice());
    result = result && (getQuantityInStock()
        == other.getQuantityInStock());
    result = result && (getInventoryValue()
        == other.getInventoryValue());
    result = result && (getReOrderValue()
        == other.getReOrderValue());
    result = result && (getReOrderTime()
        == other.getReOrderTime());
    result = result && (getQuantityInReorder()
        == other.getQuantityInReorder());
    result = result && (getDisContinued()
        == other.getDisContinued());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INVENTORYID_FIELD_NUMBER;
    hash = (53 * hash) + getInventoryID().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + UNITPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUnitPrice());
    hash = (37 * hash) + QUANTITYINSTOCK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQuantityInStock());
    hash = (37 * hash) + INVENTORYVALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getInventoryValue());
    hash = (37 * hash) + REORDERVALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getReOrderValue());
    hash = (37 * hash) + REORDERTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getReOrderTime());
    hash = (37 * hash) + QUANTITYINREORDER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQuantityInReorder());
    hash = (37 * hash) + DISCONTINUED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisContinued());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static example.myapp.inventory.grpc.InventoryReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static example.myapp.inventory.grpc.InventoryReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static example.myapp.inventory.grpc.InventoryReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static example.myapp.inventory.grpc.InventoryReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static example.myapp.inventory.grpc.InventoryReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static example.myapp.inventory.grpc.InventoryReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static example.myapp.inventory.grpc.InventoryReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static example.myapp.inventory.grpc.InventoryReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static example.myapp.inventory.grpc.InventoryReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static example.myapp.inventory.grpc.InventoryReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static example.myapp.inventory.grpc.InventoryReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static example.myapp.inventory.grpc.InventoryReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(example.myapp.inventory.grpc.InventoryReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code inventory.InventoryReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:inventory.InventoryReply)
      example.myapp.inventory.grpc.InventoryReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return example.myapp.inventory.grpc.InventoryProto.internal_static_inventory_InventoryReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return example.myapp.inventory.grpc.InventoryProto.internal_static_inventory_InventoryReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              example.myapp.inventory.grpc.InventoryReply.class, example.myapp.inventory.grpc.InventoryReply.Builder.class);
    }

    // Construct using example.myapp.inventory.grpc.InventoryReply.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      inventoryID_ = "";

      name_ = "";

      description_ = "";

      unitPrice_ = 0L;

      quantityInStock_ = 0L;

      inventoryValue_ = 0L;

      reOrderValue_ = 0L;

      reOrderTime_ = 0L;

      quantityInReorder_ = 0L;

      disContinued_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return example.myapp.inventory.grpc.InventoryProto.internal_static_inventory_InventoryReply_descriptor;
    }

    @java.lang.Override
    public example.myapp.inventory.grpc.InventoryReply getDefaultInstanceForType() {
      return example.myapp.inventory.grpc.InventoryReply.getDefaultInstance();
    }

    @java.lang.Override
    public example.myapp.inventory.grpc.InventoryReply build() {
      example.myapp.inventory.grpc.InventoryReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public example.myapp.inventory.grpc.InventoryReply buildPartial() {
      example.myapp.inventory.grpc.InventoryReply result = new example.myapp.inventory.grpc.InventoryReply(this);
      result.inventoryID_ = inventoryID_;
      result.name_ = name_;
      result.description_ = description_;
      result.unitPrice_ = unitPrice_;
      result.quantityInStock_ = quantityInStock_;
      result.inventoryValue_ = inventoryValue_;
      result.reOrderValue_ = reOrderValue_;
      result.reOrderTime_ = reOrderTime_;
      result.quantityInReorder_ = quantityInReorder_;
      result.disContinued_ = disContinued_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof example.myapp.inventory.grpc.InventoryReply) {
        return mergeFrom((example.myapp.inventory.grpc.InventoryReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(example.myapp.inventory.grpc.InventoryReply other) {
      if (other == example.myapp.inventory.grpc.InventoryReply.getDefaultInstance()) return this;
      if (!other.getInventoryID().isEmpty()) {
        inventoryID_ = other.inventoryID_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.getUnitPrice() != 0L) {
        setUnitPrice(other.getUnitPrice());
      }
      if (other.getQuantityInStock() != 0L) {
        setQuantityInStock(other.getQuantityInStock());
      }
      if (other.getInventoryValue() != 0L) {
        setInventoryValue(other.getInventoryValue());
      }
      if (other.getReOrderValue() != 0L) {
        setReOrderValue(other.getReOrderValue());
      }
      if (other.getReOrderTime() != 0L) {
        setReOrderTime(other.getReOrderTime());
      }
      if (other.getQuantityInReorder() != 0L) {
        setQuantityInReorder(other.getQuantityInReorder());
      }
      if (other.getDisContinued() != false) {
        setDisContinued(other.getDisContinued());
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
      example.myapp.inventory.grpc.InventoryReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (example.myapp.inventory.grpc.InventoryReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object inventoryID_ = "";
    /**
     * <code>string InventoryID = 1;</code>
     */
    public java.lang.String getInventoryID() {
      java.lang.Object ref = inventoryID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inventoryID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string InventoryID = 1;</code>
     */
    public com.google.protobuf.ByteString
        getInventoryIDBytes() {
      java.lang.Object ref = inventoryID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inventoryID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string InventoryID = 1;</code>
     */
    public Builder setInventoryID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      inventoryID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string InventoryID = 1;</code>
     */
    public Builder clearInventoryID() {
      
      inventoryID_ = getDefaultInstance().getInventoryID();
      onChanged();
      return this;
    }
    /**
     * <code>string InventoryID = 1;</code>
     */
    public Builder setInventoryIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      inventoryID_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string Name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string Name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string Description = 3;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string Description = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string Description = 3;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string Description = 3;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string Description = 3;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private long unitPrice_ ;
    /**
     * <code>int64 UnitPrice = 4;</code>
     */
    public long getUnitPrice() {
      return unitPrice_;
    }
    /**
     * <code>int64 UnitPrice = 4;</code>
     */
    public Builder setUnitPrice(long value) {
      
      unitPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 UnitPrice = 4;</code>
     */
    public Builder clearUnitPrice() {
      
      unitPrice_ = 0L;
      onChanged();
      return this;
    }

    private long quantityInStock_ ;
    /**
     * <code>int64 QuantityInStock = 5;</code>
     */
    public long getQuantityInStock() {
      return quantityInStock_;
    }
    /**
     * <code>int64 QuantityInStock = 5;</code>
     */
    public Builder setQuantityInStock(long value) {
      
      quantityInStock_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 QuantityInStock = 5;</code>
     */
    public Builder clearQuantityInStock() {
      
      quantityInStock_ = 0L;
      onChanged();
      return this;
    }

    private long inventoryValue_ ;
    /**
     * <code>int64 InventoryValue = 6;</code>
     */
    public long getInventoryValue() {
      return inventoryValue_;
    }
    /**
     * <code>int64 InventoryValue = 6;</code>
     */
    public Builder setInventoryValue(long value) {
      
      inventoryValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 InventoryValue = 6;</code>
     */
    public Builder clearInventoryValue() {
      
      inventoryValue_ = 0L;
      onChanged();
      return this;
    }

    private long reOrderValue_ ;
    /**
     * <code>int64 ReOrderValue = 7;</code>
     */
    public long getReOrderValue() {
      return reOrderValue_;
    }
    /**
     * <code>int64 ReOrderValue = 7;</code>
     */
    public Builder setReOrderValue(long value) {
      
      reOrderValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ReOrderValue = 7;</code>
     */
    public Builder clearReOrderValue() {
      
      reOrderValue_ = 0L;
      onChanged();
      return this;
    }

    private long reOrderTime_ ;
    /**
     * <code>int64 ReOrderTime = 8;</code>
     */
    public long getReOrderTime() {
      return reOrderTime_;
    }
    /**
     * <code>int64 ReOrderTime = 8;</code>
     */
    public Builder setReOrderTime(long value) {
      
      reOrderTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ReOrderTime = 8;</code>
     */
    public Builder clearReOrderTime() {
      
      reOrderTime_ = 0L;
      onChanged();
      return this;
    }

    private long quantityInReorder_ ;
    /**
     * <code>int64 QuantityInReorder = 9;</code>
     */
    public long getQuantityInReorder() {
      return quantityInReorder_;
    }
    /**
     * <code>int64 QuantityInReorder = 9;</code>
     */
    public Builder setQuantityInReorder(long value) {
      
      quantityInReorder_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 QuantityInReorder = 9;</code>
     */
    public Builder clearQuantityInReorder() {
      
      quantityInReorder_ = 0L;
      onChanged();
      return this;
    }

    private boolean disContinued_ ;
    /**
     * <code>bool DisContinued = 10;</code>
     */
    public boolean getDisContinued() {
      return disContinued_;
    }
    /**
     * <code>bool DisContinued = 10;</code>
     */
    public Builder setDisContinued(boolean value) {
      
      disContinued_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool DisContinued = 10;</code>
     */
    public Builder clearDisContinued() {
      
      disContinued_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:inventory.InventoryReply)
  }

  // @@protoc_insertion_point(class_scope:inventory.InventoryReply)
  private static final example.myapp.inventory.grpc.InventoryReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new example.myapp.inventory.grpc.InventoryReply();
  }

  public static example.myapp.inventory.grpc.InventoryReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InventoryReply>
      PARSER = new com.google.protobuf.AbstractParser<InventoryReply>() {
    @java.lang.Override
    public InventoryReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InventoryReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InventoryReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InventoryReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public example.myapp.inventory.grpc.InventoryReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
