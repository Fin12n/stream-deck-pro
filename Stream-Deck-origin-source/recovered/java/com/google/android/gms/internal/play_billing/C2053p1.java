package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2053p1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18997a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f18999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC2067t1 f19000d;

    public /* synthetic */ C2053p1(AbstractC2067t1 abstractC2067t1, AbstractC2049o1 abstractC2049o1) {
        this.f19000d = abstractC2067t1;
    }

    public final Iterator b() {
        if (this.f18999c == null) {
            this.f18999c = this.f19000d.f19017c.entrySet().iterator();
        }
        return this.f18999c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f18997a + 1 >= this.f19000d.f19016b.size()) {
            return !this.f19000d.f19017c.isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f18998b = true;
        int i8 = this.f18997a + 1;
        this.f18997a = i8;
        return i8 < this.f19000d.f19016b.size() ? (Map.Entry) this.f19000d.f19016b.get(this.f18997a) : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f18998b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f18998b = false;
        this.f19000d.n();
        if (this.f18997a >= this.f19000d.f19016b.size()) {
            b().remove();
            return;
        }
        AbstractC2067t1 abstractC2067t1 = this.f19000d;
        int i8 = this.f18997a;
        this.f18997a = i8 - 1;
        abstractC2067t1.l(i8);
    }
}
