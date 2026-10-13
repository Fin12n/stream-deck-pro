package p191w0;

import R0.C1598l0;
import kotlin.jvm.internal.AbstractC2633k;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: renamed from: w0.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3090v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f36642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f36643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f36644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f36645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f36646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f36647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f36648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f36649m;

    public /* synthetic */ C3090v0(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20);
    }

    public final q1 a(boolean z8, boolean z9, InterfaceC3163l interfaceC3163l, int i8) {
        long j8;
        interfaceC3163l.f(-2126903408);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-2126903408, i8, -1, "androidx.compose.material3.SelectableChipColors.containerColor (Chip.kt:2566)");
        }
        if (z8) {
            j8 = !z9 ? this.f36637a : this.f36645i;
        } else {
            j8 = z9 ? this.f36646j : this.f36641e;
        }
        q1 q1VarP = g1.p(C1598l0.g(j8), interfaceC3163l, 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarP;
    }

    public final long b(boolean z8, boolean z9) {
        if (z8) {
            return !z9 ? this.f36638b : this.f36647k;
        }
        return this.f36642f;
    }

    public final long c(boolean z8, boolean z9) {
        if (z8) {
            return !z9 ? this.f36639c : this.f36648l;
        }
        return this.f36643g;
    }

    public final long d(boolean z8, boolean z9) {
        if (z8) {
            return !z9 ? this.f36640d : this.f36649m;
        }
        return this.f36644h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3090v0)) {
            return false;
        }
        C3090v0 c3090v0 = (C3090v0) obj;
        return C1598l0.q(this.f36637a, c3090v0.f36637a) && C1598l0.q(this.f36638b, c3090v0.f36638b) && C1598l0.q(this.f36639c, c3090v0.f36639c) && C1598l0.q(this.f36640d, c3090v0.f36640d) && C1598l0.q(this.f36641e, c3090v0.f36641e) && C1598l0.q(this.f36642f, c3090v0.f36642f) && C1598l0.q(this.f36643g, c3090v0.f36643g) && C1598l0.q(this.f36644h, c3090v0.f36644h) && C1598l0.q(this.f36645i, c3090v0.f36645i) && C1598l0.q(this.f36646j, c3090v0.f36646j) && C1598l0.q(this.f36647k, c3090v0.f36647k) && C1598l0.q(this.f36648l, c3090v0.f36648l) && C1598l0.q(this.f36649m, c3090v0.f36649m);
    }

    public int hashCode() {
        return (((((((((((((((((((((((C1598l0.w(this.f36637a) * 31) + C1598l0.w(this.f36638b)) * 31) + C1598l0.w(this.f36639c)) * 31) + C1598l0.w(this.f36640d)) * 31) + C1598l0.w(this.f36641e)) * 31) + C1598l0.w(this.f36642f)) * 31) + C1598l0.w(this.f36643g)) * 31) + C1598l0.w(this.f36644h)) * 31) + C1598l0.w(this.f36645i)) * 31) + C1598l0.w(this.f36646j)) * 31) + C1598l0.w(this.f36647k)) * 31) + C1598l0.w(this.f36648l)) * 31) + C1598l0.w(this.f36649m);
    }

    public C3090v0(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        this.f36637a = j8;
        this.f36638b = j9;
        this.f36639c = j10;
        this.f36640d = j11;
        this.f36641e = j12;
        this.f36642f = j13;
        this.f36643g = j14;
        this.f36644h = j15;
        this.f36645i = j16;
        this.f36646j = j17;
        this.f36647k = j18;
        this.f36648l = j19;
        this.f36649m = j20;
    }
}
