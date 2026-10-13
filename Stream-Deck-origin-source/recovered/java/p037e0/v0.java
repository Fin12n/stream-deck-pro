package p037e0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f20347c;

    public v0(float f8, float f9, InterfaceC2222s interfaceC2222s) {
        this.f20345a = f8;
        this.f20346b = f9;
        this.f20347c = new r0(interfaceC2222s);
    }

    @Override // p037e0.q0, p037e0.m0
    public boolean a() {
        return this.f20347c.a();
    }

    @Override // p037e0.m0
    public long b(AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        return this.f20347c.b(abstractC2221q, abstractC2221q2, abstractC2221q3);
    }

    @Override // p037e0.m0
    public AbstractC2221q c(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        return this.f20347c.c(j8, abstractC2221q, abstractC2221q2, abstractC2221q3);
    }

    @Override // p037e0.m0
    public AbstractC2221q d(AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        return this.f20347c.d(abstractC2221q, abstractC2221q2, abstractC2221q3);
    }

    @Override // p037e0.m0
    public AbstractC2221q g(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        return this.f20347c.g(j8, abstractC2221q, abstractC2221q2, abstractC2221q3);
    }

    public /* synthetic */ v0(float f8, float f9, AbstractC2221q abstractC2221q, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? 1.0f : f8, (i8 & 2) != 0 ? 1500.0f : f9, (i8 & 4) != 0 ? null : abstractC2221q);
    }

    public v0(float f8, float f9, AbstractC2221q abstractC2221q) {
        this(f8, f9, n0.c(abstractC2221q, f8, f9));
    }
}
