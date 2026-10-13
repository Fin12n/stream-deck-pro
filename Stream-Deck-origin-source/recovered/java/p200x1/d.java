package p200x1;

import A1.v;
import A1.w;
import A1.x;
import C6.G;
import D6.C0933m;
import D6.C0934n;
import Q6.p;
import Q6.q;
import R0.AbstractC1582d0;
import R0.AbstractC1602n0;
import R0.C1598l0;
import R0.P0;
import R0.R0;
import R0.U0;
import S6.c;
import T0.g;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p128o1.AbstractC2740e;
import p128o1.B;
import p128o1.C2739d;
import p128o1.I;
import p152r1.e;
import p152r1.f;
import p152r1.l;
import p152r1.m;
import p152r1.n;
import p152r1.o;
import p168t1.AbstractC3009n;
import p168t1.C;
import p168t1.y;
import p168t1.z;
import p208y1.b;
import p216z1.h;
import p216z1.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Spannable f37190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f37191b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Spannable spannable, q qVar) {
            super(3);
            this.f37190a = spannable;
            this.f37191b = qVar;
        }

        public final void b(B b8, int i8, int i9) {
            Spannable spannable = this.f37190a;
            q qVar = this.f37191b;
            AbstractC3009n abstractC3009nI = b8.i();
            C cN = b8.n();
            if (cN == null) {
                cN = C.f33980b.c();
            }
            y yVarL = b8.l();
            y yVarC = y.c(yVarL != null ? yVarL.i() : y.f34112b.b());
            z zVarM = b8.m();
            spannable.setSpan(new o((Typeface) qVar.i(abstractC3009nI, cN, yVarC, z.e(zVarM != null ? zVarM.m() : z.f34116b.a()))), i8, i9, 33);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((B) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    public static final MetricAffectingSpan a(long j8, A1.d dVar) {
        long jG = v.g(j8);
        x.a aVar = x.f466b;
        if (x.g(jG, aVar.b())) {
            return new f(dVar.l1(j8));
        }
        if (x.g(jG, aVar.a())) {
            return new e(v.h(j8));
        }
        return null;
    }

    public static final void b(B b8, List list, p pVar) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            pVar.invoke(f(b8, (B) ((C2739d.b) list.get(0)).e()), Integer.valueOf(((C2739d.b) list.get(0)).f()), Integer.valueOf(((C2739d.b) list.get(0)).d()));
            return;
        }
        int size = list.size();
        int i8 = size * 2;
        Integer[] numArr = new Integer[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            numArr[i9] = 0;
        }
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            C2739d.b bVar = (C2739d.b) list.get(i10);
            numArr[i10] = Integer.valueOf(bVar.f());
            numArr[i10 + size] = Integer.valueOf(bVar.d());
        }
        C0933m.B(numArr);
        int iIntValue = ((Number) C0934n.N(numArr)).intValue();
        for (int i11 = 0; i11 < i8; i11++) {
            Integer num = numArr[i11];
            int iIntValue2 = num.intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = list.size();
                B bF = b8;
                for (int i12 = 0; i12 < size3; i12++) {
                    C2739d.b bVar2 = (C2739d.b) list.get(i12);
                    if (bVar2.f() != bVar2.d() && AbstractC2740e.l(iIntValue, iIntValue2, bVar2.f(), bVar2.d())) {
                        bF = f(bF, (B) bVar2.e());
                    }
                }
                if (bF != null) {
                    pVar.invoke(bF, Integer.valueOf(iIntValue), num);
                }
                iIntValue = iIntValue2;
            }
        }
    }

    public static final boolean c(B b8) {
        long jG = v.g(b8.o());
        x.a aVar = x.f466b;
        return x.g(jG, aVar.b()) || x.g(v.g(b8.o()), aVar.a());
    }

    public static final boolean d(I i8) {
        return e.d(i8.M()) || i8.n() != null;
    }

    public static final boolean e(A1.d dVar) {
        return ((double) dVar.x0()) > 1.05d;
    }

    public static final B f(B b8, B b9) {
        return b8 == null ? b9 : b8.x(b9);
    }

    public static final float g(long j8, float f8, A1.d dVar) {
        float fH;
        long jG = v.g(j8);
        x.a aVar = x.f466b;
        if (x.g(jG, aVar.b())) {
            if (!e(dVar)) {
                return dVar.l1(j8);
            }
            fH = v.h(j8) / v.h(dVar.i0(f8));
        } else {
            if (!x.g(jG, aVar.a())) {
                return Float.NaN;
            }
            fH = v.h(j8);
        }
        return fH * f8;
    }

    public static final void h(Spannable spannable, long j8, int i8, int i9) {
        if (j8 != C1598l0.f9405b.e()) {
            u(spannable, new BackgroundColorSpan(AbstractC1602n0.j(j8)), i8, i9);
        }
    }

    public static final void i(Spannable spannable, p216z1.a aVar, int i8, int i9) {
        if (aVar != null) {
            u(spannable, new p152r1.a(aVar.h()), i8, i9);
        }
    }

    public static final void j(Spannable spannable, AbstractC1582d0 abstractC1582d0, float f8, int i8, int i9) {
        if (abstractC1582d0 != null) {
            if (abstractC1582d0 instanceof U0) {
                k(spannable, ((U0) abstractC1582d0).b(), i8, i9);
            } else if (abstractC1582d0 instanceof P0) {
                u(spannable, new b((P0) abstractC1582d0, f8), i8, i9);
            }
        }
    }

    public static final void k(Spannable spannable, long j8, int i8, int i9) {
        if (j8 != C1598l0.f9405b.e()) {
            u(spannable, new ForegroundColorSpan(AbstractC1602n0.j(j8)), i8, i9);
        }
    }

    public static final void l(Spannable spannable, g gVar, int i8, int i9) {
        if (gVar != null) {
            u(spannable, new p208y1.a(gVar), i8, i9);
        }
    }

    public static final void m(Spannable spannable, I i8, List list, q qVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            C2739d.b bVar = (C2739d.b) obj;
            if (e.d((B) bVar.e()) || ((B) bVar.e()).m() != null) {
                arrayList.add(obj);
            }
        }
        b(d(i8) ? new B(0L, 0L, i8.o(), i8.m(), i8.n(), i8.j(), (String) null, 0L, (p216z1.a) null, (p216z1.o) null, (p184v1.e) null, 0L, (k) null, (R0) null, (p128o1.y) null, (g) null, 65475, (AbstractC2633k) null) : null, arrayList, new a(spannable, qVar));
    }

    public static final void n(Spannable spannable, String str, int i8, int i9) {
        if (str != null) {
            u(spannable, new p152r1.b(str), i8, i9);
        }
    }

    public static final void o(Spannable spannable, long j8, A1.d dVar, int i8, int i9) {
        long jG = v.g(j8);
        x.a aVar = x.f466b;
        if (x.g(jG, aVar.b())) {
            u(spannable, new AbsoluteSizeSpan(c.d(dVar.l1(j8)), false), i8, i9);
        } else if (x.g(jG, aVar.a())) {
            u(spannable, new RelativeSizeSpan(v.h(j8)), i8, i9);
        }
    }

    public static final void p(Spannable spannable, p216z1.o oVar, int i8, int i9) {
        if (oVar != null) {
            u(spannable, new ScaleXSpan(oVar.b()), i8, i9);
            u(spannable, new m(oVar.c()), i8, i9);
        }
    }

    public static final void q(Spannable spannable, long j8, float f8, A1.d dVar, h hVar) {
        float fG = g(j8, f8, dVar);
        if (Float.isNaN(fG)) {
            return;
        }
        u(spannable, new p152r1.h(fG, 0, (spannable.length() == 0 || Z6.y.b1(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), h.c.f(hVar.c()), h.c.g(hVar.c()), hVar.b()), 0, spannable.length());
    }

    public static final void r(Spannable spannable, long j8, float f8, A1.d dVar) {
        float fG = g(j8, f8, dVar);
        if (Float.isNaN(fG)) {
            return;
        }
        u(spannable, new p152r1.g(fG), 0, spannable.length());
    }

    public static final void s(Spannable spannable, p184v1.e eVar, int i8, int i9) {
        if (eVar != null) {
            u(spannable, b.f37189a.a(eVar), i8, i9);
        }
    }

    public static final void t(Spannable spannable, R0 r8, int i8, int i9) {
        if (r8 != null) {
            u(spannable, new l(AbstractC1602n0.j(r8.c()), Q0.f.o(r8.d()), Q0.f.p(r8.d()), e.b(r8.b())), i8, i9);
        }
    }

    public static final void u(Spannable spannable, Object obj, int i8, int i9) {
        spannable.setSpan(obj, i8, i9, 33);
    }

    public static final void v(Spannable spannable, C2739d.b bVar, A1.d dVar) {
        int iF = bVar.f();
        int iD = bVar.d();
        B b8 = (B) bVar.e();
        i(spannable, b8.e(), iF, iD);
        k(spannable, b8.g(), iF, iD);
        j(spannable, b8.f(), b8.c(), iF, iD);
        x(spannable, b8.s(), iF, iD);
        o(spannable, b8.k(), dVar, iF, iD);
        n(spannable, b8.j(), iF, iD);
        p(spannable, b8.u(), iF, iD);
        s(spannable, b8.p(), iF, iD);
        h(spannable, b8.d(), iF, iD);
        t(spannable, b8.r(), iF, iD);
        l(spannable, b8.h(), iF, iD);
    }

    public static final void w(Spannable spannable, I i8, List list, A1.d dVar, q qVar) {
        MetricAffectingSpan metricAffectingSpanA;
        m(spannable, i8, list, qVar);
        int size = list.size();
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            C2739d.b bVar = (C2739d.b) list.get(i9);
            int iF = bVar.f();
            int iD = bVar.d();
            if (iF >= 0 && iF < spannable.length() && iD > iF && iD <= spannable.length()) {
                v(spannable, bVar, dVar);
                if (c((B) bVar.e())) {
                    z8 = true;
                }
            }
        }
        if (z8) {
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                C2739d.b bVar2 = (C2739d.b) list.get(i10);
                int iF2 = bVar2.f();
                int iD2 = bVar2.d();
                B b8 = (B) bVar2.e();
                if (iF2 >= 0 && iF2 < spannable.length() && iD2 > iF2 && iD2 <= spannable.length() && (metricAffectingSpanA = a(b8.o(), dVar)) != null) {
                    u(spannable, metricAffectingSpanA, iF2, iD2);
                }
            }
        }
    }

    public static final void x(Spannable spannable, k kVar, int i8, int i9) {
        if (kVar != null) {
            k.a aVar = k.f39019b;
            u(spannable, new n(kVar.d(aVar.d()), kVar.d(aVar.b())), i8, i9);
        }
    }

    public static final void y(Spannable spannable, p216z1.q qVar, float f8, A1.d dVar) {
        float fH;
        if (qVar != null) {
            if ((v.e(qVar.b(), w.f(0)) && v.e(qVar.c(), w.f(0))) || w.g(qVar.b()) || w.g(qVar.c())) {
                return;
            }
            long jG = v.g(qVar.b());
            x.a aVar = x.f466b;
            float fH2 = 0.0f;
            if (x.g(jG, aVar.b())) {
                fH = dVar.l1(qVar.b());
            } else {
                fH = x.g(jG, aVar.a()) ? v.h(qVar.b()) * f8 : 0.0f;
            }
            long jG2 = v.g(qVar.c());
            if (x.g(jG2, aVar.b())) {
                fH2 = dVar.l1(qVar.c());
            } else if (x.g(jG2, aVar.a())) {
                fH2 = v.h(qVar.c()) * f8;
            }
            u(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fH), (int) Math.ceil(fH2)), 0, spannable.length());
        }
    }
}
