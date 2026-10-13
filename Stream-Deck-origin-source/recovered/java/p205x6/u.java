package p205x6;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;
import p189v6.c;
import p213y6.a;
import p213y6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u {
    public static final void a(s sVar, a src, int i8) {
        t.g(sVar, "<this>");
        t.g(src, "src");
        a aVarD = g.d(sVar, 1, null);
        while (true) {
            try {
                int iMin = Math.min(i8, aVarD.g() - aVarD.k());
                f.f(aVarD, src, iMin);
                i8 -= iMin;
                if (i8 <= 0) {
                    sVar.c();
                    return;
                }
                aVarD = g.d(sVar, 1, aVarD);
            } catch (Throwable th) {
                sVar.c();
                throw th;
            }
        }
    }

    public static final void b(s sVar, byte[] src, int i8, int i9) {
        t.g(sVar, "<this>");
        t.g(src, "src");
        a aVarD = g.d(sVar, 1, null);
        while (true) {
            try {
                int iMin = Math.min(i9, aVarD.g() - aVarD.k());
                f.g(aVarD, src, i8, iMin);
                i8 += iMin;
                i9 -= iMin;
                if (i9 <= 0) {
                    sVar.c();
                    return;
                }
                aVarD = g.d(sVar, 1, aVarD);
            } catch (Throwable th) {
                sVar.c();
                throw th;
            }
        }
    }

    public static /* synthetic */ void c(s sVar, a aVar, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = aVar.k() - aVar.i();
        }
        a(sVar, aVar, i8);
    }

    public static /* synthetic */ void d(s sVar, byte[] bArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length - i8;
        }
        b(sVar, bArr, i8, i9);
    }

    public static final void e(s writeFully, ByteBuffer src, int i8, int i9) {
        t.g(writeFully, "$this$writeFully");
        t.g(src, "src");
        f(writeFully, src, i8, i9);
    }

    public static final void f(s writeFully, ByteBuffer src, long j8, long j9) {
        t.g(writeFully, "$this$writeFully");
        t.g(src, "src");
        a aVarD = g.d(writeFully, 1, null);
        long j10 = j8;
        while (true) {
            try {
                long jMin = Math.min(j9, aVarD.g() - aVarD.k());
                ByteBuffer byteBuffer = src;
                c.d(byteBuffer, aVarD.h(), j10, jMin, aVarD.k());
                aVarD.a((int) jMin);
                j10 += jMin;
                j9 -= jMin;
                if (j9 <= 0) {
                    writeFully.c();
                    return;
                } else {
                    aVarD = g.d(writeFully, 1, aVarD);
                    src = byteBuffer;
                }
            } catch (Throwable th) {
                writeFully.c();
                throw th;
            }
        }
    }
}
