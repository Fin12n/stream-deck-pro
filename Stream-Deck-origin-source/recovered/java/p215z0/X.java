package p215z0;

import C6.G;
import C6.q;
import G6.d;
import H6.b;
import H6.c;
import I6.h;
import Q6.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;
import p017b7.C1797m;
import p017b7.InterfaceC1795l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38716a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f38717b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f38718c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38719d = true;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1795l f38721b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1795l interfaceC1795l) {
            super(1);
            this.f38721b = interfaceC1795l;
        }

        public final void b(Throwable th) {
            Object obj = X.this.f38716a;
            X x8 = X.this;
            InterfaceC1795l interfaceC1795l = this.f38721b;
            synchronized (obj) {
                x8.f38717b.remove(interfaceC1795l);
                G g8 = G.f1419a;
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    public final Object c(d dVar) {
        if (e()) {
            return G.f1419a;
        }
        C1797m c1797m = new C1797m(b.c(dVar), 1);
        c1797m.z();
        synchronized (this.f38716a) {
            this.f38717b.add(c1797m);
        }
        c1797m.J(new a(c1797m));
        Object objS = c1797m.s();
        if (objS == c.f()) {
            h.c(dVar);
        }
        return objS == c.f() ? objS : G.f1419a;
    }

    public final void d() {
        synchronized (this.f38716a) {
            this.f38719d = false;
            G g8 = G.f1419a;
        }
    }

    public final boolean e() {
        boolean z8;
        synchronized (this.f38716a) {
            z8 = this.f38719d;
        }
        return z8;
    }

    public final void f() {
        synchronized (this.f38716a) {
            try {
                if (e()) {
                    return;
                }
                List list = this.f38717b;
                this.f38717b = this.f38718c;
                this.f38718c = list;
                this.f38719d = true;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    d dVar = (d) list.get(i8);
                    q.a aVar = q.f1441b;
                    dVar.resumeWith(q.b(G.f1419a));
                }
                list.clear();
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
