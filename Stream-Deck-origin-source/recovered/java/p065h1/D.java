package p065h1;

import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.t;
import p011b1.C1753a;
import p011b1.C1754b;
import p011b1.InterfaceC1772u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f24089a = new D();

    public final void a(View view, InterfaceC1772u interfaceC1772u) {
        PointerIcon systemIcon;
        if (interfaceC1772u instanceof C1753a) {
            systemIcon = ((C1753a) interfaceC1772u).a();
        } else {
            systemIcon = interfaceC1772u instanceof C1754b ? PointerIcon.getSystemIcon(view.getContext(), ((C1754b) interfaceC1772u).a()) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (t.c(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
