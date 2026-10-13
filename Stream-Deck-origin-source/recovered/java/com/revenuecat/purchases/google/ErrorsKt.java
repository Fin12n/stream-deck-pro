package com.revenuecat.purchases.google;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.HTTPClient;
import java.lang.reflect.Field;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ErrorsKt {
    public static final String IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE = "Google Play In-app Billing API version is less than 3";

    public static final PurchasesError billingResponseToPurchasesError(int i8, String underlyingErrorMessage) {
        PurchasesErrorCode purchasesErrorCode;
        t.g(underlyingErrorMessage, "underlyingErrorMessage");
        if (i8 != 12) {
            switch (i8) {
                case -3:
                case HTTPClient.NO_STATUS_CODE /* -1 */:
                case 2:
                case 6:
                    purchasesErrorCode = PurchasesErrorCode.StoreProblemError;
                    break;
                case -2:
                case 3:
                case 8:
                    purchasesErrorCode = PurchasesErrorCode.PurchaseNotAllowedError;
                    break;
                case 0:
                    purchasesErrorCode = PurchasesErrorCode.UnknownError;
                    break;
                case 1:
                    purchasesErrorCode = PurchasesErrorCode.PurchaseCancelledError;
                    break;
                case 4:
                    purchasesErrorCode = PurchasesErrorCode.ProductNotAvailableForPurchaseError;
                    break;
                case 5:
                    purchasesErrorCode = PurchasesErrorCode.PurchaseInvalidError;
                    break;
                case 7:
                    purchasesErrorCode = PurchasesErrorCode.ProductAlreadyPurchasedError;
                    break;
                default:
                    purchasesErrorCode = PurchasesErrorCode.UnknownError;
                    break;
            }
        } else {
            purchasesErrorCode = PurchasesErrorCode.NetworkError;
        }
        return new PurchasesError(purchasesErrorCode, underlyingErrorMessage);
    }

    public static final String getBillingResponseCodeName(int i8) {
        Field field;
        Field[] allPossibleBillingResponseCodes = com.android.billingclient.api.a.InterfaceC0415a.class.getDeclaredFields();
        t.f(allPossibleBillingResponseCodes, "allPossibleBillingResponseCodes");
        int length = allPossibleBillingResponseCodes.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                field = null;
                break;
            }
            field = allPossibleBillingResponseCodes[i9];
            if (field.getInt(field) == i8) {
                break;
            }
            i9++;
        }
        String name = field != null ? field.getName() : null;
        return name == null ? String.valueOf(i8) : name;
    }
}
