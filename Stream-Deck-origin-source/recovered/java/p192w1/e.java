package p192w1;

import A1.d;
import S1.c;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.t;
import p128o1.C2742g;
import p128o1.I;
import p128o1.q;
import p128o1.x;
import p128o1.z;
import p168t1.AbstractC3009n;
import p184v1.a;
import p184v1.f;
import p216z1.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final q a(String str, I i8, List list, List list2, d dVar, AbstractC3009n.b bVar) {
        return new d(str, i8, list, list2, bVar, dVar);
    }

    public static final boolean c(I i8) {
        x xVarA;
        z zVarW = i8.w();
        C2742g c2742gC = (zVarW == null || (xVarA = zVarW.a()) == null) ? null : C2742g.c(xVarA.b());
        return !(c2742gC == null ? false : C2742g.f(c2742gC.i(), C2742g.f30803b.b()));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    public static final int d(int i8, p184v1.e eVar) {
        Locale localeB;
        l.a aVar = l.f39024b;
        if (l.j(i8, aVar.b())) {
            return 2;
        }
        if (l.j(i8, aVar.c())) {
            return 3;
        }
        if (l.j(i8, aVar.d())) {
            return 0;
        }
        if (l.j(i8, aVar.e())) {
            return 1;
        }
        if (!(l.j(i8, aVar.a()) ? true : l.j(i8, aVar.f()))) {
            throw new IllegalStateException("Invalid TextDirection.");
        }
        if (eVar != null) {
            f fVarA = eVar.m(0).a();
            t.e(fVarA, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            localeB = ((a) fVarA).b();
            if (localeB == null) {
                localeB = Locale.getDefault();
            }
        } else {
            localeB = Locale.getDefault();
        }
        int iA = c.a(localeB);
        return (iA == 0 || iA != 1) ? 2 : 3;
    }
}
