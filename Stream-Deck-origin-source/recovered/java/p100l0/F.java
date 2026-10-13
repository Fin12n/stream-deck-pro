package p100l0;

import D6.r;
import Q6.k;
import W6.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p109m0.InterfaceC2666d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f28899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f28900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f28905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f28906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f28907i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28910a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f28911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f28912c;

        @Override // p100l0.r
        public int a() {
            return f28912c;
        }

        public void b(int i8) {
            f28911b = i8;
        }

        public void c(int i8) {
            f28912c = i8;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f28914b;

        public c(int i8, List<C2641b> list) {
            this.f28913a = i8;
            this.f28914b = list;
        }

        public final int a() {
            return this.f28913a;
        }

        public final List b() {
            return this.f28914b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f28915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i8) {
            super(1);
            this.f28915a = i8;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(a aVar) {
            return Integer.valueOf(aVar.a() - this.f28915a);
        }
    }

    public F(j jVar) {
        this.f28899a = jVar;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        arrayList.add(new a(i8, i8, 2, null));
        this.f28900b = arrayList;
        this.f28904f = -1;
        this.f28905g = new ArrayList();
        this.f28906h = r.n();
    }

    public final int a() {
        return ((int) Math.sqrt((((double) f()) * 1.0d) / ((double) this.f28907i))) + 1;
    }

    public final List b(int i8) {
        if (i8 == this.f28906h.size()) {
            return this.f28906h;
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = 0; i9 < i8; i9++) {
            arrayList.add(C2641b.a(E.a(1)));
        }
        this.f28906h = arrayList;
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    public final c c(int i8) {
        int i9;
        boolean z8;
        int i10;
        int i11;
        if (!this.f28899a.m()) {
            int i12 = i8 * this.f28907i;
            return new c(i12, b(n.d(n.g(this.f28907i, f() - i12), 0)));
        }
        int iMin = Math.min(i8 / a(), this.f28900b.size() - 1);
        int iA = a() * iMin;
        int iA2 = ((a) this.f28900b.get(iMin)).a();
        int iB = ((a) this.f28900b.get(iMin)).b();
        int i13 = this.f28901c;
        if (iA <= i13 && i13 <= i8) {
            iA2 = this.f28902d;
            iB = this.f28903e;
            iA = i13;
        } else if (iMin == this.f28904f && (i9 = i8 - iA) < this.f28905g.size()) {
            iA2 = ((Number) this.f28905g.get(i9)).intValue();
            iA = i8;
            iB = 0;
        }
        if (iA % a() == 0) {
            int i14 = i8 - iA;
            z8 = 2 <= i14 && i14 < a();
        }
        if (z8) {
            this.f28904f = iMin;
            this.f28905g.clear();
        }
        if (iA > i8) {
            throw new IllegalStateException("currentLine > lineIndex");
        }
        while (iA < i8 && iA2 < f()) {
            if (z8) {
                this.f28905g.add(Integer.valueOf(iA2));
            }
            int i15 = 0;
            while (i15 < this.f28907i && iA2 < f()) {
                if (iB == 0) {
                    i11 = iB;
                    iB = i(iA2, this.f28907i - i15);
                } else {
                    i11 = 0;
                }
                i15 += iB;
                if (i15 > this.f28907i) {
                    break;
                }
                iA2++;
                iB = i11;
            }
            iA++;
            if (iA % a() == 0 && iA2 < f()) {
                if (this.f28900b.size() != iA / a()) {
                    throw new IllegalStateException("invalid starting point");
                }
                this.f28900b.add(new a(iA2, iB));
            }
        }
        this.f28901c = i8;
        this.f28902d = iA2;
        this.f28903e = iB;
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        int i17 = iA2;
        while (i16 < this.f28907i && i17 < f()) {
            if (iB == 0) {
                int i18 = iB;
                iB = i(i17, this.f28907i - i16);
                i10 = i18;
            } else {
                i10 = 0;
            }
            i16 += iB;
            if (i16 > this.f28907i) {
                break;
            }
            i17++;
            arrayList.add(C2641b.a(E.a(iB)));
            iB = i10;
        }
        return new c(iA2, arrayList);
    }

    public final int d(int i8) {
        int i9 = 0;
        if (f() <= 0) {
            return 0;
        }
        if (i8 >= f()) {
            throw new IllegalArgumentException("ItemIndex > total count");
        }
        if (!this.f28899a.m()) {
            return i8 / this.f28907i;
        }
        int iL = r.l(this.f28900b, 0, 0, new d(i8), 3, null);
        int i10 = 2;
        if (iL < 0) {
            iL = (-iL) - 2;
        }
        int iA = a() * iL;
        int iA2 = ((a) this.f28900b.get(iL)).a();
        if (iA2 > i8) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex");
        }
        int i11 = 0;
        while (true) {
            if (iA2 >= i8) {
                break;
            }
            int i12 = iA2 + 1;
            int i13 = i(iA2, this.f28907i - i11);
            i11 += i13;
            int i14 = this.f28907i;
            if (i11 >= i14) {
                if (i11 == i14) {
                    iA++;
                    i11 = 0;
                } else {
                    iA++;
                    i11 = i13;
                }
            }
            if (iA % a() == 0 && iA / a() >= this.f28900b.size()) {
                this.f28900b.add(new a(i12 - (i11 <= 0 ? 0 : 1), i9, i10, null));
            }
            iA2 = i12;
        }
        return i11 + i(i8, this.f28907i - i11) > this.f28907i ? iA + 1 : iA;
    }

    public final int e() {
        return this.f28907i;
    }

    public final int f() {
        return this.f28899a.j().k();
    }

    public final void g() {
        this.f28900b.clear();
        int i8 = 0;
        this.f28900b.add(new a(i8, i8, 2, null));
        this.f28901c = 0;
        this.f28902d = 0;
        this.f28903e = 0;
        this.f28904f = -1;
        this.f28905g.clear();
    }

    public final void h(int i8) {
        if (i8 != this.f28907i) {
            this.f28907i = i8;
            g();
        }
    }

    public final int i(int i8, int i9) {
        b bVar = b.f28910a;
        bVar.b(i9);
        bVar.c(this.f28907i);
        InterfaceC2666d.a aVar = this.f28899a.j().get(i8);
        return C2641b.d(((C2641b) ((C2648i) aVar.c()).b().invoke(bVar, Integer.valueOf(i8 - aVar.b()))).g());
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28909b;

        public a(int i8, int i9) {
            this.f28908a = i8;
            this.f28909b = i9;
        }

        public final int a() {
            return this.f28908a;
        }

        public final int b() {
            return this.f28909b;
        }

        public /* synthetic */ a(int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
            this(i8, (i10 & 2) != 0 ? 0 : i9);
        }
    }
}
