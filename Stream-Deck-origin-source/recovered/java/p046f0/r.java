package p046f0;

import O0.h;
import Q6.k;
import T0.c;
import kotlin.jvm.internal.t;
import p065h1.AbstractC2405n0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC2405n0 implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2273a f21496c;

    public r(C2273a c2273a, k kVar) {
        super(kVar);
        this.f21496c = c2273a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return t.c(this.f21496c, ((r) obj).f21496c);
        }
        return false;
    }

    public int hashCode() {
        return this.f21496c.hashCode();
    }

    @Override // O0.h
    public void q(c cVar) {
        cVar.v1();
        this.f21496c.w(cVar);
    }

    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f21496c + ')';
    }
}
