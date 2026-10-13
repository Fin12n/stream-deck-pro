package com.elgato.streamdeck.vsd2;

import com.google.protobuf.AbstractC2097h;
import com.google.protobuf.AbstractC2098i;
import com.google.protobuf.C2106q;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.g0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class AppUpdates extends GeneratedMessageLite implements AppUpdatesOrBuilder {
    private static final AppUpdates DEFAULT_INSTANCE;
    public static final int HIDEOUTDATEDSDKVERSIONALERT_FIELD_NUMBER = 1;
    private static volatile g0 PARSER = null;
    public static final int SHOWNAPPUPDATEAVAILABLEALERTDATE_FIELD_NUMBER = 3;
    public static final int SHOWNOUTDATEDSDKVERSIONALERTDATE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int hideOutdatedSDKVersionAlert_;
    private long shownAppUpdateAvailableAlertDate_;
    private long shownOutdatedSDKVersionAlertDate_;

    /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppUpdates$1, reason: invalid class name */
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
    public static final class Builder extends GeneratedMessageLite.b implements AppUpdatesOrBuilder {
        public Builder clearHideOutdatedSDKVersionAlert() {
            copyOnWrite();
            ((AppUpdates) this.instance).clearHideOutdatedSDKVersionAlert();
            return this;
        }

        public Builder clearShownAppUpdateAvailableAlertDate() {
            copyOnWrite();
            ((AppUpdates) this.instance).clearShownAppUpdateAvailableAlertDate();
            return this;
        }

        public Builder clearShownOutdatedSDKVersionAlertDate() {
            copyOnWrite();
            ((AppUpdates) this.instance).clearShownOutdatedSDKVersionAlertDate();
            return this;
        }

        @Override // com.elgato.streamdeck.vsd2.AppUpdatesOrBuilder
        public int getHideOutdatedSDKVersionAlert() {
            return ((AppUpdates) this.instance).getHideOutdatedSDKVersionAlert();
        }

        @Override // com.elgato.streamdeck.vsd2.AppUpdatesOrBuilder
        public long getShownAppUpdateAvailableAlertDate() {
            return ((AppUpdates) this.instance).getShownAppUpdateAvailableAlertDate();
        }

        @Override // com.elgato.streamdeck.vsd2.AppUpdatesOrBuilder
        public long getShownOutdatedSDKVersionAlertDate() {
            return ((AppUpdates) this.instance).getShownOutdatedSDKVersionAlertDate();
        }

        @Override // com.elgato.streamdeck.vsd2.AppUpdatesOrBuilder
        public boolean hasHideOutdatedSDKVersionAlert() {
            return ((AppUpdates) this.instance).hasHideOutdatedSDKVersionAlert();
        }

        @Override // com.elgato.streamdeck.vsd2.AppUpdatesOrBuilder
        public boolean hasShownAppUpdateAvailableAlertDate() {
            return ((AppUpdates) this.instance).hasShownAppUpdateAvailableAlertDate();
        }

        @Override // com.elgato.streamdeck.vsd2.AppUpdatesOrBuilder
        public boolean hasShownOutdatedSDKVersionAlertDate() {
            return ((AppUpdates) this.instance).hasShownOutdatedSDKVersionAlertDate();
        }

        public Builder setHideOutdatedSDKVersionAlert(int i8) {
            copyOnWrite();
            ((AppUpdates) this.instance).setHideOutdatedSDKVersionAlert(i8);
            return this;
        }

        public Builder setShownAppUpdateAvailableAlertDate(long j8) {
            copyOnWrite();
            ((AppUpdates) this.instance).setShownAppUpdateAvailableAlertDate(j8);
            return this;
        }

        public Builder setShownOutdatedSDKVersionAlertDate(long j8) {
            copyOnWrite();
            ((AppUpdates) this.instance).setShownOutdatedSDKVersionAlertDate(j8);
            return this;
        }

        private Builder() {
            super(AppUpdates.DEFAULT_INSTANCE);
        }
    }

    static {
        AppUpdates appUpdates = new AppUpdates();
        DEFAULT_INSTANCE = appUpdates;
        GeneratedMessageLite.registerDefaultInstance(AppUpdates.class, appUpdates);
    }

    private AppUpdates() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHideOutdatedSDKVersionAlert() {
        this.bitField0_ &= -2;
        this.hideOutdatedSDKVersionAlert_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShownAppUpdateAvailableAlertDate() {
        this.bitField0_ &= -5;
        this.shownAppUpdateAvailableAlertDate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShownOutdatedSDKVersionAlertDate() {
        this.bitField0_ &= -3;
        this.shownOutdatedSDKVersionAlertDate_ = 0L;
    }

    public static AppUpdates getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AppUpdates parseDelimitedFrom(InputStream inputStream) {
        return (AppUpdates) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AppUpdates parseFrom(ByteBuffer byteBuffer) {
        return (AppUpdates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHideOutdatedSDKVersionAlert(int i8) {
        this.bitField0_ |= 1;
        this.hideOutdatedSDKVersionAlert_ = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShownAppUpdateAvailableAlertDate(long j8) {
        this.bitField0_ |= 4;
        this.shownAppUpdateAvailableAlertDate_ = j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShownOutdatedSDKVersionAlertDate(long j8) {
        this.bitField0_ |= 2;
        this.shownOutdatedSDKVersionAlertDate_ = j8;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        g0 cVar;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[fVar.ordinal()]) {
            case 1:
                return new AppUpdates();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "hideOutdatedSDKVersionAlert_", "shownOutdatedSDKVersionAlertDate_", "shownAppUpdateAvailableAlertDate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                g0 g0Var = PARSER;
                if (g0Var != null) {
                    return g0Var;
                }
                synchronized (AppUpdates.class) {
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

    @Override // com.elgato.streamdeck.vsd2.AppUpdatesOrBuilder
    public int getHideOutdatedSDKVersionAlert() {
        return this.hideOutdatedSDKVersionAlert_;
    }

    @Override // com.elgato.streamdeck.vsd2.AppUpdatesOrBuilder
    public long getShownAppUpdateAvailableAlertDate() {
        return this.shownAppUpdateAvailableAlertDate_;
    }

    @Override // com.elgato.streamdeck.vsd2.AppUpdatesOrBuilder
    public long getShownOutdatedSDKVersionAlertDate() {
        return this.shownOutdatedSDKVersionAlertDate_;
    }

    @Override // com.elgato.streamdeck.vsd2.AppUpdatesOrBuilder
    public boolean hasHideOutdatedSDKVersionAlert() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.elgato.streamdeck.vsd2.AppUpdatesOrBuilder
    public boolean hasShownAppUpdateAvailableAlertDate() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.elgato.streamdeck.vsd2.AppUpdatesOrBuilder
    public boolean hasShownOutdatedSDKVersionAlertDate() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(AppUpdates appUpdates) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(appUpdates);
    }

    public static AppUpdates parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
        return (AppUpdates) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
    }

    public static AppUpdates parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
        return (AppUpdates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
    }

    public static AppUpdates parseFrom(AbstractC2097h abstractC2097h) {
        return (AppUpdates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
    }

    public static AppUpdates parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
        return (AppUpdates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
    }

    public static AppUpdates parseFrom(byte[] bArr) {
        return (AppUpdates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AppUpdates parseFrom(byte[] bArr, C2106q c2106q) {
        return (AppUpdates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
    }

    public static AppUpdates parseFrom(InputStream inputStream) {
        return (AppUpdates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AppUpdates parseFrom(InputStream inputStream, C2106q c2106q) {
        return (AppUpdates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
    }

    public static AppUpdates parseFrom(AbstractC2098i abstractC2098i) {
        return (AppUpdates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
    }

    public static AppUpdates parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
        return (AppUpdates) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
    }
}
