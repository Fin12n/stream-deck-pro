package L1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f4944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p010b0.o f4945b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends Q1.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public K1.h.e f4946a;

        public a(K1.h.e eVar) {
            this.f4946a = eVar;
        }

        @Override // Q1.g.c
        public void a(int i8) {
            K1.h.e eVar = this.f4946a;
            if (eVar != null) {
                eVar.f(i8);
            }
        }

        @Override // Q1.g.c
        public void b(Typeface typeface) {
            K1.h.e eVar = this.f4946a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f4944a = new n();
        } else {
            f4944a = new m();
        }
        f4945b = new p010b0.o(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i8) {
        if (context != null) {
            return Typeface.create(typeface, i8);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, Q1.g.b[] bVarArr, int i8) {
        return f4944a.b(context, cancellationSignal, bVarArr, i8);
    }

    public static Typeface c(Context context, K1.e.b bVar, Resources resources, int i8, String str, int i9, int i10, K1.h.e eVar, Handler handler, boolean z8) {
        Typeface typefaceA;
        if (bVar instanceof K1.e.C0162e) {
            K1.e.C0162e c0162e = (K1.e.C0162e) bVar;
            Typeface typefaceG = g(c0162e.c());
            if (typefaceG != null) {
                if (eVar != null) {
                    eVar.d(typefaceG, handler);
                }
                return typefaceG;
            }
            typefaceA = Q1.g.c(context, c0162e.b(), i10, !z8 ? eVar != null : c0162e.a() != 0, z8 ? c0162e.d() : -1, K1.h.e.e(handler), new a(eVar));
        } else {
            typefaceA = f4944a.a(context, (K1.e.c) bVar, resources, i10);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f4945b.d(e(resources, i8, str, i9, i10), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface d(Context context, Resources resources, int i8, String str, int i9, int i10) {
        Typeface typefaceC = f4944a.c(context, resources, i8, str, i10);
        if (typefaceC != null) {
            f4945b.d(e(resources, i8, str, i9, i10), typefaceC);
        }
        return typefaceC;
    }

    public static String e(Resources resources, int i8, String str, int i9, int i10) {
        return resources.getResourcePackageName(i8) + '-' + str + '-' + i9 + '-' + i8 + '-' + i10;
    }

    public static Typeface f(Resources resources, int i8, String str, int i9, int i10) {
        return (Typeface) f4945b.c(e(resources, i8, str, i9, i10));
    }

    public static Typeface g(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }
}
