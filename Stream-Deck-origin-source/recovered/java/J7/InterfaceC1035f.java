package J7;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: J7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1035f extends A, WritableByteChannel {
    InterfaceC1035f I0(String str);

    long M(C c8);

    InterfaceC1035f Q();

    InterfaceC1035f R0(h hVar);

    InterfaceC1035f T1(long j8);

    InterfaceC1035f b1(String str, int i8, int i9);

    InterfaceC1035f c1(long j8);

    @Override // J7.A, java.io.Flushable
    void flush();

    C1034e l();

    InterfaceC1035f o0();

    InterfaceC1035f write(byte[] bArr);

    InterfaceC1035f write(byte[] bArr, int i8, int i9);

    InterfaceC1035f writeByte(int i8);

    InterfaceC1035f writeInt(int i8);

    InterfaceC1035f writeShort(int i8);
}
