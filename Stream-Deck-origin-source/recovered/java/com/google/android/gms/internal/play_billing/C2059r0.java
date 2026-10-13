package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2059r0 extends C implements RandomAccess, InterfaceC2072v0, InterfaceC2001c1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2059r0 f19005d = new C2059r0(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f19006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19007c;

    public C2059r0(int[] iArr, int i8, boolean z8) {
        super(z8);
        this.f19006b = iArr;
        this.f19007c = i8;
    }

    public static C2059r0 o() {
        return f19005d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i8 < 0 || i8 > (i9 = this.f19007c)) {
            throw new IndexOutOfBoundsException(t(i8));
        }
        int i10 = i8 + 1;
        int[] iArr = this.f19006b;
        if (i9 < iArr.length) {
            System.arraycopy(iArr, i8, iArr, i10, i9 - i8);
        } else {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            System.arraycopy(this.f19006b, i8, iArr2, i10, this.f19007c - i8);
            this.f19006b = iArr2;
        }
        this.f19006b[i8] = iIntValue;
        this.f19007c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = AbstractC2081y0.f19031a;
        collection.getClass();
        if (!(collection instanceof C2059r0)) {
            return super.addAll(collection);
        }
        C2059r0 c2059r0 = (C2059r0) collection;
        int i8 = c2059r0.f19007c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f19007c;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        int[] iArr = this.f19006b;
        if (i10 > iArr.length) {
            this.f19006b = Arrays.copyOf(iArr, i10);
        }
        System.arraycopy(c2059r0.f19006b, 0, this.f19006b, this.f19007c, c2059r0.f19007c);
        this.f19007c = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2078x0
    public final /* bridge */ /* synthetic */ InterfaceC2078x0 b(int i8) {
        if (i8 >= this.f19007c) {
            return new C2059r0(Arrays.copyOf(this.f19006b, i8), this.f19007c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2059r0)) {
            return super.equals(obj);
        }
        C2059r0 c2059r0 = (C2059r0) obj;
        if (this.f19007c != c2059r0.f19007c) {
            return false;
        }
        int[] iArr = c2059r0.f19006b;
        for (int i8 = 0; i8 < this.f19007c; i8++) {
            if (this.f19006b[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        u(i8);
        return Integer.valueOf(this.f19006b[i8]);
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f19007c; i9++) {
            i8 = (i8 * 31) + this.f19006b[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i8 = this.f19007c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f19006b[i9] == iIntValue) {
                return i9;
            }
        }
        return -1;
    }

    public final int m(int i8) {
        u(i8);
        return this.f19006b[i8];
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        c();
        u(i8);
        int[] iArr = this.f19006b;
        int i9 = iArr[i8];
        int i10 = this.f19007c;
        if (i8 < i10 - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (i10 - i8) - 1);
        }
        this.f19007c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i8, int i9) {
        c();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f19006b;
        System.arraycopy(iArr, i9, iArr, i8, this.f19007c - i9);
        this.f19007c -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    public final void s(int i8) {
        c();
        int i9 = this.f19007c;
        int[] iArr = this.f19006b;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.f19006b = iArr2;
        }
        int[] iArr3 = this.f19006b;
        int i10 = this.f19007c;
        this.f19007c = i10 + 1;
        iArr3[i10] = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        u(i8);
        int[] iArr = this.f19006b;
        int i9 = iArr[i8];
        iArr[i8] = iIntValue;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19007c;
    }

    public final String t(int i8) {
        return "Index:" + i8 + ", Size:" + this.f19007c;
    }

    public final void u(int i8) {
        if (i8 < 0 || i8 >= this.f19007c) {
            throw new IndexOutOfBoundsException(t(i8));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        s(((Integer) obj).intValue());
        return true;
    }
}
