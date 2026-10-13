package p038e1;

import A1.r;
import A1.s;
import Q6.k;
import kotlin.jvm.internal.t;
import p065h1.AbstractC2405n0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class V extends AbstractC2405n0 implements T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f20433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f20434d;

    public V(k kVar, k kVar2) {
        super(kVar2);
        this.f20433c = kVar;
        this.f20434d = s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p038e1.T
    public void e(long j8) {
        if (r.e(this.f20434d, j8)) {
            return;
        }
        this.f20433c.invoke(r.b(j8));
        this.f20434d = j8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V) {
            return t.c(this.f20433c, ((V) obj).f20433c);
        }
        return false;
    }

    public int hashCode() {
        return this.f20433c.hashCode();
    }
}
