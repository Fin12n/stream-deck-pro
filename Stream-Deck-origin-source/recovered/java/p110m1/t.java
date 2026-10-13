package p110m1;

import C6.InterfaceC0919h;
import Q6.o;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class t extends u implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f29612a = new t();

    public t() {
        super(2);
    }

    @Override // Q6.o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a invoke(a aVar, a aVar2) {
        String strB;
        InterfaceC0919h interfaceC0919hA;
        if (aVar == null || (strB = aVar.b()) == null) {
            strB = aVar2.b();
        }
        if (aVar == null || (interfaceC0919hA = aVar.a()) == null) {
            interfaceC0919hA = aVar2.a();
        }
        return new a(strB, interfaceC0919hA);
    }
}
