package Q0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final String a(float f8, int i8) {
        int iMax = Math.max(i8, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f9 = f8 * fPow;
        int i9 = (int) f9;
        if (f9 - i9 >= 0.5f) {
            i9++;
        }
        float f10 = i9 / fPow;
        return iMax > 0 ? String.valueOf(f10) : String.valueOf((int) f10);
    }
}
