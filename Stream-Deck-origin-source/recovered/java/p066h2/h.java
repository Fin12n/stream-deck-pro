package p066h2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f24398a;

        public a(ByteBuffer byteBuffer) {
            this.f24398a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // h2.h.c
        public int a() {
            return this.f24398a.getInt();
        }

        @Override // h2.h.c
        public void b(int i8) {
            ByteBuffer byteBuffer = this.f24398a;
            byteBuffer.position(byteBuffer.position() + i8);
        }

        @Override // h2.h.c
        public long c() {
            return h.c(this.f24398a.getInt());
        }

        @Override // h2.h.c
        public long getPosition() {
            return this.f24398a.position();
        }

        @Override // h2.h.c
        public int readUnsignedShort() {
            return h.d(this.f24398a.getShort());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f24399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f24400b;

        public b(long j8, long j9) {
            this.f24399a = j8;
            this.f24400b = j9;
        }

        public long a() {
            return this.f24399a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        int a();

        void b(int i8);

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    public static b a(c cVar) throws IOException {
        long jC;
        cVar.b(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i8 = 0;
        while (true) {
            if (i8 >= unsignedShort) {
                jC = -1;
                break;
            }
            int iA = cVar.a();
            cVar.b(4);
            jC = cVar.c();
            cVar.b(4);
            if (1835365473 == iA) {
                break;
            }
            i8++;
        }
        if (jC != -1) {
            cVar.b((int) (jC - cVar.getPosition()));
            cVar.b(12);
            long jC2 = cVar.c();
            for (int i9 = 0; i9 < jC2; i9++) {
                int iA2 = cVar.a();
                long jC3 = cVar.c();
                long jC4 = cVar.c();
                if (1164798569 == iA2 || 1701669481 == iA2) {
                    return new b(jC3 + jC, jC4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static p075i2.b b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return p075i2.b.h(byteBufferDuplicate);
    }

    public static long c(int i8) {
        return ((long) i8) & 4294967295L;
    }

    public static int d(short s8) {
        return s8 & 65535;
    }
}
