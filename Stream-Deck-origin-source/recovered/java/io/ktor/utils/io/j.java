package io.ktor.utils.io;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static /* synthetic */ Object a(j jVar, int i8, Q6.k kVar, G6.d dVar, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
            }
            if ((i9 & 1) != 0) {
                i8 = 1;
            }
            return jVar.v(i8, kVar, dVar);
        }
    }

    Object C(p205x6.a aVar, G6.d dVar);

    Object E(byte b8, G6.d dVar);

    Object K(p205x6.k kVar, G6.d dVar);

    boolean L();

    Throwable a();

    Object b(ByteBuffer byteBuffer, G6.d dVar);

    Object c(long j8, G6.d dVar);

    boolean d(Throwable th);

    void flush();

    Object g(ByteBuffer byteBuffer, int i8, int i9, G6.d dVar);

    Object i(short s8, G6.d dVar);

    Object l(byte[] bArr, int i8, int i9, G6.d dVar);

    Object v(int i8, Q6.k kVar, G6.d dVar);

    Object y(int i8, G6.d dVar);
}
