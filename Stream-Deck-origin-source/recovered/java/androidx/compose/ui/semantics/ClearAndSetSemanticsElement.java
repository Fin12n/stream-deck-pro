package androidx.compose.ui.semantics;

import Q6.k;
import kotlin.jvm.internal.t;
import p056g1.U;
import p110m1.d;
import p110m1.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends U implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f15036b;

    public ClearAndSetSemanticsElement(k kVar) {
        this.f15036b = kVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && t.c(this.f15036b, ((ClearAndSetSemanticsElement) obj).f15036b);
    }

    @Override // p056g1.U
    public int hashCode() {
        return this.f15036b.hashCode();
    }

    @Override // p110m1.m
    public p110m1.k l() {
        p110m1.k kVar = new p110m1.k();
        kVar.H(false);
        kVar.G(true);
        this.f15036b.invoke(kVar);
        return kVar;
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public d k() {
        return new d(false, true, this.f15036b);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(d dVar) {
        dVar.e2(this.f15036b);
    }

    public String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f15036b + ')';
    }
}
