package D0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f1714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1715e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i8, int i9, int i10) {
        super(i8, i9);
        this.f1713c = i10;
        Object[] objArr2 = new Object[i10];
        this.f1714d = objArr2;
        ?? r8 = i8 == i9 ? 1 : 0;
        this.f1715e = r8;
        objArr2[0] = objArr;
        j(i8 - r8, 1);
    }

    public final Object h() {
        int iD = d() & 31;
        Object obj = this.f1714d[this.f1713c - 1];
        t.e(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[iD];
    }

    public final void j(int i8, int i9) {
        int i10 = (this.f1713c - i9) * 5;
        while (i9 < this.f1713c) {
            Object[] objArr = this.f1714d;
            Object obj = objArr[i9 - 1];
            t.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i9] = ((Object[]) obj)[l.a(i8, i10)];
            i10 -= 5;
            i9++;
        }
    }

    public final void k(int i8) {
        int i9 = 0;
        while (l.a(d(), i9) == i8) {
            i9 += 5;
        }
        if (i9 > 0) {
            j(d(), ((this.f1713c - 1) - (i9 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void l(Object[] objArr, int i8, int i9, int i10) {
        f(i8);
        g(i9);
        this.f1713c = i10;
        if (this.f1714d.length < i10) {
            this.f1714d = new Object[i10];
        }
        this.f1714d[0] = objArr;
        ?? r8 = i8 == i9 ? 1 : 0;
        this.f1715e = r8;
        j(i8 - r8, 1);
    }

    @Override // D0.a, java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objH = h();
        f(d() + 1);
        if (d() == e()) {
            this.f1715e = true;
            return objH;
        }
        k(0);
        return objH;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        f(d() - 1);
        if (this.f1715e) {
            this.f1715e = false;
            return h();
        }
        k(31);
        return h();
    }
}
