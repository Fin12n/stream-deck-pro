package p138p3;

import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;

/* JADX INFO: renamed from: p3.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2782q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31206a;

    /* JADX INFO: renamed from: p3.q$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f31207a;

        public /* synthetic */ a(t0 t0Var) {
        }

        public a b(String str) {
            this.f31207a = str;
            return this;
        }

        public C2782q a() {
            if (this.f31207a != null) {
                return new C2782q(this, null);
            }
            throw new IllegalArgumentException(LYdqVGvOGMNr.CnsXxm);
        }
    }

    public /* synthetic */ C2782q(a aVar, u0 u0Var) {
        this.f31206a = aVar.f31207a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f31206a;
    }
}
