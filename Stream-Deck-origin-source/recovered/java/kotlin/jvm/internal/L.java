package kotlin.jvm.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class L {
    public X6.d b(Class cls) {
        return new C2631i(cls);
    }

    public X6.g c(Class cls, String str) {
        return new z(cls, str);
    }

    public String g(InterfaceC2637o interfaceC2637o) {
        String string = interfaceC2637o.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String h(u uVar) {
        return g(uVar);
    }

    public X6.m i(X6.f fVar, List list, boolean z8) {
        return new Q(fVar, list, z8);
    }

    public X6.h a(C2638p c2638p) {
        return c2638p;
    }

    public X6.i d(w wVar) {
        return wVar;
    }

    public X6.j e(A a8) {
        return a8;
    }

    public X6.k f(C c8) {
        return c8;
    }
}
