package p017b7;

/* JADX INFO: renamed from: b7.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1778c0 implements InterfaceC1793k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1776b0 f15941a;

    public C1778c0(InterfaceC1776b0 interfaceC1776b0) {
        this.f15941a = interfaceC1776b0;
    }

    @Override // p017b7.InterfaceC1793k
    public void a(Throwable th) {
        this.f15941a.d();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f15941a + ']';
    }
}
