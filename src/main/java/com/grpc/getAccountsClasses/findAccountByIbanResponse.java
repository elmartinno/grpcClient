// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package com.grpc.getAccountsClasses;

/**
 * Protobuf type {@code com.grpc.getAccountsClasses.findAccountByIbanResponse}
 */
public  final class findAccountByIbanResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.grpc.getAccountsClasses.findAccountByIbanResponse)
    findAccountByIbanResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use findAccountByIbanResponse.newBuilder() to construct.
  private findAccountByIbanResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private findAccountByIbanResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private findAccountByIbanResponse(
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
            com.grpc.getAccountsClasses.AccountGrpc.Builder subBuilder = null;
            if (account_ != null) {
              subBuilder = account_.toBuilder();
            }
            account_ = input.readMessage(com.grpc.getAccountsClasses.AccountGrpc.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(account_);
              account_ = subBuilder.buildPartial();
            }

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
    return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_findAccountByIbanResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_findAccountByIbanResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.getAccountsClasses.findAccountByIbanResponse.class, com.grpc.getAccountsClasses.findAccountByIbanResponse.Builder.class);
  }

  public static final int ACCOUNT_FIELD_NUMBER = 1;
  private com.grpc.getAccountsClasses.AccountGrpc account_;
  /**
   * <code>.com.grpc.getAccountsClasses.AccountGrpc account = 1;</code>
   */
  public boolean hasAccount() {
    return account_ != null;
  }
  /**
   * <code>.com.grpc.getAccountsClasses.AccountGrpc account = 1;</code>
   */
  public com.grpc.getAccountsClasses.AccountGrpc getAccount() {
    return account_ == null ? com.grpc.getAccountsClasses.AccountGrpc.getDefaultInstance() : account_;
  }
  /**
   * <code>.com.grpc.getAccountsClasses.AccountGrpc account = 1;</code>
   */
  public com.grpc.getAccountsClasses.AccountGrpcOrBuilder getAccountOrBuilder() {
    return getAccount();
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
    if (account_ != null) {
      output.writeMessage(1, getAccount());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (account_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAccount());
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
    if (!(obj instanceof com.grpc.getAccountsClasses.findAccountByIbanResponse)) {
      return super.equals(obj);
    }
    com.grpc.getAccountsClasses.findAccountByIbanResponse other = (com.grpc.getAccountsClasses.findAccountByIbanResponse) obj;

    boolean result = true;
    result = result && (hasAccount() == other.hasAccount());
    if (hasAccount()) {
      result = result && getAccount()
          .equals(other.getAccount());
    }
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
    if (hasAccount()) {
      hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAccount().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.getAccountsClasses.findAccountByIbanResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.getAccountsClasses.findAccountByIbanResponse parseFrom(
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
  public static Builder newBuilder(com.grpc.getAccountsClasses.findAccountByIbanResponse prototype) {
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
   * Protobuf type {@code com.grpc.getAccountsClasses.findAccountByIbanResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.grpc.getAccountsClasses.findAccountByIbanResponse)
      com.grpc.getAccountsClasses.findAccountByIbanResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_findAccountByIbanResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_findAccountByIbanResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.getAccountsClasses.findAccountByIbanResponse.class, com.grpc.getAccountsClasses.findAccountByIbanResponse.Builder.class);
    }

    // Construct using com.grpc.getAccountsClasses.findAccountByIbanResponse.newBuilder()
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
      if (accountBuilder_ == null) {
        account_ = null;
      } else {
        account_ = null;
        accountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.getAccountsClasses.Test.internal_static_com_grpc_getAccountsClasses_findAccountByIbanResponse_descriptor;
    }

    @java.lang.Override
    public com.grpc.getAccountsClasses.findAccountByIbanResponse getDefaultInstanceForType() {
      return com.grpc.getAccountsClasses.findAccountByIbanResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.getAccountsClasses.findAccountByIbanResponse build() {
      com.grpc.getAccountsClasses.findAccountByIbanResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.getAccountsClasses.findAccountByIbanResponse buildPartial() {
      com.grpc.getAccountsClasses.findAccountByIbanResponse result = new com.grpc.getAccountsClasses.findAccountByIbanResponse(this);
      if (accountBuilder_ == null) {
        result.account_ = account_;
      } else {
        result.account_ = accountBuilder_.build();
      }
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
      if (other instanceof com.grpc.getAccountsClasses.findAccountByIbanResponse) {
        return mergeFrom((com.grpc.getAccountsClasses.findAccountByIbanResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.getAccountsClasses.findAccountByIbanResponse other) {
      if (other == com.grpc.getAccountsClasses.findAccountByIbanResponse.getDefaultInstance()) return this;
      if (other.hasAccount()) {
        mergeAccount(other.getAccount());
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
      com.grpc.getAccountsClasses.findAccountByIbanResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.getAccountsClasses.findAccountByIbanResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.grpc.getAccountsClasses.AccountGrpc account_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.getAccountsClasses.AccountGrpc, com.grpc.getAccountsClasses.AccountGrpc.Builder, com.grpc.getAccountsClasses.AccountGrpcOrBuilder> accountBuilder_;
    /**
     * <code>.com.grpc.getAccountsClasses.AccountGrpc account = 1;</code>
     */
    public boolean hasAccount() {
      return accountBuilder_ != null || account_ != null;
    }
    /**
     * <code>.com.grpc.getAccountsClasses.AccountGrpc account = 1;</code>
     */
    public com.grpc.getAccountsClasses.AccountGrpc getAccount() {
      if (accountBuilder_ == null) {
        return account_ == null ? com.grpc.getAccountsClasses.AccountGrpc.getDefaultInstance() : account_;
      } else {
        return accountBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.grpc.getAccountsClasses.AccountGrpc account = 1;</code>
     */
    public Builder setAccount(com.grpc.getAccountsClasses.AccountGrpc value) {
      if (accountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        account_ = value;
        onChanged();
      } else {
        accountBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.grpc.getAccountsClasses.AccountGrpc account = 1;</code>
     */
    public Builder setAccount(
        com.grpc.getAccountsClasses.AccountGrpc.Builder builderForValue) {
      if (accountBuilder_ == null) {
        account_ = builderForValue.build();
        onChanged();
      } else {
        accountBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.grpc.getAccountsClasses.AccountGrpc account = 1;</code>
     */
    public Builder mergeAccount(com.grpc.getAccountsClasses.AccountGrpc value) {
      if (accountBuilder_ == null) {
        if (account_ != null) {
          account_ =
            com.grpc.getAccountsClasses.AccountGrpc.newBuilder(account_).mergeFrom(value).buildPartial();
        } else {
          account_ = value;
        }
        onChanged();
      } else {
        accountBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.grpc.getAccountsClasses.AccountGrpc account = 1;</code>
     */
    public Builder clearAccount() {
      if (accountBuilder_ == null) {
        account_ = null;
        onChanged();
      } else {
        account_ = null;
        accountBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.grpc.getAccountsClasses.AccountGrpc account = 1;</code>
     */
    public com.grpc.getAccountsClasses.AccountGrpc.Builder getAccountBuilder() {
      
      onChanged();
      return getAccountFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.grpc.getAccountsClasses.AccountGrpc account = 1;</code>
     */
    public com.grpc.getAccountsClasses.AccountGrpcOrBuilder getAccountOrBuilder() {
      if (accountBuilder_ != null) {
        return accountBuilder_.getMessageOrBuilder();
      } else {
        return account_ == null ?
            com.grpc.getAccountsClasses.AccountGrpc.getDefaultInstance() : account_;
      }
    }
    /**
     * <code>.com.grpc.getAccountsClasses.AccountGrpc account = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.getAccountsClasses.AccountGrpc, com.grpc.getAccountsClasses.AccountGrpc.Builder, com.grpc.getAccountsClasses.AccountGrpcOrBuilder> 
        getAccountFieldBuilder() {
      if (accountBuilder_ == null) {
        accountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.grpc.getAccountsClasses.AccountGrpc, com.grpc.getAccountsClasses.AccountGrpc.Builder, com.grpc.getAccountsClasses.AccountGrpcOrBuilder>(
                getAccount(),
                getParentForChildren(),
                isClean());
        account_ = null;
      }
      return accountBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.grpc.getAccountsClasses.findAccountByIbanResponse)
  }

  // @@protoc_insertion_point(class_scope:com.grpc.getAccountsClasses.findAccountByIbanResponse)
  private static final com.grpc.getAccountsClasses.findAccountByIbanResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.getAccountsClasses.findAccountByIbanResponse();
  }

  public static com.grpc.getAccountsClasses.findAccountByIbanResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<findAccountByIbanResponse>
      PARSER = new com.google.protobuf.AbstractParser<findAccountByIbanResponse>() {
    @java.lang.Override
    public findAccountByIbanResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new findAccountByIbanResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<findAccountByIbanResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<findAccountByIbanResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.getAccountsClasses.findAccountByIbanResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

