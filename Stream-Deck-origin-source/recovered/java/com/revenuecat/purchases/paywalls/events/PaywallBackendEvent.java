package com.revenuecat.purchases.paywalls.events;

import C6.InterfaceC0916e;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import o7.f;
import p043e6.dT.GIGvBf;
import p116m7.b;
import p116m7.i;
import p7.d;
import q7.AbstractC2872x0;
import q7.I0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@i
public final class PaywallBackendEvent {
    public static final Companion Companion = new Companion(null);
    public static final int PAYWALL_EVENT_SCHEMA_VERSION = 1;
    private final String appUserID;
    private final boolean darkMode;
    private final String displayMode;
    private final String id;
    private final String localeIdentifier;
    private final String offeringID;
    private final int paywallRevision;
    private final String sessionID;
    private final long timestamp;
    private final String type;
    private final int version;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        public final b serializer() {
            return PaywallBackendEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0916e
    public /* synthetic */ PaywallBackendEvent(int i8, String str, int i9, String str2, String str3, String str4, String str5, int i10, long j8, String str6, boolean z8, String str7, I0 i11) {
        if (2047 != (i8 & 2047)) {
            AbstractC2872x0.a(i8, 2047, PaywallBackendEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.version = i9;
        this.type = str2;
        this.appUserID = str3;
        this.sessionID = str4;
        this.offeringID = str5;
        this.paywallRevision = i10;
        this.timestamp = j8;
        this.displayMode = str6;
        this.darkMode = z8;
        this.localeIdentifier = str7;
    }

    public static /* synthetic */ PaywallBackendEvent copy$default(PaywallBackendEvent paywallBackendEvent, String str, int i8, String str2, String str3, String str4, String str5, int i9, long j8, String str6, boolean z8, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paywallBackendEvent.id;
        }
        if ((i10 & 2) != 0) {
            i8 = paywallBackendEvent.version;
        }
        if ((i10 & 4) != 0) {
            str2 = paywallBackendEvent.type;
        }
        if ((i10 & 8) != 0) {
            str3 = paywallBackendEvent.appUserID;
        }
        if ((i10 & 16) != 0) {
            str4 = paywallBackendEvent.sessionID;
        }
        if ((i10 & 32) != 0) {
            str5 = paywallBackendEvent.offeringID;
        }
        if ((i10 & 64) != 0) {
            i9 = paywallBackendEvent.paywallRevision;
        }
        if ((i10 & 128) != 0) {
            j8 = paywallBackendEvent.timestamp;
        }
        if ((i10 & 256) != 0) {
            str6 = paywallBackendEvent.displayMode;
        }
        if ((i10 & 512) != 0) {
            z8 = paywallBackendEvent.darkMode;
        }
        if ((i10 & 1024) != 0) {
            str7 = paywallBackendEvent.localeIdentifier;
        }
        String str8 = str7;
        String str9 = str6;
        long j9 = j8;
        String str10 = str5;
        int i11 = i9;
        String str11 = str3;
        String str12 = str4;
        String str13 = str2;
        return paywallBackendEvent.copy(str, i8, str13, str11, str12, str10, i11, j9, str9, z8, str8);
    }

    public static /* synthetic */ void getAppUserID$annotations() {
    }

    public static /* synthetic */ void getDarkMode$annotations() {
    }

    public static /* synthetic */ void getDisplayMode$annotations() {
    }

    public static /* synthetic */ void getLocaleIdentifier$annotations() {
    }

    public static /* synthetic */ void getOfferingID$annotations() {
    }

    public static /* synthetic */ void getPaywallRevision$annotations() {
    }

    public static /* synthetic */ void getSessionID$annotations() {
    }

    public static final /* synthetic */ void write$Self(PaywallBackendEvent paywallBackendEvent, d dVar, f fVar) {
        dVar.q(fVar, 0, paywallBackendEvent.id);
        dVar.u(fVar, 1, paywallBackendEvent.version);
        dVar.q(fVar, 2, paywallBackendEvent.type);
        dVar.q(fVar, 3, paywallBackendEvent.appUserID);
        dVar.q(fVar, 4, paywallBackendEvent.sessionID);
        dVar.q(fVar, 5, paywallBackendEvent.offeringID);
        dVar.u(fVar, 6, paywallBackendEvent.paywallRevision);
        dVar.C(fVar, 7, paywallBackendEvent.timestamp);
        dVar.q(fVar, 8, paywallBackendEvent.displayMode);
        dVar.w(fVar, 9, paywallBackendEvent.darkMode);
        dVar.q(fVar, 10, paywallBackendEvent.localeIdentifier);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.darkMode;
    }

    public final String component11() {
        return this.localeIdentifier;
    }

    public final int component2() {
        return this.version;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.appUserID;
    }

    public final String component5() {
        return this.sessionID;
    }

    public final String component6() {
        return this.offeringID;
    }

    public final int component7() {
        return this.paywallRevision;
    }

    public final long component8() {
        return this.timestamp;
    }

    public final String component9() {
        return this.displayMode;
    }

    public final PaywallBackendEvent copy(String id, int i8, String type, String appUserID, String sessionID, String offeringID, int i9, long j8, String displayMode, boolean z8, String localeIdentifier) {
        t.g(id, "id");
        t.g(type, "type");
        t.g(appUserID, "appUserID");
        t.g(sessionID, "sessionID");
        t.g(offeringID, "offeringID");
        t.g(displayMode, "displayMode");
        t.g(localeIdentifier, "localeIdentifier");
        return new PaywallBackendEvent(id, i8, type, appUserID, sessionID, offeringID, i9, j8, displayMode, z8, localeIdentifier);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallBackendEvent)) {
            return false;
        }
        PaywallBackendEvent paywallBackendEvent = (PaywallBackendEvent) obj;
        return t.c(this.id, paywallBackendEvent.id) && this.version == paywallBackendEvent.version && t.c(this.type, paywallBackendEvent.type) && t.c(this.appUserID, paywallBackendEvent.appUserID) && t.c(this.sessionID, paywallBackendEvent.sessionID) && t.c(this.offeringID, paywallBackendEvent.offeringID) && this.paywallRevision == paywallBackendEvent.paywallRevision && this.timestamp == paywallBackendEvent.timestamp && t.c(this.displayMode, paywallBackendEvent.displayMode) && this.darkMode == paywallBackendEvent.darkMode && t.c(this.localeIdentifier, paywallBackendEvent.localeIdentifier);
    }

