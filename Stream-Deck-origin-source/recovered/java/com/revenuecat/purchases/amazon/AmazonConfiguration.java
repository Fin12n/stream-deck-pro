package com.revenuecat.purchases.amazon;

import android.content.Context;
import com.revenuecat.purchases.PurchasesConfiguration;
import com.revenuecat.purchases.Store;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class AmazonConfiguration extends PurchasesConfiguration {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class Builder extends PurchasesConfiguration.Builder {
        public Builder(Context context, String str) {
            super(context, str);
            store(Store.AMAZON);
        }
    }

    public AmazonConfiguration(Builder builder) {
        super(builder);
    }
}
