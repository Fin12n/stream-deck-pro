package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Z0 implements InterfaceC2017g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V0 f18849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2076w1 f18850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2012f0 f18852d;

    public Z0(AbstractC2076w1 abstractC2076w1, AbstractC2012f0 abstractC2012f0, V0 v8) {
        this.f18850b = abstractC2076w1;
        this.f18851c = abstractC2012f0.f(v8);
        this.f18852d = abstractC2012f0;
        this.f18849a = v8;
    }

    public static Z0 j(AbstractC2076w1 abstractC2076w1, AbstractC2012f0 abstractC2012f0, V0 v8) {
        return new Z0(abstractC2076w1, abstractC2012f0, v8);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final void a(Object obj) {
        this.f18850b.g(obj);
        this.f18852d.d(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final boolean b(Object obj) {
        return this.f18852d.b(obj).i();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final int c(Object obj) {
        int iHashCode = this.f18850b.d(obj).hashCode();
        return this.f18851c ? (iHashCode * 53) + this.f18852d.b(obj).f18917a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final int d(Object obj) {
        AbstractC2076w1 abstractC2076w1 = this.f18850b;
        int iB = abstractC2076w1.b(abstractC2076w1.d(obj));
        return this.f18851c ? iB + this.f18852d.b(obj).c() : iB;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final void e(Object obj, Object obj2) {
        AbstractC2025i1.x(this.f18850b, obj, obj2);
        if (this.f18851c) {
            AbstractC2025i1.w(this.f18852d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final Object f() {
        V0 v8 = this.f18849a;
        return v8 instanceof AbstractC2056q0 ? ((AbstractC2056q0) v8).k() : v8.a().o();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final boolean g(Object obj, Object obj2) {
        AbstractC2076w1 abstractC2076w1 = this.f18850b;
        if (!abstractC2076w1.d(obj).equals(abstractC2076w1.d(obj2))) {
            return false;
        }
        if (this.f18851c) {
            return this.f18852d.b(obj).equals(this.f18852d.b(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final void h(Object obj, O1 o8) {
        Iterator itE = this.f18852d.b(obj).e();
        if (itE.hasNext()) {
            p063h.s.a(((Map.Entry) itE.next()).getKey());
            throw null;
        }
        AbstractC2076w1 abstractC2076w1 = this.f18850b;
        abstractC2076w1.i(abstractC2076w1.d(obj), o8);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final void i(Object obj, byte[] bArr, int i8, int i9, E e8) {
        AbstractC2056q0 abstractC2056q0 = (AbstractC2056q0) obj;
        if (abstractC2056q0.zzc == C2079x1.c()) {
            abstractC2056q0.zzc = C2079x1.f();
        }
        throw null;
    }
}
