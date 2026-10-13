package io.sentry.transport;

import io.sentry.exception.uXy.SZCvugJaXc;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class v extends Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27694b;

    @Override // java.net.Authenticator
    public PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f27693a, this.f27694b.toCharArray());
        }
        return null;
    }

    public v(String str, String str2) {
        this.f27693a = (String) io.sentry.util.u.c(str, SZCvugJaXc.qUZ);
        this.f27694b = (String) io.sentry.util.u.c(str2, "password is required");
    }
}
