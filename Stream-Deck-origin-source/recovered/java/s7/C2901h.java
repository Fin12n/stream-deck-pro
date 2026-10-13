package s7;

import D6.C0930j;

/* JADX INFO: renamed from: s7.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C2901h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0930j f33283a = new C0930j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33284b;

    public final byte[] a(int i8) {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f33283a.L();
            if (bArr != null) {
                this.f33284b -= bArr.length / 2;
            } else {
                bArr = null;
            }
        }
        return bArr == null ? new byte[i8] : bArr;
    }
}
