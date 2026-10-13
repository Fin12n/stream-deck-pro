package androidx.compose.foundation.relocation;

import kotlin.jvm.internal.t;
import p056g1.U;
import p118n0.d;
import p118n0.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewRequesterElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f14529b;

    public BringIntoViewRequesterElement(d dVar) {
        this.f14529b = dVar;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BringIntoViewRequesterElement) && t.c(this.f14529b, ((BringIntoViewRequesterElement) obj).f14529b);
        }
        return true;
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14529b.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public f k() {
        return new f(this.f14529b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(f fVar) {
        fVar.i2(this.f14529b);
    }
}
