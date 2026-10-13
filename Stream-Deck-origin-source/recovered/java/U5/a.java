package U5;

import T5.h;
import X5.C1693w;
import X5.InterfaceC1684m;
import X5.x;
import kotlin.jvm.internal.t;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H5.b f10201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G6.g f10202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f10203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1693w f10204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p141p6.c f10205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p141p6.c f10206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io.ktor.utils.io.g f10207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC1684m f10208h;

    @Override // X5.InterfaceC1689s
    public InterfaceC1684m a() {
        return this.f10208h;
    }

    @Override // U5.c
    public io.ktor.utils.io.g b() {
        return this.f10207g;
    }

    @Override // U5.c
    public p141p6.c d() {
        return this.f10205e;
    }

    @Override // U5.c
    public p141p6.c f() {
        return this.f10206f;
    }

    @Override // U5.c
    public x g() {
        return this.f10203c;
    }

    @Override // U5.c
    public H5.b g1() {
        return this.f10201a;
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f10202b;
    }

    @Override // U5.c
    public C1693w h() {
        return this.f10204d;
    }

    public a(H5.b bVar, h responseData) {
        t.g(bVar, RaiWHuj.ZVgfPTeNXjqm);
        t.g(responseData, "responseData");
        this.f10201a = bVar;
        this.f10202b = responseData.b();
        this.f10203c = responseData.f();
        this.f10204d = responseData.g();
        this.f10205e = responseData.d();
        this.f10206f = responseData.e();
        Object objA = responseData.a();
        io.ktor.utils.io.g gVar = objA instanceof io.ktor.utils.io.g ? (io.ktor.utils.io.g) objA : null;
        this.f10207g = gVar == null ? io.ktor.utils.io.g.f25425a.a() : gVar;
        this.f10208h = responseData.c();
    }
}
