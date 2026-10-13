package com.revenuecat.purchases.models;

import C6.InterfaceC0916e;
import D6.C0937q;
import D6.r;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class TestStoreProduct implements StoreProduct {
    private final String description;
    private final Period freeTrialPeriod;
    private final String id;
    private final Price introPrice;
    private final String name;
    private final Period period;
    private final Price price;
    private final String title;

    public TestStoreProduct(String id, String name, String title, String description, Price price, Period period, Period period2, Price price2) {
        t.g(id, "id");
        t.g(name, "name");
        t.g(title, "title");
        t.g(description, "description");
        t.g(price, "price");
        this.id = id;
        this.name = name;
        this.title = title;
        this.description = description;
        this.price = price;
        this.period = period;
        this.freeTrialPeriod = period2;
        this.introPrice = price2;
    }

    private final SubscriptionOptions buildSubscriptionOptions() {
        if (getPeriod() == null) {
            return null;
        }
        Period period = this.freeTrialPeriod;
        PricingPhase pricingPhase = period != null ? new PricingPhase(period, RecurrenceMode.FINITE_RECURRING, 1, new Price("Free", 0L, getPrice().getCurrencyCode())) : null;
        Price price = this.introPrice;
        PricingPhase pricingPhase2 = price != null ? new PricingPhase(new Period(1, Period.Unit.MONTH, "P1M"), RecurrenceMode.FINITE_RECURRING, 1, price) : null;
        PricingPhase pricingPhase3 = new PricingPhase(getPeriod(), RecurrenceMode.INFINITE_RECURRING, null, getPrice());
        return new SubscriptionOptions(r.s((this.freeTrialPeriod == null && pricingPhase2 == null) ? null : new TestSubscriptionOption(getId(), r.s(pricingPhase, pricingPhase2, pricingPhase3), null, null, null, null, 60, null), new TestSubscriptionOption(getId(), C0937q.e(pricingPhase3), null, null, null, null, 60, null)));
    }

    private final Period component7() {
        return this.freeTrialPeriod;
    }

    private final Price component8() {
        return this.introPrice;
    }

    public static /* synthetic */ TestStoreProduct copy$default(TestStoreProduct testStoreProduct, String str, String str2, String str3, String str4, Price price, Period period, Period period2, Price price2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = testStoreProduct.id;
        }
        if ((i8 & 2) != 0) {
            str2 = testStoreProduct.name;
        }
        if ((i8 & 4) != 0) {
            str3 = testStoreProduct.title;
        }
        if ((i8 & 8) != 0) {
            str4 = testStoreProduct.description;
        }
        if ((i8 & 16) != 0) {
            price = testStoreProduct.price;
        }
        if ((i8 & 32) != 0) {
            period = testStoreProduct.period;
        }
        if ((i8 & 64) != 0) {
            period2 = testStoreProduct.freeTrialPeriod;
        }
        if ((i8 & 128) != 0) {
            price2 = testStoreProduct.introPrice;
        }
        Period period3 = period2;
        Price price3 = price2;
        Price price4 = price;
        Period period4 = period;
        return testStoreProduct.copy(str, str2, str3, str4, price4, period4, period3, price3);
    }

    @InterfaceC0916e
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final Price component5() {
        return this.price;
    }

    public final Period component6() {
        return this.period;
    }

    public final TestStoreProduct copy(String id, String name, String title, String description, Price price, Period period, Period period2, Price price2) {
        t.g(id, "id");
        t.g(name, "name");
        t.g(title, "title");
        t.g(description, "description");
        t.g(price, "price");
        return new TestStoreProduct(id, name, title, description, price, period, period2, price2);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    @InterfaceC0916e
    public StoreProduct copyWithOfferingId(String offeringId) {
        t.g(offeringId, "offeringId");
        return copyWithPresentedOfferingContext(new PresentedOfferingContext(offeringId));
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithPresentedOfferingContext(PresentedOfferingContext presentedOfferingContext) {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestStoreProduct)) {
            return false;
        }
        TestStoreProduct testStoreProduct = (TestStoreProduct) obj;
        return t.c(this.id, testStoreProduct.id) && t.c(this.name, testStoreProduct.name) && t.c(this.title, testStoreProduct.title) && t.c(this.description, testStoreProduct.description) && t.c(this.price, testStoreProduct.price) && t.c(this.period, testStoreProduct.period) && t.c(this.freeTrialPeriod, testStoreProduct.freeTrialPeriod) && t.c(this.introPrice, testStoreProduct.introPrice);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String formattedPricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.formattedPricePerMonth(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOption getDefaultOption() {
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null) {
            return subscriptionOptions.getDefaultOffer();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getDescription() {
        return this.description;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getId() {
        return this.id;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getName() {
        return this.name;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Period getPeriod() {
        return this.period;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public PresentedOfferingContext getPresentedOfferingContext() {
        return null;
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
    public PurchasingData getPurchasingData() {
        return new PurchasingData() { // from class: com.revenuecat.purchases.models.TestStoreProduct$purchasingData$1
            @Override // com.revenuecat.purchases.models.PurchasingData
            public String getProductId() {
                return this.this$0.getId();
            }

            @Override // com.revenuecat.purchases.models.PurchasingData
            public ProductType getProductType() {
                return this.this$0.getType();
            }
        };
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getSku() {
        return getId();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOptions getSubscriptionOptions() {
        return buildSubscriptionOptions();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getTitle() {
        return this.title;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public ProductType getType() {
        return getPeriod() == null ? ProductType.INAPP : ProductType.SUBS;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.price.hashCode()) * 31;
        Period period = this.period;
        int iHashCode2 = (iHashCode + (period == null ? 0 : period.hashCode())) * 31;
        Period period2 = this.freeTrialPeriod;
        int iHashCode3 = (iHashCode2 + (period2 == null ? 0 : period2.hashCode())) * 31;
        Price price = this.introPrice;
        return iHashCode3 + (price != null ? price.hashCode() : 0);
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
        return "TestStoreProduct(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", price=" + this.price + uYOhHhTXuF.AmYvjcUbDgzkuF + this.period + ", freeTrialPeriod=" + this.freeTrialPeriod + ", introPrice=" + this.introPrice + ')';
    }

    public /* synthetic */ TestStoreProduct(String str, String str2, String str3, String str4, Price price, Period period, Period period2, Price price2, int i8, AbstractC2633k abstractC2633k) {
        this(str, str2, str3, str4, price, period, (i8 & 64) != 0 ? null : period2, (i8 & 128) != 0 ? null : price2);
    }

    public /* synthetic */ TestStoreProduct(String str, String str2, String str3, Price price, Period period, Period period2, Price price2, int i8, AbstractC2633k abstractC2633k) {
        this(str, str2, str3, price, period, (i8 & 32) != 0 ? null : period2, (i8 & 64) != 0 ? null : price2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0916e
    public TestStoreProduct(String id, String title, String description, Price price, Period period, Period period2, Price price2) {
        this(id, title, title, description, price, period, period2, price2);
        t.g(id, "id");
        t.g(title, "title");
        t.g(description, "description");
        t.g(price, "price");
    }
}
