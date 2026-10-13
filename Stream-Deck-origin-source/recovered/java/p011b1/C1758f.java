package p011b1;

import Q0.f;
import kotlin.jvm.internal.AbstractC2633k;
import p043e6.dT.GIGvBf;

/* JADX INFO: renamed from: b1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1758f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15740c;

    public /* synthetic */ C1758f(long j8, long j9, long j10, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10);
    }

    public final long a() {
        return this.f15740c;
    }

    public final long b() {
        return this.f15739b;
    }

    public final long c() {
        return this.f15738a;
    }

    public /* synthetic */ C1758f(long j8, long j9, AbstractC2633k abstractC2633k) {
        this(j8, j9);
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f15738a + GIGvBf.BQTW + ((Object) f.v(this.f15739b)) + ')';
    }

    public C1758f(long j8, long j9) {
        this.f15738a = j8;
        this.f15739b = j9;
        this.f15740c = f.f9082b.c();
    }

    public C1758f(long j8, long j9, long j10) {
        this(j8, j9, (AbstractC2633k) null);
        this.f15740c = j10;
    }
}
