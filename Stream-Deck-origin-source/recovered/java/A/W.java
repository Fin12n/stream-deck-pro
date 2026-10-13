package A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class W extends V {
    @Override // A.V
    public androidx.camera.core.d d(H.A0 a8) {
        return a8.m();
    }

    @Override // A.V
    public void l(androidx.camera.core.d dVar) {
        K.n.j(e(dVar), new a(dVar), J.a.a());
    }

    @Override // A.V
    public void f() {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.camera.core.d f230a;

        public a(androidx.camera.core.d dVar) {
            this.f230a = dVar;
        }

        @Override // K.c
        public void b(Throwable th) {
            this.f230a.close();
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r8) {
        }
    }
}
