package com.revenuecat.purchases.models;

import C6.m;
import R0.pkXL.Oitvkwcwn;
import com.android.billingclient.api.f;
import com.revenuecat.purchases.ProductType;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class GooglePurchasingData implements PurchasingData {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class InAppProduct extends GooglePurchasingData {
        private final f productDetails;
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InAppProduct(String productId, f productDetails) {
            super(null);
            t.g(productId, "productId");
            t.g(productDetails, "productDetails");
            this.productId = productId;
            this.productDetails = productDetails;
        }

        public static /* synthetic */ InAppProduct copy$default(InAppProduct inAppProduct, String str, f fVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = inAppProduct.productId;
            }
            if ((i8 & 2) != 0) {
                fVar = inAppProduct.productDetails;
            }
            return inAppProduct.copy(str, fVar);
        }

        public final String component1() {
            return this.productId;
        }

        public final f component2() {
            return this.productDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InAppProduct)) {
                return false;
            }
            InAppProduct inAppProduct = (InAppProduct) obj;
            return t.c(this.productId, inAppProduct.productId) && t.c(this.productDetails, inAppProduct.productDetails);
        }

        public final f getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return (this.productId.hashCode() * 31) + this.productDetails.hashCode();
        }

        public String toString() {
            return "InAppProduct(productId=" + this.productId + ", productDetails=" + this.productDetails + ')';
        }

        public final InAppProduct copy(String productId, f fVar) {
            t.g(productId, "productId");
            t.g(fVar, Oitvkwcwn.fnw);
            return new InAppProduct(productId, fVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Subscription extends GooglePurchasingData {
        private final String optionId;
        private final f productDetails;
        private final String productId;
        private final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subscription(String productId, String optionId, f productDetails, String token) {
            super(null);
            t.g(productId, "productId");
            t.g(optionId, "optionId");
            t.g(productDetails, "productDetails");
            t.g(token, "token");
            this.productId = productId;
            this.optionId = optionId;
            this.productDetails = productDetails;
            this.token = token;
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, String str2, f fVar, String str3, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = subscription.productId;
            }
            if ((i8 & 2) != 0) {
                str2 = subscription.optionId;
            }
            if ((i8 & 4) != 0) {
                fVar = subscription.productDetails;
            }
            if ((i8 & 8) != 0) {
                str3 = subscription.token;
            }
            return subscription.copy(str, str2, fVar, str3);
        }

        public final String component1() {
            return this.productId;
        }

        public final String component2() {
            return this.optionId;
        }

        public final f component3() {
            return this.productDetails;
        }

        public final String component4() {
            return this.token;
        }

        public final Subscription copy(String productId, String optionId, f productDetails, String token) {
            t.g(productId, "productId");
            t.g(optionId, "optionId");
            t.g(productDetails, "productDetails");
            t.g(token, "token");
            return new Subscription(productId, optionId, productDetails, token);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            return t.c(this.productId, subscription.productId) && t.c(this.optionId, subscription.optionId) && t.c(this.productDetails, subscription.productDetails) && t.c(this.token, subscription.token);
        }

        public final String getOptionId() {
            return this.optionId;
        }

        public final f getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            return (((((this.productId.hashCode() * 31) + this.optionId.hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.token.hashCode();
        }

        public String toString() {
            return "Subscription(productId=" + this.productId + ", optionId=" + this.optionId + hJroAgFztiMK.dMp + this.productDetails + ", token=" + this.token + ')';
        }
    }

    public /* synthetic */ GooglePurchasingData(AbstractC2633k abstractC2633k) {
        this();
    }

    @Override // com.revenuecat.purchases.models.PurchasingData
    public ProductType getProductType() {
        if (this instanceof InAppProduct) {
            return ProductType.INAPP;
        }
        if (this instanceof Subscription) {
            return ProductType.SUBS;
        }
        throw new m();
    }

    private GooglePurchasingData() {
    }
}
