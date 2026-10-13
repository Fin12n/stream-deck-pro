package io.sentry.internal.gestures;

import io.sentry.util.u;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f27184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27188e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        CLICKABLE,
        SCROLLABLE
    }

    public b(Object obj, String str, String str2, String str3, String str4) {
        this.f27184a = new WeakReference(obj);
        this.f27185b = str;
        this.f27186c = str2;
        this.f27187d = str3;
        this.f27188e = str4;
    }

    public String a() {
        return this.f27185b;
    }

    public String b() {
        String str = this.f27186c;
        return str != null ? str : (String) u.c(this.f27187d, "UiElement.tag can't be null");
    }

    public String c() {
        return this.f27188e;
    }

    public String d() {
        return this.f27186c;
    }

    public String e() {
        return this.f27187d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (u.a(this.f27185b, bVar.f27185b) && u.a(this.f27186c, bVar.f27186c) && u.a(this.f27187d, bVar.f27187d)) {
                return true;
            }
        }
        return false;
    }

    public Object f() {
        return this.f27184a.get();
    }

    public int hashCode() {
        return u.b(this.f27184a, this.f27186c, this.f27187d);
    }
}
