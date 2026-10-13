package p004a3;

import android.content.Context;
import java.io.File;
import p094k3.b;
import p094k3.e;
import p094k3.f;
import p094k3.g;
import p094k3.h;

/* JADX INFO: renamed from: a3.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1699e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f13224a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f13225b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f13226c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f13227d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static EnumC1695a f13228e = EnumC1695a.AUTOMATIC;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static f f13229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static e f13230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile h f13231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile g f13232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static ThreadLocal f13233j;

    public static /* synthetic */ File a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void b(String str) {
        if (f13225b) {
            f().a(str);
        }
    }

    public static float c(String str) {
        if (f13225b) {
            return f().b(str);
        }
        return 0.0f;
    }

    public static EnumC1695a d() {
        return f13228e;
    }

    public static boolean e() {
        return f13227d;
    }

    public static p121n3.f f() {
        p121n3.f fVar = (p121n3.f) f13233j.get();
        if (fVar != null) {
            return fVar;
        }
        p121n3.f fVar2 = new p121n3.f();
        f13233j.set(fVar2);
        return fVar2;
    }

    public static g g(Context context) {
        g gVar;
        if (!f13226c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        g gVar2 = f13232i;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (g.class) {
            try {
                gVar = f13232i;
                if (gVar == null) {
                    e eVar = f13230g;
                    if (eVar == null) {
                        eVar = new e() { // from class: a3.d
                            @Override // p094k3.e
                            public final File a() {
                                return AbstractC1699e.a(applicationContext);
                            }
                        };
                    }
                    gVar = new g(eVar);
                    f13232i = gVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static h h(Context context) {
        h hVar;
        h hVar2 = f13231h;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (h.class) {
            try {
                hVar = f13231h;
                if (hVar == null) {
                    g gVarG = g(context);
                    f bVar = f13229f;
                    if (bVar == null) {
                        bVar = new b();
                    }
                    hVar = new h(gVarG, bVar);
                    f13231h = hVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }
}
