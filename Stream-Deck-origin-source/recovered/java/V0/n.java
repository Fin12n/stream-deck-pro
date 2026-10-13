package V0;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n extends p implements Iterable, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f10431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f10432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f10433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f10434j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f10435a;

        public a(n nVar) {
            this.f10435a = nVar.f10434j.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p next() {
            return (p) this.f10435a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10435a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public final float A() {
        return this.f10429e;
    }

    public final float D() {
        return this.f10430f;
    }

    public final int E() {
        return this.f10434j.size();
    }

    public final float F() {
        return this.f10431g;
    }

    public final float G() {
        return this.f10432h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            return t.c(this.f10425a, nVar.f10425a) && this.f10426b == nVar.f10426b && this.f10427c == nVar.f10427c && this.f10428d == nVar.f10428d && this.f10429e == nVar.f10429e && this.f10430f == nVar.f10430f && this.f10431g == nVar.f10431g && this.f10432h == nVar.f10432h && t.c(this.f10433i, nVar.f10433i) && t.c(this.f10434j, nVar.f10434j);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((this.f10425a.hashCode() * 31) + Float.hashCode(this.f10426b)) * 31) + Float.hashCode(this.f10427c)) * 31) + Float.hashCode(this.f10428d)) * 31) + Float.hashCode(this.f10429e)) * 31) + Float.hashCode(this.f10430f)) * 31) + Float.hashCode(this.f10431g)) * 31) + Float.hashCode(this.f10432h)) * 31) + this.f10433i.hashCode()) * 31) + this.f10434j.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this);
    }

    public final p m(int i8) {
        return (p) this.f10434j.get(i8);
    }

    public final List o() {
        return this.f10433i;
    }

    public final String s() {
        return this.f10425a;
    }

    public final float t() {
        return this.f10427c;
    }

    public final float u() {
        return this.f10428d;
    }

    public final float y() {
        return this.f10426b;
    }

    public /* synthetic */ n(String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List list, List list2, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? 0.0f : f8, (i8 & 4) != 0 ? 0.0f : f9, (i8 & 8) != 0 ? 0.0f : f10, (i8 & 16) != 0 ? 1.0f : f11, (i8 & 32) != 0 ? 1.0f : f12, (i8 & 64) != 0 ? 0.0f : f13, (i8 & 128) != 0 ? 0.0f : f14, (i8 & 256) != 0 ? o.e() : list, (i8 & 512) != 0 ? D6.r.n() : list2);
    }

    public n(String str, float f8, float f9, float f10, float f11, float f12, float f13, float f14, List<? extends h> list, List<? extends p> list2) {
        super(null);
        this.f10425a = str;
        this.f10426b = f8;
        this.f10427c = f9;
        this.f10428d = f10;
        this.f10429e = f11;
        this.f10430f = f12;
        this.f10431g = f13;
        this.f10432h = f14;
        this.f10433i = list;
        this.f10434j = list2;
    }
}
