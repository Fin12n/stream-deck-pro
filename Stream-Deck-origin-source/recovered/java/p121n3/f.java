package p121n3;

import P1.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f30547a = new String[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f30548b = new long[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30549c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30550d = 0;

    public void a(String str) {
        int i8 = this.f30549c;
        if (i8 == 5) {
            this.f30550d++;
            return;
        }
        this.f30547a[i8] = str;
        this.f30548b[i8] = System.nanoTime();
        k.a(str);
        this.f30549c++;
    }

    public float b(String str) {
        int i8 = this.f30550d;
        if (i8 > 0) {
            this.f30550d = i8 - 1;
            return 0.0f;
        }
        int i9 = this.f30549c - 1;
        this.f30549c = i9;
        if (i9 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f30547a[i9])) {
            k.b();
            return (System.nanoTime() - this.f30548b[this.f30549c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f30547a[this.f30549c] + ".");
    }
}
