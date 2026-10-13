package androidx.compose.foundation;

import kotlin.jvm.internal.t;
import p046f0.a0;
import p046f0.b0;
import p056g1.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLayoutElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f14316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14318d;

    public ScrollingLayoutElement(a0 a0Var, boolean z8, boolean z9) {
        this.f14316b = a0Var;
        this.f14317c = z8;
        this.f14318d = z9;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return t.c(this.f14316b, scrollingLayoutElement.f14316b) && this.f14317c == scrollingLayoutElement.f14317c && this.f14318d == scrollingLayoutElement.f14318d;
    }

    @Override // p056g1.U
    public int hashCode() {
        return (((this.f14316b.hashCode() * 31) + Boolean.hashCode(this.f14317c)) * 31) + Boolean.hashCode(this.f14318d);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public b0 k() {
        return new b0(this.f14316b, this.f14317c, this.f14318d);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(b0 b0Var) {
        b0Var.h2(this.f14316b);
        b0Var.g2(this.f14317c);
        b0Var.i2(this.f14318d);
    }
}
