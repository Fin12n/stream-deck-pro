package I6;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends a {
    private final G6.g _context;
    private transient G6.d<Object> intercepted;

    public d(G6.d<Object> dVar, G6.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // G6.d
    public G6.g getContext() {
        G6.g gVar = this._context;
        t.d(gVar);
        return gVar;
    }

    public final G6.d<Object> intercepted() {
        G6.d dVarU1 = this.intercepted;
        if (dVarU1 == null) {
            G6.e eVar = (G6.e) getContext().A(G6.e.f2817J);
            if (eVar == null || (dVarU1 = eVar.U1(this)) == null) {
                dVarU1 = this;
            }
            this.intercepted = dVarU1;
        }
        return dVarU1;
    }

    @Override // I6.a
    public void releaseIntercepted() {
        G6.d<Object> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            G6.g.b bVarA = getContext().A(G6.e.f2817J);
            t.d(bVarA);
            ((G6.e) bVarA).C1(dVar);
        }
        this.intercepted = c.f3786a;
    }

    public d(G6.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
