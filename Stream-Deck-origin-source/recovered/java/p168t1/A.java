package p168t1;

import android.graphics.Typeface;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public static final Object a(int i8, Object obj, InterfaceC3008m interfaceC3008m, C c8, int i9) {
        boolean z8;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z9 = false;
        if (!z.k(i8) || t.c(interfaceC3008m.b(), c8)) {
            z8 = false;
        } else {
            C.a aVar = C.f33980b;
            if (c8.compareTo(AbstractC3001f.a(aVar)) < 0 || interfaceC3008m.b().compareTo(AbstractC3001f.a(aVar)) >= 0) {
                z8 = false;
            } else {
                z8 = true;
            }
        }
        if (z.j(i8) && !y.f(i9, interfaceC3008m.c())) {
            z9 = true;
        }
        if (z9 || z8) {
            return Q.f34015a.a((Typeface) obj, z8 ? c8.s() : interfaceC3008m.b().s(), z9 ? y.f(i9, y.f34112b.a()) : y.f(interfaceC3008m.c(), y.f34112b.a()));
        }
        return obj;
    }
}
