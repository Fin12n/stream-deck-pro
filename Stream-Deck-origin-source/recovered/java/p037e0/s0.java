package p037e0;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f20325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC2221q f20326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC2221q f20327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC2221q f20328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f20329e;

    public s0(G g8) {
        this.f20325a = g8;
        this.f20329e = g8.a();
    }

    @Override // p037e0.o0
    public float a() {
        return this.f20329e;
    }

    @Override // p037e0.o0
    public long b(AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2) {
        if (this.f20327c == null) {
            this.f20327c = r.g(abstractC2221q);
        }
        AbstractC2221q abstractC2221q3 = this.f20327c;
        if (abstractC2221q3 == null) {
            t.t("velocityVector");
            abstractC2221q3 = null;
        }
        int iB = abstractC2221q3.b();
        long jMax = 0;
        for (int i8 = 0; i8 < iB; i8++) {
            jMax = Math.max(jMax, this.f20325a.c(abstractC2221q.a(i8), abstractC2221q2.a(i8)));
        }
        return jMax;
    }

    @Override // p037e0.o0
    public AbstractC2221q c(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2) {
        if (this.f20327c == null) {
            this.f20327c = r.g(abstractC2221q);
        }
        AbstractC2221q abstractC2221q3 = this.f20327c;
        if (abstractC2221q3 == null) {
            t.t("velocityVector");
            abstractC2221q3 = null;
        }
        int iB = abstractC2221q3.b();
        for (int i8 = 0; i8 < iB; i8++) {
            AbstractC2221q abstractC2221q4 = this.f20327c;
            if (abstractC2221q4 == null) {
                t.t("velocityVector");
                abstractC2221q4 = null;
            }
            abstractC2221q4.e(i8, this.f20325a.b(j8, abstractC2221q.a(i8), abstractC2221q2.a(i8)));
        }
        AbstractC2221q abstractC2221q5 = this.f20327c;
        if (abstractC2221q5 != null) {
            return abstractC2221q5;
        }
        t.t("velocityVector");
        return null;
    }

    @Override // p037e0.o0
    public AbstractC2221q d(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2) {
        if (this.f20326b == null) {
            this.f20326b = r.g(abstractC2221q);
        }
        AbstractC2221q abstractC2221q3 = this.f20326b;
        if (abstractC2221q3 == null) {
            t.t("valueVector");
            abstractC2221q3 = null;
        }
        int iB = abstractC2221q3.b();
        for (int i8 = 0; i8 < iB; i8++) {
            AbstractC2221q abstractC2221q4 = this.f20326b;
            if (abstractC2221q4 == null) {
                t.t("valueVector");
                abstractC2221q4 = null;
            }
            abstractC2221q4.e(i8, this.f20325a.e(j8, abstractC2221q.a(i8), abstractC2221q2.a(i8)));
        }
        AbstractC2221q abstractC2221q5 = this.f20326b;
        if (abstractC2221q5 != null) {
            return abstractC2221q5;
        }
        t.t("valueVector");
        return null;
    }

    @Override // p037e0.o0
    public AbstractC2221q e(AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2) {
        if (this.f20328d == null) {
            this.f20328d = r.g(abstractC2221q);
        }
        AbstractC2221q abstractC2221q3 = this.f20328d;
        if (abstractC2221q3 == null) {
            t.t("targetVector");
            abstractC2221q3 = null;
        }
        int iB = abstractC2221q3.b();
        for (int i8 = 0; i8 < iB; i8++) {
            AbstractC2221q abstractC2221q4 = this.f20328d;
            if (abstractC2221q4 == null) {
                t.t("targetVector");
                abstractC2221q4 = null;
            }
            abstractC2221q4.e(i8, this.f20325a.d(abstractC2221q.a(i8), abstractC2221q2.a(i8)));
        }
        AbstractC2221q abstractC2221q5 = this.f20328d;
        if (abstractC2221q5 != null) {
            return abstractC2221q5;
        }
        t.t("targetVector");
        return null;
    }
}
