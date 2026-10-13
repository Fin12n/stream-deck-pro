package androidx.compose.ui.draw;

import L0.c;
import Q0.l;
import R0.C1600m0;
import kotlin.jvm.internal.t;
import p038e1.InterfaceC2235f;
import p043e6.dT.GIGvBf;
import p056g1.D;
import p056g1.U;
import p056g1.r;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
final class PainterElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f14564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2235f f14565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1600m0 f14567f;
    private final U0.b painter;

    public PainterElement(U0.b bVar, boolean z8, c cVar, InterfaceC2235f interfaceC2235f, float f8, C1600m0 c1600m0) {
        this.painter = bVar;
        this.f14563b = z8;
        this.f14564c = cVar;
        this.f14565d = interfaceC2235f;
        this.f14566e = f8;
        this.f14567f = c1600m0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return t.c(this.painter, painterElement.painter) && this.f14563b == painterElement.f14563b && t.c(this.f14564c, painterElement.f14564c) && t.c(this.f14565d, painterElement.f14565d) && Float.compare(this.f14566e, painterElement.f14566e) == 0 && t.c(this.f14567f, painterElement.f14567f);
    }

    @Override // p056g1.U
    public int hashCode() {
        int iHashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.f14563b)) * 31) + this.f14564c.hashCode()) * 31) + this.f14565d.hashCode()) * 31) + Float.hashCode(this.f14566e)) * 31;
        C1600m0 c1600m0 = this.f14567f;
        return iHashCode + (c1600m0 == null ? 0 : c1600m0.hashCode());
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PainterNode k() {
        return new PainterNode(this.painter, this.f14563b, this.f14564c, this.f14565d, this.f14566e, this.f14567f);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(PainterNode painterNode) {
        boolean zF2 = painterNode.f2();
        boolean z8 = this.f14563b;
        boolean z9 = zF2 != z8 || (z8 && !l.f(painterNode.e2().h(), this.painter.h()));
        painterNode.n2(this.painter);
        painterNode.o2(this.f14563b);
        painterNode.k2(this.f14564c);
        painterNode.m2(this.f14565d);
        painterNode.b(this.f14566e);
        painterNode.l2(this.f14567f);
        if (z9) {
            D.b(painterNode);
        }
        r.a(painterNode);
    }

    public String toString() {
        return "PainterElement(painter=" + this.painter + GIGvBf.kSlBrRuyQYvEj + this.f14563b + ", alignment=" + this.f14564c + ", contentScale=" + this.f14565d + ", alpha=" + this.f14566e + ", colorFilter=" + this.f14567f + ')';
    }
}
