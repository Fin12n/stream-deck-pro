package com.revenuecat.purchases.paywalls.events;

import C6.InterfaceC0916e;
import com.revenuecat.purchases.utils.Event;
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
public final class PaywallStoredEvent implements Event {
    public static final Companion Companion = new Companion(null);
    private static final c.a json = c.f32534d;
    private final PaywallEvent event;
    private final String userID;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        public final PaywallStoredEvent fromString(String string) {
            t.g(string, "string");
            c.a json = getJson();
            json.a();
            return (PaywallStoredEvent) json.b(PaywallStoredEvent.Companion.serializer(), string);
        }

        public final c.a getJson() {
            return PaywallStoredEvent.json;
        }

        public final b serializer() {
            return PaywallStoredEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0916e
    public /* synthetic */ PaywallStoredEvent(int i8, PaywallEvent paywallEvent, String str, I0 i9) {
        if (3 != (i8 & 3)) {
            AbstractC2872x0.a(i8, 3, PaywallStoredEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.event = paywallEvent;
        this.userID = str;
    }

    public static /* synthetic */ PaywallStoredEvent copy$default(PaywallStoredEvent paywallStoredEvent, PaywallEvent paywallEvent, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            paywallEvent = paywallStoredEvent.event;
        }
        if ((i8 & 2) != 0) {
            str = paywallStoredEvent.userID;
        }
        return paywallStoredEvent.copy(paywallEvent, str);
    }

    public static final /* synthetic */ void write$Self(PaywallStoredEvent paywallStoredEvent, d dVar, f fVar) {
        dVar.i(fVar, 0, PaywallEvent$$serializer.INSTANCE, paywallStoredEvent.event);
        dVar.q(fVar, 1, paywallStoredEvent.userID);
    }

    public final PaywallEvent component1() {
        return this.event;
    }

    public final String component2() {
        return this.userID;
    }

    public final PaywallStoredEvent copy(PaywallEvent event, String userID) {
        t.g(event, "event");
        t.g(userID, "userID");
        return new PaywallStoredEvent(event, userID);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallStoredEvent)) {
            return false;
        }
        PaywallStoredEvent paywallStoredEvent = (PaywallStoredEvent) obj;
        return t.c(this.event, paywallStoredEvent.event) && t.c(this.userID, paywallStoredEvent.userID);
    }

    public final PaywallEvent getEvent() {
        return this.event;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        return (this.event.hashCode() * 31) + this.userID.hashCode();
    }

    public final PaywallBackendEvent toPaywallBackendEvent() {
        String string = this.event.getCreationData().getId().toString();
        t.f(string, "event.creationData.id.toString()");
        String value = this.event.getType().getValue();
        String str = this.userID;
        String string2 = this.event.getData().getSessionIdentifier().toString();
        t.f(string2, "event.data.sessionIdentifier.toString()");
        return new PaywallBackendEvent(string, 1, value, str, string2, this.event.getData().getOfferingIdentifier(), this.event.getData().getPaywallRevision(), this.event.getCreationData().getDate().getTime(), this.event.getData().getDisplayMode(), this.event.getData().getDarkMode(), this.event.getData().getLocaleIdentifier());
    }

    @Override // com.revenuecat.purchases.utils.Event
    public String toString() {
        c.a aVar = json;
        aVar.a();
        return aVar.c(Companion.serializer(), this);
    }

    public PaywallStoredEvent(PaywallEvent event, String userID) {
        t.g(event, "event");
        t.g(userID, "userID");
        this.event = event;
        this.userID = userID;
    }
}
