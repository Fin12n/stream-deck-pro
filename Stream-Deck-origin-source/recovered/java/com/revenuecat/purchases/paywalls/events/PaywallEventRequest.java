package com.revenuecat.purchases.paywalls.events;

import C6.InterfaceC0916e;
import D6.C0938s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p116m7.b;
import p116m7.i;
import q7.AbstractC2872x0;
import q7.C2836f;
import q7.I0;
import r7.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
@i
public final class PaywallEventRequest {
    private final List<PaywallBackendEvent> events;
    public static final Companion Companion = new Companion(null);
    private static final c json = c.f32534d;
    private static final b[] $childSerializers = {new C2836f(PaywallBackendEvent$$serializer.INSTANCE)};

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        public final c getJson() {
            return PaywallEventRequest.json;
        }

        public final b serializer() {
            return PaywallEventRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC0916e
    public /* synthetic */ PaywallEventRequest(int i8, List list, I0 i9) {
        if (1 != (i8 & 1)) {
            AbstractC2872x0.a(i8, 1, PaywallEventRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.events = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallEventRequest copy$default(PaywallEventRequest paywallEventRequest, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = paywallEventRequest.events;
        }
        return paywallEventRequest.copy(list);
    }

    public final List<PaywallBackendEvent> component1() {
        return this.events;
    }

    public final PaywallEventRequest copy(List<PaywallBackendEvent> events) {
        t.g(events, "events");
        return new PaywallEventRequest(events);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaywallEventRequest) && t.c(this.events, ((PaywallEventRequest) obj).events);
    }

    public final List<String> getCacheKey() {
        List<PaywallBackendEvent> list = this.events;
        ArrayList arrayList = new ArrayList(C0938s.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((PaywallBackendEvent) it.next()).hashCode()));
        }
        return arrayList;
    }

    public final List<PaywallBackendEvent> getEvents() {
        return this.events;
    }

    public int hashCode() {
        return this.events.hashCode();
    }

    public String toString() {
        return "PaywallEventRequest(events=" + this.events + ')';
    }

    public PaywallEventRequest(List<PaywallBackendEvent> events) {
        t.g(events, "events");
        this.events = events;
    }
}
