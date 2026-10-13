package I7;

import J7.C1034e;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f3851a = new f();

    public final String a(int i8) {
        if (i8 < 1000 || i8 >= 5000) {
            return "Code must be in range [1000,5000): " + i8;
        }
        if ((1004 > i8 || i8 >= 1007) && (1015 > i8 || i8 >= 3000)) {
            return null;
        }
        return "Code " + i8 + " is reserved and may not be used.";
    }

    public final void b(C1034e.a cursor, byte[] key) {
        t.g(cursor, "cursor");
        t.g(key, "key");
        int length = key.length;
        int i8 = 0;
        do {
            byte[] bArr = cursor.f4384e;
            int i9 = cursor.f4385f;
            int i10 = cursor.f4386g;
            if (bArr != null) {
                while (i9 < i10) {
                    int i11 = i8 % length;
                    bArr[i9] = (byte) (bArr[i9] ^ key[i11]);
                    i9++;
                    i8 = i11 + 1;
                }
            }
        } while (cursor.c() != -1);
    }

    public final void c(int i8) {
        String strA = a(i8);
        if (strA == null) {
            return;
        }
        t.d(strA);
        throw new IllegalArgumentException(strA.toString());
    }
}
