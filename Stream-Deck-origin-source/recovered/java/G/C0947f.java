package G;

import A.C0868e0;

/* JADX INFO: renamed from: G.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0947f extends X.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0868e0 f2558b;

    public C0947f(int i8, C0868e0 c0868e0) {
        this.f2557a = i8;
        if (c0868e0 == null) {
            throw new NullPointerException("Null imageCaptureException");
        }
        this.f2558b = c0868e0;
    }

    @Override // G.X.a
    public C0868e0 a() {
        return this.f2558b;
    }

    @Override // G.X.a
    public int b() {
        return this.f2557a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X.a) {
            X.a aVar = (X.a) obj;
            if (this.f2557a == aVar.b() && this.f2558b.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2557a ^ 1000003) * 1000003) ^ this.f2558b.hashCode();
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f2557a + ", imageCaptureException=" + this.f2558b + "}";
    }
}
