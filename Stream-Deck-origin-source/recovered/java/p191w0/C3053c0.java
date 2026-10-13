package p191w0;

import R0.C1598l0;
import kotlin.jvm.internal.AbstractC2633k;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: renamed from: w0.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3053c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f35814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f35815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f35816f;

    public /* synthetic */ C3053c0(long j8, long j9, long j10, long j11, long j12, long j13, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, j11, j12, j13);
    }

    public final long a(boolean z8, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-395881771);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-395881771, i8, -1, "androidx.compose.material3.MenuItemColors.leadingIconColor (Menu.kt:189)");
        }
        long j8 = z8 ? this.f35812b : this.f35815e;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return j8;
    }

    public final q1 b(boolean z8, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1023108655);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1023108655, i8, -1, "androidx.compose.material3.MenuItemColors.textColor (Menu.kt:178)");
        }
        q1 q1VarP = g1.p(C1598l0.g(z8 ? this.f35811a : this.f35814d), interfaceC3163l, 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarP;
    }

    public final long c(boolean z8, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-892832569);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-892832569, i8, -1, "androidx.compose.material3.MenuItemColors.trailingIconColor (Menu.kt:198)");
        }
        long j8 = z8 ? this.f35813c : this.f35816f;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return j8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3053c0)) {
            return false;
        }
        C3053c0 c3053c0 = (C3053c0) obj;
        return C1598l0.q(this.f35811a, c3053c0.f35811a) && C1598l0.q(this.f35812b, c3053c0.f35812b) && C1598l0.q(this.f35813c, c3053c0.f35813c) && C1598l0.q(this.f35814d, c3053c0.f35814d) && C1598l0.q(this.f35815e, c3053c0.f35815e) && C1598l0.q(this.f35816f, c3053c0.f35816f);
    }

    public int hashCode() {
        return (((((((((C1598l0.w(this.f35811a) * 31) + C1598l0.w(this.f35812b)) * 31) + C1598l0.w(this.f35813c)) * 31) + C1598l0.w(this.f35814d)) * 31) + C1598l0.w(this.f35815e)) * 31) + C1598l0.w(this.f35816f);
    }

    public C3053c0(long j8, long j9, long j10, long j11, long j12, long j13) {
        this.f35811a = j8;
        this.f35812b = j9;
        this.f35813c = j10;
        this.f35814d = j11;
        this.f35815e = j12;
        this.f35816f = j13;
    }
}
