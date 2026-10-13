package p028d0;

import A1.r;
import A1.s;
import L0.c;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p037e0.E;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f19671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f19672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f19673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19674d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19675a = new a();

        public a() {
            super(1);
        }

        public final long b(long j8) {
            return s.a(0, 0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return r.b(b(((r) obj).j()));
        }
    }

    public i(c cVar, k kVar, E e8, boolean z8) {
        this.f19671a = cVar;
        this.f19672b = kVar;
        this.f19673c = e8;
        this.f19674d = z8;
    }

    public final c a() {
        return this.f19671a;
    }

    public final E b() {
        return this.f19673c;
    }

    public final boolean c() {
        return this.f19674d;
    }

    public final k d() {
        return this.f19672b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return t.c(this.f19671a, iVar.f19671a) && t.c(this.f19672b, iVar.f19672b) && t.c(this.f19673c, iVar.f19673c) && this.f19674d == iVar.f19674d;
    }

    public int hashCode() {
        return (((((this.f19671a.hashCode() * 31) + this.f19672b.hashCode()) * 31) + this.f19673c.hashCode()) * 31) + Boolean.hashCode(this.f19674d);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f19671a + ", size=" + this.f19672b + ", animationSpec=" + this.f19673c + ", clip=" + this.f19674d + ')';
    }

    public /* synthetic */ i(c cVar, k kVar, E e8, boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this(cVar, (i8 & 2) != 0 ? a.f19675a : kVar, e8, (i8 & 8) != 0 ? true : z8);
    }
}
