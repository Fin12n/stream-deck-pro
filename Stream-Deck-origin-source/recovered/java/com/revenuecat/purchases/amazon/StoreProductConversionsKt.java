package com.revenuecat.purchases.amazon;

import D6.z;
import Z6.u;
import Z6.v;
import Z6.w;
import Z6.y;
import com.amazon.a.a.o.b.f;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class StoreProductConversionsKt {
    private static final Pattern pattern;

    static {
        Pattern patternCompile = Pattern.compile("(\\d+[[\\.,\\s]\\d+]*)");
        t.f(patternCompile, "compile(\"(\\\\d+[[\\\\.,\\\\s]\\\\d+]*)\")");
        pattern = patternCompile;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Period createPeriod(String str) {
        String str2;
        Integer numM;
        t.g(str, "<this>");
        switch (str.hashCode()) {
            case -2115097178:
                if (str.equals("BiMonthly")) {
                    return new Period(2, Period.Unit.MONTH, "P2M");
                }
                break;
            case -1707840351:
                if (str.equals("Weekly")) {
                    return new Period(1, Period.Unit.WEEK, "P1W");
                }
                break;
            case -1393678355:
                if (str.equals("Monthly")) {
                    return new Period(1, Period.Unit.MONTH, "P1M");
                }
                break;
            case -580032564:
                if (str.equals("Annually")) {
                    return new Period(1, Period.Unit.YEAR, "P1Y");
                }
                break;
            case -308855462:
                if (str.equals("SemiAnnually")) {
                    return new Period(6, Period.Unit.MONTH, "P6M");
                }
                break;
            case 347098056:
                if (str.equals("BiWeekly")) {
                    return new Period(2, Period.Unit.WEEK, "P2W");
                }
                break;
            case 937940249:
                if (str.equals("Quarterly")) {
                    return new Period(3, Period.Unit.MONTH, "P3M");
                }
                break;
        }
        List listA0 = w.A0(str, new String[]{" "}, false, 0, 6, null);
        if (listA0.size() != 2) {
            listA0 = null;
        }
        if (listA0 == null || (str2 = (String) z.k0(listA0)) == null || (numM = u.m(str2)) == null) {
            return null;
        }
        int iIntValue = numM.intValue();
        String strValueOf = String.valueOf(y.a1((CharSequence) listA0.get(1)));
        t.e(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        t.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return Period.Factory.create('P' + iIntValue + upperCase);
    }

    public static final Price createPrice(String str, String marketplace) {
        t.g(str, "<this>");
        t.g(marketplace, "marketplace");
        BigDecimal priceNumeric = parsePriceUsingRegex(str);
        if (priceNumeric == null) {
            priceNumeric = BigDecimal.ZERO;
        }
        t.f(priceNumeric, "priceNumeric");
        BigDecimal bigDecimalMultiply = priceNumeric.multiply(new BigDecimal(UtilsKt.MICROS_MULTIPLIER));
        t.f(bigDecimalMultiply, "this.multiply(other)");
        return new Price(str, bigDecimalMultiply.longValue(), ISO3166Alpha2ToISO42170Converter.INSTANCE.convertOrEmpty(marketplace));
    }

    public static final BigDecimal parsePriceUsingRegex(String str) {
        String strD;
        t.g(str, "<this>");
        Matcher matcher = pattern.matcher(str);
        if ((matcher.find() ? matcher : null) == null) {
            return null;
        }
        String dirtyPrice = matcher.group();
        t.f(dirtyPrice, "dirtyPrice");
        String string = w.W0(v.D(v.D(v.D(dirtyPrice, " ", "", false, 4, null), " ", "", false, 4, null), " ", "", false, 4, null)).toString();
        List listA0 = w.A0(string, new String[]{".", f.f16777a}, false, 0, 6, null);
        if (listA0.size() != 1) {
            if (((String) z.t0(listA0)).length() == 3) {
                strD = v.D(v.D(string, ".", "", false, 4, null), f.f16777a, "", false, 4, null);
            } else {
                strD = z.r0(z.e0(listA0, 1), "", null, null, 0, null, null, 62, null) + com.amazon.a.a.o.c.a.b.f16789a + ((String) z.t0(listA0));
            }
            string = strD;
        }
        return new BigDecimal(w.W0(string).toString());
    }

    public static final StoreProduct toStoreProduct(Product product, String marketplace) {
        t.g(product, "<this>");
        t.g(marketplace, "marketplace");
        if (product.getPrice() == null) {
            LogIntent logIntent = LogIntent.AMAZON_ERROR;
            String str = String.format(AmazonStrings.PRODUCT_PRICE_MISSING, Arrays.copyOf(new Object[]{product.getSku()}, 1));
            t.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            return null;
        }
        String price = product.getPrice();
        t.f(price, "price");
        Price priceCreatePrice = createPrice(price, marketplace);
        String sku = product.getSku();
        t.f(sku, "sku");
        ProductType productType = product.getProductType();
        t.f(productType, "productType");
        com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
        String title = product.getTitle();
        t.f(title, "title");
        String title2 = product.getTitle();
        t.f(title2, "title");
        String description = product.getDescription();
        t.f(description, "description");
        String subscriptionPeriod = product.getSubscriptionPeriod();
        Period periodCreatePeriod = subscriptionPeriod != null ? createPeriod(subscriptionPeriod) : null;
        String smallIconUrl = product.getSmallIconUrl();
        t.f(smallIconUrl, "smallIconUrl");
        String freeTrialPeriod = product.getFreeTrialPeriod();
        Period periodCreatePeriod2 = freeTrialPeriod != null ? createPeriod(freeTrialPeriod) : null;
        JSONObject json = product.toJSON();
        t.f(json, "this.toJSON()");
        return new AmazonStoreProduct(sku, revenueCatProductType, title, title2, description, periodCreatePeriod, priceCreatePrice, (SubscriptionOptions) null, (SubscriptionOption) null, smallIconUrl, periodCreatePeriod2, json, (PresentedOfferingContext) null);
    }
}
