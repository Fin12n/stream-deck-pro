package p219z4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z4.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3199h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f39211a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static i0 f39212b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HandlerThread f39213c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Executor f39214d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f39215e = false;

    public static int a() {
        return 4225;
    }

    public static AbstractC3199h b(Context context) {
        synchronized (f39211a) {
            try {
                if (f39212b == null) {
                    f39212b = new i0(context.getApplicationContext(), f39215e ? c().getLooper() : context.getMainLooper(), f39214d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f39212b;
    }

    public static HandlerThread c() {
        synchronized (f39211a) {
            try {
                HandlerThread handlerThread = f39213c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f39213c = handlerThread2;
                handlerThread2.start();
                return f39213c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void d(e0 e0Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i8, ServiceConnection serviceConnection, String str3, boolean z8) {
        d(new e0(str, str2, 4225, z8), serviceConnection, str3);
    }

    public abstract boolean f(e0 e0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
