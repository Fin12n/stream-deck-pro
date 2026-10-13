package kotlin.jvm.internal;

import io.sentry.exception.uXy.SZCvugJaXc;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f28780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X6.d[] f28781b;

    static {
        L l8 = null;
        try {
            l8 = (L) Class.forName(SZCvugJaXc.PNLTrp).newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (l8 == null) {
            l8 = new L();
        }
        f28780a = l8;
        f28781b = new X6.d[0];
    }

    public static X6.h a(C2638p c2638p) {
        return f28780a.a(c2638p);
    }

    public static X6.d b(Class cls) {
        return f28780a.b(cls);
    }

    public static X6.g c(Class cls) {
        return f28780a.c(cls, "");
    }

    public static X6.i d(w wVar) {
        return f28780a.d(wVar);
    }

    public static X6.j e(A a8) {
        return f28780a.e(a8);
    }

    public static X6.k f(C c8) {
        return f28780a.f(c8);
    }

    public static String g(InterfaceC2637o interfaceC2637o) {
        return f28780a.g(interfaceC2637o);
    }

    public static String h(u uVar) {
        return f28780a.h(uVar);
    }

    public static X6.m i(Class cls) {
        return f28780a.i(b(cls), Collections.EMPTY_LIST, false);
    }

    public static X6.m j(Class cls, X6.n nVar) {
        return f28780a.i(b(cls), Collections.singletonList(nVar), false);
    }
}
