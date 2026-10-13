package com.revenuecat.purchases.paywalls.events;

import C6.InterfaceC0916e;
import com.revenuecat.purchases.utils.serializers.DateSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.Date;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import o7.f;
import p116m7.b;
import p116m7.i;
import p143q0.nKy.bGZGhbtQmA;
import p7.d;
import q7.AbstractC2872x0;
import q7.G;
import q7.I0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@i
public final class PaywallEvent {
    private final CreationData creationData;
    private final Data data;
    private final PaywallEventType type;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, null, G.a("com.revenuecat.purchases.paywalls.events.PaywallEventType", PaywallEventType.values())};

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        public final b serializer() {
            return PaywallEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    @i
    public static final class CreationData {
        public static final Companion Companion = new Companion(null);
        private final Date date;
        private final UUID id;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
                this();
            }

            public final b serializer() {
                return PaywallEvent$CreationData$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC0916e
        public /* synthetic */ CreationData(int i8, @i(with = UUIDSerializer.class) UUID uuid, @i(with = DateSerializer.class) Date date, I0 i9) {
            if (3 != (i8 & 3)) {
                AbstractC2872x0.a(i8, 3, PaywallEvent$CreationData$$serializer.INSTANCE.getDescriptor());
            }
            this.id = uuid;
            this.date = date;
        }

        public static /* synthetic */ CreationData copy$default(CreationData creationData, UUID uuid, Date date, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                uuid = creationData.id;
            }
            if ((i8 & 2) != 0) {
                date = creationData.date;
            }
            return creationData.copy(uuid, date);
        }

        public static final /* synthetic */ void write$Self(CreationData creationData, d dVar, f fVar) {
            dVar.i(fVar, 0, UUIDSerializer.INSTANCE, creationData.id);
            dVar.i(fVar, 1, DateSerializer.INSTANCE, creationData.date);
        }

        public final UUID component1() {
            return this.id;
        }

        public final Date component2() {
            return this.date;
        }

        public final CreationData copy(UUID id, Date date) {
            t.g(id, "id");
            t.g(date, "date");
            return new CreationData(id, date);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CreationData)) {
                return false;
            }
            CreationData creationData = (CreationData) obj;
            return t.c(this.id, creationData.id) && t.c(this.date, creationData.date);
        }

        public final Date getDate() {
            return this.date;
        }

        public final UUID getId() {
            return this.id;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.date.hashCode();
        }

        public String toString() {
            return "CreationData(id=" + this.id + ", date=" + this.date + ')';
        }

        public CreationData(UUID id, Date date) {
            t.g(id, "id");
            t.g(date, "date");
            this.id = id;
            this.date = date;
        }

        @i(with = DateSerializer.class)
        public static /* synthetic */ void getDate$annotations() {
        }

        @i(with = UUIDSerializer.class)
        public static /* synthetic */ void getId$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    @i
    public static final class Data {
        public static final Companion Companion = new Companion(null);
        private final boolean darkMode;
        private final String displayMode;
        private final String localeIdentifier;
        private final String offeringIdentifier;
        private final int paywallRevision;
        private final UUID sessionIdentifier;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class Companion {
            public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
                this();
            }

            public final b serializer() {
                return PaywallEvent$Data$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC0916e
        public /* synthetic */ Data(int i8, String str, int i9, @i(with = UUIDSerializer.class) UUID uuid, String str2, String str3, boolean z8, I0 i10) {
            if (63 != (i8 & 63)) {
                AbstractC2872x0.a(i8, 63, PaywallEvent$Data$$serializer.INSTANCE.getDescriptor());
            }
            this.offeringIdentifier = str;
            this.paywallRevision = i9;
            this.sessionIdentifier = uuid;
            this.displayMode = str2;
            this.localeIdentifier = str3;
            this.darkMode = z8;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, int i8, UUID uuid, String str2, String str3, boolean z8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                str = data.offeringIdentifier;
            }
            if ((i9 & 2) != 0) {
                i8 = data.paywallRevision;
            }
            if ((i9 & 4) != 0) {
                uuid = data.sessionIdentifier;
            }
            if ((i9 & 8) != 0) {
                str2 = data.displayMode;
            }
            if ((i9 & 16) != 0) {
                str3 = data.localeIdentifier;
            }
            if ((i9 & 32) != 0) {
                z8 = data.darkMode;
            }
            String str4 = str3;
            boolean z9 = z8;
            return data.copy(str, i8, uuid, str2, str4, z9);
        }

        @i(with = UUIDSerializer.class)
        public static /* synthetic */ void getSessionIdentifier$annotations() {
        }

        public static final /* synthetic */ void write$Self(Data data, d dVar, f fVar) {
            dVar.q(fVar, 0, data.offeringIdentifier);
            dVar.u(fVar, 1, data.paywallRevision);
            dVar.i(fVar, 2, UUIDSerializer.INSTANCE, data.sessionIdentifier);
            dVar.q(fVar, 3, data.displayMode);
            dVar.q(fVar, 4, data.localeIdentifier);
            dVar.w(fVar, 5, data.darkMode);
        }

        public final String component1() {
            return this.offeringIdentifier;
        }

        public final int component2() {
            return this.paywallRevision;
        }

        public final UUID component3() {
            return this.sessionIdentifier;
        }

        public final String component4() {
            return this.displayMode;
        }

        public final String component5() {
            return this.localeIdentifier;
        }

        public final boolean component6() {
            return this.darkMode;
        }

        public final Data copy(String offeringIdentifier, int i8, UUID sessionIdentifier, String displayMode, String localeIdentifier, boolean z8) {
            t.g(offeringIdentifier, "offeringIdentifier");
            t.g(sessionIdentifier, "sessionIdentifier");
            t.g(displayMode, "displayMode");
            t.g(localeIdentifier, "localeIdentifier");
            return new Data(offeringIdentifier, i8, sessionIdentifier, displayMode, localeIdentifier, z8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return t.c(this.offeringIdentifier, data.offeringIdentifier) && this.paywallRevision == data.paywallRevision && t.c(this.sessionIdentifier, data.sessionIdentifier) && t.c(this.displayMode, data.displayMode) && t.c(this.localeIdentifier, data.localeIdentifier) && this.darkMode == data.darkMode;
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

        public final String getOfferingIdentifier() {
            return this.offeringIdentifier;
        }

        public final int getPaywallRevision() {
            return this.paywallRevision;
        }

        public final UUID getSessionIdentifier() {
            return this.sessionIdentifier;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v9, types: [int] */
        public int hashCode() {
            int iHashCode = ((((((((this.offeringIdentifier.hashCode() * 31) + Integer.hashCode(this.paywallRevision)) * 31) + this.sessionIdentifier.hashCode()) * 31) + this.displayMode.hashCode()) * 31) + this.localeIdentifier.hashCode()) * 31;
            boolean z8 = this.darkMode;
            ?? r8 = z8;
            if (z8) {
                r8 = 1;
            }
            return iHashCode + r8;
        }

        public Data(String offeringIdentifier, int i8, UUID sessionIdentifier, String displayMode, String localeIdentifier, boolean z8) {
            t.g(offeringIdentifier, "offeringIdentifier");
            t.g(sessionIdentifier, "sessionIdentifier");
            t.g(displayMode, "displayMode");
            t.g(localeIdentifier, "localeIdentifier");
            this.offeringIdentifier = offeringIdentifier;
            this.paywallRevision = i8;
            this.sessionIdentifier = sessionIdentifier;
            this.displayMode = displayMode;
            this.localeIdentifier = localeIdentifier;
            this.darkMode = z8;
        }

        public String toString() {
            return "Data(offeringIdentifier=" + this.offeringIdentifier + ", paywallRevision=" + this.paywallRevision + ", sessionIdentifier=" + this.sessionIdentifier + ", displayMode=" + this.displayMode + bGZGhbtQmA.TDshzO + this.localeIdentifier + ", darkMode=" + this.darkMode + ')';
        }
    }

    @InterfaceC0916e
    public /* synthetic */ PaywallEvent(int i8, CreationData creationData, Data data, PaywallEventType paywallEventType, I0 i9) {
        if (7 != (i8 & 7)) {
            AbstractC2872x0.a(i8, 7, PaywallEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.creationData = creationData;
        this.data = data;
        this.type = paywallEventType;
    }

    public static /* synthetic */ PaywallEvent copy$default(PaywallEvent paywallEvent, CreationData creationData, Data data, PaywallEventType paywallEventType, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            creationData = paywallEvent.creationData;
        }
        if ((i8 & 2) != 0) {
            data = paywallEvent.data;
        }
        if ((i8 & 4) != 0) {
            paywallEventType = paywallEvent.type;
        }
        return paywallEvent.copy(creationData, data, paywallEventType);
    }

    public static final /* synthetic */ void write$Self(PaywallEvent paywallEvent, d dVar, f fVar) {
        b[] bVarArr = $childSerializers;
        dVar.i(fVar, 0, PaywallEvent$CreationData$$serializer.INSTANCE, paywallEvent.creationData);
        dVar.i(fVar, 1, PaywallEvent$Data$$serializer.INSTANCE, paywallEvent.data);
        dVar.i(fVar, 2, bVarArr[2], paywallEvent.type);
    }

    public final CreationData component1() {
        return this.creationData;
    }

    public final Data component2() {
        return this.data;
    }

    public final PaywallEventType component3() {
        return this.type;
    }

    public final PaywallEvent copy(CreationData creationData, Data data, PaywallEventType type) {
        t.g(creationData, "creationData");
        t.g(data, "data");
        t.g(type, "type");
        return new PaywallEvent(creationData, data, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallEvent)) {
            return false;
        }
        PaywallEvent paywallEvent = (PaywallEvent) obj;
        return t.c(this.creationData, paywallEvent.creationData) && t.c(this.data, paywallEvent.data) && this.type == paywallEvent.type;
    }

    public final CreationData getCreationData() {
        return this.creationData;
    }

    public final Data getData() {
        return this.data;
    }

    public final PaywallEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.creationData.hashCode() * 31) + this.data.hashCode()) * 31) + this.type.hashCode();
    }

    public final PaywallPostReceiptData toPaywallPostReceiptData$purchases_defaultsRelease() {
        String string = this.data.getSessionIdentifier().toString();
        t.f(string, "data.sessionIdentifier.toString()");
        return new PaywallPostReceiptData(string, this.data.getPaywallRevision(), this.data.getDisplayMode(), this.data.getDarkMode(), this.data.getLocaleIdentifier(), this.data.getOfferingIdentifier());
    }

    public String toString() {
        return "PaywallEvent(creationData=" + this.creationData + ", data=" + this.data + ", type=" + this.type + ')';
    }

    public PaywallEvent(CreationData creationData, Data data, PaywallEventType type) {
        t.g(creationData, "creationData");
        t.g(data, "data");
        t.g(type, "type");
        this.creationData = creationData;
        this.data = data;
        this.type = type;
    }
}
