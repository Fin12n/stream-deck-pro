package p047f1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f21523a;

    public a(j jVar) {
        super(null);
        this.f21523a = jVar;
    }

    @Override // p047f1.g
    public boolean a(c cVar) {
        return cVar == this.f21523a.getKey();
    }

    @Override // p047f1.g
    public Object b(c cVar) {
        if (cVar == this.f21523a.getKey()) {
            return this.f21523a.getValue();
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void c(j jVar) {
        this.f21523a = jVar;
    }
}
