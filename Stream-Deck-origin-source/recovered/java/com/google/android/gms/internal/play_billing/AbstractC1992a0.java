package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1992a0 extends G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f18872b = Logger.getLogger(AbstractC1992a0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f18873c = G1.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1996b0 f18874a;

    public /* synthetic */ AbstractC1992a0(Z z8) {
    }

    public static int t(int i8, V0 v8, InterfaceC2017g1 interfaceC2017g1) {
        int iW = w(i8 << 3);
        return iW + iW + ((AbstractC2083z) v8).c(interfaceC2017g1);
    }

    public static int u(V0 v8, InterfaceC2017g1 interfaceC2017g1) {
        int iC = ((AbstractC2083z) v8).c(interfaceC2017g1);
        return w(iC) + iC;
    }

    public static int v(String str) {
        int length;
        try {
            length = L1.c(str);
        } catch (K1 unused) {
            length = str.getBytes(AbstractC2081y0.f19032b).length;
        }
        return w(length) + length;
    }

    public static int w(int i8) {
        return (352 - (Integer.numberOfLeadingZeros(i8) * 9)) >>> 6;
    }

    public static int x(long j8) {
        return (640 - (Long.numberOfLeadingZeros(j8) * 9)) >>> 6;
    }

    public static AbstractC1992a0 y(byte[] bArr, int i8, int i9) {
        return new X(bArr, 0, i9);
    }

    public final void a(String str, K1 k8) throws Y {
        f18872b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) k8);
        byte[] bytes = str.getBytes(AbstractC2081y0.f19032b);
        try {
            int length = bytes.length;
            q(length);
            m(bytes, 0, length);
        } catch (IndexOutOfBoundsException e8) {
            throw new Y(e8);
        }
    }

    public abstract int c();

    public abstract void d(byte b8);

    public abstract void e(int i8, boolean z8);

    public abstract void f(int i8, S s8);

    public abstract void g(int i8, int i9);

    public abstract void h(int i8);

    public abstract void i(int i8, long j8);

    public abstract void j(long j8);

    public abstract void k(int i8, int i9);

    public abstract void l(int i8);

    public abstract void m(byte[] bArr, int i8, int i9);

    public abstract void n(int i8, String str);

    public abstract void o(int i8, int i9);

    public abstract void p(int i8, int i9);

    public abstract void q(int i8);

    public abstract void r(int i8, long j8);

    public abstract void s(long j8);

    public final void z() {
        if (c() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
