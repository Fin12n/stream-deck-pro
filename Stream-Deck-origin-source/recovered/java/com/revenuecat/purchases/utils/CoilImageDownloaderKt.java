package com.revenuecat.purchases.utils;

import N6.e;
import android.content.Context;
import coil.ImageLoader;
import coil.disk.DiskCache;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class CoilImageDownloaderKt {
    private static final long MAX_CACHE_SIZE_BYTES = 26214400;
    private static final String PAYWALL_IMAGE_CACHE_FOLDER = "revenuecatui_cache";

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.CoilImageDownloaderKt$getRevenueCatUIImageLoader$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class AnonymousClass1 extends u implements Function0 {
        final /* synthetic */ Context $this_getRevenueCatUIImageLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context) {
            super(0);
            this.$this_getRevenueCatUIImageLoader = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DiskCache invoke() {
            DiskCache.Builder builder = new DiskCache.Builder();
            File cacheDir = this.$this_getRevenueCatUIImageLoader.getCacheDir();
            t.f(cacheDir, "cacheDir");
            return builder.directory(e.l(cacheDir, CoilImageDownloaderKt.PAYWALL_IMAGE_CACHE_FOLDER)).maxSizeBytes(CoilImageDownloaderKt.MAX_CACHE_SIZE_BYTES).build();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageLoader getRevenueCatUIImageLoader(Context context) {
        return new ImageLoader.Builder(context).diskCache(new AnonymousClass1(context)).build();
    }
}
