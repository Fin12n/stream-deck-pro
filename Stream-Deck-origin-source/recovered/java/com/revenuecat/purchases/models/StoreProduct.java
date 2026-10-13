package com.revenuecat.purchases.models;

import C6.InterfaceC0916e;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.utils.PriceExtensionsKt;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface StoreProduct {
    @InterfaceC0916e
    StoreProduct copyWithOfferingId(String str);

    StoreProduct copyWithPresentedOfferingContext(PresentedOfferingContext presentedOfferingContext);

    String formattedPricePerMonth(Locale locale);

    SubscriptionOption getDefaultOption();

    String getDescription();

    String getId();

    String getName();

    Period getPeriod();

    PresentedOfferingContext getPresentedOfferingContext();

    String getPresentedOfferingIdentifier();

    Price getPrice();

    PurchasingData getPurchasingData();

    String getSku();

    SubscriptionOptions getSubscriptionOptions();

    String getTitle();

    ProductType getType();

    Price pricePerMonth(Locale locale);

    Price pricePerWeek(Locale locale);

    Price pricePerYear(Locale locale);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class DefaultImpls {
        public static String formattedPricePerMonth(StoreProduct storeProduct, Locale locale) {
            t.g(locale, "locale");
            Price pricePricePerMonth = storeProduct.pricePerMonth(locale);
            if (pricePricePerMonth != null) {
                return pricePricePerMonth.getFormatted();
            }
            return null;
        }

        public static /* synthetic */ String formattedPricePerMonth$default(StoreProduct storeProduct, Locale locale, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formattedPricePerMonth");
            }
            if ((i8 & 1) != 0) {
                locale = Locale.getDefault();
                t.f(locale, "getDefault()");
            }
            return storeProduct.formattedPricePerMonth(locale);
        }

        public static Price pricePerMonth(StoreProduct storeProduct, Locale locale) {
            t.g(locale, "locale");
            Period period = storeProduct.getPeriod();
            if (period != null) {
                return PriceExtensionsKt.pricePerMonth(storeProduct.getPrice(), period, locale);
            }
            return null;
        }

        public static /* synthetic */ Price pricePerMonth$default(StoreProduct storeProduct, Locale locale, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pricePerMonth");
            }
            if ((i8 & 1) != 0) {
                locale = Locale.getDefault();
                t.f(locale, "getDefault()");
            }
            return storeProduct.pricePerMonth(locale);
        }

        public static Price pricePerWeek(StoreProduct storeProduct, Locale locale) {
            t.g(locale, "locale");
            Period period = storeProduct.getPeriod();
            if (period != null) {
                return PriceExtensionsKt.pricePerWeek(storeProduct.getPrice(), period, locale);
            }
            return null;
        }

        public static /* synthetic */ Price pricePerWeek$default(StoreProduct storeProduct, Locale locale, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pricePerWeek");
            }
            if ((i8 & 1) != 0) {
                locale = Locale.getDefault();
                t.f(locale, "getDefault()");
            }
            return storeProduct.pricePerWeek(locale);
        }

        public static Price pricePerYear(StoreProduct storeProduct, Locale locale) {
            t.g(locale, "locale");
            Period period = storeProduct.getPeriod();
            if (period != null) {
                return PriceExtensionsKt.pricePerYear(storeProduct.getPrice(), period, locale);
            }
            return null;
        }

        public static /* synthetic */ Price pricePerYear$default(StoreProduct storeProduct, Locale locale, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pricePerYear");
            }
            if ((i8 & 1) != 0) {
                locale = Locale.getDefault();
                t.f(locale, "getDefault()");
            }
            return storeProduct.pricePerYear(locale);
        }

        @InterfaceC0916e
        public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
        }

        @InterfaceC0916e
        public static /* synthetic */ void getSku$annotations() {
        }
    }
}
