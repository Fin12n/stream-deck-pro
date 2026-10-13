package p046f0;

import A1.h;
import R0.AbstractC1582d0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: f0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2280h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1582d0 f21476b;

    public /* synthetic */ C2280h(float f8, AbstractC1582d0 abstractC1582d0, AbstractC2633k abstractC2633k) {
        this(f8, abstractC1582d0);
    }

    public final AbstractC1582d0 a() {
        return this.f21476b;
    }

    public final float b() {
        return this.f21475a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2280h)) {
            return false;
        }
        C2280h c2280h = (C2280h) obj;
        return h.t(this.f21475a, c2280h.f21475a) && t.c(this.f21476b, c2280h.f21476b);
    }

    public int hashCode() {
        return (h.u(this.f21475a) * 31) + this.f21476b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) h.v(this.f21475a)) + ", brush=" + this.f21476b + ')';
    }

    public C2280h(float f8, AbstractC1582d0 abstractC1582d0) {
        this.f21475a = f8;
        this.f21476b = abstractC1582d0;
    }
}
