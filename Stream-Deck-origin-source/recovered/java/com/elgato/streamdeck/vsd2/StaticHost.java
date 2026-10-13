package com.elgato.streamdeck.vsd2;

import D6.iIQ.BmWxZhjGfw;
import com.google.protobuf.A;
import com.google.protobuf.AbstractC2086a;
import com.google.protobuf.AbstractC2097h;
import com.google.protobuf.AbstractC2098i;
import com.google.protobuf.C2106q;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import com.google.protobuf.g0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class StaticHost extends GeneratedMessageLite implements StaticHostOrBuilder {
    public static final int CREATEDAT_FIELD_NUMBER = 4;
    private static final StaticHost DEFAULT_INSTANCE;
    public static final int DELETEDAT_FIELD_NUMBER = 6;
    public static final int DISPLAYNAME_FIELD_NUMBER = 2;
    public static final int ENDPOINT_FIELD_NUMBER = 3;
    private static volatile g0 PARSER = null;
    public static final int RAWID_FIELD_NUMBER = 1;
    public static final int UPDATEDAT_FIELD_NUMBER = 5;
    private int bitField0_;
    private Timestamp createdAt_;
    private Timestamp deletedAt_;
    private Timestamp updatedAt_;
    private String rawID_ = "";
    private String displayName_ = "";
    private A.j endpoint_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.StaticHost$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.f.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Builder extends GeneratedMessageLite.b implements StaticHostOrBuilder {
        public Builder addAllEndpoint(Iterable<? extends Endpoint> iterable) {
            copyOnWrite();
            ((StaticHost) this.instance).addAllEndpoint(iterable);
            return this;
        }

        public Builder addEndpoint(Endpoint endpoint) {
            copyOnWrite();
            ((StaticHost) this.instance).addEndpoint(endpoint);
            return this;
        }

        public Builder clearCreatedAt() {
            copyOnWrite();
            ((StaticHost) this.instance).clearCreatedAt();
            return this;
        }

        public Builder clearDeletedAt() {
            copyOnWrite();
            ((StaticHost) this.instance).clearDeletedAt();
            return this;
        }

        public Builder clearDisplayName() {
            copyOnWrite();
            ((StaticHost) this.instance).clearDisplayName();
            return this;
        }

        public Builder clearEndpoint() {
            copyOnWrite();
            ((StaticHost) this.instance).clearEndpoint();
            return this;
        }

        public Builder clearRawID() {
            copyOnWrite();
            ((StaticHost) this.instance).clearRawID();
            return this;
        }

        public Builder clearUpdatedAt() {
            copyOnWrite();
            ((StaticHost) this.instance).clearUpdatedAt();
            return this;
        }

        @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
        public Timestamp getCreatedAt() {
            return ((StaticHost) this.instance).getCreatedAt();
        }

        @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
        public Timestamp getDeletedAt() {
            return ((StaticHost) this.instance).getDeletedAt();
        }

        @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
        public String getDisplayName() {
            return ((StaticHost) this.instance).getDisplayName();
        }

        @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
        public AbstractC2097h getDisplayNameBytes() {
            return ((StaticHost) this.instance).getDisplayNameBytes();
        }

        @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
        public Endpoint getEndpoint(int i8) {
            return ((StaticHost) this.instance).getEndpoint(i8);
        }

        @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
        public int getEndpointCount() {
            return ((StaticHost) this.instance).getEndpointCount();
        }

        @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
        public List<Endpoint> getEndpointList() {
            return Collections.unmodifiableList(((StaticHost) this.instance).getEndpointList());
        }

        @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
        public String getRawID() {
            return ((StaticHost) this.instance).getRawID();
        }

        @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
        public AbstractC2097h getRawIDBytes() {
            return ((StaticHost) this.instance).getRawIDBytes();
        }

        @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
        public Timestamp getUpdatedAt() {
            return ((StaticHost) this.instance).getUpdatedAt();
        }

        @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
        public boolean hasCreatedAt() {
            return ((StaticHost) this.instance).hasCreatedAt();
        }

        @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
        public boolean hasDeletedAt() {
            return ((StaticHost) this.instance).hasDeletedAt();
        }

        @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
        public boolean hasUpdatedAt() {
            return ((StaticHost) this.instance).hasUpdatedAt();
        }

        public Builder mergeCreatedAt(Timestamp timestamp) {
            copyOnWrite();
            ((StaticHost) this.instance).mergeCreatedAt(timestamp);
            return this;
        }

        public Builder mergeDeletedAt(Timestamp timestamp) {
            copyOnWrite();
            ((StaticHost) this.instance).mergeDeletedAt(timestamp);
            return this;
        }

        public Builder mergeUpdatedAt(Timestamp timestamp) {
            copyOnWrite();
            ((StaticHost) this.instance).mergeUpdatedAt(timestamp);
            return this;
        }

        public Builder removeEndpoint(int i8) {
            copyOnWrite();
            ((StaticHost) this.instance).removeEndpoint(i8);
            return this;
        }

        public Builder setCreatedAt(Timestamp timestamp) {
            copyOnWrite();
            ((StaticHost) this.instance).setCreatedAt(timestamp);
            return this;
        }

        public Builder setDeletedAt(Timestamp timestamp) {
            copyOnWrite();
            ((StaticHost) this.instance).setDeletedAt(timestamp);
            return this;
        }

        public Builder setDisplayName(String str) {
            copyOnWrite();
            ((StaticHost) this.instance).setDisplayName(str);
            return this;
        }

        public Builder setDisplayNameBytes(AbstractC2097h abstractC2097h) {
            copyOnWrite();
            ((StaticHost) this.instance).setDisplayNameBytes(abstractC2097h);
            return this;
        }

        public Builder setEndpoint(int i8, Endpoint endpoint) {
            copyOnWrite();
            ((StaticHost) this.instance).setEndpoint(i8, endpoint);
            return this;
        }

        public Builder setRawID(String str) {
            copyOnWrite();
            ((StaticHost) this.instance).setRawID(str);
            return this;
        }

        public Builder setRawIDBytes(AbstractC2097h abstractC2097h) {
            copyOnWrite();
            ((StaticHost) this.instance).setRawIDBytes(abstractC2097h);
            return this;
        }

        public Builder setUpdatedAt(Timestamp timestamp) {
            copyOnWrite();
            ((StaticHost) this.instance).setUpdatedAt(timestamp);
            return this;
        }

        private Builder() {
            super(StaticHost.DEFAULT_INSTANCE);
        }

        public Builder addEndpoint(int i8, Endpoint endpoint) {
            copyOnWrite();
            ((StaticHost) this.instance).addEndpoint(i8, endpoint);
            return this;
        }

        public Builder setCreatedAt(Timestamp.b bVar) {
            copyOnWrite();
            ((StaticHost) this.instance).setCreatedAt((Timestamp) bVar.build());
            return this;
        }

        public Builder setDeletedAt(Timestamp.b bVar) {
            copyOnWrite();
            ((StaticHost) this.instance).setDeletedAt((Timestamp) bVar.build());
            return this;
        }

        public Builder setEndpoint(int i8, Endpoint.Builder builder) {
            copyOnWrite();
            ((StaticHost) this.instance).setEndpoint(i8, (Endpoint) builder.build());
            return this;
        }

        public Builder setUpdatedAt(Timestamp.b bVar) {
            copyOnWrite();
            ((StaticHost) this.instance).setUpdatedAt((Timestamp) bVar.build());
            return this;
        }

        public Builder addEndpoint(Endpoint.Builder builder) {
            copyOnWrite();
            ((StaticHost) this.instance).addEndpoint((Endpoint) builder.build());
            return this;
        }

        public Builder addEndpoint(int i8, Endpoint.Builder builder) {
            copyOnWrite();
            ((StaticHost) this.instance).addEndpoint(i8, (Endpoint) builder.build());
            return this;
        }
    }

    static {
        StaticHost staticHost = new StaticHost();
        DEFAULT_INSTANCE = staticHost;
        GeneratedMessageLite.registerDefaultInstance(StaticHost.class, staticHost);
    }

    private StaticHost() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEndpoint(Iterable<? extends Endpoint> iterable) {
        ensureEndpointIsMutable();
        AbstractC2086a.addAll((Iterable) iterable, (List) this.endpoint_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndpoint(Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointIsMutable();
        this.endpoint_.add(endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedAt() {
        this.createdAt_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeletedAt() {
        this.deletedAt_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndpoint() {
        this.endpoint_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRawID() {
        this.rawID_ = getDefaultInstance().getRawID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdatedAt() {
        this.updatedAt_ = null;
        this.bitField0_ &= -3;
    }

    private void ensureEndpointIsMutable() {
        A.j jVar = this.endpoint_;
        if (jVar.C()) {
            return;
        }
        this.endpoint_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static StaticHost getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreatedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.createdAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.createdAt_ = timestamp;
        } else {
            this.createdAt_ = (Timestamp) ((Timestamp.b) Timestamp.newBuilder(this.createdAt_).mergeFrom((GeneratedMessageLite) timestamp)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeletedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.deletedAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.deletedAt_ = timestamp;
        } else {
            this.deletedAt_ = (Timestamp) ((Timestamp.b) Timestamp.newBuilder(this.deletedAt_).mergeFrom((GeneratedMessageLite) timestamp)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdatedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.updatedAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.updatedAt_ = timestamp;
        } else {
            this.updatedAt_ = (Timestamp) ((Timestamp.b) Timestamp.newBuilder(this.updatedAt_).mergeFrom((GeneratedMessageLite) timestamp)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static StaticHost parseDelimitedFrom(InputStream inputStream) {
        return (StaticHost) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StaticHost parseFrom(ByteBuffer byteBuffer) {
        return (StaticHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEndpoint(int i8) {
        ensureEndpointIsMutable();
        this.endpoint_.remove(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.createdAt_ = timestamp;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeletedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.deletedAt_ = timestamp;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayName(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayNameBytes(AbstractC2097h abstractC2097h) {
        AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
        this.displayName_ = abstractC2097h.T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndpoint(int i8, Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointIsMutable();
        this.endpoint_.set(i8, endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawID(String str) {
        str.getClass();
        this.rawID_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawIDBytes(AbstractC2097h abstractC2097h) {
        AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
        this.rawID_ = abstractC2097h.T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.updatedAt_ = timestamp;
        this.bitField0_ |= 2;
    }

    @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
    public Timestamp getDeletedAt() {
        Timestamp timestamp = this.deletedAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
    public AbstractC2097h getDisplayNameBytes() {
        return AbstractC2097h.E(this.displayName_);
    }

    @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
    public Endpoint getEndpoint(int i8) {
        return (Endpoint) this.endpoint_.get(i8);
    }

    @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
    public int getEndpointCount() {
        return this.endpoint_.size();
    }

    @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
    public List<Endpoint> getEndpointList() {
        return this.endpoint_;
    }

    public EndpointOrBuilder getEndpointOrBuilder(int i8) {
        return (EndpointOrBuilder) this.endpoint_.get(i8);
    }

    public List<? extends EndpointOrBuilder> getEndpointOrBuilderList() {
        return this.endpoint_;
    }

    @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
    public String getRawID() {
        return this.rawID_;
    }

    @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
    public AbstractC2097h getRawIDBytes() {
        return AbstractC2097h.E(this.rawID_);
    }

    @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
    public Timestamp getUpdatedAt() {
        Timestamp timestamp = this.updatedAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
    public boolean hasCreatedAt() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
    public boolean hasDeletedAt() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.elgato.streamdeck.vsd2.StaticHostOrBuilder
    public boolean hasUpdatedAt() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(StaticHost staticHost) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(staticHost);
    }

    public static StaticHost parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
        return (StaticHost) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
    }

    public static StaticHost parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
        return (StaticHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        g0 cVar;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[fVar.ordinal()]) {
            case 1:
                return new StaticHost();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "rawID_", "displayName_", "endpoint_", Endpoint.class, "createdAt_", "updatedAt_", BmWxZhjGfw.OMfTJ});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                g0 g0Var = PARSER;
                if (g0Var != null) {
                    return g0Var;
                }
                synchronized (StaticHost.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static StaticHost parseFrom(AbstractC2097h abstractC2097h) {
        return (StaticHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndpoint(int i8, Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointIsMutable();
        this.endpoint_.add(i8, endpoint);
    }

    public static StaticHost parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
        return (StaticHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
    }

    public static StaticHost parseFrom(byte[] bArr) {
        return (StaticHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StaticHost parseFrom(byte[] bArr, C2106q c2106q) {
        return (StaticHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
    }

    public static StaticHost parseFrom(InputStream inputStream) {
        return (StaticHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StaticHost parseFrom(InputStream inputStream, C2106q c2106q) {
        return (StaticHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
    }

    public static StaticHost parseFrom(AbstractC2098i abstractC2098i) {
        return (StaticHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
    }

    public static StaticHost parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
        return (StaticHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
    }
}
