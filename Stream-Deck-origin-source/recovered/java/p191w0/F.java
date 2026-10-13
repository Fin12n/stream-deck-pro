package p191w0;

import A1.d;
import A1.j;
import A1.p;
import A1.q;
import A1.t;
import C6.G;
import D6.r;
import D6.z;
import E1.n;
import Q6.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class F implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f35232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f35234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3057e0.a f35235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3057e0.a f35236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3057e0.a f35237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3057e0.a f35238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3057e0.b f35239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3057e0.b f35240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3057e0.b f35241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3057e0.b f35242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C3057e0.b f35243m;

    public /* synthetic */ F(long j8, d dVar, int i8, o oVar, AbstractC2633k abstractC2633k) {
        this(j8, dVar, i8, oVar);
    }

    @Override // E1.n
    public long a(p pVar, long j8, t tVar, long j9) {
        Object obj;
        Object obj2;
        List listQ = r.q(this.f35235e, this.f35236f, A1.n.j(pVar.b()) < A1.r.g(j8) / 2 ? this.f35237g : this.f35238h);
        ArrayList arrayList = new ArrayList(listQ.size());
        int size = listQ.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(Integer.valueOf(((C3057e0.a) listQ.get(i8)).a(pVar, j8, A1.r.g(j9), tVar)));
        }
        int size2 = arrayList.size();
        int i9 = 0;
        while (true) {
            obj = null;
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i9);
            int iIntValue = ((Number) obj2).intValue();
            if (iIntValue >= 0 && iIntValue + A1.r.g(j9) <= A1.r.g(j8)) {
                break;
            }
            i9++;
        }
        Integer num = (Integer) obj2;
        int iIntValue2 = num != null ? num.intValue() : ((Number) z.t0(arrayList)).intValue();
        List listQ2 = r.q(this.f35239i, this.f35240j, this.f35241k, A1.n.k(pVar.b()) < A1.r.f(j8) / 2 ? this.f35242l : this.f35243m);
        ArrayList arrayList2 = new ArrayList(listQ2.size());
        int size3 = listQ2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            arrayList2.add(Integer.valueOf(((C3057e0.b) listQ2.get(i10)).a(pVar, j8, A1.r.f(j9))));
        }
        int size4 = arrayList2.size();
        for (int i11 = 0; i11 < size4; i11++) {
            Object obj3 = arrayList2.get(i11);
            int iIntValue3 = ((Number) obj3).intValue();
            if (iIntValue3 >= this.f35233c && iIntValue3 + A1.r.f(j9) <= A1.r.f(j8) - this.f35233c) {
                obj = obj3;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        long jA = A1.o.a(iIntValue2, num2 != null ? num2.intValue() : ((Number) z.t0(arrayList2)).intValue());
        this.f35234d.invoke(pVar, q.a(jA, j9));
        return jA;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f8 = (F) obj;
        return j.e(this.f35231a, f8.f35231a) && kotlin.jvm.internal.t.c(this.f35232b, f8.f35232b) && this.f35233c == f8.f35233c && kotlin.jvm.internal.t.c(this.f35234d, f8.f35234d);
    }

    public int hashCode() {
        return (((((j.h(this.f35231a) * 31) + this.f35232b.hashCode()) * 31) + Integer.hashCode(this.f35233c)) * 31) + this.f35234d.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) j.i(this.f35231a)) + ", density=" + this.f35232b + ", verticalMargin=" + this.f35233c + ", onPositionCalculated=" + this.f35234d + ')';
    }

    public F(long j8, d dVar, int i8, o oVar) {
        this.f35231a = j8;
        this.f35232b = dVar;
        this.f35233c = i8;
        this.f35234d = oVar;
        int iV0 = dVar.V0(j.f(j8));
        C3057e0 c3057e0 = C3057e0.f35859a;
        this.f35235e = c3057e0.g(iV0);
        this.f35236f = c3057e0.d(iV0);
        this.f35237g = c3057e0.e(0);
        this.f35238h = c3057e0.f(0);
        int iV1 = dVar.V0(j.g(j8));
        this.f35239i = c3057e0.h(iV1);
        this.f35240j = c3057e0.a(iV1);
        this.f35241k = c3057e0.c(iV1);
        this.f35242l = c3057e0.i(i8);
        this.f35243m = c3057e0.b(i8);
    }

    public /* synthetic */ F(long j8, d dVar, int i8, o oVar, int i9, AbstractC2633k abstractC2633k) {
        this(j8, dVar, (i9 & 4) != 0 ? dVar.V0(AbstractC3055d0.j()) : i8, (i9 & 8) != 0 ? a.f35244a : oVar, null);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35244a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((p) obj, (p) obj2);
            return G.f1419a;
        }

        public final void b(p pVar, p pVar2) {
        }
    }
}
