package p191w0;

import A1.h;
import C6.G;
import C6.InterfaceC0916e;
import I0.j;
import I0.l;
import Q6.k;
import Q6.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f35211e = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3062h f35214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A1.d f35215d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35216a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C0 c8) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35217a = new b();

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
    public static final class c {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f35218a = new a();

            public a() {
                super(2);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0 invoke(l lVar, B0 b8) {
                return b8.f();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f35219a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ A1.d f35220b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f35221c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z8, A1.d dVar, k kVar) {
                super(1);
                this.f35219a = z8;
                this.f35220b = dVar;
                this.f35221c = kVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final B0 invoke(C0 c8) {
                return new B0(this.f35219a, this.f35220b, c8, this.f35221c, false, 16, null);
            }
        }

        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public final j a(boolean z8, k kVar, A1.d dVar) {
            return I0.k.a(a.f35218a, new b(z8, dVar, kVar));
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {
        public d() {
            super(1);
        }

        public final Float b(float f8) {
            return Float.valueOf(B0.this.n().E0(h.m(56)));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(B0.this.n().E0(h.m(125)));
        }
    }

    @InterfaceC0916e
    public B0(boolean z8, C0 c8, k kVar, boolean z9) {
        this.f35212a = z8;
        this.f35213b = z9;
        if (z8 && c8 == C0.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z9 && c8 == C0.Hidden) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.f35214c = new C3062h(c8, new d(), new e(), C3058f.f35860a.a(), kVar);
    }

    public static /* synthetic */ Object c(B0 b8, C0 c8, float f8, G6.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f8 = b8.f35214c.v();
        }
        return b8.b(c8, f8, dVar);
    }

    public final Object b(C0 c8, float f8, G6.d dVar) throws Throwable {
        Object objD = AbstractC3060g.d(this.f35214c, c8, f8, dVar);
        return objD == H6.c.f() ? objD : G.f1419a;
    }

    public final Object d(G6.d dVar) {
        Object objE = AbstractC3060g.e(this.f35214c, C0.Expanded, 0.0f, dVar, 2, null);
        return objE == H6.c.f() ? objE : G.f1419a;
    }

    public final C3062h e() {
        return this.f35214c;
    }

    public final C0 f() {
        return (C0) this.f35214c.s();
    }

    public final boolean g() {
        return this.f35214c.o().e(C0.Expanded);
    }

    public final boolean h() {
        return this.f35214c.o().e(C0.PartiallyExpanded);
    }

    public final boolean i() {
        return this.f35212a;
    }

    public final C0 j() {
        return (C0) this.f35214c.x();
    }

    public final Object k(G6.d dVar) {
        if (this.f35213b) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Object objC = c(this, C0.Hidden, 0.0f, dVar, 2, null);
        return objC == H6.c.f() ? objC : G.f1419a;
    }

    public final boolean l() {
        return this.f35214c.s() != C0.Hidden;
    }

    public final Object m(G6.d dVar) {
        if (this.f35212a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object objC = c(this, C0.PartiallyExpanded, 0.0f, dVar, 2, null);
        return objC == H6.c.f() ? objC : G.f1419a;
    }

    public final A1.d n() {
        A1.d dVar = this.f35215d;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
    }

    public final float o() {
        return this.f35214c.A();
    }

    public final void p(A1.d dVar) {
        this.f35215d = dVar;
    }

    public final Object q(float f8, G6.d dVar) throws Throwable {
        Object objG = this.f35214c.G(f8, dVar);
        return objG == H6.c.f() ? objG : G.f1419a;
    }

    public final Object r(G6.d dVar) {
        Object objC = c(this, h() ? C0.PartiallyExpanded : C0.Expanded, 0.0f, dVar, 2, null);
        return objC == H6.c.f() ? objC : G.f1419a;
    }

    public /* synthetic */ B0(boolean z8, C0 c8, k kVar, boolean z9, int i8, AbstractC2633k abstractC2633k) {
        this(z8, (i8 & 2) != 0 ? C0.Hidden : c8, (i8 & 4) != 0 ? a.f35216a : kVar, (i8 & 8) != 0 ? false : z9);
    }

    public /* synthetic */ B0(boolean z8, A1.d dVar, C0 c8, k kVar, boolean z9, int i8, AbstractC2633k abstractC2633k) {
        this(z8, dVar, (i8 & 4) != 0 ? C0.Hidden : c8, (i8 & 8) != 0 ? b.f35217a : kVar, (i8 & 16) != 0 ? false : z9);
    }

    public B0(boolean z8, A1.d dVar, C0 c8, k kVar, boolean z9) {
        this(z8, c8, kVar, z9);
        this.f35215d = dVar;
    }
}
