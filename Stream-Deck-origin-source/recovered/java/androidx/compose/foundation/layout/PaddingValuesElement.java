package androidx.compose.foundation.layout;

import Q6.k;
import kotlin.jvm.internal.t;
import p056g1.U;
import p082j0.J;
import p082j0.L;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class PaddingValuesElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f14463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f14464c;

    public PaddingValuesElement(J j8, k kVar) {
        this.f14463b = j8;
        this.f14464c = kVar;
    }

    public boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return t.c(this.f14463b, paddingValuesElement.f14463b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14463b.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public L k() {
        return new L(this.f14463b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(L l8) {
        l8.e2(this.f14463b);
    }
}
