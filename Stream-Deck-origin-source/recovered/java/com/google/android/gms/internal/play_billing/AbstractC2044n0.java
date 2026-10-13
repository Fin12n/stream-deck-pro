package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2044n0 extends AbstractC2080y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2056q0 f18989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC2056q0 f18990b;

    public AbstractC2044n0(AbstractC2056q0 abstractC2056q0) {
        this.f18989a = abstractC2056q0;
        if (abstractC2056q0.x()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f18990b = abstractC2056q0.k();
    }

    public static void n(Object obj, Object obj2) {
        C2005d1.a().b(obj.getClass()).e(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2080y
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final AbstractC2044n0 clone() {
        AbstractC2044n0 abstractC2044n0 = (AbstractC2044n0) this.f18989a.y(5, null, null);
        abstractC2044n0.f18990b = o();
        return abstractC2044n0;
    }

    public final AbstractC2044n0 g(AbstractC2056q0 abstractC2056q0) {
        if (!this.f18989a.equals(abstractC2056q0)) {
            if (!this.f18990b.x()) {
                m();
            }
            n(this.f18990b, abstractC2056q0);
        }
        return this;
    }

    public final AbstractC2056q0 h() {
        AbstractC2056q0 abstractC2056q0O = o();
        if (abstractC2056q0O.j()) {
            return abstractC2056q0O;
        }
        throw new C2073v1(abstractC2056q0O);
    }

    @Override // com.google.android.gms.internal.play_billing.U0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC2056q0 o() {
        if (!this.f18990b.x()) {
            return this.f18990b;
        }
        this.f18990b.s();
        return this.f18990b;
    }

    public final void k() {
        if (this.f18990b.x()) {
            return;
        }
        m();
    }

    public void m() {
        AbstractC2056q0 abstractC2056q0K = this.f18989a.k();
        n(abstractC2056q0K, this.f18990b);
        this.f18990b = abstractC2056q0K;
    }
}
