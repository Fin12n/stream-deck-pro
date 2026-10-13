package io.sentry;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f26049a;

    public Y0(Class cls) {
        this.f26049a = cls;
    }

    public static Y0 a(Class cls) {
        return new Y0(cls);
    }

    public Object b() {
        return this.f26049a.getDeclaredConstructor(null).newInstance(null);
    }
}
