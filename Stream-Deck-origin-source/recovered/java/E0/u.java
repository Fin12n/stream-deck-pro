package E0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class u implements Iterator, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f2025a = t.f2016e.a().p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2027c;

    public final Object b() {
        G0.a.a(f());
        return this.f2025a[this.f2027c];
    }

    public final t c() {
        G0.a.a(g());
        Object obj = this.f2025a[this.f2027c];
        kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    public final Object[] d() {
        return this.f2025a;
    }

    public final int e() {
        return this.f2027c;
    }

    public final boolean f() {
        return this.f2027c < this.f2026b;
    }

    public final boolean g() {
        G0.a.a(this.f2027c >= this.f2026b);
        return this.f2027c < this.f2025a.length;
    }

    public final void h() {
        G0.a.a(f());
        this.f2027c += 2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return f();
    }

    public final void j() {
        G0.a.a(g());
        this.f2027c++;
    }

    public final void k(Object[] objArr, int i8) {
        l(objArr, i8, 0);
    }

    public final void l(Object[] objArr, int i8, int i9) {
        this.f2025a = objArr;
        this.f2026b = i8;
        this.f2027c = i9;
    }

    public final void m(int i8) {
        this.f2027c = i8;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
