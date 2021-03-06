// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: body/BppBiz.proto

package com.qlcd.qltt.body;

public final class BppBiz {
  private BppBiz() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface _page_reqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.qlcd.qltt.body.BppBiz._page_req)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 reqstart = 1;</code>
     */
    int getReqstart();

    /**
     * <code>int32 reqnum = 2;</code>
     */
    int getReqnum();
  }
  /**
   * Protobuf type {@code com.qlcd.qltt.body.BppBiz._page_req}
   */
  public  static final class _page_req extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.qlcd.qltt.body.BppBiz._page_req)
      _page_reqOrBuilder {
    // Use _page_req.newBuilder() to construct.
    private _page_req(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private _page_req() {
      reqstart_ = 0;
      reqnum_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private _page_req(
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
            case 8: {

              reqstart_ = input.readInt32();
              break;
            }
            case 16: {

              reqnum_ = input.readInt32();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.qlcd.qltt.body.BppBiz.internal_static_com_qlcd_qltt_body_BppBiz__page_req_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.qlcd.qltt.body.BppBiz.internal_static_com_qlcd_qltt_body_BppBiz__page_req_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.qlcd.qltt.body.BppBiz._page_req.class, com.qlcd.qltt.body.BppBiz._page_req.Builder.class);
    }

    public static final int REQSTART_FIELD_NUMBER = 1;
    private int reqstart_;
    /**
     * <code>int32 reqstart = 1;</code>
     */
    public int getReqstart() {
      return reqstart_;
    }

    public static final int REQNUM_FIELD_NUMBER = 2;
    private int reqnum_;
    /**
     * <code>int32 reqnum = 2;</code>
     */
    public int getReqnum() {
      return reqnum_;
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
      if (reqstart_ != 0) {
        output.writeInt32(1, reqstart_);
      }
      if (reqnum_ != 0) {
        output.writeInt32(2, reqnum_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reqstart_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, reqstart_);
      }
      if (reqnum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, reqnum_);
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
      if (!(obj instanceof com.qlcd.qltt.body.BppBiz._page_req)) {
        return super.equals(obj);
      }
      com.qlcd.qltt.body.BppBiz._page_req other = (com.qlcd.qltt.body.BppBiz._page_req) obj;

      boolean result = true;
      result = result && (getReqstart()
          == other.getReqstart());
      result = result && (getReqnum()
          == other.getReqnum());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REQSTART_FIELD_NUMBER;
      hash = (53 * hash) + getReqstart();
      hash = (37 * hash) + REQNUM_FIELD_NUMBER;
      hash = (53 * hash) + getReqnum();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.qlcd.qltt.body.BppBiz._page_req parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.qlcd.qltt.body.BppBiz._page_req parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.qlcd.qltt.body.BppBiz._page_req parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.qlcd.qltt.body.BppBiz._page_req parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.qlcd.qltt.body.BppBiz._page_req parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.qlcd.qltt.body.BppBiz._page_req parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.qlcd.qltt.body.BppBiz._page_req parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.qlcd.qltt.body.BppBiz._page_req parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.qlcd.qltt.body.BppBiz._page_req parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.qlcd.qltt.body.BppBiz._page_req parseFrom(
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
    public static Builder newBuilder(com.qlcd.qltt.body.BppBiz._page_req prototype) {
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
     * Protobuf type {@code com.qlcd.qltt.body.BppBiz._page_req}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.qlcd.qltt.body.BppBiz._page_req)
        com.qlcd.qltt.body.BppBiz._page_reqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.qlcd.qltt.body.BppBiz.internal_static_com_qlcd_qltt_body_BppBiz__page_req_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.qlcd.qltt.body.BppBiz.internal_static_com_qlcd_qltt_body_BppBiz__page_req_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.qlcd.qltt.body.BppBiz._page_req.class, com.qlcd.qltt.body.BppBiz._page_req.Builder.class);
      }

      // Construct using com.qlcd.qltt.body.BppBiz._page_req.newBuilder()
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
      public Builder clear() {
        super.clear();
        reqstart_ = 0;

        reqnum_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.qlcd.qltt.body.BppBiz.internal_static_com_qlcd_qltt_body_BppBiz__page_req_descriptor;
      }

      public com.qlcd.qltt.body.BppBiz._page_req getDefaultInstanceForType() {
        return com.qlcd.qltt.body.BppBiz._page_req.getDefaultInstance();
      }

      public com.qlcd.qltt.body.BppBiz._page_req build() {
        com.qlcd.qltt.body.BppBiz._page_req result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.qlcd.qltt.body.BppBiz._page_req buildPartial() {
        com.qlcd.qltt.body.BppBiz._page_req result = new com.qlcd.qltt.body.BppBiz._page_req(this);
        result.reqstart_ = reqstart_;
        result.reqnum_ = reqnum_;
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
        if (other instanceof com.qlcd.qltt.body.BppBiz._page_req) {
          return mergeFrom((com.qlcd.qltt.body.BppBiz._page_req)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.qlcd.qltt.body.BppBiz._page_req other) {
        if (other == com.qlcd.qltt.body.BppBiz._page_req.getDefaultInstance()) return this;
        if (other.getReqstart() != 0) {
          setReqstart(other.getReqstart());
        }
        if (other.getReqnum() != 0) {
          setReqnum(other.getReqnum());
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
        com.qlcd.qltt.body.BppBiz._page_req parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.qlcd.qltt.body.BppBiz._page_req) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int reqstart_ ;
      /**
       * <code>int32 reqstart = 1;</code>
       */
      public int getReqstart() {
        return reqstart_;
      }
      /**
       * <code>int32 reqstart = 1;</code>
       */
      public Builder setReqstart(int value) {
        
        reqstart_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 reqstart = 1;</code>
       */
      public Builder clearReqstart() {
        
        reqstart_ = 0;
        onChanged();
        return this;
      }

      private int reqnum_ ;
      /**
       * <code>int32 reqnum = 2;</code>
       */
      public int getReqnum() {
        return reqnum_;
      }
      /**
       * <code>int32 reqnum = 2;</code>
       */
      public Builder setReqnum(int value) {
        
        reqnum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 reqnum = 2;</code>
       */
      public Builder clearReqnum() {
        
        reqnum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:com.qlcd.qltt.body.BppBiz._page_req)
    }

    // @@protoc_insertion_point(class_scope:com.qlcd.qltt.body.BppBiz._page_req)
    private static final com.qlcd.qltt.body.BppBiz._page_req DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.qlcd.qltt.body.BppBiz._page_req();
    }

    public static com.qlcd.qltt.body.BppBiz._page_req getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<_page_req>
        PARSER = new com.google.protobuf.AbstractParser<_page_req>() {
      public _page_req parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new _page_req(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<_page_req> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<_page_req> getParserForType() {
      return PARSER;
    }

    public com.qlcd.qltt.body.BppBiz._page_req getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface _page_rspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.qlcd.qltt.body.BppBiz._page_rsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 rspnum = 1;</code>
     */
    int getRspnum();
  }
  /**
   * Protobuf type {@code com.qlcd.qltt.body.BppBiz._page_rsp}
   */
  public  static final class _page_rsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.qlcd.qltt.body.BppBiz._page_rsp)
      _page_rspOrBuilder {
    // Use _page_rsp.newBuilder() to construct.
    private _page_rsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private _page_rsp() {
      rspnum_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private _page_rsp(
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
            case 8: {

              rspnum_ = input.readInt32();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.qlcd.qltt.body.BppBiz.internal_static_com_qlcd_qltt_body_BppBiz__page_rsp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.qlcd.qltt.body.BppBiz.internal_static_com_qlcd_qltt_body_BppBiz__page_rsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.qlcd.qltt.body.BppBiz._page_rsp.class, com.qlcd.qltt.body.BppBiz._page_rsp.Builder.class);
    }

    public static final int RSPNUM_FIELD_NUMBER = 1;
    private int rspnum_;
    /**
     * <code>int32 rspnum = 1;</code>
     */
    public int getRspnum() {
      return rspnum_;
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
      if (rspnum_ != 0) {
        output.writeInt32(1, rspnum_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rspnum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, rspnum_);
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
      if (!(obj instanceof com.qlcd.qltt.body.BppBiz._page_rsp)) {
        return super.equals(obj);
      }
      com.qlcd.qltt.body.BppBiz._page_rsp other = (com.qlcd.qltt.body.BppBiz._page_rsp) obj;

      boolean result = true;
      result = result && (getRspnum()
          == other.getRspnum());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RSPNUM_FIELD_NUMBER;
      hash = (53 * hash) + getRspnum();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.qlcd.qltt.body.BppBiz._page_rsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.qlcd.qltt.body.BppBiz._page_rsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.qlcd.qltt.body.BppBiz._page_rsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.qlcd.qltt.body.BppBiz._page_rsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.qlcd.qltt.body.BppBiz._page_rsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.qlcd.qltt.body.BppBiz._page_rsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.qlcd.qltt.body.BppBiz._page_rsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.qlcd.qltt.body.BppBiz._page_rsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.qlcd.qltt.body.BppBiz._page_rsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.qlcd.qltt.body.BppBiz._page_rsp parseFrom(
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
    public static Builder newBuilder(com.qlcd.qltt.body.BppBiz._page_rsp prototype) {
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
     * Protobuf type {@code com.qlcd.qltt.body.BppBiz._page_rsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.qlcd.qltt.body.BppBiz._page_rsp)
        com.qlcd.qltt.body.BppBiz._page_rspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.qlcd.qltt.body.BppBiz.internal_static_com_qlcd_qltt_body_BppBiz__page_rsp_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.qlcd.qltt.body.BppBiz.internal_static_com_qlcd_qltt_body_BppBiz__page_rsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.qlcd.qltt.body.BppBiz._page_rsp.class, com.qlcd.qltt.body.BppBiz._page_rsp.Builder.class);
      }

      // Construct using com.qlcd.qltt.body.BppBiz._page_rsp.newBuilder()
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
      public Builder clear() {
        super.clear();
        rspnum_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.qlcd.qltt.body.BppBiz.internal_static_com_qlcd_qltt_body_BppBiz__page_rsp_descriptor;
      }

      public com.qlcd.qltt.body.BppBiz._page_rsp getDefaultInstanceForType() {
        return com.qlcd.qltt.body.BppBiz._page_rsp.getDefaultInstance();
      }

      public com.qlcd.qltt.body.BppBiz._page_rsp build() {
        com.qlcd.qltt.body.BppBiz._page_rsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.qlcd.qltt.body.BppBiz._page_rsp buildPartial() {
        com.qlcd.qltt.body.BppBiz._page_rsp result = new com.qlcd.qltt.body.BppBiz._page_rsp(this);
        result.rspnum_ = rspnum_;
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
        if (other instanceof com.qlcd.qltt.body.BppBiz._page_rsp) {
          return mergeFrom((com.qlcd.qltt.body.BppBiz._page_rsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.qlcd.qltt.body.BppBiz._page_rsp other) {
        if (other == com.qlcd.qltt.body.BppBiz._page_rsp.getDefaultInstance()) return this;
        if (other.getRspnum() != 0) {
          setRspnum(other.getRspnum());
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
        com.qlcd.qltt.body.BppBiz._page_rsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.qlcd.qltt.body.BppBiz._page_rsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int rspnum_ ;
      /**
       * <code>int32 rspnum = 1;</code>
       */
      public int getRspnum() {
        return rspnum_;
      }
      /**
       * <code>int32 rspnum = 1;</code>
       */
      public Builder setRspnum(int value) {
        
        rspnum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 rspnum = 1;</code>
       */
      public Builder clearRspnum() {
        
        rspnum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:com.qlcd.qltt.body.BppBiz._page_rsp)
    }

    // @@protoc_insertion_point(class_scope:com.qlcd.qltt.body.BppBiz._page_rsp)
    private static final com.qlcd.qltt.body.BppBiz._page_rsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.qlcd.qltt.body.BppBiz._page_rsp();
    }

    public static com.qlcd.qltt.body.BppBiz._page_rsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<_page_rsp>
        PARSER = new com.google.protobuf.AbstractParser<_page_rsp>() {
      public _page_rsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new _page_rsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<_page_rsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<_page_rsp> getParserForType() {
      return PARSER;
    }

    public com.qlcd.qltt.body.BppBiz._page_rsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_qlcd_qltt_body_BppBiz__page_req_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_qlcd_qltt_body_BppBiz__page_req_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_qlcd_qltt_body_BppBiz__page_rsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_qlcd_qltt_body_BppBiz__page_rsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021body/BppBiz.proto\022\031com.qlcd.qltt.body." +
      "BppBiz\"-\n\t_page_req\022\020\n\010reqstart\030\001 \001(\005\022\016\n" +
      "\006reqnum\030\002 \001(\005\"\033\n\t_page_rsp\022\016\n\006rspnum\030\001 \001" +
      "(\005B\024\n\022com.qlcd.qltt.bodyb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_qlcd_qltt_body_BppBiz__page_req_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_qlcd_qltt_body_BppBiz__page_req_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_qlcd_qltt_body_BppBiz__page_req_descriptor,
        new java.lang.String[] { "Reqstart", "Reqnum", });
    internal_static_com_qlcd_qltt_body_BppBiz__page_rsp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_qlcd_qltt_body_BppBiz__page_rsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_qlcd_qltt_body_BppBiz__page_rsp_descriptor,
        new java.lang.String[] { "Rspnum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
