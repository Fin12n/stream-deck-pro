package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: renamed from: io.sentry.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2495f extends AbstractCollection implements Queue, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object[] f27107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f27108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f27109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient boolean f27110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27111e;

    /* JADX INFO: renamed from: io.sentry.f$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27113b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f27114c;

        public a() {
            this.f27112a = C2495f.this.f27108b;
            this.f27114c = C2495f.this.f27110d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27114c || this.f27112a != C2495f.this.f27109c;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f27114c = false;
            int i8 = this.f27112a;
            this.f27113b = i8;
            this.f27112a = C2495f.this.H(i8);
            return C2495f.this.f27107a[this.f27113b];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i8 = this.f27113b;
            if (i8 == -1) {
                throw new IllegalStateException();
            }
            if (i8 == C2495f.this.f27108b) {
                C2495f.this.remove();
                this.f27113b = -1;
                return;
            }
            int iH = this.f27113b + 1;
            if (C2495f.this.f27108b >= this.f27113b || iH >= C2495f.this.f27109c) {
                while (iH != C2495f.this.f27109c) {
                    if (iH >= C2495f.this.f27111e) {
                        C2495f.this.f27107a[iH - 1] = C2495f.this.f27107a[0];
                        iH = 0;
                    } else {
                        C2495f.this.f27107a[C2495f.this.G(iH)] = C2495f.this.f27107a[iH];
                        iH = C2495f.this.H(iH);
                    }
                }
            } else {
                System.arraycopy(C2495f.this.f27107a, iH, C2495f.this.f27107a, this.f27113b, C2495f.this.f27109c - iH);
            }
            this.f27113b = -1;
            C2495f c2495f = C2495f.this;
            c2495f.f27109c = c2495f.G(c2495f.f27109c);
            C2495f.this.f27107a[C2495f.this.f27109c] = null;
            C2495f.this.f27110d = false;
            this.f27112a = C2495f.this.G(this.f27112a);
        }
    }

    public C2495f() {
        this(32);
    }

    public final int G(int i8) {
        int i9 = i8 - 1;
        return i9 < 0 ? this.f27111e - 1 : i9;
    }

    public final int H(int i8) {
        int i9 = i8 + 1;
        if (i9 >= this.f27111e) {
            return 0;
        }
        return i9;
    }

    public boolean I() {
        return size() == this.f27111e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if (I()) {
            remove();
        }
        Object[] objArr = this.f27107a;
        int i8 = this.f27109c;
        int i9 = i8 + 1;
        this.f27109c = i9;
        objArr[i8] = obj;
        if (i9 >= this.f27111e) {
            this.f27109c = 0;
        }
        if (this.f27109c == this.f27108b) {
            this.f27110d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f27110d = false;
        this.f27108b = 0;
        this.f27109c = 0;
        Arrays.fill(this.f27107a, (Object) null);
    }

    @Override // java.util.Queue
    public Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        return add(obj);
    }

    @Override // java.util.Queue
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f27107a[this.f27108b];
    }

    @Override // java.util.Queue
    public Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        Object[] objArr = this.f27107a;
        int i8 = this.f27108b;
        Object obj = objArr[i8];
        if (obj != null) {
            int i9 = i8 + 1;
            this.f27108b = i9;
            objArr[i8] = null;
            if (i9 >= this.f27111e) {
                this.f27108b = 0;
            }
            this.f27110d = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i8 = this.f27109c;
        int i9 = this.f27108b;
        if (i8 < i9) {
            return (this.f27111e - i9) + i8;
        }
        if (i8 != i9) {
            return i8 - i9;
        }
        if (this.f27110d) {
            return this.f27111e;
        }
        return 0;
    }

    public C2495f(int i8) {
        this.f27108b = 0;
        this.f27109c = 0;
        this.f27110d = false;
        if (i8 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i8];
        this.f27107a = objArr;
        this.f27111e = objArr.length;
    }

    public C2495f(Collection<Object> collection) {
        this(collection.size());
        addAll(collection);
    }
}
