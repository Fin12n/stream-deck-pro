package io.sentry.android.replay.util;

import A1.r;
import R0.C1598l0;
import Z6.w;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.t;
import p038e1.AbstractC2248t;
import p038e1.InterfaceC2247s;
import p038e1.M;
import p056g1.F;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final Rect a(InterfaceC2247s interfaceC2247s, InterfaceC2247s interfaceC2247s2) {
        t.g(interfaceC2247s, "<this>");
        if (interfaceC2247s2 == null) {
            interfaceC2247s2 = AbstractC2248t.d(interfaceC2247s);
        }
        float fG = r.g(interfaceC2247s2.a());
        float f8 = r.f(interfaceC2247s2.a());
        Q0.h hVarT = InterfaceC2247s.t(interfaceC2247s2, interfaceC2247s, false, 2, null);
        float fI = hVarT.i();
        if (fI < 0.0f) {
            fI = 0.0f;
        }
        if (fI > fG) {
            fI = fG;
        }
        float fL = hVarT.l();
        if (fL < 0.0f) {
            fL = 0.0f;
        }
        if (fL > f8) {
            fL = f8;
        }
        float fJ = hVarT.j();
        if (fJ < 0.0f) {
            fJ = 0.0f;
        }
        if (fJ <= fG) {
            fG = fJ;
        }
        float fE = hVarT.e();
        float f9 = fE >= 0.0f ? fE : 0.0f;
        if (f9 <= f8) {
            f8 = f9;
        }
        if (fI == fG || fL == f8) {
            return new Rect();
        }
        long jN = interfaceC2247s2.n(Q0.g.a(fI, fL));
        long jN2 = interfaceC2247s2.n(Q0.g.a(fG, fL));
        long jN3 = interfaceC2247s2.n(Q0.g.a(fG, f8));
        long jN4 = interfaceC2247s2.n(Q0.g.a(fI, f8));
        float fO = Q0.f.o(jN);
        float fO2 = Q0.f.o(jN2);
        float fO3 = Q0.f.o(jN4);
        float fO4 = Q0.f.o(jN3);
        float fMin = Math.min(fO, Math.min(fO2, Math.min(fO3, fO4)));
        float fMax = Math.max(fO, Math.max(fO2, Math.max(fO3, fO4)));
        float fP = Q0.f.p(jN);
        float fP2 = Q0.f.p(jN2);
        float fP3 = Q0.f.p(jN4);
        float fP4 = Q0.f.p(jN3);
        return new Rect((int) fMin, (int) Math.min(fP, Math.min(fP2, Math.min(fP3, fP4))), (int) fMax, (int) Math.max(fP, Math.max(fP2, Math.max(fP3, fP4))));
    }

    public static final U0.b b(F f8) {
        t.g(f8, "<this>");
        List listH0 = f8.h0();
        int size = listH0.size();
        for (int i8 = 0; i8 < size; i8++) {
            L0.i iVarA = ((M) listH0.get(i8)).a();
            String name = iVarA.getClass().getName();
            t.f(name, "modifier::class.java.name");
            if (w.M(name, "Painter", false, 2, null)) {
                try {
                    Field declaredField = iVarA.getClass().getDeclaredField("painter");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(iVarA);
                    if (obj instanceof U0.b) {
                        return (U0.b) obj;
                    }
                } catch (Throwable unused) {
                }
                return null;
            }
        }
        return null;
    }

    public static final l c(F f8) {
        t.g(f8, "<this>");
        List listH0 = f8.h0();
        int size = listH0.size();
        C1598l0 c1598l0 = null;
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            L0.i iVarA = ((M) listH0.get(i8)).a();
            String modifierClassName = iVarA.getClass().getName();
            t.f(modifierClassName, "modifierClassName");
            if (w.M(modifierClassName, "Text", false, 2, null)) {
                try {
                    Field declaredField = iVarA.getClass().getDeclaredField("color");
                    declaredField.setAccessible(true);
                    declaredField.get(iVarA);
                } catch (Throwable unused) {
                }
                c1598l0 = null;
            } else if (w.M(modifierClassName, "Fill", false, 2, null)) {
                z8 = true;
            }
        }
        return new l(c1598l0, z8, null);
    }

    public static final boolean d(U0.b bVar) {
        t.g(bVar, "<this>");
        String name = bVar.getClass().getName();
        t.f(name, jULK.EUPNPrb);
        return (w.M(name, "Vector", false, 2, null) || w.M(name, "Color", false, 2, null) || w.M(name, "Brush", false, 2, null)) ? false : true;
    }
}
