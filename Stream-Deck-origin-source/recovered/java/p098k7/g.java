package p098k7;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p062g7.D;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f28773e;

    public g(long j8, g gVar, int i8) {
        super(j8, gVar, i8);
        this.f28773e = new AtomicReferenceArray(f.f28772f);
    }

    @Override // p062g7.D
    public int r() {
        return f.f28772f;
    }

    @Override // p062g7.D
    public void s(int i8, Throwable th, G6.g gVar) {
        v().set(i8, f.f28771e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f23815c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f28773e;
    }
}
