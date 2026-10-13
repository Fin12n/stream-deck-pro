package p044e7;

import C6.G;
import G6.g;
import G6.h;
import H6.c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.J;
import p035d7.d;
import p035d7.v;
import p035d7.x;
import p053f7.e;

/* JADX INFO: renamed from: e7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2257c extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20979f = AtomicIntegerFieldUpdater.newUpdater(C2257c.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f20980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20981e;

    public /* synthetic */ C2257c(x xVar, boolean z8, g gVar, int i8, d dVar, int i9, AbstractC2633k abstractC2633k) {
        this(xVar, z8, (i9 & 4) != 0 ? h.f2820a : gVar, (i9 & 8) != 0 ? -3 : i8, (i9 & 16) != 0 ? d.SUSPEND : dVar);
    }

    @Override // p053f7.e, p044e7.InterfaceC2260f
    public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
        if (this.f22274b != -3) {
            Object objCollect = super.collect(interfaceC2261g, dVar);
            return objCollect == c.f() ? objCollect : G.f1419a;
        }
        o();
        Object objC = AbstractC2264j.c(interfaceC2261g, this.f20980d, this.f20981e, dVar);
        return objC == c.f() ? objC : G.f1419a;
    }

    @Override // p053f7.e
    public String f() {
        return "channel=" + this.f20980d;
    }

    @Override // p053f7.e
    public Object h(v vVar, G6.d dVar) {
        Object objC = AbstractC2264j.c(new p053f7.x(vVar), this.f20980d, this.f20981e, dVar);
        return objC == c.f() ? objC : G.f1419a;
    }

    @Override // p053f7.e
    public e i(g gVar, int i8, d dVar) {
        return new C2257c(this.f20980d, this.f20981e, gVar, i8, dVar);
    }

    @Override // p053f7.e
    public InterfaceC2260f j() {
        return new C2257c(this.f20980d, this.f20981e, null, 0, null, 28, null);
    }

    @Override // p053f7.e
    public x m(J j8) {
        o();
        return this.f22274b == -3 ? this.f20980d : super.m(j8);
    }

    public final void o() {
        if (this.f20981e && f20979f.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    public C2257c(x xVar, boolean z8, g gVar, int i8, d dVar) {
        super(gVar, i8, dVar);
        this.f20980d = xVar;
        this.f20981e = z8;
        this.consumed$volatile = 0;
    }
}
