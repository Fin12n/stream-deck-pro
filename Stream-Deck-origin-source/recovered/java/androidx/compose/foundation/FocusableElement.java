package androidx.compose.foundation;

import kotlin.jvm.internal.t;
import p046f0.C2293v;
import p056g1.U;
import p073i0.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class FocusableElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f14300b;

    public FocusableElement(m mVar) {
        this.f14300b = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusableElement) && t.c(this.f14300b, ((FocusableElement) obj).f14300b);
    }

    @Override // p056g1.U
    public int hashCode() {
        m mVar = this.f14300b;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2293v k() {
        return new C2293v(this.f14300b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(C2293v c2293v) {
        c2293v.j2(this.f14300b);
    }
}
