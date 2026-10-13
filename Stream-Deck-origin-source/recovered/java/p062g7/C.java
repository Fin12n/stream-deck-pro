package p062g7;

import G6.d;
import G6.g;
import H6.b;
import I6.e;
import p017b7.AbstractC1773a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C extends AbstractC1773a implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f23813d;

    public C(g gVar, d<Object> dVar) {
        super(gVar, true, true);
        this.f23813d = dVar;
    }

    @Override // p017b7.AbstractC1773a
    public void Y0(Object obj) {
        d dVar = this.f23813d;
        dVar.resumeWith(p017b7.C.a(obj, dVar));
    }

    @Override // I6.e
    public final e getCallerFrame() {
        d dVar = this.f23813d;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Override // p017b7.D0
    public final boolean m0() {
        return true;
    }

    @Override // p017b7.D0
    public void w(Object obj) {
        AbstractC2373l.c(b.c(this.f23813d), p017b7.C.a(obj, this.f23813d), null, 2, null);
    }
}
