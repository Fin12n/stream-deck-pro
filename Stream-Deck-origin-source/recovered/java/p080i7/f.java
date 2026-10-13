package p080i7;

import G6.g;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.AbstractC1796l0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class f extends AbstractC1796l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f24778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f24780h;

    public f() {
        this(0, 0, 0L, null, 15, null);
    }

    @Override // p017b7.F
    public void L0(g gVar, Runnable runnable) {
        a.z(this.f24780h, runnable, null, false, 6, null);
    }

    @Override // p017b7.F
    public void T0(g gVar, Runnable runnable) {
        a.z(this.f24780h, runnable, null, true, 2, null);
    }

    public void close() throws InterruptedException {
        this.f24780h.close();
    }

    public final a o1() {
        return new a(this.f24776d, this.f24777e, this.f24778f, this.f24779g);
    }

    public final void q1(Runnable runnable, i iVar, boolean z8) {
        this.f24780h.y(runnable, iVar, z8);
    }

    public /* synthetic */ f(int i8, int i9, long j8, String str, int i10, AbstractC2633k abstractC2633k) {
        this((i10 & 1) != 0 ? l.f24787c : i8, (i10 & 2) != 0 ? l.f24788d : i9, (i10 & 4) != 0 ? l.f24789e : j8, (i10 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public f(int i8, int i9, long j8, String str) {
        this.f24776d = i8;
        this.f24777e = i9;
        this.f24778f = j8;
        this.f24779g = str;
        this.f24780h = o1();
    }
}
