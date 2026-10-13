package p029d1;

import Z.JTT.ryTuoS;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19742d;

    public c(float f8, float f9, long j8, int i8) {
        this.f19739a = f8;
        this.f19740b = f9;
        this.f19741c = j8;
        this.f19742d = i8;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f19739a == this.f19739a && cVar.f19740b == this.f19740b && cVar.f19741c == this.f19741c && cVar.f19742d == this.f19742d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f19739a) * 31) + Float.hashCode(this.f19740b)) * 31) + Long.hashCode(this.f19741c)) * 31) + Integer.hashCode(this.f19742d);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f19739a + ",horizontalScrollPixels=" + this.f19740b + ryTuoS.FLQvgYK + this.f19741c + ",deviceId=" + this.f19742d + ')';
    }
}
