package V4;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f10702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f10703c;

    public p(s sVar, IBinder iBinder) {
        this.f10703c = sVar;
        this.f10702b = iBinder;
    }

    @Override // V4.j
    public final void a() {
        this.f10703c.f10705a.f10719m = e.c(this.f10702b);
        t.n(this.f10703c.f10705a);
        this.f10703c.f10705a.f10713g = false;
        Iterator it = this.f10703c.f10705a.f10710d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f10703c.f10705a.f10710d.clear();
    }
}
