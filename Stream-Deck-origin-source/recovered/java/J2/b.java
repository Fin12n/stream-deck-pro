package J2;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4066c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f4067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.a f4068b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final b a(float f8, float f9) {
            return new b(c.f4069b.a(f8), J2.a.f4061b.a(f9), null);
        }

        public a() {
        }
    }

    public /* synthetic */ b(c cVar, J2.a aVar, AbstractC2633k abstractC2633k) {
        this(cVar, aVar);
    }

    public final c a() {
        return this.f4067a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type androidx.window.core.layout.WindowSizeClass");
        b bVar = (b) obj;
        return t.c(this.f4067a, bVar.f4067a) && t.c(this.f4068b, bVar.f4068b);
    }

    public int hashCode() {
        return (this.f4067a.hashCode() * 31) + this.f4068b.hashCode();
    }

    public b(c cVar, J2.a aVar) {
        this.f4067a = cVar;
        this.f4068b = aVar;
    }

    public String toString() {
        return "WindowSizeClass {windowWidthSizeClass=" + this.f4067a + ", windowHeightSizeClass=" + this.f4068b + bGZGhbtQmA.BrA;
    }
}
