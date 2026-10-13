package V4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S4.l f10695a;

    public j() {
        this.f10695a = null;
    }

    public abstract void a();

    public final S4.l b() {
        return this.f10695a;
    }

    public final void c(Exception exc) {
        S4.l lVar = this.f10695a;
        if (lVar != null) {
            lVar.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e8) {
            c(e8);
        }
    }

    public j(S4.l lVar) {
        this.f10695a = lVar;
    }
}
