package p109m0;

import A1.t;
import Q6.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p038e1.G;
import p038e1.I;
import p038e1.J;
import p038e1.j0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class w implements v, J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f29467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f29468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f29469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f29470d = new HashMap();

    public w(o oVar, j0 j0Var) {
        this.f29467a = oVar;
        this.f29468b = j0Var;
        this.f29469c = (q) oVar.d().invoke();
    }

    @Override // p038e1.InterfaceC2244o
    public boolean B0() {
        return this.f29468b.B0();
    }

    @Override // A1.d
    public float E0(float f8) {
        return this.f29468b.E0(f8);
    }

    @Override // A1.l
    public long H(float f8) {
        return this.f29468b.H(f8);
    }

    @Override // A1.d
    public long I(long j8) {
        return this.f29468b.I(j8);
    }

    @Override // A1.l
    public float T(long j8) {
        return this.f29468b.T(j8);
    }

    @Override // A1.d
    public int V0(float f8) {
        return this.f29468b.V0(f8);
    }

    @Override // p038e1.J
    public I b1(int i8, int i9, Map map, k kVar) {
        return this.f29468b.b1(i8, i9, map, kVar);
    }

    @Override // A1.d
    public float getDensity() {
        return this.f29468b.getDensity();
    }

    @Override // p038e1.InterfaceC2244o
    public t getLayoutDirection() {
        return this.f29468b.getLayoutDirection();
    }

    @Override // A1.d
    public long i0(float f8) {
        return this.f29468b.i0(f8);
    }

    @Override // A1.d
    public long i1(long j8) {
        return this.f29468b.i1(j8);
    }

    @Override // A1.d
    public float l1(long j8) {
        return this.f29468b.l1(j8);
    }

    @Override // A1.d
    public float n0(int i8) {
        return this.f29468b.n0(i8);
    }

    @Override // p109m0.v
    public List o0(int i8, long j8) {
        List list = (List) this.f29470d.get(Integer.valueOf(i8));
        if (list != null) {
            return list;
        }
        Object objA = this.f29469c.a(i8);
        List listM = this.f29468b.M(objA, this.f29467a.b(i8, objA, this.f29469c.e(i8)));
        int size = listM.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(((G) listM.get(i9)).J(j8));
        }
        this.f29470d.put(Integer.valueOf(i8), arrayList);
        return arrayList;
    }

    @Override // A1.d
    public float p0(float f8) {
        return this.f29468b.p0(f8);
    }

    @Override // A1.l
    public float x0() {
        return this.f29468b.x0();
    }
}
