package androidx.compose.ui.input.rotary;

import Q6.k;
import kotlin.jvm.internal.t;
import p029d1.b;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class RotaryInputElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f14736c;

    public RotaryInputElement(k kVar, k kVar2) {
        this.f14735b = kVar;
        this.f14736c = kVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return t.c(this.f14735b, rotaryInputElement.f14735b) && t.c(this.f14736c, rotaryInputElement.f14736c);
    }

    @Override // p056g1.U
    public int hashCode() {
        k kVar = this.f14735b;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        k kVar2 = this.f14736c;
        return iHashCode + (kVar2 != null ? kVar2.hashCode() : 0);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public b k() {
        return new b(this.f14735b, this.f14736c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(b bVar) {
        bVar.d2(this.f14735b);
        bVar.e2(this.f14736c);
    }

    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f14735b + ", onPreRotaryScrollEvent=" + this.f14736c + ')';
    }
}
