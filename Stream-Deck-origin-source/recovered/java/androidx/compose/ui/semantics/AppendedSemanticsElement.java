package androidx.compose.ui.semantics;

import Q6.k;
import kotlin.jvm.internal.t;
import p056g1.U;
import p110m1.d;
import p110m1.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class AppendedSemanticsElement extends U implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f15035c;

    public AppendedSemanticsElement(boolean z8, k kVar) {
        this.f15034b = z8;
        this.f15035c = kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f15034b == appendedSemanticsElement.f15034b && t.c(this.f15035c, appendedSemanticsElement.f15035c);
    }

    @Override // p056g1.U
    public int hashCode() {
        return (Boolean.hashCode(this.f15034b) * 31) + this.f15035c.hashCode();
    }

    @Override // p110m1.m
    public p110m1.k l() {
        p110m1.k kVar = new p110m1.k();
        kVar.H(this.f15034b);
        this.f15035c.invoke(kVar);
        return kVar;
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public d k() {
        return new d(this.f15034b, false, this.f15035c);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(d dVar) {
        dVar.d2(this.f15034b);
        dVar.e2(this.f15035c);
    }

    public String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f15034b + ", properties=" + this.f15035c + ')';
    }
}
