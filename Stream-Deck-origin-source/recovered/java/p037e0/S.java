package p037e0;

import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class S extends h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f20059d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3164l0 f20060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3164l0 f20061c;

    public S(Object obj) {
        super(null);
        this.f20060b = l1.e(obj, null, 2, null);
        this.f20061c = l1.e(obj, null, 2, null);
    }

    @Override // p037e0.h0
    public Object a() {
        return this.f20060b.getValue();
    }

    @Override // p037e0.h0
    public Object b() {
        return this.f20061c.getValue();
    }

    public void e(Object obj) {
        this.f20060b.setValue(obj);
    }

    public void f(Object obj) {
        this.f20061c.setValue(obj);
    }

    @Override // p037e0.h0
    public void d(f0 f0Var) {
    }
}
