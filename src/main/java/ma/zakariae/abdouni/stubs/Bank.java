package ma.zakariae.abdouni.stubs;

public final class Bank {
  private Bank() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ConvertCurrencyRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ConvertCurrencyRequest)
      com.google.protobuf.MessageOrBuilder {

    String getFrom();

    com.google.protobuf.ByteString
        getFromBytes();

    String getTo();

    com.google.protobuf.ByteString
        getToBytes();

    float getAmount();
  }

  public  static final class ConvertCurrencyRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ConvertCurrencyRequest)
      ConvertCurrencyRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ConvertCurrencyRequest.newBuilder() to construct.
    private ConvertCurrencyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ConvertCurrencyRequest() {
      from_ = "";
      to_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new ConvertCurrencyRequest();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ConvertCurrencyRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              String s = input.readStringRequireUtf8();

              from_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              to_ = s;
              break;
            }
            case 29: {

              amount_ = input.readFloat();
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
      return Bank.internal_static_ConvertCurrencyRequest_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Bank.internal_static_ConvertCurrencyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ConvertCurrencyRequest.class, Builder.class);
    }

    public static final int FROM_FIELD_NUMBER = 1;
    private volatile Object from_;
    /**
     * <code>string from = 1;</code>
     * @return The from.
     */
    public String getFrom() {
      Object ref = from_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        from_ = s;
        return s;
      }
    }
    /**
     * <code>string from = 1;</code>
     * @return The bytes for from.
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TO_FIELD_NUMBER = 2;
    private volatile Object to_;
    /**
     * <code>string to = 2;</code>
     * @return The to.
     */
    public String getTo() {
      Object ref = to_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        to_ = s;
        return s;
      }
    }
    /**
     * <code>string to = 2;</code>
     * @return The bytes for to.
     */
    public com.google.protobuf.ByteString
        getToBytes() {
      Object ref = to_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        to_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AMOUNT_FIELD_NUMBER = 3;
    private float amount_;
    /**
     * <code>float amount = 3;</code>
     * @return The amount.
     */
    public float getAmount() {
      return amount_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getFromBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, from_);
      }
      if (!getToBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, to_);
      }
      if (amount_ != 0F) {
        output.writeFloat(3, amount_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getFromBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, from_);
      }
      if (!getToBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, to_);
      }
      if (amount_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, amount_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ConvertCurrencyRequest)) {
        return super.equals(obj);
      }
      ConvertCurrencyRequest other = (ConvertCurrencyRequest) obj;

      if (!getFrom()
          .equals(other.getFrom())) return false;
      if (!getTo()
          .equals(other.getTo())) return false;
      if (Float.floatToIntBits(getAmount())
          != Float.floatToIntBits(
              other.getAmount())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + FROM_FIELD_NUMBER;
      hash = (53 * hash) + getFrom().hashCode();
      hash = (37 * hash) + TO_FIELD_NUMBER;
      hash = (53 * hash) + getTo().hashCode();
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + Float.floatToIntBits(
          getAmount());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ConvertCurrencyRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ConvertCurrencyRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ConvertCurrencyRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ConvertCurrencyRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ConvertCurrencyRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ConvertCurrencyRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ConvertCurrencyRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ConvertCurrencyRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ConvertCurrencyRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ConvertCurrencyRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ConvertCurrencyRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ConvertCurrencyRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ConvertCurrencyRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ConvertCurrencyRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ConvertCurrencyRequest)
        ConvertCurrencyRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Bank.internal_static_ConvertCurrencyRequest_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Bank.internal_static_ConvertCurrencyRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ConvertCurrencyRequest.class, Builder.class);
      }

      // Construct using ma.zakariae.abdouni.stubs.Bank.ConvertCurrencyRequest.newBuilder()
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
      @Override
      public Builder clear() {
        super.clear();
        from_ = "";

        to_ = "";

        amount_ = 0F;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Bank.internal_static_ConvertCurrencyRequest_descriptor;
      }

      @Override
      public ConvertCurrencyRequest getDefaultInstanceForType() {
        return ConvertCurrencyRequest.getDefaultInstance();
      }

      @Override
      public ConvertCurrencyRequest build() {
        ConvertCurrencyRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ConvertCurrencyRequest buildPartial() {
        ConvertCurrencyRequest result = new ConvertCurrencyRequest(this);
        result.from_ = from_;
        result.to_ = to_;
        result.amount_ = amount_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ConvertCurrencyRequest) {
          return mergeFrom((ConvertCurrencyRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ConvertCurrencyRequest other) {
        if (other == ConvertCurrencyRequest.getDefaultInstance()) return this;
        if (!other.getFrom().isEmpty()) {
          from_ = other.from_;
          onChanged();
        }
        if (!other.getTo().isEmpty()) {
          to_ = other.to_;
          onChanged();
        }
        if (other.getAmount() != 0F) {
          setAmount(other.getAmount());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ConvertCurrencyRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ConvertCurrencyRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object from_ = "";

      public String getFrom() {
        Object ref = from_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          from_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string from = 1;</code>
       * @return The bytes for from.
       */
      public com.google.protobuf.ByteString
          getFromBytes() {
        Object ref = from_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          from_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string from = 1;</code>
       * @param value The from to set.
       * @return This builder for chaining.
       */
      public Builder setFrom(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        from_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string from = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFrom() {
        
        from_ = getDefaultInstance().getFrom();
        onChanged();
        return this;
      }
      /**
       * <code>string from = 1;</code>
       * @param value The bytes for from to set.
       * @return This builder for chaining.
       */
      public Builder setFromBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        from_ = value;
        onChanged();
        return this;
      }

      private Object to_ = "";
      /**
       * <code>string to = 2;</code>
       * @return The to.
       */
      public String getTo() {
        Object ref = to_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          to_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string to = 2;</code>
       * @return The bytes for to.
       */
      public com.google.protobuf.ByteString
          getToBytes() {
        Object ref = to_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          to_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string to = 2;</code>
       * @param value The to to set.
       * @return This builder for chaining.
       */
      public Builder setTo(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        to_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string to = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTo() {
        
        to_ = getDefaultInstance().getTo();
        onChanged();
        return this;
      }
      /**
       * <code>string to = 2;</code>
       * @param value The bytes for to to set.
       * @return This builder for chaining.
       */
      public Builder setToBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        to_ = value;
        onChanged();
        return this;
      }

      private float amount_ ;
      /**
       * <code>float amount = 3;</code>
       * @return The amount.
       */
      public float getAmount() {
        return amount_;
      }
      /**
       * <code>float amount = 3;</code>
       * @param value The amount to set.
       * @return This builder for chaining.
       */
      public Builder setAmount(float value) {
        
        amount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float amount = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAmount() {
        
        amount_ = 0F;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ConvertCurrencyRequest)
    }

    // @@protoc_insertion_point(class_scope:ConvertCurrencyRequest)
    private static final ConvertCurrencyRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ConvertCurrencyRequest();
    }

    public static ConvertCurrencyRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ConvertCurrencyRequest>
        PARSER = new com.google.protobuf.AbstractParser<ConvertCurrencyRequest>() {
      @Override
      public ConvertCurrencyRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ConvertCurrencyRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ConvertCurrencyRequest> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ConvertCurrencyRequest> getParserForType() {
      return PARSER;
    }

    @Override
    public ConvertCurrencyRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ConvertCurrencyResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ConvertCurrencyResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string from = 1;</code>
     * @return The from.
     */
    String getFrom();
    /**
     * <code>string from = 1;</code>
     * @return The bytes for from.
     */
    com.google.protobuf.ByteString
        getFromBytes();

    /**
     * <code>string to = 2;</code>
     * @return The to.
     */
    String getTo();
    /**
     * <code>string to = 2;</code>
     * @return The bytes for to.
     */
    com.google.protobuf.ByteString
        getToBytes();

    /**
     * <code>float amount = 3;</code>
     * @return The amount.
     */
    float getAmount();

    /**
     * <code>float result = 4;</code>
     * @return The result.
     */
    float getResult();
  }
  /**
   * Protobuf type {@code ConvertCurrencyResponse}
   */
  public  static final class ConvertCurrencyResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ConvertCurrencyResponse)
      ConvertCurrencyResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ConvertCurrencyResponse.newBuilder() to construct.
    private ConvertCurrencyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ConvertCurrencyResponse() {
      from_ = "";
      to_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new ConvertCurrencyResponse();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ConvertCurrencyResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 10: {
              String s = input.readStringRequireUtf8();

              from_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              to_ = s;
              break;
            }
            case 29: {

              amount_ = input.readFloat();
              break;
            }
            case 37: {

              result_ = input.readFloat();
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
      return Bank.internal_static_ConvertCurrencyResponse_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Bank.internal_static_ConvertCurrencyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ConvertCurrencyResponse.class, Builder.class);
    }

    public static final int FROM_FIELD_NUMBER = 1;
    private volatile Object from_;
    /**
     * <code>string from = 1;</code>
     * @return The from.
     */
    public String getFrom() {
      Object ref = from_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        from_ = s;
        return s;
      }
    }
    /**
     * <code>string from = 1;</code>
     * @return The bytes for from.
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TO_FIELD_NUMBER = 2;
    private volatile Object to_;
    /**
     * <code>string to = 2;</code>
     * @return The to.
     */
    public String getTo() {
      Object ref = to_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        to_ = s;
        return s;
      }
    }
    /**
     * <code>string to = 2;</code>
     * @return The bytes for to.
     */
    public com.google.protobuf.ByteString
        getToBytes() {
      Object ref = to_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        to_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AMOUNT_FIELD_NUMBER = 3;
    private float amount_;
    /**
     * <code>float amount = 3;</code>
     * @return The amount.
     */
    public float getAmount() {
      return amount_;
    }

    public static final int RESULT_FIELD_NUMBER = 4;
    private float result_;
    /**
     * <code>float result = 4;</code>
     * @return The result.
     */
    public float getResult() {
      return result_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getFromBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, from_);
      }
      if (!getToBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, to_);
      }
      if (amount_ != 0F) {
        output.writeFloat(3, amount_);
      }
      if (result_ != 0F) {
        output.writeFloat(4, result_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getFromBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, from_);
      }
      if (!getToBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, to_);
      }
      if (amount_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, amount_);
      }
      if (result_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, result_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ConvertCurrencyResponse)) {
        return super.equals(obj);
      }
      ConvertCurrencyResponse other = (ConvertCurrencyResponse) obj;

      if (!getFrom()
          .equals(other.getFrom())) return false;
      if (!getTo()
          .equals(other.getTo())) return false;
      if (Float.floatToIntBits(getAmount())
          != Float.floatToIntBits(
              other.getAmount())) return false;
      if (Float.floatToIntBits(getResult())
          != Float.floatToIntBits(
              other.getResult())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + FROM_FIELD_NUMBER;
      hash = (53 * hash) + getFrom().hashCode();
      hash = (37 * hash) + TO_FIELD_NUMBER;
      hash = (53 * hash) + getTo().hashCode();
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + Float.floatToIntBits(
          getAmount());
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + Float.floatToIntBits(
          getResult());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ConvertCurrencyResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ConvertCurrencyResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ConvertCurrencyResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ConvertCurrencyResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ConvertCurrencyResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ConvertCurrencyResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ConvertCurrencyResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ConvertCurrencyResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ConvertCurrencyResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ConvertCurrencyResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ConvertCurrencyResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ConvertCurrencyResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ConvertCurrencyResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ConvertCurrencyResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ConvertCurrencyResponse)
        ConvertCurrencyResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Bank.internal_static_ConvertCurrencyResponse_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Bank.internal_static_ConvertCurrencyResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ConvertCurrencyResponse.class, Builder.class);
      }

      // Construct using ma.zakariae.abdouni.stubs.Bank.ConvertCurrencyResponse.newBuilder()
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
      @Override
      public Builder clear() {
        super.clear();
        from_ = "";

        to_ = "";

        amount_ = 0F;

        result_ = 0F;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Bank.internal_static_ConvertCurrencyResponse_descriptor;
      }

      @Override
      public ConvertCurrencyResponse getDefaultInstanceForType() {
        return ConvertCurrencyResponse.getDefaultInstance();
      }

      @Override
      public ConvertCurrencyResponse build() {
        ConvertCurrencyResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ConvertCurrencyResponse buildPartial() {
        ConvertCurrencyResponse result = new ConvertCurrencyResponse(this);
        result.from_ = from_;
        result.to_ = to_;
        result.amount_ = amount_;
        result.result_ = result_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ConvertCurrencyResponse) {
          return mergeFrom((ConvertCurrencyResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ConvertCurrencyResponse other) {
        if (other == ConvertCurrencyResponse.getDefaultInstance()) return this;
        if (!other.getFrom().isEmpty()) {
          from_ = other.from_;
          onChanged();
        }
        if (!other.getTo().isEmpty()) {
          to_ = other.to_;
          onChanged();
        }
        if (other.getAmount() != 0F) {
          setAmount(other.getAmount());
        }
        if (other.getResult() != 0F) {
          setResult(other.getResult());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ConvertCurrencyResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ConvertCurrencyResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object from_ = "";
      /**
       * <code>string from = 1;</code>
       * @return The from.
       */
      public String getFrom() {
        Object ref = from_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          from_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string from = 1;</code>
       * @return The bytes for from.
       */
      public com.google.protobuf.ByteString
          getFromBytes() {
        Object ref = from_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          from_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string from = 1;</code>
       * @param value The from to set.
       * @return This builder for chaining.
       */
      public Builder setFrom(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        from_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string from = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFrom() {
        
        from_ = getDefaultInstance().getFrom();
        onChanged();
        return this;
      }
      /**
       * <code>string from = 1;</code>
       * @param value The bytes for from to set.
       * @return This builder for chaining.
       */
      public Builder setFromBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        from_ = value;
        onChanged();
        return this;
      }

      private Object to_ = "";
      /**
       * <code>string to = 2;</code>
       * @return The to.
       */
      public String getTo() {
        Object ref = to_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          to_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string to = 2;</code>
       * @return The bytes for to.
       */
      public com.google.protobuf.ByteString
          getToBytes() {
        Object ref = to_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          to_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string to = 2;</code>
       * @param value The to to set.
       * @return This builder for chaining.
       */
      public Builder setTo(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        to_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string to = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTo() {
        
        to_ = getDefaultInstance().getTo();
        onChanged();
        return this;
      }
      /**
       * <code>string to = 2;</code>
       * @param value The bytes for to to set.
       * @return This builder for chaining.
       */
      public Builder setToBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        to_ = value;
        onChanged();
        return this;
      }

      private float amount_ ;
      /**
       * <code>float amount = 3;</code>
       * @return The amount.
       */
      public float getAmount() {
        return amount_;
      }
      /**
       * <code>float amount = 3;</code>
       * @param value The amount to set.
       * @return This builder for chaining.
       */
      public Builder setAmount(float value) {
        
        amount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float amount = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAmount() {
        
        amount_ = 0F;
        onChanged();
        return this;
      }

      private float result_ ;
      /**
       * <code>float result = 4;</code>
       * @return The result.
       */
      public float getResult() {
        return result_;
      }
      /**
       * <code>float result = 4;</code>
       * @param value The result to set.
       * @return This builder for chaining.
       */
      public Builder setResult(float value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float result = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearResult() {
        
        result_ = 0F;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ConvertCurrencyResponse)
    }

    // @@protoc_insertion_point(class_scope:ConvertCurrencyResponse)
    private static final ConvertCurrencyResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ConvertCurrencyResponse();
    }

    public static ConvertCurrencyResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ConvertCurrencyResponse>
        PARSER = new com.google.protobuf.AbstractParser<ConvertCurrencyResponse>() {
      @Override
      public ConvertCurrencyResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ConvertCurrencyResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ConvertCurrencyResponse> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ConvertCurrencyResponse> getParserForType() {
      return PARSER;
    }

    @Override
    public ConvertCurrencyResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ConvertCurrencyRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ConvertCurrencyRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ConvertCurrencyResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ConvertCurrencyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\nbank.proto\"B\n\026ConvertCurrencyRequest\022\014" +
      "\n\004from\030\001 \001(\t\022\n\n\002to\030\002 \001(\t\022\016\n\006amount\030\003 \001(\002" +
      "\"S\n\027ConvertCurrencyResponse\022\014\n\004from\030\001 \001(" +
      "\t\022\n\n\002to\030\002 \001(\t\022\016\n\006amount\030\003 \001(\002\022\016\n\006result\030" +
      "\004 \001(\0022\262\002\n\013BankService\022<\n\007convert\022\027.Conve" +
      "rtCurrencyRequest\032\030.ConvertCurrencyRespo" +
      "nse\022H\n\021getCurrencyStream\022\027.ConvertCurren" +
      "cyRequest\032\030.ConvertCurrencyResponse0\001\022F\n" +
      "\rperformStream\022\027.ConvertCurrencyRequest\032" +
      "\030.ConvertCurrencyResponse(\0010\001\022S\n\032perform" +
      "BidirectionalStream\022\027.ConvertCurrencyReq" +
      "uest\032\030.ConvertCurrencyResponse(\0010\001B\016\n\014ac" +
      "hraf.stubsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ConvertCurrencyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ConvertCurrencyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ConvertCurrencyRequest_descriptor,
        new String[] { "From", "To", "Amount", });
    internal_static_ConvertCurrencyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ConvertCurrencyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ConvertCurrencyResponse_descriptor,
        new String[] { "From", "To", "Amount", "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
