package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2009e1 extends C implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2009e1 f18889d = new C2009e1(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f18890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18891c;

    public C2009e1(Object[] objArr, int i8, boolean z8) {
        super(z8);
        this.f18890b = objArr;
        this.f18891c = i8;
    }

    public static C2009e1 m() {
        return f18889d;
    }

    private final void s(int i8) {
        if (i8 < 0 || i8 >= this.f18891c) {
            throw new IndexOutOfBoundsException(o(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i8, Object obj) {
        int i9;
        c();
        if (i8 < 0 || i8 > (i9 = this.f18891c)) {
            throw new IndexOutOfBoundsException(o(i8));
        }
        int i10 = i8 + 1;
        Object[] objArr = this.f18890b;
        if (i9 < objArr.length) {
            System.arraycopy(objArr, i8, objArr, i10, i9 - i8);
        } else {
            Object[] objArr2 = new Object[((i9 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i8);
            System.arraycopy(this.f18890b, i8, objArr2, i10, this.f18891c - i8);
            this.f18890b = objArr2;
        }
        this.f18890b[i8] = obj;
        this.f18891c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2078x0
    public final /* bridge */ /* synthetic */ InterfaceC2078x0 b(int i8) {
        if (i8 >= this.f18891c) {
            return new C2009e1(Arrays.copyOf(this.f18890b, i8), this.f18891c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        s(i8);
        return this.f18890b[i8];
    }

    public final String o(int i8) {
        return "Index:" + i8 + ", Size:" + this.f18891c;
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.AbstractList, java.util.List
    public final Object remove(int i8) {
        c();
        s(i8);
        Object[] objArr = this.f18890b;
        Object obj = objArr[i8];
        int i9 = this.f18891c;
        if (i8 < i9 - 1) {
            System.arraycopy(objArr, i8 + 1, objArr, i8, (i9 - i8) - 1);
        }
        this.f18891c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i8, Object obj) {
        c();
        s(i8);
        Object[] objArr = this.f18890b;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18891c;
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i8 = this.f18891c;
        Object[] objArr = this.f18890b;
        if (i8 == objArr.length) {
            this.f18890b = Arrays.copyOf(objArr, ((i8 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f18890b;
        int i9 = this.f18891c;
        this.f18891c = i9 + 1;
        objArr2[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
