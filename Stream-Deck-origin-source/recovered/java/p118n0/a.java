package p118n0;

import L0.i;
import p038e1.InterfaceC2247s;
import p047f1.h;
import p056g1.InterfaceC2344h;
import p056g1.InterfaceC2361z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends i.c implements h, InterfaceC2361z, InterfaceC2344h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f30476n = j.b(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC2247s f30477o;

    @Override // p056g1.InterfaceC2361z
    public void R(InterfaceC2247s interfaceC2247s) {
        this.f30477o = interfaceC2247s;
    }

    public final InterfaceC2247s d2() {
        InterfaceC2247s interfaceC2247s = this.f30477o;
        if (interfaceC2247s == null || !interfaceC2247s.y()) {
            return null;
        }
        return interfaceC2247s;
    }

    public final c e2() {
        return (c) u(b.a());
    }

    public final c f2() {
        c cVarE2 = e2();
        return cVarE2 == null ? this.f30476n : cVarE2;
    }
}
