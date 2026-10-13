package androidx.compose.ui.graphics;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0362a f14661a = new C0362a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14662b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14663c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f14664d = d(2);

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0362a {
        public /* synthetic */ C0362a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return a.f14662b;
        }

        public final int b() {
            return a.f14664d;
        }

        public final int c() {
            return a.f14663c;
        }

        public C0362a() {
        }
    }

    public static final boolean e(int i8, int i9) {
        return i8 == i9;
    }

    public static int f(int i8) {
        return Integer.hashCode(i8);
    }

    public static String g(int i8) {
        return "CompositingStrategy(value=" + i8 + ')';
    }

    public static int d(int i8) {
        return i8;
    }
}
