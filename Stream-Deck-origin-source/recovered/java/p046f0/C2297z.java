package p046f0;

import L0.i;
import Q6.k;
import kotlin.jvm.internal.t;
import p038e1.InterfaceC2247s;
import p047f1.h;
import p056g1.InterfaceC2354s;

/* JADX INFO: renamed from: f0.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2297z extends i.c implements h, InterfaceC2354s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC2247s f21522o;

    public final k d2() {
        if (K1()) {
            return (k) u(AbstractC2296y.a());
        }
        return null;
    }

    public final void e2() {
        k kVarD2;
        InterfaceC2247s interfaceC2247s = this.f21522o;
        if (interfaceC2247s != null) {
            t.d(interfaceC2247s);
            if (!interfaceC2247s.y() || (kVarD2 = d2()) == null) {
                return;
            }
            kVarD2.invoke(this.f21522o);
        }
    }

    public final void f2(boolean z8) {
        if (z8 == this.f21521n) {
            return;
        }
        if (z8) {
            e2();
        } else {
            k kVarD2 = d2();
            if (kVarD2 != null) {
                kVarD2.invoke(null);
            }
        }
        this.f21521n = z8;
    }

    @Override // p056g1.InterfaceC2354s
    public void m(InterfaceC2247s interfaceC2247s) {
        this.f21522o = interfaceC2247s;
        if (this.f21521n) {
            if (interfaceC2247s.y()) {
                e2();
                return;
            }
            k kVarD2 = d2();
            if (kVarD2 != null) {
                kVarD2.invoke(null);
            }
        }
    }
}
