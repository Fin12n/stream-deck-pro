package M4;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class F implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5532a;

    public F(Context context, E e8) {
        ArrayList arrayList = new ArrayList();
        this.f5532a = arrayList;
        if (e8.c()) {
            arrayList.add(new N(context, e8));
        }
    }
}
