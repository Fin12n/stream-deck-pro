package com.revenuecat.purchases.google;

import C6.m;
import com.revenuecat.purchases.models.PurchaseState;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseStateConversionsKt {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchaseState.values().length];
            try {
                iArr[PurchaseState.UNSPECIFIED_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseState.PURCHASED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseState.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toGooglePurchaseState(PurchaseState purchaseState) {
        t.g(purchaseState, "<this>");
        int i8 = WhenMappings.$EnumSwitchMapping$0[purchaseState.ordinal()];
        if (i8 == 1) {
            return 0;
        }
        if (i8 == 2) {
            return 1;
        }
        if (i8 == 3) {
            return 2;
        }
        throw new m();
    }

    public static final PurchaseState toRevenueCatPurchaseState(int i8) {
        if (i8 == 0) {
            return PurchaseState.UNSPECIFIED_STATE;
        }
        if (i8 != 1) {
            return i8 != 2 ? PurchaseState.UNSPECIFIED_STATE : PurchaseState.PENDING;
        }
        return PurchaseState.PURCHASED;
    }
}
