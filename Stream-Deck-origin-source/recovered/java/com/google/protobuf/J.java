package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class J extends AbstractC2090c implements A.i, RandomAccess, h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J f19198d = new J(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f19199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19200c;

    public J() {
        this(new long[10], 0, true);
    }

    private String D(int i8) {
        return "Index:" + i8 + ", Size:" + this.f19200c;
    }

    public static J u() {
        return f19198d;
    }

    private void y(int i8) {
        if (i8 < 0 || i8 >= this.f19200c) {
            throw new IndexOutOfBoundsException(D(i8));
        }
    }

    public long A(int i8) {
        y(i8);
        return this.f19199b[i8];
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Long remove(int i8) {
        c();
        y(i8);
        long[] jArr = this.f19199b;
        long j8 = jArr[i8];
        int i9 = this.f19200c;
        if (i8 < i9 - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (i9 - i8) - 1);
        }
        this.f19200c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Long set(int i8, Long l8) {
        return Long.valueOf(G(i8, l8.longValue()));
    }

    public long G(int i8, long j8) {
        c();
        y(i8);
        long[] jArr = this.f19199b;
        long j9 = jArr[i8];
        jArr[i8] = j8;
        return j9;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        c();
        A.a(collection);
        if (!(collection instanceof J)) {
            return super.addAll(collection);
        }
        J j8 = (J) collection;
        int i8 = j8.f19200c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f19200c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        long[] jArr = this.f19199b;
        if (i10 > jArr.length) {
            this.f19199b = Arrays.copyOf(jArr, i10);
        }
        System.arraycopy(j8.f19199b, 0, this.f19199b, this.f19200c, j8.f19200c);
        this.f19200c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return super.equals(obj);
        }
        J j8 = (J) obj;
        if (this.f19200c != j8.f19200c) {
            return false;
        }
        long[] jArr = j8.f19199b;
        for (int i8 = 0; i8 < this.f19200c; i8++) {
            if (this.f19199b[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i8 = 0; i8 < this.f19200c; i8++) {
            iF = (iF * 31) + A.f(this.f19199b[i8]);
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f19199b[i8] == jLongValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void add(int i8, Long l8) {
        s(i8, l8.longValue());
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l8) {
        t(l8.longValue());
        return true;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i8, int i9) {
        c();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f19199b;
        System.arraycopy(jArr, i9, jArr, i8, this.f19200c - i9);
        this.f19200c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    public final void s(int i8, long j8) {
        int i9;
        c();
        if (i8 < 0 || i8 > (i9 = this.f19200c)) {
            throw new IndexOutOfBoundsException(D(i8));
        }
        long[] jArr = this.f19199b;
        if (i9 < jArr.length) {
            System.arraycopy(jArr, i8, jArr, i8 + 1, i9 - i8);
        } else {
            long[] jArr2 = new long[((i9 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            System.arraycopy(this.f19199b, i8, jArr2, i8 + 1, this.f19200c - i8);
            this.f19199b = jArr2;
        }
        this.f19199b[i8] = j8;
        this.f19200c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19200c;
    }

    public void t(long j8) {
        c();
        int i8 = this.f19200c;
        long[] jArr = this.f19199b;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[((i8 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            this.f19199b = jArr2;
        }
        long[] jArr3 = this.f19199b;
        int i9 = this.f19200c;
        this.f19200c = i9 + 1;
        jArr3[i9] = j8;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Long get(int i8) {
        return Long.valueOf(A(i8));
    }

    public J(long[] jArr, int i8, boolean z8) {
        super(z8);
        this.f19199b = jArr;
        this.f19200c = i8;
    }

    @Override // com.google.protobuf.A.j
    public A.i a(int i8) {
        if (i8 >= this.f19200c) {
            return new J(Arrays.copyOf(this.f19199b, i8), this.f19200c, true);
        }
        throw new IllegalArgumentException();
    }
}
