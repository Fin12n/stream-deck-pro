package p188v5;

import N4.AbstractC1109ca;
import N4.C1082a7;
import N4.C1226m7;
import N4.C1250o7;
import N4.N9;
import N4.Q9;
import N4.X6;
import N4.Z6;
import S4.j;
import S4.k;
import S4.n;
import java.util.List;
import java.util.concurrent.Executor;
import p140p5.C2799i;
import p140p5.l;
import p156r5.a;
import p156r5.b;
import p195w4.d;
import p204x5.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends e implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f35136l = new b.a().a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f35137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f35138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC1109ca f35139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35141k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, k kVar, Executor executor, N9 n9, C2799i c2799i) {
        super(kVar, executor);
        bVar.b();
        this.f35138h = bVar;
        boolean zF = b.f();
        this.f35137g = zF;
        C1226m7 c1226m7 = new C1226m7();
        c1226m7.i(b.c(bVar));
        C1250o7 c1250o7J = c1226m7.j();
        C1082a7 c1082a7 = new C1082a7();
        c1082a7.e(zF ? X6.TYPE_THICK : X6.TYPE_THIN);
        c1082a7.g(c1250o7J);
        n9.d(Q9.b(c1082a7, 1), Z6.ON_DEVICE_BARCODE_CREATE);
        this.f35139i = null;
    }

    @Override // p203x4.h
    public final d[] b() {
        return this.f35137g ? l.f31267a : new d[]{l.f31268b};
    }

    @Override // p204x5.e, java.io.Closeable, java.lang.AutoCloseable, p156r5.a
    public final synchronized void close() {
        super.close();
    }

    @Override // p156r5.a
    public final k u0(p196w5.a aVar) {
        return y(super.c(aVar), aVar.j(), aVar.f());
    }

    public final /* synthetic */ k v(int i8, int i9, List list) {
        return n.d(list);
    }

    public final k y(k kVar, final int i8, final int i9) {
        return kVar.m(new j() { // from class: v5.e
            @Override // S4.j
            public final k a(Object obj) {
                return this.f35130a.v(i8, i9, (List) obj);
            }
        });
    }
}
