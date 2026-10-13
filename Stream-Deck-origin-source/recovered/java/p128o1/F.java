package p128o1;

import A1.r;
import Q0.f;
import Q0.h;
import Q0.i;
import Q0.m;
import R0.AbstractC1582d0;
import R0.C1598l0;
import R0.InterfaceC1586f0;
import R0.R0;
import T0.g;
import T0.j;
import p216z1.k;
import p216z1.n;
import p216z1.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f30757a = new F();

    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:54:? A[SYNTHETIC] */
    public final void a(InterfaceC1586f0 interfaceC1586f0, E e8) throws Throwable {
        InterfaceC1586f0 interfaceC1586f1;
        Throwable th;
        InterfaceC1586f0 interfaceC1586f2;
        float fC;
        boolean z8 = e8.i() && !t.e(e8.l().f(), t.f39054a.c());
        if (z8) {
            h hVarB = i.b(f.f9082b.c(), m.a(r.g(e8.B()), r.f(e8.B())));
            interfaceC1586f0.k();
            interfaceC1586f1 = null;
            InterfaceC1586f0.v(interfaceC1586f0, hVarB, 0, 2, null);
        }
        B bY = e8.l().i().y();
        k kVarS = bY.s();
        if (kVarS == null) {
            kVarS = k.f39019b.c();
        }
        k kVar = kVarS;
        R0 r0R = bY.r();
        if (r0R == null) {
            r0R = R0.f9335d.a();
        }
        R0 r8 = r0R;
        g gVarH = bY.h();
        if (gVarH == null) {
            gVarH = j.f9812a;
        }
        g gVar = gVarH;
        try {
            AbstractC1582d0 abstractC1582d0F = bY.f();
            try {
                if (abstractC1582d0F != null) {
                    if (bY.t() != n.b.f39034b) {
                        try {
                            fC = bY.t().c();
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC1586f1 = interfaceC1586f0;
                            if (z8) {
                                throw th;
                            }
                            interfaceC1586f1.x();
                            throw th;
                        }
                    } else {
                        fC = 1.0f;
                    }
                    interfaceC1586f2 = interfaceC1586f0;
                    C2744i.F(e8.w(), interfaceC1586f2, abstractC1582d0F, fC, r8, kVar, gVar, 0, 64, null);
                } else {
                    interfaceC1586f2 = interfaceC1586f0;
                    e8.w().C(interfaceC1586f2, (32 & 2) != 0 ? C1598l0.f9405b.e() : bY.t() != n.b.f39034b ? bY.t().d() : C1598l0.f9405b.a(), (32 & 4) != 0 ? null : r8, (32 & 8) != 0 ? null : kVar, (32 & 16) == 0 ? gVar : null, (32 & 32) != 0 ? T0.f.f9808L.a() : 0);
                }
                if (z8) {
                    interfaceC1586f2.x();
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                if (z8) {
                    throw th;
                }
                interfaceC1586f1.x();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            interfaceC1586f1 = interfaceC1586f0;
        }
    }
}
