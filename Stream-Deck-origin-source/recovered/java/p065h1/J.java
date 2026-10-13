package p065h1;

import C6.G;
import Q0.h;
import android.view.ActionMode;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p083j1.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class J implements J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f24109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActionMode f24110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f24111c = new c(new a(), null, null, null, null, null, 62, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public L0 f24112d = L0.Hidden;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m215invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m215invoke() {
            J.this.f24110b = null;
        }
    }

    public J(View view) {
        this.f24109a = view;
    }

    @Override // p065h1.J0
    public L0 a() {
        return this.f24112d;
    }

    @Override // p065h1.J0
    public void b(h hVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3) {
        this.f24111c.l(hVar);
        this.f24111c.h(function0);
        this.f24111c.i(function2);
        this.f24111c.j(function1);
        this.f24111c.k(function3);
        ActionMode actionMode = this.f24110b;
        if (actionMode == null) {
            this.f24112d = L0.Shown;
            this.f24110b = K0.f24131a.b(this.f24109a, new p083j1.a(this.f24111c), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // p065h1.J0
    public void c() {
        this.f24112d = L0.Hidden;
        ActionMode actionMode = this.f24110b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f24110b = null;
    }
}
