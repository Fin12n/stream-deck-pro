package p062g7;

import Y6.l;
import Y6.n;
import java.util.Collection;
import java.util.ServiceLoader;
import p017b7.G;

/* JADX INFO: renamed from: g7.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2369h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection f23841a = n.u(l.c(ServiceLoader.load(G.class, G.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f23841a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
