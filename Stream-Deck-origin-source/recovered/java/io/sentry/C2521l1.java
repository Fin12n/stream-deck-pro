package io.sentry;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: renamed from: io.sentry.l1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2521l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f27218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f27219b;

    public Map a() {
        return this.f27219b;
    }

    public URL b() {
        return this.f27218a;
    }

    public C2521l1(String str, Map<String, String> map) {
        io.sentry.util.u.c(str, "url is required");
        io.sentry.util.u.c(map, "headers is required");
        try {
            this.f27218a = URI.create(str).toURL();
            this.f27219b = map;
        } catch (MalformedURLException e8) {
            throw new IllegalArgumentException(kDsnNkYbBsI.AxUBFp, e8);
        }
    }
}
