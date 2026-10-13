package N4;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class G9 implements D9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6287a;

    public G9(Context context, F9 f9) {
        ArrayList arrayList = new ArrayList();
        this.f6287a = arrayList;
        if (f9.c()) {
            arrayList.add(new V9(context, f9));
        }
    }

    @Override // N4.D9
    public final void a(C9 c9) {
        Iterator it = this.f6287a.iterator();
        while (it.hasNext()) {
            ((D9) it.next()).a(c9);
        }
    }
}
