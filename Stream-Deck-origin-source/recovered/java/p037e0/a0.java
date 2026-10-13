package p037e0;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20120c;

    public a0() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (a0Var.f20118a == this.f20118a && a0Var.f20119b == this.f20119b && t.c(a0Var.f20120c, this.f20120c)) {
                return true;
            }
        }
        return false;
    }

    public final float f() {
        return this.f20118a;
    }

    public final float g() {
        return this.f20119b;
    }

    public final Object h() {
        return this.f20120c;
    }

    public int hashCode() {
        Object obj = this.f20120c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + Float.hashCode(this.f20118a)) * 31) + Float.hashCode(this.f20119b);
    }

    @Override // p037e0.InterfaceC2213i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public v0 a(j0 j0Var) {
        return new v0(this.f20118a, this.f20119b, AbstractC2214j.b(j0Var, this.f20120c));
    }

    public a0(float f8, float f9, Object obj) {
        this.f20118a = f8;
        this.f20119b = f9;
        this.f20120c = obj;
    }

    public /* synthetic */ a0(float f8, float f9, Object obj, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? 1.0f : f8, (i8 & 2) != 0 ? 1500.0f : f9, (i8 & 4) != 0 ? null : obj);
    }
}
