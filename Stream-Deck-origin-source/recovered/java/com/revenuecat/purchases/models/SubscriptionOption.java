package com.revenuecat.purchases.models;

import C6.InterfaceC0916e;
import D6.z;
import com.revenuecat.purchases.PresentedOfferingContext;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface SubscriptionOption {
    Period getBillingPeriod();

    PricingPhase getFreePhase();

    PricingPhase getFullPricePhase();

    String getId();

    InstallmentsInfo getInstallmentsInfo();

    PricingPhase getIntroPhase();

    PresentedOfferingContext getPresentedOfferingContext();

    String getPresentedOfferingIdentifier();

    List<PricingPhase> getPricingPhases();

    PurchasingData getPurchasingData();

    List<String> getTags();

    boolean isBasePlan();

    boolean isPrepaid();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class DefaultImpls {
        public static Period getBillingPeriod(SubscriptionOption subscriptionOption) {
            PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
            if (fullPricePhase != null) {
                return fullPricePhase.getBillingPeriod();
            }
            return null;
        }

        public static PricingPhase getFreePhase(SubscriptionOption subscriptionOption) {
            Object next;
            Iterator it = z.e0(subscriptionOption.getPricingPhases(), 1).iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((PricingPhase) next).getPrice().getAmountMicros() == 0) {
                    return (PricingPhase) next;
                }
            }
            next = null;
            return (PricingPhase) next;
        }

        public static PricingPhase getFullPricePhase(SubscriptionOption subscriptionOption) {
            return (PricingPhase) z.u0(subscriptionOption.getPricingPhases());
        }

        public static PricingPhase getIntroPhase(SubscriptionOption subscriptionOption) {
            Object next;
            Iterator it = z.e0(subscriptionOption.getPricingPhases(), 1).iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((PricingPhase) next).getPrice().getAmountMicros() > 0) {
                    return (PricingPhase) next;
                }
            }
            next = null;
            return (PricingPhase) next;
        }

        public static boolean isBasePlan(SubscriptionOption subscriptionOption) {
            return subscriptionOption.getPricingPhases().size() == 1;
        }

        public static boolean isPrepaid(SubscriptionOption subscriptionOption) {
            PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
            return (fullPricePhase != null ? fullPricePhase.getRecurrenceMode() : null) == RecurrenceMode.NON_RECURRING;
        }

        @InterfaceC0916e
        public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
        }
    }
}
