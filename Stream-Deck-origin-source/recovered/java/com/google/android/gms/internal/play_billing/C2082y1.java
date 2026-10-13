package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2082y1 extends AbstractC2076w1 {
    @Override // com.google.android.gms.internal.play_billing.AbstractC2076w1
    public final /* synthetic */ int a(Object obj) {
        return ((C2079x1) obj).a();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2076w1
    public final /* synthetic */ int b(Object obj) {
        return ((C2079x1) obj).b();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2076w1
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        AbstractC2056q0 abstractC2056q0 = (AbstractC2056q0) obj;
        C2079x1 c2079x1 = abstractC2056q0.zzc;
        if (c2079x1 != C2079x1.c()) {
            return c2079x1;
        }
        C2079x1 c2079x1F = C2079x1.f();
        abstractC2056q0.zzc = c2079x1F;
        return c2079x1F;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2076w1
    public final /* synthetic */ Object d(Object obj) {
        return ((AbstractC2056q0) obj).zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2076w1
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (!C2079x1.c().equals(obj2)) {
            if (C2079x1.c().equals(obj)) {
                return C2079x1.e((C2079x1) obj, (C2079x1) obj2);
            }
            ((C2079x1) obj).d((C2079x1) obj2);
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2076w1
    public final /* bridge */ /* synthetic */ void f(Object obj, int i8, long j8) {
        ((C2079x1) obj).j(i8 << 3, Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2076w1
    public final void g(Object obj) {
        ((AbstractC2056q0) obj).zzc.h();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2076w1
    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((AbstractC2056q0) obj).zzc = (C2079x1) obj2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2076w1
    public final /* synthetic */ void i(Object obj, O1 o8) {
        ((C2079x1) obj).k(o8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2076w1
    public final /* synthetic */ void j(Object obj, O1 o8) {
        ((C2079x1) obj).l(o8);
    }
}
