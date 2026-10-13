package p219z4;

import android.app.PendingIntent;
import android.os.Bundle;
import p195w4.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class M extends V {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f39104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC3194c f39105f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(AbstractC3194c abstractC3194c, int i8, Bundle bundle) {
        super(abstractC3194c, Boolean.TRUE);
        this.f39105f = abstractC3194c;
        this.f39103d = i8;
        this.f39104e = bundle;
    }

    @Override // p219z4.V
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f39103d != 0) {
            this.f39105f.g0(1, null);
            Bundle bundle = this.f39104e;
            f(new b(this.f39103d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (g()) {
                return;
            }
            this.f39105f.g0(1, null);
            f(new b(8, null));
        }
    }

    public abstract void f(b bVar);

    public abstract boolean g();

    @Override // p219z4.V
    public final void b() {
    }
}
