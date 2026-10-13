package p053f7;

import C6.G;
import G6.g;
import H6.c;
import kotlin.jvm.internal.AbstractC2633k;
import p035d7.d;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends g {
    public /* synthetic */ h(InterfaceC2260f interfaceC2260f, g gVar, int i8, d dVar, int i9, AbstractC2633k abstractC2633k) {
        this(interfaceC2260f, (i9 & 2) != 0 ? G6.h.f2820a : gVar, (i9 & 4) != 0 ? -3 : i8, (i9 & 8) != 0 ? d.SUSPEND : dVar);
    }

    @Override // p053f7.e
    public e i(g gVar, int i8, d dVar) {
        return new h(this.f22283d, gVar, i8, dVar);
    }

    @Override // p053f7.e
    public InterfaceC2260f j() {
        return this.f22283d;
    }

    @Override // p053f7.g
    public Object q(InterfaceC2261g interfaceC2261g, G6.d dVar) {
        Object objCollect = this.f22283d.collect(interfaceC2261g, dVar);
        return objCollect == c.f() ? objCollect : G.f1419a;
    }

    public h(InterfaceC2260f interfaceC2260f, g gVar, int i8, d dVar) {
        super(interfaceC2260f, gVar, i8, dVar);
    }
}
