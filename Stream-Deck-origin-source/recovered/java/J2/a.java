package J2;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p043e6.dT.GIGvBf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0149a f4061b = new C0149a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4062c = new a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f4063d = new a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f4064e = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4065a;

    /* JADX INFO: renamed from: J2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0149a {
        public /* synthetic */ C0149a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final a a(float f8) {
            if (f8 >= 0.0f) {
                if (f8 < 480.0f) {
                    return a.f4062c;
                }
                return f8 < 900.0f ? a.f4063d : a.f4064e;
            }
            throw new IllegalArgumentException(("Height must be positive, received " + f8).toString());
        }

        public C0149a() {
        }
    }

    public a(int i8) {
        this.f4065a = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && this.f4065a == ((a) obj).f4065a;
    }

    public int hashCode() {
        return this.f4065a;
    }

    public String toString() {
        String str;
        if (t.c(this, f4062c)) {
            str = "COMPACT";
        } else if (t.c(this, f4063d)) {
            str = GIGvBf.QKrqnzsLZH;
        } else {
            str = t.c(this, f4064e) ? "EXPANDED" : "UNKNOWN";
        }
        return "WindowHeightSizeClass: " + str;
    }
}
