package androidx.compose.ui.layout;

import Q6.k;
import kotlin.jvm.internal.t;
import p038e1.S;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class OnGloballyPositionedElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14739b;

    public OnGloballyPositionedElement(k kVar) {
        this.f14739b = kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return t.c(this.f14739b, ((OnGloballyPositionedElement) obj).f14739b);
        }
        return false;
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f14739b.hashCode();
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public S k() {
        return new S(this.f14739b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(S s8) {
        s8.d2(this.f14739b);
    }
}
