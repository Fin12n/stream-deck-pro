package com.revenuecat.purchases.paywalls.events;

import C6.G;
import D6.C0938s;
import D6.r;
import D6.z;
import Q6.k;
import Q6.o;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.utils.EventsFileHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PaywallEventsManager {
    public static final Companion Companion = new Companion(null);
    private static final long FLUSH_COUNT = 50;
    public static final String PAYWALL_EVENTS_FILE_PATH = "RevenueCat/paywall_event_store/paywall_event_store.jsonl";
    private final Backend backend;
    private final EventsFileHelper<PaywallStoredEvent> fileHelper;
    private boolean flushInProgress;
    private final IdentityManager identityManager;
    private final Dispatcher paywallEventsDispatcher;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2633k abstractC2633k) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements Function0 {

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class AnonymousClass2 extends u implements Function0 {
            final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
            final /* synthetic */ PaywallEventsManager this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$2$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C04501 extends u implements Function0 {
                final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
                final /* synthetic */ PaywallEventsManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04501(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                    super(0);
                    this.this$0 = paywallEventsManager;
                    this.$eventsToSyncWithNullValues = list;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m177invoke();
                    return G.f1419a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m177invoke() {
                    this.this$0.fileHelper.clear(this.$eventsToSyncWithNullValues.size());
                    this.this$0.flushInProgress = false;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                super(0);
                this.this$0 = paywallEventsManager;
                this.$eventsToSyncWithNullValues = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m176invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m176invoke() {
                LogUtilsKt.verboseLog("Paywall event flush: success.");
                PaywallEventsManager paywallEventsManager = this.this$0;
                PaywallEventsManager.enqueue$default(paywallEventsManager, null, new C04501(paywallEventsManager, this.$eventsToSyncWithNullValues), 1, null);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class AnonymousClass3 extends u implements o {
            final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
            final /* synthetic */ PaywallEventsManager this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$3$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C04511 extends u implements Function0 {
                final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
                final /* synthetic */ boolean $shouldMarkAsSynced;
                final /* synthetic */ PaywallEventsManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04511(boolean z8, PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                    super(0);
                    this.$shouldMarkAsSynced = z8;
                    this.this$0 = paywallEventsManager;
                    this.$eventsToSyncWithNullValues = list;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m178invoke();
                    return G.f1419a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m178invoke() {
                    if (this.$shouldMarkAsSynced) {
                        this.this$0.fileHelper.clear(this.$eventsToSyncWithNullValues.size());
                    }
                    this.this$0.flushInProgress = false;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                super(2);
                this.this$0 = paywallEventsManager;
                this.$eventsToSyncWithNullValues = list;
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
                return G.f1419a;
            }

            public final void invoke(PurchasesError error, boolean z8) {
                t.g(error, "error");
                LogUtilsKt.errorLog$default("Paywall event flush error: " + error + b.f16789a, null, 2, null);
                PaywallEventsManager paywallEventsManager = this.this$0;
                PaywallEventsManager.enqueue$default(paywallEventsManager, null, new C04511(z8, paywallEventsManager, this.$eventsToSyncWithNullValues), 1, null);
            }
        }

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m175invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m175invoke() throws Throwable {
            if (PaywallEventsManager.this.flushInProgress) {
                LogUtilsKt.debugLog("Flush already in progress.");
                return;
            }
            PaywallEventsManager.this.flushInProgress = true;
            List eventsToSync = PaywallEventsManager.this.getEventsToSync();
            List listF0 = z.f0(eventsToSync);
            int size = listF0.size();
            if (listF0.isEmpty()) {
                LogUtilsKt.verboseLog("No paywall events to sync.");
                PaywallEventsManager.this.flushInProgress = false;
                return;
            }
            LogUtilsKt.verboseLog("Paywall event flush: posting " + size + " events.");
            Backend backend = PaywallEventsManager.this.backend;
            ArrayList arrayList = new ArrayList(C0938s.y(listF0, 10));
            Iterator it = listF0.iterator();
            while (it.hasNext()) {
                arrayList.add(((PaywallStoredEvent) it.next()).toPaywallBackendEvent());
            }
            backend.postPaywallEvents(new PaywallEventRequest(arrayList), new AnonymousClass2(PaywallEventsManager.this, eventsToSync), new AnonymousClass3(PaywallEventsManager.this, eventsToSync));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$getEventsToSync$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21911 extends u implements k {
        final /* synthetic */ J $eventsToSync;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21911(J j8) {
            super(1);
            this.$eventsToSync = j8;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Stream<PaywallStoredEvent>) obj);
            return G.f1419a;
        }

        public final void invoke(Stream<PaywallStoredEvent> stream) {
            t.g(stream, "stream");
            J j8 = this.$eventsToSync;
            Object objCollect = stream.limit(PaywallEventsManager.FLUSH_COUNT).collect(Collectors.toList());
            t.f(objCollect, "stream.limit(FLUSH_COUNT…lect(Collectors.toList())");
            j8.f28779a = objCollect;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$track$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C21921 extends u implements Function0 {
        final /* synthetic */ PaywallEvent $event;
        final /* synthetic */ PaywallEventsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21921(PaywallEvent paywallEvent, PaywallEventsManager paywallEventsManager) {
            super(0);
            this.$event = paywallEvent;
            this.this$0 = paywallEventsManager;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m179invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m179invoke() {
            LogUtilsKt.debugLog("Tracking paywall event: " + this.$event);
            this.this$0.fileHelper.appendEvent(new PaywallStoredEvent(this.$event, this.this$0.identityManager.getCurrentAppUserID()));
        }
    }

    public PaywallEventsManager(EventsFileHelper<PaywallStoredEvent> fileHelper, IdentityManager identityManager, Dispatcher paywallEventsDispatcher, Backend backend) {
        t.g(fileHelper, "fileHelper");
        t.g(identityManager, "identityManager");
        t.g(paywallEventsDispatcher, "paywallEventsDispatcher");
        t.g(backend, "backend");
        this.fileHelper = fileHelper;
        this.identityManager = identityManager;
        this.paywallEventsDispatcher = paywallEventsDispatcher;
        this.backend = backend;
    }

    private final void enqueue(Delay delay, final Function0 function0) {
        this.paywallEventsDispatcher.enqueue(new Runnable() { // from class: com.revenuecat.purchases.paywalls.events.a
            @Override // java.lang.Runnable
            public final void run() {
                PaywallEventsManager.enqueue$lambda$0(function0);
            }
        }, delay);
    }

    public static /* synthetic */ void enqueue$default(PaywallEventsManager paywallEventsManager, Delay delay, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            delay = Delay.NONE;
        }
        paywallEventsManager.enqueue(delay, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$0(Function0 command) {
        t.g(command, "$command");
        command.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PaywallStoredEvent> getEventsToSync() {
        J j8 = new J();
        j8.f28779a = r.n();
        this.fileHelper.readFile(new C21911(j8));
        return (List) j8.f28779a;
    }

    public final synchronized void flushEvents() {
        enqueue$default(this, null, new AnonymousClass1(), 1, null);
    }

    public final synchronized void track(PaywallEvent event) {
        t.g(event, "event");
        enqueue$default(this, null, new C21921(event, this), 1, null);
    }
}
