package Q1;

import L1.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p010b0.C;
import p010b0.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f9123a = new o(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f9124b = h.a("fonts-androidx", 10, ModuleDescriptor.MODULE_VERSION);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f9125c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f9126d = new C();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f9127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f9128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q1.e f9129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f9130d;

        public a(String str, Context context, Q1.e eVar, int i8) {
            this.f9127a = str;
            this.f9128b = context;
            this.f9129c = eVar;
            this.f9130d = i8;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f9127a, this.f9128b, this.f9129c, this.f9130d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements T1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q1.a f9131a;

        public b(Q1.a aVar) {
            this.f9131a = aVar;
        }

        @Override // T1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f9131a.b(eVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f9132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f9133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q1.e f9134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f9135d;

        public c(String str, Context context, Q1.e eVar, int i8) {
            this.f9132a = str;
            this.f9133b = context;
            this.f9134c = eVar;
            this.f9135d = i8;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f9132a, this.f9133b, this.f9134c, this.f9135d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d implements T1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f9136a;

        public d(String str) {
            this.f9136a = str;
        }

        @Override // T1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f9125c) {
                try {
                    C c8 = f.f9126d;
                    ArrayList arrayList = (ArrayList) c8.get(this.f9136a);
                    if (arrayList == null) {
                        return;
                    }
                    c8.remove(this.f9136a);
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        ((T1.a) arrayList.get(i8)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String a(Q1.e eVar, int i8) {
        return eVar.d() + "-" + i8;
    }

    public static int b(g.a aVar) {
        int i8 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i8 = 0;
            for (g.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i8;
    }

    public static e c(String str, Context context, Q1.e eVar, int i8) {
        o oVar = f9123a;
        Typeface typeface = (Typeface) oVar.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a aVarE = Q1.d.e(context, eVar, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = j.b(context, null, aVarE.b(), i8);
            if (typefaceB == null) {
                return new e(-3);
            }
            oVar.d(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(Context context, Q1.e eVar, int i8, Executor executor, Q1.a aVar) {
        String strA = a(eVar, i8);
        Typeface typeface = (Typeface) f9123a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f9125c) {
            try {
                C c8 = f9126d;
                ArrayList arrayList = (ArrayList) c8.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                c8.put(strA, arrayList2);
                c cVar = new c(strA, context, eVar, i8);
                if (executor == null) {
                    executor = f9124b;
                }
                h.b(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(Context context, Q1.e eVar, Q1.a aVar, int i8, int i9) {
        String strA = a(eVar, i8);
        Typeface typeface = (Typeface) f9123a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i9 == -1) {
            e eVarC = c(strA, context, eVar, i8);
            aVar.b(eVarC);
            return eVarC.f9137a;
        }
        try {
            e eVar2 = (e) h.c(f9124b, new a(strA, context, eVar, i8), i9);
            aVar.b(eVar2);
            return eVar2.f9137a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f9137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9138b;

        public e(int i8) {
            this.f9137a = null;
            this.f9138b = i8;
        }

        public boolean a() {
            return this.f9138b == 0;
        }

        public e(Typeface typeface) {
            this.f9137a = typeface;
            this.f9138b = 0;
        }
    }
}
