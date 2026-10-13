package p017b7;

import I0.mIk.efuWFSeiT;
import kotlin.jvm.internal.t;
import p062g7.r;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C0 extends r implements InterfaceC1809s0, InterfaceC1776b0, InterfaceC1806q0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D0 f15864d;

    @Override // p017b7.InterfaceC1806q0
    public boolean b() {
        return true;
    }

    @Override // p017b7.InterfaceC1806q0
    public I0 c() {
        return null;
    }

    @Override // p017b7.InterfaceC1776b0
    public void d() {
        x().F0(this);
    }

    @Override // p062g7.r
    public String toString() {
        return N.a(this) + '@' + N.b(this) + "[job@" + N.b(x()) + ']';
    }

    public final void y(D0 d8) {
        this.f15864d = d8;
    }

    public final D0 x() {
        D0 d8 = this.f15864d;
        if (d8 != null) {
            return d8;
        }
        t.t(efuWFSeiT.fiCRsyUzIXrRwa);
        return null;
    }
}
