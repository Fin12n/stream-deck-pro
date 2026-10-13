package p011b1;

import B0.d;
import L0.i;
import java.util.List;
import kotlin.jvm.internal.t;
import p038e1.InterfaceC2247s;

/* JADX INFO: renamed from: b1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1759g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15741c = d.f896d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2247s f15742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1764l f15743b = new C1764l();

    public C1759g(InterfaceC2247s interfaceC2247s) {
        this.f15742a = interfaceC2247s;
    }

    public final void a(long j8, List list) {
        Object obj;
        C1764l c1764l = this.f15743b;
        int size = list.size();
        boolean z8 = true;
        for (int i8 = 0; i8 < size; i8++) {
            i.c cVar = (i.c) list.get(i8);
            if (z8) {
                d dVarG = c1764l.g();
                int iS = dVarG.s();
                if (iS <= 0) {
                    obj = null;
                    break;
                }
                Object[] objArrR = dVarG.r();
                int i9 = 0;
                while (true) {
                    obj = objArrR[i9];
                    if (t.c(((C1763k) obj).j(), cVar)) {
                        break;
                    }
                    i9++;
                    if (i9 >= iS) {
                        obj = null;
                        break;
                    }
                }
                C1763k c1763k = (C1763k) obj;
                if (c1763k != null) {
                    c1763k.m();
                    c1763k.k().b(j8);
                    c1764l = c1763k;
                } else {
                    z8 = false;
                    C1763k c1763k2 = new C1763k(cVar);
                    c1763k2.k().b(j8);
                    c1764l.g().d(c1763k2);
                    c1764l = c1763k2;
                }
            } else {
                C1763k c1763k3 = new C1763k(cVar);
                c1763k3.k().b(j8);
                c1764l.g().d(c1763k3);
                c1764l = c1763k3;
            }
        }
    }

    public final boolean b(C1760h c1760h, boolean z8) {
        if (this.f15743b.a(c1760h.a(), this.f15742a, c1760h, z8)) {
            return this.f15743b.e(c1760h) || this.f15743b.f(c1760h.a(), this.f15742a, c1760h, z8);
        }
        return false;
    }

    public final void c() {
        this.f15743b.d();
        this.f15743b.c();
    }

    public final void d() {
        this.f15743b.h();
    }
}
