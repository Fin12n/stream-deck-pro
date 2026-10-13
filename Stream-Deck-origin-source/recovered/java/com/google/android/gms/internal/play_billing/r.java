package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC2043n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient AbstractC2039m f19002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f19003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f19004e;

    public r(AbstractC2039m abstractC2039m, Object[] objArr, int i8, int i9) {
        this.f19002c = abstractC2039m;
        this.f19003d = objArr;
        this.f19004e = i9;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2043n
    public final AbstractC2027j D() {
        return new C2055q(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public final int c(Object[] objArr, int i8) {
        return y().c(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f19002c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return y().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19004e;
    }
}
