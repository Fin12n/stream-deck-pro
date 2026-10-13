package p035d7;

import G6.d;
import G6.g;
import H6.c;
import Q6.k;
import java.util.concurrent.CancellationException;
import p017b7.AbstractC1773a;
import p017b7.C1817w0;
import p017b7.D0;
import p089j7.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class h extends AbstractC1773a implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f19941d;

    public h(g gVar, g gVar2, boolean z8, boolean z9) {
        super(gVar, z8, z9);
        this.f19941d = gVar2;
    }

    @Override // p017b7.D0
    public void H(Throwable th) {
        CancellationException cancellationExceptionN0 = D0.N0(this, th, null, 1, null);
        this.f19941d.z(cancellationExceptionN0);
        D(cancellationExceptionN0);
    }

    @Override // p035d7.x
    public f a() {
        return this.f19941d.a();
    }

    @Override // p035d7.y
    public boolean d(Throwable th) {
        return this.f19941d.d(th);
    }

    public final g d1() {
        return this.f19941d;
    }

    @Override // p035d7.x
    public Object g() {
        return this.f19941d.g();
    }

    @Override // p035d7.x
    public Object h(d dVar) {
        Object objH = this.f19941d.h(dVar);
        c.f();
        return objH;
    }

    @Override // p035d7.y
    public Object i(Object obj, d dVar) {
        return this.f19941d.i(obj, dVar);
    }

    @Override // p035d7.x
    public i iterator() {
        return this.f19941d.iterator();
    }

    @Override // p035d7.y
    public void k(k kVar) {
        this.f19941d.k(kVar);
    }

    @Override // p035d7.x
    public Object l(d dVar) {
        return this.f19941d.l(dVar);
    }

    @Override // p035d7.y
    public Object m(Object obj) {
        return this.f19941d.m(obj);
    }

    @Override // p035d7.y
    public boolean n() {
        return this.f19941d.n();
    }

    @Override // p017b7.D0, p017b7.InterfaceC1815v0
    public final void z(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C1817w0(M(), null, this);
        }
        H(cancellationException);
    }

    public final g e() {
        return this;
    }
}
