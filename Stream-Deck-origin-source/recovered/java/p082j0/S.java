package p082j0;

import L0.c;
import kotlin.jvm.internal.t;
import p038e1.H;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f27891a;

    static {
        C c8 = C.Horizontal;
        C2598b c2598b = C2598b.f27914a;
        f27891a = new O(c8, c2598b.f(), null, c2598b.f().a(), V.f27893a, AbstractC2611o.f28039a.b(c.f4806a.j()), null);
    }

    public static final H a(C2598b.d dVar, c.InterfaceC0174c interfaceC0174c, InterfaceC3163l interfaceC3163l, int i8) {
        H h8;
        interfaceC3163l.f(-837807694);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-837807694, i8, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:117)");
        }
        if (t.c(dVar, C2598b.f27914a.f()) && t.c(interfaceC0174c, c.f4806a.j())) {
            h8 = f27891a;
        } else {
            interfaceC3163l.f(511388516);
            boolean zR = interfaceC3163l.R(dVar) | interfaceC3163l.R(interfaceC0174c);
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                O o8 = new O(C.Horizontal, dVar, null, dVar.a(), V.f27893a, AbstractC2611o.f28039a.b(interfaceC0174c), null);
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
