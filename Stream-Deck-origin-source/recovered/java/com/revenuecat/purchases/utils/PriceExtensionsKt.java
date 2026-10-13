package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PriceExtensionsKt {
    private static final double MICRO_MULTIPLIER = 1000000.0d;

    public static final Price pricePerMonth(Price price, Period billingPeriod, Locale locale) {
        t.g(price, "<this>");
        t.g(billingPeriod, "billingPeriod");
        t.g(locale, "locale");
        return pricePerPeriod(price, billingPeriod.getValueInMonths(), locale);
    }

    private static final Price pricePerPeriod(Price price, double d8, Locale locale) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(price.getCurrencyCode()));
        double amountMicros = price.getAmountMicros() / d8;
        String formatted = currencyInstance.format(amountMicros / MICRO_MULTIPLIER);
        t.f(formatted, "formatted");
        return new Price(formatted, (long) amountMicros, price.getCurrencyCode());
    }

    public static final Price pricePerWeek(Price price, Period billingPeriod, Locale locale) {
        t.g(price, "<this>");
        t.g(billingPeriod, "billingPeriod");
        t.g(locale, "locale");
        return pricePerPeriod(price, billingPeriod.getValueInWeeks$purchases_defaultsRelease(), locale);
    }

    public static final Price pricePerYear(Price price, Period billingPeriod, Locale locale) {
        t.g(price, "<this>");
        t.g(billingPeriod, "billingPeriod");
        t.g(locale, "locale");
        return pricePerPeriod(price, billingPeriod.getValueInYears$purchases_defaultsRelease(), locale);
    }
}
