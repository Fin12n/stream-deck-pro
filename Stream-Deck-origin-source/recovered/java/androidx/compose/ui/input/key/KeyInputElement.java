package androidx.compose.ui.input.key;

import Q6.k;
import Z0.f;
import kotlin.jvm.internal.t;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class KeyInputElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f14726c;

    public KeyInputElement(k kVar, k kVar2) {
        this.f14725b = kVar;
        this.f14726c = kVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return t.c(this.f14725b, keyInputElement.f14725b) && t.c(this.f14726c, keyInputElement.f14726c);
    }

    @Override // p056g1.U
    public int hashCode() {
        k kVar = this.f14725b;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        k kVar2 = this.f14726c;
        return iHashCode + (kVar2 != null ? kVar2.hashCode() : 0);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public f k() {
        return new f(this.f14725b, this.f14726c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(f fVar) {
        fVar.d2(this.f14725b);
        fVar.e2(this.f14726c);
    }

    public String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f14725b + ", onPreKeyEvent=" + this.f14726c + ')';
    }
}
