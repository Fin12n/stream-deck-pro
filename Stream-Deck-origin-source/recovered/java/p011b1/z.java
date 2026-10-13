package p011b1;

import C6.InterfaceC0916e;
import D6.r;
import Q0.f;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f15806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f15807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f15810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f15811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f15812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1757e f15813m;

    public /* synthetic */ z(long j8, long j9, long j10, boolean z8, float f8, long j11, long j12, boolean z9, boolean z10, int i8, long j13, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, z8, f8, j11, j12, z9, z10, i8, j13);
    }

    public static /* synthetic */ z c(z zVar, long j8, long j9, long j10, long j11, boolean z8, float f8, long j12, long j13, boolean z9, int i8, List list, long j14, int i9, Object obj) {
        long j15;
        List list2;
        long j16 = (i9 & 1) != 0 ? zVar.f15801a : j8;
        long j17 = (i9 & 2) != 0 ? zVar.f15802b : j9;
        long j18 = (i9 & 4) != 0 ? zVar.f15803c : j10;
        long j19 = (i9 & 8) != 0 ? zVar.f15812l : j11;
        boolean z10 = (i9 & 16) != 0 ? zVar.f15804d : z8;
        float f9 = (i9 & 32) != 0 ? zVar.f15805e : f8;
        long j20 = (i9 & 64) != 0 ? zVar.f15806f : j12;
        long j21 = (i9 & 128) != 0 ? zVar.f15807g : j13;
        long j22 = j16;
        boolean z11 = (i9 & 256) != 0 ? zVar.f15808h : z9;
        int i10 = (i9 & 512) != 0 ? zVar.f15809i : i8;
        boolean z12 = z11;
        List listF = (i9 & 1024) != 0 ? zVar.f() : list;
        if ((i9 & 2048) != 0) {
            list2 = listF;
            j15 = zVar.f15810j;
        } else {
            j15 = j14;
            list2 = listF;
        }
        return zVar.b(j22, j17, j18, j19, z10, f9, j20, j21, z12, i10, list2, j15);
    }

    public static /* synthetic */ z e(z zVar, long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, int i8, List list, long j13, int i9, Object obj) {
        long j14;
        long j15 = (i9 & 1) != 0 ? zVar.f15801a : j8;
        long j16 = (i9 & 2) != 0 ? zVar.f15802b : j9;
        long j17 = (i9 & 4) != 0 ? zVar.f15803c : j10;
        boolean z10 = (i9 & 8) != 0 ? zVar.f15804d : z8;
        long j18 = (i9 & 16) != 0 ? zVar.f15806f : j11;
        long j19 = (i9 & 32) != 0 ? zVar.f15807g : j12;
        boolean z11 = (i9 & 64) != 0 ? zVar.f15808h : z9;
        int i10 = (i9 & 128) != 0 ? zVar.f15809i : i8;
        if ((i9 & 512) != 0) {
            j14 = zVar.f15810j;
            j15 = j15;
        } else {
            j14 = j13;
        }
        return zVar.d(j15, j16, j17, z10, j18, j19, z11, i10, list, j14);
    }

    public final void a() {
        this.f15813m.c(true);
        this.f15813m.d(true);
    }

    public final z b(long j8, long j9, long j10, long j11, boolean z8, float f8, long j12, long j13, boolean z9, int i8, List list, long j14) {
        z zVar = new z(j8, j9, j10, z8, f8, j12, j13, z9, false, i8, list, j14, j11, null);
        zVar.f15813m = this.f15813m;
        return zVar;
    }

    public final z d(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, int i8, List list, long j13) {
        return c(this, j8, j9, j10, 0L, z8, this.f15805e, j11, j12, z9, i8, list, j13, 8, null);
    }

    public final List f() {
        List list = this.f15811k;
        return list == null ? r.n() : list;
    }

    public final long g() {
        return this.f15801a;
    }

    public final long h() {
        return this.f15812l;
    }

    public final long i() {
        return this.f15803c;
    }

    public final boolean j() {
        return this.f15804d;
    }

    public final float k() {
        return this.f15805e;
    }

    public final long l() {
        return this.f15807g;
    }

    public final boolean m() {
        return this.f15808h;
    }

    public final long n() {
        return this.f15810j;
    }

    public final int o() {
        return this.f15809i;
    }

    public final long p() {
        return this.f15802b;
    }

    public final boolean q() {
        return this.f15813m.a() || this.f15813m.b();
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) y.f(this.f15801a)) + ", uptimeMillis=" + this.f15802b + ", position=" + ((Object) f.v(this.f15803c)) + ", pressed=" + this.f15804d + ", pressure=" + this.f15805e + ", previousUptimeMillis=" + this.f15806f + ", previousPosition=" + ((Object) f.v(this.f15807g)) + ", previousPressed=" + this.f15808h + ", isConsumed=" + q() + ", type=" + ((Object) N.i(this.f15809i)) + ", historical=" + f() + ",scrollDelta=" + ((Object) f.v(this.f15810j)) + ')';
    }

    public /* synthetic */ z(long j8, long j9, long j10, boolean z8, float f8, long j11, long j12, boolean z9, boolean z10, int i8, List list, long j13, long j14, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, z8, f8, j11, j12, z9, z10, i8, list, j13, j14);
    }

    @InterfaceC0916e
    public /* synthetic */ z(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, C1757e c1757e, int i8, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, z8, j11, j12, z9, c1757e, i8);
    }

    public /* synthetic */ z(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, boolean z10, int i8, long j13, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, z8, j11, j12, z9, z10, i8, j13);
    }

    public z(long j8, long j9, long j10, boolean z8, float f8, long j11, long j12, boolean z9, boolean z10, int i8, long j13) {
        this.f15801a = j8;
        this.f15802b = j9;
        this.f15803c = j10;
        this.f15804d = z8;
        this.f15805e = f8;
        this.f15806f = j11;
        this.f15807g = j12;
        this.f15808h = z9;
        this.f15809i = i8;
        this.f15810j = j13;
        this.f15812l = f.f9082b.c();
        this.f15813m = new C1757e(z10, z10);
    }

    public /* synthetic */ z(long j8, long j9, long j10, boolean z8, float f8, long j11, long j12, boolean z9, boolean z10, int i8, long j13, int i9, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, z8, f8, j11, j12, z9, z10, (i9 & 512) != 0 ? N.f15698a.d() : i8, (i9 & 1024) != 0 ? f.f9082b.c() : j13, (AbstractC2633k) null);
    }

    public /* synthetic */ z(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, boolean z10, int i8, long j13, int i9, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, z8, j11, j12, z9, z10, (i9 & 256) != 0 ? N.f15698a.d() : i8, (i9 & 512) != 0 ? f.f9082b.c() : j13, (AbstractC2633k) null);
    }

    public z(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, boolean z10, int i8, long j13) {
        this(j8, j9, j10, z8, 1.0f, j11, j12, z9, z10, i8, j13, (AbstractC2633k) null);
    }

    public /* synthetic */ z(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, C1757e c1757e, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, z8, j11, j12, z9, c1757e, (i9 & 256) != 0 ? N.f15698a.d() : i8, (AbstractC2633k) null);
    }

    public z(long j8, long j9, long j10, boolean z8, long j11, long j12, boolean z9, C1757e c1757e, int i8) {
        this(j8, j9, j10, z8, 1.0f, j11, j12, z9, c1757e.a() || c1757e.b(), i8, f.f9082b.c(), (AbstractC2633k) null);
    }

    public z(long j8, long j9, long j10, boolean z8, float f8, long j11, long j12, boolean z9, boolean z10, int i8, List list, long j13, long j14) {
        this(j8, j9, j10, z8, f8, j11, j12, z9, z10, i8, j13, (AbstractC2633k) null);
        this.f15811k = list;
        this.f15812l = j14;
    }
}
