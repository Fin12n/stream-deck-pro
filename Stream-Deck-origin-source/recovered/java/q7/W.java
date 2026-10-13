package q7;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class W implements X6.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X6.m f32075a;

    public W(X6.m origin) {
        kotlin.jvm.internal.t.g(origin, "origin");
        this.f32075a = origin;
    }

    @Override // X6.m
    public boolean c() {
        return this.f32075a.c();
    }

    @Override // X6.m
    public List e() {
        return this.f32075a.e();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        X6.m mVar = this.f32075a;
        W w8 = obj instanceof W ? (W) obj : null;
        if (!kotlin.jvm.internal.t.c(mVar, w8 != null ? w8.f32075a : null)) {
            return false;
        }
        X6.f fVarF = f();
        if (fVarF instanceof X6.d) {
            X6.m mVar2 = obj instanceof X6.m ? (X6.m) obj : null;
            X6.f fVarF2 = mVar2 != null ? mVar2.f() : null;
            if (fVarF2 != null && (fVarF2 instanceof X6.d)) {
                return kotlin.jvm.internal.t.c(P6.a.a((X6.d) fVarF), P6.a.a((X6.d) fVarF2));
            }
        }
        return false;
    }

    @Override // X6.m
    public X6.f f() {
        return this.f32075a.f();
    }

    public int hashCode() {
        return this.f32075a.hashCode();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f32075a;
    }
}
