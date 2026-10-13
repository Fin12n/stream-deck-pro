package com.revenuecat.purchases;

import T0.Vl.PCRzgdeK;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Offerings {
    private final Map<String, Offering> all;
    private final Offering current;
    private final Placements placements;
    private final Targeting targeting;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Placements {
        private final String fallbackOfferingId;
        private final Map<String, String> offeringIdsByPlacement;

        public Placements(String str, Map<String, String> offeringIdsByPlacement) {
            t.g(offeringIdsByPlacement, "offeringIdsByPlacement");
            this.fallbackOfferingId = str;
            this.offeringIdsByPlacement = offeringIdsByPlacement;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Placements copy$default(Placements placements, String str, Map map, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = placements.fallbackOfferingId;
            }
            if ((i8 & 2) != 0) {
                map = placements.offeringIdsByPlacement;
            }
            return placements.copy(str, map);
        }

        public final String component1() {
            return this.fallbackOfferingId;
        }

        public final Map<String, String> component2() {
            return this.offeringIdsByPlacement;
        }

        public final Placements copy(String str, Map<String, String> offeringIdsByPlacement) {
            t.g(offeringIdsByPlacement, "offeringIdsByPlacement");
            return new Placements(str, offeringIdsByPlacement);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Placements)) {
                return false;
            }
            Placements placements = (Placements) obj;
            return t.c(this.fallbackOfferingId, placements.fallbackOfferingId) && t.c(this.offeringIdsByPlacement, placements.offeringIdsByPlacement);
        }

        public final String getFallbackOfferingId() {
            return this.fallbackOfferingId;
        }

        public final Map<String, String> getOfferingIdsByPlacement() {
            return this.offeringIdsByPlacement;
        }

        public int hashCode() {
            String str = this.fallbackOfferingId;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.offeringIdsByPlacement.hashCode();
        }

        public String toString() {
            return "Placements(fallbackOfferingId=" + this.fallbackOfferingId + PCRzgdeK.QQL + this.offeringIdsByPlacement + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Targeting {
        private final int revision;
        private final String ruleId;

        public Targeting(int i8, String ruleId) {
            t.g(ruleId, "ruleId");
            this.revision = i8;
            this.ruleId = ruleId;
        }

        public static /* synthetic */ Targeting copy$default(Targeting targeting, int i8, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i8 = targeting.revision;
            }
            if ((i9 & 2) != 0) {
                str = targeting.ruleId;
            }
            return targeting.copy(i8, str);
        }

        public final int component1() {
            return this.revision;
        }

        public final String component2() {
            return this.ruleId;
        }

        public final Targeting copy(int i8, String ruleId) {
            t.g(ruleId, "ruleId");
            return new Targeting(i8, ruleId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Targeting)) {
                return false;
            }
            Targeting targeting = (Targeting) obj;
            return this.revision == targeting.revision && t.c(this.ruleId, targeting.ruleId);
        }

        public final int getRevision() {
            return this.revision;
        }

        public final String getRuleId() {
            return this.ruleId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.revision) * 31) + this.ruleId.hashCode();
        }

        public String toString() {
            return "Targeting(revision=" + this.revision + ", ruleId=" + this.ruleId + ')';
        }
    }

    public Offerings(Offering offering, Map<String, Offering> all, Placements placements, Targeting targeting) {
        t.g(all, "all");
        this.current = offering;
        this.all = all;
        this.placements = placements;
        this.targeting = targeting;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Offerings copy$default(Offerings offerings, Offering offering, Map map, Placements placements, Targeting targeting, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            offering = offerings.current;
        }
        if ((i8 & 2) != 0) {
            map = offerings.all;
        }
        if ((i8 & 4) != 0) {
            placements = offerings.placements;
        }
        if ((i8 & 8) != 0) {
            targeting = offerings.targeting;
        }
        return offerings.copy(offering, map, placements, targeting);
    }

    public final Offering component1() {
        return this.current;
    }

    public final Map<String, Offering> component2() {
        return this.all;
    }

    public final Placements component3$purchases_defaultsRelease() {
        return this.placements;
    }

    public final Targeting component4$purchases_defaultsRelease() {
        return this.targeting;
    }

    public final Offerings copy(Offering offering, Map<String, Offering> all, Placements placements, Targeting targeting) {
        t.g(all, "all");
        return new Offerings(offering, all, placements, targeting);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offerings)) {
            return false;
        }
        Offerings offerings = (Offerings) obj;
        return t.c(this.current, offerings.current) && t.c(this.all, offerings.all) && t.c(this.placements, offerings.placements) && t.c(this.targeting, offerings.targeting);
    }

    public final Offering get(String identifier) {
        t.g(identifier, "identifier");
        return getOffering(identifier);
    }

    public final Map<String, Offering> getAll() {
        return this.all;
    }

    public final Offering getCurrent() {
        return this.current;
    }

    public final Offering getCurrentOfferingForPlacement(String placementId) {
        t.g(placementId, "placementId");
        Placements placements = this.placements;
        if (placements == null) {
            return null;
        }
        String str = placements.getOfferingIdsByPlacement().get(placementId);
        Offering offering = str != null ? getOffering(str) : null;
        String fallbackOfferingId = placements.getFallbackOfferingId();
        Offering offering2 = fallbackOfferingId != null ? getOffering(fallbackOfferingId) : null;
        boolean zContainsKey = placements.getOfferingIdsByPlacement().containsKey(placementId);
        if (offering == null) {
            offering = zContainsKey ? null : offering2;
        }
        if (offering != null) {
            return OfferingsKt.withPresentedContext(offering, placementId, this.targeting);
        }
        return null;
    }

    public final Offering getOffering(String identifier) {
        t.g(identifier, "identifier");
        return this.all.get(identifier);
    }

    public final Placements getPlacements$purchases_defaultsRelease() {
        return this.placements;
    }

    public final Targeting getTargeting$purchases_defaultsRelease() {
        return this.targeting;
    }

    public int hashCode() {
        Offering offering = this.current;
        int iHashCode = (((offering == null ? 0 : offering.hashCode()) * 31) + this.all.hashCode()) * 31;
        Placements placements = this.placements;
        int iHashCode2 = (iHashCode + (placements == null ? 0 : placements.hashCode())) * 31;
        Targeting targeting = this.targeting;
        return iHashCode2 + (targeting != null ? targeting.hashCode() : 0);
    }

    public String toString() {
        return "Offerings(current=" + this.current + ", all=" + this.all + ", placements=" + this.placements + ", targeting=" + this.targeting + ')';
    }

    public /* synthetic */ Offerings(Offering offering, Map map, Placements placements, Targeting targeting, int i8, AbstractC2633k abstractC2633k) {
        this(offering, map, (i8 & 4) != 0 ? null : placements, (i8 & 8) != 0 ? null : targeting);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Offerings(Offering offering, Map<String, Offering> map) {
        this(offering, map, null, null);
        t.g(map, BpgIURjN.TaEIqEFOoQ);
    }
}
