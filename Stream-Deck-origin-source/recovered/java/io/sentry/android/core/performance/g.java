package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.AbstractC2519l;
import io.sentry.B2;
import io.sentry.U1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f26530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26532d;

    public void A(long j8) {
        this.f26531c = j8;
        this.f26530b = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f26531c);
    }

    public void B(String str, long j8, long j9, long j10) {
        this.f26529a = str;
        this.f26530b = j8;
        this.f26531c = j9;
        this.f26532d = j10;
    }

    public void C() {
        this.f26531c = SystemClock.uptimeMillis();
        this.f26530b = System.currentTimeMillis();
    }

    public void D() {
        this.f26532d = SystemClock.uptimeMillis();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(g gVar) {
        return Long.compare(this.f26530b, gVar.f26530b);
    }

    public String b() {
        return this.f26529a;
    }

    public long c() {
        if (y()) {
            return this.f26532d - this.f26531c;
        }
        return 0L;
    }

    public U1 d() {
        if (y()) {
            return new B2(AbstractC2519l.h(e()));
        }
        return null;
    }

    public long e() {
        if (x()) {
            return this.f26530b + c();
        }
        return 0L;
    }

    public double j() {
        return AbstractC2519l.i(e());
    }

    public U1 m() {
        if (x()) {
            return new B2(AbstractC2519l.h(s()));
        }
        return null;
    }

    public long s() {
        return this.f26530b;
    }

    public double t() {
        return AbstractC2519l.i(this.f26530b);
    }

    public long u() {
        return this.f26531c;
    }

    public boolean v() {
        return this.f26531c == 0;
    }

    public boolean w() {
        return this.f26532d == 0;
    }

    public boolean x() {
        return this.f26531c != 0;
    }

    public boolean y() {
        return this.f26532d != 0;
    }

    public void z() {
        this.f26529a = null;
        this.f26531c = 0L;
        this.f26532d = 0L;
        this.f26530b = 0L;
    }
}
