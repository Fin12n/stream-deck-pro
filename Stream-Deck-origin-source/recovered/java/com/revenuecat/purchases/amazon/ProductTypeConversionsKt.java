package com.revenuecat.purchases.amazon;

import C6.m;
import com.amazon.device.iap.model.ProductType;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ProductTypeConversionsKt {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.CONSUMABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.ENTITLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.SUBSCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final com.revenuecat.purchases.ProductType toRevenueCatProductType(ProductType productType) {
        t.g(productType, "<this>");
        int i8 = WhenMappings.$EnumSwitchMapping$0[productType.ordinal()];
        if (i8 == 1) {
            return com.revenuecat.purchases.ProductType.INAPP;
        }
        if (i8 == 2) {
            return com.revenuecat.purchases.ProductType.INAPP;
        }
        if (i8 == 3) {
            return com.revenuecat.purchases.ProductType.SUBS;
        }
        throw new m();
    }
}
