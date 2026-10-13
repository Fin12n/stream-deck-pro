package p205x6;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;
import p189v6.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final int a(a aVar, a other, int i8) {
        t.g(aVar, "<this>");
        t.g(other, "other");
        int iMin = Math.min(other.k() - other.i(), i8);
        if (aVar.g() - aVar.k() <= iMin) {
            b(aVar, iMin);
        }
        ByteBuffer byteBufferH = aVar.h();
        int iK = aVar.k();
        aVar.g();
        ByteBuffer byteBufferH2 = other.h();
        int i9 = other.i();
        other.k();
        c.c(byteBufferH2, byteBufferH, i9, iMin, iK);
        other.c(iMin);
        aVar.a(iMin);
        return iMin;
    }

    public static final void b(a aVar, int i8) {
        if ((aVar.g() - aVar.k()) + (aVar.f() - aVar.g()) < i8) {
            throw new IllegalArgumentException("Can't append buffer: not enough free space at the end");
        }
        if ((aVar.k() + i8) - aVar.g() > 0) {
            aVar.m();
        }
    }

    public static final int c(a aVar, a other) {
        t.g(aVar, "<this>");
        t.g(other, "other");
        int iK = other.k() - other.i();
        int i8 = aVar.i();
        if (i8 < iK) {
            throw new IllegalArgumentException("Not enough space in the beginning to prepend bytes");
        }
        int i9 = i8 - iK;
        c.c(other.h(), aVar.h(), other.i(), iK, i9);
        other.c(iK);
        aVar.o(i9);
        return iK;
    }
}
