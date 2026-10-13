package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class O2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N2 f25963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2 f25964b;

    public O2(N2 n8, J2 j8) {
        this.f25963a = (N2) io.sentry.util.u.c(n8, "The SentryStackTraceFactory is required.");
        this.f25964b = (J2) io.sentry.util.u.c(j8, "The SentryOptions is required");
    }

    public List a() {
        HashMap map = new HashMap();
        Thread threadCurrentThread = Thread.currentThread();
        map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        return c(map, null, false);
    }

    public List b(List list, boolean z8) {
        return c(Thread.getAllStackTraces(), list, z8);
    }

    public List c(Map map, List list, boolean z8) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            arrayList.add(d((thread == threadCurrentThread && !z8) || !(list == null || !list.contains(Long.valueOf(thread.getId())) || z8), (StackTraceElement[]) entry.getValue(), (Thread) entry.getKey()));
        }
        return arrayList;
    }

    public final io.sentry.protocol.A d(boolean z8, StackTraceElement[] stackTraceElementArr, Thread thread) {
        io.sentry.protocol.A a8 = new io.sentry.protocol.A();
        a8.w(thread.getName());
        a8.x(Integer.valueOf(thread.getPriority()));
        a8.u(Long.valueOf(thread.getId()));
        a8.s(Boolean.valueOf(thread.isDaemon()));
        a8.z(thread.getState().name());
        a8.q(Boolean.valueOf(z8));
        List listA = this.f25963a.a(stackTraceElementArr, false);
        if (this.f25964b.isAttachStacktrace() && listA != null && !listA.isEmpty()) {
            io.sentry.protocol.z zVar = new io.sentry.protocol.z(listA);
            zVar.e(Boolean.TRUE);
            a8.y(zVar);
        }
        return a8;
    }
}
