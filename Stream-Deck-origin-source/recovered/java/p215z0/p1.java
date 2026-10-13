package p215z0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38895a = new ArrayList();

    public final void a() {
        this.f38895a.clear();
    }

    public final int b() {
        return this.f38895a.size();
    }

    public final boolean c() {
        return this.f38895a.isEmpty();
    }

    public final boolean d() {
        return !c();
    }

    public final Object e() {
        return this.f38895a.get(b() - 1);
    }

    public final Object f(int i8) {
        return this.f38895a.get(i8);
    }

    public final Object g() {
        return this.f38895a.remove(b() - 1);
    }

    public final boolean h(Object obj) {
        return this.f38895a.add(obj);
    }

    public final Object[] i() {
        int size = this.f38895a.size();
        Object[] objArr = new Object[size];
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i8] = this.f38895a.get(i8);
        }
        return objArr;
    }
}
