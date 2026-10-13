package p200x1;

import A1.d;
import A1.v;
import A1.x;
import Q0.l;
import Q6.q;
import R0.C1598l0;
import R0.R0;
import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p128o1.B;
import p168t1.AbstractC3009n;
import p168t1.C;
import p168t1.y;
import p168t1.z;
import p192w1.g;
import p216z1.a;
import p216z1.k;
import p216z1.o;
import p216z1.s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final B a(g gVar, B b8, q qVar, d dVar, boolean z8) {
        long jG = v.g(b8.k());
        x.a aVar = x.f466b;
        if (x.g(jG, aVar.b())) {
            gVar.setTextSize(dVar.l1(b8.k()));
        } else if (x.g(jG, aVar.a())) {
            gVar.setTextSize(gVar.getTextSize() * v.h(b8.k()));
        }
        if (d(b8)) {
            AbstractC3009n abstractC3009nI = b8.i();
            C cN = b8.n();
            if (cN == null) {
                cN = C.f33980b.c();
            }
            y yVarL = b8.l();
            y yVarC = y.c(yVarL != null ? yVarL.i() : y.f34112b.b());
            z zVarM = b8.m();
            gVar.setTypeface((Typeface) qVar.i(abstractC3009nI, cN, yVarC, z.e(zVarM != null ? zVarM.m() : z.f34116b.a())));
        }
        if (b8.p() != null && !t.c(b8.p(), p184v1.e.f35061c.a())) {
            b.f37189a.b(gVar, b8.p());
        }
        if (b8.j() != null && !t.c(b8.j(), "")) {
            gVar.setFontFeatureSettings(b8.j());
        }
        if (b8.u() != null && !t.c(b8.u(), o.f39037c.a())) {
            gVar.setTextScaleX(gVar.getTextScaleX() * b8.u().b());
            gVar.setTextSkewX(gVar.getTextSkewX() + b8.u().c());
        }
        gVar.d(b8.g());
        gVar.c(b8.f(), l.f9103b.a(), b8.c());
        gVar.f(b8.r());
        gVar.g(b8.s());
        gVar.e(b8.h());
        if (x.g(v.g(b8.o()), aVar.b()) && v.h(b8.o()) != 0.0f) {
            float textSize = gVar.getTextSize() * gVar.getTextScaleX();
            float fL1 = dVar.l1(b8.o());
            if (textSize != 0.0f) {
                gVar.setLetterSpacing(fL1 / textSize);
            }
        } else if (x.g(v.g(b8.o()), aVar.a())) {
            gVar.setLetterSpacing(v.h(b8.o()));
        }
        return c(b8.o(), z8, b8.d(), b8.e());
    }

    public static final float b(float f8) {
        if (f8 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f8;
    }

    public static final B c(long j8, boolean z8, long j9, a aVar) {
        long jE = j9;
        boolean z9 = false;
        boolean z10 = z8 && x.g(v.g(j8), x.f466b.b()) && v.h(j8) != 0.0f;
        C1598l0.a aVar2 = C1598l0.f9405b;
        boolean z11 = (C1598l0.q(jE, aVar2.e()) || C1598l0.q(jE, aVar2.d())) ? false : true;
        if (aVar != null) {
            if (!a.e(aVar.h(), a.f38959b.a())) {
                z9 = true;
            }
        }
        if (!z10 && !z11 && !z9) {
            return null;
        }
        long jA = z10 ? j8 : v.f462b.a();
        if (!z11) {
            jE = aVar2.e();
        }
        return new B(0L, 0L, (C) null, (y) null, (z) null, (AbstractC3009n) null, (String) null, jA, z9 ? aVar : null, (o) null, (p184v1.e) null, jE, (k) null, (R0) null, (p128o1.y) null, (T0.g) null, 63103, (AbstractC2633k) null);
    }

    public static final boolean d(B b8) {
        return (b8.i() == null && b8.l() == null && b8.n() == null) ? false : true;
    }

    public static final void e(g gVar, s sVar) {
        if (sVar == null) {
            sVar = s.f39045c.a();
        }
        gVar.setFlags(sVar.c() ? gVar.getFlags() | 128 : gVar.getFlags() & (-129));
        int iB = sVar.b();
        s.b.a aVar = s.b.f39050a;
        if (s.b.e(iB, aVar.b())) {
            gVar.setFlags(gVar.getFlags() | 64);
            gVar.setHinting(0);
        } else if (s.b.e(iB, aVar.a())) {
            gVar.getFlags();
            gVar.setHinting(1);
        } else if (!s.b.e(iB, aVar.c())) {
            gVar.getFlags();
        } else {
            gVar.getFlags();
            gVar.setHinting(0);
        }
    }
}
