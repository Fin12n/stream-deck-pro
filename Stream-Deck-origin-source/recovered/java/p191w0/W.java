package p191w0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class W implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35776a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35777b = d(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35778c = d(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35779d = d(3);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a(boolean z8, boolean z9, boolean z10) {
            if ((z8 && z9) || z10) {
                return c();
            }
            return (z8 || z9) ? d() : b();
        }

        public final int b() {
            return W.f35777b;
        }

        public final int c() {
            return W.f35779d;
        }

        public final int d() {
            return W.f35778c;
        }

        public a() {
        }
    }

    public static final boolean e(int i8, int i9) {
        return i8 == i9;
    }

    public static int d(int i8) {
        return i8;
    }
}
