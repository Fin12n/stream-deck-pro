package X;

import A.AbstractC0890p0;
import A.InterfaceC0896t;
import H.AbstractC0995o;
import H.I;
import H.InterfaceC1014y;
import H.J;
import H.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e implements R0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f11549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.x f11550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m.e f11551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f11552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Y4.a f11553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11554f = false;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f11555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0896t f11556b;

        public a(List list, InterfaceC0896t interfaceC0896t) {
            this.f11555a = list;
            this.f11556b = interfaceC0896t;
        }

        @Override // K.c
        public void b(Throwable th) {
            e.this.f11553e = null;
            if (this.f11555a.isEmpty()) {
                return;
            }
            Iterator it = this.f11555a.iterator();
            while (it.hasNext()) {
                ((I) this.f11556b).f((AbstractC0995o) it.next());
            }
            this.f11555a.clear();
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r8) {
            e.this.f11553e = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends AbstractC0995o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F1.c.a f11558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0896t f11559b;

        public b(F1.c.a aVar, InterfaceC0896t interfaceC0896t) {
            this.f11558a = aVar;
            this.f11559b = interfaceC0896t;
        }

        @Override // H.AbstractC0995o
        public void b(int i8, InterfaceC1014y interfaceC1014y) {
            this.f11558a.c(null);
            ((I) this.f11559b).f(this);
        }
    }

    public e(I i8, androidx.lifecycle.x xVar, n nVar) {
        this.f11549a = i8;
        this.f11550b = xVar;
        this.f11552d = nVar;
        synchronized (this) {
            this.f11551c = (m.e) xVar.e();
        }
    }

    public static /* synthetic */ Object b(e eVar, InterfaceC0896t interfaceC0896t, List list, F1.c.a aVar) {
        eVar.getClass();
        b bVar = eVar.new b(aVar, interfaceC0896t);
        list.add(bVar);
        ((I) interfaceC0896t).q(J.a.a(), bVar);
        return "waitForCaptureResult";
    }

    public static /* synthetic */ Void d(e eVar, Void r8) {
        eVar.getClass();
        eVar.i(m.e.STREAMING);
        return null;
    }

    public final void e() {
        Y4.a aVar = this.f11553e;
        if (aVar != null) {
            aVar.cancel(false);
            this.f11553e = null;
        }
    }

    public void f() {
        e();
    }

    @Override // H.R0.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(J.a aVar) {
        if (aVar == J.a.CLOSING || aVar == J.a.CLOSED || aVar == J.a.RELEASING || aVar == J.a.RELEASED) {
            i(m.e.IDLE);
            if (this.f11554f) {
                this.f11554f = false;
                e();
                return;
            }
            return;
        }
        if ((aVar == J.a.OPENING || aVar == J.a.OPEN || aVar == J.a.PENDING_OPEN) && !this.f11554f) {
            h(this.f11549a);
            this.f11554f = true;
        }
    }

    public final void h(InterfaceC0896t interfaceC0896t) {
        i(m.e.IDLE);
        ArrayList arrayList = new ArrayList();
        K.d dVarE = K.d.b(j(interfaceC0896t, arrayList)).f(new K.a() { // from class: X.b
            @Override // K.a
            public final Y4.a apply(Object obj) {
                return this.f11544a.f11552d.i();
            }
        }, J.a.a()).e(new p142q.a() { // from class: X.c
            @Override // p142q.a
            public final Object apply(Object obj) {
                return e.d(this.f11545a, (Void) obj);
            }
        }, J.a.a());
        this.f11553e = dVarE;
        K.n.j(dVarE, new a(arrayList, interfaceC0896t), J.a.a());
    }

    public void i(m.e eVar) {
        synchronized (this) {
            try {
                if (this.f11551c.equals(eVar)) {
                    return;
                }
                this.f11551c = eVar;
                AbstractC0890p0.a("StreamStateObserver", "Update Preview stream state to " + eVar);
                this.f11550b.k(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Y4.a j(final InterfaceC0896t interfaceC0896t, final List list) {
        return F1.c.a(new F1.c.InterfaceC0112c() { // from class: X.d
            @Override // F1.c.InterfaceC0112c
            public final Object a(F1.c.a aVar) {
                return e.b(this.f11546a, interfaceC0896t, list, aVar);
            }
        });
    }

    @Override // H.R0.a
    public void onError(Throwable th) {
        f();
        i(m.e.IDLE);
    }
}
