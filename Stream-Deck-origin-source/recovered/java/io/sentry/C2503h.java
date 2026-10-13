package io.sentry;

import io.sentry.protocol.C2541c;
import io.sentry.util.C2574f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.sentry.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2503h implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f27160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f27161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f27162c;

    /* JADX INFO: renamed from: io.sentry.h$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27163a;

        static {
            int[] iArr = new int[EnumC2556s1.values().length];
            f27163a = iArr;
            try {
                iArr[EnumC2556s1.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27163a[EnumC2556s1.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27163a[EnumC2556s1.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27163a[EnumC2556s1.COMBINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C2503h(V v8, V v9, V v10) {
        this.f27160a = v8;
        this.f27161b = v9;
        this.f27162c = v10;
    }

    @Override // io.sentry.V
    public void A(C2557s2 c2557s2) {
        this.f27160a.A(c2557s2);
    }

    @Override // io.sentry.V
    public C2541c B() {
        return new C2499g(this.f27160a.B(), this.f27161b.B(), this.f27162c.B(), b().getDefaultScopeType());
    }

    @Override // io.sentry.V
    public C2505h1 C(C2533o1.a aVar) {
        return i().C(aVar);
    }

    @Override // io.sentry.V
    public String D() {
        String strD = this.f27162c.D();
        if (strD != null) {
            return strD;
        }
        String strD2 = this.f27161b.D();
        return strD2 != null ? strD2 : this.f27160a.D();
    }

    @Override // io.sentry.V
    public void E(C2533o1.c cVar) {
        i().E(cVar);
    }

    @Override // io.sentry.V
    public void F(io.sentry.protocol.u uVar) {
        this.f27160a.F(uVar);
        this.f27161b.F(uVar);
        this.f27162c.F(uVar);
    }

    @Override // io.sentry.V
    public void G(InterfaceC2496f0 interfaceC2496f0) {
        i().G(interfaceC2496f0);
    }

    @Override // io.sentry.V
    public List H() {
        List listH = this.f27162c.H();
        if (!listH.isEmpty()) {
            return listH;
        }
        List listH2 = this.f27161b.H();
        return !listH2.isEmpty() ? listH2 : this.f27160a.H();
    }

    @Override // io.sentry.V
    public io.sentry.protocol.F I() {
        io.sentry.protocol.F fI = this.f27162c.I();
        if (fI != null) {
            return fI;
        }
        io.sentry.protocol.F fI2 = this.f27161b.I();
        return fI2 != null ? fI2 : this.f27160a.I();
    }

    @Override // io.sentry.V
    public io.sentry.protocol.l J() {
        io.sentry.protocol.l lVarJ = this.f27162c.J();
        if (lVarJ != null) {
            return lVarJ;
        }
        io.sentry.protocol.l lVarJ2 = this.f27161b.J();
        return lVarJ2 != null ? lVarJ2 : this.f27160a.J();
    }

    @Override // io.sentry.V
    public List K() {
        return C2574f.a(y());
    }

    @Override // io.sentry.V
    public String L() {
        String strL = this.f27162c.L();
        if (strL != null) {
            return strL;
        }
        String strL2 = this.f27161b.L();
        return strL2 != null ? strL2 : this.f27160a.L();
    }

    @Override // io.sentry.V
    public void M(C2505h1 c2505h1) {
        i().M(c2505h1);
    }

    public V N(EnumC2556s1 enumC2556s1) {
        if (enumC2556s1 != null) {
            int i8 = a.f27163a[enumC2556s1.ordinal()];
            if (i8 == 1) {
                return this.f27162c;
            }
            if (i8 == 2) {
                return this.f27161b;
            }
            if (i8 == 3) {
                return this.f27160a;
            }
            if (i8 == 4) {
                return this;
            }
        }
        int i9 = a.f27163a[b().getDefaultScopeType().ordinal()];
        if (i9 == 1) {
            return this.f27162c;
        }
        if (i9 != 2) {
            return i9 != 3 ? this.f27162c : this.f27160a;
        }
        return this.f27161b;
    }

    @Override // io.sentry.V
    public void a(String str, String str2) {
        i().a(str, str2);
    }

    @Override // io.sentry.V
    public J2 b() {
        return this.f27160a.b();
    }

    @Override // io.sentry.V
    public void c(io.sentry.protocol.F f8) {
        i().c(f8);
    }

    @Override // io.sentry.V
    public void clear() {
        i().clear();
    }

    @Override // io.sentry.V
    public void d(String str, String str2) {
        i().d(str, str2);
    }

    @Override // io.sentry.V
    public void e(C2491e c2491e, H h8) {
        i().e(c2491e, h8);
    }

    @Override // io.sentry.V
    public void f(Throwable th, InterfaceC2488d0 interfaceC2488d0, String str) {
        this.f27160a.f(th, interfaceC2488d0, str);
    }

    @Override // io.sentry.V
    public void g(io.sentry.protocol.u uVar) {
        i().g(uVar);
    }

    @Override // io.sentry.V
    public Map getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f27160a.getExtras());
        concurrentHashMap.putAll(this.f27161b.getExtras());
        concurrentHashMap.putAll(this.f27162c.getExtras());
        return concurrentHashMap;
    }

    @Override // io.sentry.V
    public Map getTags() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f27160a.getTags());
        concurrentHashMap.putAll(this.f27161b.getTags());
        concurrentHashMap.putAll(this.f27162c.getTags());
        return concurrentHashMap;
    }

    @Override // io.sentry.V
    public InterfaceC2496f0 h() {
        InterfaceC2496f0 interfaceC2496f0H = this.f27162c.h();
        if (interfaceC2496f0H != null) {
            return interfaceC2496f0H;
        }
        InterfaceC2496f0 interfaceC2496f0H2 = this.f27161b.h();
        return interfaceC2496f0H2 != null ? interfaceC2496f0H2 : this.f27160a.h();
    }

    public final V i() {
        return N(null);
    }

    @Override // io.sentry.V
    public Y2 j() {
        return i().j();
    }

    @Override // io.sentry.V
    public C2533o1.d k() {
        return i().k();
    }

    @Override // io.sentry.V
    public void l(EnumC2596z2 enumC2596z2) {
        i().l(enumC2596z2);
    }

    @Override // io.sentry.V
    public void m(J2 j8) {
        this.f27160a.m(j8);
    }

    @Override // io.sentry.V
    public void n() {
        i().n();
    }

    @Override // io.sentry.V
    public void o(Z z8) {
        i().o(z8);
    }

    @Override // io.sentry.V
    public InterfaceC2488d0 p() {
        InterfaceC2488d0 interfaceC2488d0P = this.f27162c.p();
        if (interfaceC2488d0P != null) {
            return interfaceC2488d0P;
        }
        InterfaceC2488d0 interfaceC2488d0P2 = this.f27161b.p();
        return interfaceC2488d0P2 != null ? interfaceC2488d0P2 : this.f27160a.p();
    }

    @Override // io.sentry.V
    public Y2 q() {
        Y2 y2Q = this.f27162c.q();
        if (y2Q != null) {
            return y2Q;
        }
        Y2 y2Q2 = this.f27161b.q();
        return y2Q2 != null ? y2Q2 : this.f27160a.q();
    }

    @Override // io.sentry.V
    public Queue r() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f27160a.r());
        arrayList.addAll(this.f27161b.r());
        arrayList.addAll(this.f27162c.r());
        Collections.sort(arrayList);
        Queue queueP = C2533o1.P(this.f27162c.b().getMaxBreadcrumbs());
        queueP.addAll(arrayList);
        return queueP;
    }

    @Override // io.sentry.V
    public EnumC2596z2 s() {
        EnumC2596z2 enumC2596z2S = this.f27162c.s();
        if (enumC2596z2S != null) {
            return enumC2596z2S;
        }
        EnumC2596z2 enumC2596z2S2 = this.f27161b.s();
        return enumC2596z2S2 != null ? enumC2596z2S2 : this.f27160a.s();
    }

    @Override // io.sentry.V
    public io.sentry.protocol.u t() {
        io.sentry.protocol.u uVarT = this.f27162c.t();
        io.sentry.protocol.u uVar = io.sentry.protocol.u.f27472b;
        if (!uVar.equals(uVarT)) {
            return uVarT;
        }
        io.sentry.protocol.u uVarT2 = this.f27161b.t();
        return !uVar.equals(uVarT2) ? uVarT2 : this.f27160a.t();
    }

    @Override // io.sentry.V
    public C2505h1 u() {
        return i().u();
    }

    @Override // io.sentry.V
    public Y2 v(C2533o1.b bVar) {
        return i().v(bVar);
    }

    @Override // io.sentry.V
    public void w(String str) {
        i().w(str);
    }

    @Override // io.sentry.V
    public Z x() {
        Z zX = this.f27162c.x();
        if (!(zX instanceof L0)) {
            return zX;
        }
        Z zX2 = this.f27161b.x();
        return !(zX2 instanceof L0) ? zX2 : this.f27160a.x();
    }

    @Override // io.sentry.V
    public List y() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f27160a.y());
        copyOnWriteArrayList.addAll(this.f27161b.y());
        copyOnWriteArrayList.addAll(this.f27162c.y());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.V
    public List z() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f27160a.z());
        copyOnWriteArrayList.addAll(this.f27161b.z());
        copyOnWriteArrayList.addAll(this.f27162c.z());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.V
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public V m232clone() {
        return new C2503h(this.f27160a, this.f27161b.m232clone(), this.f27162c.m232clone());
    }
}
