package p159s0;

import Q0.f;
import Q0.h;
import Q0.i;
import p038e1.AbstractC2248t;
import p038e1.InterfaceC2247s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f32649a = new h(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final boolean a(h hVar, long j8) {
        float fI = hVar.i();
        float fJ = hVar.j();
        float fO = f.o(j8);
        if (fI > fO || fO > fJ) {
            return false;
        }
        float fL = hVar.l();
        float fE = hVar.e();
        float fP = f.p(j8);
        return fL <= fP && fP <= fE;
    }

    public static final h b(InterfaceC2247s interfaceC2247s) {
        h hVarC = AbstractC2248t.c(interfaceC2247s);
        return i.a(interfaceC2247s.K(hVarC.m()), interfaceC2247s.K(hVarC.f()));
    }
}
