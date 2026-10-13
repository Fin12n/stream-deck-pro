package com.revenuecat.purchases.google.attribution;

import C6.v;
import D6.M;
import Q6.k;
import android.app.Application;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.t;
import p163s4.a;
import p195w4.g;
import p195w4.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class GoogleDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    private final Dispatcher dispatcher;
    private final String noPermissionAdvertisingIdValue;

    public GoogleDeviceIdentifiersFetcher(Dispatcher dispatcher) {
        t.g(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        this.noPermissionAdvertisingIdValue = "00000000-0000-0000-0000-000000000000";
    }

    private final String getAdvertisingID(Application application) {
        try {
            a.C0756a c0756aA = a.a(application);
            if (c0756aA.b()) {
                return null;
            }
            if (!t.c(c0756aA.a(), this.noPermissionAdvertisingIdValue)) {
                return c0756aA.a();
            }
            LogWrapperKt.log(LogIntent.WARNING, AttributionStrings.GOOGLE_PLAY_ADVERTISING_ID_NOT_AVAILABLE);
            return null;
        } catch (IOException e8) {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str = String.format(AttributionStrings.IO_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e8.getLocalizedMessage()}, 1));
            t.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            return null;
        } catch (NullPointerException e9) {
            LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
            String str2 = String.format(AttributionStrings.NULL_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e9.getLocalizedMessage()}, 1));
            t.f(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent2, str2);
            return null;
        } catch (TimeoutException e10) {
            LogIntent logIntent3 = LogIntent.GOOGLE_ERROR;
            String str3 = String.format(AttributionStrings.TIMEOUT_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e10.getLocalizedMessage()}, 1));
            t.f(str3, "format(this, *args)");
            LogWrapperKt.log(logIntent3, str3);
            return null;
        } catch (g e11) {
            LogIntent logIntent4 = LogIntent.GOOGLE_ERROR;
            String str4 = String.format(AttributionStrings.GOOGLE_PLAY_SERVICES_NOT_INSTALLED_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e11.getLocalizedMessage()}, 1));
            t.f(str4, "format(this, *args)");
            LogWrapperKt.log(logIntent4, str4);
            return null;
        } catch (h e12) {
            LogIntent logIntent5 = LogIntent.GOOGLE_ERROR;
            String str5 = String.format(AttributionStrings.GOOGLE_PLAY_SERVICES_REPAIRABLE_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e12.getLocalizedMessage()}, 1));
            t.f(str5, "format(this, *args)");
            LogWrapperKt.log(logIntent5, str5);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDeviceIdentifiers$lambda$0(GoogleDeviceIdentifiersFetcher this$0, Application applicationContext, k completion) {
        t.g(this$0, "this$0");
        t.g(applicationContext, "$applicationContext");
        t.g(completion, "$completion");
        completion.invoke(MapExtensionsKt.filterNotNullValues(M.j(v.a(SubscriberAttributeKey.DeviceIdentifiers.GPSAdID.INSTANCE.getBackendKey(), this$0.getAdvertisingID(applicationContext)), v.a(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), b.af))));
    }

    @Override // com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher
    public void getDeviceIdentifiers(final Application applicationContext, final k completion) {
        t.g(applicationContext, "applicationContext");
        t.g(completion, "completion");
        Dispatcher.enqueue$default(this.dispatcher, new Runnable() { // from class: z5.a
            @Override // java.lang.Runnable
            public final void run() {
                GoogleDeviceIdentifiersFetcher.getDeviceIdentifiers$lambda$0(this.f39258a, applicationContext, completion);
            }
        }, null, 2, null);
    }
}
