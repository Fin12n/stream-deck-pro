package V;

import android.hardware.camera2.params.SessionConfiguration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10252a;

    public a(List list) {
        this.f10252a = list;
    }

    @Override // V.d
    public d.a a(SessionConfiguration sessionConfiguration) {
        Iterator it = this.f10252a.iterator();
        while (it.hasNext()) {
            d.a aVarA = ((d) it.next()).a(sessionConfiguration);
            if (aVarA.a() != 0) {
                return aVarA;
            }
        }
        return new d.a(0, 0, 0L);
    }
}
