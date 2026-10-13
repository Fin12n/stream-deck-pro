package com.revenuecat.purchases.amazon;

import C6.InterfaceC0916e;
import E4.JFpq.XRlnZWSrAFn;
import M6.eLZq.eGwOBWCdOTaKus;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class AmazonStoreProduct implements StoreProduct {
    private final SubscriptionOption defaultOption;
    private final String description;
    private final Period freeTrialPeriod;
    private final String iconUrl;
    private final String id;
    private final String name;
    private final JSONObject originalProductJSON;
    private final Period period;
    private final PresentedOfferingContext presentedOfferingContext;
    private final Price price;
    private final SubscriptionOptions subscriptionOptions;
    private final String title;
    private final ProductType type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmazonStoreProduct(String id, ProductType type, String name, String title, String description, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String iconUrl, Period period2, JSONObject jSONObject) {
        this(id, type, name, title, description, period, price, subscriptionOptions, subscriptionOption, iconUrl, period2, jSONObject, null, 4096, null);
        t.g(id, "id");
        t.g(type, "type");
        t.g(name, "name");
        t.g(title, "title");
        t.g(description, "description");
        t.g(price, "price");
        t.g(iconUrl, "iconUrl");
        t.g(jSONObject, XRlnZWSrAFn.mIBcBSwOgNnxa);
    }

    public static /* synthetic */ AmazonStoreProduct copy$default(AmazonStoreProduct amazonStoreProduct, String str, ProductType productType, String str2, String str3, String str4, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str5, Period period2, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = amazonStoreProduct.id;
        }
        return amazonStoreProduct.copy(str, (i8 & 2) != 0 ? amazonStoreProduct.type : productType, (i8 & 4) != 0 ? amazonStoreProduct.name : str2, (i8 & 8) != 0 ? amazonStoreProduct.title : str3, (i8 & 16) != 0 ? amazonStoreProduct.description : str4, (i8 & 32) != 0 ? amazonStoreProduct.period : period, (i8 & 64) != 0 ? amazonStoreProduct.price : price, (i8 & 128) != 0 ? amazonStoreProduct.subscriptionOptions : subscriptionOptions, (i8 & 256) != 0 ? amazonStoreProduct.defaultOption : subscriptionOption, (i8 & 512) != 0 ? amazonStoreProduct.iconUrl : str5, (i8 & 1024) != 0 ? amazonStoreProduct.freeTrialPeriod : period2, (i8 & 2048) != 0 ? amazonStoreProduct.originalProductJSON : jSONObject, (i8 & 4096) != 0 ? amazonStoreProduct.presentedOfferingContext : presentedOfferingContext);
    }

    @InterfaceC0916e
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    @InterfaceC0916e
    public static /* synthetic */ void getSku$annotations() {
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.iconUrl;
    }

    public final Period component11() {
        return this.freeTrialPeriod;
    }

    public final JSONObject component12() {
        return this.originalProductJSON;
    }

    public final PresentedOfferingContext component13() {
        return this.presentedOfferingContext;
    }

    public final ProductType component2() {
        return this.type;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.description;
    }

    public final Period component6() {
        return this.period;
    }

    public final Price component7() {
        return this.price;
    }

    public final SubscriptionOptions component8() {
        return this.subscriptionOptions;
    }

    public final SubscriptionOption component9() {
        return this.defaultOption;
    }

    public final AmazonStoreProduct copy(String id, ProductType type, String name, String title, String description, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String iconUrl, Period period2, JSONObject originalProductJSON, PresentedOfferingContext presentedOfferingContext) {
        t.g(id, "id");
        t.g(type, "type");
        t.g(name, "name");
        t.g(title, "title");
        t.g(description, "description");
        t.g(price, "price");
        t.g(iconUrl, "iconUrl");
        t.g(originalProductJSON, "originalProductJSON");
        return new AmazonStoreProduct(id, type, name, title, description, period, price, subscriptionOptions, subscriptionOption, iconUrl, period2, originalProductJSON, presentedOfferingContext);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    @InterfaceC0916e
    public StoreProduct copyWithOfferingId(String offeringId) {
        String str;
        PresentedOfferingContext presentedOfferingContext;
        t.g(offeringId, "offeringId");
        PresentedOfferingContext presentedOfferingContext2 = getPresentedOfferingContext();
        if (presentedOfferingContext2 != null) {
            str = offeringId;
            presentedOfferingContext = PresentedOfferingContext.copy$default(presentedOfferingContext2, str, null, null, 6, null);
            if (presentedOfferingContext == null) {
            }
            return copyWithPresentedOfferingContext(presentedOfferingContext);
        }
        str = offeringId;
        presentedOfferingContext = new PresentedOfferingContext(str);
        return copyWithPresentedOfferingContext(presentedOfferingContext);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithPresentedOfferingContext(PresentedOfferingContext presentedOfferingContext) {
        return new AmazonStoreProduct(getId(), getType(), getName(), getTitle(), getDescription(), getPeriod(), getPrice(), getSubscriptionOptions(), getDefaultOption(), this.iconUrl, this.freeTrialPeriod, this.originalProductJSON, presentedOfferingContext);
    }

    public boolean equals(Object obj) {
        return (obj instanceof AmazonStoreProduct) && t.c(new ComparableData(this), new ComparableData((AmazonStoreProduct) obj));
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String formattedPricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.formattedPricePerMonth(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getDescription() {
        return this.description;
    }

    public final Period getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getId() {
        return this.id;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getName() {
        return this.name;
    }

    public final JSONObject getOriginalProductJSON() {
        return this.originalProductJSON;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Period getPeriod() {
        return this.period;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price getPrice() {
        return this.price;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getSku() {
        return getId();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getTitle() {
        return this.title;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        return new ComparableData(this).hashCode();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerMonth(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerWeek(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerWeek(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerYear(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerYear(this, locale);
    }

    public String toString() {
        return "AmazonStoreProduct(id=" + this.id + ", type=" + this.type + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", period=" + this.period + ", price=" + this.price + ", subscriptionOptions=" + this.subscriptionOptions + ", defaultOption=" + this.defaultOption + ", iconUrl=" + this.iconUrl + ", freeTrialPeriod=" + this.freeTrialPeriod + ", originalProductJSON=" + this.originalProductJSON + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    public AmazonStoreProduct(String id, ProductType type, String name, String title, String str, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String iconUrl, Period period2, JSONObject originalProductJSON, PresentedOfferingContext presentedOfferingContext) {
        t.g(id, "id");
        t.g(type, "type");
        t.g(name, "name");
        t.g(title, "title");
        t.g(str, eGwOBWCdOTaKus.IqGmN);
        t.g(price, "price");
        t.g(iconUrl, "iconUrl");
        t.g(originalProductJSON, "originalProductJSON");
        this.id = id;
        this.type = type;
        this.name = name;
        this.title = title;
        this.description = str;
        this.period = period;
        this.price = price;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.iconUrl = iconUrl;
        this.freeTrialPeriod = period2;
        this.originalProductJSON = originalProductJSON;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public AmazonPurchasingData getPurchasingData() {
        return new AmazonPurchasingData.Product(this);
    }

    public /* synthetic */ AmazonStoreProduct(String str, ProductType productType, String str2, String str3, String str4, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str5, Period period2, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext, int i8, AbstractC2633k abstractC2633k) {
        this(str, productType, str2, str3, str4, period, price, subscriptionOptions, subscriptionOption, str5, period2, jSONObject, (i8 & 4096) != 0 ? null : presentedOfferingContext);
    }

    public /* synthetic */ AmazonStoreProduct(String str, ProductType productType, String str2, String str3, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str4, Period period2, JSONObject jSONObject, String str5, int i8, AbstractC2633k abstractC2633k) {
        this(str, productType, str2, str3, period, price, subscriptionOptions, subscriptionOption, str4, period2, jSONObject, (i8 & 2048) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0916e
    public AmazonStoreProduct(String id, ProductType type, String title, String description, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String iconUrl, Period period2, JSONObject originalProductJSON, String str) {
        this(id, type, title, title, description, period, price, subscriptionOptions, subscriptionOption, iconUrl, period2, originalProductJSON, str != null ? new PresentedOfferingContext(str) : null);
        t.g(id, "id");
        t.g(type, "type");
        t.g(title, "title");
        t.g(description, "description");
        t.g(price, "price");
        t.g(iconUrl, "iconUrl");
        t.g(originalProductJSON, "originalProductJSON");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0916e
    public AmazonStoreProduct(String id, ProductType type, String name, String title, String description, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String iconUrl, Period period2, JSONObject originalProductJSON, String presentedOfferingIdentifier) {
        this(id, type, name, title, description, period, price, subscriptionOptions, subscriptionOption, iconUrl, period2, originalProductJSON, new PresentedOfferingContext(presentedOfferingIdentifier));
        t.g(id, "id");
        t.g(type, "type");
        t.g(name, "name");
        t.g(title, "title");
        t.g(description, "description");
        t.g(price, "price");
        t.g(iconUrl, "iconUrl");
        t.g(originalProductJSON, "originalProductJSON");
        t.g(presentedOfferingIdentifier, "presentedOfferingIdentifier");
    }
}
