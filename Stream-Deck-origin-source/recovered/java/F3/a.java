package F3;

import A5.h;
import C6.G;
import Q6.k;
import Q6.o;
import V3.j;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import com.elgato.streamdeck.DiKt;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p082j0.T;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends p210y3.a implements p210y3.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0113a f2365b = new C0113a(null);

    /* JADX INFO: renamed from: F3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0113a {
        public /* synthetic */ C0113a(AbstractC2633k abstractC2633k) {
            this();
        }

        public C0113a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b extends C2639q implements k {
        public b(Object obj) {
            super(1, obj, T3.a.class, "selectOrientation", "selectOrientation(Lcom/elgato/streamdeck/vsd2/KnownHost$Device$KeypadOrientationOption;)V", 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            h((KnownHost.Device.KeypadOrientationOption) obj);
            return G.f1419a;
        }

        public final void h(KnownHost.Device.KeypadOrientationOption keypadOrientationOption) {
            t.g(keypadOrientationOption, ZWZaxQrCHfNe.KUVC);
            ((T3.a) this.receiver).i(keypadOrientationOption);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2367b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i8) {
            super(2);
            this.f2367b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
            a.this.m(interfaceC3163l, F0.a(this.f2367b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws A5.f {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T3.a f2368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device f2369b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(T3.a aVar, KnownHost.Device device) {
            super(0);
            this.f2368a = aVar;
            this.f2369b = device;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j invoke() {
            KnownHost.Device.KeypadOrientationOption keypadRotation = ((T3.a.C0274a) this.f2368a.e().getValue()).a().getKeypadRotation();
            if (this.f2369b.getKeypadRotation() == keypadRotation) {
                return null;
            }
            C0113a c0113a = a.f2365b;
            t.d(keypadRotation);
            return F3.b.j(c0113a, defpackage.a.e(keypadRotation), P3.f.h(this.f2369b), P3.f.j(this.f2369b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T3.a f2371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device f2372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f2373d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(T3.a aVar, KnownHost.Device device, int i8) {
            super(2);
            this.f2371b = aVar;
            this.f2372c = device;
            this.f2373d = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            a.this.a(this.f2371b, this.f2372c, interfaceC3163l, F0.a(this.f2373d | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2375b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i8) {
            super(2);
            this.f2375b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            a.this.u(interfaceC3163l, F0.a(this.f2375b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public final void a(T3.a aVar, KnownHost.Device device, InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1278922193);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1278922193, i8, -1, "com.elgato.streamdeck.settings.orientation.OrientationSelectionScreen.SetupTracking (OrientationSelectionScreen.kt:88)");
        }
        H3.e.a(new d(aVar, device), interfaceC3163lP, 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new e(aVar, device, i8));
        }
    }

    @Override // T2.a
    public void m(InterfaceC3163l interfaceC3163l, int i8) throws A5.f {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(409483956);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(this) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(409483956, i9, -1, "com.elgato.streamdeck.settings.orientation.OrientationSelectionScreen.Content (OrientationSelectionScreen.kt:72)");
            }
            interfaceC3163lP.f(1853070191);
            A5.a aVar = new A5.a(T3.a.class, false, null, null);
            h hVar = (h) interfaceC3163lP.e(DiKt.d());
            interfaceC3163lP.f(1468160259);
            Object objG = interfaceC3163lP.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = hVar.h(aVar, null);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            interfaceC3163lP.N();
            T3.a aVar2 = (T3.a) objG;
            KnownHost.Device deviceA = ((T3.a.C0274a) p137p2.a.b(aVar2.e(), null, null, null, interfaceC3163lP, 8, 7).getValue()).a();
            a(aVar2, deviceA, interfaceC3163lP, ((i9 << 6) & 896) | 8);
            KnownHost.Device.KeypadOrientationOption keypadRotation = deviceA.getKeypadRotation();
            t.f(keypadRotation, "getKeypadRotation(...)");
            F3.b.d(keypadRotation, new b(aVar2), interfaceC3163lP, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(i8));
        }
    }

    @Override // p210y3.b
    public void s(T t8, InterfaceC3163l interfaceC3163l, int i8) {
        y3.b.a.a(this, t8, interfaceC3163l, i8);
    }

    @Override // p210y3.b
    public void u(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(696278325);
        if ((i8 & 1) == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(696278325, i8, -1, "com.elgato.streamdeck.settings.orientation.OrientationSelectionScreen.Title (OrientationSelectionScreen.kt:69)");
            }
            p210y3.c.a(p194w3.b.f37045o0, null, interfaceC3163lP, 0, 2);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new f(i8));
        }
    }
}
