package p188v5;

import N4.Z9;
import p140p5.C2794d;
import p140p5.C2799i;
import p156r5.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f35133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2794d f35134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2799i f35135c;

    public f(h hVar, C2794d c2794d, C2799i c2799i) {
        this.f35133a = hVar;
        this.f35134b = c2794d;
        this.f35135c = c2799i;
    }

    public final g a(b bVar) {
        return new g(bVar, (k) this.f35133a.b(bVar), this.f35134b.a(bVar.c()), Z9.b(b.d()), this.f35135c);
    }
}
