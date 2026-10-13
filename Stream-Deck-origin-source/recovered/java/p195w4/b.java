package p195w4;

import A4.a;
import A4.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.vsd2.Messages;
import com.revenuecat.purchases.common.HTTPClient;
import p219z4.AbstractC3206o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f37085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f37082e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new p();

    public b(int i8, int i9, PendingIntent pendingIntent, String str) {
        this.f37083a = i8;
        this.f37084b = i9;
        this.f37085c = pendingIntent;
        this.f37086d = str;
    }

    public static String f(int i8) {
        if (i8 == 99) {
            return "UNFINISHED";
        }
        if (i8 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i8) {
            case HTTPClient.NO_STATUS_CODE /* -1 */:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
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
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i8) {
                    case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                        return "CANCELED";
                    case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                        return "TIMEOUT";
                    case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i8 + ")";
                }
        }
    }

    public int a() {
        return this.f37084b;
    }

    public String b() {
        return this.f37086d;
    }

    public PendingIntent c() {
        return this.f37085c;
    }

    public boolean d() {
        return (this.f37084b == 0 || this.f37085c == null) ? false : true;
    }

    public boolean e() {
        return this.f37084b == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f37084b == bVar.f37084b && AbstractC3206o.a(this.f37085c, bVar.f37085c) && AbstractC3206o.a(this.f37086d, bVar.f37086d);
    }

    public int hashCode() {
        return AbstractC3206o.b(Integer.valueOf(this.f37084b), this.f37085c, this.f37086d);
    }

    public String toString() {
        AbstractC3206o.a aVarC = AbstractC3206o.c(this);
        aVarC.a("statusCode", f(this.f37084b));
        aVarC.a("resolution", this.f37085c);
        aVarC.a("message", this.f37086d);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f37083a;
        int iA = c.a(parcel);
        c.j(parcel, 1, i9);
        c.j(parcel, 2, a());
        c.m(parcel, 3, c(), i8, false);
        c.n(parcel, 4, b(), false);
        c.b(parcel, iA);
    }

    public b(int i8) {
        this(i8, null, null);
    }

    public b(int i8, PendingIntent pendingIntent) {
        this(i8, pendingIntent, null);
    }

    public b(int i8, PendingIntent pendingIntent, String str) {
        this(1, i8, pendingIntent, str);
    }
}
