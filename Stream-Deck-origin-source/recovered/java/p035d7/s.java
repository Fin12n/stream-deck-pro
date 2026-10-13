package p035d7;

import C6.G;
import G6.d;
import G6.g;
import H6.b;
import H6.c;
import Q6.o;
import p071h7.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f19954e;

    public s(g gVar, g gVar2, o oVar) {
        super(gVar, gVar2, false);
        this.f19954e = b.a(oVar, this, this);
    }

    @Override // p017b7.D0
    public void C0() throws Throwable {
        a.b(this.f19954e, this);
    }

    @Override // p035d7.h, p035d7.y
    public boolean d(Throwable th) {
        boolean zD = super.d(th);
        start();
        return zD;
    }

    @Override // p035d7.h, p035d7.y
    public Object i(Object obj, d dVar) {
        start();
        Object objI = super.i(obj, dVar);
        return objI == c.f() ? objI : G.f1419a;
    }

    @Override // p035d7.h, p035d7.y
    public Object m(Object obj) {
        start();
        return super.m(obj);
    }
}
