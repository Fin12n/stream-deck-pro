package p082j0;

import A1.d;
import A1.h;
import L0.c;
import L0.i;
import androidx.compose.foundation.layout.b;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: j0.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2606j implements InterfaceC2605i, InterfaceC2603g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f28024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f28026c;

    public /* synthetic */ C2606j(d dVar, long j8, AbstractC2633k abstractC2633k) {
        this(dVar, j8);
    }

    @Override // p082j0.InterfaceC2605i
    public float a() {
        return A1.b.j(b()) ? this.f28024a.n0(A1.b.n(b())) : h.f432b.b();
    }

    @Override // p082j0.InterfaceC2605i
    public long b() {
        return this.f28025b;
    }

    @Override // p082j0.InterfaceC2603g
    public i c(i iVar, c cVar) {
        return this.f28026c.c(iVar, cVar);
    }

    @Override // p082j0.InterfaceC2605i
    public float d() {
        return A1.b.i(b()) ? this.f28024a.n0(A1.b.m(b())) : h.f432b.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2606j)) {
            return false;
        }
        C2606j c2606j = (C2606j) obj;
        return t.c(this.f28024a, c2606j.f28024a) && A1.b.g(this.f28025b, c2606j.f28025b);
    }

    public int hashCode() {
        return (this.f28024a.hashCode() * 31) + A1.b.q(this.f28025b);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f28024a + ", constraints=" + ((Object) A1.b.r(this.f28025b)) + ')';
    }

    public C2606j(d dVar, long j8) {
        this.f28024a = dVar;
        this.f28025b = j8;
        this.f28026c = b.f14485a;
    }
}
