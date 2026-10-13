package H;

import A.InterfaceC0896t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class D0 implements A.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2836b;

    public D0(int i8) {
        this.f2836b = i8;
    }

    @Override // A.r
    public List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0896t interfaceC0896t = (InterfaceC0896t) it.next();
            T1.f.b(interfaceC0896t instanceof I, "The camera info doesn't contain internal implementation.");
            if (interfaceC0896t.i() == this.f2836b) {
                arrayList.add(interfaceC0896t);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.f2836b;
    }
}
