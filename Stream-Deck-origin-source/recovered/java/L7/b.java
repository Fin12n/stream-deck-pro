package L7;

import M7.d;
import N7.e;
import N7.f;
import N7.g;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;
import p135p0.Dyk.GOKsbdzhLhXAMt;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f5056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f5057b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N7.c f5058c = new N7.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f5059d = g.f("slf4j.detectLoggerNameMismatch");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f5060e = {"1.6", "1.7"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f5061f = "org/slf4j/impl/StaticLoggerBinder.class";

    public static void b(d dVar, int i8) {
        if (dVar.a().e()) {
            c(i8);
        } else {
            if (dVar.a().f()) {
                return;
            }
            d();
        }
    }

    public static void c(int i8) {
        g.c("A number (" + i8 + ") of logging calls during the initialization phase have been intercepted and are");
        g.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        g.c("See also http://www.slf4j.org/codes.html#replay");
    }

    public static void e(Throwable th) {
        f5056a = 2;
        g.d("Failed to instantiate SLF4J LoggerFactory", th);
    }

    public static Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = b.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f5061f) : classLoader.getResources(f5061f);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e8) {
            g.d("Error getting resources from path", e8);
            return linkedHashSet;
        }
    }

    public static void g() {
        f fVar = f5057b;
        synchronized (fVar) {
            try {
                fVar.e();
                for (e eVar : fVar.d()) {
                    eVar.i(j(eVar.getName()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ILoggerFactory h() {
        if (f5056a == 0) {
            synchronized (b.class) {
                try {
                    if (f5056a == 0) {
                        f5056a = 1;
                        o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i8 = f5056a;
        if (i8 == 1) {
            return f5057b;
        }
        if (i8 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i8 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i8 == 4) {
            return f5058c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static a i(Class cls) {
        Class clsA;
        a aVarJ = j(cls.getName());
        if (f5059d && (clsA = g.a()) != null && n(cls, clsA)) {
            g.c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", aVarJ.getName(), clsA.getName()));
            g.c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return aVarJ;
    }

    public static a j(String str) {
        return h().a(str);
    }

    public static boolean k(Set set) {
        return set.size() > 1;
    }

    public static boolean l() {
        String strG = g.g("java.vendor.url");
        if (strG == null) {
            return false;
        }
        return strG.toLowerCase().contains("android");
    }

    public static boolean m(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    public static boolean n(Class cls, Class cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    public static final void o() {
        a();
        if (f5056a == 3) {
            u();
        }
    }

    public static void p() {
        g();
        q();
        f5057b.b();
    }

    public static void q() {
        LinkedBlockingQueue linkedBlockingQueueC = f5057b.c();
        int size = linkedBlockingQueueC.size();
        ArrayList<d> arrayList = new ArrayList(128);
        int i8 = 0;
        while (linkedBlockingQueueC.drainTo(arrayList, 128) != 0) {
            for (d dVar : arrayList) {
                r(dVar);
                int i9 = i8 + 1;
                if (i8 == 0) {
                    b(dVar, size);
                }
                i8 = i9;
            }
            arrayList.clear();
        }
    }

    public static void r(d dVar) {
        if (dVar == null) {
            return;
        }
        e eVarA = dVar.a();
        String name = eVarA.getName();
        if (eVarA.g()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (eVarA.f()) {
            return;
        }
        if (eVarA.e()) {
            eVarA.h(dVar);
        } else {
            g.c(name);
        }
    }

    public static void s(Set set) {
        if (set == null || !k(set)) {
            return;
        }
        g.c("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    public static void t(Set set) {
        if (k(set)) {
            g.c("Class path contains multiple SLF4J bindings.");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                g.c("Found binding in [" + ((URL) it.next()) + "]");
            }
            g.c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void u() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z8 = false;
            for (String str2 : f5060e) {
                if (str.startsWith(str2)) {
                    z8 = true;
                }
            }
            if (z8) {
                return;
            }
            g.c("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f5060e).toString());
            g.c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            g.d("Unexpected problem occured during version sanity check", th);
        }
    }

    public static void d() {
        g.c(kDsnNkYbBsI.cTvtZAWSt);
        g.c("during the initialization phase. Logging calls during this");
        g.c("phase were not honored. However, subsequent logging calls to these");
        g.c("loggers will work as normally expected.");
        g.c(SZCvugJaXc.XObqWWkDkCysz);
    }

    public static final void a() {
        Set setF;
        try {
            try {
                try {
                    try {
                        if (!l()) {
                            setF = f();
                            t(setF);
                        } else {
                            setF = null;
                        }
                        StaticLoggerBinder.getSingleton();
                        f5056a = 3;
                        s(setF);
                        p();
                    } catch (Exception e8) {
                        e(e8);
                        throw new IllegalStateException("Unexpected initialization failure", e8);
                    }
                } catch (NoSuchMethodError e9) {
                    String message = e9.getMessage();
                    if (message != null && message.contains(GOKsbdzhLhXAMt.obT)) {
                        f5056a = 2;
                        g.c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                        g.c("Your binding is version 1.5.5 or earlier.");
                        g.c("Upgrade your binding to version 1.6.x.");
                    }
                    throw e9;
                }
            } catch (NoClassDefFoundError e10) {
                if (m(e10.getMessage())) {
                    f5056a = 4;
                    g.c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                    g.c("Defaulting to no-operation (NOP) logger implementation");
                    g.c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                    p();
                    return;
                }
                e(e10);
                throw e10;
            }
        } catch (Throwable th) {
            p();
            throw th;
        }
    }
}
