package G6;

import Q6.o;
import java.io.Serializable;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f2814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.b f2815b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2816a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, g.b element) {
            t.g(acc, "acc");
            t.g(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public c(g left, g.b element) {
        t.g(left, "left");
        t.g(element, "element");
        this.f2814a = left;
        this.f2815b = element;
    }

    private final int d() {
        int i8 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f2814a;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i8;
            }
            i8++;
        }
    }

    @Override // G6.g
    public g.b A(g.c key) {
        t.g(key, "key");
        c cVar = this;
        while (true) {
            g.b bVarA = cVar.f2815b.A(key);
            if (bVarA != null) {
                return bVarA;
            }
            g gVar = cVar.f2814a;
            if (!(gVar instanceof c)) {
                return gVar.A(key);
            }
            cVar = (c) gVar;
        }
    }

    @Override // G6.g
    public g P1(g gVar) {
        return g.a.a(this, gVar);
    }

    public final boolean a(g.b bVar) {
        return t.c(A(bVar.getKey()), bVar);
    }

    public final boolean c(c cVar) {
        while (a(cVar.f2815b)) {
            g gVar = cVar.f2814a;
            if (!(gVar instanceof c)) {
                t.e(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return a((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.d() == d() && cVar.c(this);
    }

    public int hashCode() {
        return this.f2814a.hashCode() + this.f2815b.hashCode();
    }

    @Override // G6.g
    public g j(g.c key) {
        t.g(key, "key");
        if (this.f2815b.A(key) != null) {
            return this.f2814a;
        }
        g gVarJ = this.f2814a.j(key);
        if (gVarJ == this.f2814a) {
            return this;
        }
        return gVarJ == h.f2820a ? this.f2815b : new c(gVarJ, this.f2815b);
    }

    @Override // G6.g
    public Object t(Object obj, o operation) {
        t.g(operation, "operation");
        return operation.invoke(this.f2814a.t(obj, operation), this.f2815b);
    }

    public String toString() {
        return '[' + ((String) t("", a.f2816a)) + ']';
    }
}
