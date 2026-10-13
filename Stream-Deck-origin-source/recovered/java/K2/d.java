package K2;

import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f4566d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I2.b f4567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.C0164c f4569c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final void a(I2.b bounds) {
            t.g(bounds, "bounds");
            if (bounds.d() == 0 && bounds.a() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bounds.b() != 0 && bounds.c() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f4570b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f4571c = new b("FOLD");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f4572d = new b("HINGE");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4573a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public final b a() {
                return b.f4571c;
            }

            public final b b() {
                return b.f4572d;
            }

            public a() {
            }
        }

        public b(String str) {
            this.f4573a = str;
        }

        public String toString() {
            return this.f4573a;
        }
    }

    public d(I2.b featureBounds, b type, c.C0164c state) {
        t.g(featureBounds, "featureBounds");
        t.g(type, "type");
        t.g(state, "state");
        this.f4567a = featureBounds;
        this.f4568b = type;
        this.f4569c = state;
        f4566d.a(featureBounds);
    }

    @Override // K2.c
    public c.C0164c a() {
        return this.f4569c;
    }

    @Override // K2.c
    public boolean b() {
        b bVar = this.f4568b;
        b.a aVar = b.f4570b;
        if (t.c(bVar, aVar.b())) {
            return true;
        }
        return t.c(this.f4568b, aVar.a()) && t.c(a(), c.C0164c.f4564d);
    }

    @Override // K2.c
    public c.a c() {
        return (this.f4567a.d() == 0 || this.f4567a.a() == 0) ? c.a.f4555c : c.a.f4556d;
    }

    @Override // K2.c
    public c.b d() {
        return this.f4567a.d() > this.f4567a.a() ? c.b.f4560d : c.b.f4559c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        d dVar = (d) obj;
        return t.c(this.f4567a, dVar.f4567a) && t.c(this.f4568b, dVar.f4568b) && t.c(a(), dVar.a());
    }

    @Override // K2.a
    public Rect getBounds() {
        return this.f4567a.f();
    }

    public int hashCode() {
        return (((this.f4567a.hashCode() * 31) + this.f4568b.hashCode()) * 31) + a().hashCode();
    }

    public String toString() {
        return d.class.getSimpleName() + " { " + this.f4567a + ", type=" + this.f4568b + ", state=" + a() + " }";
    }
}
