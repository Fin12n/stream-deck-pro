package p162s3;

import A1.h;
import C6.G;
import L0.i;
import Q6.k;
import Q6.o;
import androidx.compose.foundation.layout.f;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p065h1.I0;
import p082j0.AbstractC2601e;
import p191w0.AbstractC3079p0;
import p191w0.N;
import p191w0.O;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f32903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device f32904b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, KnownHost.Device device) {
            super(0);
            this.f32903a = kVar;
            this.f32904b = device;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m252invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m252invoke() {
            this.f32903a.invoke(this.f32904b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f32905a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z8) {
            super(2);
            this.f32905a = z8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(2101646071, i8, -1, "com.elgato.streamdeck.discovery.DeviceRow.<anonymous> (DeviceRow.kt:37)");
            }
            if (this.f32905a) {
                interfaceC3163l.f(-249324885);
                AbstractC3079p0.a(I0.a(f.l(i.f4836a, h.m(24)), "device_row_opening_indicator"), 0L, 0.0f, 0L, 0, interfaceC3163l, 6, 30);
                interfaceC3163l.N();
            } else {
                interfaceC3163l.f(-249324648);
                AbstractC2601e.a(f.l(i.f4836a, h.m(24)), interfaceC3163l, 6);
                interfaceC3163l.N();
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f32906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N3.f.b f32907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device f32908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f32909d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f32910a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ N3.f.b f32911b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ KnownHost.Device f32912c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o oVar, N3.f.b bVar, KnownHost.Device device) {
                super(0);
                this.f32910a = oVar;
                this.f32911b = bVar;
                this.f32912c = device;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m253invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m253invoke() {
                this.f32910a.invoke(this.f32911b, this.f32912c);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ N3.f.b f32913a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ KnownHost.Device f32914b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(N3.f.b bVar, KnownHost.Device device) {
                super(2);
                this.f32913a = bVar;
                this.f32914b = device;
            }

            public final void b(InterfaceC3163l interfaceC3163l, int i8) {
                if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                    interfaceC3163l.z();
                    return;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(1790363157, i8, -1, "com.elgato.streamdeck.discovery.DeviceRow.<anonymous>.<anonymous> (DeviceRow.kt:56)");
                }
                U0.b bVarD = p101l1.c.d(p154r3.h.f32475Z, interfaceC3163l, 0);
                String strB = p101l1.f.b(p194w3.b.f37071x, interfaceC3163l, 0);
                i.a aVar = i.f4836a;
                I3.a aVar2 = I3.a.f3771a;
                String strE = this.f32913a.e();
                String displayName = this.f32914b.getDisplayName();
                t.f(displayName, "getDisplayName(...)");
                O.a(bVarD, strB, I0.a(aVar, aVar2.f(strE, displayName)), 0L, interfaceC3163l, 8, 8);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((InterfaceC3163l) obj, ((Number) obj2).intValue());
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o oVar, N3.f.b bVar, KnownHost.Device device, boolean z8) {
            super(2);
            this.f32906a = oVar;
            this.f32907b = bVar;
            this.f32908c = device;
            this.f32909d = z8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2000390024, i8, -1, "com.elgato.streamdeck.discovery.DeviceRow.<anonymous> (DeviceRow.kt:51)");
            }
            i iVarA = I0.a(i.f4836a, "device_row_button_info");
            interfaceC3163l.f(-249324448);
            boolean zR = interfaceC3163l.R(this.f32906a) | interfaceC3163l.R(this.f32907b) | interfaceC3163l.R(this.f32908c);
            o oVar = this.f32906a;
            N3.f.b bVar = this.f32907b;
            KnownHost.Device device = this.f32908c;
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = new a(oVar, bVar, device);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            N.a((Function0) objG, iVarA, this.f32909d, null, null, H0.c.b(interfaceC3163l, 1790363157, true, new b(this.f32907b, this.f32908c)), interfaceC3163l, 196656, 24);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: s3.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0739d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device f32915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N3.f.b f32916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f32917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f32918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f32919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ o f32920f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f32921g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f32922h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0739d(KnownHost.Device device, N3.f.b bVar, boolean z8, k kVar, boolean z9, o oVar, int i8, int i9) {
            super(2);
            this.f32915a = device;
            this.f32916b = bVar;
            this.f32917c = z8;
            this.f32918d = kVar;
            this.f32919e = z9;
            this.f32920f = oVar;
            this.f32921g = i8;
            this.f32922h = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            d.a(this.f32915a, this.f32916b, this.f32917c, this.f32918d, this.f32919e, this.f32920f, interfaceC3163l, F0.a(this.f32921g | 1), this.f32922h);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0183  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x0114  */
    /* JADX WARN: Code duplicated, block: B:84:0x0116  */
    /* JADX WARN: Code duplicated, block: B:87:0x011b  */
    /* JADX WARN: Code duplicated, block: B:88:0x011d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0126  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0179  */
    public static final void a(KnownHost.Device device, N3.f.b host, boolean z8, k onDeviceSelected, boolean z9, o onDeviceInfo, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objG;
        boolean z16;
        P0 p0V;
        t.g(device, "device");
        t.g(host, "host");
        t.g(onDeviceSelected, "onDeviceSelected");
        t.g(onDeviceInfo, "onDeviceInfo");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-860641893);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(device) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= interfaceC3163lP.R(host) ? 32 : 16;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            i10 |= interfaceC3163lP.c(z8) ? 256 : 128;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i10 |= interfaceC3163lP.l(onDeviceSelected) ? 2048 : 1024;
        }
        int i12 = i9 & 16;
        if (i12 == 0) {
            if ((57344 & i8) == 0) {
                z10 = z9;
                i10 |= interfaceC3163lP.c(z10) ? 16384 : 8192;
            }
            if ((i9 & 32) != 0) {
                if ((458752 & i8) == 0) {
                    if (interfaceC3163lP.l(onDeviceInfo)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                }
                if ((374491 & i10) == 74898 || !interfaceC3163lP.s()) {
                    if (i12 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-860641893, i10, -1, "com.elgato.streamdeck.discovery.DeviceRow (DeviceRow.kt:28)");
                    }
                    if (host.t() || z8) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    String displayName = device.getDisplayName();
                    i.a aVar = i.f4836a;
                    I3.a aVar2 = I3.a.f3771a;
                    String displayName2 = device.getDisplayName();
                    t.f(displayName2, "getDisplayName(...)");
                    i iVarA = I0.a(aVar, aVar2.e(displayName2));
                    interfaceC3163lP.f(-97034460);
                    if ((i10 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i10 & 14) == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    objG = interfaceC3163lP.g();
                    if (z15 || objG == InterfaceC3163l.f38803a.a()) {
                        objG = new a(onDeviceSelected, device);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    i iVarE = androidx.compose.foundation.d.e(iVarA, z12, null, null, (Function0) objG, 6, null);
                    boolean z17 = z12;
                    t.d(displayName);
                    boolean z18 = z11;
                    e.a(displayName, iVarE, null, z17, null, H0.c.b(interfaceC3163lP, 2101646071, true, new b(z11)), H0.c.b(interfaceC3163lP, -2000390024, true, new c(onDeviceInfo, host, device, z17)), interfaceC3163lP, 1769472, 20);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    z16 = z18;
                } else {
                    interfaceC3163lP.z();
                    z16 = z10;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new C0739d(device, host, z8, onDeviceSelected, z16, onDeviceInfo, i8, i9));
                }
            }
            i11 = 196608;
            i10 |= i11;
            if ((374491 & i10) == 74898) {
                if (i12 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-860641893, i10, -1, "com.elgato.streamdeck.discovery.DeviceRow (DeviceRow.kt:28)");
                }
                if (host.t()) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                String displayName3 = device.getDisplayName();
                i.a aVar3 = i.f4836a;
                I3.a aVar4 = I3.a.f3771a;
                String displayName4 = device.getDisplayName();
                t.f(displayName4, "getDisplayName(...)");
                i iVarA2 = I0.a(aVar3, aVar4.e(displayName4));
                interfaceC3163lP.f(-97034460);
                if ((i10 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i10 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objG = interfaceC3163lP.g();
                if (z15) {
                    objG = new a(onDeviceSelected, device);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(onDeviceSelected, device);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                i iVarE2 = androidx.compose.foundation.d.e(iVarA2, z12, null, null, (Function0) objG, 6, null);
                boolean z19 = z12;
                t.d(displayName3);
                boolean z110 = z11;
                e.a(displayName3, iVarE2, null, z19, null, H0.c.b(interfaceC3163lP, 2101646071, true, new b(z11)), H0.c.b(interfaceC3163lP, -2000390024, true, new c(onDeviceInfo, host, device, z19)), interfaceC3163lP, 1769472, 20);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                z16 = z110;
            } else {
                if (i12 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-860641893, i10, -1, "com.elgato.streamdeck.discovery.DeviceRow (DeviceRow.kt:28)");
                }
                if (host.t()) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                String displayName5 = device.getDisplayName();
                i.a aVar5 = i.f4836a;
                I3.a aVar6 = I3.a.f3771a;
                String displayName6 = device.getDisplayName();
                t.f(displayName6, "getDisplayName(...)");
                i iVarA3 = I0.a(aVar5, aVar6.e(displayName6));
                interfaceC3163lP.f(-97034460);
                if ((i10 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i10 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objG = interfaceC3163lP.g();
                if (z15) {
                    objG = new a(onDeviceSelected, device);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(onDeviceSelected, device);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                i iVarE3 = androidx.compose.foundation.d.e(iVarA3, z12, null, null, (Function0) objG, 6, null);
                boolean z111 = z12;
                t.d(displayName5);
                boolean z112 = z11;
                e.a(displayName5, iVarE3, null, z111, null, H0.c.b(interfaceC3163lP, 2101646071, true, new b(z11)), H0.c.b(interfaceC3163lP, -2000390024, true, new c(onDeviceInfo, host, device, z111)), interfaceC3163lP, 1769472, 20);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                z16 = z112;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new C0739d(device, host, z8, onDeviceSelected, z16, onDeviceInfo, i8, i9));
            }
        }
        i10 |= 24576;
        z10 = z9;
        if ((i9 & 32) != 0) {
            if ((458752 & i8) == 0) {
                if (interfaceC3163lP.l(onDeviceInfo)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
            }
            if ((374491 & i10) == 74898) {
                if (i12 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-860641893, i10, -1, "com.elgato.streamdeck.discovery.DeviceRow (DeviceRow.kt:28)");
                }
                if (host.t()) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                String displayName7 = device.getDisplayName();
                i.a aVar7 = i.f4836a;
                I3.a aVar8 = I3.a.f3771a;
                String displayName8 = device.getDisplayName();
                t.f(displayName8, "getDisplayName(...)");
                i iVarA4 = I0.a(aVar7, aVar8.e(displayName8));
                interfaceC3163lP.f(-97034460);
                if ((i10 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i10 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objG = interfaceC3163lP.g();
                if (z15) {
                    objG = new a(onDeviceSelected, device);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(onDeviceSelected, device);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                i iVarE4 = androidx.compose.foundation.d.e(iVarA4, z12, null, null, (Function0) objG, 6, null);
                boolean z113 = z12;
                t.d(displayName7);
                boolean z114 = z11;
                e.a(displayName7, iVarE4, null, z113, null, H0.c.b(interfaceC3163lP, 2101646071, true, new b(z11)), H0.c.b(interfaceC3163lP, -2000390024, true, new c(onDeviceInfo, host, device, z113)), interfaceC3163lP, 1769472, 20);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                z16 = z114;
            } else {
                if (i12 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-860641893, i10, -1, "com.elgato.streamdeck.discovery.DeviceRow (DeviceRow.kt:28)");
                }
                if (host.t()) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                String displayName9 = device.getDisplayName();
                i.a aVar9 = i.f4836a;
                I3.a aVar10 = I3.a.f3771a;
                String displayName10 = device.getDisplayName();
                t.f(displayName10, "getDisplayName(...)");
                i iVarA5 = I0.a(aVar9, aVar10.e(displayName10));
                interfaceC3163lP.f(-97034460);
                if ((i10 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i10 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objG = interfaceC3163lP.g();
                if (z15) {
                    objG = new a(onDeviceSelected, device);
                    interfaceC3163lP.H(objG);
                } else {
                    objG = new a(onDeviceSelected, device);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                i iVarE5 = androidx.compose.foundation.d.e(iVarA5, z12, null, null, (Function0) objG, 6, null);
                boolean z115 = z12;
                t.d(displayName9);
                boolean z116 = z11;
                e.a(displayName9, iVarE5, null, z115, null, H0.c.b(interfaceC3163lP, 2101646071, true, new b(z11)), H0.c.b(interfaceC3163lP, -2000390024, true, new c(onDeviceInfo, host, device, z115)), interfaceC3163lP, 1769472, 20);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                z16 = z116;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new C0739d(device, host, z8, onDeviceSelected, z16, onDeviceInfo, i8, i9));
            }
        }
        i11 = 196608;
        i10 |= i11;
        if ((374491 & i10) == 74898) {
            if (i12 != 0) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-860641893, i10, -1, "com.elgato.streamdeck.discovery.DeviceRow (DeviceRow.kt:28)");
            }
            if (host.t()) {
                z12 = false;
            } else {
                z12 = false;
            }
            String displayName11 = device.getDisplayName();
            i.a aVar11 = i.f4836a;
            I3.a aVar12 = I3.a.f3771a;
            String displayName12 = device.getDisplayName();
            t.f(displayName12, "getDisplayName(...)");
            i iVarA6 = I0.a(aVar11, aVar12.e(displayName12));
            interfaceC3163lP.f(-97034460);
            if ((i10 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i10 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z13 | z14;
            objG = interfaceC3163lP.g();
            if (z15) {
                objG = new a(onDeviceSelected, device);
                interfaceC3163lP.H(objG);
            } else {
                objG = new a(onDeviceSelected, device);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            i iVarE6 = androidx.compose.foundation.d.e(iVarA6, z12, null, null, (Function0) objG, 6, null);
            boolean z117 = z12;
            t.d(displayName11);
            boolean z118 = z11;
            e.a(displayName11, iVarE6, null, z117, null, H0.c.b(interfaceC3163lP, 2101646071, true, new b(z11)), H0.c.b(interfaceC3163lP, -2000390024, true, new c(onDeviceInfo, host, device, z117)), interfaceC3163lP, 1769472, 20);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            z16 = z118;
        } else {
            if (i12 != 0) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-860641893, i10, -1, "com.elgato.streamdeck.discovery.DeviceRow (DeviceRow.kt:28)");
            }
            if (host.t()) {
                z12 = false;
            } else {
                z12 = false;
            }
            String displayName13 = device.getDisplayName();
            i.a aVar13 = i.f4836a;
            I3.a aVar14 = I3.a.f3771a;
            String displayName14 = device.getDisplayName();
            t.f(displayName14, "getDisplayName(...)");
            i iVarA7 = I0.a(aVar13, aVar14.e(displayName14));
            interfaceC3163lP.f(-97034460);
            if ((i10 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i10 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z13 | z14;
            objG = interfaceC3163lP.g();
            if (z15) {
                objG = new a(onDeviceSelected, device);
                interfaceC3163lP.H(objG);
            } else {
                objG = new a(onDeviceSelected, device);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            i iVarE7 = androidx.compose.foundation.d.e(iVarA7, z12, null, null, (Function0) objG, 6, null);
            boolean z119 = z12;
            t.d(displayName13);
            boolean z1110 = z11;
            e.a(displayName13, iVarE7, null, z119, null, H0.c.b(interfaceC3163lP, 2101646071, true, new b(z11)), H0.c.b(interfaceC3163lP, -2000390024, true, new c(onDeviceInfo, host, device, z119)), interfaceC3163lP, 1769472, 20);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            z16 = z1110;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new C0739d(device, host, z8, onDeviceSelected, z16, onDeviceInfo, i8, i9));
        }
    }
}
