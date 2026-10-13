package p191w0;

import A1.h;
import A1.y;
import G6.d;
import I0.j;
import Q0.f;
import Q0.g;
import Q6.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p002a1.e;
import p055g0.B;
import p065h1.X;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f35199a = h.m(22);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements p002a1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B0 f35200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f35201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B f35202c;

        public a(B0 b8, k kVar, B b9) {
            this.f35200a = b8;
            this.f35201b = kVar;
            this.f35202c = b9;
        }

        @Override // p002a1.a
        public Object L0(long j8, long j9, d dVar) {
            this.f35201b.invoke(I6.b.c(c(j9)));
            return y.b(j9);
        }

        @Override // p002a1.a
        public Object Z(long j8, d dVar) {
            float fC = c(j8);
            float fO = this.f35200a.o();
            float fA = this.f35200a.e().o().a();
            if (fC >= 0.0f || fO <= fA) {
                j8 = y.f471b.a();
            } else {
                this.f35201b.invoke(I6.b.c(fC));
            }
            return y.b(j8);
        }

        public final float a(long j8) {
            return this.f35202c == B.Horizontal ? f.o(j8) : f.p(j8);
        }

        public final long b(float f8) {
            B b8 = this.f35202c;
            float f9 = b8 == B.Horizontal ? f8 : 0.0f;
            if (b8 != B.Vertical) {
                f8 = 0.0f;
            }
            return g.a(f9, f8);
        }

        public final float c(long j8) {
            return this.f35202c == B.Horizontal ? y.h(j8) : y.i(j8);
        }

        @Override // p002a1.a
        public long f1(long j8, long j9, int i8) {
            return e.e(i8, e.f13022a.a()) ? b(this.f35200a.e().n(a(j9))) : f.f9082b.c();
        }

        @Override // p002a1.a
        public long w0(long j8, int i8) {
            float fA = a(j8);
            return (fA >= 0.0f || !e.e(i8, e.f13022a.a())) ? f.f9082b.c() : b(this.f35200a.e().n(fA));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35203a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C0 c8) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f35204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A1.d f35205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C0 f35206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f35207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f35208e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z8, A1.d dVar, C0 c8, k kVar, boolean z9) {
            super(0);
            this.f35204a = z8;
            this.f35205b = dVar;
            this.f35206c = c8;
            this.f35207d = kVar;
            this.f35208e = z9;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final B0 invoke() {
            return new B0(this.f35204a, this.f35205b, this.f35206c, this.f35207d, this.f35208e);
        }
    }

    public static final p002a1.a a(B0 b8, B b9, k kVar) {
        return new a(b8, kVar, b9);
    }

    public static final B0 c(boolean z8, k kVar, C0 c8, boolean z9, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        interfaceC3163l.f(1032784200);
        boolean z10 = (i9 & 1) != 0 ? false : z8;
        if ((i9 & 2) != 0) {
            kVar = b.f35203a;
        }
        k kVar2 = kVar;
        C0 c9 = (i9 & 4) != 0 ? C0.Hidden : c8;
        boolean z11 = (i9 & 8) != 0 ? false : z9;
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1032784200, i8, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:480)");
        }
        A1.d dVar = (A1.d) interfaceC3163l.e(X.d());
        Object[] objArr = {Boolean.valueOf(z10), kVar2};
        j jVarA = B0.f35211e.a(z10, kVar2, dVar);
        interfaceC3163l.f(1097108455);
        boolean zR = ((((i8 & 14) ^ 6) > 4 && interfaceC3163l.c(z10)) || (i8 & 6) == 4) | interfaceC3163l.R(dVar) | ((((i8 & 896) ^ 384) > 256 && interfaceC3163l.R(c9)) || (i8 & 384) == 256) | ((((i8 & 112) ^ 48) > 32 && interfaceC3163l.R(kVar2)) || (i8 & 48) == 32) | ((((i8 & 7168) ^ 3072) > 2048 && interfaceC3163l.c(z11)) || (i8 & 3072) == 2048);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            Object cVar = new c(z10, dVar, c9, kVar2, z11);
            interfaceC3163l.H(cVar);
            objG = cVar;
        }
        interfaceC3163l.N();
        B0 b8 = (B0) I0.b.b(objArr, jVarA, null, (Function0) objG, interfaceC3163l, 0, 4);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return b8;
    }
}
