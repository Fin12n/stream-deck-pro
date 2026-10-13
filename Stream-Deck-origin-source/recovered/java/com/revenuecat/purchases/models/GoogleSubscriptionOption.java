package com.revenuecat.purchases.models;

import C6.InterfaceC0916e;
import Z6.w;
import com.android.billingclient.api.f;
import com.revenuecat.purchases.PresentedOfferingContext;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class GoogleSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final GoogleInstallmentsInfo installmentsInfo;
    private final String offerId;
    private final String offerToken;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<PricingPhase> pricingPhases;
    private final f productDetails;
    private final String productId;
    private final List<String> tags;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, f productDetails, String offerToken) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, null, null, 384, null);
        t.g(productId, "productId");
        t.g(basePlanId, "basePlanId");
        t.g(pricingPhases, "pricingPhases");
        t.g(tags, "tags");
        t.g(productDetails, "productDetails");
        t.g(offerToken, "offerToken");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoogleSubscriptionOption copy$default(GoogleSubscriptionOption googleSubscriptionOption, String str, String str2, String str3, List list, List list2, f fVar, String str4, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = googleSubscriptionOption.productId;
        }
        if ((i8 & 2) != 0) {
            str2 = googleSubscriptionOption.basePlanId;
        }
        if ((i8 & 4) != 0) {
            str3 = googleSubscriptionOption.offerId;
        }
        if ((i8 & 8) != 0) {
            list = googleSubscriptionOption.pricingPhases;
        }
        if ((i8 & 16) != 0) {
            list2 = googleSubscriptionOption.tags;
        }
        if ((i8 & 32) != 0) {
            fVar = googleSubscriptionOption.productDetails;
        }
        if ((i8 & 64) != 0) {
            str4 = googleSubscriptionOption.offerToken;
        }
        if ((i8 & 128) != 0) {
            presentedOfferingContext = googleSubscriptionOption.presentedOfferingContext;
        }
        if ((i8 & 256) != 0) {
            googleInstallmentsInfo = googleSubscriptionOption.installmentsInfo;
        }
        PresentedOfferingContext presentedOfferingContext2 = presentedOfferingContext;
        GoogleInstallmentsInfo googleInstallmentsInfo2 = googleInstallmentsInfo;
        f fVar2 = fVar;
        String str5 = str4;
        List list3 = list2;
        String str6 = str3;
        return googleSubscriptionOption.copy(str, str2, str6, list, list3, fVar2, str5, presentedOfferingContext2, googleInstallmentsInfo2);
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.basePlanId;
    }

    public final String component3() {
        return this.offerId;
    }

    public final List<PricingPhase> component4() {
        return this.pricingPhases;
    }

    public final List<String> component5() {
        return this.tags;
    }

    public final f component6() {
        return this.productDetails;
    }

    public final String component7() {
        return this.offerToken;
    }

    public final PresentedOfferingContext component8() {
        return this.presentedOfferingContext;
    }

    public final GoogleInstallmentsInfo component9() {
        return this.installmentsInfo;
    }

    public final GoogleSubscriptionOption copy(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, f productDetails, String offerToken, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo) {
        t.g(productId, "productId");
        t.g(basePlanId, "basePlanId");
        t.g(pricingPhases, "pricingPhases");
        t.g(tags, "tags");
        t.g(productDetails, "productDetails");
        t.g(offerToken, "offerToken");
        return new GoogleSubscriptionOption(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, presentedOfferingContext, googleInstallmentsInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleSubscriptionOption)) {
            return false;
        }
        GoogleSubscriptionOption googleSubscriptionOption = (GoogleSubscriptionOption) obj;
        return t.c(this.productId, googleSubscriptionOption.productId) && t.c(this.basePlanId, googleSubscriptionOption.basePlanId) && t.c(this.offerId, googleSubscriptionOption.offerId) && t.c(this.pricingPhases, googleSubscriptionOption.pricingPhases) && t.c(this.tags, googleSubscriptionOption.tags) && t.c(this.productDetails, googleSubscriptionOption.productDetails) && t.c(this.offerToken, googleSubscriptionOption.offerToken) && t.c(this.presentedOfferingContext, googleSubscriptionOption.presentedOfferingContext) && t.c(this.installmentsInfo, googleSubscriptionOption.installmentsInfo);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public Period getBillingPeriod() {
        return SubscriptionOption.DefaultImpls.getBillingPeriod(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getFreePhase() {
        return SubscriptionOption.DefaultImpls.getFreePhase(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getFullPricePhase() {
        return SubscriptionOption.DefaultImpls.getFullPricePhase(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getId() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.basePlanId);
        String str2 = this.offerId;
        if (str2 == null || w.b0(str2)) {
            str = "";
        } else {
            str = ':' + this.offerId;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getIntroPhase() {
        return SubscriptionOption.DefaultImpls.getIntroPhase(this);
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final f getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PurchasingData getPurchasingData() {
        return new GooglePurchasingData.Subscription(this.productId, getId(), this.productDetails, this.offerToken);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iHashCode = ((this.productId.hashCode() * 31) + this.basePlanId.hashCode()) * 31;
        String str = this.offerId;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.pricingPhases.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.offerToken.hashCode()) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int iHashCode3 = (iHashCode2 + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode())) * 31;
        GoogleInstallmentsInfo googleInstallmentsInfo = this.installmentsInfo;
        return iHashCode3 + (googleInstallmentsInfo != null ? googleInstallmentsInfo.hashCode() : 0);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isBasePlan() {
        return SubscriptionOption.DefaultImpls.isBasePlan(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isPrepaid() {
        return SubscriptionOption.DefaultImpls.isPrepaid(this);
    }

    public String toString() {
        return "GoogleSubscriptionOption(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", pricingPhases=" + this.pricingPhases + ", tags=" + this.tags + ", productDetails=" + this.productDetails + ", offerToken=" + this.offerToken + ", presentedOfferingContext=" + this.presentedOfferingContext + ", installmentsInfo=" + this.installmentsInfo + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, f productDetails, String offerToken, PresentedOfferingContext presentedOfferingContext) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, presentedOfferingContext, null, 256, null);
        t.g(productId, "productId");
        t.g(basePlanId, "basePlanId");
        t.g(pricingPhases, "pricingPhases");
        t.g(tags, "tags");
        t.g(productDetails, "productDetails");
        t.g(offerToken, "offerToken");
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public GoogleInstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, f productDetails, String offerToken, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo) {
        t.g(productId, "productId");
        t.g(basePlanId, "basePlanId");
        t.g(pricingPhases, "pricingPhases");
        t.g(tags, "tags");
        t.g(productDetails, "productDetails");
        t.g(offerToken, "offerToken");
        this.productId = productId;
        this.basePlanId = basePlanId;
        this.offerId = str;
        this.pricingPhases = pricingPhases;
        this.tags = tags;
        this.productDetails = productDetails;
        this.offerToken = offerToken;
        this.presentedOfferingContext = presentedOfferingContext;
        this.installmentsInfo = googleInstallmentsInfo;
    }

    public /* synthetic */ GoogleSubscriptionOption(String str, String str2, String str3, List list, List list2, f fVar, String str4, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo, int i8, AbstractC2633k abstractC2633k) {
        this(str, str2, str3, list, list2, fVar, str4, (i8 & 128) != 0 ? null : presentedOfferingContext, (i8 & 256) != 0 ? null : googleInstallmentsInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0916e
    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, f productDetails, String offerToken, String presentedOfferingId) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, new PresentedOfferingContext(presentedOfferingId), null, 256, null);
        t.g(productId, "productId");
        t.g(basePlanId, "basePlanId");
        t.g(pricingPhases, "pricingPhases");
        t.g(tags, "tags");
        t.g(productDetails, "productDetails");
        t.g(offerToken, "offerToken");
        t.g(presentedOfferingId, "presentedOfferingId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(GoogleSubscriptionOption subscriptionOption, PresentedOfferingContext presentedOfferingContext) {
        this(subscriptionOption.productId, subscriptionOption.basePlanId, subscriptionOption.offerId, subscriptionOption.getPricingPhases(), subscriptionOption.getTags(), subscriptionOption.productDetails, subscriptionOption.offerToken, presentedOfferingContext, subscriptionOption.getInstallmentsInfo());
        t.g(subscriptionOption, "subscriptionOption");
    }

    @InterfaceC0916e
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }
}
