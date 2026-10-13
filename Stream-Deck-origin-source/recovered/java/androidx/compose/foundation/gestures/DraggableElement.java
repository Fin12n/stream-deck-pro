package androidx.compose.foundation.gestures;

import Q6.k;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import p055g0.B;
import p055g0.u;
import p055g0.v;
import p056g1.U;
import p073i0.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class DraggableElement extends U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f14381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f14382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f14383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f14385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f14386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f14387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f14388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f14389j;

    public DraggableElement(v vVar, k kVar, B b8, boolean z8, m mVar, Function0 function0, p pVar, p pVar2, boolean z9) {
        this.f14381b = vVar;
        this.f14382c = kVar;
        this.f14383d = b8;
        this.f14384e = z8;
        this.f14385f = mVar;
        this.f14386g = function0;
        this.f14387h = pVar;
        this.f14388i = pVar2;
        this.f14389j = z9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return t.c(this.f14381b, draggableElement.f14381b) && t.c(this.f14382c, draggableElement.f14382c) && this.f14383d == draggableElement.f14383d && this.f14384e == draggableElement.f14384e && t.c(this.f14385f, draggableElement.f14385f) && t.c(this.f14386g, draggableElement.f14386g) && t.c(this.f14387h, draggableElement.f14387h) && t.c(this.f14388i, draggableElement.f14388i) && this.f14389j == draggableElement.f14389j;
    }

    @Override // p056g1.U
    public int hashCode() {
        int iHashCode = ((((((this.f14381b.hashCode() * 31) + this.f14382c.hashCode()) * 31) + this.f14383d.hashCode()) * 31) + Boolean.hashCode(this.f14384e)) * 31;
        m mVar = this.f14385f;
        return ((((((((iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31) + this.f14386g.hashCode()) * 31) + this.f14387h.hashCode()) * 31) + this.f14388i.hashCode()) * 31) + Boolean.hashCode(this.f14389j);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public u k() {
        return new u(this.f14381b, this.f14382c, this.f14383d, this.f14384e, this.f14385f, this.f14386g, this.f14387h, this.f14388i, this.f14389j);
    }

    @Override // p056g1.U
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void p(u uVar) {
        uVar.Q2(this.f14381b, this.f14382c, this.f14383d, this.f14384e, this.f14385f, this.f14386g, this.f14387h, this.f14388i, this.f14389j);
    }
}
