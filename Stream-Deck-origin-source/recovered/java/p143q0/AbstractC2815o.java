package p143q0;

import A1.d;
import A1.h;
import A1.r;
import A1.t;
import C6.G;
import L0.i;
import Q6.k;
import Q6.p;
import androidx.compose.foundation.layout.f;
import kotlin.jvm.internal.u;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;
import p065h1.X;
import p128o1.I;
import p128o1.J;
import p168t1.AbstractC3009n;
import p168t1.C;
import p168t1.y;
import p168t1.z;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.q1;

/* JADX INFO: renamed from: q0.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2815o {

    /* JADX INFO: renamed from: q0.o$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f31875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f31876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ I f31877c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i8, int i9, I i10) {
            super(1);
            this.f31875a = i8;
            this.f31876b = i9;
            this.f31877c = i10;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("heightInLines");
            c2403m0.a().b("minLines", Integer.valueOf(this.f31875a));
            c2403m0.a().b("maxLines", Integer.valueOf(this.f31876b));
            c2403m0.a().b("textStyle", this.f31877c);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: q0.o$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f31878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f31879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ I f31880c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8, int i9, I i10) {
            super(3);
            this.f31878a = i8;
            this.f31879b = i9;
            this.f31880c = i10;
        }

        public static final Object c(q1 q1Var) {
            return q1Var.getValue();
        }

        public final i b(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(408240218);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(408240218, i8, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
            }
            AbstractC2815o.b(this.f31878a, this.f31879b);
            if (this.f31878a == 1 && this.f31879b == Integer.MAX_VALUE) {
                i.a aVar = i.f4836a;
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                interfaceC3163l.N();
                return aVar;
            }
            d dVar = (d) interfaceC3163l.e(X.d());
            AbstractC3009n.b bVar = (AbstractC3009n.b) interfaceC3163l.e(X.f());
            t tVar = (t) interfaceC3163l.e(X.i());
            I i9 = this.f31880c;
            interfaceC3163l.f(511388516);
            boolean zR = interfaceC3163l.R(i9) | interfaceC3163l.R(tVar);
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = J.d(i9, tVar);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            I i10 = (I) objG;
            interfaceC3163l.f(511388516);
            boolean zR2 = interfaceC3163l.R(bVar) | interfaceC3163l.R(i10);
            Object objG2 = interfaceC3163l.g();
            if (zR2 || objG2 == InterfaceC3163l.f38803a.a()) {
                AbstractC3009n abstractC3009nJ = i10.j();
                C cO = i10.o();
                if (cO == null) {
                    cO = C.f33980b.c();
                }
                y yVarM = i10.m();
                int i11 = yVarM != null ? yVarM.i() : y.f34112b.b();
                z zVarN = i10.n();
                objG2 = bVar.b(abstractC3009nJ, cO, i11, zVarN != null ? zVarN.m() : z.f34116b.a());
                interfaceC3163l.H(objG2);
            }
            interfaceC3163l.N();
            q1 q1Var = (q1) objG2;
            Object[] objArr = {dVar, bVar, this.f31880c, tVar, c(q1Var)};
            interfaceC3163l.f(-568225417);
            boolean zR3 = false;
            for (int i12 = 0; i12 < 5; i12++) {
                zR3 |= interfaceC3163l.R(objArr[i12]);
            }
            Object objG3 = interfaceC3163l.g();
            if (zR3 || objG3 == InterfaceC3163l.f38803a.a()) {
                objG3 = Integer.valueOf(r.f(J.a(i10, dVar, bVar, J.c(), 1)));
                interfaceC3163l.H(objG3);
            }
            interfaceC3163l.N();
            int iIntValue = ((Number) objG3).intValue();
            Object[] objArr2 = {dVar, bVar, this.f31880c, tVar, c(q1Var)};
            interfaceC3163l.f(-568225417);
            boolean zR4 = false;
            for (int i13 = 0; i13 < 5; i13++) {
                zR4 |= interfaceC3163l.R(objArr2[i13]);
            }
            Object objG4 = interfaceC3163l.g();
            if (zR4 || objG4 == InterfaceC3163l.f38803a.a()) {
                objG4 = Integer.valueOf(r.f(J.a(i10, dVar, bVar, J.c() + '\n' + J.c(), 2)));
                interfaceC3163l.H(objG4);
            }
            interfaceC3163l.N();
            int iIntValue2 = ((Number) objG4).intValue() - iIntValue;
            int i14 = this.f31878a;
            Integer numValueOf = i14 == 1 ? null : Integer.valueOf(((i14 - 1) * iIntValue2) + iIntValue);
            int i15 = this.f31879b;
            Integer numValueOf2 = i15 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i15 - 1))) : null;
            i iVarJ = f.j(i.f4836a, numValueOf != null ? dVar.n0(numValueOf.intValue()) : h.f432b.c(), numValueOf2 != null ? dVar.n0(numValueOf2.intValue()) : h.f432b.c());
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return iVarJ;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final i a(i iVar, I i8, int i9, int i10) {
        return L0.h.a(iVar, AbstractC2401l0.c() ? new a(i9, i10, i8) : AbstractC2401l0.a(), new b(i9, i10, i8));
    }

    public static final void b(int i8, int i9) {
        if (i8 <= 0 || i9 <= 0) {
            throw new IllegalArgumentException(("both minLines " + i8 + " and maxLines " + i9 + " must be greater than zero").toString());
        }
        if (i8 <= i9) {
            return;
        }
        throw new IllegalArgumentException(("minLines " + i8 + " must be less than or equal to maxLines " + i9).toString());
    }
}
