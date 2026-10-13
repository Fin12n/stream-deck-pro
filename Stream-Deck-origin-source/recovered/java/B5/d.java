package B5;

import A5.h;
import androidx.lifecycle.O;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1209c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f1210b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    @Override // androidx.lifecycle.O
    public void d() {
        h hVar = this.f1210b;
        if (hVar != null) {
            hVar.b();
        }
        this.f1210b = null;
    }

    public final h e() {
        return this.f1210b;
    }

    public final void f(h hVar) {
        this.f1210b = hVar;
    }
}
