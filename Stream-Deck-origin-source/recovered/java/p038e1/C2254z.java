package p038e1;

import A1.b;
import L0.i;
import Q6.p;
import p056g1.A;

/* JADX INFO: renamed from: e1.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2254z extends i.c implements A {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f20544n;

    public C2254z(p pVar) {
        this.f20544n = pVar;
    }

    @Override // p056g1.A
    public I c(J j8, G g8, long j9) {
        return (I) this.f20544n.invoke(j8, g8, b.b(j9));
    }

    public final void d2(p pVar) {
        this.f20544n = pVar;
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f20544n + ')';
    }
}
