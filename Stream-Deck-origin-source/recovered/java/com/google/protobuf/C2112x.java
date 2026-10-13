package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2112x extends AbstractC2090c implements A.f, RandomAccess, h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2112x f19489d = new C2112x(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f19490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19491c;

    public C2112x() {
        this(new float[10], 0, true);
    }

    private String D(int i8) {
        return "Index:" + i8 + ", Size:" + this.f19491c;
    }

    public static C2112x u() {
        return f19489d;
    }

    private void y(int i8) {
        if (i8 < 0 || i8 >= this.f19491c) {
            throw new IndexOutOfBoundsException(D(i8));
        }
    }

    public float A(int i8) {
        y(i8);
        return this.f19490b[i8];
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Float remove(int i8) {
        c();
        y(i8);
        float[] fArr = this.f19490b;
        float f8 = fArr[i8];
        int i9 = this.f19491c;
        if (i8 < i9 - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (i9 - i8) - 1);
        }
        this.f19491c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Float set(int i8, Float f8) {
        return Float.valueOf(G(i8, f8.floatValue()));
    }

    public float G(int i8, float f8) {
        c();
        y(i8);
        float[] fArr = this.f19490b;
        float f9 = fArr[i8];
        fArr[i8] = f8;
        return f9;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        c();
        A.a(collection);
        if (!(collection instanceof C2112x)) {
            return super.addAll(collection);
        }
        C2112x c2112x = (C2112x) collection;
        int i8 = c2112x.f19491c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f19491c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        float[] fArr = this.f19490b;
        if (i10 > fArr.length) {
            this.f19490b = Arrays.copyOf(fArr, i10);
        }
        System.arraycopy(c2112x.f19490b, 0, this.f19490b, this.f19491c, c2112x.f19491c);
        this.f19491c = i10;
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
        if (!(obj instanceof C2112x)) {
            return super.equals(obj);
        }
        C2112x c2112x = (C2112x) obj;
        if (this.f19491c != c2112x.f19491c) {
            return false;
        }
        float[] fArr = c2112x.f19490b;
        for (int i8 = 0; i8 < this.f19491c; i8++) {
            if (Float.floatToIntBits(this.f19490b[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i8 = 0; i8 < this.f19491c; i8++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f19490b[i8]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f19490b[i8] == fFloatValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void add(int i8, Float f8) {
        t(i8, f8.floatValue());
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f8) {
        s(f8.floatValue());
        return true;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i8, int i9) {
        c();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f19490b;
        System.arraycopy(fArr, i9, fArr, i8, this.f19491c - i9);
        this.f19491c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    public void s(float f8) {
        c();
        int i8 = this.f19491c;
        float[] fArr = this.f19490b;
        if (i8 == fArr.length) {
            float[] fArr2 = new float[((i8 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            this.f19490b = fArr2;
        }
        float[] fArr3 = this.f19490b;
        int i9 = this.f19491c;
        this.f19491c = i9 + 1;
        fArr3[i9] = f8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19491c;
    }

    public final void t(int i8, float f8) {
        int i9;
        c();
        if (i8 < 0 || i8 > (i9 = this.f19491c)) {
            throw new IndexOutOfBoundsException(D(i8));
        }
        float[] fArr = this.f19490b;
        if (i9 < fArr.length) {
            System.arraycopy(fArr, i8, fArr, i8 + 1, i9 - i8);
        } else {
            float[] fArr2 = new float[((i9 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            System.arraycopy(this.f19490b, i8, fArr2, i8 + 1, this.f19491c - i8);
            this.f19490b = fArr2;
        }
        this.f19490b[i8] = f8;
        this.f19491c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Float get(int i8) {
        return Float.valueOf(A(i8));
    }

    public C2112x(float[] fArr, int i8, boolean z8) {
        super(z8);
        this.f19490b = fArr;
        this.f19491c = i8;
    }

    @Override // com.google.protobuf.A.j
    public A.f a(int i8) {
        if (i8 >= this.f19491c) {
            return new C2112x(Arrays.copyOf(this.f19490b, i8), this.f19491c, true);
        }
        throw new IllegalArgumentException();
    }
}
