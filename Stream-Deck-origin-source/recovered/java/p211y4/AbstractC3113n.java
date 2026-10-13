package p211y4;

import S4.l;
import p195w4.d;
import p219z4.AbstractC3207p;

/* JADX INFO: renamed from: y4.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3113n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d[] f38409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38411c;

    /* JADX INFO: renamed from: y4.n$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC3111l f38412a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d[] f38414c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f38413b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f38415d = 0;

        public /* synthetic */ a(W w8) {
        }

        public AbstractC3113n a() {
            AbstractC3207p.b(this.f38412a != null, "execute parameter required");
            return new V(this, this.f38414c, this.f38413b, this.f38415d);
        }

        public a b(InterfaceC3111l interfaceC3111l) {
            this.f38412a = interfaceC3111l;
            return this;
        }

        public a c(boolean z8) {
            this.f38413b = z8;
            return this;
        }

        public a d(d... dVarArr) {
            this.f38414c = dVarArr;
            return this;
        }

        public a e(int i8) {
            this.f38415d = i8;
            return this;
        }
    }

    @Deprecated
    public AbstractC3113n() {
        this.f38409a = null;
        this.f38410b = false;
        this.f38411c = 0;
    }

    public static a a() {
        return new a(null);
    }

    public abstract void b(x4.a.b bVar, l lVar);

    public boolean c() {
        return this.f38410b;
    }

    public final int d() {
        return this.f38411c;
    }

    public final d[] e() {
        return this.f38409a;
    }

    public AbstractC3113n(d[] dVarArr, boolean z8, int i8) {
        this.f38409a = dVarArr;
        boolean z9 = false;
        if (dVarArr != null && z8) {
            z9 = true;
        }
        this.f38410b = z9;
        this.f38411c = i8;
    }
}
