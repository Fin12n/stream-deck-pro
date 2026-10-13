package p028d0;

import T0.Vl.PCRzgdeK;
import androidx.compose.ui.graphics.f;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p037e0.E;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f19735c;

    public /* synthetic */ x(float f8, long j8, E e8, AbstractC2633k abstractC2633k) {
        this(f8, j8, e8);
    }

    public final E a() {
        return this.f19735c;
    }

    public final float b() {
        return this.f19733a;
    }

    public final long c() {
        return this.f19734b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f19733a, xVar.f19733a) == 0 && f.e(this.f19734b, xVar.f19734b) && t.c(this.f19735c, xVar.f19735c);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f19733a) * 31) + f.h(this.f19734b)) * 31) + this.f19735c.hashCode();
    }

    public x(float f8, long j8, E e8) {
        this.f19733a = f8;
        this.f19734b = j8;
        this.f19735c = e8;
    }

    public String toString() {
        return "Scale(scale=" + this.f19733a + PCRzgdeK.JrmGn + ((Object) f.i(this.f19734b)) + ", animationSpec=" + this.f19735c + ')';
    }
}
