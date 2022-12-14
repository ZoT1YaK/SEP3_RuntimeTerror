// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf.proto

package org.dataaccess.protobuf;

/**
 * Protobuf type {@code OrderItems}
 */
public final class OrderItems extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OrderItems)
    OrderItemsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderItems.newBuilder() to construct.
  private OrderItems(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderItems() {
    orderItems_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrderItems();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderItems(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              orderItems_ = new java.util.ArrayList<org.dataaccess.protobuf.OrderItem>();
              mutable_bitField0_ |= 0x00000001;
            }
            orderItems_.add(
                input.readMessage(org.dataaccess.protobuf.OrderItem.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        orderItems_ = java.util.Collections.unmodifiableList(orderItems_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.dataaccess.protobuf.Protobuf.internal_static_OrderItems_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.dataaccess.protobuf.Protobuf.internal_static_OrderItems_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.dataaccess.protobuf.OrderItems.class, org.dataaccess.protobuf.OrderItems.Builder.class);
  }

  public static final int ORDERITEMS_FIELD_NUMBER = 1;
  private java.util.List<org.dataaccess.protobuf.OrderItem> orderItems_;
  /**
   * <code>repeated .OrderItem orderItems = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.dataaccess.protobuf.OrderItem> getOrderItemsList() {
    return orderItems_;
  }
  /**
   * <code>repeated .OrderItem orderItems = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.dataaccess.protobuf.OrderItemOrBuilder> 
      getOrderItemsOrBuilderList() {
    return orderItems_;
  }
  /**
   * <code>repeated .OrderItem orderItems = 1;</code>
   */
  @java.lang.Override
  public int getOrderItemsCount() {
    return orderItems_.size();
  }
  /**
   * <code>repeated .OrderItem orderItems = 1;</code>
   */
  @java.lang.Override
  public org.dataaccess.protobuf.OrderItem getOrderItems(int index) {
    return orderItems_.get(index);
  }
  /**
   * <code>repeated .OrderItem orderItems = 1;</code>
   */
  @java.lang.Override
  public org.dataaccess.protobuf.OrderItemOrBuilder getOrderItemsOrBuilder(
      int index) {
    return orderItems_.get(index);
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
    for (int i = 0; i < orderItems_.size(); i++) {
      output.writeMessage(1, orderItems_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < orderItems_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, orderItems_.get(i));
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
    if (!(obj instanceof org.dataaccess.protobuf.OrderItems)) {
      return super.equals(obj);
    }
    org.dataaccess.protobuf.OrderItems other = (org.dataaccess.protobuf.OrderItems) obj;

    if (!getOrderItemsList()
        .equals(other.getOrderItemsList())) return false;
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
    if (getOrderItemsCount() > 0) {
      hash = (37 * hash) + ORDERITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getOrderItemsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.dataaccess.protobuf.OrderItems parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.dataaccess.protobuf.OrderItems parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.dataaccess.protobuf.OrderItems parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.dataaccess.protobuf.OrderItems parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.dataaccess.protobuf.OrderItems parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.dataaccess.protobuf.OrderItems parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.dataaccess.protobuf.OrderItems parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.dataaccess.protobuf.OrderItems parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.dataaccess.protobuf.OrderItems parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.dataaccess.protobuf.OrderItems parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.dataaccess.protobuf.OrderItems parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.dataaccess.protobuf.OrderItems parseFrom(
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
  public static Builder newBuilder(org.dataaccess.protobuf.OrderItems prototype) {
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
   * Protobuf type {@code OrderItems}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OrderItems)
      org.dataaccess.protobuf.OrderItemsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.dataaccess.protobuf.Protobuf.internal_static_OrderItems_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.dataaccess.protobuf.Protobuf.internal_static_OrderItems_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.dataaccess.protobuf.OrderItems.class, org.dataaccess.protobuf.OrderItems.Builder.class);
    }

    // Construct using org.dataaccess.protobuf.OrderItems.newBuilder()
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
        getOrderItemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (orderItemsBuilder_ == null) {
        orderItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        orderItemsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.dataaccess.protobuf.Protobuf.internal_static_OrderItems_descriptor;
    }

    @java.lang.Override
    public org.dataaccess.protobuf.OrderItems getDefaultInstanceForType() {
      return org.dataaccess.protobuf.OrderItems.getDefaultInstance();
    }

    @java.lang.Override
    public org.dataaccess.protobuf.OrderItems build() {
      org.dataaccess.protobuf.OrderItems result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.dataaccess.protobuf.OrderItems buildPartial() {
      org.dataaccess.protobuf.OrderItems result = new org.dataaccess.protobuf.OrderItems(this);
      int from_bitField0_ = bitField0_;
      if (orderItemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          orderItems_ = java.util.Collections.unmodifiableList(orderItems_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.orderItems_ = orderItems_;
      } else {
        result.orderItems_ = orderItemsBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.dataaccess.protobuf.OrderItems) {
        return mergeFrom((org.dataaccess.protobuf.OrderItems)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.dataaccess.protobuf.OrderItems other) {
      if (other == org.dataaccess.protobuf.OrderItems.getDefaultInstance()) return this;
      if (orderItemsBuilder_ == null) {
        if (!other.orderItems_.isEmpty()) {
          if (orderItems_.isEmpty()) {
            orderItems_ = other.orderItems_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOrderItemsIsMutable();
            orderItems_.addAll(other.orderItems_);
          }
          onChanged();
        }
      } else {
        if (!other.orderItems_.isEmpty()) {
          if (orderItemsBuilder_.isEmpty()) {
            orderItemsBuilder_.dispose();
            orderItemsBuilder_ = null;
            orderItems_ = other.orderItems_;
            bitField0_ = (bitField0_ & ~0x00000001);
            orderItemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOrderItemsFieldBuilder() : null;
          } else {
            orderItemsBuilder_.addAllMessages(other.orderItems_);
          }
        }
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
      org.dataaccess.protobuf.OrderItems parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.dataaccess.protobuf.OrderItems) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.dataaccess.protobuf.OrderItem> orderItems_ =
      java.util.Collections.emptyList();
    private void ensureOrderItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        orderItems_ = new java.util.ArrayList<org.dataaccess.protobuf.OrderItem>(orderItems_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.dataaccess.protobuf.OrderItem, org.dataaccess.protobuf.OrderItem.Builder, org.dataaccess.protobuf.OrderItemOrBuilder> orderItemsBuilder_;

    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public java.util.List<org.dataaccess.protobuf.OrderItem> getOrderItemsList() {
      if (orderItemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(orderItems_);
      } else {
        return orderItemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public int getOrderItemsCount() {
      if (orderItemsBuilder_ == null) {
        return orderItems_.size();
      } else {
        return orderItemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public org.dataaccess.protobuf.OrderItem getOrderItems(int index) {
      if (orderItemsBuilder_ == null) {
        return orderItems_.get(index);
      } else {
        return orderItemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public Builder setOrderItems(
        int index, org.dataaccess.protobuf.OrderItem value) {
      if (orderItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderItemsIsMutable();
        orderItems_.set(index, value);
        onChanged();
      } else {
        orderItemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public Builder setOrderItems(
        int index, org.dataaccess.protobuf.OrderItem.Builder builderForValue) {
      if (orderItemsBuilder_ == null) {
        ensureOrderItemsIsMutable();
        orderItems_.set(index, builderForValue.build());
        onChanged();
      } else {
        orderItemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public Builder addOrderItems(org.dataaccess.protobuf.OrderItem value) {
      if (orderItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderItemsIsMutable();
        orderItems_.add(value);
        onChanged();
      } else {
        orderItemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public Builder addOrderItems(
        int index, org.dataaccess.protobuf.OrderItem value) {
      if (orderItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderItemsIsMutable();
        orderItems_.add(index, value);
        onChanged();
      } else {
        orderItemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public Builder addOrderItems(
        org.dataaccess.protobuf.OrderItem.Builder builderForValue) {
      if (orderItemsBuilder_ == null) {
        ensureOrderItemsIsMutable();
        orderItems_.add(builderForValue.build());
        onChanged();
      } else {
        orderItemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public Builder addOrderItems(
        int index, org.dataaccess.protobuf.OrderItem.Builder builderForValue) {
      if (orderItemsBuilder_ == null) {
        ensureOrderItemsIsMutable();
        orderItems_.add(index, builderForValue.build());
        onChanged();
      } else {
        orderItemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public Builder addAllOrderItems(
        java.lang.Iterable<? extends org.dataaccess.protobuf.OrderItem> values) {
      if (orderItemsBuilder_ == null) {
        ensureOrderItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, orderItems_);
        onChanged();
      } else {
        orderItemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public Builder clearOrderItems() {
      if (orderItemsBuilder_ == null) {
        orderItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        orderItemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public Builder removeOrderItems(int index) {
      if (orderItemsBuilder_ == null) {
        ensureOrderItemsIsMutable();
        orderItems_.remove(index);
        onChanged();
      } else {
        orderItemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public org.dataaccess.protobuf.OrderItem.Builder getOrderItemsBuilder(
        int index) {
      return getOrderItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public org.dataaccess.protobuf.OrderItemOrBuilder getOrderItemsOrBuilder(
        int index) {
      if (orderItemsBuilder_ == null) {
        return orderItems_.get(index);  } else {
        return orderItemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public java.util.List<? extends org.dataaccess.protobuf.OrderItemOrBuilder> 
         getOrderItemsOrBuilderList() {
      if (orderItemsBuilder_ != null) {
        return orderItemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(orderItems_);
      }
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public org.dataaccess.protobuf.OrderItem.Builder addOrderItemsBuilder() {
      return getOrderItemsFieldBuilder().addBuilder(
          org.dataaccess.protobuf.OrderItem.getDefaultInstance());
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public org.dataaccess.protobuf.OrderItem.Builder addOrderItemsBuilder(
        int index) {
      return getOrderItemsFieldBuilder().addBuilder(
          index, org.dataaccess.protobuf.OrderItem.getDefaultInstance());
    }
    /**
     * <code>repeated .OrderItem orderItems = 1;</code>
     */
    public java.util.List<org.dataaccess.protobuf.OrderItem.Builder> 
         getOrderItemsBuilderList() {
      return getOrderItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.dataaccess.protobuf.OrderItem, org.dataaccess.protobuf.OrderItem.Builder, org.dataaccess.protobuf.OrderItemOrBuilder> 
        getOrderItemsFieldBuilder() {
      if (orderItemsBuilder_ == null) {
        orderItemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.dataaccess.protobuf.OrderItem, org.dataaccess.protobuf.OrderItem.Builder, org.dataaccess.protobuf.OrderItemOrBuilder>(
                orderItems_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        orderItems_ = null;
      }
      return orderItemsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:OrderItems)
  }

  // @@protoc_insertion_point(class_scope:OrderItems)
  private static final org.dataaccess.protobuf.OrderItems DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.dataaccess.protobuf.OrderItems();
  }

  public static org.dataaccess.protobuf.OrderItems getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderItems>
      PARSER = new com.google.protobuf.AbstractParser<OrderItems>() {
    @java.lang.Override
    public OrderItems parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderItems(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderItems> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderItems> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.dataaccess.protobuf.OrderItems getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

