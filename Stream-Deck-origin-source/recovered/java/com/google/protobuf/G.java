package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class G extends AbstractC2090c implements H, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G f19167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H f19168d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19169b;

    static {
        G g8 = new G(false);
        f19167c = g8;
        f19168d = g8;
    }

    public G() {
        this(10);
    }

    public static String o(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof AbstractC2097h ? ((AbstractC2097h) obj).T() : A.j((byte[]) obj);
    }

    @Override // com.google.protobuf.AbstractC2090c, com.google.protobuf.A.j
    public /* bridge */ /* synthetic */ boolean C() {
        return super.C();
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        this.f19169b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.H
    public void k(AbstractC2097h abstractC2097h) {
        c();
        this.f19169b.add(abstractC2097h);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void add(int i8, String str) {
        c();
        this.f19169b.add(i8, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.H
    public List r() {
        return Collections.unmodifiableList(this.f19169b);
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public String get(int i8) {
        Object obj = this.f19169b.get(i8);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2097h) {
            AbstractC2097h abstractC2097h = (AbstractC2097h) obj;
            String strT = abstractC2097h.T();
            if (abstractC2097h.I()) {
                this.f19169b.set(i8, strT);
            }
            return strT;
        }
        byte[] bArr = (byte[]) obj;
        String strJ = A.j(bArr);
        if (A.g(bArr)) {
            this.f19169b.set(i8, strJ);
        }
        return strJ;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19169b.size();
    }

    @Override // com.google.protobuf.A.j
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public G a(int i8) {
        if (i8 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i8);
        arrayList.addAll(this.f19169b);
        return new G(arrayList);
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public String remove(int i8) {
        c();
        Object objRemove = this.f19169b.remove(i8);
        ((AbstractList) this).modCount++;
        return o(objRemove);
    }

    @Override // com.google.protobuf.H
    public H v() {
        return C() ? new y0(this) : this;
    }

    @Override // com.google.protobuf.H
    public Object x(int i8) {
        return this.f19169b.get(i8);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public String set(int i8, String str) {
        c();
        return o(this.f19169b.set(i8, str));
    }

    public G(boolean z8) {
        super(z8);
        this.f19169b = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection collection) {
        c();
        if (collection instanceof H) {
            collection = ((H) collection).r();
        }
        boolean zAddAll = this.f19169b.addAll(i8, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.AbstractC2090c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public G(int i8) {
        this(new ArrayList(i8));
    }

    public G(H h8) {
        this.f19169b = new ArrayList(h8.size());
        addAll(h8);
    }

    public G(List<String> list) {
        this(new ArrayList(list));
    }

    public G(ArrayList arrayList) {
        this.f19169b = arrayList;
    }
}
