package p159s0;

import Q0.f;
import kotlin.jvm.internal.AbstractC2633k;
import p143q0.EnumC2813m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC2813m f32854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f32856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f32857d;

    public /* synthetic */ x(EnumC2813m enumC2813m, long j8, w wVar, boolean z8, AbstractC2633k abstractC2633k) {
        this(enumC2813m, j8, wVar, z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f32854a == xVar.f32854a && f.l(this.f32855b, xVar.f32855b) && this.f32856c == xVar.f32856c && this.f32857d == xVar.f32857d;
    }

    public int hashCode() {
        return (((((this.f32854a.hashCode() * 31) + f.q(this.f32855b)) * 31) + this.f32856c.hashCode()) * 31) + Boolean.hashCode(this.f32857d);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f32854a + ", position=" + ((Object) f.v(this.f32855b)) + ", anchor=" + this.f32856c + ", visible=" + this.f32857d + ')';
    }

    public x(EnumC2813m enumC2813m, long j8, w wVar, boolean z8) {
        this.f32854a = enumC2813m;
        this.f32855b = j8;
        this.f32856c = wVar;
        this.f32857d = z8;
    }
}
