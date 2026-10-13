package p211y4;

/* JADX INFO: renamed from: y4.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3121w implements ComponentCallbacks2C3102c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3104e f38426a;

    public C3121w(C3104e c3104e) {
        this.f38426a = c3104e;
    }

    @Override // p211y4.ComponentCallbacks2C3102c.a
    public final void a(boolean z8) {
        C3104e c3104e = this.f38426a;
        c3104e.f38375n.sendMessage(c3104e.f38375n.obtainMessage(1, Boolean.valueOf(z8)));
    }
}
