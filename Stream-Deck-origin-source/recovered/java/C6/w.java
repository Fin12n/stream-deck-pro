package C6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1455b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f1456a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ w(byte b8) {
        this.f1456a = b8;
    }

    public static final /* synthetic */ w a(byte b8) {
        return new w(b8);
    }

    public static boolean c(byte b8, Object obj) {
        return (obj instanceof w) && b8 == ((w) obj).m();
    }

    public static final boolean d(byte b8, byte b9) {
        return b8 == b9;
    }

    public static int e(byte b8) {
        return Byte.hashCode(b8);
    }

    public static String j(byte b8) {
        return String.valueOf(b8 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.t.h(m() & 255, ((w) obj).m() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f1456a, obj);
    }

    public int hashCode() {
        return e(this.f1456a);
    }

    public final /* synthetic */ byte m() {
        return this.f1456a;
    }

    public String toString() {
        return j(this.f1456a);
    }

    public static byte b(byte b8) {
        return b8;
    }
}
