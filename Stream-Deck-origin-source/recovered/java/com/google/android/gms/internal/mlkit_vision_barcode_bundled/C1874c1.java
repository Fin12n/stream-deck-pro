package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1874c1 extends AbstractC1972w0 implements RandomAccess, InterfaceC1939p1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1874c1 f18112d = new C1874c1(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f18113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18114c;

    public C1874c1(float[] fArr, int i8, boolean z8) {
        super(z8);
        this.f18113b = fArr;
        this.f18114c = i8;
    }

    public static C1874c1 o() {
        return f18112d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1939p1
    public final void B(float f8) {
        c();
        int i8 = this.f18114c;
        float[] fArr = this.f18113b;
        if (i8 == fArr.length) {
            float[] fArr2 = new float[((i8 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            this.f18113b = fArr2;
        }
        float[] fArr3 = this.f18113b;
        int i9 = this.f18114c;
        this.f18114c = i9 + 1;
        fArr3[i9] = f8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        float fFloatValue = ((Float) obj).floatValue();
        c();
        if (i8 < 0 || i8 > (i9 = this.f18114c)) {
            throw new IndexOutOfBoundsException(s(i8));
        }
        int i10 = i8 + 1;
        float[] fArr = this.f18113b;
        if (i9 < fArr.length) {
            System.arraycopy(fArr, i8, fArr, i10, i9 - i8);
        } else {
            float[] fArr2 = new float[((i9 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            System.arraycopy(this.f18113b, i8, fArr2, i10, this.f18114c - i8);
            this.f18113b = fArr2;
        }
        this.f18113b[i8] = fFloatValue;
        this.f18114c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1972w0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = AbstractC1953s1.f18650a;
        collection.getClass();
        if (!(collection instanceof C1874c1)) {
            return super.addAll(collection);
        }
        C1874c1 c1874c1 = (C1874c1) collection;
        int i8 = c1874c1.f18114c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f18114c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        float[] fArr = this.f18113b;
        if (i10 > fArr.length) {
            this.f18113b = Arrays.copyOf(fArr, i10);
        }
        System.arraycopy(c1874c1.f18113b, 0, this.f18113b, this.f18114c, c1874c1.f18114c);
        this.f18114c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1972w0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1874c1)) {
            return super.equals(obj);
        }
        C1874c1 c1874c1 = (C1874c1) obj;
        if (this.f18114c != c1874c1.f18114c) {
            return false;
        }
        float[] fArr = c1874c1.f18113b;
        for (int i8 = 0; i8 < this.f18114c; i8++) {
            if (Float.floatToIntBits(this.f18113b[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        t(i8);
        return Float.valueOf(this.f18113b[i8]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1972w0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i8 = 0; i8 < this.f18114c; i8++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f18113b[i8]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i8 = this.f18114c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f18113b[i9] == fFloatValue) {
                return i9;
            }
        }
        return -1;
    }

    public final float m(int i8) {
        t(i8);
        return this.f18113b[i8];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1972w0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        c();
        t(i8);
        float[] fArr = this.f18113b;
        float f8 = fArr[i8];
        int i9 = this.f18114c;
        if (i8 < i9 - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (i9 - i8) - 1);
        }
        this.f18114c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i8, int i9) {
        c();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f18113b;
        System.arraycopy(fArr, i9, fArr, i8, this.f18114c - i9);
        this.f18114c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    public final String s(int i8) {
        return "Index:" + i8 + ", Size:" + this.f18114c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        c();
        t(i8);
        float[] fArr = this.f18113b;
        float f8 = fArr[i8];
        fArr[i8] = fFloatValue;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18114c;
    }

    public final void t(int i8) {
        if (i8 < 0 || i8 >= this.f18114c) {
            throw new IndexOutOfBoundsException(s(i8));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1948r1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1939p1 b(int i8) {
        if (i8 >= this.f18114c) {
            return new C1874c1(Arrays.copyOf(this.f18113b, i8), this.f18114c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        B(((Float) obj).floatValue());
        return true;
    }
}
