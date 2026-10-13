package io.sentry.clientreport;

import io.sentry.util.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27051b;

    public d(String str, String str2) {
        this.f27050a = str;
        this.f27051b = str2;
    }

    public String a() {
        return this.f27051b;
    }

    public String b() {
        return this.f27050a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return u.a(b(), dVar.b()) && u.a(a(), dVar.a());
    }

    public int hashCode() {
        return u.b(b(), a());
    }
}
