package P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k extends L0.i.c implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.compose.ui.focus.g f8852n;

    public k(androidx.compose.ui.focus.g gVar) {
        this.f8852n = gVar;
    }

    @Override // L0.i.c
    public void N1() {
        super.N1();
        this.f8852n.d().d(this);
    }

    @Override // L0.i.c
    public void O1() {
        this.f8852n.d().z(this);
        super.O1();
    }

    public final androidx.compose.ui.focus.g d2() {
        return this.f8852n;
    }

    public final void e2(androidx.compose.ui.focus.g gVar) {
        this.f8852n = gVar;
    }
}
