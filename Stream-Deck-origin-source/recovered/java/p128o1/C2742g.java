package p128o1;

import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: o1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2742g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30803b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f30804c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f30805d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30806a;

    /* JADX INFO: renamed from: o1.g$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final int a() {
            return C2742g.f30804c;
        }

        public final int b() {
            return C2742g.f30805d;
        }

        public a() {
        }
    }

    public /* synthetic */ C2742g(int i8) {
        this.f30806a = i8;
    }

    public static final /* synthetic */ C2742g c(int i8) {
        return new C2742g(i8);
    }

    public static int d(int i8) {
        return i8;
    }

    public static boolean e(int i8, Object obj) {
        return (obj instanceof C2742g) && i8 == ((C2742g) obj).i();
    }

    public static final boolean f(int i8, int i9) {
        return i8 == i9;
    }

    public static int g(int i8) {
        return Integer.hashCode(i8);
    }

    public boolean equals(Object obj) {
        return e(this.f30806a, obj);
    }

    public int hashCode() {
        return g(this.f30806a);
    }

    public final /* synthetic */ int i() {
        return this.f30806a;
    }

    public String toString() {
        return h(this.f30806a);
    }

    public static String h(int i8) {
        if (i8 == f30804c) {
            return WaYxBuDSBD.wdeeDkR;
        }
        if (i8 == f30805d) {
            return "EmojiSupportMatch.None";
        }
        return "Invalid(value=" + i8 + ')';
    }
}
