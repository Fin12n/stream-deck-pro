package N7;

import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f7529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f7530b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends SecurityManager {
        public b() {
        }

        @Override // java.lang.SecurityManager
        public Class[] getClassContext() {
            return super.getClassContext();
        }
    }

    public static Class a() {
        int i8;
        b bVarB = b();
        if (bVarB == null) {
            return null;
        }
        Class[] classContext = bVarB.getClassContext();
        String name = g.class.getName();
        int i9 = 0;
        while (i9 < classContext.length && !name.equals(classContext[i9].getName())) {
            i9++;
        }
        if (i9 >= classContext.length || (i8 = i9 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i8];
    }

    public static b b() {
        b bVar = f7529a;
        if (bVar != null) {
            return bVar;
        }
        if (f7530b) {
            return null;
        }
        b bVarE = e();
        f7529a = bVarE;
        f7530b = true;
        return bVarE;
    }

    public static final void c(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void d(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    public static b e() {
        try {
            return new b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean f(String str) {
        String strG = g(str);
        if (strG == null) {
            return false;
        }
        return strG.equalsIgnoreCase(com.amazon.a.a.o.b.af);
    }

    public static String g(String str) {
        if (str == null) {
            throw new IllegalArgumentException(toqHM.TCZ);
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
