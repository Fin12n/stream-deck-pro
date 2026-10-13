package L1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f4959a = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements b {
        public a() {
        }

        @Override // L1.o.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(Q1.g.b bVar) {
            return bVar.e();
        }

        @Override // L1.o.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(Q1.g.b bVar) {
            return bVar.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    public static Object d(Object[] objArr, int i8, b bVar) {
        return e(objArr, (i8 & 1) == 0 ? RCHTTPStatusCodes.BAD_REQUEST : 700, (i8 & 2) != 0, bVar);
    }

    public static Object e(Object[] objArr, int i8, boolean z8, b bVar) {
        Object obj = null;
        int i9 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.a(obj2) - i8) * 2) + (bVar.b(obj2) == z8 ? 0 : 1);
            if (obj == null || i9 > iAbs) {
                obj = obj2;
                i9 = iAbs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, K1.e.c cVar, Resources resources, int i8);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, Q1.g.b[] bVarArr, int i8);

    public Typeface c(Context context, Resources resources, int i8, String str, int i9) {
        File fileD = p.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (p.b(fileD, resources, i8)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public Q1.g.b f(Q1.g.b[] bVarArr, int i8) {
        return (Q1.g.b) d(bVarArr, i8, new a());
    }
}
