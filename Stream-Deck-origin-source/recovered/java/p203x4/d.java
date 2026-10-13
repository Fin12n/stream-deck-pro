package p203x4;

import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.vsd2.Messages;
import com.revenuecat.purchases.common.HTTPClient;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static String a(int i8) {
        switch (i8) {
            case HTTPClient.NO_STATUS_CODE /* -1 */:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return "unknown status code: " + i8;
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                return "ERROR";
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                return "INTERRUPTED";
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
