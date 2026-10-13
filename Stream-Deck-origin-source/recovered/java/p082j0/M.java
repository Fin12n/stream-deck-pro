package p082j0;

import Q6.o;
import Q6.p;
import S6.c;
import java.util.List;
import p038e1.InterfaceC2243n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class M {
    public static final p a(C c8) {
        return c8 == C.Horizontal ? C2620y.f28078a.a() : C2620y.f28078a.e();
    }

    public static final p b(C c8) {
        return c8 == C.Horizontal ? C2620y.f28078a.b() : C2620y.f28078a.f();
    }

    public static final p c(C c8) {
        return c8 == C.Horizontal ? C2620y.f28078a.c() : C2620y.f28078a.g();
    }

    public static final p d(C c8) {
        return c8 == C.Horizontal ? C2620y.f28078a.d() : C2620y.f28078a.h();
    }

    public static final AbstractC2611o j(Q q8) {
        if (q8 != null) {
            return q8.a();
        }
        return null;
    }

    public static final boolean k(Q q8) {
        if (q8 != null) {
            return q8.b();
        }
        return true;
    }

    public static final Q l(InterfaceC2243n interfaceC2243n) {
        Object objE = interfaceC2243n.e();
        if (objE instanceof Q) {
            return (Q) objE;
        }
        return null;
    }

    public static final float m(Q q8) {
        if (q8 != null) {
            return q8.c();
        }
        return 0.0f;
    }

    public static final int n(List list, o oVar, o oVar2, int i8, int i9) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i9, i8);
        int size = list.size();
        int iMax = 0;
        float f8 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC2243n interfaceC2243n = (InterfaceC2243n) list.get(i10);
            float fM = m(l(interfaceC2243n));
            if (fM == 0.0f) {
                int iMin2 = Math.min(((Number) oVar.invoke(interfaceC2243n, Integer.MAX_VALUE)).intValue(), i8 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ((Number) oVar2.invoke(interfaceC2243n, Integer.valueOf(iMin2))).intValue());
            } else if (fM > 0.0f) {
                f8 += fM;
            }
        }
        int iD = f8 == 0.0f ? 0 : i8 == Integer.MAX_VALUE ? Integer.MAX_VALUE : c.d(Math.max(i8 - iMin, 0) / f8);
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            InterfaceC2243n interfaceC2243n2 = (InterfaceC2243n) list.get(i11);
            float fM2 = m(l(interfaceC2243n2));
            if (fM2 > 0.0f) {
                iMax = Math.max(iMax, ((Number) oVar2.invoke(interfaceC2243n2, Integer.valueOf(iD != Integer.MAX_VALUE ? c.d(iD * fM2) : Integer.MAX_VALUE))).intValue());
            }
        }
        return iMax;
    }

    public static final int o(List list, o oVar, int i8, int i9) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i10 = 0;
        float f8 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC2243n interfaceC2243n = (InterfaceC2243n) list.get(i11);
            float fM = m(l(interfaceC2243n));
            int iIntValue = ((Number) oVar.invoke(interfaceC2243n, Integer.valueOf(i8))).intValue();
            if (fM == 0.0f) {
                i10 += iIntValue;
            } else if (fM > 0.0f) {
                f8 += fM;
                iMax = Math.max(iMax, c.d(iIntValue / fM));
            }
        }
        return c.d(iMax * f8) + i10 + ((list.size() - 1) * i9);
    }

    public static final int p(List list, o oVar, o oVar2, int i8, int i9, C c8, C c9) {
        return c8 == c9 ? o(list, oVar, i8, i9) : n(list, oVar2, oVar, i8, i9);
    }

    public static final boolean q(Q q8) {
        AbstractC2611o abstractC2611oJ = j(q8);
        if (abstractC2611oJ != null) {
            return abstractC2611oJ.c();
        }
        return false;
    }
}
