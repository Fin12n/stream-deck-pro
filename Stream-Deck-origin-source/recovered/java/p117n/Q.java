package p117n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30293a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30294b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30295c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30296d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30297e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30298f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30299g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f30300h = false;

    public int a() {
        return this.f30299g ? this.f30293a : this.f30294b;
    }

    public int b() {
        return this.f30293a;
    }

    public int c() {
        return this.f30294b;
    }

    public int d() {
        return this.f30299g ? this.f30294b : this.f30293a;
    }

    public void e(int i8, int i9) {
        this.f30300h = false;
        if (i8 != Integer.MIN_VALUE) {
            this.f30297e = i8;
            this.f30293a = i8;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f30298f = i9;
            this.f30294b = i9;
        }
    }

    public void f(boolean z8) {
        if (z8 == this.f30299g) {
            return;
        }
        this.f30299g = z8;
        if (!this.f30300h) {
            this.f30293a = this.f30297e;
            this.f30294b = this.f30298f;
            return;
        }
        if (z8) {
            int i8 = this.f30296d;
            if (i8 == Integer.MIN_VALUE) {
                i8 = this.f30297e;
            }
            this.f30293a = i8;
            int i9 = this.f30295c;
            if (i9 == Integer.MIN_VALUE) {
                i9 = this.f30298f;
            }
            this.f30294b = i9;
            return;
        }
        int i10 = this.f30295c;
        if (i10 == Integer.MIN_VALUE) {
            i10 = this.f30297e;
        }
        this.f30293a = i10;
        int i11 = this.f30296d;
        if (i11 == Integer.MIN_VALUE) {
            i11 = this.f30298f;
        }
        this.f30294b = i11;
    }

    public void g(int i8, int i9) {
        this.f30295c = i8;
        this.f30296d = i9;
        this.f30300h = true;
        if (this.f30299g) {
            if (i9 != Integer.MIN_VALUE) {
                this.f30293a = i9;
            }
            if (i8 != Integer.MIN_VALUE) {
                this.f30294b = i8;
                return;
            }
            return;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f30293a = i8;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f30294b = i9;
        }
    }
}
