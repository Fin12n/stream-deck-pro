package p109m0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f29289a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void cancel();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        a a(int i8, long j8);
    }

    public final a a(int i8, long j8) {
        a aVarA;
        b bVar = this.f29289a;
        return (bVar == null || (aVarA = bVar.a(i8, j8)) == null) ? C2665c.f29372a : aVarA;
    }

    public final void b(b bVar) {
        this.f29289a = bVar;
    }
}
