package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p056g1.U;
import p091k0.A;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class ParentSizeElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f14522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q1 f14523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14524e;

    public /* synthetic */ ParentSizeElement(float f8, q1 q1Var, q1 q1Var2, String str, int i8, AbstractC2633k abstractC2633k) {
        this(f8, (i8 & 2) != 0 ? null : q1Var, (i8 & 4) != 0 ? null : q1Var2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.f14521b == parentSizeElement.f14521b && t.c(this.f14522c, parentSizeElement.f14522c) && t.c(this.f14523d, parentSizeElement.f14523d);
    }

    @Override // p056g1.U
    public int hashCode() {
        q1 q1Var = this.f14522c;
        int iHashCode = (q1Var != null ? q1Var.hashCode() : 0) * 31;
        q1 q1Var2 = this.f14523d;
        return ((iHashCode + (q1Var2 != null ? q1Var2.hashCode() : 0)) * 31) + Float.hashCode(this.f14521b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public A k() {
        return new A(this.f14521b, this.f14522c, this.f14523d);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(A a8) {
        a8.d2(this.f14521b);
        a8.f2(this.f14522c);
        a8.e2(this.f14523d);
    }

    public ParentSizeElement(float f8, q1 q1Var, q1 q1Var2, String str) {
        this.f14521b = f8;
        this.f14522c = q1Var;
        this.f14523d = q1Var2;
        this.f14524e = str;
    }
}
