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
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class AppSettings extends GeneratedMessageLite implements AppSettingsOrBuilder {
    public static final int APPMETRICS_FIELD_NUMBER = 8;
    public static final int APPUPDATES_FIELD_NUMBER = 9;
    private static final AppSettings DEFAULT_INSTANCE;
    public static final int ISFORCEDPROUSER_FIELD_NUMBER = 6;
    public static final int ISPROUSER_FIELD_NUMBER = 5;
    public static final int KNOWNHOSTS_FIELD_NUMBER = 3;
    public static final int LASTOPENEDDEVICERAWID_FIELD_NUMBER = 4;
    private static volatile g0 PARSER = null;
    public static final int PUBLICKEY_FIELD_NUMBER = 1;
    public static final int SECRETKEY_FIELD_NUMBER = 2;
    public static final int STATICHOST_FIELD_NUMBER = 7;
    private AppMetrics appMetrics_;
    private AppUpdates appUpdates_;
    private int bitField0_;
    private boolean isForcedProUser_;
    private boolean isProUser_;
    private A.j knownHosts_;
    private String lastOpenedDeviceRawID_;
    private AbstractC2097h publicKey_;
    private AbstractC2097h secretKey_;
    private A.j staticHost_;

    /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettings$1, reason: invalid class name */
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
    public static final class Builder extends GeneratedMessageLite.b implements AppSettingsOrBuilder {
        public Builder addAllKnownHosts(Iterable<? extends KnownHost> iterable) {
            copyOnWrite();
            ((AppSettings) this.instance).addAllKnownHosts(iterable);
            return this;
        }

        public Builder addAllStaticHost(Iterable<? extends StaticHost> iterable) {
            copyOnWrite();
            ((AppSettings) this.instance).addAllStaticHost(iterable);
            return this;
        }

        public Builder addKnownHosts(KnownHost knownHost) {
            copyOnWrite();
            ((AppSettings) this.instance).addKnownHosts(knownHost);
            return this;
        }

        public Builder addStaticHost(StaticHost staticHost) {
            copyOnWrite();
            ((AppSettings) this.instance).addStaticHost(staticHost);
            return this;
        }

        public Builder clearAppMetrics() {
            copyOnWrite();
            ((AppSettings) this.instance).clearAppMetrics();
            return this;
        }

        public Builder clearAppUpdates() {
            copyOnWrite();
            ((AppSettings) this.instance).clearAppUpdates();
            return this;
        }

        public Builder clearIsForcedProUser() {
            copyOnWrite();
            ((AppSettings) this.instance).clearIsForcedProUser();
            return this;
        }

        public Builder clearIsProUser() {
            copyOnWrite();
            ((AppSettings) this.instance).clearIsProUser();
            return this;
        }

        public Builder clearKnownHosts() {
            copyOnWrite();
            ((AppSettings) this.instance).clearKnownHosts();
            return this;
        }

        public Builder clearLastOpenedDeviceRawID() {
            copyOnWrite();
            ((AppSettings) this.instance).clearLastOpenedDeviceRawID();
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            ((AppSettings) this.instance).clearPublicKey();
            return this;
        }

        public Builder clearSecretKey() {
            copyOnWrite();
            ((AppSettings) this.instance).clearSecretKey();
            return this;
        }

        public Builder clearStaticHost() {
            copyOnWrite();
            ((AppSettings) this.instance).clearStaticHost();
            return this;
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public AppMetrics getAppMetrics() {
            return ((AppSettings) this.instance).getAppMetrics();
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public AppUpdates getAppUpdates() {
            return ((AppSettings) this.instance).getAppUpdates();
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public boolean getIsForcedProUser() {
            return ((AppSettings) this.instance).getIsForcedProUser();
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public boolean getIsProUser() {
            return ((AppSettings) this.instance).getIsProUser();
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public KnownHost getKnownHosts(int i8) {
            return ((AppSettings) this.instance).getKnownHosts(i8);
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public int getKnownHostsCount() {
            return ((AppSettings) this.instance).getKnownHostsCount();
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public List<KnownHost> getKnownHostsList() {
            return Collections.unmodifiableList(((AppSettings) this.instance).getKnownHostsList());
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public String getLastOpenedDeviceRawID() {
            return ((AppSettings) this.instance).getLastOpenedDeviceRawID();
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public AbstractC2097h getLastOpenedDeviceRawIDBytes() {
            return ((AppSettings) this.instance).getLastOpenedDeviceRawIDBytes();
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public AbstractC2097h getPublicKey() {
            return ((AppSettings) this.instance).getPublicKey();
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public AbstractC2097h getSecretKey() {
            return ((AppSettings) this.instance).getSecretKey();
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public StaticHost getStaticHost(int i8) {
            return ((AppSettings) this.instance).getStaticHost(i8);
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public int getStaticHostCount() {
            return ((AppSettings) this.instance).getStaticHostCount();
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public List<StaticHost> getStaticHostList() {
            return Collections.unmodifiableList(((AppSettings) this.instance).getStaticHostList());
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public boolean hasAppMetrics() {
            return ((AppSettings) this.instance).hasAppMetrics();
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public boolean hasAppUpdates() {
            return ((AppSettings) this.instance).hasAppUpdates();
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public boolean hasIsForcedProUser() {
            return ((AppSettings) this.instance).hasIsForcedProUser();
        }

        @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
        public boolean hasLastOpenedDeviceRawID() {
            return ((AppSettings) this.instance).hasLastOpenedDeviceRawID();
        }

        public Builder mergeAppMetrics(AppMetrics appMetrics) {
            copyOnWrite();
            ((AppSettings) this.instance).mergeAppMetrics(appMetrics);
            return this;
        }

        public Builder mergeAppUpdates(AppUpdates appUpdates) {
            copyOnWrite();
            ((AppSettings) this.instance).mergeAppUpdates(appUpdates);
            return this;
        }

        public Builder removeKnownHosts(int i8) {
            copyOnWrite();
            ((AppSettings) this.instance).removeKnownHosts(i8);
            return this;
        }

        public Builder removeStaticHost(int i8) {
            copyOnWrite();
            ((AppSettings) this.instance).removeStaticHost(i8);
            return this;
        }

        public Builder setAppMetrics(AppMetrics appMetrics) {
            copyOnWrite();
            ((AppSettings) this.instance).setAppMetrics(appMetrics);
            return this;
        }

        public Builder setAppUpdates(AppUpdates appUpdates) {
            copyOnWrite();
            ((AppSettings) this.instance).setAppUpdates(appUpdates);
            return this;
        }

        public Builder setIsForcedProUser(boolean z8) {
            copyOnWrite();
            ((AppSettings) this.instance).setIsForcedProUser(z8);
            return this;
        }

        public Builder setIsProUser(boolean z8) {
            copyOnWrite();
            ((AppSettings) this.instance).setIsProUser(z8);
            return this;
        }

        public Builder setKnownHosts(int i8, KnownHost knownHost) {
            copyOnWrite();
            ((AppSettings) this.instance).setKnownHosts(i8, knownHost);
            return this;
        }

        public Builder setLastOpenedDeviceRawID(String str) {
            copyOnWrite();
            ((AppSettings) this.instance).setLastOpenedDeviceRawID(str);
            return this;
        }

        public Builder setLastOpenedDeviceRawIDBytes(AbstractC2097h abstractC2097h) {
            copyOnWrite();
            ((AppSettings) this.instance).setLastOpenedDeviceRawIDBytes(abstractC2097h);
            return this;
        }

        public Builder setPublicKey(AbstractC2097h abstractC2097h) {
            copyOnWrite();
            ((AppSettings) this.instance).setPublicKey(abstractC2097h);
            return this;
        }

        public Builder setSecretKey(AbstractC2097h abstractC2097h) {
            copyOnWrite();
            ((AppSettings) this.instance).setSecretKey(abstractC2097h);
            return this;
        }

        public Builder setStaticHost(int i8, StaticHost staticHost) {
            copyOnWrite();
            ((AppSettings) this.instance).setStaticHost(i8, staticHost);
            return this;
        }

        private Builder() {
            super(AppSettings.DEFAULT_INSTANCE);
        }

        public Builder addKnownHosts(int i8, KnownHost knownHost) {
            copyOnWrite();
            ((AppSettings) this.instance).addKnownHosts(i8, knownHost);
            return this;
        }

        public Builder addStaticHost(int i8, StaticHost staticHost) {
            copyOnWrite();
            ((AppSettings) this.instance).addStaticHost(i8, staticHost);
            return this;
        }

        public Builder setAppMetrics(AppMetrics.Builder builder) {
            copyOnWrite();
            ((AppSettings) this.instance).setAppMetrics((AppMetrics) builder.build());
            return this;
        }

        public Builder setAppUpdates(AppUpdates.Builder builder) {
            copyOnWrite();
            ((AppSettings) this.instance).setAppUpdates((AppUpdates) builder.build());
            return this;
        }

        public Builder setKnownHosts(int i8, KnownHost.Builder builder) {
            copyOnWrite();
            ((AppSettings) this.instance).setKnownHosts(i8, (KnownHost) builder.build());
            return this;
        }

        public Builder setStaticHost(int i8, StaticHost.Builder builder) {
            copyOnWrite();
            ((AppSettings) this.instance).setStaticHost(i8, (StaticHost) builder.build());
            return this;
        }

        public Builder addKnownHosts(KnownHost.Builder builder) {
            copyOnWrite();
            ((AppSettings) this.instance).addKnownHosts((KnownHost) builder.build());
            return this;
        }

        public Builder addStaticHost(StaticHost.Builder builder) {
            copyOnWrite();
            ((AppSettings) this.instance).addStaticHost((StaticHost) builder.build());
            return this;
        }

        public Builder addKnownHosts(int i8, KnownHost.Builder builder) {
            copyOnWrite();
            ((AppSettings) this.instance).addKnownHosts(i8, (KnownHost) builder.build());
            return this;
        }

        public Builder addStaticHost(int i8, StaticHost.Builder builder) {
            copyOnWrite();
            ((AppSettings) this.instance).addStaticHost(i8, (StaticHost) builder.build());
            return this;
        }
    }

    static {
        AppSettings appSettings = new AppSettings();
        DEFAULT_INSTANCE = appSettings;
        GeneratedMessageLite.registerDefaultInstance(AppSettings.class, appSettings);
    }

    private AppSettings() {
        AbstractC2097h abstractC2097h = AbstractC2097h.f19285b;
        this.publicKey_ = abstractC2097h;
        this.secretKey_ = abstractC2097h;
        this.knownHosts_ = GeneratedMessageLite.emptyProtobufList();
        this.lastOpenedDeviceRawID_ = "";
        this.staticHost_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKnownHosts(Iterable<? extends KnownHost> iterable) {
        ensureKnownHostsIsMutable();
        AbstractC2086a.addAll((Iterable) iterable, (List) this.knownHosts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStaticHost(Iterable<? extends StaticHost> iterable) {
        ensureStaticHostIsMutable();
        AbstractC2086a.addAll((Iterable) iterable, (List) this.staticHost_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKnownHosts(KnownHost knownHost) {
        knownHost.getClass();
        ensureKnownHostsIsMutable();
        this.knownHosts_.add(knownHost);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStaticHost(StaticHost staticHost) {
        staticHost.getClass();
        ensureStaticHostIsMutable();
        this.staticHost_.add(staticHost);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppMetrics() {
        this.appMetrics_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppUpdates() {
        this.appUpdates_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsForcedProUser() {
        this.bitField0_ &= -3;
        this.isForcedProUser_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsProUser() {
        this.isProUser_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKnownHosts() {
        this.knownHosts_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastOpenedDeviceRawID() {
        this.bitField0_ &= -2;
        this.lastOpenedDeviceRawID_ = getDefaultInstance().getLastOpenedDeviceRawID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = getDefaultInstance().getPublicKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecretKey() {
        this.secretKey_ = getDefaultInstance().getSecretKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStaticHost() {
        this.staticHost_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureKnownHostsIsMutable() {
        A.j jVar = this.knownHosts_;
        if (jVar.C()) {
            return;
        }
        this.knownHosts_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureStaticHostIsMutable() {
        A.j jVar = this.staticHost_;
        if (jVar.C()) {
            return;
        }
        this.staticHost_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static AppSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppMetrics(AppMetrics appMetrics) {
        appMetrics.getClass();
        AppMetrics appMetrics2 = this.appMetrics_;
        if (appMetrics2 == null || appMetrics2 == AppMetrics.getDefaultInstance()) {
            this.appMetrics_ = appMetrics;
        } else {
            this.appMetrics_ = (AppMetrics) ((AppMetrics.Builder) AppMetrics.newBuilder(this.appMetrics_).mergeFrom((GeneratedMessageLite) appMetrics)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppUpdates(AppUpdates appUpdates) {
        appUpdates.getClass();
        AppUpdates appUpdates2 = this.appUpdates_;
        if (appUpdates2 == null || appUpdates2 == AppUpdates.getDefaultInstance()) {
            this.appUpdates_ = appUpdates;
        } else {
            this.appUpdates_ = (AppUpdates) ((AppUpdates.Builder) AppUpdates.newBuilder(this.appUpdates_).mergeFrom((GeneratedMessageLite) appUpdates)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AppSettings parseDelimitedFrom(InputStream inputStream) {
        return (AppSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AppSettings parseFrom(ByteBuffer byteBuffer) {
        return (AppSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeKnownHosts(int i8) {
        ensureKnownHostsIsMutable();
        this.knownHosts_.remove(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStaticHost(int i8) {
        ensureStaticHostIsMutable();
        this.staticHost_.remove(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppMetrics(AppMetrics appMetrics) {
        appMetrics.getClass();
        this.appMetrics_ = appMetrics;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppUpdates(AppUpdates appUpdates) {
        appUpdates.getClass();
        this.appUpdates_ = appUpdates;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsForcedProUser(boolean z8) {
        this.bitField0_ |= 2;
        this.isForcedProUser_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsProUser(boolean z8) {
        this.isProUser_ = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKnownHosts(int i8, KnownHost knownHost) {
        knownHost.getClass();
        ensureKnownHostsIsMutable();
        this.knownHosts_.set(i8, knownHost);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastOpenedDeviceRawID(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.lastOpenedDeviceRawID_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastOpenedDeviceRawIDBytes(AbstractC2097h abstractC2097h) {
        AbstractC2086a.checkByteStringIsUtf8(abstractC2097h);
        this.lastOpenedDeviceRawID_ = abstractC2097h.T();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKey(AbstractC2097h abstractC2097h) {
        abstractC2097h.getClass();
        this.publicKey_ = abstractC2097h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretKey(AbstractC2097h abstractC2097h) {
        abstractC2097h.getClass();
        this.secretKey_ = abstractC2097h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStaticHost(int i8, StaticHost staticHost) {
        staticHost.getClass();
        ensureStaticHostIsMutable();
        this.staticHost_.set(i8, staticHost);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        g0 cVar;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[fVar.ordinal()]) {
            case 1:
                return new AppSettings();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001\n\u0002\n\u0003\u001b\u0004ለ\u0000\u0005\u0007\u0006ဇ\u0001\u0007\u001b\bဉ\u0002\tဉ\u0003", new Object[]{"bitField0_", "publicKey_", "secretKey_", "knownHosts_", KnownHost.class, "lastOpenedDeviceRawID_", "isProUser_", "isForcedProUser_", "staticHost_", StaticHost.class, "appMetrics_", "appUpdates_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                g0 g0Var = PARSER;
                if (g0Var != null) {
                    return g0Var;
                }
                synchronized (AppSettings.class) {
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

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public AppMetrics getAppMetrics() {
        AppMetrics appMetrics = this.appMetrics_;
        return appMetrics == null ? AppMetrics.getDefaultInstance() : appMetrics;
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public AppUpdates getAppUpdates() {
        AppUpdates appUpdates = this.appUpdates_;
        return appUpdates == null ? AppUpdates.getDefaultInstance() : appUpdates;
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public boolean getIsForcedProUser() {
        return this.isForcedProUser_;
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public boolean getIsProUser() {
        return this.isProUser_;
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public KnownHost getKnownHosts(int i8) {
        return (KnownHost) this.knownHosts_.get(i8);
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public int getKnownHostsCount() {
        return this.knownHosts_.size();
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public List<KnownHost> getKnownHostsList() {
        return this.knownHosts_;
    }

    public KnownHostOrBuilder getKnownHostsOrBuilder(int i8) {
        return (KnownHostOrBuilder) this.knownHosts_.get(i8);
    }

    public List<? extends KnownHostOrBuilder> getKnownHostsOrBuilderList() {
        return this.knownHosts_;
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public String getLastOpenedDeviceRawID() {
        return this.lastOpenedDeviceRawID_;
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public AbstractC2097h getLastOpenedDeviceRawIDBytes() {
        return AbstractC2097h.E(this.lastOpenedDeviceRawID_);
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public AbstractC2097h getPublicKey() {
        return this.publicKey_;
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public AbstractC2097h getSecretKey() {
        return this.secretKey_;
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public StaticHost getStaticHost(int i8) {
        return (StaticHost) this.staticHost_.get(i8);
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public int getStaticHostCount() {
        return this.staticHost_.size();
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public List<StaticHost> getStaticHostList() {
        return this.staticHost_;
    }

    public StaticHostOrBuilder getStaticHostOrBuilder(int i8) {
        return (StaticHostOrBuilder) this.staticHost_.get(i8);
    }

    public List<? extends StaticHostOrBuilder> getStaticHostOrBuilderList() {
        return this.staticHost_;
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public boolean hasAppMetrics() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public boolean hasAppUpdates() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public boolean hasIsForcedProUser() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.elgato.streamdeck.vsd2.AppSettingsOrBuilder
    public boolean hasLastOpenedDeviceRawID() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(AppSettings appSettings) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(appSettings);
    }

    public static AppSettings parseDelimitedFrom(InputStream inputStream, C2106q c2106q) {
        return (AppSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c2106q);
    }

    public static AppSettings parseFrom(ByteBuffer byteBuffer, C2106q c2106q) {
        return (AppSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c2106q);
    }

    public static AppSettings parseFrom(AbstractC2097h abstractC2097h) {
        return (AppSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKnownHosts(int i8, KnownHost knownHost) {
        knownHost.getClass();
        ensureKnownHostsIsMutable();
        this.knownHosts_.add(i8, knownHost);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStaticHost(int i8, StaticHost staticHost) {
        staticHost.getClass();
        ensureStaticHostIsMutable();
        this.staticHost_.add(i8, staticHost);
    }

    public static AppSettings parseFrom(AbstractC2097h abstractC2097h, C2106q c2106q) {
        return (AppSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2097h, c2106q);
    }

    public static AppSettings parseFrom(byte[] bArr) {
        return (AppSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AppSettings parseFrom(byte[] bArr, C2106q c2106q) {
        return (AppSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c2106q);
    }

    public static AppSettings parseFrom(InputStream inputStream) {
        return (AppSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AppSettings parseFrom(InputStream inputStream, C2106q c2106q) {
        return (AppSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c2106q);
    }

    public static AppSettings parseFrom(AbstractC2098i abstractC2098i) {
        return (AppSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i);
    }

    public static AppSettings parseFrom(AbstractC2098i abstractC2098i, C2106q c2106q) {
        return (AppSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC2098i, c2106q);
    }
}
