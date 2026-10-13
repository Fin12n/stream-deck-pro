package p017b7;

import G6.d;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import p062g7.C;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class W0 extends C implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15924e;

    public W0(long j8, d<Object> dVar) {
        super(dVar.getContext(), dVar);
        this.f15924e = j8;
    }

    @Override // java.lang.Runnable
    public void run() {
        D(X0.a(this.f15924e, U.c(getContext()), this));
    }

    @Override // p017b7.AbstractC1773a, p017b7.D0
    public String u0() {
        return super.u0() + yOZfxp.cPhAwYmDNli + this.f15924e + ')';
    }
}
