package com.revenuecat.purchases.amazon.attribution;

import C6.v;
import D6.M;
import Q6.k;
import android.app.Application;
import android.content.ContentResolver;
import android.provider.Settings;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class AmazonDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    @Override // com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher
    public void getDeviceIdentifiers(Application applicationContext, k completion) {
        String string;
        t.g(applicationContext, "applicationContext");
        t.g(completion, "completion");
        try {
            ContentResolver contentResolver = applicationContext.getContentResolver();
            string = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0 ? Settings.Secure.getString(contentResolver, "advertising_id") : null;
        } catch (Settings.SettingNotFoundException e8) {
            LogIntent logIntent = LogIntent.AMAZON_ERROR;
            String str = String.format(AttributionStrings.AMAZON_COULD_NOT_GET_ADID, Arrays.copyOf(new Object[]{e8.getLocalizedMessage()}, 1));
            t.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
        completion.invoke(MapExtensionsKt.filterNotNullValues(M.j(v.a(SubscriberAttributeKey.DeviceIdentifiers.AmazonAdID.INSTANCE.getBackendKey(), string), v.a(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), BpgIURjN.sMnCZ))));
    }
}
