package p011b1;

import H.FL.dCqzKmEghGTQ;
import Q0.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f15669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f15670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f15671k;

    public /* synthetic */ C(long j8, long j9, long j10, long j11, boolean z8, float f8, int i8, boolean z9, List list, long j12, long j13, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, j11, z8, f8, i8, z9, list, j12, j13);
    }

    public final boolean a() {
        return this.f15665e;
    }

    public final List b() {
        return this.f15669i;
    }

    public final long c() {
        return this.f15661a;
    }

    public final boolean d() {
        return this.f15668h;
    }

    public final long e() {
        return this.f15671k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c8 = (C) obj;
        return y.d(this.f15661a, c8.f15661a) && this.f15662b == c8.f15662b && f.l(this.f15663c, c8.f15663c) && f.l(this.f15664d, c8.f15664d) && this.f15665e == c8.f15665e && Float.compare(this.f15666f, c8.f15666f) == 0 && N.g(this.f15667g, c8.f15667g) && this.f15668h == c8.f15668h && t.c(this.f15669i, c8.f15669i) && f.l(this.f15670j, c8.f15670j) && f.l(this.f15671k, c8.f15671k);
    }

    public final long f() {
        return this.f15664d;
    }

    public final long g() {
        return this.f15663c;
    }

    public final float h() {
        return this.f15666f;
    }

    public int hashCode() {
        return (((((((((((((((((((y.e(this.f15661a) * 31) + Long.hashCode(this.f15662b)) * 31) + f.q(this.f15663c)) * 31) + f.q(this.f15664d)) * 31) + Boolean.hashCode(this.f15665e)) * 31) + Float.hashCode(this.f15666f)) * 31) + N.h(this.f15667g)) * 31) + Boolean.hashCode(this.f15668h)) * 31) + this.f15669i.hashCode()) * 31) + f.q(this.f15670j)) * 31) + f.q(this.f15671k);
    }

    public final long i() {
        return this.f15670j;
    }

    public final int j() {
        return this.f15667g;
    }

    public final long k() {
        return this.f15662b;
    }

    public C(long j8, long j9, long j10, long j11, boolean z8, float f8, int i8, boolean z9, List list, long j12, long j13) {
        this.f15661a = j8;
        this.f15662b = j9;
        this.f15663c = j10;
        this.f15664d = j11;
        this.f15665e = z8;
        this.f15666f = f8;
        this.f15667g = i8;
        this.f15668h = z9;
        this.f15669i = list;
        this.f15670j = j12;
        this.f15671k = j13;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) y.f(this.f15661a)) + ", uptime=" + this.f15662b + ", positionOnScreen=" + ((Object) f.v(this.f15663c)) + dCqzKmEghGTQ.wZnYuFeEekufAr + ((Object) f.v(this.f15664d)) + ", down=" + this.f15665e + ", pressure=" + this.f15666f + ", type=" + ((Object) N.i(this.f15667g)) + ", issuesEnterExit=" + this.f15668h + ", historical=" + this.f15669i + ", scrollDelta=" + ((Object) f.v(this.f15670j)) + ", originalEventPosition=" + ((Object) f.v(this.f15671k)) + ')';
    }

    public /* synthetic */ C(long j8, long j9, long j10, long j11, boolean z8, float f8, int i8, boolean z9, List list, long j12, long j13, int i9, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, j11, z8, f8, i8, (i9 & 128) != 0 ? false : z9, (i9 & 256) != 0 ? new ArrayList() : list, (i9 & 512) != 0 ? f.f9082b.c() : j12, (i9 & 1024) != 0 ? f.f9082b.c() : j13, null);
    }
}
