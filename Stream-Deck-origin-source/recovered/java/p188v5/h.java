package p188v5;

import N4.N9;
import N4.Z9;
import android.content.Context;
import p140p5.AbstractC2795e;
import p140p5.C2799i;
import p156r5.b;
import p195w4.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends AbstractC2795e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2799i f35142b;

    public h(C2799i c2799i) {
        this.f35142b = c2799i;
    }

    @Override // p140p5.AbstractC2795e
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b bVar = (b) obj;
        Context contextB = this.f35142b.b();
        N9 n9B = Z9.b(b.d());
        return new k(this.f35142b, bVar, (n.b(contextB) || f.f().a(contextB) >= 204500000) ? new n(contextB, bVar, n9B) : new p(contextB, bVar, n9B), n9B);
    }
}
