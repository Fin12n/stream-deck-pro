package com.elgato.streamdeck.vsd2;

import C6.G;
import D6.r;
import I0.mIk.efuWFSeiT;
import I6.l;
import P3.i;
import Q6.k;
import Q6.o;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import com.elgato.streamdeck.vsd2.connection.CryptoBox;
import com.elgato.vsd2.Messages;
import com.google.protobuf.AbstractC2097h;
import com.google.protobuf.GeneratedMessageLite;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1816w;
import p017b7.InterfaceC1812u;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p048f2.C2308k;
import p048f2.InterfaceC2305h;
import p048f2.InterfaceC2307j;
import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class AppSettingsStore {
    public static final Companion Companion = new Companion(null);
    private final InterfaceC2260f data;
    private final InterfaceC2307j dataStore;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        public final AppSettingsStore create(final CryptoBox cryptoBox, Function0 produceFile) {
            t.g(cryptoBox, "cryptoBox");
            t.g(produceFile, "produceFile");
            return new AppSettingsStore(C2308k.c(C2308k.f21599a, AppSettingsSerializer.INSTANCE, null, r.q(new InterfaceC2305h() { // from class: com.elgato.streamdeck.vsd2.AppSettingsStore$Companion$create$1
                @Override // p048f2.InterfaceC2305h
                public Object cleanUp(G6.d<? super G> dVar) {
                    return G.f1419a;
                }

                @Override // p048f2.InterfaceC2305h
                public /* bridge */ /* synthetic */ Object migrate(Object obj, G6.d dVar) {
                    return migrate((AppSettings) obj, (G6.d<? super AppSettings>) dVar);
                }

                @Override // p048f2.InterfaceC2305h
                public /* bridge */ /* synthetic */ Object shouldMigrate(Object obj, G6.d dVar) {
                    return shouldMigrate((AppSettings) obj, (G6.d<? super Boolean>) dVar);
                }

                public Object migrate(AppSettings appSettings, G6.d<? super AppSettings> dVar) {
                    CryptoBox.KeyPair keyPairCreateKeypair = cryptoBox.createKeypair();
                    GeneratedMessageLite generatedMessageLiteBuild = ((AppSettings.Builder) appSettings.toBuilder()).setPublicKey(AbstractC2097h.A(keyPairCreateKeypair.getPublicKey())).setSecretKey(AbstractC2097h.A(keyPairCreateKeypair.getSecretKey())).build();
                    t.f(generatedMessageLiteBuild, "build(...)");
                    return generatedMessageLiteBuild;
                }

                public Object shouldMigrate(AppSettings appSettings, G6.d<? super Boolean> dVar) {
                    return I6.b.a(appSettings.getPublicKey().isEmpty() || appSettings.getSecretKey().isEmpty());
                }
            }, new InterfaceC2305h() { // from class: com.elgato.streamdeck.vsd2.AppSettingsStore$Companion$create$2
                @Override // p048f2.InterfaceC2305h
                public Object cleanUp(G6.d<? super G> dVar) {
                    return G.f1419a;
                }

                @Override // p048f2.InterfaceC2305h
                public /* bridge */ /* synthetic */ Object migrate(Object obj, G6.d dVar) {
                    return migrate((AppSettings) obj, (G6.d<? super AppSettings>) dVar);
                }

                @Override // p048f2.InterfaceC2305h
                public /* bridge */ /* synthetic */ Object shouldMigrate(Object obj, G6.d dVar) {
                    return shouldMigrate((AppSettings) obj, (G6.d<? super Boolean>) dVar);
                }

                public Object migrate(AppSettings appSettings, G6.d<? super AppSettings> dVar) {
                    GeneratedMessageLite generatedMessageLiteBuild = ((AppSettings.Builder) appSettings.toBuilder()).setAppMetrics(((AppMetrics.Builder) appSettings.getAppMetrics().toBuilder()).setInstalledAt(P3.f.d())).build();
                    t.f(generatedMessageLiteBuild, "build(...)");
                    return generatedMessageLiteBuild;
                }

                public Object shouldMigrate(AppSettings appSettings, G6.d<? super Boolean> dVar) {
                    return I6.b.a(!appSettings.getAppMetrics().hasInstalledAt());
                }
            }), null, produceFile, 10, null));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$clearAppUpdates$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    @I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$clearAppUpdates$2", f = "AppSettingsStore.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends l implements o {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(G6.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d<G> create(Object obj, G6.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // Q6.o
        public final Object invoke(AppSettings appSettings, G6.d<? super AppSettings> dVar) {
            return ((AnonymousClass2) create(appSettings, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            GeneratedMessageLite generatedMessageLiteBuild = ((AppSettings.Builder) ((AppSettings) this.L$0).toBuilder()).clearAppUpdates().build();
            t.f(generatedMessageLiteBuild, "build(...)");
            return generatedMessageLiteBuild;
        }
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$keyPair$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    @I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore", f = "AppSettingsStore.kt", l = {97}, m = "keyPair")
    public static final class AnonymousClass1 extends I6.d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(G6.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppSettingsStore.this.keyPair(this);
        }
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$setKeyPair$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    @I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$setKeyPair$2", f = "AppSettingsStore.kt", l = {}, m = "invokeSuspend")
    public static final class C18582 extends l implements o {
        final /* synthetic */ CryptoBox.KeyPair $pair;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18582(CryptoBox.KeyPair keyPair, G6.d<? super C18582> dVar) {
            super(2, dVar);
            this.$pair = keyPair;
        }

        @Override // I6.a
        public final G6.d<G> create(Object obj, G6.d<?> dVar) {
            C18582 c18582 = new C18582(this.$pair, dVar);
            c18582.L$0 = obj;
            return c18582;
        }

        @Override // Q6.o
        public final Object invoke(AppSettings appSettings, G6.d<? super AppSettings> dVar) {
            return ((C18582) create(appSettings, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            GeneratedMessageLite generatedMessageLiteBuild = ((AppSettings.Builder) ((AppSettings) this.L$0).toBuilder()).setPublicKey(AbstractC2097h.A(this.$pair.getPublicKey())).setSecretKey(AbstractC2097h.A(this.$pair.getSecretKey())).build();
            t.f(generatedMessageLiteBuild, "build(...)");
            return generatedMessageLiteBuild;
        }
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$updateAppMetrics$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    @I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$updateAppMetrics$2", f = "AppSettingsStore.kt", l = {}, m = "invokeSuspend")
    public static final class C18592 extends l implements o {
        final /* synthetic */ k $updater;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18592(k kVar, G6.d<? super C18592> dVar) {
            super(2, dVar);
            this.$updater = kVar;
        }

        @Override // I6.a
        public final G6.d<G> create(Object obj, G6.d<?> dVar) {
            C18592 c18592 = new C18592(this.$updater, dVar);
            c18592.L$0 = obj;
            return c18592;
        }

        @Override // Q6.o
        public final Object invoke(AppSettings appSettings, G6.d<? super AppSettings> dVar) {
            return ((C18592) create(appSettings, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            AppSettings appSettings = (AppSettings) this.L$0;
            AppSettings.Builder builder = (AppSettings.Builder) appSettings.toBuilder();
            k kVar = this.$updater;
            GeneratedMessageLite.b builder2 = appSettings.getAppMetrics().toBuilder();
            t.f(builder2, "toBuilder(...)");
            GeneratedMessageLite generatedMessageLiteBuild = builder.setAppMetrics((AppMetrics.Builder) kVar.invoke(builder2)).build();
            t.f(generatedMessageLiteBuild, "build(...)");
            return generatedMessageLiteBuild;
        }
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$updateIsForcedProUser$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    @I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$updateIsForcedProUser$2", f = "AppSettingsStore.kt", l = {}, m = "invokeSuspend")
    public static final class C18602 extends l implements o {
        final /* synthetic */ Boolean $isForcedProUser;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18602(Boolean bool, G6.d<? super C18602> dVar) {
            super(2, dVar);
            this.$isForcedProUser = bool;
        }

        @Override // I6.a
        public final G6.d<G> create(Object obj, G6.d<?> dVar) {
            C18602 c18602 = new C18602(this.$isForcedProUser, dVar);
            c18602.L$0 = obj;
            return c18602;
        }

        @Override // Q6.o
        public final Object invoke(AppSettings appSettings, G6.d<? super AppSettings> dVar) {
            return ((C18602) create(appSettings, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            GeneratedMessageLite.b builder = ((AppSettings) this.L$0).toBuilder();
            Boolean bool = this.$isForcedProUser;
            AppSettings.Builder builder2 = (AppSettings.Builder) builder;
            if (bool == null) {
                builder2.clearIsForcedProUser();
            } else {
                builder2.setIsForcedProUser(bool.booleanValue());
            }
            GeneratedMessageLite generatedMessageLiteBuild = builder2.build();
            t.f(generatedMessageLiteBuild, "build(...)");
            return generatedMessageLiteBuild;
        }
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$updateIsProUser$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    @I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$updateIsProUser$2", f = "AppSettingsStore.kt", l = {}, m = "invokeSuspend")
    public static final class C18612 extends l implements o {
        final /* synthetic */ boolean $isProUser;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18612(boolean z8, G6.d<? super C18612> dVar) {
            super(2, dVar);
            this.$isProUser = z8;
        }

        @Override // I6.a
        public final G6.d<G> create(Object obj, G6.d<?> dVar) {
            C18612 c18612 = new C18612(this.$isProUser, dVar);
            c18612.L$0 = obj;
            return c18612;
        }

        @Override // Q6.o
        public final Object invoke(AppSettings appSettings, G6.d<? super AppSettings> dVar) {
            return ((C18612) create(appSettings, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            GeneratedMessageLite generatedMessageLiteBuild = ((AppSettings.Builder) ((AppSettings) this.L$0).toBuilder()).setIsProUser(this.$isProUser).build();
            t.f(generatedMessageLiteBuild, "build(...)");
            return generatedMessageLiteBuild;
        }
    }

    public AppSettingsStore(InterfaceC2307j dataStore) {
        t.g(dataStore, "dataStore");
        this.dataStore = dataStore;
        this.data = dataStore.a();
    }

    /* JADX INFO: renamed from: createOrUpdateDevice-DUA0qnw$default, reason: not valid java name */
    public static /* synthetic */ Object m95createOrUpdateDeviceDUA0qnw$default(AppSettingsStore appSettingsStore, String str, String str2, KnownHost.Device device, o oVar, G6.d dVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            device = AppSettingsStoreKt.DEFAULT_DEVICE;
        }
        return appSettingsStore.m96createOrUpdateDeviceDUA0qnw(str, str2, device, oVar, dVar);
    }

    public final Object clearAppUpdates(G6.d<? super G> dVar) {
        Object objB = this.dataStore.b(new AnonymousClass2(null), dVar);
        return objB == H6.c.f() ? objB : G.f1419a;
    }

    public final Object createOrUpdateAppUpdates(k kVar, G6.d<? super G> dVar) {
        Object objB = this.dataStore.b(new C18572(kVar, null), dVar);
        return objB == H6.c.f() ? objB : G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: createOrUpdateKnownHost-KF776PU, reason: not valid java name */
    public final Object m97createOrUpdateKnownHostKF776PU(String str, o oVar, G6.d<? super KnownHost> dVar) {
        AppSettingsStore$createOrUpdateKnownHost$1 appSettingsStore$createOrUpdateKnownHost$1;
        if (dVar instanceof AppSettingsStore$createOrUpdateKnownHost$1) {
            appSettingsStore$createOrUpdateKnownHost$1 = (AppSettingsStore$createOrUpdateKnownHost$1) dVar;
            int i8 = appSettingsStore$createOrUpdateKnownHost$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                appSettingsStore$createOrUpdateKnownHost$1.label = i8 - Integer.MIN_VALUE;
            } else {
                appSettingsStore$createOrUpdateKnownHost$1 = new AppSettingsStore$createOrUpdateKnownHost$1(this, dVar);
            }
        } else {
            appSettingsStore$createOrUpdateKnownHost$1 = new AppSettingsStore$createOrUpdateKnownHost$1(this, dVar);
        }
        Object objB = appSettingsStore$createOrUpdateKnownHost$1.result;
        Object objF = H6.c.f();
        int i9 = appSettingsStore$createOrUpdateKnownHost$1.label;
        if (i9 == 0) {
            C6.r.b(objB);
            InterfaceC2307j interfaceC2307j = this.dataStore;
            AppSettingsStore$createOrUpdateKnownHost$settings$1 appSettingsStore$createOrUpdateKnownHost$settings$1 = new AppSettingsStore$createOrUpdateKnownHost$settings$1(oVar, str, null);
            appSettingsStore$createOrUpdateKnownHost$1.L$0 = str;
            appSettingsStore$createOrUpdateKnownHost$1.label = 1;
            objB = interfaceC2307j.b(appSettingsStore$createOrUpdateKnownHost$settings$1, appSettingsStore$createOrUpdateKnownHost$1);
            if (objB == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) appSettingsStore$createOrUpdateKnownHost$1.L$0;
            C6.r.b(objB);
        }
        List<KnownHost> knownHostsList = ((AppSettings) objB).getKnownHostsList();
        t.f(knownHostsList, "getKnownHostsList(...)");
        for (Object obj : knownHostsList) {
            KnownHost knownHost = (KnownHost) obj;
            t.d(knownHost);
            if (i.d(P3.f.f(knownHost), str)) {
                t.f(obj, "first(...)");
                return obj;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: createOrUpdateStaticHost-KF776PU, reason: not valid java name */
    public final Object m98createOrUpdateStaticHostKF776PU(String str, o oVar, G6.d<? super StaticHost> dVar) {
        AppSettingsStore$createOrUpdateStaticHost$1 appSettingsStore$createOrUpdateStaticHost$1;
        if (dVar instanceof AppSettingsStore$createOrUpdateStaticHost$1) {
            appSettingsStore$createOrUpdateStaticHost$1 = (AppSettingsStore$createOrUpdateStaticHost$1) dVar;
            int i8 = appSettingsStore$createOrUpdateStaticHost$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                appSettingsStore$createOrUpdateStaticHost$1.label = i8 - Integer.MIN_VALUE;
            } else {
                appSettingsStore$createOrUpdateStaticHost$1 = new AppSettingsStore$createOrUpdateStaticHost$1(this, dVar);
            }
        } else {
            appSettingsStore$createOrUpdateStaticHost$1 = new AppSettingsStore$createOrUpdateStaticHost$1(this, dVar);
        }
        Object objB = appSettingsStore$createOrUpdateStaticHost$1.result;
        Object objF = H6.c.f();
        int i9 = appSettingsStore$createOrUpdateStaticHost$1.label;
        if (i9 == 0) {
            C6.r.b(objB);
            InterfaceC2307j interfaceC2307j = this.dataStore;
            AppSettingsStore$createOrUpdateStaticHost$settings$1 appSettingsStore$createOrUpdateStaticHost$settings$1 = new AppSettingsStore$createOrUpdateStaticHost$settings$1(oVar, str, null);
            appSettingsStore$createOrUpdateStaticHost$1.L$0 = str;
            appSettingsStore$createOrUpdateStaticHost$1.label = 1;
            objB = interfaceC2307j.b(appSettingsStore$createOrUpdateStaticHost$settings$1, appSettingsStore$createOrUpdateStaticHost$1);
            if (objB == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) appSettingsStore$createOrUpdateStaticHost$1.L$0;
            C6.r.b(objB);
        }
        List<StaticHost> staticHostList = ((AppSettings) objB).getStaticHostList();
        t.f(staticHostList, "getStaticHostList(...)");
        for (Object obj : staticHostList) {
            StaticHost staticHost = (StaticHost) obj;
            t.d(staticHost);
            if (i.d(P3.f.g(staticHost), str)) {
                t.f(obj, "first(...)");
                return obj;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: deleteKnownHostByID-ZDYjOP8, reason: not valid java name */
    public final Object m99deleteKnownHostByIDZDYjOP8(String str, G6.d<? super KnownHost> dVar) {
        AppSettingsStore$deleteKnownHostByID$1 appSettingsStore$deleteKnownHostByID$1;
        InterfaceC1812u interfaceC1812u;
        if (dVar instanceof AppSettingsStore$deleteKnownHostByID$1) {
            appSettingsStore$deleteKnownHostByID$1 = (AppSettingsStore$deleteKnownHostByID$1) dVar;
            int i8 = appSettingsStore$deleteKnownHostByID$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                appSettingsStore$deleteKnownHostByID$1.label = i8 - Integer.MIN_VALUE;
            } else {
                appSettingsStore$deleteKnownHostByID$1 = new AppSettingsStore$deleteKnownHostByID$1(this, dVar);
            }
        } else {
            appSettingsStore$deleteKnownHostByID$1 = new AppSettingsStore$deleteKnownHostByID$1(this, dVar);
        }
        Object obj = appSettingsStore$deleteKnownHostByID$1.result;
        Object objF = H6.c.f();
        int i9 = appSettingsStore$deleteKnownHostByID$1.label;
        if (i9 == 0) {
            C6.r.b(obj);
            InterfaceC1812u interfaceC1812uB = AbstractC1816w.b(null, 1, null);
            InterfaceC2307j interfaceC2307j = this.dataStore;
            AppSettingsStore$deleteKnownHostByID$2 appSettingsStore$deleteKnownHostByID$2 = new AppSettingsStore$deleteKnownHostByID$2(interfaceC1812uB, str, null);
            appSettingsStore$deleteKnownHostByID$1.L$0 = interfaceC1812uB;
            appSettingsStore$deleteKnownHostByID$1.label = 1;
            if (interfaceC2307j.b(appSettingsStore$deleteKnownHostByID$2, appSettingsStore$deleteKnownHostByID$1) != objF) {
                interfaceC1812u = interfaceC1812uB;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            return obj;
        }
        interfaceC1812u = (InterfaceC1812u) appSettingsStore$deleteKnownHostByID$1.L$0;
        C6.r.b(obj);
        appSettingsStore$deleteKnownHostByID$1.L$0 = null;
        appSettingsStore$deleteKnownHostByID$1.label = 2;
        Object objQ0 = interfaceC1812u.Q0(appSettingsStore$deleteKnownHostByID$1);
        return objQ0 == objF ? objF : objQ0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: deleteStaticHostByID-ZDYjOP8, reason: not valid java name */
    public final Object m100deleteStaticHostByIDZDYjOP8(String str, G6.d<? super StaticHost> dVar) {
        AppSettingsStore$deleteStaticHostByID$1 appSettingsStore$deleteStaticHostByID$1;
        InterfaceC1812u interfaceC1812u;
        if (dVar instanceof AppSettingsStore$deleteStaticHostByID$1) {
            appSettingsStore$deleteStaticHostByID$1 = (AppSettingsStore$deleteStaticHostByID$1) dVar;
            int i8 = appSettingsStore$deleteStaticHostByID$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                appSettingsStore$deleteStaticHostByID$1.label = i8 - Integer.MIN_VALUE;
            } else {
                appSettingsStore$deleteStaticHostByID$1 = new AppSettingsStore$deleteStaticHostByID$1(this, dVar);
            }
        } else {
            appSettingsStore$deleteStaticHostByID$1 = new AppSettingsStore$deleteStaticHostByID$1(this, dVar);
        }
        Object obj = appSettingsStore$deleteStaticHostByID$1.result;
        Object objF = H6.c.f();
        int i9 = appSettingsStore$deleteStaticHostByID$1.label;
        if (i9 == 0) {
            C6.r.b(obj);
            InterfaceC1812u interfaceC1812uB = AbstractC1816w.b(null, 1, null);
            InterfaceC2307j interfaceC2307j = this.dataStore;
            AppSettingsStore$deleteStaticHostByID$2 appSettingsStore$deleteStaticHostByID$2 = new AppSettingsStore$deleteStaticHostByID$2(interfaceC1812uB, str, null);
            appSettingsStore$deleteStaticHostByID$1.L$0 = interfaceC1812uB;
            appSettingsStore$deleteStaticHostByID$1.label = 1;
            if (interfaceC2307j.b(appSettingsStore$deleteStaticHostByID$2, appSettingsStore$deleteStaticHostByID$1) != objF) {
                interfaceC1812u = interfaceC1812uB;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            return obj;
        }
        interfaceC1812u = (InterfaceC1812u) appSettingsStore$deleteStaticHostByID$1.L$0;
        C6.r.b(obj);
        appSettingsStore$deleteStaticHostByID$1.L$0 = null;
        appSettingsStore$deleteStaticHostByID$1.label = 2;
        Object objQ0 = interfaceC1812u.Q0(appSettingsStore$deleteStaticHostByID$1);
        return objQ0 == objF ? objF : objQ0;
    }

    public final Object get(G6.d<? super AppSettings> dVar) {
        return AbstractC2262h.x(this.data, dVar);
    }

    public final InterfaceC2260f getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: getDeviceByID-qOAwsH0, reason: not valid java name */
    public final InterfaceC2260f m101getDeviceByIDqOAwsH0(final String id) {
        t.g(id, "id");
        final InterfaceC2260f interfaceC2260f = this.data;
        return AbstractC2262h.p(new InterfaceC2260f() { // from class: com.elgato.streamdeck.vsd2.AppSettingsStore$getDeviceByID-qOAwsH0$$inlined$map$1

            /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$getDeviceByID-qOAwsH0$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class AnonymousClass2<T> implements InterfaceC2261g {
                final /* synthetic */ String $id$inlined;
                final /* synthetic */ InterfaceC2261g $this_unsafeFlow;

                /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$getDeviceByID-qOAwsH0$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                @I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$getDeviceByID-qOAwsH0$$inlined$map$1$2", f = "AppSettingsStore.kt", l = {219}, m = "emit")
                public static final class AnonymousClass1 extends I6.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2261g interfaceC2261g, String str) {
                    this.$this_unsafeFlow = interfaceC2261g;
                    this.$id$inlined = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, G6.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    KnownHost.Device next;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i8 = anonymousClass1.label;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i8 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(dVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(dVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objF = H6.c.f();
                    int i9 = anonymousClass1.label;
                    if (i9 == 0) {
                        C6.r.b(obj2);
                        InterfaceC2261g interfaceC2261g = this.$this_unsafeFlow;
                        Iterator<KnownHost> it = ((AppSettings) obj).getKnownHostsList().iterator();
                        loop0: while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            KnownHost next2 = it.next();
                            if (!next2.hasDeletedAt()) {
                                Iterator<KnownHost.Device> it2 = next2.getDevicesList().iterator();
                                while (it2.hasNext()) {
                                    next = it2.next();
                                    t.d(next);
                                    if (P3.b.d(P3.f.e(next), this.$id$inlined)) {
                                        break loop0;
                                    }
                                }
                            }
                        }
                        anonymousClass1.label = 1;
                        if (interfaceC2261g.emit(next, anonymousClass1) == objF) {
                            return objF;
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj2);
                    }
                    return G.f1419a;
                }
            }

            @Override // p044e7.InterfaceC2260f
            public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                Object objCollect = interfaceC2260f.collect(new AnonymousClass2(interfaceC2261g, id), dVar);
                return objCollect == H6.c.f() ? objCollect : G.f1419a;
            }
        });
    }

    /* JADX INFO: renamed from: getDevicesByWorkstationID-jCyGMI4, reason: not valid java name */
    public final InterfaceC2260f m102getDevicesByWorkstationIDjCyGMI4(String id) {
        t.g(id, "id");
        final InterfaceC2260f interfaceC2260fM103getKnownHostByIDjCyGMI4 = m103getKnownHostByIDjCyGMI4(id);
        return new InterfaceC2260f() { // from class: com.elgato.streamdeck.vsd2.AppSettingsStore$getDevicesByWorkstationID-jCyGMI4$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$getDevicesByWorkstationID-jCyGMI4$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class AnonymousClass2<T> implements InterfaceC2261g {
                final /* synthetic */ InterfaceC2261g $this_unsafeFlow;

                /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$getDevicesByWorkstationID-jCyGMI4$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                @I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$getDevicesByWorkstationID-jCyGMI4$$inlined$mapNotNull$1$2", f = "AppSettingsStore.kt", l = {221}, m = "emit")
                public static final class AnonymousClass1 extends I6.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2261g interfaceC2261g) {
                    this.$this_unsafeFlow = interfaceC2261g;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, G6.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i8 = anonymousClass1.label;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i8 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(dVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(dVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objF = H6.c.f();
                    int i9 = anonymousClass1.label;
                    if (i9 == 0) {
                        C6.r.b(obj2);
                        InterfaceC2261g interfaceC2261g = this.$this_unsafeFlow;
                        KnownHost knownHost = (KnownHost) obj;
                        List<KnownHost.Device> devicesList = knownHost != null ? knownHost.getDevicesList() : null;
                        if (devicesList != null) {
                            anonymousClass1.label = 1;
                            if (interfaceC2261g.emit(devicesList, anonymousClass1) == objF) {
                                return objF;
                            }
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj2);
                    }
                    return G.f1419a;
                }
            }

            @Override // p044e7.InterfaceC2260f
            public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                Object objCollect = interfaceC2260fM103getKnownHostByIDjCyGMI4.collect(new AnonymousClass2(interfaceC2261g), dVar);
                return objCollect == H6.c.f() ? objCollect : G.f1419a;
            }
        };
    }

    /* JADX INFO: renamed from: getKnownHostByID-jCyGMI4, reason: not valid java name */
    public final InterfaceC2260f m103getKnownHostByIDjCyGMI4(final String id) {
        t.g(id, "id");
        final InterfaceC2260f interfaceC2260f = this.data;
        return AbstractC2262h.p(new InterfaceC2260f() { // from class: com.elgato.streamdeck.vsd2.AppSettingsStore$getKnownHostByID-jCyGMI4$$inlined$map$1

            /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$getKnownHostByID-jCyGMI4$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class AnonymousClass2<T> implements InterfaceC2261g {
                final /* synthetic */ String $id$inlined;
                final /* synthetic */ InterfaceC2261g $this_unsafeFlow;

                /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$getKnownHostByID-jCyGMI4$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                @I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$getKnownHostByID-jCyGMI4$$inlined$map$1$2", f = "AppSettingsStore.kt", l = {219}, m = "emit")
                public static final class AnonymousClass1 extends I6.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2261g interfaceC2261g, String str) {
                    this.$this_unsafeFlow = interfaceC2261g;
                    this.$id$inlined = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, G6.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    Object next;
                    KnownHost knownHost;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i8 = anonymousClass1.label;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i8 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(dVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(dVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objF = H6.c.f();
                    int i9 = anonymousClass1.label;
                    if (i9 == 0) {
                        C6.r.b(obj2);
                        InterfaceC2261g interfaceC2261g = this.$this_unsafeFlow;
                        List<KnownHost> knownHostsList = ((AppSettings) obj).getKnownHostsList();
                        t.f(knownHostsList, "getKnownHostsList(...)");
                        Iterator<T> it = knownHostsList.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            knownHost = (KnownHost) next;
                            t.d(knownHost);
                        } while (!i.d(P3.f.f(knownHost), this.$id$inlined));
                        anonymousClass1.label = 1;
                        if (interfaceC2261g.emit(next, anonymousClass1) == objF) {
                            return objF;
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj2);
                    }
                    return G.f1419a;
                }
            }

            @Override // p044e7.InterfaceC2260f
            public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                Object objCollect = interfaceC2260f.collect(new AnonymousClass2(interfaceC2261g, id), dVar);
                return objCollect == H6.c.f() ? objCollect : G.f1419a;
            }
        });
    }

    /* JADX INFO: renamed from: getStaticHostByID-jCyGMI4, reason: not valid java name */
    public final InterfaceC2260f m104getStaticHostByIDjCyGMI4(final String workstationID) {
        t.g(workstationID, "workstationID");
        final InterfaceC2260f interfaceC2260f = this.data;
        return AbstractC2262h.p(new InterfaceC2260f() { // from class: com.elgato.streamdeck.vsd2.AppSettingsStore$getStaticHostByID-jCyGMI4$$inlined$map$1

            /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$getStaticHostByID-jCyGMI4$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class AnonymousClass2<T> implements InterfaceC2261g {
                final /* synthetic */ InterfaceC2261g $this_unsafeFlow;
                final /* synthetic */ String $workstationID$inlined;

                /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$getStaticHostByID-jCyGMI4$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                @I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$getStaticHostByID-jCyGMI4$$inlined$map$1$2", f = "AppSettingsStore.kt", l = {219}, m = "emit")
                public static final class AnonymousClass1 extends I6.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2261g interfaceC2261g, String str) {
                    this.$this_unsafeFlow = interfaceC2261g;
                    this.$workstationID$inlined = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, G6.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    Object next;
                    StaticHost staticHost;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i8 = anonymousClass1.label;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i8 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(dVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(dVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objF = H6.c.f();
                    int i9 = anonymousClass1.label;
                    if (i9 == 0) {
                        C6.r.b(obj2);
                        InterfaceC2261g interfaceC2261g = this.$this_unsafeFlow;
                        List<StaticHost> staticHostList = ((AppSettings) obj).getStaticHostList();
                        t.f(staticHostList, "getStaticHostList(...)");
                        Iterator<T> it = staticHostList.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            staticHost = (StaticHost) next;
                            t.d(staticHost);
                        } while (!i.d(P3.f.g(staticHost), this.$workstationID$inlined));
                        anonymousClass1.label = 1;
                        if (interfaceC2261g.emit(next, anonymousClass1) == objF) {
                            return objF;
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj2);
                    }
                    return G.f1419a;
                }
            }

            @Override // p044e7.InterfaceC2260f
            public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                Object objCollect = interfaceC2260f.collect(new AnonymousClass2(interfaceC2261g, workstationID), dVar);
                return objCollect == H6.c.f() ? objCollect : G.f1419a;
            }
        });
    }

    public final Object setKeyPair(CryptoBox.KeyPair keyPair, G6.d<? super G> dVar) {
        Object objB = this.dataStore.b(new C18582(keyPair, null), dVar);
        return objB == H6.c.f() ? objB : G.f1419a;
    }

    public final Object updateAppMetrics(k kVar, G6.d<? super AppSettings> dVar) {
        return this.dataStore.b(new C18592(kVar, null), dVar);
    }

    /* JADX INFO: renamed from: updateDeviceList-KF776PU$vsd2, reason: not valid java name */
    public final Object m105updateDeviceListKF776PU$vsd2(String str, List<Messages.VirtualDevice> list, G6.d<? super G> dVar) {
        Object objB = this.dataStore.b(new AppSettingsStore$updateDeviceList$2(list, str, null), dVar);
        return objB == H6.c.f() ? objB : G.f1419a;
    }

    public final Object updateIsForcedProUser(Boolean bool, G6.d<? super G> dVar) {
        Object objB = this.dataStore.b(new C18602(bool, null), dVar);
        return objB == H6.c.f() ? objB : G.f1419a;
    }

    public final Object updateIsProUser(boolean z8, G6.d<? super G> dVar) {
        Object objB = this.dataStore.b(new C18612(z8, null), dVar);
        return objB == H6.c.f() ? objB : G.f1419a;
    }

    /* JADX INFO: renamed from: updateLastOpenedDeviceID-6V7edJQ, reason: not valid java name */
    public final Object m106updateLastOpenedDeviceID6V7edJQ(String str, G6.d<? super G> dVar) {
        Object objB = this.dataStore.b(new AppSettingsStore$updateLastOpenedDeviceID$2(str, null), dVar);
        return objB == H6.c.f() ? objB : G.f1419a;
    }

    /* JADX INFO: renamed from: com.elgato.streamdeck.vsd2.AppSettingsStore$createOrUpdateAppUpdates$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    @I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$createOrUpdateAppUpdates$2", f = "AppSettingsStore.kt", l = {}, m = "invokeSuspend")
    public static final class C18572 extends l implements o {
        final /* synthetic */ k $updater;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18572(k kVar, G6.d<? super C18572> dVar) {
            super(2, dVar);
            this.$updater = kVar;
        }

        @Override // I6.a
        public final G6.d<G> create(Object obj, G6.d<?> dVar) {
            C18572 c18572 = new C18572(this.$updater, dVar);
            c18572.L$0 = obj;
            return c18572;
        }

        @Override // Q6.o
        public final Object invoke(AppSettings appSettings, G6.d<? super AppSettings> dVar) {
            return ((C18572) create(appSettings, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            AppUpdates appUpdates;
            H6.c.f();
            if (this.label == 0) {
                C6.r.b(obj);
                AppSettings appSettings = (AppSettings) this.L$0;
                GeneratedMessageLite.b builder = appSettings.toBuilder();
                k kVar = this.$updater;
                AppSettings.Builder builder2 = (AppSettings.Builder) builder;
                if (appSettings.hasAppUpdates()) {
                    AppUpdates appUpdates2 = appSettings.getAppUpdates();
                    t.f(appUpdates2, "getAppUpdates(...)");
                    appUpdates = (AppUpdates) kVar.invoke(appUpdates2);
                } else {
                    AppUpdates defaultInstance = AppUpdates.getDefaultInstance();
                    t.f(defaultInstance, efuWFSeiT.fxyegKhJ);
                    appUpdates = (AppUpdates) kVar.invoke(defaultInstance);
                }
                builder2.setAppUpdates(appUpdates);
                GeneratedMessageLite generatedMessageLiteBuild = builder2.build();
                t.f(generatedMessageLiteBuild, uYOhHhTXuF.brqnjyehIEuLZQ);
                return generatedMessageLiteBuild;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: createOrUpdateDevice-DUA0qnw, reason: not valid java name */
    public final Object m96createOrUpdateDeviceDUA0qnw(String str, String str2, KnownHost.Device device, o oVar, G6.d<? super KnownHost.Device> dVar) {
        AppSettingsStore$createOrUpdateDevice$1 appSettingsStore$createOrUpdateDevice$1;
        String str3;
        String str4;
        Object obj;
        Object next;
        List<KnownHost.Device> devicesList;
        KnownHost knownHost;
        if (dVar instanceof AppSettingsStore$createOrUpdateDevice$1) {
            appSettingsStore$createOrUpdateDevice$1 = (AppSettingsStore$createOrUpdateDevice$1) dVar;
            int i8 = appSettingsStore$createOrUpdateDevice$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                appSettingsStore$createOrUpdateDevice$1.label = i8 - Integer.MIN_VALUE;
            } else {
                appSettingsStore$createOrUpdateDevice$1 = new AppSettingsStore$createOrUpdateDevice$1(this, dVar);
            }
        } else {
            appSettingsStore$createOrUpdateDevice$1 = new AppSettingsStore$createOrUpdateDevice$1(this, dVar);
        }
        Object objB = appSettingsStore$createOrUpdateDevice$1.result;
        Object objF = H6.c.f();
        int i9 = appSettingsStore$createOrUpdateDevice$1.label;
        if (i9 == 0) {
            C6.r.b(objB);
            InterfaceC2307j interfaceC2307j = this.dataStore;
            AppSettingsStore$createOrUpdateDevice$settings$1 appSettingsStore$createOrUpdateDevice$settings$1 = new AppSettingsStore$createOrUpdateDevice$settings$1(oVar, str2, str, device, null);
            appSettingsStore$createOrUpdateDevice$1.L$0 = str;
            appSettingsStore$createOrUpdateDevice$1.L$1 = str2;
            appSettingsStore$createOrUpdateDevice$1.label = 1;
            objB = interfaceC2307j.b(appSettingsStore$createOrUpdateDevice$settings$1, appSettingsStore$createOrUpdateDevice$1);
            if (objB == objF) {
                return objF;
            }
            str3 = str2;
            str4 = str;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) appSettingsStore$createOrUpdateDevice$1.L$1;
            str4 = (String) appSettingsStore$createOrUpdateDevice$1.L$0;
            C6.r.b(objB);
        }
        List<KnownHost> knownHostsList = ((AppSettings) objB).getKnownHostsList();
        t.f(knownHostsList, GOKsbdzhLhXAMt.HFQaLI);
        Iterator<T> it = knownHostsList.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            knownHost = (KnownHost) next;
            t.d(knownHost);
        } while (!i.d(P3.f.f(knownHost), str4));
        KnownHost knownHost2 = (KnownHost) next;
        if (knownHost2 == null || (devicesList = knownHost2.getDevicesList()) == null) {
            return null;
        }
        for (Object obj2 : devicesList) {
            KnownHost.Device device2 = (KnownHost.Device) obj2;
            t.d(device2);
            if (P3.b.d(P3.f.e(device2), str3)) {
                obj = obj2;
                break;
            }
        }
        return (KnownHost.Device) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object keyPair(G6.d<? super CryptoBox.KeyPair> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i8 = anonymousClass1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i8 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        Object objF = H6.c.f();
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            C6.r.b(obj);
            anonymousClass1.label = 1;
            obj = get(anonymousClass1);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException(HRHLwtyqJWz.UMBpn);
            }
            C6.r.b(obj);
        }
        AppSettings appSettings = (AppSettings) obj;
        byte[] bArrP = appSettings.getPublicKey().P();
        t.f(bArrP, "toByteArray(...)");
        byte[] bArrP2 = appSettings.getSecretKey().P();
        t.f(bArrP2, "toByteArray(...)");
        return new CryptoBox.KeyPair(bArrP, bArrP2);
    }
}
