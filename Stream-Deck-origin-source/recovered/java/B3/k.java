package B3;

import C6.G;
import Q6.o;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p065h1.I0;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device f1191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f1192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f1193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Q6.k f1194d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function0 f1195e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function0 f1196f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f1197g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KnownHost.Device device, boolean z8, Function0 function0, Q6.k kVar, Function0 function1, Function0 function2, int i8) {
            super(2);
            this.f1191a = device;
            this.f1192b = z8;
            this.f1193c = function0;
            this.f1194d = kVar;
            this.f1195e = function1;
            this.f1196f = function2;
            this.f1197g = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            k.a(this.f1191a, this.f1192b, this.f1193c, this.f1194d, this.f1195e, this.f1196f, interfaceC3163l, F0.a(this.f1197g | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(KnownHost.Device device, boolean z8, Function0 onLayout, Q6.k kVar, Function0 onOrientation, Function0 function0, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        t.g(device, "device");
        t.g(onLayout, "onLayout");
        t.g(kVar, cFAYKUlMj.YbSuRxgilGcwrRa);
        t.g(onOrientation, "onOrientation");
        t.g(function0, LYdqVGvOGMNr.ykoGvbtZBXvEwyn);
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1922203056);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(device) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.c(z8) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i9 |= interfaceC3163lP.l(onLayout) ? 256 : 128;
        }
        if ((i8 & 7168) == 0) {
            i9 |= interfaceC3163lP.l(kVar) ? 2048 : 1024;
        }
        if ((57344 & i8) == 0) {
            i9 |= interfaceC3163lP.l(onOrientation) ? 16384 : 8192;
        }
        if ((458752 & i8) == 0) {
            i9 |= interfaceC3163lP.l(function0) ? 131072 : 65536;
        }
        if ((374491 & i9) == 74898 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1922203056, i9, -1, "com.elgato.streamdeck.settings.VirtualDeviceSettings (VirtualDeviceSettings.kt:27)");
            }
            int i10 = p194w3.b.f36933A1;
            int i11 = p154r3.h.f32473X;
            String str = device.getKeypadColumns() + " x " + device.getKeypadRows();
            L0.i.a aVar = L0.i.f4836a;
            int i12 = i9;
            e.a(I0.a(aVar, "settings_layout"), Integer.valueOf(i10), null, Integer.valueOf(i11), str, null, false, null, onLayout, interfaceC3163lP, ((i9 << 18) & 234881024) | 6, 228);
            J3.j.a(0.0f, interfaceC3163lP, 0, 1);
            int i13 = p194w3.b.f36936B1;
            int i14 = p154r3.h.f32483d0;
            KnownHost.Device.KeypadOrientationOption keypadRotation = device.getKeypadRotation();
            t.f(keypadRotation, "getKeypadRotation(...)");
            e.a(I0.a(aVar, "settings_orientation"), Integer.valueOf(i13), null, Integer.valueOf(i14), p101l1.f.b(j.e(keypadRotation), interfaceC3163lP, 0), null, false, null, onOrientation, interfaceC3163lP, ((i12 << 12) & 234881024) | 6, 228);
            J3.j.a(0.0f, interfaceC3163lP, 0, 1);
            KnownHost.Device.Appearance appearance = device.getAppearance();
            t.f(appearance, "getAppearance(...)");
            B3.a.a(appearance, kVar, null, interfaceC3163lP, (i12 >> 6) & 112, 4);
            J3.j.a(0.0f, interfaceC3163lP, 0, 1);
            int i15 = p194w3.b.f37079z1;
            int i16 = p154r3.h.f32474Y;
            String strC = C3.e.c(device, z8);
            interfaceC3163lP.f(-368417824);
            if (strC == null) {
                strC = p101l1.f.b(p194w3.b.f37006b0, interfaceC3163lP, 0);
            }
            interfaceC3163lP.N();
            e.a(I0.a(aVar, "settings_faceplates"), Integer.valueOf(i15), null, Integer.valueOf(i16), strC, null, false, null, function0, interfaceC3163lP, ((i12 << 9) & 234881024) | 6, 228);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(device, z8, onLayout, kVar, onOrientation, function0, i8));
        }
    }
}
