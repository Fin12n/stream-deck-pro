package p063h;

import I1.e;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static r f24021d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f24023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f24024c = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f24025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f24026b;
    }

    public r(Context context, LocationManager locationManager) {
        this.f24022a = context;
        this.f24023b = locationManager;
    }

    public static r a(Context context) {
        if (f24021d == null) {
            Context applicationContext = context.getApplicationContext();
            f24021d = new r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f24021d;
    }

    public final Location b() {
        Location locationC = e.b(this.f24022a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = e.b(this.f24022a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    public final Location c(String str) {
        try {
            if (this.f24023b.isProviderEnabled(str)) {
                return this.f24023b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e8) {
            Log.d("TwilightManager", "Failed to get last known location", e8);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f24024c;
        if (e()) {
            return aVar.f24025a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f24025a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i8 = Calendar.getInstance().get(11);
        return i8 < 6 || i8 >= 22;
    }

    public final boolean e() {
        return this.f24024c.f24026b > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j8;
        a aVar = this.f24024c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        q qVarB = q.b();
        qVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        qVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z8 = qVarB.f24020c == 1;
        long j9 = qVarB.f24019b;
        long j10 = qVarB.f24018a;
        qVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j11 = qVarB.f24019b;
        if (j9 == -1 || j10 == -1) {
            j8 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j10) {
                j9 = j11;
            } else if (jCurrentTimeMillis > j9) {
                j9 = j10;
            }
            j8 = j9 + 60000;
        }
        aVar.f24025a = z8;
        aVar.f24026b = j8;
    }
}
