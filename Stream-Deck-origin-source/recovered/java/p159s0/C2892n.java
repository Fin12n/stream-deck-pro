package p159s0;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p216z1.i;

/* JADX INFO: renamed from: s0.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2892n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f32797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f32798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32799c;

    /* JADX INFO: renamed from: s0.n$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f32800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f32801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f32802c;

        public a(i iVar, int i8, long j8) {
            this.f32800a = iVar;
            this.f32801b = i8;
            this.f32802c = j8;
        }

        public static /* synthetic */ a b(a aVar, i iVar, int i8, long j8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                iVar = aVar.f32800a;
            }
            if ((i9 & 2) != 0) {
                i8 = aVar.f32801b;
            }
            if ((i9 & 4) != 0) {
                j8 = aVar.f32802c;
            }
            return aVar.a(iVar, i8, j8);
        }

        public final a a(i iVar, int i8, long j8) {
            return new a(iVar, i8, j8);
        }

        public final int c() {
            return this.f32801b;
        }

        public final long d() {
            return this.f32802c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f32800a == aVar.f32800a && this.f32801b == aVar.f32801b && this.f32802c == aVar.f32802c;
        }

        public int hashCode() {
            return (((this.f32800a.hashCode() * 31) + Integer.hashCode(this.f32801b)) * 31) + Long.hashCode(this.f32802c);
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.f32800a + ", offset=" + this.f32801b + ", selectableId=" + this.f32802c + ')';
        }
    }

    public C2892n(a aVar, a aVar2, boolean z8) {
        this.f32797a = aVar;
        this.f32798b = aVar2;
        this.f32799c = z8;
    }

    public static /* synthetic */ C2892n b(C2892n c2892n, a aVar, a aVar2, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            aVar = c2892n.f32797a;
        }
        if ((i8 & 2) != 0) {
            aVar2 = c2892n.f32798b;
        }
        if ((i8 & 4) != 0) {
            z8 = c2892n.f32799c;
        }
        return c2892n.a(aVar, aVar2, z8);
    }

    public final C2892n a(a aVar, a aVar2, boolean z8) {
        return new C2892n(aVar, aVar2, z8);
    }

    public final a c() {
        return this.f32798b;
    }

    public final boolean d() {
        return this.f32799c;
    }

    public final a e() {
        return this.f32797a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2892n)) {
            return false;
        }
        C2892n c2892n = (C2892n) obj;
        return t.c(this.f32797a, c2892n.f32797a) && t.c(this.f32798b, c2892n.f32798b) && this.f32799c == c2892n.f32799c;
    }

    public int hashCode() {
        return (((this.f32797a.hashCode() * 31) + this.f32798b.hashCode()) * 31) + Boolean.hashCode(this.f32799c);
    }

    public String toString() {
        return "Selection(start=" + this.f32797a + ", end=" + this.f32798b + ", handlesCrossed=" + this.f32799c + ')';
    }

    public /* synthetic */ C2892n(a aVar, a aVar2, boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this(aVar, aVar2, (i8 & 4) != 0 ? false : z8);
    }
}
