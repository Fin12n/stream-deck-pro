package com.revenuecat.purchases;

import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
final class ComparableData {
    private final Map<String, Date> allExpirationDatesByProduct;
    private final Map<String, Date> allPurchaseDatesByProduct;
    private final EntitlementInfos entitlements;
    private final Date firstSeen;
    private final String originalAppUserId;
    private final Date originalPurchaseDate;
    private final int schemaVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public ComparableData(EntitlementInfos entitlements, Map<String, ? extends Date> allExpirationDatesByProduct, Map<String, ? extends Date> allPurchaseDatesByProduct, int i8, Date firstSeen, String originalAppUserId, Date date) {
        t.g(entitlements, "entitlements");
        t.g(allExpirationDatesByProduct, "allExpirationDatesByProduct");
        t.g(allPurchaseDatesByProduct, "allPurchaseDatesByProduct");
        t.g(firstSeen, "firstSeen");
        t.g(originalAppUserId, "originalAppUserId");
        this.entitlements = entitlements;
        this.allExpirationDatesByProduct = allExpirationDatesByProduct;
        this.allPurchaseDatesByProduct = allPurchaseDatesByProduct;
        this.schemaVersion = i8;
        this.firstSeen = firstSeen;
        this.originalAppUserId = originalAppUserId;
        this.originalPurchaseDate = date;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComparableData copy$default(ComparableData comparableData, EntitlementInfos entitlementInfos, Map map, Map map2, int i8, Date date, String str, Date date2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            entitlementInfos = comparableData.entitlements;
        }
        if ((i9 & 2) != 0) {
            map = comparableData.allExpirationDatesByProduct;
        }
        if ((i9 & 4) != 0) {
            map2 = comparableData.allPurchaseDatesByProduct;
        }
        if ((i9 & 8) != 0) {
            i8 = comparableData.schemaVersion;
        }
        if ((i9 & 16) != 0) {
            date = comparableData.firstSeen;
        }
        if ((i9 & 32) != 0) {
            str = comparableData.originalAppUserId;
        }
        if ((i9 & 64) != 0) {
            date2 = comparableData.originalPurchaseDate;
        }
        String str2 = str;
        Date date3 = date2;
        Date date4 = date;
        Map map3 = map2;
        return comparableData.copy(entitlementInfos, map, map3, i8, date4, str2, date3);
    }

    public final EntitlementInfos component1() {
        return this.entitlements;
    }

    public final Map<String, Date> component2() {
        return this.allExpirationDatesByProduct;
    }

    public final Map<String, Date> component3() {
        return this.allPurchaseDatesByProduct;
    }

    public final int component4() {
        return this.schemaVersion;
    }

    public final Date component5() {
        return this.firstSeen;
    }

    public final String component6() {
        return this.originalAppUserId;
    }

    public final Date component7() {
        return this.originalPurchaseDate;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparableData)) {
            return false;
        }
        ComparableData comparableData = (ComparableData) obj;
        return t.c(this.entitlements, comparableData.entitlements) && t.c(this.allExpirationDatesByProduct, comparableData.allExpirationDatesByProduct) && t.c(this.allPurchaseDatesByProduct, comparableData.allPurchaseDatesByProduct) && this.schemaVersion == comparableData.schemaVersion && t.c(this.firstSeen, comparableData.firstSeen) && t.c(this.originalAppUserId, comparableData.originalAppUserId) && t.c(this.originalPurchaseDate, comparableData.originalPurchaseDate);
    }

    public final Map<String, Date> getAllExpirationDatesByProduct() {
        return this.allExpirationDatesByProduct;
    }

    public final Map<String, Date> getAllPurchaseDatesByProduct() {
        return this.allPurchaseDatesByProduct;
    }

    public final EntitlementInfos getEntitlements() {
        return this.entitlements;
    }

    public final Date getFirstSeen() {
        return this.firstSeen;
    }

    public final String getOriginalAppUserId() {
        return this.originalAppUserId;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.entitlements.hashCode() * 31) + this.allExpirationDatesByProduct.hashCode()) * 31) + this.allPurchaseDatesByProduct.hashCode()) * 31) + Integer.hashCode(this.schemaVersion)) * 31) + this.firstSeen.hashCode()) * 31) + this.originalAppUserId.hashCode()) * 31;
        Date date = this.originalPurchaseDate;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public String toString() {
        return "ComparableData(entitlements=" + this.entitlements + ", allExpirationDatesByProduct=" + this.allExpirationDatesByProduct + ", allPurchaseDatesByProduct=" + this.allPurchaseDatesByProduct + ", schemaVersion=" + this.schemaVersion + ", firstSeen=" + this.firstSeen + ", originalAppUserId=" + this.originalAppUserId + ", originalPurchaseDate=" + this.originalPurchaseDate + ')';
    }

    public final ComparableData copy(EntitlementInfos entitlements, Map<String, ? extends Date> allExpirationDatesByProduct, Map<String, ? extends Date> allPurchaseDatesByProduct, int i8, Date date, String originalAppUserId, Date date2) {
        t.g(entitlements, "entitlements");
        t.g(allExpirationDatesByProduct, "allExpirationDatesByProduct");
        t.g(allPurchaseDatesByProduct, "allPurchaseDatesByProduct");
        t.g(date, LYdqVGvOGMNr.xMhwRLVsutRvV);
        t.g(originalAppUserId, "originalAppUserId");
        return new ComparableData(entitlements, allExpirationDatesByProduct, allPurchaseDatesByProduct, i8, date, originalAppUserId, date2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComparableData(CustomerInfo customerInfo) {
        this(customerInfo.getEntitlements(), customerInfo.getAllExpirationDatesByProduct(), customerInfo.getAllPurchaseDatesByProduct(), customerInfo.getSchemaVersion(), customerInfo.getFirstSeen(), customerInfo.getOriginalAppUserId(), customerInfo.getOriginalPurchaseDate());
        t.g(customerInfo, "customerInfo");
    }
}
