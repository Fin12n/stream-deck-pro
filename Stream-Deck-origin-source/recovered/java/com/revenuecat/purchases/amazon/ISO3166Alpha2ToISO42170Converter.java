package com.revenuecat.purchases.amazon;

import C6.o;
import C6.v;
import D6.M;
import E4.JFpq.XRlnZWSrAFn;
import H.FL.dCqzKmEghGTQ;
import I0.mIk.efuWFSeiT;
import M6.eLZq.eGwOBWCdOTaKus;
import P2.Lsk.mHPawN;
import R0.pkXL.Oitvkwcwn;
import T0.Vl.PCRzgdeK;
import Z.JTT.ryTuoS;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import com.google.mlkit.common.internal.ckI.WqXA;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.util.Map;
import kotlin.jvm.internal.t;
import p090k.zI.jULK;
import p116m7.kKPq.toqHM;
import p135p0.Dyk.GOKsbdzhLhXAMt;
import p180u5.FCkZ.BpgIURjN;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ISO3166Alpha2ToISO42170Converter {
    public static final ISO3166Alpha2ToISO42170Converter INSTANCE = new ISO3166Alpha2ToISO42170Converter();
    private static final Map<String, String> conversions;

    static {
        o oVarA = v.a("AF", "AFN");
        o oVarA2 = v.a("AL", "ALL");
        o oVarA3 = v.a("DZ", "DZD");
        String str = ajyWhveMDgQ.YTsBYjlOZUGEcM;
        o oVarA4 = v.a("AS", str);
        o oVarA5 = v.a(WqXA.vLjqbDQUokr, "EUR");
        o oVarA6 = v.a("AO", "AOA");
        o oVarA7 = v.a("AI", "XCD");
        o oVarA8 = v.a("AG", "XCD");
        o oVarA9 = v.a("AR", "ARS");
        o oVarA10 = v.a("AM", "AMD");
        o oVarA11 = v.a("AW", "AWG");
        o oVarA12 = v.a(kDsnNkYbBsI.vOGgcGwAajnPoc, "AUD");
        o oVarA13 = v.a("AT", "EUR");
        o oVarA14 = v.a("AZ", "AZN");
        o oVarA15 = v.a("BS", "BSD");
        o oVarA16 = v.a(ajyWhveMDgQ.exoZPpX, "BHD");
        o oVarA17 = v.a("BD", "BDT");
        o oVarA18 = v.a("BB", "BBD");
        o oVarA19 = v.a("BY", "BYR");
        o oVarA20 = v.a("BE", "EUR");
        o oVarA21 = v.a("BZ", "BZD");
        o oVarA22 = v.a("BJ", "XOF");
        o oVarA23 = v.a("BM", "BMD");
        String str2 = PCRzgdeK.esL;
        conversions = M.j(oVarA, oVarA2, oVarA3, oVarA4, oVarA5, oVarA6, oVarA7, oVarA8, oVarA9, oVarA10, oVarA11, oVarA12, oVarA13, oVarA14, oVarA15, oVarA16, oVarA17, oVarA18, oVarA19, oVarA20, oVarA21, oVarA22, oVarA23, v.a("BT", str2), v.a("BO", "BOB"), v.a("BQ", str), v.a("BA", "BAM"), v.a("BW", "BWP"), v.a("BV", "NOK"), v.a("BR", "BRL"), v.a("IO", str), v.a("BN", "BND"), v.a("BG", "BGN"), v.a(ryTuoS.KBG, "XOF"), v.a("BI", "BIF"), v.a("KH", "KHR"), v.a("CM", "XAF"), v.a("CA", "CAD"), v.a("CV", "CVE"), v.a("KY", "KYD"), v.a(XRlnZWSrAFn.IgcWdNVh, "XAF"), v.a("TD", "XAF"), v.a("CL", "CLP"), v.a("CN", "CNY"), v.a("CX", "AUD"), v.a("CC", "AUD"), v.a("CO", "COP"), v.a("KM", Oitvkwcwn.xswGKwxeaXoflg), v.a("CG", "XAF"), v.a(eGwOBWCdOTaKus.DRgrRXQjfp, "NZD"), v.a("CR", "CRC"), v.a("HR", "HRK"), v.a("CU", "CUP"), v.a("CW", "ANG"), v.a("CY", "EUR"), v.a("CZ", "CZK"), v.a("CI", "XOF"), v.a("DK", "DKK"), v.a("DJ", "DJF"), v.a("DM", "XCD"), v.a("DO", "DOP"), v.a("EC", str), v.a("EG", toqHM.hdgvMlYTUb), v.a("SV", str), v.a("GQ", "XAF"), v.a("ER", "ERN"), v.a("EE", "EUR"), v.a("ET", "ETB"), v.a("FK", "FKP"), v.a("FO", "DKK"), v.a("FJ", "FJD"), v.a("FI", "EUR"), v.a("FR", "EUR"), v.a("GF", "EUR"), v.a("PF", "XPF"), v.a("TF", "EUR"), v.a("GA", "XAF"), v.a("GM", "GMD"), v.a("GE", "GEL"), v.a("DE", "EUR"), v.a("GH", "GHS"), v.a("GI", "GIP"), v.a("GR", "EUR"), v.a(GOKsbdzhLhXAMt.fbMXiUMI, "DKK"), v.a("GD", "XCD"), v.a("GP", "EUR"), v.a("GU", str), v.a("GT", "GTQ"), v.a("GG", "GBP"), v.a("GN", "GNF"), v.a(jULK.jMOLqVb, "XOF"), v.a("GY", "GYD"), v.a(kDsnNkYbBsI.CYRBZyGjyzIXUWt, str), v.a("HM", "AUD"), v.a("VA", "EUR"), v.a("HN", "HNL"), v.a("HK", "HKD"), v.a("HU", "HUF"), v.a("IS", "ISK"), v.a("IN", str2), v.a("ID", "IDR"), v.a("IR", "IRR"), v.a("IQ", "IQD"), v.a("IE", "EUR"), v.a("IM", "GBP"), v.a("IL", "ILS"), v.a("IT", "EUR"), v.a("JM", "JMD"), v.a("JP", "JPY"), v.a("JE", "GBP"), v.a("JO", "JOD"), v.a("KZ", "KZT"), v.a("KE", "KES"), v.a("KI", "AUD"), v.a("KP", "KPW"), v.a("KR", "KRW"), v.a("KW", "KWD"), v.a("KG", "KGS"), v.a("LA", "LAK"), v.a("LV", "EUR"), v.a("LB", mHPawN.bbl), v.a("LS", "ZAR"), v.a("LR", "LRD"), v.a("LY", "LYD"), v.a("LI", "CHF"), v.a("LT", "EUR"), v.a("LU", "EUR"), v.a("MO", "MOP"), v.a("MK", "MKD"), v.a("MG", "MGA"), v.a("MW", "MWK"), v.a("MY", "MYR"), v.a("MV", "MVR"), v.a("ML", "XOF"), v.a("MT", "EUR"), v.a("MH", str), v.a("MQ", "EUR"), v.a("MR", dCqzKmEghGTQ.rvzxc), v.a("MU", "MUR"), v.a("YT", "EUR"), v.a("MX", "MXN"), v.a("FM", str), v.a("MD", "MDL"), v.a("MC", "EUR"), v.a("MN", "MNT"), v.a("ME", "EUR"), v.a("MS", "XCD"), v.a("MA", "MAD"), v.a("MZ", "MZN"), v.a("MM", "MMK"), v.a("NA", "ZAR"), v.a("NR", "AUD"), v.a("NP", "NPR"), v.a("NL", "EUR"), v.a("NC", "XPF"), v.a("NZ", "NZD"), v.a("NI", "NIO"), v.a("NE", "XOF"), v.a("NG", "NGN"), v.a("NU", "NZD"), v.a("NF", "AUD"), v.a("MP", str), v.a("NO", "NOK"), v.a("OM", "OMR"), v.a("PK", "PKR"), v.a("PW", str), v.a("PA", str), v.a("PG", XRlnZWSrAFn.QNb), v.a("PY", "PYG"), v.a("PE", "PEN"), v.a("PH", "PHP"), v.a("PN", "NZD"), v.a("PL", "PLN"), v.a("PT", "EUR"), v.a("PR", str), v.a("QA", "QAR"), v.a("RO", "RON"), v.a("RU", "RUB"), v.a("RW", "RWF"), v.a(cFAYKUlMj.lQGKjrzwiUtCTg, "EUR"), v.a("BL", "EUR"), v.a("SH", "SHP"), v.a("KN", "XCD"), v.a("LC", "XCD"), v.a("MF", "EUR"), v.a("PM", "EUR"), v.a("VC", "XCD"), v.a("WS", "WST"), v.a("SM", "EUR"), v.a("ST", "STD"), v.a("SA", "SAR"), v.a("SN", "XOF"), v.a("RS", "RSD"), v.a("SC", "SCR"), v.a("SL", efuWFSeiT.uWzCPpg), v.a("SG", mHPawN.pRchqY), v.a("SX", "ANG"), v.a("SK", "EUR"), v.a(PCRzgdeK.FWbTR, "EUR"), v.a("SB", "SBD"), v.a("SO", "SOS"), v.a("ZA", "ZAR"), v.a("SS", "SSP"), v.a("ES", "EUR"), v.a("LK", "LKR"), v.a("SD", "SDG"), v.a("SR", "SRD"), v.a("SJ", "NOK"), v.a("SZ", "SZL"), v.a("SE", "SEK"), v.a("CH", "CHF"), v.a("SY", "SYP"), v.a("TW", "TWD"), v.a("TJ", "TJS"), v.a("TZ", "TZS"), v.a("TH", "THB"), v.a("TL", str), v.a("TG", "XOF"), v.a("TK", "NZD"), v.a("TO", "TOP"), v.a("TT", "TTD"), v.a("TN", "TND"), v.a("TR", "TRY"), v.a("TM", "TMT"), v.a("TC", str), v.a(ajyWhveMDgQ.fHCivee, "AUD"), v.a(BpgIURjN.DfWOUmkQ, SZCvugJaXc.brtZHYOjpiejjr), v.a("UA", "UAH"), v.a("AE", "AED"), v.a("GB", "GBP"), v.a("US", str), v.a("UM", str), v.a("UY", Oitvkwcwn.nfcrvuXc), v.a("UZ", "UZS"), v.a("VU", "VUV"), v.a("VE", "VEF"), v.a("VN", "VND"), v.a("VG", str), v.a("VI", str), v.a("WF", "XPF"), v.a("EH", "MAD"), v.a("YE", "YER"), v.a("ZM", "ZMW"), v.a("ZW", "ZWL"), v.a("AX", "EUR"));
    }

    private ISO3166Alpha2ToISO42170Converter() {
    }

    public final String convertOrEmpty(String iso3166Alpha2Code) {
        t.g(iso3166Alpha2Code, "iso3166Alpha2Code");
        String str = conversions.get(iso3166Alpha2Code);
        return str == null ? "" : str;
    }
}
