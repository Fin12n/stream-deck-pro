package D2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f1821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f1822e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1825c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f1824b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f1823a = new HashMap();

    public a(Context context) {
        this.f1825c = context.getApplicationContext();
    }

    public static a e(Context context) {
        if (f1821d == null) {
            synchronized (f1822e) {
                try {
                    if (f1821d == null) {
                        f1821d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1821d;
    }

    public void a() {
        try {
            try {
                E2.a.a("Startup");
                b(this.f1825c.getPackageManager().getProviderInfo(new ComponentName(this.f1825c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                E2.a.b();
            } catch (PackageManager.NameNotFoundException e8) {
                throw new d(e8);
            }
        } catch (Throwable th) {
            E2.a.b();
            throw th;
        }
    }

    public void b(Bundle bundle) {
        String string = this.f1825c.getString(c.f1826a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f1824b.add(cls);
                        }
                    }
                }
                Iterator it = this.f1824b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e8) {
                throw new d(e8);
            }
        }
    }

    public Object c(Class cls) {
        Object objD;
        synchronized (f1822e) {
            try {
                objD = this.f1823a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objD;
    }

    public final Object d(Class cls, Set set) {
        Object objB;
        if (E2.a.d()) {
            try {
                E2.a.a(cls.getSimpleName());
            } catch (Throwable th) {
                E2.a.b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f1823a.containsKey(cls)) {
            objB = this.f1823a.get(cls);
        } else {
            set.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.f1823a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objB = bVar.b(this.f1825c);
                set.remove(cls);
                this.f1823a.put(cls, objB);
            } catch (Throwable th2) {
                throw new d(th2);
            }
        }
        E2.a.b();
        return objB;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f1824b.contains(cls);
    }
}
