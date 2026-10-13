package p056g1;

import A1.n;
import p038e1.AbstractC2230a;
import p038e1.C2241l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static final int b(O o8, AbstractC2230a abstractC2230a) {
        O oO0 = o8.O0();
        if (oO0 == null) {
            throw new IllegalStateException(("Child of " + o8 + " cannot be null when calculating alignment line").toString());
        }
        if (o8.T0().c().containsKey(abstractC2230a)) {
            Integer num = (Integer) o8.T0().c().get(abstractC2230a);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iQ = oO0.Q(abstractC2230a);
        if (iQ == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        oO0.t1(true);
        o8.q1(true);
        o8.o1();
        oO0.t1(false);
        o8.q1(false);
        return iQ + (abstractC2230a instanceof C2241l ? n.k(oO0.f1()) : n.j(oO0.f1()));
    }
}
