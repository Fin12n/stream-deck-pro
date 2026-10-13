package io.sentry;

import com.revenuecat.purchases.common.Constants;
import java.net.URI;

/* JADX INFO: renamed from: io.sentry.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2577v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final URI f27747e;

    public C2577v(String str) {
        try {
            io.sentry.util.u.c(str, "The DSN is required.");
            URI uriNormalize = new URI(str).normalize();
            String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = uriNormalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] strArrSplit = userInfo.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1);
            String str2 = strArrSplit[0];
            this.f27746d = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.f27745c = strArrSplit.length > 1 ? strArrSplit[1] : null;
            String path = uriNormalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int iLastIndexOf = path.lastIndexOf("/") + 1;
            String strSubstring = path.substring(0, iLastIndexOf);
            if (!strSubstring.endsWith("/")) {
                strSubstring = strSubstring + "/";
            }
            this.f27744b = strSubstring;
            String strSubstring2 = path.substring(iLastIndexOf);
            this.f27743a = strSubstring2;
            if (strSubstring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            String str3 = strSubstring;
            this.f27747e = new URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), str3 + "api/" + strSubstring2, null, null);
        } catch (Throwable th) {
            throw new IllegalArgumentException(th);
        }
    }

    public String a() {
        return this.f27746d;
    }

    public String b() {
        return this.f27745c;
    }

    public URI c() {
        return this.f27747e;
    }
}
