package p138p3;

import com.android.billingclient.api.b;
import com.google.android.gms.internal.play_billing.AbstractC2027j;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f31161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2779n f31162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f31163c;

    public C(b bVar, String str, InterfaceC2779n interfaceC2779n) {
        this.f31161a = str;
        this.f31162b = interfaceC2779n;
        this.f31163c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        l0 l0VarO = b.O(this.f31163c, this.f31161a, 9);
        if (l0VarO.b() != null) {
            this.f31162b.a(l0VarO.a(), l0VarO.b());
            return null;
        }
        this.f31162b.a(l0VarO.a(), AbstractC2027j.G());
        return null;
    }
}