    public final String getAppUserID() {
        return this.appUserID;
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLocaleIdentifier() {
        return this.localeIdentifier;
    }

    public final String getOfferingID() {
        return this.offeringID;
    }

    public final int getPaywallRevision() {
        return this.paywallRevision;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((this.id.hashCode() * 31) + Integer.hashCode(this.version)) * 31) + this.type.hashCode()) * 31) + this.appUserID.hashCode()) * 31) + this.sessionID.hashCode()) * 31) + this.offeringID.hashCode()) * 31) + Integer.hashCode(this.paywallRevision)) * 31) + Long.hashCode(this.timestamp)) * 31) + this.displayMode.hashCode()) * 31;
        boolean z8 = this.darkMode;
        ?? r8 = z8;
        if (z8) {
            r8 = 1;
        }
        return ((iHashCode + r8) * 31) + this.localeIdentifier.hashCode();
    }

    public PaywallBackendEvent(String id, int i8, String type, String appUserID, String sessionID, String offeringID, int i9, long j8, String displayMode, boolean z8, String localeIdentifier) {
        t.g(id, "id");
        t.g(type, "type");
        t.g(appUserID, "appUserID");
        t.g(sessionID, "sessionID");
        t.g(offeringID, "offeringID");
        t.g(displayMode, "displayMode");
        t.g(localeIdentifier, "localeIdentifier");
        this.id = id;
        this.version = i8;
        this.type = type;
        this.appUserID = appUserID;
        this.sessionID = sessionID;
        this.offeringID = offeringID;
        this.paywallRevision = i9;
        this.timestamp = j8;
        this.displayMode = displayMode;
        this.darkMode = z8;
        this.localeIdentifier = localeIdentifier;
    }

    public String toString() {
        return GIGvBf.JwitwHqYSPvdr + this.id + ", version=" + this.version + ", type=" + this.type + ", appUserID=" + this.appUserID + ", sessionID=" + this.sessionID + ", offeringID=" + this.offeringID + ", paywallRevision=" + this.paywallRevision + ", timestamp=" + this.timestamp + LYdqVGvOGMNr.XFbDGlbxwCKNXm + this.displayMode + ", darkMode=" + this.darkMode + ", localeIdentifier=" + this.localeIdentifier + ')';
    }
}
