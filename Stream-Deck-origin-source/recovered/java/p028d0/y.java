package p028d0;

import Q6.k;
import R0.C1598l0;
import R0.pkXL.Oitvkwcwn;
import S0.AbstractC1628c;
import p037e0.AbstractC2207c;
import p037e0.AbstractC2214j;
import p037e0.InterfaceC2213i;
import p037e0.a0;
import p037e0.j0;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f19736a = AbstractC2214j.g(0.0f, 0.0f, null, 7, null);

    public static final q1 a(long j8, InterfaceC2213i interfaceC2213i, String str, k kVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        InterfaceC2213i interfaceC2213i2;
        String str2;
        k kVar2;
        interfaceC3163l.f(-451899108);
        if ((i9 & 2) != 0) {
            interfaceC2213i2 = f19736a;
        } else {
            interfaceC2213i2 = interfaceC2213i;
        }
        if ((i9 & 4) != 0) {
            str2 = "ColorAnimation";
        } else {
            str2 = str;
        }
        if ((i9 & 8) != 0) {
            kVar2 = null;
        } else {
            kVar2 = kVar;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-451899108, i8, -1, Oitvkwcwn.jHlxteFxds);
        }
        AbstractC1628c abstractC1628cT = C1598l0.t(j8);
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(abstractC1628cT);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = (j0) j.a(C1598l0.f9405b).invoke(C1598l0.t(j8));
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        int i10 = i8 << 6;
        q1 q1VarE = AbstractC2207c.e(C1598l0.g(j8), (j0) objG, interfaceC2213i2, null, str2, kVar2, interfaceC3163l, (i8 & 14) | 576 | (57344 & i10) | (i10 & 458752), 8);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarE;
    }
}
