package p112m3;

import com.amazon.a.a.o.c.a.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static String a(int i8, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = iArr[i9];
            if (i10 == 1 || i10 == 2) {
                sb.append('[');
                sb.append(iArr2[i9]);
                sb.append(']');
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                sb.append(b.f16789a);
                String str = strArr[i9];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
