package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class v extends x {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p134p.b f15336l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC1737u f15337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y f15338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15339c = -1;

        public a(AbstractC1737u abstractC1737u, y yVar) {
            this.f15337a = abstractC1737u;
            this.f15338b = yVar;
        }

        @Override // androidx.lifecycle.y
        public void a(Object obj) {
            if (this.f15339c != this.f15337a.f()) {
                this.f15339c = this.f15337a.f();
                this.f15338b.a(obj);
            }
        }

        public void b() {
            this.f15337a.h(this);
        }

        public void c() {
            this.f15337a.l(this);
        }
    }

    public v() {
        this.f15336l = new p134p.b();
    }

    @Override // androidx.lifecycle.AbstractC1737u
    public void i() {
        Iterator it = this.f15336l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).b();
        }
    }

    @Override // androidx.lifecycle.AbstractC1737u
    public void j() {
        Iterator it = this.f15336l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).c();
        }
    }

    public void n(AbstractC1737u abstractC1737u, y yVar) {
        if (abstractC1737u == null) {
            throw new NullPointerException("source cannot be null");
        }
        a aVar = new a(abstractC1737u, yVar);
        a aVar2 = (a) this.f15336l.u(abstractC1737u, aVar);
        if (aVar2 != null && aVar2.f15338b != yVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVar2 == null && g()) {
            aVar.b();
        }
    }

    public void o(AbstractC1737u abstractC1737u) {
        a aVar = (a) this.f15336l.y(abstractC1737u);
        if (aVar != null) {
            aVar.c();
        }
    }

    public v(Object obj) {
        super(obj);
        this.f15336l = new p134p.b();
    }
}
