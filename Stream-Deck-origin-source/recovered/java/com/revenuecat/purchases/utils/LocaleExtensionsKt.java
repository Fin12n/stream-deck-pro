package com.revenuecat.purchases.utils;

import D6.C0934n;
import P1.g;
import Z6.v;
import com.revenuecat.purchases.common.LogUtilsKt;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class LocaleExtensionsKt {
    public static final Locale convertToCorrectlyFormattedLocale(Locale locale) {
        t.g(locale, "<this>");
        String string = locale.toString();
        t.f(string, "toString()");
        return toLocale(string);
    }

    public static final List<Locale> getDefaultLocales() {
        g gVarD = g.d();
        t.f(gVarD, "getDefault()");
        return toList(gVarD);
    }

    private static final String inferScript(Locale locale) {
        String country;
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            String script2 = locale.getScript();
            t.f(script2, "script");
            return script2;
        }
        if (t.c(locale.getLanguage(), "zh") && (country = locale.getCountry()) != null) {
            int iHashCode = country.hashCode();
            if (iHashCode != 2155) {
                if (iHashCode != 2307) {
                    if (iHashCode != 2466) {
                        if (iHashCode != 2644) {
                            if (iHashCode == 2691 && country.equals("TW")) {
                                return "Hant";
                            }
                        } else if (country.equals("SG")) {
                            return "Hans";
                        }
                    } else if (country.equals("MO")) {
                        return "Hant";
                    }
                } else if (country.equals("HK")) {
                    return "Hant";
                }
            } else if (country.equals("CN")) {
                return "Hans";
            }
        }
        return "";
    }

    public static final boolean sharedLanguageCodeWith(Locale locale, Locale locale2) {
        t.g(locale, "<this>");
        t.g(locale2, "locale");
        try {
            return t.c(locale.getISO3Language(), locale2.getISO3Language()) && t.c(inferScript(locale), inferScript(locale2));
        } catch (MissingResourceException e8) {
            LogUtilsKt.errorLog$default("Locale " + locale + " or " + locale2 + " can't obtain ISO3 language code (" + e8 + "). Falling back to language.", null, 2, null);
            return t.c(locale.getLanguage(), locale2.getLanguage());
        }
    }

    private static final List<Locale> toList(g gVar) {
        int iG = gVar.g();
        Locale[] localeArr = new Locale[iG];
        for (int i8 = 0; i8 < iG; i8++) {
            localeArr[i8] = gVar.c(i8);
        }
        return C0934n.L(localeArr);
    }

    public static final Locale toLocale(String str) {
        t.g(str, "<this>");
        Locale localeForLanguageTag = Locale.forLanguageTag(v.D(str, "_", "-", false, 4, null));
        t.f(localeForLanguageTag, "forLanguageTag(replace(\"_\", \"-\"))");
        return localeForLanguageTag;
    }
}
