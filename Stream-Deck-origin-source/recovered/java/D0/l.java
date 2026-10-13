package D0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final int a(int i8, int i9) {
        return (i8 >> i9) & 31;
    }

    public static final C0.e b() {
        return j.f1709c.a();
    }

    public static final Object[] c(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int d(int i8) {
        return (i8 - 1) & (-32);
    }
}
