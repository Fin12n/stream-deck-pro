package p191w0;

import A1.d;
import A1.t;
import kotlin.jvm.internal.AbstractC2633k;
import p082j0.d0;
import p082j0.f0;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: renamed from: w0.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3071l0 implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3164l0 f36220b;

    /* JADX WARN: Multi-variable type inference failed */
    public C3071l0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p082j0.d0
    public int a(d dVar) {
        return e().a(dVar);
    }

    @Override // p082j0.d0
    public int b(d dVar, t tVar) {
        return e().b(dVar, tVar);
    }

    @Override // p082j0.d0
    public int c(d dVar, t tVar) {
        return e().c(dVar, tVar);
    }

    @Override // p082j0.d0
    public int d(d dVar) {
        return e().d(dVar);
    }

    public final d0 e() {
        return (d0) this.f36220b.getValue();
    }

    public final void f(d0 d0Var) {
        this.f36220b.setValue(d0Var);
    }

    public C3071l0(d0 d0Var) {
        this.f36220b = l1.e(d0Var, null, 2, null);
    }

    public /* synthetic */ C3071l0(d0 d0Var, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? f0.a(0, 0, 0, 0) : d0Var);
    }
}
