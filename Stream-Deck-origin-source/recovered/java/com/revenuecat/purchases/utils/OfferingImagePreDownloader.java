package com.revenuecat.purchases.utils;

import D6.C0938s;
import android.net.Uri;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.paywalls.PaywallData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class OfferingImagePreDownloader {
    private final CoilImageDownloader coilImageDownloader;
    private final boolean shouldPredownloadImages;

    public OfferingImagePreDownloader(boolean z8, CoilImageDownloader coilImageDownloader) {
        t.g(coilImageDownloader, "coilImageDownloader");
        this.shouldPredownloadImages = z8;
        this.coilImageDownloader = coilImageDownloader;
    }

    public final void preDownloadOfferingImages(Offering offering) {
        t.g(offering, "offering");
        if (!this.shouldPredownloadImages) {
            LogUtilsKt.verboseLog("OfferingImagePreDownloader won't pre-download images");
            return;
        }
        LogUtilsKt.debugLog("OfferingImagePreDownloader: starting image download");
        PaywallData paywall = offering.getPaywall();
        if (paywall != null) {
            List<String> all$purchases_defaultsRelease = paywall.getConfig().getImages().getAll$purchases_defaultsRelease();
            ArrayList<Uri> arrayList = new ArrayList(C0938s.y(all$purchases_defaultsRelease, 10));
            Iterator<T> it = all$purchases_defaultsRelease.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.parse(paywall.getAssetBaseURL().toString()).buildUpon().path((String) it.next()).build());
            }
            for (Uri it2 : arrayList) {
                LogUtilsKt.debugLog("Pre-downloading paywall image: " + it2);
                CoilImageDownloader coilImageDownloader = this.coilImageDownloader;
                t.f(it2, "it");
                coilImageDownloader.downloadImage(it2);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OfferingImagePreDownloader(boolean z8, CoilImageDownloader coilImageDownloader, int i8, AbstractC2633k abstractC2633k) {
        if ((i8 & 1) != 0) {
            try {
                Class.forName(BpgIURjN.QSkQY);
                z8 = true;
            } catch (ClassNotFoundException unused) {
                z8 = false;
            }
        }
        this(z8, coilImageDownloader);
    }
}
