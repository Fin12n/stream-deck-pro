package p031d3;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import p004a3.AbstractC1699e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f19747c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p130o3.c f19749e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19745a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19746b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f19748d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f19750f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f19751g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19752h = -1.0f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements d {
        public c() {
        }

        @Override // d3.a.d
        public boolean a(float f8) {
            throw new IllegalStateException("not implemented");
        }

        @Override // d3.a.d
        public p130o3.a b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // d3.a.d
        public boolean c(float f8) {
            return false;
        }

        @Override // d3.a.d
        public float d() {
            return 1.0f;
        }

        @Override // d3.a.d
        public float e() {
            return 0.0f;
        }

        @Override // d3.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface d {
        boolean a(float f8);

        p130o3.a b();

        boolean c(float f8);

        float d();

        float e();

        boolean isEmpty();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f19753a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p130o3.a f19755c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f19756d = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p130o3.a f19754b = f(0.0f);

        public e(List list) {
            this.f19753a = list;
        }

        @Override // d3.a.d
        public boolean a(float f8) {
            p130o3.a aVar = this.f19755c;
            p130o3.a aVar2 = this.f19754b;
            if (aVar == aVar2 && this.f19756d == f8) {
                return true;
            }
            this.f19755c = aVar2;
            this.f19756d = f8;
            return false;
        }

        @Override // d3.a.d
        public p130o3.a b() {
            return this.f19754b;
        }

        @Override // d3.a.d
        public boolean c(float f8) {
            if (this.f19754b.a(f8)) {
                return !this.f19754b.i();
            }
            this.f19754b = f(f8);
            return true;
        }

        @Override // d3.a.d
        public float d() {
            List list = this.f19753a;
            return ((p130o3.a) list.get(list.size() - 1)).c();
        }

        @Override // d3.a.d
        public float e() {
            return ((p130o3.a) this.f19753a.get(0)).f();
        }

        public final p130o3.a f(float f8) {
            List list = this.f19753a;
            p130o3.a aVar = (p130o3.a) list.get(list.size() - 1);
            if (f8 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f19753a.size() - 2; size >= 1; size--) {
                p130o3.a aVar2 = (p130o3.a) this.f19753a.get(size);
                if (this.f19754b != aVar2 && aVar2.a(f8)) {
                    return aVar2;
                }
            }
            return (p130o3.a) this.f19753a.get(0);
        }

        @Override // d3.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p130o3.a f19757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f19758b = -1.0f;

        public f(List list) {
            this.f19757a = (p130o3.a) list.get(0);
        }

        @Override // d3.a.d
        public boolean a(float f8) {
            if (this.f19758b == f8) {
                return true;
            }
            this.f19758b = f8;
            return false;
        }

        @Override // d3.a.d
        public p130o3.a b() {
            return this.f19757a;
        }

        @Override // d3.a.d
        public boolean c(float f8) {
            return !this.f19757a.i();
        }

        @Override // d3.a.d
        public float d() {
            return this.f19757a.c();
        }

        @Override // d3.a.d
        public float e() {
            return this.f19757a.f();
        }

        @Override // d3.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public a(List list) {
        this.f19747c = p(list);
    }

    public static d p(List list) {
        if (list.isEmpty()) {
            return new c();
        }
        return list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f19745a.add(bVar);
    }

    public p130o3.a b() {
        AbstractC1699e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        p130o3.a aVarB = this.f19747c.b();
        AbstractC1699e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        return aVarB;
    }

    public float c() {
        if (this.f19752h == -1.0f) {
            this.f19752h = this.f19747c.d();
        }
        return this.f19752h;
    }

    public float d() {
        p130o3.a aVarB = b();
        if (aVarB == null || aVarB.i()) {
            return 0.0f;
        }
        return aVarB.f30874d.getInterpolation(e());
    }

    public float e() {
        if (this.f19746b) {
            return 0.0f;
        }
        p130o3.a aVarB = b();
        if (aVarB.i()) {
            return 0.0f;
        }
        return (this.f19748d - aVarB.f()) / (aVarB.c() - aVarB.f());
    }

    public float f() {
        return this.f19748d;
    }

    public final float g() {
        if (this.f19751g == -1.0f) {
            this.f19751g = this.f19747c.e();
        }
        return this.f19751g;
    }

    public Object h() {
        float fE = e();
        if (this.f19749e == null && this.f19747c.a(fE)) {
            return this.f19750f;
        }
        p130o3.a aVarB = b();
        Interpolator interpolator = aVarB.f30875e;
        Object objI = (interpolator == null || aVarB.f30876f == null) ? i(aVarB, d()) : j(aVarB, fE, interpolator.getInterpolation(fE), aVarB.f30876f.getInterpolation(fE));
        this.f19750f = objI;
        return objI;
    }

    public abstract Object i(p130o3.a aVar, float f8);

    public Object j(p130o3.a aVar, float f8, float f9, float f10) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f19749e != null;
    }

    public void l() {
        AbstractC1699e.b("BaseKeyframeAnimation#notifyListeners");
        for (int i8 = 0; i8 < this.f19745a.size(); i8++) {
            ((b) this.f19745a.get(i8)).a();
        }
        AbstractC1699e.c("BaseKeyframeAnimation#notifyListeners");
    }

    public void m() {
        this.f19746b = true;
    }

    public void n(float f8) {
        AbstractC1699e.b("BaseKeyframeAnimation#setProgress");
        if (this.f19747c.isEmpty()) {
            AbstractC1699e.c("BaseKeyframeAnimation#setProgress");
            return;
        }
        if (f8 < g()) {
            f8 = g();
        } else if (f8 > c()) {
            f8 = c();
        }
        if (f8 == this.f19748d) {
            AbstractC1699e.c("BaseKeyframeAnimation#setProgress");
            return;
        }
        this.f19748d = f8;
        if (this.f19747c.c(f8)) {
            l();
        }
        AbstractC1699e.c("BaseKeyframeAnimation#setProgress");
    }

    public void o(p130o3.c cVar) {
        p130o3.c cVar2 = this.f19749e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f19749e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
