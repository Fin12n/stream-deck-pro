package p044e7;

import C6.G;
import G6.g;
import G6.h;
import H6.c;
import Q6.o;
import kotlin.jvm.internal.AbstractC2633k;
import p035d7.d;
import p035d7.v;
import p053f7.e;

/* JADX INFO: renamed from: e7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2258d extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f20982d;

    public /* synthetic */ C2258d(o oVar, g gVar, int i8, d dVar, int i9, AbstractC2633k abstractC2633k) {
        this(oVar, (i9 & 2) != 0 ? h.f2820a : gVar, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? d.SUSPEND : dVar);
    }

    public static /* synthetic */ Object n(C2258d c2258d, v vVar, G6.d dVar) {
        Object objInvoke = c2258d.f20982d.invoke(vVar, dVar);
        return objInvoke == c.f() ? objInvoke : G.f1419a;
    }

    @Override // p053f7.e
    public Object h(v vVar, G6.d dVar) {
        return n(this, vVar, dVar);
    }

    @Override // p053f7.e
    public e i(g gVar, int i8, d dVar) {
        return new C2258d(this.f20982d, gVar, i8, dVar);
    }

    @Override // p053f7.e
    public String toString() {
        return "block[" + this.f20982d + "] -> " + super.toString();
    }

    public C2258d(o oVar, g gVar, int i8, d dVar) {
        super(gVar, i8, dVar);
        this.f20982d = oVar;
    }
}
