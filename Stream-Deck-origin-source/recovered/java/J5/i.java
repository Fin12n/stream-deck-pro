package J5;

import X5.C1688q;
import X5.S;
import java.util.ArrayList;
import java.util.Set;
import p017b7.AbstractC1823z0;
import p017b7.I;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;
import p115m6.C2691a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f4338a = new I("call-context");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2691a f4339b = new C2691a("client-config");

    public static final Object b(b bVar, InterfaceC1815v0 interfaceC1815v0, G6.d dVar) {
        InterfaceC1818x interfaceC1818xA = AbstractC1823z0.a(interfaceC1815v0);
        G6.g gVarP1 = bVar.getCoroutineContext().P1(interfaceC1818xA).P1(f4338a);
        InterfaceC1815v0 interfaceC1815v1 = (InterfaceC1815v0) dVar.getContext().A(InterfaceC1815v0.f15985O);
        if (interfaceC1815v1 == null) {
            return gVarP1;
        }
        interfaceC1818xA.H0(new m(InterfaceC1815v0.a.d(interfaceC1815v1, true, false, new n(interfaceC1818xA), 2, null)));
        return gVarP1;
    }

    public static final C2691a c() {
        return f4339b;
    }

    public static final void d(T5.e eVar) {
        Set setNames = eVar.e().names();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setNames) {
            if (C1688q.f11910a.B().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new S(arrayList.toString());
        }
    }
}
