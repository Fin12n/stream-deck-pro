package p055g0;

import A1.d;
import C6.G;
import C6.r;
import p098k7.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class E implements D, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f22792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p098k7.a f22795d = c.a(false);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22797b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22799d;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22797b = obj;
            this.f22799d |= Integer.MIN_VALUE;
            return E.this.f(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22801b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22803d;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22801b = obj;
            this.f22803d |= Integer.MIN_VALUE;
            return E.this.s1(this);
        }
    }

    public E(d dVar) {
        this.f22792a = dVar;
    }

    @Override // A1.d
    public float E0(float f8) {
        return this.f22792a.E0(f8);
    }

    @Override // A1.l
    public long H(float f8) {
        return this.f22792a.H(f8);
    }

    @Override // A1.d
    public long I(long j8) {
        return this.f22792a.I(j8);
    }

    @Override // A1.l
    public float T(long j8) {
        return this.f22792a.T(j8);
    }

    @Override // A1.d
    public int V0(float f8) {
        return this.f22792a.V0(f8);
    }

    public final void c() {
        this.f22794c = true;
        p098k7.a.C0628a.c(this.f22795d, null, 1, null);
    }

    public final void e() {
        this.f22793b = true;
        p098k7.a.C0628a.c(this.f22795d, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(G6.d dVar) {
        a aVar;
        E e8;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f22799d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f22799d = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f22797b;
        Object objF = H6.c.f();
        int i9 = aVar.f22799d;
        if (i9 == 0) {
            r.b(obj);
            p098k7.a aVar2 = this.f22795d;
            aVar.f22796a = this;
            aVar.f22799d = 1;
            if (p098k7.a.C0628a.a(aVar2, null, aVar, 1, null) == objF) {
                return objF;
            }
            e8 = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e8 = (E) aVar.f22796a;
            r.b(obj);
        }
        e8.f22793b = false;
        e8.f22794c = false;
        return G.f1419a;
    }

    @Override // A1.d
    public float getDensity() {
        return this.f22792a.getDensity();
    }

    @Override // A1.d
    public long i0(float f8) {
        return this.f22792a.i0(f8);
    }

    @Override // A1.d
    public long i1(long j8) {
        return this.f22792a.i1(j8);
    }

    @Override // A1.d
    public float l1(long j8) {
        return this.f22792a.l1(j8);
    }

    @Override // A1.d
    public float n0(int i8) {
        return this.f22792a.n0(i8);
    }

    @Override // A1.d
    public float p0(float f8) {
        return this.f22792a.p0(f8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p055g0.D
    public Object s1(G6.d dVar) {
        b bVar;
        E e8;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f22803d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f22803d = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f22801b;
        Object objF = H6.c.f();
        int i9 = bVar.f22803d;
        if (i9 == 0) {
            r.b(obj);
            if (this.f22793b || this.f22794c) {
                e8 = this;
            } else {
                p098k7.a aVar = this.f22795d;
                bVar.f22800a = this;
                bVar.f22803d = 1;
                if (p098k7.a.C0628a.a(aVar, null, bVar, 1, null) == objF) {
                    return objF;
                }
                e8 = this;
            }
            return I6.b.a(e8.f22793b);
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e8 = (E) bVar.f22800a;
        r.b(obj);
        p098k7.a.C0628a.c(e8.f22795d, null, 1, null);
        return I6.b.a(e8.f22793b);
    }

    @Override // A1.l
    public float x0() {
        return this.f22792a.x0();
    }
}
