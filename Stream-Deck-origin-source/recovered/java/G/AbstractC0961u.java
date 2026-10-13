package G;

import A.C0864c0;
import A.C0868e0;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: G.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0961u {
    public static Uri a(File file, C0864c0.g gVar) {
        throw null;
    }

    public static File b(C0864c0.g gVar) {
        throw null;
    }

    public static boolean c(C0864c0.g gVar) {
        throw null;
    }

    public static boolean d(C0864c0.g gVar) {
        throw null;
    }

    public static boolean e(C0864c0.g gVar) {
        throw null;
    }

    public static Uri f(File file, C0864c0.g gVar) {
        Uri uriA = null;
        try {
            try {
                if (d(gVar)) {
                    uriA = a(file, gVar);
                } else if (e(gVar) || c(gVar)) {
                    throw null;
                }
                file.delete();
                return uriA;
            } catch (IOException unused) {
                throw new C0868e0(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th) {
            file.delete();
            throw th;
        }
    }

    public static void g(File file, I.f fVar, C0864c0.g gVar, int i8) {
        try {
            I.f fVarE = I.f.e(file);
            fVar.d(fVarE);
            if (fVarE.n() == 0 && i8 != 0) {
                fVarE.u(i8);
            }
            throw null;
        } catch (IOException e8) {
            throw new C0868e0(1, "Failed to update Exif data", e8);
        }
    }
}
