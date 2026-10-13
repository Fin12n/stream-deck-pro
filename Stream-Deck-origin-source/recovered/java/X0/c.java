package X0;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f11653a;

    public c(View view) {
        this.f11653a = view;
    }

    @Override // X0.a
    public void a(int i8) {
        b.a aVar = b.f11652a;
        if (b.b(i8, aVar.a())) {
            this.f11653a.performHapticFeedback(0);
        } else if (b.b(i8, aVar.b())) {
            this.f11653a.performHapticFeedback(9);
        }
    }
}
