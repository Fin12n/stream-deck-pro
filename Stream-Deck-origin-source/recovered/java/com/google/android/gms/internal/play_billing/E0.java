package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class E0 extends C implements RandomAccess, F0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E0 f18757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F0 f18758d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18759b;

    static {
        E0 e8 = new E0(false);
        f18757c = e8;
        f18758d = e8;
    }

    public E0() {
        this(10);
    }

    public static String o(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof S ? ((S) obj).I(AbstractC2081y0.f19032b) : AbstractC2081y0.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i8, Object obj) {
        c();
        this.f18759b.add(i8, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.AbstractList, java.util.List
    public final boolean addAll(int i8, Collection collection) {
        c();
        if (collection instanceof F0) {
            collection = ((F0) collection).d();
        }
        boolean zAddAll = this.f18759b.addAll(i8, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2078x0
    public final /* bridge */ /* synthetic */ InterfaceC2078x0 b(int i8) {
        if (i8 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i8);
        arrayList.addAll(this.f18759b);
        return new E0(arrayList);
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.f18759b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.F0
    public final List d() {
        return Collections.unmodifiableList(this.f18759b);
    }

    @Override // com.google.android.gms.internal.play_billing.F0
    public final F0 f() {
        return j() ? new B1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final String get(int i8) {
        Object obj = this.f18759b.get(i8);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof S) {
            S s8 = (S) obj;
            String strI = s8.I(AbstractC2081y0.f19032b);
            if (s8.E()) {
                this.f18759b.set(i8, strI);
            }
            return strI;
        }
        byte[] bArr = (byte[]) obj;
        String strD = AbstractC2081y0.d(bArr);
        if (L1.d(bArr)) {
            this.f18759b.set(i8, strD);
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.play_billing.F0
    public final Object n(int i8) {
        return this.f18759b.get(i8);
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        c();
        Object objRemove = this.f18759b.remove(i8);
        ((AbstractList) this).modCount++;
        return o(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        c();
        return o(this.f18759b.set(i8, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18759b.size();
    }

    public E0(int i8) {
        ArrayList arrayList = new ArrayList(i8);
        super(true);
        this.f18759b = arrayList;
    }

    public E0(ArrayList arrayList) {
        super(true);
        this.f18759b = arrayList;
    }

    public E0(boolean z8) {
        super(false);
        this.f18759b = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
