package X3;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11732e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f11733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11736d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public m(Context context) {
        t.g(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.elgato.telemetry.identity", 0);
        t.f(sharedPreferences, "getSharedPreferences(...)");
        this.f11733a = sharedPreferences;
        String string = sharedPreferences.getString("com.elgato.tracking.distinctId", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("com.elgato.tracking.distinctId", string).apply();
            t.f(string, "also(...)");
        }
        this.f11734b = string;
        String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string2 == null) {
            string2 = UUID.randomUUID().toString();
            t.f(string2, "toString(...)");
        }
        this.f11735c = string2;
        this.f11736d = sharedPreferences.getString("com.elgato.tracking.userId", null);
    }

    @Override // X3.h
    public String a() {
        return this.f11735c;
    }

    @Override // X3.h
    public String b() {
        return this.f11736d;
    }

    @Override // X3.h
    public String c() {
        return this.f11734b;
    }
}
