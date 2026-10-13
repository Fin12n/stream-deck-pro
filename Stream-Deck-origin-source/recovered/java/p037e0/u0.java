package p037e0;

import C6.o;
import D6.M;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f20336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC2221q f20339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC2221q f20340e;

    public u0(Map<Integer, ? extends o> map, int i8, int i9) {
        this.f20336a = map;
        this.f20337b = i8;
        this.f20338c = i9;
    }

    @Override // p037e0.m0
    public AbstractC2221q c(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        int iB = (int) n0.b(this, j8 / 1000000);
        if (this.f20336a.containsKey(Integer.valueOf(iB))) {
            return (AbstractC2221q) ((o) M.h(this.f20336a, Integer.valueOf(iB))).c();
        }
        if (iB >= f()) {
            return abstractC2221q2;
        }
        if (iB <= 0) {
            return abstractC2221q;
        }
        int iF = f();
        B bE = D.e();
        int i8 = 0;
        AbstractC2221q abstractC2221q4 = abstractC2221q;
        int i9 = 0;
        for (Map.Entry entry : this.f20336a.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            o oVar = (o) entry.getValue();
            if (iB > iIntValue && iIntValue >= i9) {
                abstractC2221q4 = (AbstractC2221q) oVar.c();
                bE = (B) oVar.d();
                i9 = iIntValue;
            } else if (iB < iIntValue && iIntValue <= iF) {
                abstractC2221q2 = (AbstractC2221q) oVar.c();
                iF = iIntValue;
            }
        }
        float fA = bE.a((iB - i9) / (iF - i9));
        h(abstractC2221q);
        int iB2 = abstractC2221q4.b();
        while (true) {
            AbstractC2221q abstractC2221q5 = null;
            if (i8 >= iB2) {
                break;
            }
            AbstractC2221q abstractC2221q6 = this.f20339d;
            if (abstractC2221q6 == null) {
                t.t("valueVector");
            } else {
                abstractC2221q5 = abstractC2221q6;
            }
            abstractC2221q5.e(i8, l0.k(abstractC2221q4.a(i8), abstractC2221q2.a(i8), fA));
            i8++;
        }
        AbstractC2221q abstractC2221q7 = this.f20339d;
        if (abstractC2221q7 != null) {
            return abstractC2221q7;
        }
        t.t("valueVector");
        return null;
    }

    @Override // p037e0.p0
    public int e() {
        return this.f20338c;
    }

    @Override // p037e0.p0
    public int f() {
        return this.f20337b;
    }

    @Override // p037e0.m0
    public AbstractC2221q g(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        long jB = n0.b(this, j8 / 1000000);
        if (jB <= 0) {
            return abstractC2221q3;
        }
        AbstractC2221q abstractC2221qD = n0.d(this, jB - 1, abstractC2221q, abstractC2221q2, abstractC2221q3);
        AbstractC2221q abstractC2221qD2 = n0.d(this, jB, abstractC2221q, abstractC2221q2, abstractC2221q3);
        h(abstractC2221q);
        int iB = abstractC2221qD.b();
        int i8 = 0;
        while (true) {
            AbstractC2221q abstractC2221q4 = null;
            if (i8 >= iB) {
                break;
            }
            AbstractC2221q abstractC2221q5 = this.f20340e;
            if (abstractC2221q5 == null) {
                t.t("velocityVector");
            } else {
                abstractC2221q4 = abstractC2221q5;
            }
            abstractC2221q4.e(i8, (abstractC2221qD.a(i8) - abstractC2221qD2.a(i8)) * 1000.0f);
            i8++;
        }
        AbstractC2221q abstractC2221q6 = this.f20340e;
        if (abstractC2221q6 != null) {
            return abstractC2221q6;
        }
        t.t("velocityVector");
        return null;
    }

    public final void h(AbstractC2221q abstractC2221q) {
        if (this.f20339d == null) {
            this.f20339d = r.g(abstractC2221q);
            this.f20340e = r.g(abstractC2221q);
        }
    }

    public /* synthetic */ u0(Map map, int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this(map, i8, (i10 & 4) != 0 ? 0 : i9);
    }
}
