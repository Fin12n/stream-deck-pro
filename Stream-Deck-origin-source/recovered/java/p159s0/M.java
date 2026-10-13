package p159s0;

import R0.C1598l0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32717b;

    public /* synthetic */ M(long j8, long j9, AbstractC2633k abstractC2633k) {
        this(j8, j9);
    }

    public final long a() {
        return this.f32717b;
    }

    public final long b() {
        return this.f32716a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        return C1598l0.q(this.f32716a, m8.f32716a) && C1598l0.q(this.f32717b, m8.f32717b);
    }

    public int hashCode() {
        return (C1598l0.w(this.f32716a) * 31) + C1598l0.w(this.f32717b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) C1598l0.x(this.f32716a)) + ", selectionBackgroundColor=" + ((Object) C1598l0.x(this.f32717b)) + ')';
    }

    public M(long j8, long j9) {
        this.f32716a = j8;
        this.f32717b = j9;
    }
}
