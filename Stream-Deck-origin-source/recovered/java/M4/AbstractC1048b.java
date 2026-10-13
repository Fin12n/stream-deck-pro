package M4;

/* JADX INFO: renamed from: M4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1048b {
    public static int a(int i8, int i9) {
        if (i9 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i10 = i8 + (i8 >> 1) + 1;
        if (i10 < i9) {
            int iHighestOneBit = Integer.highestOneBit(i9 - 1);
            i10 = iHighestOneBit + iHighestOneBit;
        }
        if (i10 < 0) {
            return Integer.MAX_VALUE;
        }
        return i10;
    }
}
