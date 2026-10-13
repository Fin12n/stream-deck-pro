package p062g7;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23828b = AtomicIntegerFieldUpdater.newUpdater(M.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public N[] f23829a;

    public final void a(N n8) {
        n8.b(this);
        N[] nArrG = g();
        int iC = c();
        k(iC + 1);
        nArrG[iC] = n8;
        n8.setIndex(iC);
        m(iC);
    }

    public final N b() {
        N[] nArr = this.f23829a;
        if (nArr != null) {
            return nArr[0];
        }
        return null;
    }

    public final int c() {
        return f23828b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final N f() {
        N nB;
        synchronized (this) {
            nB = b();
        }
        return nB;
    }

    public final N[] g() {
        N[] nArr = this.f23829a;
        if (nArr == null) {
            N[] nArr2 = new N[4];
            this.f23829a = nArr2;
            return nArr2;
        }
        if (c() < nArr.length) {
            return nArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(nArr, c() * 2);
        t.f(objArrCopyOf, "copyOf(...)");
        N[] nArr3 = (N[]) objArrCopyOf;
        this.f23829a = nArr3;
        return nArr3;
    }

    public final boolean h(N n8) {
        boolean z8;
        synchronized (this) {
            if (n8.a() == null) {
                z8 = false;
            } else {
                i(n8.getIndex());
                z8 = true;
            }
        }
        return z8;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public final N i(int i8) {
        N[] nArr = this.f23829a;
        t.d(nArr);
        k(c() - 1);
        if (i8 < c()) {
            n(i8, c());
            int i9 = (i8 - 1) / 2;
            if (i8 > 0) {
                N n8 = nArr[i8];
                t.d(n8);
                N n9 = nArr[i9];
                t.d(n9);
                if (((Comparable) n8).compareTo(n9) < 0) {
                    n(i8, i9);
                    m(i9);
                } else {
                    l(i8);
                }
            } else {
                l(i8);
            }
        }
        N n10 = nArr[c()];
        t.d(n10);
        n10.b(null);
        n10.setIndex(-1);
        nArr[c()] = null;
        return n10;
    }

    public final N j() {
        N nI;
        synchronized (this) {
            nI = c() > 0 ? i(0) : null;
        }
        return nI;
    }

    public final void k(int i8) {
        f23828b.set(this, i8);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    public final void l(int i8) {
        while (true) {
            int i9 = i8 * 2;
            int i10 = i9 + 1;
            if (i10 >= c()) {
                return;
            }
            N[] nArr = this.f23829a;
            t.d(nArr);
            int i11 = i9 + 2;
            if (i11 < c()) {
                N n8 = nArr[i11];
                t.d(n8);
                N n9 = nArr[i10];
                t.d(n9);
                if (((Comparable) n8).compareTo(n9) >= 0) {
                    i11 = i10;
                }
            } else {
                i11 = i10;
            }
            N n10 = nArr[i8];
            t.d(n10);
            N n11 = nArr[i11];
            t.d(n11);
            if (((Comparable) n10).compareTo(n11) <= 0) {
                return;
            }
            n(i8, i11);
            i8 = i11;
        }
    }

    public final void m(int i8) {
        while (i8 > 0) {
            N[] nArr = this.f23829a;
            t.d(nArr);
            int i9 = (i8 - 1) / 2;
            N n8 = nArr[i9];
            t.d(n8);
            N n9 = nArr[i8];
            t.d(n9);
            if (((Comparable) n8).compareTo(n9) <= 0) {
                return;
            }
            n(i8, i9);
            i8 = i9;
        }
    }

    public final void n(int i8, int i9) {
        N[] nArr = this.f23829a;
        t.d(nArr);
        N n8 = nArr[i9];
        t.d(n8);
        N n9 = nArr[i8];
        t.d(n9);
        nArr[i8] = n8;
        nArr[i9] = n9;
        n8.setIndex(i8);
        n9.setIndex(i9);
    }
}
