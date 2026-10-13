package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2102m extends AbstractC2090c implements A.b, RandomAccess, h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2102m f19364d = new C2102m(new double[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f19365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19366c;

    public C2102m() {
        this(new double[10], 0, true);
    }

    private String D(int i8) {
        return "Index:" + i8 + ", Size:" + this.f19366c;
    }

    public static C2102m u() {
        return f19364d;
    }

    private void y(int i8) {
        if (i8 < 0 || i8 >= this.f19366c) {
            throw new IndexOutOfBoundsException(D(i8));
        }
    }

    public double A(int i8) {
        y(i8);
        return this.f19365b[i8];
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Double remove(int i8) {
        c();
        y(i8);
        double[] dArr = this.f19365b;
        double d8 = dArr[i8];
        int i9 = this.f19366c;
        if (i8 < i9 - 1) {
            System.arraycopy(dArr, i8 + 1, dArr, i8, (i9 - i8) - 1);
        }
        this.f19366c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d8);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Double set(int i8, Double d8) {
        return Double.valueOf(G(i8, d8.doubleValue()));
    }

    public double G(int i8, double d8) {
        c();
        y(i8);
        double[] dArr = this.f19365b;
        double d9 = dArr[i8];
        dArr[i8] = d8;
        return d9;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        c();
        A.a(collection);
        if (!(collection instanceof C2102m)) {
            return super.addAll(collection);
        }
        C2102m c2102m = (C2102m) collection;
        int i8 = c2102m.f19366c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f19366c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        double[] dArr = this.f19365b;
        if (i10 > dArr.length) {
            this.f19365b = Arrays.copyOf(dArr, i10);
        }
        System.arraycopy(c2102m.f19365b, 0, this.f19365b, this.f19366c, c2102m.f19366c);
        this.f19366c = i10;
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
        if (!(obj instanceof C2102m)) {
            return super.equals(obj);
        }
        C2102m c2102m = (C2102m) obj;
        if (this.f19366c != c2102m.f19366c) {
            return false;
        }
        double[] dArr = c2102m.f19365b;
        for (int i8 = 0; i8 < this.f19366c; i8++) {
            if (Double.doubleToLongBits(this.f19365b[i8]) != Double.doubleToLongBits(dArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i8 = 0; i8 < this.f19366c; i8++) {
            iF = (iF * 31) + A.f(Double.doubleToLongBits(this.f19365b[i8]));
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f19365b[i8] == dDoubleValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void add(int i8, Double d8) {
        t(i8, d8.doubleValue());
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d8) {
        s(d8.doubleValue());
        return true;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i8, int i9) {
        c();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f19365b;
        System.arraycopy(dArr, i9, dArr, i8, this.f19366c - i9);
        this.f19366c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    public void s(double d8) {
        c();
        int i8 = this.f19366c;
        double[] dArr = this.f19365b;
        if (i8 == dArr.length) {
            double[] dArr2 = new double[((i8 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            this.f19365b = dArr2;
        }
        double[] dArr3 = this.f19365b;
        int i9 = this.f19366c;
        this.f19366c = i9 + 1;
        dArr3[i9] = d8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19366c;
    }

    public final void t(int i8, double d8) {
        int i9;
        c();
        if (i8 < 0 || i8 > (i9 = this.f19366c)) {
            throw new IndexOutOfBoundsException(D(i8));
        }
        double[] dArr = this.f19365b;
        if (i9 < dArr.length) {
            System.arraycopy(dArr, i8, dArr, i8 + 1, i9 - i8);
        } else {
            double[] dArr2 = new double[((i9 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            System.arraycopy(this.f19365b, i8, dArr2, i8 + 1, this.f19366c - i8);
            this.f19365b = dArr2;
        }
        this.f19365b[i8] = d8;
        this.f19366c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Double get(int i8) {
        return Double.valueOf(A(i8));
    }

    public C2102m(double[] dArr, int i8, boolean z8) {
        super(z8);
        this.f19365b = dArr;
        this.f19366c = i8;
    }

    @Override // com.google.protobuf.A.j
    public A.b a(int i8) {
        if (i8 >= this.f19366c) {
            return new C2102m(Arrays.copyOf(this.f19365b, i8), this.f19366c, true);
        }
        throw new IllegalArgumentException();
    }
}
