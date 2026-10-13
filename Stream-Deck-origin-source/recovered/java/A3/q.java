package A3;

import C6.v;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final V3.h.a a(p.b bVar, boolean z8, g product, boolean z9, e eVar) {
        String strG;
        t.g(bVar, "<this>");
        t.g(product, "product");
        String strB = (z8 ? V3.c.b.PURCHASED_PACKAGE : V3.c.b.PURCHASE_PACKAGE_FAILED).b();
        C6.o oVarA = v.a("screen_name", V3.c.d.PRO_PAYWALL.b());
        C6.o oVarA2 = v.a("package_identifier", product.d());
        String strE = product.e();
        String str = "-1";
        if (strE == null) {
            strE = "-1";
        }
        C6.o oVarA3 = v.a("package_offering_identifier", strE);
        C6.o oVarA4 = v.a("user_eligible_for_free_trial", String.valueOf(product.b()));
        C6.o oVarA5 = v.a("package_localized_price_micros", product.h());
        C6.o oVarA6 = v.a("package_localized_price_currency_code", product.i());
        String strJ = product.j();
        if (strJ == null) {
            strJ = "-1";
        }
        C6.o oVarA7 = v.a("package_subscription_period", strJ);
        String strK = product.k();
        if (strK == null) {
            strK = "-1";
        }
        C6.o oVarA8 = v.a("package_subscription_period_unit", strK);
        C6.o oVarA9 = v.a("user_cancelled", String.valueOf(z9));
        e.a aVar = eVar instanceof e.a ? (e.a) eVar : null;
        if (aVar != null && (strG = aVar.g()) != null) {
            str = strG;
        }
        return new V3.h.a(strB, new C6.o[]{oVarA, oVarA2, oVarA3, oVarA4, oVarA5, oVarA6, oVarA7, oVarA8, oVarA9, v.a("purchase_store", str)}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final V3.h.a b(p.b bVar, boolean z8, g gVar, e eVar) {
        String strD;
        String strE;
        String strJ;
        String strK;
        String strG;
        t.g(bVar, "<this>");
        String strB = (z8 ? V3.c.b.RESTORED_PURCHASE : V3.c.b.RESTORE_PURCHASE_FAILED).b();
        C6.o oVarA = v.a("screen_name", V3.c.d.PRO_PAYWALL.b());
        String str = "-1";
        if (gVar == null || (strD = gVar.d()) == null) {
            strD = "-1";
        }
        C6.o oVarA2 = v.a("package_identifier", strD);
        if (gVar == null || (strE = gVar.e()) == null) {
            strE = "-1";
        }
        C6.o oVarA3 = v.a("package_offering_identifier", strE);
        if (gVar == null || (strJ = gVar.j()) == null) {
            strJ = "-1";
        }
        C6.o oVarA4 = v.a("package_subscription_period", strJ);
        if (gVar == null || (strK = gVar.k()) == null) {
            strK = "-1";
        }
        C6.o oVarA5 = v.a("package_subscription_period_unit", strK);
        e.a aVar = eVar instanceof e.a ? (e.a) eVar : null;
        if (aVar != null && (strG = aVar.g()) != null) {
            str = strG;
        }
        return new V3.h.a(strB, new C6.o[]{oVarA, oVarA2, oVarA3, oVarA4, oVarA5, v.a("purchase_store", str)}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final V3.h.a d(p.b bVar) {
        t.g(bVar, "<this>");
        return new V3.h.a(V3.c.b.RESTORE_PURCHASE.b(), new C6.o[]{v.a("screen_name", V3.c.d.PRO_PAYWALL.b())}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final V3.h.a c(p.b bVar, g product, com.elgato.streamdeck.a.b vendor) {
        t.g(bVar, "<this>");
        t.g(product, "product");
        t.g(vendor, "vendor");
        String strB = V3.c.b.PURCHASE_PACKAGE.b();
        C6.o oVarA = v.a("screen_name", V3.c.d.PRO_PAYWALL.b());
        C6.o oVarA2 = v.a("package_identifier", product.d());
        String strE = product.e();
        if (strE == null) {
            strE = "-1";
        }
        return new V3.h.a(strB, new C6.o[]{oVarA, oVarA2, v.a("package_offering_identifier", strE), v.a(jULK.uGxmevNHJToSWF, String.valueOf(product.b())), v.a("vendor", p186v3.b.b(vendor))}, (V3.a) null, 4, (AbstractC2633k) null);
    }
}
