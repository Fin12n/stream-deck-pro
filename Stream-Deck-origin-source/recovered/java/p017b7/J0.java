package p017b7;

import G6.a;
import G6.d;
import Q6.k;
import Y6.g;
import Y6.l;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class J0 extends a implements InterfaceC1815v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J0 f15902b = new J0();

    public J0() {
        super(InterfaceC1815v0.f15985O);
    }

    @Override // p017b7.InterfaceC1815v0
    public InterfaceC1776b0 H0(k kVar) {
        return K0.f15903a;
    }

    @Override // p017b7.InterfaceC1815v0
    public InterfaceC1776b0 K1(boolean z8, boolean z9, k kVar) {
        return K0.f15903a;
    }

    @Override // p017b7.InterfaceC1815v0
    public g Y() {
        return l.e();
    }

    @Override // p017b7.InterfaceC1815v0
    public boolean b() {
        return true;
    }

    @Override // p017b7.InterfaceC1815v0
    public InterfaceC1815v0 getParent() {
        return null;
    }

    @Override // p017b7.InterfaceC1815v0
    public Object i0(d dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // p017b7.InterfaceC1815v0
    public boolean isCancelled() {
        return false;
    }

    @Override // p017b7.InterfaceC1815v0
    public r j0(InterfaceC1810t interfaceC1810t) {
        return K0.f15903a;
    }

    @Override // p017b7.InterfaceC1815v0
    public CancellationException r0() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p017b7.InterfaceC1815v0
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // p017b7.InterfaceC1815v0
    public boolean y() {
        return false;
    }

    @Override // p017b7.InterfaceC1815v0
    public void z(CancellationException cancellationException) {
    }
}
