package V3;

import H.FL.dCqzKmEghGTQ;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import kotlin.jvm.internal.AbstractC2633k;
import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10602a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        SCENE_CREATED("Scene created"),
        CONNECTION_TERMINATED("Connection terminated"),
        HELP_BUTTON_TAPPED("Tapped get help"),
        QR_SCAN_SUCCESS("QR code scanned successfully"),
        OPEN_VIRTUAL_DEVICE("Requested to open virtual device"),
        VIRTUAL_DEVICE_OPENED("Opened virtual device"),
        VIRTUAL_DEVICE_DELETE("Tapped delete virtual device"),
        VIRTUAL_DEVICE_DELETE_CONFIRM("Tapped confirm to delete virtual device"),
        f10621j("Tapped share download link"),
        RESTORE_PURCHASE("Tapped restore purchase"),
        RESTORED_PURCHASE("Restored purchase"),
        RESTORE_PURCHASE_FAILED("Restoring package failed"),
        PURCHASE_PACKAGE("Tapped purchase package"),
        PURCHASED_PACKAGE("Purchased package"),
        PURCHASE_PACKAGE_FAILED("Purchasing package failed"),
        VIEW_OTHER_PLANS("Tapped view other plans"),
        VIEW_BENEFITS("Tapped view benefits"),
        PRIVACY_POLICY("Tapped privacy policy"),
        REQUESTED_AUTHENTICATION("Requested authentication with unknown computer"),
        CANCELLED_AUTHENTICATION("Authentication cancelled"),
        REJECTED_AUTHENTICATION("Authentication rejected"),
        SUCCEEDED_AUTHENTICATION("Authentication succeeded"),
        CREATE_VIRTUAL_DEVICE("Requested to create new virtual device"),
        CREATE_DEFAULT_VIRTUAL_DEVICE("Requested to create new default virtual device"),
        CREATE_DEFAULT_VIRTUAL_FAILED("Device creation failed"),
        DISCOVERY_START("Discovery started"),
        DISCOVERY_STOP("Discovery stopped"),
        DISCONNECT(toqHM.BAFYuTOA),
        WRITE_REVIEW("Tapped write review"),
        VIRTUAL_DEVICE_SETTING_CHANGED("Virtual device setting changed"),
        ADD_CUSTOM_FACEPLATE("Tapped add custom faceplate"),
        DELETE_HOST("Tapped remove workstation"),
        f10610H("Tapped manage subscription");


        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public static final /* synthetic */ J6.a f10612V = J6.b.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10638a;

        b(String str) {
            this.f10638a = str;
        }

        public final String b() {
            return this.f10638a;
        }
    }

    /* JADX INFO: renamed from: V3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum EnumC0291c {
        KEY_PRESS_COUNT("key_press_count"),
        PAGE_TURN_COUNT("page_turn_count");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ J6.a f10642e = J6.b.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10643a;

        EnumC0291c(String str) {
            this.f10643a = str;
        }

        public final String b() {
            return this.f10643a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum d {
        ERROR_ALERT("Error Alert"),
        QR_CODE_SCANNER("QR code scanner"),
        ONBOARDING("Onboarding"),
        NEW_VIRTUAL_DEVICE("New virtual device"),
        VIRTUAL_DEVICE_DETAIL("Virtual device detail view"),
        KEYPAD("Keypad"),
        PRO_PAYWALL("Pro paywall"),
        DISCOVERY("Discovery"),
        f10652j("Keypad Stalling Dialog"),
        SETTINGS("Settings"),
        FACEPLATE("Faceplate"),
        f10655m("Pro status");


        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ J6.a f10657o = J6.b.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10658a;

        d(String str) {
            this.f10658a = str;
        }

        public final String b() {
            return this.f10658a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum e {
        f10659b("pro_entitlement_active"),
        PRO_EXPIRATION_DATE(dCqzKmEghGTQ.yhbMhEOD),
        PRO_FREE_TRIAL("pro_free_trial"),
        PRO_PROMOTIONAL("pro_promotional"),
        PRO_WILL_RENEW("pro_will_renew"),
        PRO_LATEST_PURCHASE_DATE("pro_latest_purchase_date"),
        PRO_ORIGINAL_PURCHASE_DATE("pro_original_purchase_date"),
        PRO_UNSUBSCRIBE_DETECTED_AT("pro_unsubscribe_detected_at"),
        PRO_PRODUCT_IDENTIFIER(LYdqVGvOGMNr.OgoyxBV);


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ J6.a f10669l = J6.b.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10670a;

        e(String str) {
            this.f10670a = str;
        }

        public final String b() {
            return this.f10670a;
        }
    }

    public /* synthetic */ c(AbstractC2633k abstractC2633k) {
        this();
    }

    public c() {
    }
}
