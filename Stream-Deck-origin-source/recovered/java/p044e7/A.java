package p044e7;

import C6.G;
import G6.d;
import H6.c;
import Q6.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A extends AbstractC2255a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f20896a;

    public A(o oVar) {
        this.f20896a = oVar;
    }

    @Override // p044e7.AbstractC2255a
    public Object f(InterfaceC2261g interfaceC2261g, d dVar) {
        Object objInvoke = this.f20896a.invoke(interfaceC2261g, dVar);
        return objInvoke == c.f() ? objInvoke : G.f1419a;
    }
}
