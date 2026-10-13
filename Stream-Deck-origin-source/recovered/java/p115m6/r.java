package p115m6;

import Z6.v;
import kotlin.jvm.internal.t;
import p205x6.j;
import p205x6.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f30086a = k.b("0123456789abcdef");

    /* JADX WARN: Multi-variable type inference failed */
    public static final byte[] a(int i8) {
        j jVar = new j(null, 1, 0 == true ? 1 : 0);
        while (jVar.P1() < i8) {
            try {
                y.i(jVar, p.a(), 0, 0, null, 14, null);
            } catch (Throwable th) {
                jVar.T0();
                throw th;
            }
        }
        return y.b(jVar.M1(), i8);
    }

    public static final String b(byte[] bytes) {
        t.g(bytes, "bytes");
        char[] cArr = new char[bytes.length * 2];
        char[] cArr2 = f30086a;
        int i8 = 0;
        for (byte b8 : bytes) {
            int i9 = i8 + 1;
            cArr[i8] = cArr2[(b8 & 255) >> 4];
            i8 += 2;
            cArr[i9] = cArr2[b8 & 15];
        }
        return v.q(cArr);
    }
}
