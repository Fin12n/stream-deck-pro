package p046f0;

import R0.C1598l0;
import T0.c;
import T0.f;
import p073i0.i;
import p073i0.k;
import p073i0.r;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.q1;

/* JADX INFO: renamed from: f0.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2289q implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2289q f21492a = new C2289q();

    /* JADX INFO: renamed from: f0.q$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q1 f21493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q1 f21494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q1 f21495c;

        public a(q1 q1Var, q1 q1Var2, q1 q1Var3) {
            this.f21493a = q1Var;
            this.f21494b = q1Var2;
            this.f21495c = q1Var3;
        }

        @Override // p046f0.F
        public void a(c cVar) {
            cVar.v1();
            if (((Boolean) this.f21493a.getValue()).booleanValue()) {
                f.w1(cVar, C1598l0.o(C1598l0.f9405b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.d(), 0.0f, null, null, 0, 122, null);
            } else if (((Boolean) this.f21494b.getValue()).booleanValue() || ((Boolean) this.f21495c.getValue()).booleanValue()) {
                f.w1(cVar, C1598l0.o(C1598l0.f9405b.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.d(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    @Override // p046f0.E
    public F a(k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(1683566979);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1683566979, i8, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        int i9 = i8 & 14;
        q1 q1VarA = r.a(kVar, interfaceC3163l, i9);
        q1 q1VarA2 = i.a(kVar, interfaceC3163l, i9);
        q1 q1VarA3 = p073i0.f.a(kVar, interfaceC3163l, i9);
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(kVar);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = new a(q1VarA, q1VarA2, q1VarA3);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        a aVar = (a) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return aVar;
    }
}
