package p082j0;

import L0.c;
import kotlin.jvm.internal.t;
import p038e1.H;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: renamed from: j0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2607k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f28027a;

    static {
        C c8 = C.Vertical;
        C2598b c2598b = C2598b.f27914a;
        f28027a = new O(c8, null, c2598b.g(), c2598b.g().a(), V.f27893a, AbstractC2611o.f28039a.a(c.f4806a.i()), null);
    }

    public static final H a(C2598b.l lVar, c.b bVar, InterfaceC3163l interfaceC3163l, int i8) {
        H h8;
        interfaceC3163l.f(1089876336);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1089876336, i8, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:101)");
        }
        if (t.c(lVar, C2598b.f27914a.g()) && t.c(bVar, c.f4806a.i())) {
            h8 = f28027a;
        } else {
            interfaceC3163l.f(511388516);
            boolean zR = interfaceC3163l.R(lVar) | interfaceC3163l.R(bVar);
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                O o8 = new O(C.Vertical, null, lVar, lVar.a(), V.f27893a, AbstractC2611o.f28039a.a(bVar), null);
                interfaceC3163l.H(o8);
                objG = o8;
            }
            interfaceC3163l.N();
            h8 = (H) objG;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return h8;
    }
}
