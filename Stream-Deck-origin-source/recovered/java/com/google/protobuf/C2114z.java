package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2114z extends AbstractC2090c implements A.g, RandomAccess, h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2114z f19499d = new C2114z(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f19500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19501c;

    public C2114z() {
        this(new int[10], 0, true);
    }

    public static C2114z t() {
        return f19499d;
    }

    private void u(int i8) {
        if (i8 < 0 || i8 >= this.f19501c) {
            throw new IndexOutOfBoundsException(z(i8));
        }
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i8) {
        c();
        u(i8);
        int[] iArr = this.f19500b;
        int i9 = iArr[i8];
        int i10 = this.f19501c;
        if (i8 < i10 - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (i10 - i8) - 1);
        }
        this.f19501c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Integer set(int i8, Integer num) {
        return Integer.valueOf(h(i8, num.intValue()));
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        c();
        A.a(collection);
        if (!(collection instanceof C2114z)) {
            return super.addAll(collection);
        }
        C2114z c2114z = (C2114z) collection;
        int i8 = c2114z.f19501c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f19501c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        int[] iArr = this.f19500b;
        if (i10 > iArr.length) {
            this.f19500b = Arrays.copyOf(iArr, i10);
        }
        System.arraycopy(c2114z.f19500b, 0, this.f19500b, this.f19501c, c2114z.f19501c);
        this.f19501c = i10;
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
        if (!(obj instanceof C2114z)) {
            return super.equals(obj);
        }
        C2114z c2114z = (C2114z) obj;
        if (this.f19501c != c2114z.f19501c) {
            return false;
        }
        int[] iArr = c2114z.f19500b;
        for (int i8 = 0; i8 < this.f19501c; i8++) {
            if (this.f19500b[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.A.g
    public int getInt(int i8) {
        u(i8);
        return this.f19500b[i8];
    }

    @Override // com.google.protobuf.A.g
    public int h(int i8, int i9) {
        c();
        u(i8);
        int[] iArr = this.f19500b;
        int i10 = iArr[i8];
        iArr[i8] = i9;
        return i10;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f19501c; i9++) {
            i8 = (i8 * 31) + this.f19500b[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f19500b[i8] == iIntValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.A.g
    public void l(int i8) {
        c();
        int i9 = this.f19501c;
        int[] iArr = this.f19500b;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.f19500b = iArr2;
        }
        int[] iArr3 = this.f19500b;
        int i10 = this.f19501c;
        this.f19501c = i10 + 1;
        iArr3[i10] = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void add(int i8, Integer num) {
        s(i8, num.intValue());
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        l(num.intValue());
        return true;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i8, int i9) {
        c();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f19500b;
        System.arraycopy(iArr, i9, iArr, i8, this.f19501c - i9);
        this.f19501c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    public final void s(int i8, int i9) {
        int i10;
        c();
        if (i8 < 0 || i8 > (i10 = this.f19501c)) {
            throw new IndexOutOfBoundsException(z(i8));
        }
        int[] iArr = this.f19500b;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i8, iArr, i8 + 1, i10 - i8);
        } else {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            System.arraycopy(this.f19500b, i8, iArr2, i8 + 1, this.f19501c - i8);
            this.f19500b = iArr2;
        }
        this.f19500b[i8] = i9;
        this.f19501c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19501c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Integer get(int i8) {
        return Integer.valueOf(getInt(i8));
    }

    public C2114z(int[] iArr, int i8, boolean z8) {
        super(z8);
        this.f19500b = iArr;
        this.f19501c = i8;
    }

    private String z(int i8) {
        return RaiWHuj.lFxvQpCt + i8 + ", Size:" + this.f19501c;
    }

    @Override // com.google.protobuf.A.j
    public A.g a(int i8) {
        if (i8 >= this.f19501c) {
            return new C2114z(Arrays.copyOf(this.f19500b, i8), this.f19501c, true);
        }
        throw new IllegalArgumentException();
    }
}
