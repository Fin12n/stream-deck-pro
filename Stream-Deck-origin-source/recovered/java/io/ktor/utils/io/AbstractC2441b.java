package io.ktor.utils.io;

/* JADX INFO: renamed from: io.ktor.utils.io.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2441b {
    public static final Void b(Throwable th) throws Throwable {
        Throwable thE;
        try {
            thE = r.e(th, th);
        } catch (Throwable unused) {
            thE = null;
        }
        if (thE == null) {
            throw th;
        }
        throw thE;
    }
}
