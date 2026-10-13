package p128o1;

import D6.r;
import D6.z;
import P2.Lsk.mHPawN;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: renamed from: o1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2739d implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f30780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f30781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f30782d;

    /* JADX INFO: renamed from: o1.d$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Appendable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StringBuilder f30783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f30784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f30785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f30786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f30787e;

        /* JADX INFO: renamed from: o1.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0660a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f30788a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f30789b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f30790c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f30791d;

            public C0660a(Object obj, int i8, int i9, String str) {
                this.f30788a = obj;
                this.f30789b = i8;
                this.f30790c = i9;
                this.f30791d = str;
            }

            public final b a(int i8) {
                int i9 = this.f30790c;
                if (i9 != Integer.MIN_VALUE) {
                    i8 = i9;
                }
                if (i8 != Integer.MIN_VALUE) {
                    return new b(this.f30788a, this.f30789b, i8, this.f30791d);
                }
                throw new IllegalStateException("Item.end should be set first");
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0660a)) {
                    return false;
                }
                C0660a c0660a = (C0660a) obj;
                return t.c(this.f30788a, c0660a.f30788a) && this.f30789b == c0660a.f30789b && this.f30790c == c0660a.f30790c && t.c(this.f30791d, c0660a.f30791d);
            }

            public int hashCode() {
                Object obj = this.f30788a;
                return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f30789b)) * 31) + Integer.hashCode(this.f30790c)) * 31) + this.f30791d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f30788a + ", start=" + this.f30789b + ", end=" + this.f30790c + mHPawN.QEDuQWyfIbe + this.f30791d + ')';
            }

            public /* synthetic */ C0660a(Object obj, int i8, int i9, String str, int i10, AbstractC2633k abstractC2633k) {
                this(obj, i8, (i10 & 4) != 0 ? Integer.MIN_VALUE : i9, (i10 & 8) != 0 ? "" : str);
            }
        }

        public a() {
            this(0, 1, null);
        }

        public final void a(t tVar, int i8, int i9) {
            this.f30785c.add(new C0660a(tVar, i8, i9, null, 8, null));
        }

        public final void b(B b8, int i8, int i9) {
            this.f30784b.add(new C0660a(b8, i8, i9, null, 8, null));
        }

        public final void c(L l8, int i8, int i9) {
            this.f30786d.add(new C0660a(l8, i8, i9, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a append(char c8) {
            this.f30783a.append(c8);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a append(CharSequence charSequence) {
            if (charSequence instanceof C2739d) {
                h((C2739d) charSequence);
                return this;
            }
            this.f30783a.append(charSequence);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a append(CharSequence charSequence, int i8, int i9) {
            if (charSequence instanceof C2739d) {
                i((C2739d) charSequence, i8, i9);
                return this;
            }
            this.f30783a.append(charSequence, i8, i9);
            return this;
        }

        public final void g(String str) {
            this.f30783a.append(str);
        }

        public final void h(C2739d c2739d) {
            int length = this.f30783a.length();
            this.f30783a.append(c2739d.i());
            List listG = c2739d.g();
            if (listG != null) {
                int size = listG.size();
                for (int i8 = 0; i8 < size; i8++) {
                    b bVar = (b) listG.get(i8);
                    b((B) bVar.e(), bVar.f() + length, bVar.d() + length);
                }
            }
            List listE = c2739d.e();
            if (listE != null) {
                int size2 = listE.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    b bVar2 = (b) listE.get(i9);
                    a((t) bVar2.e(), bVar2.f() + length, bVar2.d() + length);
                }
            }
            List listB = c2739d.b();
            if (listB != null) {
                int size3 = listB.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    b bVar3 = (b) listB.get(i10);
                    this.f30786d.add(new C0660a(bVar3.e(), bVar3.f() + length, bVar3.d() + length, bVar3.g()));
                }
            }
        }

        public final void i(C2739d c2739d, int i8, int i9) {
            int length = this.f30783a.length();
            this.f30783a.append((CharSequence) c2739d.i(), i8, i9);
            List listK = AbstractC2740e.k(c2739d, i8, i9);
            if (listK != null) {
                int size = listK.size();
                for (int i10 = 0; i10 < size; i10++) {
                    b bVar = (b) listK.get(i10);
                    b((B) bVar.e(), bVar.f() + length, bVar.d() + length);
                }
            }
            List listJ = AbstractC2740e.j(c2739d, i8, i9);
            if (listJ != null) {
                int size2 = listJ.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    b bVar2 = (b) listJ.get(i11);
                    a((t) bVar2.e(), bVar2.f() + length, bVar2.d() + length);
                }
            }
            List listI = AbstractC2740e.i(c2739d, i8, i9);
            if (listI != null) {
                int size3 = listI.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    b bVar3 = (b) listI.get(i12);
                    this.f30786d.add(new C0660a(bVar3.e(), bVar3.f() + length, bVar3.d() + length, bVar3.g()));
                }
            }
        }

        public final C2739d j() {
            String string = this.f30783a.toString();
            List list = this.f30784b;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(((C0660a) list.get(i8)).a(this.f30783a.length()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List list2 = this.f30785c;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                arrayList2.add(((C0660a) list2.get(i9)).a(this.f30783a.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            List list3 = this.f30786d;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i10 = 0; i10 < size3; i10++) {
                arrayList3.add(((C0660a) list3.get(i10)).a(this.f30783a.length()));
            }
            return new C2739d(string, arrayList, arrayList2, arrayList3.isEmpty() ? null : arrayList3);
        }

        public a(int i8) {
            this.f30783a = new StringBuilder(i8);
            this.f30784b = new ArrayList();
            this.f30785c = new ArrayList();
            this.f30786d = new ArrayList();
            this.f30787e = new ArrayList();
        }

        public /* synthetic */ a(int i8, int i9, AbstractC2633k abstractC2633k) {
            this((i9 & 1) != 0 ? 16 : i8);
        }

        public a(String str) {
            this(0, 1, null);
            g(str);
        }

        public a(C2739d c2739d) {
            this(0, 1, null);
            h(c2739d);
        }
    }

    /* JADX INFO: renamed from: o1.d$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(Integer.valueOf(((b) obj).f()), Integer.valueOf(((b) obj2).f()));
        }
    }

    public C2739d(String str, List<b> list, List<b> list2, List<? extends b> list3) {
        List listJ0;
        this.f30779a = str;
        this.f30780b = list;
        this.f30781c = list2;
        this.f30782d = list3;
        if (list2 == null || (listJ0 = z.J0(list2, new c())) == null) {
            return;
        }
        int size = listJ0.size();
        int iD = -1;
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) listJ0.get(i8);
            if (bVar.f() < iD) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            if (bVar.d() > this.f30779a.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + bVar.f() + ", " + bVar.d() + ") is out of boundary").toString());
            }
            iD = bVar.d();
        }
    }

    public char a(int i8) {
        return this.f30779a.charAt(i8);
    }

    public final List b() {
        return this.f30782d;
    }

    public int c() {
        return this.f30779a.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i8) {
        return a(i8);
    }

    public final List d() {
        List list = this.f30781c;
        return list == null ? r.n() : list;
    }

    public final List e() {
        return this.f30781c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2739d)) {
            return false;
        }
        C2739d c2739d = (C2739d) obj;
        return t.c(this.f30779a, c2739d.f30779a) && t.c(this.f30780b, c2739d.f30780b) && t.c(this.f30781c, c2739d.f30781c) && t.c(this.f30782d, c2739d.f30782d);
    }

    public final List f() {
        List list = this.f30780b;
        return list == null ? r.n() : list;
    }

    public final List g() {
        return this.f30780b;
    }

    public final List h(String str, int i8, int i9) {
        List listN;
        List list = this.f30782d;
        if (list != null) {
            listN = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                b bVar = (b) obj;
                if ((bVar.e() instanceof String) && t.c(str, bVar.g()) && AbstractC2740e.l(i8, i9, bVar.f(), bVar.d())) {
                    listN.add(obj);
                }
            }
        } else {
            listN = r.n();
        }
        t.e(listN, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return listN;
    }

    public int hashCode() {
        int iHashCode = this.f30779a.hashCode() * 31;
        List list = this.f30780b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f30781c;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f30782d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String i() {
        return this.f30779a;
    }

    public final List j(int i8, int i9) {
        List listN;
        List list = this.f30782d;
        if (list != null) {
            listN = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                b bVar = (b) obj;
                if ((bVar.e() instanceof K) && AbstractC2740e.l(i8, i9, bVar.f(), bVar.d())) {
                    listN.add(obj);
                }
            }
        } else {
            listN = r.n();
        }
        t.e(listN, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listN;
    }

    public final boolean l(String str, int i8, int i9) {
        List list = this.f30782d;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = (b) list.get(i10);
                if ((bVar.e() instanceof String) && t.c(str, bVar.g()) && AbstractC2740e.l(i8, i9, bVar.f(), bVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    public final C2739d m(C2739d c2739d) {
        a aVar = new a(this);
        aVar.h(c2739d);
        return aVar.j();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C2739d subSequence(int i8, int i9) {
        if (i8 <= i9) {
            if (i8 == 0 && i9 == this.f30779a.length()) {
                return this;
            }
            String strSubstring = this.f30779a.substring(i8, i9);
            t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new C2739d(strSubstring, AbstractC2740e.h(this.f30780b, i8, i9), AbstractC2740e.h(this.f30781c, i8, i9), AbstractC2740e.h(this.f30782d, i8, i9));
        }
        throw new IllegalArgumentException(("start (" + i8 + ") should be less or equal to end (" + i9 + ')').toString());
    }

    public final C2739d o(long j8) {
        return subSequence(G.l(j8), G.k(j8));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f30779a;
    }

    public final List k(int i8, int i9) {
        List listN;
        List list = this.f30782d;
        if (list != null) {
            listN = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                b bVar = (b) obj;
                if ((bVar.e() instanceof L) && AbstractC2740e.l(i8, i9, bVar.f(), bVar.d())) {
                    listN.add(obj);
                }
            }
        } else {
            listN = r.n();
        }
        t.e(listN, hJroAgFztiMK.mFDvSYzHksu);
        return listN;
    }

    /* JADX INFO: renamed from: o1.d$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f30792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f30793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f30794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f30795d;

        public b(Object obj, int i8, int i9, String str) {
            this.f30792a = obj;
            this.f30793b = i8;
            this.f30794c = i9;
            this.f30795d = str;
            if (i8 > i9) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public final Object a() {
            return this.f30792a;
        }

        public final int b() {
            return this.f30793b;
        }

        public final int c() {
            return this.f30794c;
        }

        public final int d() {
            return this.f30794c;
        }

        public final Object e() {
            return this.f30792a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.c(this.f30792a, bVar.f30792a) && this.f30793b == bVar.f30793b && this.f30794c == bVar.f30794c && t.c(this.f30795d, bVar.f30795d);
        }

        public final int f() {
            return this.f30793b;
        }

        public final String g() {
            return this.f30795d;
        }

        public int hashCode() {
            Object obj = this.f30792a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f30793b)) * 31) + Integer.hashCode(this.f30794c)) * 31) + this.f30795d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.f30792a + ", start=" + this.f30793b + ", end=" + this.f30794c + ", tag=" + this.f30795d + ')';
        }

        public b(Object obj, int i8, int i9) {
            this(obj, i8, i9, "");
        }
    }

    public /* synthetic */ C2739d(String str, List list, List list2, List list3, int i8, AbstractC2633k abstractC2633k) {
        this(str, (i8 & 2) != 0 ? null : list, (i8 & 4) != 0 ? null : list2, (i8 & 8) != 0 ? null : list3);
    }

    public /* synthetic */ C2739d(String str, List list, List list2, int i8, AbstractC2633k abstractC2633k) {
        this(str, (i8 & 2) != 0 ? r.n() : list, (i8 & 4) != 0 ? r.n() : list2);
    }

    public C2739d(String str, List<b> list, List<b> list2) {
        this(str, list.isEmpty() ? null : list, list2.isEmpty() ? null : list2, null);
    }
}
