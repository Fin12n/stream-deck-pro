package p011b1;

import A1.d;
import Q6.o;
import p065h1.R0;

/* JADX INFO: renamed from: b1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1755c extends d {
    static /* synthetic */ Object r1(InterfaceC1755c interfaceC1755c, EnumC1768p enumC1768p, G6.d dVar, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i8 & 1) != 0) {
            enumC1768p = EnumC1768p.Main;
        }
        return interfaceC1755c.e1(enumC1768p, dVar);
    }

    C1766n E();

    long M0();

    long a();

    Object e1(EnumC1768p enumC1768p, G6.d dVar);

    R0 getViewConfiguration();

    Object l0(long j8, o oVar, G6.d dVar);

    Object x1(long j8, o oVar, G6.d dVar);
}
