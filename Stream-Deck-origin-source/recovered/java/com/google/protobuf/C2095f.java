package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2095f extends AbstractC2090c implements A.a, RandomAccess, h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2095f f19282d = new C2095f(new boolean[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f19283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19284c;

    public C2095f() {
        this(new boolean[10], 0, true);
    }

    public static C2095f u() {
        return f19282d;
    }

    public boolean A(int i8) {
        y(i8);
        return this.f19283b[i8];
    }

    public final String D(int i8) {
        return "Index:" + i8 + ", Size:" + this.f19284c;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i8) {
        c();
        y(i8);
        boolean[] zArr = this.f19283b;
        boolean z8 = zArr[i8];
        int i9 = this.f19284c;
        if (i8 < i9 - 1) {
            System.arraycopy(zArr, i8 + 1, zArr, i8, (i9 - i8) - 1);
        }
        this.f19284c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z8);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i8, Boolean bool) {
        return Boolean.valueOf(G(i8, bool.booleanValue()));
    }

    public boolean G(int i8, boolean z8) {
        c();
        y(i8);
        boolean[] zArr = this.f19283b;
        boolean z9 = zArr[i8];
        zArr[i8] = z8;
        return z9;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        c();
        A.a(collection);
        if (!(collection instanceof C2095f)) {
            return super.addAll(collection);
        }
        C2095f c2095f = (C2095f) collection;
        int i8 = c2095f.f19284c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f19284c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        boolean[] zArr = this.f19283b;
        if (i10 > zArr.length) {
            this.f19283b = Arrays.copyOf(zArr, i10);
        }
        System.arraycopy(c2095f.f19283b, 0, this.f19283b, this.f19284c, c2095f.f19284c);
        this.f19284c = i10;
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
        if (!(obj instanceof C2095f)) {
            return super.equals(obj);
        }
        C2095f c2095f = (C2095f) obj;
        if (this.f19284c != c2095f.f19284c) {
            return false;
        }
        boolean[] zArr = c2095f.f19283b;
        for (int i8 = 0; i8 < this.f19284c; i8++) {
            if (this.f19283b[i8] != zArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iC = 1;
        for (int i8 = 0; i8 < this.f19284c; i8++) {
            iC = (iC * 31) + A.c(this.f19283b[i8]);
        }
        return iC;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f19283b[i8] == zBooleanValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void add(int i8, Boolean bool) {
        s(i8, bool.booleanValue());
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        t(bool.booleanValue());
        return true;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i8, int i9) {
        c();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f19283b;
        System.arraycopy(zArr, i9, zArr, i8, this.f19284c - i9);
        this.f19284c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    public final void s(int i8, boolean z8) {
        int i9;
        c();
        if (i8 < 0 || i8 > (i9 = this.f19284c)) {
            throw new IndexOutOfBoundsException(D(i8));
        }
        boolean[] zArr = this.f19283b;
        if (i9 < zArr.length) {
            System.arraycopy(zArr, i8, zArr, i8 + 1, i9 - i8);
        } else {
            boolean[] zArr2 = new boolean[((i9 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            System.arraycopy(this.f19283b, i8, zArr2, i8 + 1, this.f19284c - i8);
            this.f19283b = zArr2;
        }
        this.f19283b[i8] = z8;
        this.f19284c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19284c;
    }

    public void t(boolean z8) {
        c();
        int i8 = this.f19284c;
        boolean[] zArr = this.f19283b;
        if (i8 == zArr.length) {
            boolean[] zArr2 = new boolean[((i8 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            this.f19283b = zArr2;
        }
        boolean[] zArr3 = this.f19283b;
        int i9 = this.f19284c;
        this.f19284c = i9 + 1;
        zArr3[i9] = z8;
    }

    public final void y(int i8) {
        if (i8 < 0 || i8 >= this.f19284c) {
            throw new IndexOutOfBoundsException(D(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i8) {
        return Boolean.valueOf(A(i8));
    }

    public C2095f(boolean[] zArr, int i8, boolean z8) {
        super(z8);
        this.f19283b = zArr;
        this.f19284c = i8;
    }

    @Override // com.google.protobuf.A.j
    public A.a a(int i8) {
        if (i8 >= this.f19284c) {
            return new C2095f(Arrays.copyOf(this.f19283b, i8), this.f19284c, true);
        }
        throw new IllegalArgumentException();
    }
}
