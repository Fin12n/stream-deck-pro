package p038e1;

import A1.t;
import Q6.k;
import W6.n;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r implements J, InterfaceC2244o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f20536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2244o f20537b;

    public r(InterfaceC2244o interfaceC2244o, t tVar) {
        this.f20536a = tVar;
        this.f20537b = interfaceC2244o;
    }

    @Override // p038e1.InterfaceC2244o
    public boolean B0() {
        return this.f20537b.B0();
    }

    @Override // A1.d
    public float E0(float f8) {
        return this.f20537b.E0(f8);
    }

    @Override // A1.l
    public long H(float f8) {
        return this.f20537b.H(f8);
    }

    @Override // A1.d
    public long I(long j8) {
        return this.f20537b.I(j8);
    }

    @Override // A1.l
    public float T(long j8) {
        return this.f20537b.T(j8);
    }

    @Override // A1.d
    public int V0(float f8) {
        return this.f20537b.V0(f8);
    }

    @Override // p038e1.J
    public I b1(int i8, int i9, Map map, k kVar) {
        int iD = n.d(i8, 0);
        int iD2 = n.d(i9, 0);
        if ((iD & (-16777216)) == 0 && ((-16777216) & iD2) == 0) {
            return new a(iD, iD2, map);
        }
        throw new IllegalStateException(("Size(" + iD + " x " + iD2 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    @Override // A1.d
    public float getDensity() {
        return this.f20537b.getDensity();
    }

    @Override // p038e1.InterfaceC2244o
    public t getLayoutDirection() {
        return this.f20536a;
    }

    @Override // A1.d
    public long i0(float f8) {
        return this.f20537b.i0(f8);
    }

    @Override // A1.d
    public long i1(long j8) {
        return this.f20537b.i1(j8);
    }

    @Override // A1.d
    public float l1(long j8) {
        return this.f20537b.l1(j8);
    }

    @Override // A1.d
    public float n0(int i8) {
        return this.f20537b.n0(i8);
    }

    @Override // A1.d
    public float p0(float f8) {
        return this.f20537b.p0(f8);
    }

    @Override // A1.l
    public float x0() {
        return this.f20537b.x0();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f20538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f20539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f20540c;

        public a(int i8, int i9, Map map) {
            this.f20538a = i8;
            this.f20539b = i9;
            this.f20540c = map;
        }

        @Override // p038e1.I
        public Map c() {
            return this.f20540c;
        }

        @Override // p038e1.I
        public int f() {
            return this.f20539b;
        }

        @Override // p038e1.I
        public int g() {
            return this.f20538a;
        }

        @Override // p038e1.I
        public void d() {
        }
    }
}
