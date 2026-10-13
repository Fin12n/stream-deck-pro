package com.elgato.streamdeck;

import Z.JTT.ryTuoS;
import Z6.v;
import android.content.Context;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f17667a = new a();

    /* JADX INFO: renamed from: com.elgato.streamdeck.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0419a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0419a f17668a = new C0419a();

        /* JADX INFO: renamed from: com.elgato.streamdeck.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C0420a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17669a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.GOOGLE_PLAY_STORE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.AMAZON_APPSTORE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f17669a = iArr;
            }
        }

        public final String a() {
            return "https://mobile-updates.elgato.com/stream-deck-mobile/android/versions";
        }

        public final String c(b vendor) {
            t.g(vendor, "vendor");
            int i8 = C0420a.f17669a[vendor.ordinal()];
            if (i8 != 1) {
                return i8 != 2 ? "https://www.elgato.com/s/downloads" : "amzn://apps/android?p=com.corsair.android.streamdeck&intent=app_update";
            }
            return "https://play.google.com/store/apps/details?id=com.corsair.android.streamdeck";
        }

        public final String b(Context context) {
            t.g(context, "context");
            int i8 = C0420a.f17669a[a.f17667a.a(context).ordinal()];
            if (i8 == 1) {
                return "https://play.google.com/store/apps/details?id=com.corsair.android.streamdeck";
            }
            if (i8 != 2) {
                return null;
            }
            return ryTuoS.HAh;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        GOOGLE_PLAY_STORE,
        AMAZON_APPSTORE,
        SIDELOADED,
        UNKNOWN;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ J6.a f17675f = J6.b.a(a());
    }

    public final b a(Context context) {
        b bVar;
        t.g(context, "context");
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            if (v.H(installerPackageName, "com.android", false, 2, null)) {
                bVar = b.GOOGLE_PLAY_STORE;
            } else {
                bVar = v.H(installerPackageName, "com.amazon", false, 2, null) ? b.AMAZON_APPSTORE : b.UNKNOWN;
            }
            if (bVar != null) {
                return bVar;
            }
        }
        return b.SIDELOADED;
    }
}
