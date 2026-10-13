package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class R0 extends A0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f18014b = Logger.getLogger(R0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f18015c = AbstractC1989z2.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S0 f18016a;

    public /* synthetic */ R0(Q0 q8) {
    }

    public static int A(M1 m8) {
        int iA = m8.a();
        return a(iA) + iA;
    }

    public static int B(M1 m8, InterfaceC1890f2 interfaceC1890f2) {
        int iC = ((AbstractC1962u0) m8).c(interfaceC1890f2);
        return a(iC) + iC;
    }

    public static int C(String str) {
        int length;
        try {
            length = F2.e(str);
        } catch (E2 unused) {
            length = str.getBytes(AbstractC1953s1.f18650a).length;
        }
        return a(length) + length;
    }

    public static int a(int i8) {
        return (352 - (Integer.numberOfLeadingZeros(i8) * 9)) >>> 6;
    }

    public static int b(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    public static int z(int i8, M1 m8, InterfaceC1890f2 interfaceC1890f2) {
        int iA = a(i8 << 3);
        return iA + iA + ((AbstractC1962u0) m8).c(interfaceC1890f2);
    }

    public final void c() {
        if (f() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void d(String str, E2 e8) throws P0 {
        f18014b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e8);
        byte[] bytes = str.getBytes(AbstractC1953s1.f18650a);
        try {
            int length = bytes.length;
            w(length);
            p(bytes, 0, length);
        } catch (IndexOutOfBoundsException e9) {
            throw new P0(e9);
        }
    }

    public abstract int f();

    public abstract void g(byte b8);

    public abstract void h(int i8, boolean z8);

    public abstract void i(int i8, J0 j8);

    public abstract void j(int i8, int i9);

    public abstract void k(int i8);

    public abstract void l(int i8, long j8);

    public abstract void m(long j8);

    public abstract void n(int i8, int i9);

    public abstract void o(int i8);

    public abstract void p(byte[] bArr, int i8, int i9);

    public abstract void q(int i8, M1 m8, InterfaceC1890f2 interfaceC1890f2);

    public abstract void r(int i8, M1 m8);

    public abstract void s(int i8, J0 j8);

    public abstract void t(int i8, String str);

    public abstract void u(int i8, int i9);

    public abstract void v(int i8, int i9);

    public abstract void w(int i8);

    public abstract void x(int i8, long j8);

    public abstract void y(long j8);
}
