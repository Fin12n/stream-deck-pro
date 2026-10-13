package p053f7;

import G6.d;
import G6.g;
import H6.b;
import H6.c;
import I6.a;
import I6.h;
import Q6.o;
import kotlin.jvm.internal.P;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p062g7.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final e b(InterfaceC2260f interfaceC2260f) {
        e eVar = interfaceC2260f instanceof e ? (e) interfaceC2260f : null;
        if (eVar == null) {
            return new h(interfaceC2260f, null, 0, null, 14, null);
        }
        return eVar;
    }

    public static final Object c(g gVar, Object obj, Object obj2, o oVar, d dVar) {
        Object objC = K.c(gVar, obj2);
        try {
            y yVar = new y(dVar, gVar);
            Object objD = !(oVar instanceof a) ? b.d(oVar, obj, yVar) : ((o) P.e(oVar, 2)).invoke(obj, yVar);
            K.a(gVar, objC);
            if (objD == c.f()) {
                h.c(dVar);
            }
            return objD;
        } catch (Throwable th) {
            K.a(gVar, objC);
            throw th;
        }
    }

    public static /* synthetic */ Object d(g gVar, Object obj, Object obj2, o oVar, d dVar, int i8, Object obj3) {
        if ((i8 & 4) != 0) {
            obj2 = K.b(gVar);
        }
        return c(gVar, obj, obj2, oVar, dVar);
    }

    public static final InterfaceC2261g e(InterfaceC2261g interfaceC2261g, g gVar) {
        return interfaceC2261g instanceof x ? true : interfaceC2261g instanceof s ? interfaceC2261g : new A(interfaceC2261g, gVar);
    }
}
