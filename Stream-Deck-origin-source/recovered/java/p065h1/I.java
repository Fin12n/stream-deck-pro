package p065h1;

import G6.g;
import L0.o;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.atomic.AtomicReference;
import p017b7.J;
import p176u1.O;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class I implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f24104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f24105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f24106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f24107d = o.a();

    public I(View view, O o8, J j8) {
        this.f24104a = view;
        this.f24105b = o8;
        this.f24106c = j8;
    }

    public final InputConnection a(EditorInfo editorInfo) {
        C2397j0 c2397j0 = (C2397j0) o.c(this.f24107d);
        if (c2397j0 != null) {
            return c2397j0.a(editorInfo);
        }
        return null;
    }

    public final boolean b() {
        C2397j0 c2397j0 = (C2397j0) o.c(this.f24107d);
        return c2397j0 != null && c2397j0.b();
    }

    @Override // p017b7.J
    public g getCoroutineContext() {
        return this.f24106c.getCoroutineContext();
    }
}
