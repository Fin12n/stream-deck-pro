package p186v3;

import C6.m;
import com.revenuecat.purchases.Store;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f35108b;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.PLAY_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Store.APP_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Store.AMAZON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Store.PROMOTIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Store.UNKNOWN_STORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Store.MAC_APP_STORE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Store.STRIPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Store.EXTERNAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Store.RC_BILLING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f35107a = iArr;
            int[] iArr2 = new int[com.elgato.streamdeck.a.b.values().length];
            try {
                iArr2[com.elgato.streamdeck.a.b.GOOGLE_PLAY_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.elgato.streamdeck.a.b.AMAZON_APPSTORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.elgato.streamdeck.a.b.SIDELOADED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.elgato.streamdeck.a.b.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            f35108b = iArr2;
        }
    }

    public static final String a(C3.b bVar) {
        t.g(bVar, "<this>");
        if (bVar instanceof C3.b.h) {
            return "Elgato";
        }
        if (bVar instanceof C3.b.C0054b) {
            return "Elgato Camouflage";
        }
        if (bVar instanceof C3.b.c) {
            return "Elgato Circuit";
        }
        if (bVar instanceof C3.b.f) {
            return "Elgato Desert";
        }
        if (bVar instanceof C3.b.g) {
            return "Elgato Doodle";
        }
        if (bVar instanceof C3.b.i) {
            return "Elgato Galactic";
        }
        if (bVar instanceof C3.b.j) {
            return "Elgato Lagoon";
        }
        if (bVar instanceof C3.b.k) {
            return "Elgato Landscape";
        }
        if (bVar instanceof C3.b.l) {
            return "Elgato Mecha";
        }
        if (bVar instanceof C3.b.m) {
            return "Elgato Mochi";
        }
        if (bVar instanceof C3.b.n) {
            return "Elgato Ornate";
        }
        if (bVar instanceof C3.b.o) {
            return "Elgato Twilight";
        }
        if (bVar instanceof C3.b.e) {
            return "Custom";
        }
        throw new m();
    }

    public static final String b(com.elgato.streamdeck.a.b bVar) {
        t.g(bVar, "<this>");
        int i8 = a.f35108b[bVar.ordinal()];
        if (i8 == 1) {
            return "Google Play Store";
        }
        if (i8 == 2) {
            return "Amazon Appstore";
        }
        if (i8 == 3) {
            return "Sideloaded";
        }
        if (i8 == 4) {
            return "Unknown";
        }
        throw new m();
    }

    public static final String c(Store store) {
        t.g(store, "<this>");
        switch (a.f35107a[store.ordinal()]) {
            case 1:
                return "Google Play Store";
            case 2:
                return "App Store";
            case 3:
                return "Amazon Appstore";
            case 4:
                return "Promotional";
            case 5:
                return "Unknown";
            case 6:
                return "Mac App Store";
            case 7:
                return "Stripe";
            case 8:
                return "External";
            case 9:
                return "RevenueCat Billing";
            default:
                throw new m();
        }
    }
}
