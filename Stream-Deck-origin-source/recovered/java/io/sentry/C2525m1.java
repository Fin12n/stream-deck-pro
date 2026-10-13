package io.sentry;

import java.net.URI;
import java.util.HashMap;

/* JADX INFO: renamed from: io.sentry.m1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2525m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f27225a;

    public C2525m1(J2 j8) {
        this.f27225a = (J2) io.sentry.util.u.c(j8, "options is required");
    }

    public C2521l1 a() {
        String str;
        C2577v c2577vRetrieveParsedDsn = this.f27225a.retrieveParsedDsn();
        URI uriC = c2577vRetrieveParsedDsn.c();
        String string = uriC.resolve(uriC.getPath() + "/envelope/").toString();
        String strA = c2577vRetrieveParsedDsn.a();
        String strB = c2577vRetrieveParsedDsn.b();
        StringBuilder sb = new StringBuilder();
        sb.append("Sentry sentry_version=7,sentry_client=");
        sb.append(this.f27225a.getSentryClientName());
        sb.append(",sentry_key=");
        sb.append(strA);
        if (strB == null || strB.length() <= 0) {
            str = "";
        } else {
            str = ",sentry_secret=" + strB;
        }
        sb.append(str);
        String string2 = sb.toString();
        String sentryClientName = this.f27225a.getSentryClientName();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        return new C2521l1(string, map);
    }
}
