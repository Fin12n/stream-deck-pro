package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2043n extends AbstractC2015g implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AbstractC2027j f18988b;

    public AbstractC2027j D() {
        Object[] array = toArray();
        AbstractC2077x abstractC2077x = AbstractC2027j.f18915b;
        return AbstractC2027j.E(array, array.length);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC2071v.a(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2015g
    public AbstractC2027j y() {
        AbstractC2027j abstractC2027j = this.f18988b;
        if (abstractC2027j != null) {
            return abstractC2027j;
        }
        AbstractC2027j abstractC2027jD = D();
        this.f18988b = abstractC2027jD;
        return abstractC2027jD;
    }
}
