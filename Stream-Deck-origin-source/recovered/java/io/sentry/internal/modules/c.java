package io.sentry.internal.modules;

import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import io.sentry.util.C2570b;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pattern f27190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Pattern f27191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ClassLoader f27192f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f27194b;

        public a(String str, String str2) {
            this.f27193a = str;
            this.f27194b = str2;
        }
    }

    public c(ILogger iLogger) {
        this(c.class.getClassLoader(), iLogger);
    }

    @Override // io.sentry.internal.modules.d
    public Map b() {
        HashMap map = new HashMap();
        for (a aVar : e()) {
            map.put(aVar.f27193a, aVar.f27194b);
        }
        return map;
    }

    public final a d(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f27191e.matcher(str);
        if (matcher.matches() && matcher.groupCount() == 2) {
            return new a(matcher.group(1), matcher.group(2));
        }
        return null;
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f27192f.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                a aVarD = d(f(resources.nextElement()));
                if (aVarD != null) {
                    arrayList.add(aVarD);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            this.f27196a.b(EnumC2596z2.ERROR, "Unable to detect modules via manifest files.", th);
            return arrayList;
        }
    }

    public final String f(URL url) {
        Matcher matcher = this.f27190d.matcher(url.toString());
        if (matcher.matches() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        return null;
    }

    public c(ClassLoader classLoader, ILogger iLogger) {
        super(iLogger);
        this.f27190d = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f27191e = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f27192f = C2570b.a(classLoader);
    }
}
