package O4;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: O4.t5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1511t5 implements InterfaceC1491q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8465a;

    public C1511t5(Context context, AbstractC1504s5 abstractC1504s5) {
        ArrayList arrayList = new ArrayList();
        this.f8465a = arrayList;
        if (abstractC1504s5.c()) {
            arrayList.add(new D5(context, abstractC1504s5));
        }
    }

    @Override // O4.InterfaceC1491q5
    public final void a(InterfaceC1484p5 interfaceC1484p5) {
        Iterator it = this.f8465a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1491q5) it.next()).a(interfaceC1484p5);
        }
    }
}
