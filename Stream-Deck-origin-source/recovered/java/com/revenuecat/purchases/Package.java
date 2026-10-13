package com.revenuecat.purchases;

import C6.InterfaceC0916e;
import Z.JTT.ryTuoS;
import com.revenuecat.purchases.models.StoreProduct;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Package {
    private final String identifier;
    private final PackageType packageType;
    private final PresentedOfferingContext presentedOfferingContext;
    private final StoreProduct product;

    public Package(String identifier, PackageType packageType, StoreProduct product, PresentedOfferingContext presentedOfferingContext) {
        t.g(identifier, "identifier");
        t.g(packageType, "packageType");
        t.g(product, "product");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        this.identifier = identifier;
        this.packageType = packageType;
        this.product = product;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public static /* synthetic */ Package copy$default(Package r8, String str, PackageType packageType, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = r8.identifier;
        }
        if ((i8 & 2) != 0) {
            packageType = r8.packageType;
        }
        if ((i8 & 4) != 0) {
            storeProduct = r8.product;
        }
        if ((i8 & 8) != 0) {
            presentedOfferingContext = r8.presentedOfferingContext;
        }
        return r8.copy(str, packageType, storeProduct, presentedOfferingContext);
    }

    @InterfaceC0916e
    public static /* synthetic */ void getOffering$annotations() {
    }

    public final String component1() {
        return this.identifier;
    }

    public final PackageType component2() {
        return this.packageType;
    }

    public final StoreProduct component3() {
        return this.product;
    }

    public final PresentedOfferingContext component4() {
        return this.presentedOfferingContext;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Package)) {
            return false;
        }
        Package r8 = (Package) obj;
        return t.c(this.identifier, r8.identifier) && this.packageType == r8.packageType && t.c(this.product, r8.product) && t.c(this.presentedOfferingContext, r8.presentedOfferingContext);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getOffering() {
        String offeringIdentifier = this.presentedOfferingContext.getOfferingIdentifier();
        return offeringIdentifier == null ? "" : offeringIdentifier;
    }

    public final PackageType getPackageType() {
        return this.packageType;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final StoreProduct getProduct() {
        return this.product;
    }

    public int hashCode() {
        return (((((this.identifier.hashCode() * 31) + this.packageType.hashCode()) * 31) + this.product.hashCode()) * 31) + this.presentedOfferingContext.hashCode();
    }

    public String toString() {
        return "Package(identifier=" + this.identifier + ", packageType=" + this.packageType + ", product=" + this.product + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }

    public final Package copy(String identifier, PackageType packageType, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        t.g(identifier, "identifier");
        t.g(packageType, "packageType");
        t.g(storeProduct, ryTuoS.hLGSpf);
        t.g(presentedOfferingContext, "presentedOfferingContext");
        return new Package(identifier, packageType, storeProduct, presentedOfferingContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC0916e
    public Package(String identifier, PackageType packageType, StoreProduct product, String offering) {
        this(identifier, packageType, product, new PresentedOfferingContext(offering));
        t.g(identifier, "identifier");
        t.g(packageType, "packageType");
        t.g(product, "product");
        t.g(offering, "offering");
    }
}
