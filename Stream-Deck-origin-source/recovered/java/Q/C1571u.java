package Q;

/* JADX INFO: renamed from: Q.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C1571u implements T1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T1.a f9054a;

    public void a(T1.a aVar) {
        this.f9054a = aVar;
    }

    @Override // T1.a
    public void accept(Object obj) {
        kotlin.jvm.internal.t.e(this.f9054a, "Listener is not set.");
        this.f9054a.accept(obj);
    }
}
