package p065h1;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import kotlin.jvm.functions.Function0;
import p176u1.C;

/* JADX INFO: renamed from: h1.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2397j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f24297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24298b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C f24299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24300d;

    public C2397j0(InterfaceC2422w0 interfaceC2422w0, Function0 function0) {
        this.f24297a = function0;
    }

    public final InputConnection a(EditorInfo editorInfo) {
        synchronized (this.f24298b) {
            try {
                if (!this.f24300d) {
                    C c8 = this.f24299c;
                    if (c8 == null) {
                        throw null;
                    }
                    c8.a();
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    public final boolean b() {
        return !this.f24300d;
    }
}
