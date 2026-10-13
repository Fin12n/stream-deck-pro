package p053f7;

import C6.G;
import G6.d;
import H6.c;
import p035d7.y;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements InterfaceC2261g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f22352a;

    public x(y yVar) {
        this.f22352a = yVar;
    }

    @Override // p044e7.InterfaceC2261g
    public Object emit(Object obj, d dVar) {
        Object objI = this.f22352a.i(obj, dVar);
        return objI == c.f() ? objI : G.f1419a;
    }
}
