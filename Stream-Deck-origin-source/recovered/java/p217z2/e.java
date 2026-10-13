package p217z2;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1726i;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f39070d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f39071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f39072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39073c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final e a(f owner) {
            t.g(owner, "owner");
            return new e(owner, null);
        }

        public a() {
        }
    }

    public /* synthetic */ e(f fVar, AbstractC2633k abstractC2633k) {
        this(fVar);
    }

    public static final e a(f fVar) {
        return f39070d.a(fVar);
    }

    public final d b() {
        return this.f39072b;
    }

    public final void c() {
        AbstractC1726i abstractC1726iW = this.f39071a.w();
        if (abstractC1726iW.b() != AbstractC1726i.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        abstractC1726iW.a(new b(this.f39071a));
        this.f39072b.e(abstractC1726iW);
        this.f39073c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f39073c) {
            c();
        }
        AbstractC1726i abstractC1726iW = this.f39071a.w();
        if (!abstractC1726iW.b().b(AbstractC1726i.b.STARTED)) {
            this.f39072b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + abstractC1726iW.b()).toString());
    }

    public final void e(Bundle outBundle) {
        t.g(outBundle, "outBundle");
        this.f39072b.g(outBundle);
    }

    public e(f fVar) {
        this.f39071a = fVar;
        this.f39072b = new d();
    }
}
