package p193w2;

import Z6.v;
import Z6.w;
import android.content.Context;
import com.amazon.a.a.o.c.a.b;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f36835a = new q();

    public static final r.a a(Context context, Class klass, String str) {
        t.g(context, "context");
        t.g(klass, "klass");
        if (str == null || w.b0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new r.a(context, klass, str);
    }

    public static final Object b(Class klass, String suffix) {
        String str;
        t.g(klass, "klass");
        t.g(suffix, "suffix");
        Package r8 = klass.getPackage();
        t.d(r8);
        String fullPackage = r8.getName();
        String canonicalName = klass.getCanonicalName();
        t.d(canonicalName);
        t.f(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            t.f(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str2 = v.C(canonicalName, b.f16789a, '_', false, 4, null) + suffix;
        try {
            if (fullPackage.length() == 0) {
                str = str2;
            } else {
                str = fullPackage + b.f16789a + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            t.e(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
        }
    }

    public static final r.a c(Context context, Class klass) {
        t.g(context, "context");
        t.g(klass, "klass");
        return new r.a(context, klass, null);
    }
}
