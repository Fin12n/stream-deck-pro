package N4;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class T extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f6570a;

    public T(Z z8) {
        this.f6570a = z8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f6570a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapP = this.f6570a.p();
        if (mapP != null) {
            return mapP.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iD = this.f6570a.D(entry.getKey());
            if (iD != -1 && r.a(Z.n(this.f6570a, iD), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Z z8 = this.f6570a;
        Map mapP = z8.p();
        return mapP != null ? mapP.entrySet().iterator() : new Q(z8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapP = this.f6570a.p();
        if (mapP != null) {
            return mapP.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Z z8 = this.f6570a;
        if (z8.x()) {
            return false;
        }
        int iC = z8.C();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Z z9 = this.f6570a;
        int iB = AbstractC1075a0.b(key, value, iC, Z.l(z9), z9.a(), z9.b(), z9.c());
        if (iB == -1) {
            return false;
        }
        this.f6570a.w(iB, iC);
        this.f6570a.f6726f--;
        this.f6570a.t();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6570a.size();
    }
}
