package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.sentry.t2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2561t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N2 f27647a;

    public C2561t2(N2 n8) {
        this.f27647a = (N2) io.sentry.util.u.c(n8, "The SentryStackTraceFactory is required.");
    }

    public Deque a(Throwable th) {
        return b(th, new AtomicInteger(-1), new HashSet(), new ArrayDeque(), null);
    }

    public Deque b(Throwable th, AtomicInteger atomicInteger, HashSet hashSet, Deque deque, String str) {
        io.sentry.protocol.i iVar;
        Thread threadCurrentThread;
        Throwable th2;
        boolean zD;
        String str2 = str;
        int i8 = atomicInteger.get();
        Throwable cause = th;
        while (cause != null) {
            HashSet hashSet2 = hashSet;
            if (!hashSet2.add(cause)) {
                break;
            }
            if (str2 == null) {
                str2 = "chained";
            }
            int i9 = 0;
            if (cause instanceof io.sentry.exception.a) {
                io.sentry.exception.a aVar = (io.sentry.exception.a) cause;
                iVar = aVar.a();
                Throwable thC = aVar.c();
                threadCurrentThread = aVar.b();
                zD = aVar.d();
                th2 = thC;
            } else {
                iVar = new io.sentry.protocol.i();
                threadCurrentThread = Thread.currentThread();
                th2 = cause;
                zD = false;
            }
            io.sentry.protocol.i iVar2 = iVar;
            deque.addFirst(c(th2, iVar2, Long.valueOf(threadCurrentThread.getId()), this.f27647a.a(th2.getStackTrace(), Boolean.FALSE.equals(iVar2.l())), zD));
            if (iVar2.k() == null) {
                iVar2.p(str2);
            }
            if (atomicInteger.get() >= 0) {
                iVar2.o(Integer.valueOf(i8));
            }
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            iVar2.m(Integer.valueOf(iIncrementAndGet));
            Throwable[] suppressed = th2.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                while (i9 < length) {
                    b(suppressed[i9], atomicInteger, hashSet2, deque, "suppressed");
                    i9++;
                    hashSet2 = hashSet;
                    deque = deque;
                }
            }
            cause = th2.getCause();
            str2 = null;
            i8 = iIncrementAndGet;
        }
        return deque;
    }

    public final io.sentry.protocol.p c(Throwable th, io.sentry.protocol.i iVar, Long l8, List list, boolean z8) {
        Package r8 = th.getClass().getPackage();
        String name = th.getClass().getName();
        io.sentry.protocol.p pVar = new io.sentry.protocol.p();
        String message = th.getMessage();
        if (r8 != null) {
            name = name.replace(r8.getName() + ".", "");
        }
        String name2 = r8 != null ? r8.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.z zVar = new io.sentry.protocol.z(list);
            if (z8) {
                zVar.e(Boolean.TRUE);
            }
            pVar.n(zVar);
        }
        pVar.o(l8);
        pVar.p(name);
        pVar.l(iVar);
        pVar.m(name2);
        pVar.r(message);
        return pVar;
    }

    public List d(Throwable th) {
        return e(a(th));
    }

    public final List e(Deque deque) {
        return new ArrayList(deque);
    }

    public List f(io.sentry.protocol.A a8, io.sentry.protocol.i iVar, Throwable th) {
        io.sentry.protocol.z zVarN = a8.n();
        if (zVarN == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c(th, iVar, a8.l(), zVarN.d(), true));
        return arrayList;
    }
}
