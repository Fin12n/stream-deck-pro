package p017b7;

import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;

/* JADX INFO: renamed from: b7.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1782e0 implements InterfaceC1806q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15948a;

    public C1782e0(boolean z8) {
        this.f15948a = z8;
    }

    @Override // p017b7.InterfaceC1806q0
    public boolean b() {
        return this.f15948a;
    }

    @Override // p017b7.InterfaceC1806q0
    public I0 c() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(b() ? "Active" : WaYxBuDSBD.tcpqMIIol);
        sb.append('}');
        return sb.toString();
    }
}
