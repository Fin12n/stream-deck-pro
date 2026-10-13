package p109m0;

import Q6.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        k getKey();

        k getType();
    }

    public final Object i(int i8) {
        InterfaceC2666d.a aVar = j().get(i8);
        return ((a) aVar.c()).getType().invoke(Integer.valueOf(i8 - aVar.b()));
    }

    public abstract InterfaceC2666d j();

    public final int k() {
        return j().k();
    }

    public final Object l(int i8) {
        Object objInvoke;
        InterfaceC2666d.a aVar = j().get(i8);
        int iB = i8 - aVar.b();
        k key = ((a) aVar.c()).getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(iB))) == null) ? I.a(i8) : objInvoke;
    }
}
