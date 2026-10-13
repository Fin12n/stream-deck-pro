package N0;

import A1.t;
import Q0.l;
import Q6.k;
import R0.F;
import R0.InterfaceC1586f0;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A1.d f5798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f5800c;

    public /* synthetic */ a(A1.d dVar, long j8, k kVar, AbstractC2633k abstractC2633k) {
        this(dVar, j8, kVar);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        T0.a aVar = new T0.a();
        A1.d dVar = this.f5798a;
        long j8 = this.f5799b;
        t tVar = t.Ltr;
        InterfaceC1586f0 interfaceC1586f0B = F.b(canvas);
        k kVar = this.f5800c;
        T0.a.C0273a c0273aT = aVar.t();
        A1.d dVarA = c0273aT.a();
        t tVarB = c0273aT.b();
        InterfaceC1586f0 interfaceC1586f0C = c0273aT.c();
        long jD = c0273aT.d();
        T0.a.C0273a c0273aT2 = aVar.t();
        c0273aT2.j(dVar);
        c0273aT2.k(tVar);
        c0273aT2.i(interfaceC1586f0B);
        c0273aT2.l(j8);
        interfaceC1586f0B.k();
        kVar.invoke(aVar);
        interfaceC1586f0B.x();
        T0.a.C0273a c0273aT3 = aVar.t();
        c0273aT3.j(dVarA);
        c0273aT3.k(tVarB);
        c0273aT3.i(interfaceC1586f0C);
        c0273aT3.l(jD);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point point, Point point2) {
        A1.d dVar = this.f5798a;
        point.set(dVar.V0(dVar.p0(l.i(this.f5799b))), dVar.V0(dVar.p0(l.g(this.f5799b))));
        point2.set(point.x / 2, point.y / 2);
    }

    public a(A1.d dVar, long j8, k kVar) {
        this.f5798a = dVar;
        this.f5799b = j8;
        this.f5800c = kVar;
    }
}
