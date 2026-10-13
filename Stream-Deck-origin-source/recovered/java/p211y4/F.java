package p211y4;

import android.util.Log;
import java.util.Set;
import p195w4.b;
import p203x4.a;
import p219z4.AbstractC3194c;
import p219z4.InterfaceC3201j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class F implements AbstractC3194c.InterfaceC0857c, T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.f f38295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3101b f38296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3201j f38297c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f38298d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38299e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C3104e f38300f;

    public F(C3104e c3104e, a.f fVar, C3101b c3101b) {
        this.f38300f = c3104e;
        this.f38295a = fVar;
        this.f38296b = c3101b;
    }

    @Override // p211y4.T
    public final void a(b bVar) {
        B b8 = (B) this.f38300f.f38371j.get(this.f38296b);
        if (b8 != null) {
            b8.J(bVar);
        }
    }

    @Override // p219z4.AbstractC3194c.InterfaceC0857c
    public final void b(b bVar) {
        this.f38300f.f38375n.post(new E(this, bVar));
    }

    @Override // p211y4.T
    public final void c(InterfaceC3201j interfaceC3201j, Set set) {
        if (interfaceC3201j == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new b(4));
        } else {
            this.f38297c = interfaceC3201j;
            this.f38298d = set;
            i();
        }
    }

    @Override // p211y4.T
    public final void d(int i8) {
        B b8 = (B) this.f38300f.f38371j.get(this.f38296b);
        if (b8 != null) {
            if (b8.f38286i) {
                b8.J(new b(17));
            } else {
                b8.a(i8);
            }
        }
    }

    public final void i() {
        InterfaceC3201j interfaceC3201j;
        if (!this.f38299e || (interfaceC3201j = this.f38297c) == null) {
            return;
        }
        this.f38295a.e(interfaceC3201j, this.f38298d);
    }
}
