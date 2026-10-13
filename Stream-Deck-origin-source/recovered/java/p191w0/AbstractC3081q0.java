package p191w0;

import C6.G;
import Q6.o;
import R0.C1598l0;
import kotlin.jvm.internal.u;
import p128o1.I;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.C0;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: renamed from: w0.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3081q0 {

    /* JADX INFO: renamed from: w0.q0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f36356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ I f36357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f36358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f36359d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, I i8, o oVar, int i9) {
            super(2);
            this.f36356a = j8;
            this.f36357b = i8;
            this.f36358c = oVar;
            this.f36359d = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC3081q0.a(this.f36356a, this.f36357b, this.f36358c, interfaceC3163l, F0.a(this.f36359d | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(long j8, I i8, o oVar, InterfaceC3163l interfaceC3163l, int i9) {
        int i10;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1479790536);
        if ((i9 & 6) == 0) {
            i10 = (interfaceC3163lP.j(j8) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= interfaceC3163lP.R(i8) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= interfaceC3163lP.l(oVar) ? 256 : 128;
        }
        if ((i10 & 147) == 146 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1479790536, i10, -1, "androidx.compose.material3.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:36)");
            }
            AbstractC3182v.b(new C0[]{B.a().c(C1598l0.g(j8)), P0.c().c(((I) interfaceC3163lP.e(P0.c())).I(i8))}, oVar, interfaceC3163lP, (i10 >> 3) & 112);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(j8, i8, oVar, i9));
        }
    }
}
