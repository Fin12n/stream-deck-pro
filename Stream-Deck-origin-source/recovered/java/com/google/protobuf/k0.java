package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends AbstractC2090c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0 f19355d = new k0(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f19356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19357c;

    public k0(Object[] objArr, int i8, boolean z8) {
        super(z8);
        this.f19356b = objArr;
        this.f19357c = i8;
    }

    public static Object[] m(int i8) {
        return new Object[i8];
    }

    public static k0 o() {
        return f19355d;
    }

    private void s(int i8) {
        if (i8 < 0 || i8 >= this.f19357c) {
            throw new IndexOutOfBoundsException(t(i8));
        }
    }

    private String t(int i8) {
        return "Index:" + i8 + ", Size:" + this.f19357c;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        c();
        int i8 = this.f19357c;
        Object[] objArr = this.f19356b;
        if (i8 == objArr.length) {
            this.f19356b = Arrays.copyOf(objArr, ((i8 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f19356b;
        int i9 = this.f19357c;
        this.f19357c = i9 + 1;
        objArr2[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        s(i8);
        return this.f19356b[i8];
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.List
    public Object remove(int i8) {
        c();
        s(i8);
        Object[] objArr = this.f19356b;
        Object obj = objArr[i8];
        int i9 = this.f19357c;
        if (i8 < i9 - 1) {
            System.arraycopy(objArr, i8 + 1, objArr, i8, (i9 - i8) - 1);
        }
        this.f19357c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        c();
        s(i8);
        Object[] objArr = this.f19356b;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19357c;
    }

    @Override // com.google.protobuf.A.j
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public k0 a(int i8) {
        if (i8 >= this.f19357c) {
            return new k0(Arrays.copyOf(this.f19356b, i8), this.f19357c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        int i9;
        c();
        if (i8 >= 0 && i8 <= (i9 = this.f19357c)) {
            Object[] objArr = this.f19356b;
            if (i9 < objArr.length) {
                System.arraycopy(objArr, i8, objArr, i8 + 1, i9 - i8);
            } else {
                Object[] objArrM = m(((i9 * 3) / 2) + 1);
                System.arraycopy(this.f19356b, 0, objArrM, 0, i8);
                System.arraycopy(this.f19356b, i8, objArrM, i8 + 1, this.f19357c - i8);
                this.f19356b = objArrM;
            }
            this.f19356b[i8] = obj;
            this.f19357c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(t(i8));
    }
}
