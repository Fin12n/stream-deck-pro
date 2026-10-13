package U;

import H.C1007u0;
import H.I;
import I.x;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class q extends C1007u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10001c;

    public q(I i8) {
        super(i8);
        this.f10000b = "virtual-" + i8.e() + "-" + UUID.randomUUID().toString();
    }

    @Override // H.C1007u0, A.InterfaceC0896t
    public int d() {
        return l(0);
    }

    @Override // H.C1007u0, H.I
    public String e() {
        return this.f10000b;
    }

    @Override // H.C1007u0, A.InterfaceC0896t
    public int l(int i8) {
        return x.u(super.l(i8) - this.f10001c);
    }

    public void t(int i8) {
        this.f10001c = i8;
    }
}
