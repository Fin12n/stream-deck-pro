package com.elgato.streamdeck.vsd2;

import com.google.protobuf.A;
import com.google.protobuf.AbstractC2086a;
import com.google.protobuf.AbstractC2097h;
import com.google.protobuf.AbstractC2098i;
import com.google.protobuf.C2106q;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.g0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Endpoint extends GeneratedMessageLite implements EndpointOrBuilder {
    private static final Endpoint DEFAULT_INSTANCE;
    public static final int HOST_FIELD_NUMBER = 1;
    private static volatile g0 PARSER = null;
    public static final int PORT_FIELD_NUMBER = 2;
    public static final int SOURCE_FIELD_NUMBER = 3;
    private String host_ = "";
    private int port_;
    private int source_;

    /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.Endpoint$1, reason: invalid class name */
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
    public static final class Builder extends GeneratedMessageLite.b implements EndpointOrBuilder {
        public Builder clearHost() {
            copyOnWrite();
            ((Endpoint) this.instance).clearHost();
            return this;
        }

        public Builder clearPort() {
            copyOnWrite();
            ((Endpoint) this.instance).clearPort();
            return this;
        }

        public Builder clearSource() {
            copyOnWrite();
            ((Endpoint) this.instance).clearSource();
            return this;
        }

        @Override // com.elgato.streamdeck.vsd2.EndpointOrBuilder
        public String getHost() {
            return ((Endpoint) this.instance).getHost();
        }

        @Override // com.elgato.streamdeck.vsd2.EndpointOrBuilder
        public AbstractC2097h getHostBytes() {
            return ((Endpoint) this.instance).getHostBytes();
        }

        @Override // com.elgato.streamdeck.vsd2.EndpointOrBuilder
        public int getPort() {
            return ((Endpoint) this.instance).getPort();
        }

        @Override // com.elgato.streamdeck.vsd2.EndpointOrBuilder
        public Source getSource() {
            return ((Endpoint) this.instance).getSource();
        }

        @Override // com.elgato.streamdeck.vsd2.EndpointOrBuilder
        public int getSourceValue() {
            return ((Endpoint) this.instance).getSourceValue();
        }

        public Builder setHost(String str) {
            copyOnWrite();
            ((Endpoint) this.instance).setHost(str);
            return this;
        }

        public Builder setHostBytes(AbstractC2097h abstractC2097h) {
            copyOnWrite();
            ((Endpoint) this.instance).setHostBytes(abstractC2097h);
            return this;
        }

        public Builder setPort(int i8) {
            copyOnWrite();
            ((Endpoint) this.instance).setPort(i8);
            return this;
        }

        public Builder setSource(Source source) {
            copyOnWrite();
            ((Endpoint) this.instance).setSource(source);
            return this;
        }

        public Builder setSourceValue(int i8) {
            copyOnWrite();
            ((Endpoint) this.instance).setSourceValue(i8);
            return this;
        }

        private Builder() {
            super(Endpoint.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum Source implements A.c {
        STATIC(0),
        ELGATO_DISCOVERY(1),
        CACHE(2),
        BONJOUR(3),
        UNRECOGNIZED(-1);

        public static final int BONJOUR_VALUE = 3;
        public static final int CACHE_VALUE = 2;
        public static final int ELGATO_DISCOVERY_VALUE = 1;
        public static final int STATIC_VALUE = 0;
        private static final A.d internalValueMap = new A.d() { // from class: com.elgato.streamdeck.vsd2.Endpoint.Source.1
            @Override // com.google.protobuf.A.d
            public Source findValueByNumber(int i8) {
                return Source.forNumber(i8);
            }
        };
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class SourceVerifier implements A.e {
            static final A.e INSTANCE = new SourceVerifier();

            private SourceVerifier() {
            }

            @Override // com.google.protobuf.A.e
            public boolean isInRange(int i8) {
                return Source.forNumber(i8) != null;
            }
        }

        Source(int i8) {
            this.value = i8;
        }

        public static Source forNumber(int i8) {
            if (i8 == 0) {
                return STATIC;
            }
            if (i8 == 1) {
                return ELGATO_DISCOVERY;
            }
            if (i8 == 2) {
                return CACHE;
            }
            if (i8 != 3) {
                return null;
            }
            return BONJOUR;
        }

        public static A.d internalGetValueMap() {
            return internalValueMap;
        }

        public static A.e internalGetVerifier() {
            return SourceVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.A.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static Source valueOf(int i8) {
            return forNumber(i8);
        }
    }

    static {
        Endpoint endpoint = new Endpoint();
        DEFAULT_INSTANCE = endpoint;
        GeneratedMessageLite.registerDefaultInstance(Endpoint.class, endpoint);
    }

    private Endpoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHost() {
        this.host_ = getDefaultInstance().getHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPort() {
        this.port_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static Endpoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream) {
        return (Endpoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer) {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHost(String str) {
        str.getClass();
        this.host_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHostBytes(AbstractC2097h abstractC2097h) {
        AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
        this.host_ = abstractC2097h.T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPort(int i8) {
        this.port_ = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(Source source) {
        this.source_ = source.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i8) {
        this.source_ = i8;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        g0 cVar;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[fVar.ordinal()]) {
            case 1:
                return new Endpoint();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\f", new Object[]{"host_", "port_", "source_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                g0 g0Var = PARSER;
                if (g0Var != null) {
                    return g0Var;
                }
                synchronized (Endpoint.class) {
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

    @Override // com.elgato.streamdeck.vsd2.EndpointOrBuilder
    public String getHost() {
        return this.host_;
    }

    @Override // com.elgato.streamdeck.vsd2.EndpointOrBuilder
    public AbstractC2097h getHostBytes() {
        return AbstractC2097h.E(this.host_);
    }

    @Override // com.elgato.streamdeck.vsd2.EndpointOrBuilder
    public int getPort() {
        return this.port_;
    }

    @Override // com.elgato.streamdeck.vsd2.EndpointOrBuilder
    public Source getSource() {
        Source sourceForNumber = Source.forNumber(this.source_);
        return sourceForNumber == null ? Source.UNRECOGNIZED : sourceForNumber;
    }

    @Override // com.elgato.streamdeck.vsd2.EndpointOrBuilder
    public int getSourceValue() {
        return this.source_;
    }

    public static Builder newBuilder(Endpoint endpoint) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(endpoint);
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
        return (Endpoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
    }

    public static Endpoint parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
    }

    public static Endpoint parseFrom(AbstractC2097h abstractC2097h) {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
    }

    public static Endpoint parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
    }

    public static Endpoint parseFrom(byte[] bArr) {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Endpoint parseFrom(byte[] bArr, C2106q c2106q) {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
    }

    public static Endpoint parseFrom(InputStream inputStream) {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Endpoint parseFrom(InputStream inputStream, C2106q c2106q) {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
    }

    public static Endpoint parseFrom(AbstractC2098i abstractC2098i) {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
    }

    public static Endpoint parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
        return (Endpoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
    }
}
