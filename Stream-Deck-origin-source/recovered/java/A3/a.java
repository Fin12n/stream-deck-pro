package A3;

import C6.InterfaceC0916e;
import com.revenuecat.purchases.models.Period;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import q7.AbstractC2872x0;
import q7.C2874y0;
import q7.I0;
import q7.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@p116m7.i
public final class a {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Period f496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Period f497c;

    /* JADX INFO: renamed from: A3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0004a implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0004a f498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ C2874y0 f499b;

        static {
            C0004a c0004a = new C0004a();
            f498a = c0004a;
            C2874y0 c2874y0 = new C2874y0("com.elgato.streamdeck.purchase.AmazonProduct", c0004a, 3);
            c2874y0.l("productType", false);
            c2874y0.l(com.amazon.a.a.o.b.f16740o, true);
            c2874y0.l(com.amazon.a.a.o.b.f16741p, true);
            f499b = c2874y0;
        }

        @Override // p116m7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a deserialize(p7.e decoder) {
            int i8;
            h hVar;
            Period period;
            Period period2;
            t.g(decoder, "decoder");
            o7.f descriptor = getDescriptor();
            p7.c cVarB = decoder.b(descriptor);
            h hVar2 = null;
            if (cVarB.x()) {
                h hVar3 = (h) cVarB.u(descriptor, 0, i.f592a, null);
                d dVar = d.f518a;
                Period period3 = (Period) cVarB.z(descriptor, 1, dVar, null);
                hVar = hVar3;
                period2 = (Period) cVarB.z(descriptor, 2, dVar, null);
                period = period3;
                i8 = 7;
            } else {
                boolean z8 = true;
                int i9 = 0;
                Period period4 = null;
                Period period5 = null;
                while (z8) {
                    int iE = cVarB.E(descriptor);
                    if (iE == -1) {
                        z8 = false;
                    } else if (iE == 0) {
                        hVar2 = (h) cVarB.u(descriptor, 0, i.f592a, hVar2);
                        i9 |= 1;
                    } else if (iE == 1) {
                        period4 = (Period) cVarB.z(descriptor, 1, d.f518a, period4);
                        i9 |= 2;
                    } else {
                        if (iE != 2) {
                            throw new p116m7.p(iE);
                        }
                        period5 = (Period) cVarB.z(descriptor, 2, d.f518a, period5);
                        i9 |= 4;
                    }
                }
                i8 = i9;
                hVar = hVar2;
                period = period4;
                period2 = period5;
            }
            cVarB.c(descriptor);
            return new a(i8, hVar, period, period2, (I0) null);
        }

        @Override // p116m7.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(p7.f encoder, a value) {
            t.g(encoder, "encoder");
            t.g(value, "value");
            o7.f descriptor = getDescriptor();
            p7.d dVarB = encoder.b(descriptor);
            a.c(value, dVarB, descriptor);
            dVarB.c(descriptor);
        }

        @Override // q7.K
        public p116m7.b[] childSerializers() {
            d dVar = d.f518a;
            return new p116m7.b[]{i.f592a, p125n7.a.u(dVar), p125n7.a.u(dVar)};
        }

        @Override // p116m7.b, p116m7.k, p116m7.a
        public o7.f getDescriptor() {
            return f499b;
        }

        @Override // q7.K
        public p116m7.b[] typeParametersSerializers() {
            return K.a.a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final p116m7.b serializer() {
            return C0004a.f498a;
        }

        public b() {
        }
    }

    @InterfaceC0916e
    public /* synthetic */ a(int i8, @p116m7.i(with = i.class) h hVar, @p116m7.i(with = d.class) Period period, @p116m7.i(with = d.class) Period period2, I0 i9) {
        if (1 != (i8 & 1)) {
            AbstractC2872x0.a(i8, 1, C0004a.f498a.getDescriptor());
        }
        this.f495a = hVar;
        if ((i8 & 2) == 0) {
            this.f496b = null;
        } else {
            this.f496b = period;
        }
        if ((i8 & 4) == 0) {
            this.f497c = null;
        } else {
            this.f497c = period2;
        }
    }

    public static final /* synthetic */ void c(a aVar, p7.d dVar, o7.f fVar) {
        dVar.i(fVar, 0, i.f592a, aVar.f495a);
        if (dVar.G(fVar, 1) || aVar.f496b != null) {
            dVar.t(fVar, 1, d.f518a, aVar.f496b);
        }
        if (!dVar.G(fVar, 2) && aVar.f497c == null) {
            return;
        }
        dVar.t(fVar, 2, d.f518a, aVar.f497c);
    }

    public final Period a() {
        return this.f497c;
    }

    public final Period b() {
        return this.f496b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f495a == aVar.f495a && t.c(this.f496b, aVar.f496b) && t.c(this.f497c, aVar.f497c);
    }

    public int hashCode() {
        int iHashCode = this.f495a.hashCode() * 31;
        Period period = this.f496b;
        int iHashCode2 = (iHashCode + (period == null ? 0 : period.hashCode())) * 31;
        Period period2 = this.f497c;
        return iHashCode2 + (period2 != null ? period2.hashCode() : 0);
    }

    public String toString() {
        return "AmazonProduct(productType=" + this.f495a + ", subscriptionPeriod=" + this.f496b + ", freeTrialPeriod=" + this.f497c + ")";
    }

    public a(h productType, Period period, Period period2) {
        t.g(productType, "productType");
        this.f495a = productType;
        this.f496b = period;
        this.f497c = period2;
    }

    public /* synthetic */ a(h hVar, Period period, Period period2, int i8, AbstractC2633k abstractC2633k) {
        this(hVar, (i8 & 2) != 0 ? null : period, (i8 & 4) != 0 ? null : period2);
    }
}
