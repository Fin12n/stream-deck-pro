package J7;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface g extends C, ReadableByteChannel {
    long C0(h hVar);

    long G1(h hVar);

    C1034e H();

    h I(long j8);

    void S1(long j8);

    long W1();

    void Y0(C1034e c1034e, long j8);

    InputStream Y1();

    boolean f0();

    C1034e l();

    String n1();

    long p0();

    g peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j8);

    String s0(long j8);

    byte[] s1(long j8);

    void skip(long j8);

    int y0(s sVar);
}
