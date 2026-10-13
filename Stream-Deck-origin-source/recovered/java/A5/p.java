package A5;

import C6.G;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E5.b f858c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {
        public a() {
            super(1);
        }

        public final void b(h it) {
            t.g(it, "it");
            p pVar = p.this;
            synchronized (pVar) {
                pVar.f856a = null;
                G g8 = G.f1419a;
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((h) obj);
            return G.f1419a;
        }
    }

    public /* synthetic */ p(String str, Q6.k kVar, AbstractC2633k abstractC2633k) {
        this(str, kVar);
    }

    public final void b() {
        h hVar = this.f856a;
        if (hVar != null) {
            hVar.b();
        }
    }

    public final void c(String qualifier, Q6.k block) {
        t.g(qualifier, "qualifier");
        t.g(block, "block");
        h(b.a(qualifier, block));
    }

    public final h d() throws q {
        h hVar = this.f856a;
        if (hVar != null) {
            return hVar;
        }
        throw new q("Application graph is not open.", null, 2, null);
    }

    public final E5.b e() {
        return this.f858c;
    }

    public final h f(Q6.k kVar) {
        h hVarG;
        synchronized (this) {
            if (this.f856a != null) {
                throw new q("Cannot open application graph because it is already open.", null, 2, null);
            }
            hVarG = g(kVar);
        }
        return hVarG;
    }

    public final h g(Q6.k kVar) {
        h hVar = new h(this, null, this.f857b, new a(), kVar);
        this.f856a = hVar;
        return hVar;
    }

    public final void h(c value) {
        t.g(value, "value");
        synchronized (this) {
            if (this.f856a != null) {
                throw new q("Cannot set component because application graph is already open.", null, 2, null);
            }
            this.f857b = value;
            G g8 = G.f1419a;
        }
    }

    public p() {
        this.f857b = c.f816c.a();
        this.f858c = E5.b.f2233b.a();
    }

    public /* synthetic */ p(String str, Q6.k kVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? b.d() : str, kVar, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(String qualifier, Q6.k block) {
        this();
        t.g(qualifier, "qualifier");
        t.g(block, "block");
        c(qualifier, block);
    }
}
