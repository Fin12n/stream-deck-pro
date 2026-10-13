package p216z1;

import R0.AbstractC1582d0;
import R0.C1598l0;
import R0.P0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P0 f38964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f38965c;

    public c(P0 p8, float f8) {
        this.f38964b = p8;
        this.f38965c = f8;
    }

    @Override // p216z1.n
    public float c() {
        return this.f38965c;
    }

    @Override // p216z1.n
    public long d() {
        return C1598l0.f9405b.e();
    }

    @Override // p216z1.n
    public AbstractC1582d0 e() {
        return this.f38964b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return t.c(this.f38964b, cVar.f38964b) && Float.compare(this.f38965c, cVar.f38965c) == 0;
    }

    public final P0 f() {
        return this.f38964b;
    }

    public int hashCode() {
        return (this.f38964b.hashCode() * 31) + Float.hashCode(this.f38965c);
    }

    public String toString() {
        return "BrushStyle(value=" + this.f38964b + ", alpha=" + this.f38965c + ')';
    }
}
