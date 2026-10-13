package com.elgato.streamdeck.vsd2;

import com.google.protobuf.AbstractC2086a;
import com.google.protobuf.AbstractC2097h;
import com.google.protobuf.AbstractC2098i;
import com.google.protobuf.C2106q;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import com.google.protobuf.g0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class AppMetrics extends GeneratedMessageLite implements AppMetricsOrBuilder {
    public static final int CONNECTIONDURATIONSECONDS_FIELD_NUMBER = 2;
    private static final AppMetrics DEFAULT_INSTANCE;
    public static final int INSTALLEDAT_FIELD_NUMBER = 1;
    public static final int LASTREVIEWREQUESTVERSION_FIELD_NUMBER = 4;
    public static final int LASTREVIEWREQUEST_FIELD_NUMBER = 3;
    public static final int LASTSEENONBOARDINGVERSION_FIELD_NUMBER = 5;
    private static volatile g0 PARSER;
    private int bitField0_;
    private long connectionDurationSeconds_;
    private Timestamp installedAt_;
    private Timestamp lastReviewRequest_;
    private String lastReviewRequestVersion_ = "";
    private String lastSeenOnboardingVersion_ = "";

    /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppMetrics$1, reason: invalid class name */
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
    public static final class Builder extends GeneratedMessageLite.b implements AppMetricsOrBuilder {
        public Builder clearConnectionDurationSeconds() {
            copyOnWrite();
            ((AppMetrics) this.instance).clearConnectionDurationSeconds();
            return this;
        }

        public Builder clearInstalledAt() {
            copyOnWrite();
            ((AppMetrics) this.instance).clearInstalledAt();
            return this;
        }

        public Builder clearLastReviewRequest() {
            copyOnWrite();
            ((AppMetrics) this.instance).clearLastReviewRequest();
            return this;
        }

        public Builder clearLastReviewRequestVersion() {
            copyOnWrite();
            ((AppMetrics) this.instance).clearLastReviewRequestVersion();
            return this;
        }

        public Builder clearLastSeenOnboardingVersion() {
            copyOnWrite();
            ((AppMetrics) this.instance).clearLastSeenOnboardingVersion();
            return this;
        }

        @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
        public long getConnectionDurationSeconds() {
            return ((AppMetrics) this.instance).getConnectionDurationSeconds();
        }

        @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
        public Timestamp getInstalledAt() {
            return ((AppMetrics) this.instance).getInstalledAt();
        }

        @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
        public Timestamp getLastReviewRequest() {
            return ((AppMetrics) this.instance).getLastReviewRequest();
        }

        @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
        public String getLastReviewRequestVersion() {
            return ((AppMetrics) this.instance).getLastReviewRequestVersion();
        }

        @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
        public AbstractC2097h getLastReviewRequestVersionBytes() {
            return ((AppMetrics) this.instance).getLastReviewRequestVersionBytes();
        }

        @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
        public String getLastSeenOnboardingVersion() {
            return ((AppMetrics) this.instance).getLastSeenOnboardingVersion();
        }

        @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
        public AbstractC2097h getLastSeenOnboardingVersionBytes() {
            return ((AppMetrics) this.instance).getLastSeenOnboardingVersionBytes();
        }

        @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
        public boolean hasInstalledAt() {
            return ((AppMetrics) this.instance).hasInstalledAt();
        }

        @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
        public boolean hasLastReviewRequest() {
            return ((AppMetrics) this.instance).hasLastReviewRequest();
        }

        @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
        public boolean hasLastReviewRequestVersion() {
            return ((AppMetrics) this.instance).hasLastReviewRequestVersion();
        }

        @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
        public boolean hasLastSeenOnboardingVersion() {
            return ((AppMetrics) this.instance).hasLastSeenOnboardingVersion();
        }

        public Builder mergeInstalledAt(Timestamp timestamp) {
            copyOnWrite();
            ((AppMetrics) this.instance).mergeInstalledAt(timestamp);
            return this;
        }

        public Builder mergeLastReviewRequest(Timestamp timestamp) {
            copyOnWrite();
            ((AppMetrics) this.instance).mergeLastReviewRequest(timestamp);
            return this;
        }

        public Builder setConnectionDurationSeconds(long j8) {
            copyOnWrite();
            ((AppMetrics) this.instance).setConnectionDurationSeconds(j8);
            return this;
        }

        public Builder setInstalledAt(Timestamp timestamp) {
            copyOnWrite();
            ((AppMetrics) this.instance).setInstalledAt(timestamp);
            return this;
        }

        public Builder setLastReviewRequest(Timestamp timestamp) {
            copyOnWrite();
            ((AppMetrics) this.instance).setLastReviewRequest(timestamp);
            return this;
        }

        public Builder setLastReviewRequestVersion(String str) {
            copyOnWrite();
            ((AppMetrics) this.instance).setLastReviewRequestVersion(str);
            return this;
        }

        public Builder setLastReviewRequestVersionBytes(AbstractC2097h abstractC2097h) {
            copyOnWrite();
            ((AppMetrics) this.instance).setLastReviewRequestVersionBytes(abstractC2097h);
            return this;
        }

        public Builder setLastSeenOnboardingVersion(String str) {
            copyOnWrite();
            ((AppMetrics) this.instance).setLastSeenOnboardingVersion(str);
            return this;
        }

        public Builder setLastSeenOnboardingVersionBytes(AbstractC2097h abstractC2097h) {
            copyOnWrite();
            ((AppMetrics) this.instance).setLastSeenOnboardingVersionBytes(abstractC2097h);
            return this;
        }

        private Builder() {
            super(AppMetrics.DEFAULT_INSTANCE);
        }

        public Builder setInstalledAt(Timestamp.b bVar) {
            copyOnWrite();
            ((AppMetrics) this.instance).setInstalledAt((Timestamp) bVar.build());
            return this;
        }

        public Builder setLastReviewRequest(Timestamp.b bVar) {
            copyOnWrite();
            ((AppMetrics) this.instance).setLastReviewRequest((Timestamp) bVar.build());
            return this;
        }
    }

    static {
        AppMetrics appMetrics = new AppMetrics();
        DEFAULT_INSTANCE = appMetrics;
        GeneratedMessageLite.registerDefaultInstance(AppMetrics.class, appMetrics);
    }

    private AppMetrics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionDurationSeconds() {
        this.connectionDurationSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstalledAt() {
        this.installedAt_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastReviewRequest() {
        this.lastReviewRequest_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastReviewRequestVersion() {
        this.bitField0_ &= -5;
        this.lastReviewRequestVersion_ = getDefaultInstance().getLastReviewRequestVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastSeenOnboardingVersion() {
        this.bitField0_ &= -9;
        this.lastSeenOnboardingVersion_ = getDefaultInstance().getLastSeenOnboardingVersion();
    }

    public static AppMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInstalledAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.installedAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.installedAt_ = timestamp;
        } else {
            this.installedAt_ = (Timestamp) ((Timestamp.b) Timestamp.newBuilder(this.installedAt_).mergeFrom((GeneratedMessageLite) timestamp)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastReviewRequest(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.lastReviewRequest_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.lastReviewRequest_ = timestamp;
        } else {
            this.lastReviewRequest_ = (Timestamp) ((Timestamp.b) Timestamp.newBuilder(this.lastReviewRequest_).mergeFrom((GeneratedMessageLite) timestamp)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AppMetrics parseDelimitedFrom(InputStream inputStream) {
        return (AppMetrics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AppMetrics parseFrom(ByteBuffer byteBuffer) {
        return (AppMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionDurationSeconds(long j8) {
        this.connectionDurationSeconds_ = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstalledAt(Timestamp timestamp) {
        timestamp.getClass();
        this.installedAt_ = timestamp;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastReviewRequest(Timestamp timestamp) {
        timestamp.getClass();
        this.lastReviewRequest_ = timestamp;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastReviewRequestVersion(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.lastReviewRequestVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastReviewRequestVersionBytes(AbstractC2097h abstractC2097h) {
        AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
        this.lastReviewRequestVersion_ = abstractC2097h.T();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastSeenOnboardingVersion(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.lastSeenOnboardingVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastSeenOnboardingVersionBytes(AbstractC2097h abstractC2097h) {
        AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
        this.lastSeenOnboardingVersion_ = abstractC2097h.T();
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        g0 cVar;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[fVar.ordinal()]) {
            case 1:
                return new AppMetrics();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0003\u0003ဉ\u0001\u0004ለ\u0002\u0005ለ\u0003", new Object[]{"bitField0_", "installedAt_", "connectionDurationSeconds_", "lastReviewRequest_", "lastReviewRequestVersion_", "lastSeenOnboardingVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                g0 g0Var = PARSER;
                if (g0Var != null) {
                    return g0Var;
                }
                synchronized (AppMetrics.class) {
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

    @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
    public long getConnectionDurationSeconds() {
        return this.connectionDurationSeconds_;
    }

    @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
    public Timestamp getInstalledAt() {
        Timestamp timestamp = this.installedAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
    public Timestamp getLastReviewRequest() {
        Timestamp timestamp = this.lastReviewRequest_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
    public String getLastReviewRequestVersion() {
        return this.lastReviewRequestVersion_;
    }

    @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
    public AbstractC2097h getLastReviewRequestVersionBytes() {
        return AbstractC2097h.E(this.lastReviewRequestVersion_);
    }

    @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
    public String getLastSeenOnboardingVersion() {
        return this.lastSeenOnboardingVersion_;
    }

    @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
    public AbstractC2097h getLastSeenOnboardingVersionBytes() {
        return AbstractC2097h.E(this.lastSeenOnboardingVersion_);
    }

    @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
    public boolean hasInstalledAt() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
    public boolean hasLastReviewRequest() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
    public boolean hasLastReviewRequestVersion() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.elgato.streamdeck.vsd2.AppMetricsOrBuilder
    public boolean hasLastSeenOnboardingVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    public static Builder newBuilder(AppMetrics appMetrics) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(appMetrics);
    }

    public static AppMetrics parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
        return (AppMetrics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
    }

    public static AppMetrics parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
        return (AppMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
    }

    public static AppMetrics parseFrom(AbstractC2097h abstractC2097h) {
        return (AppMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
    }

    public static AppMetrics parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
        return (AppMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
    }

    public static AppMetrics parseFrom(byte[] bArr) {
        return (AppMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AppMetrics parseFrom(byte[] bArr, C2106q c2106q) {
        return (AppMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
    }

    public static AppMetrics parseFrom(InputStream inputStream) {
        return (AppMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AppMetrics parseFrom(InputStream inputStream, C2106q c2106q) {
        return (AppMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
    }

    public static AppMetrics parseFrom(AbstractC2098i abstractC2098i) {
        return (AppMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
    }

    public static AppMetrics parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
        return (AppMetrics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
    }
}
