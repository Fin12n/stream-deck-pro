package U4;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f10183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10184b;

    public e(PendingIntent pendingIntent, boolean z8) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f10183a = pendingIntent;
        this.f10184b = z8;
    }

    @Override // U4.b
    public final PendingIntent a() {
        return this.f10183a;
    }

    @Override // U4.b
    public final boolean b() {
        return this.f10184b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f10183a.equals(bVar.a()) && this.f10184b == bVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10183a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f10184b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f10183a.toString() + ", isNoOp=" + this.f10184b + "}";
    }
}
