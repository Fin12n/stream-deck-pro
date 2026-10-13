package com.revenuecat.purchases.paywalls.events;

import C6.InterfaceC0916e;
import com.revenuecat.purchases.utils.JsonElementExtensionsKt;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import o7.f;
import p116m7.b;
import p116m7.i;
import p7.d;
import q7.AbstractC2872x0;
import q7.I0;
import r7.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@i
public final class PaywallPostReceiptData {
    public static final Companion Companion = new Companion(null);
    private static final c.a json = c.f32534d;
    private final boolean darkMode;
    private final String displayMode;
    private final String localeIdentifier;
    private final String offeringId;
    private final int revision;
    private final String sessionID;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        public final c.a getJson() {
            return PaywallPostReceiptData.json;
        }

        public final b serializer() {
            return PaywallPostReceiptData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0916e
    public /* synthetic */ PaywallPostReceiptData(int i8, String str, int i9, String str2, boolean z8, String str3, String str4, I0 i10) {
        if (63 != (i8 & 63)) {
            AbstractC2872x0.a(i8, 63, PaywallPostReceiptData$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionID = str;
        this.revision = i9;
        this.displayMode = str2;
        this.darkMode = z8;
        this.localeIdentifier = str3;
        this.offeringId = str4;
    }

    public static /* synthetic */ PaywallPostReceiptData copy$default(PaywallPostReceiptData paywallPostReceiptData, String str, int i8, String str2, boolean z8, String str3, String str4, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = paywallPostReceiptData.sessionID;
        }
        if ((i9 & 2) != 0) {
            i8 = paywallPostReceiptData.revision;
        }
        if ((i9 & 4) != 0) {
            str2 = paywallPostReceiptData.displayMode;
        }
        if ((i9 & 8) != 0) {
            z8 = paywallPostReceiptData.darkMode;
        }
        if ((i9 & 16) != 0) {
            str3 = paywallPostReceiptData.localeIdentifier;
        }
        if ((i9 & 32) != 0) {
            str4 = paywallPostReceiptData.offeringId;
        }
        String str5 = str3;
        String str6 = str4;
        return paywallPostReceiptData.copy(str, i8, str2, z8, str5, str6);
    }

    public static final /* synthetic */ void write$Self(PaywallPostReceiptData paywallPostReceiptData, d dVar, f fVar) {
        dVar.q(fVar, 0, paywallPostReceiptData.sessionID);
        dVar.u(fVar, 1, paywallPostReceiptData.revision);
        dVar.q(fVar, 2, paywallPostReceiptData.displayMode);
        dVar.w(fVar, 3, paywallPostReceiptData.darkMode);
        dVar.q(fVar, 4, paywallPostReceiptData.localeIdentifier);
        dVar.q(fVar, 5, paywallPostReceiptData.offeringId);
    }

    public final String component1() {
        return this.sessionID;
    }

    public final int component2() {
        return this.revision;
    }

    public final String component3() {
        return this.displayMode;
    }

    public final boolean component4() {
        return this.darkMode;
    }

    public final String component5() {
        return this.localeIdentifier;
    }

    public final String component6() {
        return this.offeringId;
    }

    public final PaywallPostReceiptData copy(String sessionID, int i8, String displayMode, boolean z8, String localeIdentifier, String offeringId) {
        t.g(sessionID, "sessionID");
        t.g(displayMode, "displayMode");
        t.g(localeIdentifier, "localeIdentifier");
        t.g(offeringId, "offeringId");
        return new PaywallPostReceiptData(sessionID, i8, displayMode, z8, localeIdentifier, offeringId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallPostReceiptData)) {
            return false;
        }
        PaywallPostReceiptData paywallPostReceiptData = (PaywallPostReceiptData) obj;
        return t.c(this.sessionID, paywallPostReceiptData.sessionID) && this.revision == paywallPostReceiptData.revision && t.c(this.displayMode, paywallPostReceiptData.displayMode) && this.darkMode == paywallPostReceiptData.darkMode && t.c(this.localeIdentifier, paywallPostReceiptData.localeIdentifier) && t.c(this.offeringId, paywallPostReceiptData.offeringId);
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.sessionID.hashCode() * 31) + Integer.hashCode(this.revision)) * 31) + this.displayMode.hashCode()) * 31;
        boolean z8 = this.darkMode;
        ?? r8 = z8;
        if (z8) {
            r8 = 1;
        }
        return ((((iHashCode + r8) * 31) + this.localeIdentifier.hashCode()) * 31) + this.offeringId.hashCode();
    }

    public final Map<String, Object> toMap() {
        c.a aVar = json;
        aVar.a();
        Map<String, Object> mapAsMap = JsonElementExtensionsKt.asMap(aVar.d(Companion.serializer(), this));
        if (mapAsMap == null) {
            return null;
        }
        return MapExtensionsKt.filterNotNullValues(mapAsMap);
    }

    public String toString() {
        return "PaywallPostReceiptData(sessionID=" + this.sessionID + ", revision=" + this.revision + ", displayMode=" + this.displayMode + ", darkMode=" + this.darkMode + ", localeIdentifier=" + this.localeIdentifier + ", offeringId=" + this.offeringId + ')';
    }

    public PaywallPostReceiptData(String sessionID, int i8, String displayMode, boolean z8, String localeIdentifier, String offeringId) {
        t.g(sessionID, "sessionID");
        t.g(displayMode, "displayMode");
        t.g(localeIdentifier, "localeIdentifier");
        t.g(offeringId, "offeringId");
        this.sessionID = sessionID;
        this.revision = i8;
        this.displayMode = displayMode;
        this.darkMode = z8;
        this.localeIdentifier = localeIdentifier;
        this.offeringId = offeringId;
    }

    public static /* synthetic */ void getDarkMode$annotations() {
    }

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public static /* synthetic */ void getLocaleIdentifier$annotations() {
    }

    public static /* synthetic */ void getOfferingId$annotations() {
    }

    public static /* synthetic */ void getRevision$annotations() {
    }

    public static /* synthetic */ void getSessionID$annotations() {
    }
}
