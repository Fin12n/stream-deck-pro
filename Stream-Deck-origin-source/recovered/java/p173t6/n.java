package p173t6;

import C6.q;
import C6.r;
import G6.d;
import G6.g;
import H6.b;
import H6.c;
import I6.e;
import I6.h;
import Q6.p;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f34295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f34296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f34297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d[] f34298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34299f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f34300g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements d, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34301a = Integer.MIN_VALUE;

        public a() {
        }

        public final d a() {
            if (this.f34301a == Integer.MIN_VALUE) {
                this.f34301a = n.this.f34299f;
            }
            if (this.f34301a < 0) {
                this.f34301a = Integer.MIN_VALUE;
                return null;
            }
            try {
                d[] dVarArr = n.this.f34298e;
                int i8 = this.f34301a;
                d dVar = dVarArr[i8];
                if (dVar == null) {
                    return m.f34294a;
                }
                this.f34301a = i8 - 1;
                return dVar;
            } catch (Throwable unused) {
                return m.f34294a;
            }
        }

        @Override // I6.e
        public e getCallerFrame() {
            d dVarA = a();
            if (dVarA instanceof e) {
                return (e) dVarA;
            }
            return null;
        }

        @Override // G6.d
        public g getContext() {
            g context;
            d dVar = n.this.f34298e[n.this.f34299f];
            if (dVar == null || (context = dVar.getContext()) == null) {
                throw new IllegalStateException("Not started");
            }
            return context;
        }

        @Override // G6.d
        public void resumeWith(Object obj) {
            if (!q.g(obj)) {
                n.this.p(false);
                return;
            }
            n nVar = n.this;
            Throwable thE = q.e(obj);
            t.d(thE);
            nVar.r(q.b(r.a(thE)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Object initial, Object context, List<? extends p> blocks) {
        super(context);
        t.g(initial, "initial");
        t.g(context, "context");
        t.g(blocks, "blocks");
        this.f34295b = blocks;
        this.f34296c = new a();
        this.f34297d = initial;
        this.f34298e = new d[blocks.size()];
        this.f34299f = -1;
    }

    @Override // p173t6.e
    public Object a(Object obj, d dVar) {
        this.f34300g = 0;
        if (this.f34295b.size() == 0) {
            return obj;
        }
        s(obj);
        if (this.f34299f < 0) {
            return g(dVar);
        }
        throw new IllegalStateException(SZCvugJaXc.qbhG);
    }

    @Override // p173t6.e
    public void b() {
        this.f34300g = this.f34295b.size();
    }

    @Override // p173t6.e
    public Object f() {
        return this.f34297d;
    }

    @Override // p173t6.e
    public Object g(d dVar) {
        Object objF;
        if (this.f34300g == this.f34295b.size()) {
            objF = f();
        } else {
            m(b.c(dVar));
            if (p(true)) {
                n();
                objF = f();
            } else {
                objF = c.f();
            }
        }
        if (objF == c.f()) {
            h.c(dVar);
        }
        return objF;
    }

    @Override // p017b7.J
    public g getCoroutineContext() {
        return this.f34296c.getContext();
    }

    @Override // p173t6.e
    public Object h(Object obj, d dVar) {
        s(obj);
        return g(dVar);
    }

    public final void m(d dVar) {
        d[] dVarArr = this.f34298e;
        int i8 = this.f34299f + 1;
        this.f34299f = i8;
        dVarArr[i8] = dVar;
    }

    public final void n() {
        int i8 = this.f34299f;
        if (i8 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        d[] dVarArr = this.f34298e;
        this.f34299f = i8 - 1;
        dVarArr[i8] = null;
    }

    public final boolean p(boolean z8) {
        int i8;
        do {
            i8 = this.f34300g;
            if (i8 == this.f34295b.size()) {
                if (z8) {
                    return true;
                }
                q.a aVar = q.f1441b;
                r(q.b(f()));
                return false;
            }
            this.f34300g = i8 + 1;
            try {
            } catch (Throwable th) {
                q.a aVar2 = q.f1441b;
                r(q.b(r.a(th)));
                return false;
            }
        } while (((p) this.f34295b.get(i8)).invoke(this, f(), this.f34296c) != c.f());
        return false;
    }

    public final void r(Object obj) {
        int i8 = this.f34299f;
        if (i8 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        d dVar = this.f34298e[i8];
        t.d(dVar);
        d[] dVarArr = this.f34298e;
        int i9 = this.f34299f;
        this.f34299f = i9 - 1;
        dVarArr[i9] = null;
        if (!q.g(obj)) {
            dVar.resumeWith(obj);
            return;
        }
        Throwable thE = q.e(obj);
        t.d(thE);
        dVar.resumeWith(q.b(r.a(k.a(thE, dVar))));
    }

    public void s(Object obj) {
        t.g(obj, "<set-?>");
        this.f34297d = obj;
    }
}
