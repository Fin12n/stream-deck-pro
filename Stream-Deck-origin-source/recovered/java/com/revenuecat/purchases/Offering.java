package com.revenuecat.purchases;

import C6.j;
import C6.k;
import com.revenuecat.purchases.paywalls.PaywallData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Offering {
    private final j annual$delegate;
    private final List<Package> availablePackages;
    private final String identifier;
    private final j lifetime$delegate;
    private final Map<String, Object> metadata;
    private final j monthly$delegate;
    private final PaywallData paywall;
    private final String serverDescription;
    private final j sixMonth$delegate;
    private final j threeMonth$delegate;
    private final j twoMonth$delegate;
    private final j weekly$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Offering(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages) {
        this(identifier, serverDescription, metadata, availablePackages, null, 16, null);
        t.g(identifier, "identifier");
        t.g(serverDescription, "serverDescription");
        t.g(metadata, "metadata");
        t.g(availablePackages, "availablePackages");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Offering copy$default(Offering offering, String str, String str2, Map map, List list, PaywallData paywallData, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = offering.identifier;
        }
        if ((i8 & 2) != 0) {
            str2 = offering.serverDescription;
        }
        if ((i8 & 4) != 0) {
            map = offering.metadata;
        }
        if ((i8 & 8) != 0) {
            list = offering.availablePackages;
        }
        if ((i8 & 16) != 0) {
            paywallData = offering.paywall;
        }
        PaywallData paywallData2 = paywallData;
        Map map2 = map;
        return offering.copy(str, str2, map2, list, paywallData2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Package findPackage(PackageType packageType) {
        Object next;
        Iterator<T> it = this.availablePackages.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (t.c(((Package) next).getIdentifier(), packageType.getIdentifier())) {
                return (Package) next;
            }
        }
        next = null;
        return (Package) next;
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.serverDescription;
    }

    public final Map<String, Object> component3() {
        return this.metadata;
    }

    public final List<Package> component4() {
        return this.availablePackages;
    }

    public final PaywallData component5() {
        return this.paywall;
    }

    public final Offering copy(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages, PaywallData paywallData) {
        t.g(identifier, "identifier");
        t.g(serverDescription, "serverDescription");
        t.g(metadata, "metadata");
        t.g(availablePackages, "availablePackages");
        return new Offering(identifier, serverDescription, metadata, availablePackages, paywallData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offering)) {
            return false;
        }
        Offering offering = (Offering) obj;
        return t.c(this.identifier, offering.identifier) && t.c(this.serverDescription, offering.serverDescription) && t.c(this.metadata, offering.metadata) && t.c(this.availablePackages, offering.availablePackages) && t.c(this.paywall, offering.paywall);
    }

    public final Package get(String s8) {
        t.g(s8, "s");
        return getPackage(s8);
    }

    public final Package getAnnual() {
        return (Package) this.annual$delegate.getValue();
    }

    public final List<Package> getAvailablePackages() {
        return this.availablePackages;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Package getLifetime() {
        return (Package) this.lifetime$delegate.getValue();
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final String getMetadataString(String key, String str) {
        t.g(key, "key");
        t.g(str, "default");
        Object obj = this.metadata.get(key);
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? str : str2;
    }

    public final Package getMonthly() {
        return (Package) this.monthly$delegate.getValue();
    }

    public final Package getPackage(String identifier) {
        t.g(identifier, "identifier");
        for (Package r8 : this.availablePackages) {
            if (t.c(r8.getIdentifier(), identifier)) {
                return r8;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final PaywallData getPaywall() {
        return this.paywall;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public final Package getSixMonth() {
        return (Package) this.sixMonth$delegate.getValue();
    }

    public final Package getThreeMonth() {
        return (Package) this.threeMonth$delegate.getValue();
    }

    public final Package getTwoMonth() {
        return (Package) this.twoMonth$delegate.getValue();
    }

    public final Package getWeekly() {
        return (Package) this.weekly$delegate.getValue();
    }

    public int hashCode() {
        int iHashCode = ((((((this.identifier.hashCode() * 31) + this.serverDescription.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.availablePackages.hashCode()) * 31;
        PaywallData paywallData = this.paywall;
        return iHashCode + (paywallData == null ? 0 : paywallData.hashCode());
    }

    public String toString() {
        return "Offering(identifier=" + this.identifier + ", serverDescription=" + this.serverDescription + ", metadata=" + this.metadata + ", availablePackages=" + this.availablePackages + ", paywall=" + this.paywall + ')';
    }

    public Offering(String identifier, String serverDescription, Map<String, ? extends Object> metadata, List<Package> availablePackages, PaywallData paywallData) {
        t.g(identifier, "identifier");
        t.g(serverDescription, "serverDescription");
        t.g(metadata, "metadata");
        t.g(availablePackages, "availablePackages");
        this.identifier = identifier;
        this.serverDescription = serverDescription;
        this.metadata = metadata;
        this.availablePackages = availablePackages;
        this.paywall = paywallData;
        this.lifetime$delegate = k.b(new Offering$lifetime$2(this));
        this.annual$delegate = k.b(new Offering$annual$2(this));
        this.sixMonth$delegate = k.b(new Offering$sixMonth$2(this));
        this.threeMonth$delegate = k.b(new Offering$threeMonth$2(this));
        this.twoMonth$delegate = k.b(new Offering$twoMonth$2(this));
        this.monthly$delegate = k.b(new Offering$monthly$2(this));
        this.weekly$delegate = k.b(new Offering$weekly$2(this));
    }

    public /* synthetic */ Offering(String str, String str2, Map map, List list, PaywallData paywallData, int i8, AbstractC2633k abstractC2633k) {
        this(str, str2, map, list, (i8 & 16) != 0 ? null : paywallData);
    }
}
