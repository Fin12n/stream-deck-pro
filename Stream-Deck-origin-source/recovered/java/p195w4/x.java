package p195w4;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakReference f37116c = new WeakReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f37117b;

    public x(byte[] bArr) {
        super(bArr);
        this.f37117b = f37116c;
    }

    @Override // p195w4.v
    public final byte[] P() {
        byte[] bArrQ;
        synchronized (this) {
            try {
                bArrQ = (byte[]) this.f37117b.get();
                if (bArrQ == null) {
                    bArrQ = Q();
                    this.f37117b = new WeakReference(bArrQ);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrQ;
    }

    public abstract byte[] Q();
}
