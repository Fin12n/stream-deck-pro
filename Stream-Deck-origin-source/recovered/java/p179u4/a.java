package p179u4;

import D6.iIQ.BmWxZhjGfw;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lock f34500c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f34501d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lock f34502a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f34503b;

    public a(Context context) {
        this.f34503b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        AbstractC3207p.k(context);
        f34500c.lock();
        try {
            if (f34501d == null) {
                f34501d = new a(context.getApplicationContext());
            }
            return f34501d;
        } finally {
            f34500c.unlock();
        }
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strC2) && (strC = c(d("googleSignInAccount", strC2))) != null) {
            try {
                return GoogleSignInAccount.k(strC);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String c(String str) {
        this.f34502a.lock();
        try {
            return this.f34503b.getString(str, null);
        } finally {
            this.f34502a.unlock();
        }
    }

    public static final String d(String str, String str2) {
        return str + BmWxZhjGfw.ObgPpSFfp + str2;
    }
}
