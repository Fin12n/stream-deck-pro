package p138p3;

import com.android.billingclient.api.b;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class D implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f31167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2778m f31168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f31169c;

    public D(b bVar, String str, InterfaceC2778m interfaceC2778m) {
        this.f31167a = str;
        this.f31168b = interfaceC2778m;
        this.f31169c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        M mI0 = b.i0(this.f31169c, this.f31167a);
        this.f31168b.a(mI0.a(), mI0.b());
        return null;
    }
}
