package V4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f10701b;

    public n(t tVar) {
        this.f10701b = tVar;
    }

    @Override // V4.j
    public final void a() {
        t tVar = this.f10701b;
        if (tVar.f10719m != null) {
            tVar.f10708b.d("Unbind from service.", new Object[0]);
            t tVar2 = this.f10701b;
            tVar2.f10707a.unbindService(tVar2.f10718l);
            this.f10701b.f10713g = false;
            this.f10701b.f10719m = null;
            this.f10701b.f10718l = null;
        }
        this.f10701b.t();
    }
}
