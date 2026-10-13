package E0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.P;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g extends e implements Iterator, R6.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f2005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2008g;

    public g(f fVar, u[] uVarArr) {
        super(fVar.g(), uVarArr);
        this.f2005d = fVar;
        this.f2008g = fVar.f();
    }

    private final void h() {
        if (this.f2005d.f() != this.f2008g) {
            throw new ConcurrentModificationException();
        }
    }

    public final void j() {
        if (!this.f2007f) {
            throw new IllegalStateException();
        }
    }

    public final void k(int i8, t tVar, Object obj, int i9) {
        int i10 = i9 * 5;
        if (i10 > 30) {
            e()[i9].l(tVar.p(), tVar.p().length, 0);
            while (!kotlin.jvm.internal.t.c(e()[i9].b(), obj)) {
                e()[i9].h();
            }
            g(i9);
            return;
        }
        int iF = 1 << x.f(i8, i10);
        if (tVar.q(iF)) {
            e()[i9].l(tVar.p(), tVar.m() * 2, tVar.n(iF));
            g(i9);
        } else {
            int iO = tVar.O(iF);
            t tVarN = tVar.N(iO);
            e()[i9].l(tVar.p(), tVar.m() * 2, iO);
            k(i8, tVarN, obj, i9 + 1);
        }
    }

    public final void l(Object obj, Object obj2) {
        if (this.f2005d.containsKey(obj)) {
            if (hasNext()) {
                Object objC = c();
                this.f2005d.put(obj, obj2);
                k(objC != null ? objC.hashCode() : 0, this.f2005d.g(), objC, 0);
            } else {
                this.f2005d.put(obj, obj2);
            }
            this.f2008g = this.f2005d.f();
        }
    }

    @Override // E0.e, java.util.Iterator
    public Object next() {
        h();
        this.f2006e = c();
        this.f2007f = true;
        return super.next();
    }

    @Override // E0.e, java.util.Iterator
    public void remove() {
        j();
        if (hasNext()) {
            Object objC = c();
            P.d(this.f2005d).remove(this.f2006e);
            k(objC != null ? objC.hashCode() : 0, this.f2005d.g(), objC, 0);
        } else {
            P.d(this.f2005d).remove(this.f2006e);
        }
        this.f2006e = null;
        this.f2007f = false;
        this.f2008g = this.f2005d.f();
    }
}
