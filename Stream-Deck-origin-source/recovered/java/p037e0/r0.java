package p037e0;

import D6.I;
import W6.n;
import java.util.Iterator;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2222s f20320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC2221q f20321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC2221q f20322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC2221q f20323d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2222s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F f20324a;

        public a(F f8) {
            this.f20324a = f8;
        }

        @Override // p037e0.InterfaceC2222s
        public F get(int i8) {
            return this.f20324a;
        }
    }

    public r0(InterfaceC2222s interfaceC2222s) {
        this.f20320a = interfaceC2222s;
    }

    @Override // p037e0.m0
    public long b(AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        Iterator it = n.v(0, abstractC2221q.b()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iNextInt = ((I) it).nextInt();
            jMax = Math.max(jMax, this.f20320a.get(iNextInt).c(abstractC2221q.a(iNextInt), abstractC2221q2.a(iNextInt), abstractC2221q3.a(iNextInt)));
        }
        return jMax;
    }

    @Override // p037e0.m0
    public AbstractC2221q c(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        if (this.f20321b == null) {
            this.f20321b = r.g(abstractC2221q);
        }
        AbstractC2221q abstractC2221q4 = this.f20321b;
        if (abstractC2221q4 == null) {
            t.t("valueVector");
            abstractC2221q4 = null;
        }
        int iB = abstractC2221q4.b();
        for (int i8 = 0; i8 < iB; i8++) {
            AbstractC2221q abstractC2221q5 = this.f20321b;
            if (abstractC2221q5 == null) {
                t.t("valueVector");
                abstractC2221q5 = null;
            }
            abstractC2221q5.e(i8, this.f20320a.get(i8).e(j8, abstractC2221q.a(i8), abstractC2221q2.a(i8), abstractC2221q3.a(i8)));
        }
        AbstractC2221q abstractC2221q6 = this.f20321b;
        if (abstractC2221q6 != null) {
            return abstractC2221q6;
        }
        t.t("valueVector");
        return null;
    }

    @Override // p037e0.m0
    public AbstractC2221q d(AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        if (this.f20323d == null) {
            this.f20323d = r.g(abstractC2221q3);
        }
        AbstractC2221q abstractC2221q4 = this.f20323d;
        if (abstractC2221q4 == null) {
            t.t("endVelocityVector");
            abstractC2221q4 = null;
        }
        int iB = abstractC2221q4.b();
        for (int i8 = 0; i8 < iB; i8++) {
            AbstractC2221q abstractC2221q5 = this.f20323d;
            if (abstractC2221q5 == null) {
                t.t("endVelocityVector");
                abstractC2221q5 = null;
            }
            abstractC2221q5.e(i8, this.f20320a.get(i8).d(abstractC2221q.a(i8), abstractC2221q2.a(i8), abstractC2221q3.a(i8)));
        }
        AbstractC2221q abstractC2221q6 = this.f20323d;
        if (abstractC2221q6 != null) {
            return abstractC2221q6;
        }
        t.t("endVelocityVector");
        return null;
    }

    @Override // p037e0.m0
    public AbstractC2221q g(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        if (this.f20322c == null) {
            this.f20322c = r.g(abstractC2221q3);
        }
        AbstractC2221q abstractC2221q4 = this.f20322c;
        if (abstractC2221q4 == null) {
            t.t("velocityVector");
            abstractC2221q4 = null;
        }
        int iB = abstractC2221q4.b();
        for (int i8 = 0; i8 < iB; i8++) {
            AbstractC2221q abstractC2221q5 = this.f20322c;
            if (abstractC2221q5 == null) {
                t.t("velocityVector");
                abstractC2221q5 = null;
            }
            abstractC2221q5.e(i8, this.f20320a.get(i8).b(j8, abstractC2221q.a(i8), abstractC2221q2.a(i8), abstractC2221q3.a(i8)));
        }
        AbstractC2221q abstractC2221q6 = this.f20322c;
        if (abstractC2221q6 != null) {
            return abstractC2221q6;
        }
        t.t("velocityVector");
        return null;
    }

    public r0(F f8) {
        this(new a(f8));
    }
}
