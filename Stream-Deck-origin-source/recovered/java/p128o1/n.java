package p128o1;

import Q0.h;
import R0.AbstractC1582d0;
import R0.C1598l0;
import R0.H0;
import R0.InterfaceC1586f0;
import R0.R0;
import T0.f;
import T0.g;
import java.util.List;
import p216z1.i;
import p216z1.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface n {
    static /* synthetic */ void i(n nVar, InterfaceC1586f0 interfaceC1586f0, AbstractC1582d0 abstractC1582d0, float f8, R0 r8, k kVar, g gVar, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        if ((i9 & 4) != 0) {
            f8 = Float.NaN;
        }
        nVar.v(interfaceC1586f0, abstractC1582d0, f8, (i9 & 8) != 0 ? null : r8, (i9 & 16) != 0 ? null : kVar, (i9 & 32) != 0 ? null : gVar, (i9 & 64) != 0 ? f.f9808L.a() : i8);
    }

    static /* synthetic */ void y(n nVar, InterfaceC1586f0 interfaceC1586f0, long j8, R0 r8, k kVar, g gVar, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        nVar.B(interfaceC1586f0, (i9 & 2) != 0 ? C1598l0.f9405b.e() : j8, (i9 & 4) != 0 ? null : r8, (i9 & 8) != 0 ? null : kVar, (i9 & 16) == 0 ? gVar : null, (i9 & 32) != 0 ? f.f9808L.a() : i8);
    }

    int A(float f8);

    void B(InterfaceC1586f0 interfaceC1586f0, long j8, R0 r8, k kVar, g gVar, int i8);

    H0 C(int i8, int i9);

    float D(int i8, boolean z8);

    float E(int i8);

    float a(int i8);

    float b(int i8);

    float c();

    int d(int i8);

    int e();

    float f();

    float g();

    float h();

    void j(long j8, float[] fArr, int i8);

    i k(int i8);

    float l();

    h m(int i8);

    long n(int i8);

    int o(int i8);

    float p();

    i q(int i8);

    int r(long j8);

    h s(int i8);

    List t();

    boolean u(int i8);

    void v(InterfaceC1586f0 interfaceC1586f0, AbstractC1582d0 abstractC1582d0, float f8, R0 r8, k kVar, g gVar, int i8);

    int w(int i8, boolean z8);

    float x(int i8);

    boolean z();
}
