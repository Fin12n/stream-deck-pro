package p191w0;

import p037e0.InterfaceC2213i;
import p073i0.b;
import p073i0.d;
import p073i0.g;
import p073i0.j;
import p073i0.p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f35277a = new G();

    public final InterfaceC2213i a(j jVar) {
        if ((jVar instanceof p) || (jVar instanceof b) || (jVar instanceof g) || (jVar instanceof d)) {
            return H.f35279b;
        }
        return null;
    }

    public final InterfaceC2213i b(j jVar) {
        if (!(jVar instanceof p) && !(jVar instanceof b)) {
            if (jVar instanceof g) {
                return H.f35281d;
            }
            if (jVar instanceof d) {
                return H.f35280c;
            }
            return null;
        }
        return H.f35280c;
    }
}
