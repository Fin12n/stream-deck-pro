package I4;

import H.FL.dCqzKmEghGTQ;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ClassLoader f3776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Thread f3777b;

    /* JADX WARN: Code duplicated, block: B:52:0x00ab A[Catch: all -> 0x00a7, PHI: r1
      0x00ab: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:46:0x00a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:45:0x00a2, B:60:0x00d1, B:12:0x001f, B:51:0x00aa, B:52:0x00ab, B:63:0x00d5, B:64:0x00d6, B:53:0x00ac, B:59:0x00d0, B:58:0x00b6, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:42:0x0085, B:43:0x00a0, B:18:0x003c), top: B:74:0x0003, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader a() {
        SecurityException e8;
        Thread thread;
        ThreadGroup threadGroup;
        if (f3776a == null) {
            Thread thread2 = f3777b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f3777b.getContextClassLoader();
                    } catch (SecurityException e9) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e9.getMessage());
                    }
                }
                f3776a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i8 = 0;
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i9];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i9++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i8 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i8];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i8++;
                                }
                                if (thread == null) {
                                    try {
                                        a aVar = new a(threadGroup, "GmsDynamite");
                                        try {
                                            aVar.setContextClassLoader(null);
                                            aVar.start();
                                            thread = aVar;
                                        } catch (SecurityException e10) {
                                            e8 = e10;
                                            thread = aVar;
                                            Log.w("DynamiteLoaderV2CL", dCqzKmEghGTQ.GVs + e8.getMessage());
                                        }
                                    } catch (SecurityException e11) {
                                        e8 = e11;
                                    }
                                }
                            } catch (SecurityException e12) {
                                e8 = e12;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                f3777b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f3777b.getContextClassLoader();
                    }
                }
                f3776a = contextClassLoader;
            }
        }
        return f3776a;
    }
}
