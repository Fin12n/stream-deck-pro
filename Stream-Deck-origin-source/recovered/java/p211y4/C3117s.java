package p211y4;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import p010b0.C1749b;
import p195w4.b;
import p195w4.e;
import p219z4.AbstractC3207p;

/* JADX INFO: renamed from: y4.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C3117s extends f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1749b f38420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3104e f38421g;

    public C3117s(InterfaceC3106g interfaceC3106g, C3104e c3104e, e eVar) {
        super(interfaceC3106g, eVar);
        this.f38420f = new C1749b();
        this.f38421g = c3104e;
        this.f17911a.a("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C3104e c3104e, C3101b c3101b) {
        InterfaceC3106g interfaceC3106gC = LifecycleCallback.c(activity);
        C3117s c3117s = (C3117s) interfaceC3106gC.c("ConnectionlessLifecycleHelper", C3117s.class);
        if (c3117s == null) {
            c3117s = new C3117s(interfaceC3106gC, c3104e, e.m());
        }
        AbstractC3207p.l(c3101b, "ApiKey cannot be null");
        c3117s.f38420f.add(c3101b);
        c3104e.a(c3117s);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // p211y4.f0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // p211y4.f0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f38421g.b(this);
    }

    @Override // p211y4.f0
    public final void m(b bVar, int i8) {
        this.f38421g.B(bVar, i8);
    }

    @Override // p211y4.f0
    public final void n() {
        this.f38421g.C();
    }

    public final C1749b t() {
        return this.f38420f;
    }

    public final void v() {
        if (this.f38420f.isEmpty()) {
            return;
        }
        this.f38421g.a(this);
    }
}
