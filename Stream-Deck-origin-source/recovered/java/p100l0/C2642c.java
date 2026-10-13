package p100l0;

import A1.b;
import A1.c;
import A1.d;
import Q6.o;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: l0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2642c implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f28967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f28968b = c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f28969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C f28970d;

    public C2642c(o oVar) {
        this.f28967a = oVar;
    }

    @Override // p100l0.D
    public C a(d dVar, long j8) {
        if (this.f28970d != null && b.g(this.f28968b, j8) && this.f28969c == dVar.getDensity()) {
            C c8 = this.f28970d;
            t.d(c8);
            return c8;
        }
        this.f28968b = j8;
        this.f28969c = dVar.getDensity();
        C c9 = (C) this.f28967a.invoke(dVar, b.b(j8));
        this.f28970d = c9;
        return c9;
    }
}
