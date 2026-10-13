package A;

import android.view.Surface;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: renamed from: A.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0877j extends S0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Surface f288b;

    @Override // A.S0.g
    public int a() {
        return this.f287a;
    }

    @Override // A.S0.g
    public Surface b() {
        return this.f288b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof S0.g) {
            S0.g gVar = (S0.g) obj;
            if (this.f287a == gVar.a() && this.f288b.equals(gVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f287a ^ 1000003) * 1000003) ^ this.f288b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f287a + ", surface=" + this.f288b + "}";
    }

    public C0877j(int i8, Surface surface) {
        this.f287a = i8;
        if (surface != null) {
            this.f288b = surface;
            return;
        }
        throw new NullPointerException(RaiWHuj.EeHtHtpezLMF);
    }
}
