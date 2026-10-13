package p211y4;

import android.app.Dialog;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dialog f38356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f38357b;

    public d0(e0 e0Var, Dialog dialog) {
        this.f38357b = e0Var;
        this.f38356a = dialog;
    }

    @Override // p211y4.H
    public final void a() {
        this.f38357b.f38378b.o();
        if (this.f38356a.isShowing()) {
            this.f38356a.dismiss();
        }
    }
}
