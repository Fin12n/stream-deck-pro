package p011b1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15697a;

    public /* synthetic */ M(int i8) {
        this.f15697a = i8;
    }

    public static final /* synthetic */ M a(int i8) {
        return new M(i8);
    }

    public static boolean c(int i8, Object obj) {
        return (obj instanceof M) && i8 == ((M) obj).f();
    }

    public static int d(int i8) {
        return Integer.hashCode(i8);
    }

    public static String e(int i8) {
        return "PointerKeyboardModifiers(packedValue=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f15697a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f15697a;
    }

    public int hashCode() {
        return d(this.f15697a);
    }

    public String toString() {
        return e(this.f15697a);
    }

    public static int b(int i8) {
        return i8;
    }
}
