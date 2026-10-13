package io.ktor.utils.io.jvm.javaio;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f25534a = new ThreadLocal();

    public static final e a() {
        e eVar = (e) f25534a.get();
        return eVar == null ? c.f25523a : eVar;
    }

    public static final boolean b() {
        return a() != g.f25535a;
    }
}
