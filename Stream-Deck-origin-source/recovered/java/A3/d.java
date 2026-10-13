package A3;

import D6.z;
import Z6.u;
import Z6.w;
import Z6.y;
import com.revenuecat.purchases.models.Period;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f518a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f519b = o7.i.a(com.amazon.a.a.o.b.f16740o, o7.e.i.f30979a);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Period deserialize(p7.e decoder) {
        String str;
        Integer numM;
        t.g(decoder, "decoder");
        String strS = decoder.s();
        switch (strS.hashCode()) {
            case -2115097178:
                if (strS.equals("BiMonthly")) {
                    return new Period(2, Period.Unit.MONTH, "P2M");
                }
                break;
            case -1707840351:
                if (strS.equals("Weekly")) {
                    return new Period(1, Period.Unit.WEEK, "P1W");
                }
                break;
            case -1393678355:
                if (strS.equals("Monthly")) {
                    return new Period(1, Period.Unit.MONTH, "P1M");
                }
                break;
            case -580032564:
                if (strS.equals("Annually")) {
                    return new Period(1, Period.Unit.YEAR, "P1Y");
                }
                break;
            case -308855462:
                if (strS.equals("SemiAnnually")) {
                    return new Period(6, Period.Unit.MONTH, "P6M");
                }
                break;
            case 3392903:
                if (strS.equals("null")) {
                    return null;
                }
                break;
            case 347098056:
                if (strS.equals("BiWeekly")) {
                    return new Period(2, Period.Unit.WEEK, "P2W");
                }
                break;
            case 357220109:
                if (strS.equals("SemiAnnual")) {
                    return new Period(6, Period.Unit.MONTH, "P6M");
                }
                break;
            case 937940249:
                if (strS.equals("Quarterly")) {
                    return new Period(3, Period.Unit.MONTH, "P3M");
                }
                break;
            case 1965874687:
                if (strS.equals("Annual")) {
                    return new Period(1, Period.Unit.YEAR, "P1Y");
                }
                break;
        }
        List listA0 = w.A0(decoder.s(), new String[]{" "}, false, 0, 6, null);
        if (listA0.size() != 2) {
            listA0 = null;
        }
        if (listA0 == null || (str = (String) z.k0(listA0)) == null || (numM = u.m(str)) == null) {
            return null;
        }
        int iIntValue = numM.intValue();
        String strValueOf = String.valueOf(y.a1((CharSequence) listA0.get(1)));
        t.e(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        t.f(upperCase, "toUpperCase(...)");
        return Period.Factory.create("P" + iIntValue + upperCase);
    }

    @Override // p116m7.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(p7.f encoder, Period period) {
        t.g(encoder, "encoder");
        throw new UnsupportedOperationException("Serialization not supported");
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f519b;
    }
}
