package I6;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends a {
    public j(G6.d<Object> dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != G6.h.f2820a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // G6.d
    public G6.g getContext() {
        return G6.h.f2820a;
    }
}
