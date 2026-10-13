package p202x3;

import C3.f;
import C6.G;
import C6.r;
import M3.m;
import M3.p;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p038e1.InterfaceC2247s;
import p044e7.AbstractC2262h;
import p044e7.H;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;
import p044e7.O;
import p044e7.x;
import p053f7.l;
import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f37342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A3.p f37343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f37344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2260f f37345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M f37346e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f[] f37350a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f[] f37351a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2260f[] interfaceC2260fArr) {
                super(0);
                this.f37351a = interfaceC2260fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new Object[this.f37351a.length];
            }
        }

        public b(InterfaceC2260f[] interfaceC2260fArr) {
            this.f37350a = interfaceC2260fArr;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            InterfaceC2260f[] interfaceC2260fArr = this.f37350a;
            Object objA = l.a(interfaceC2261g, interfaceC2260fArr, new a(interfaceC2260fArr), new C0835b(null), dVar);
            return objA == H6.c.f() ? objA : G.f1419a;
        }

        /* JADX INFO: renamed from: x3.i$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0835b extends I6.l implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f37352a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f37353b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f37354c;

            public C0835b(G6.d dVar) {
                super(3, dVar);
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2261g interfaceC2261g, Object[] objArr, G6.d dVar) {
                C0835b c0835b = new C0835b(dVar);
                c0835b.f37353b = interfaceC2261g;
                c0835b.f37354c = objArr;
                return c0835b.invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Q3.b bVarF;
                Object objF = H6.c.f();
                int i8 = this.f37352a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        r.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    r.b(obj);
                    InterfaceC2261g interfaceC2261g = (InterfaceC2261g) this.f37353b;
                    Object[] objArr = (Object[]) this.f37354c;
                    boolean z8 = false;
                    Object obj2 = objArr[0];
                    t.e(obj2, GOKsbdzhLhXAMt.dBPEjSIyo);
                    Q3.b bVar = (Q3.b) obj2;
                    Object obj3 = objArr[1];
                    t.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                    Object obj4 = objArr[2];
                    t.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                    Object obj5 = objArr[3];
                    t.e(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                    Object obj6 = objArr[4];
                    t.e(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue4 = ((Boolean) obj6).booleanValue();
                    Object obj7 = objArr[5];
                    t.e(obj7, "null cannot be cast to non-null type com.elgato.streamdeck.settings.faceplate.Faceplate");
                    C3.b bVar2 = (C3.b) obj7;
                    if (zBooleanValue3 != bVar.e()) {
                        z8 = true;
                    }
                    if (zBooleanValue4 && z8) {
                        bVarF = Q3.b.k(bVar.f(!zBooleanValue2), null, 1, null);
                    } else {
                        bVarF = bVar.f(!zBooleanValue2);
                    }
                    a aVar = new a(bVarF, bVar2, zBooleanValue);
                    this.f37352a = 1;
                    if (interfaceC2261g.emit(aVar, this) == objF) {
                        return objF;
                    }
                }
                return G.f1419a;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f37355a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f37356a;

            /* JADX INFO: renamed from: x3.i$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0836a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f37357a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f37358b;

                public C0836a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f37357a = obj;
                    this.f37358b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f37356a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0836a c0836a;
                if (dVar instanceof C0836a) {
                    c0836a = (C0836a) dVar;
                    int i8 = c0836a.f37358b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0836a.f37358b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0836a = new C0836a(dVar);
                    }
                } else {
                    c0836a = new C0836a(dVar);
                }
                Object obj2 = c0836a.f37357a;
                Object objF = H6.c.f();
                int i9 = c0836a.f37358b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f37356a;
                    Boolean boolA = I6.b.a(((KnownHost.Device) obj).getKeypadRotation() == KnownHost.Device.KeypadOrientationOption.DYNAMIC);
                    c0836a.f37358b = 1;
                    if (interfaceC2261g.emit(boolA, c0836a) == objF) {
                        return objF;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public c(InterfaceC2260f interfaceC2260f) {
            this.f37355a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f37355a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f37360a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f37361a;

            /* JADX INFO: renamed from: x3.i$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0837a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f37362a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f37363b;

                public C0837a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f37362a = obj;
                    this.f37363b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f37361a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0837a c0837a;
                if (dVar instanceof C0837a) {
                    c0837a = (C0837a) dVar;
                    int i8 = c0837a.f37363b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0837a.f37363b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0837a = new C0837a(dVar);
                    }
                } else {
                    c0837a = new C0837a(dVar);
                }
                Object obj2 = c0837a.f37362a;
                Object objF = H6.c.f();
                int i9 = c0837a.f37363b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f37361a;
                    m.C1038c c1038c = (m.C1038c) obj;
                    Q3.b bVarF = c1038c != null ? c1038c.f() : null;
                    if (bVarF != null) {
                        c0837a.f37363b = 1;
                        if (interfaceC2261g.emit(bVarF, c0837a) == objF) {
                            return objF;
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public d(InterfaceC2260f interfaceC2260f) {
            this.f37360a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f37360a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    public i(p connectionHolder, A3.p purchaseViewModel, J coroutineScope, f faceplateManager) {
        t.g(connectionHolder, "connectionHolder");
        t.g(purchaseViewModel, "purchaseViewModel");
        t.g(coroutineScope, "coroutineScope");
        t.g(faceplateManager, "faceplateManager");
        this.f37342a = connectionHolder;
        this.f37343b = purchaseViewModel;
        x xVarA = O.a(Boolean.TRUE);
        this.f37344c = xVarA;
        InterfaceC2260f interfaceC2260fP = AbstractC2262h.p(new c(connectionHolder.f()));
        this.f37345d = interfaceC2260fP;
        this.f37346e = AbstractC2262h.T(new b(new InterfaceC2260f[]{new d(connectionHolder.e()), j.f(connectionHolder.e()), purchaseViewModel.k(), xVarA, interfaceC2260fP, faceplateManager.j()}), coroutineScope, H.a.b(H.f20929a, 1000L, 0L, 2, null), new a(new Q3.b(null, null, 0, 0, 15, null), null, false, 6, null));
    }

    public final void a() {
        this.f37342a.m(null);
    }

    public final m b() {
        return this.f37342a.d();
    }

    public final M c() {
        return this.f37346e;
    }

    public final void d(InterfaceC2247s coordinates) {
        t.g(coordinates, "coordinates");
        long jA = coordinates.a();
        if (A1.r.g(jA) <= 0 || A1.r.f(jA) <= 0) {
            return;
        }
        this.f37344c.setValue(Boolean.valueOf(A1.r.g(jA) / A1.r.f(jA) < 1));
    }

    public final void e() {
        V3.f.b(j.e());
        m mVarB = b();
        if (mVarB != null) {
            mVarB.P();
        }
    }

    public final void f(boolean z8) {
        if (z8) {
            e();
        } else {
            g();
        }
    }

    public final void g() {
        V3.f.b(j.e());
        m mVarB = b();
        if (mVarB != null) {
            mVarB.V();
        }
    }

    public final void h(Q3.a key, boolean z8) {
        t.g(key, "key");
        if (key.i()) {
            this.f37343b.n();
            return;
        }
        if (z8) {
            V3.f.b(j.d());
        }
        m mVarB = b();
        if (mVarB != null) {
            mVarB.N(key.f(), z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q3.b f37347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C3.b f37348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f37349c;

        public a(Q3.b keypad, C3.b faceplate, boolean z8) {
            t.g(keypad, "keypad");
            t.g(faceplate, "faceplate");
            this.f37347a = keypad;
            this.f37348b = faceplate;
            this.f37349c = z8;
        }

        public final C3.b a() {
            return this.f37348b;
        }

        public final Q3.b b() {
            return this.f37347a;
        }

        public final boolean c() {
            return this.f37349c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.c(this.f37347a, aVar.f37347a) && t.c(this.f37348b, aVar.f37348b) && this.f37349c == aVar.f37349c;
        }

        public int hashCode() {
            return (((this.f37347a.hashCode() * 31) + this.f37348b.hashCode()) * 31) + Boolean.hashCode(this.f37349c);
        }

        public String toString() {
            return "ViewState(keypad=" + this.f37347a + ", faceplate=" + this.f37348b + ", stalling=" + this.f37349c + ")";
        }

        public /* synthetic */ a(Q3.b bVar, C3.b bVar2, boolean z8, int i8, AbstractC2633k abstractC2633k) {
            this(bVar, (i8 & 2) != 0 ? new C3.b.h() : bVar2, (i8 & 4) != 0 ? false : z8);
        }
    }
}
