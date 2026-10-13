package p216z1;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f39046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f39047e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39049b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final s a() {
            return s.f39046d;
        }

        public a() {
        }
    }

    static {
        AbstractC2633k abstractC2633k = null;
        f39045c = new a(abstractC2633k);
        b.a aVar = b.f39050a;
        f39046d = new s(aVar.a(), false, abstractC2633k);
        f39047e = new s(aVar.b(), true, abstractC2633k);
    }

    public /* synthetic */ s(int i8, boolean z8, AbstractC2633k abstractC2633k) {
        this(i8, z8);
    }

    public final int b() {
        return this.f39048a;
    }

    public final boolean c() {
        return this.f39049b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return b.e(this.f39048a, sVar.f39048a) && this.f39049b == sVar.f39049b;
    }

    public int hashCode() {
        return (b.f(this.f39048a) * 31) + Boolean.hashCode(this.f39049b);
    }

    public String toString() {
        if (t.c(this, f39046d)) {
            return "TextMotion.Static";
        }
        return t.c(this, f39047e) ? "TextMotion.Animated" : "Invalid";
    }

    public s(int i8, boolean z8) {
        this.f39048a = i8;
        this.f39049b = z8;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39050a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f39051b = d(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f39052c = d(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f39053d = d(3);

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public final int a() {
                return b.f39052c;
            }

            public final int b() {
                return b.f39051b;
            }

            public final int c() {
                return b.f39053d;
            }

            public a() {
            }
        }

        public static final boolean e(int i8, int i9) {
            return i8 == i9;
        }

        public static int f(int i8) {
            return Integer.hashCode(i8);
        }

        public static int d(int i8) {
            return i8;
        }
    }
}
