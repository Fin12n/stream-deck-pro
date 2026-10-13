package p118n0;

import A1.s;
import C6.G;
import G6.d;
import H6.c;
import Q0.h;
import Q0.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.InterfaceC2247s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f extends p118n0.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f30488p;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f30489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f30490b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, f fVar) {
            super(0);
            this.f30489a = hVar;
            this.f30490b = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            h hVar = this.f30489a;
            if (hVar != null) {
                return hVar;
            }
            InterfaceC2247s interfaceC2247sD2 = this.f30490b.d2();
            if (interfaceC2247sD2 != null) {
                return m.c(s.c(interfaceC2247sD2.a()));
            }
            return null;
        }
    }

    public f(d dVar) {
        this.f30488p = dVar;
    }

    @Override // L0.i.c
    public void N1() {
        i2(this.f30488p);
    }

    @Override // L0.i.c
    public void O1() {
        h2();
    }

    public final Object g2(h hVar, d dVar) {
        c cVarF2 = f2();
        InterfaceC2247s interfaceC2247sD2 = d2();
        if (interfaceC2247sD2 == null) {
            return G.f1419a;
        }
        Object objO1 = cVarF2.o1(interfaceC2247sD2, new a(hVar, this), dVar);
        return objO1 == c.f() ? objO1 : G.f1419a;
    }

    public final void h2() {
        d dVar = this.f30488p;
        if (dVar instanceof e) {
            t.e(dVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((e) dVar).c().z(this);
        }
    }

    public final void i2(d dVar) {
        h2();
        if (dVar instanceof e) {
            ((e) dVar).c().d(this);
        }
        this.f30488p = dVar;
    }
}
