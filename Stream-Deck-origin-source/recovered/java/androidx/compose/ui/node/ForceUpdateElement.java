package androidx.compose.ui.node;

import L0.i;
import kotlin.jvm.internal.t;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class ForceUpdateElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f14740b;

    public ForceUpdateElement(U u8) {
        this.f14740b = u8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceUpdateElement) && t.c(this.f14740b, ((ForceUpdateElement) obj).f14740b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14740b.hashCode();
    }

    @Override // p056g1.U
    public i.c k() {
        throw new IllegalStateException("Shouldn't be called");
    }

    @Override // p056g1.U
    public void p(i.c cVar) {
        throw new IllegalStateException("Shouldn't be called");
    }

    public final U r() {
        return this.f14740b;
    }

    public String toString() {
        return "ForceUpdateElement(original=" + this.f14740b + ')';
    }
}
