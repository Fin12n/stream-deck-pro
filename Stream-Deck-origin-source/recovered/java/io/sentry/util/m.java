package io.sentry.util;

import io.sentry.ILogger;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void accept(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        void a(Object obj, Class cls);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        void accept(Object obj);
    }

    public static io.sentry.H e(Object obj) {
        io.sentry.H h8 = new io.sentry.H();
        p(h8, obj);
        return h8;
    }

    public static io.sentry.hints.h f(io.sentry.H h8) {
        return (io.sentry.hints.h) h8.d("sentry:eventDropReason", io.sentry.hints.h.class);
    }

    public static Object g(io.sentry.H h8) {
        return h8.c("sentry:typeCheckHint");
    }

    public static boolean h(io.sentry.H h8, Class cls) {
        return cls.isInstance(g(h8));
    }

    public static boolean i(io.sentry.H h8) {
        return Boolean.TRUE.equals(h8.d("sentry:isFromHybridSdk", Boolean.class));
    }

    public static void j(io.sentry.H h8, Class cls, final c cVar) {
        l(h8, cls, new a() { // from class: io.sentry.util.k
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                m.d(obj);
            }
        }, new b() { // from class: io.sentry.util.l
            @Override // io.sentry.util.m.b
            public final void a(Object obj, Class cls2) {
                cVar.accept(obj);
            }
        });
    }

    public static void k(io.sentry.H h8, Class cls, a aVar) {
        l(h8, cls, aVar, new b() { // from class: io.sentry.util.i
            @Override // io.sentry.util.m.b
            public final void a(Object obj, Class cls2) {
                m.c(obj, cls2);
            }
        });
    }

    public static void l(io.sentry.H h8, Class cls, a aVar, b bVar) {
        Object objG = g(h8);
        if (!h(h8, cls) || objG == null) {
            bVar.a(objG, cls);
        } else {
            aVar.accept(objG);
        }
    }

    public static void m(io.sentry.H h8, Class cls, final ILogger iLogger, a aVar) {
        l(h8, cls, aVar, new b() { // from class: io.sentry.util.j
            @Override // io.sentry.util.m.b
            public final void a(Object obj, Class cls2) {
                s.a(cls2, obj, iLogger);
            }
        });
    }

    public static void n(io.sentry.H h8, io.sentry.hints.h hVar) {
        h8.k("sentry:eventDropReason", hVar);
    }

    public static void o(io.sentry.H h8, String str) {
        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
            h8.k("sentry:isFromHybridSdk", Boolean.TRUE);
        }
    }

    public static void p(io.sentry.H h8, Object obj) {
        h8.k("sentry:typeCheckHint", obj);
    }

    public static boolean q(io.sentry.H h8) {
        return !(h(h8, io.sentry.hints.e.class) || h(h8, io.sentry.hints.c.class)) || h(h8, io.sentry.hints.b.class);
    }

    public static /* synthetic */ void d(Object obj) {
    }

    public static /* synthetic */ void c(Object obj, Class cls) {
    }
}
