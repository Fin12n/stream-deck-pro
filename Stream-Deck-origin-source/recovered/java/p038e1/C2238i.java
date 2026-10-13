package p038e1;

import java.util.Iterator;

/* JADX INFO: renamed from: e1.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2238i implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20494a;

    public C2238i(int i8) {
        this.f20494a = i8;
    }

    @Override // p038e1.k0
    public void a(k0.a aVar) {
        if (aVar.size() > this.f20494a) {
            Iterator it = aVar.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                it.next();
                i8++;
                if (i8 > this.f20494a) {
                    it.remove();
                }
            }
        }
    }

    @Override // p038e1.k0
    public boolean b(Object obj, Object obj2) {
        return true;
    }
}
