package com.google.android.gms.dynamite;

import R0.pkXL.Oitvkwcwn;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p043e6.dT.GIGvBf;
import p135p0.Dyk.GOKsbdzhLhXAMt;
import p181u6.GfRt.QhsKALGiniuQ;
import p219z4.AbstractC3206o;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f17918h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f17919i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f17920j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f17921k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Boolean f17922l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static I4.h f17927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static I4.i f17928r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17929a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ThreadLocal f17923m = new ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadLocal f17924n = new I4.d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b.a f17925o = new com.google.android.gms.dynamite.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f17912b = new com.google.android.gms.dynamite.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f17913c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f17914d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f17915e = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f17916f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f17917g = new g();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f17926p = new h();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends Exception {
        public /* synthetic */ a(String str, I4.g gVar) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th, I4.g gVar) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public interface a {
            int a(Context context, String str, boolean z8);

            int b(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class C0424b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f17930a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f17931b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f17932c = 0;
        }

        C0424b a(Context context, String str, a aVar);
    }

    public DynamiteModule(Context context) {
        AbstractC3207p.k(context);
        this.f17929a = context;
    }

    public static int b(Context context, String str) {
        return e(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static int f(Context context, String str, boolean z8, boolean z9) throws Throwable {
        Throwable th;
        Exception exc;
        ?? r8 = 0;
        ?? r9 = 0;
        ?? r10 = 0;
        ?? r11 = 0;
        try {
            try {
                boolean z10 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z8 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f17924n.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z11 = false;
                            int i8 = cursorQuery.getInt(0);
                            if (i8 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f17919i = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f17921k = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z10 = false;
                                            }
                                            f17920j = z10;
                                            z11 = z10;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (i(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z9 && z11) {
                                throw new a("forcing fallback to container DynamiteLoader impl", r10 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i8;
                        }
                    } catch (Exception e8) {
                        exc = e8;
                        if (exc instanceof a) {
                            throw exc;
                        }
                        throw new a("V2 version check failed: " + exc.getMessage(), exc, r9 == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.", r11 == true ? 1 : 0);
            } catch (Throwable th3) {
                th = th3;
                r8 = context;
                if (r8 != 0) {
                    throw th;
                }
                r8.close();
                throw th;
            }
        } catch (Exception e9) {
            exc = e9;
        } catch (Throwable th4) {
            th = th4;
            if (r8 != 0) {
                throw th;
            }
            r8.close();
            throw th;
        }
    }

    public static DynamiteModule g(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    public static void h(ClassLoader classLoader) throws a {
        I4.i iVar;
        I4.g gVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                iVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                iVar = iInterfaceQueryLocalInterface instanceof I4.i ? (I4.i) iInterfaceQueryLocalInterface : new I4.i(iBinder);
            }
            f17928r = iVar;
        } catch (ClassNotFoundException e8) {
            e = e8;
            throw new a("Failed to instantiate dynamite loader", e, gVar);
        } catch (IllegalAccessException e9) {
            e = e9;
            throw new a("Failed to instantiate dynamite loader", e, gVar);
        } catch (InstantiationException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, gVar);
        } catch (NoSuchMethodException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, gVar);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new a("Failed to instantiate dynamite loader", e, gVar);
        }
    }

    public static boolean i(Cursor cursor) {
        I4.f fVar = (I4.f) f17923m.get();
        if (fVar == null || fVar.f3778a != null) {
            return false;
        }
        fVar.f3778a = cursor;
        return true;
    }

    public static boolean j(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f17922l)) {
            return true;
        }
        boolean z8 = false;
        if (f17922l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (p195w4.f.f().h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z8 = true;
            }
            f17922l = Boolean.valueOf(z8);
            if (z8 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f17920j = true;
            }
        }
        if (!z8) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z8;
    }

    public IBinder c(String str) throws a {
        try {
            return (IBinder) this.f17929a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e8) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e8, null);
        }
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField(ajyWhveMDgQ.lyOoWVjjklaH);
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC3206o.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e8) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e8.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0246  */
    /* JADX WARN: Code duplicated, block: B:118:0x024c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0255  */
    /* JADX WARN: Code duplicated, block: B:126:0x0267 A[Catch: all -> 0x007d, TryCatch #8 {all -> 0x007d, blocks: (B:7:0x0040, B:11:0x0077, B:18:0x0083, B:21:0x0089, B:24:0x0091, B:103:0x01f9, B:104:0x0204, B:107:0x0207, B:108:0x0208, B:109:0x0210, B:126:0x0267, B:127:0x027e, B:110:0x0211, B:112:0x022f, B:114:0x023e, B:124:0x025e, B:125:0x0266, B:128:0x027f, B:129:0x02af), top: B:151:0x0040, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0089 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #8 {all -> 0x007d, blocks: (B:7:0x0040, B:11:0x0077, B:18:0x0083, B:21:0x0089, B:24:0x0091, B:103:0x01f9, B:104:0x0204, B:107:0x0207, B:108:0x0208, B:109:0x0210, B:126:0x0267, B:127:0x027e, B:110:0x0211, B:112:0x022f, B:114:0x023e, B:124:0x025e, B:125:0x0266, B:128:0x027f, B:129:0x02af), top: B:151:0x0040, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[Catch: all -> 0x01ec, TryCatch #6 {, blocks: (B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6), top: B:148:0x0096, outer: #8 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1 A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TRY_ENTER, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8 A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TRY_ENTER, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0149 A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0156 A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x017a A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0181 A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0189 A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0198 A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a3 A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01b3 A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c8 A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d1 A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01da A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01e3 A[Catch: all -> 0x0107, a -> 0x010a, RemoteException -> 0x010d, TryCatch #8 {RemoteException -> 0x010d, a -> 0x010a, all -> 0x0107, blocks: (B:26:0x0095, B:32:0x00a1, B:34:0x00a8, B:35:0x00c9, B:39:0x00cf, B:41:0x00d7, B:43:0x00db, B:44:0x00e6, B:52:0x00f3, B:60:0x0123, B:62:0x012b, B:64:0x0133, B:65:0x013c, B:59:0x0110, B:68:0x013f, B:69:0x0140, B:70:0x0148, B:71:0x0149, B:72:0x0152, B:75:0x0155, B:76:0x0156, B:78:0x017a, B:80:0x0181, B:82:0x0189, B:88:0x01c2, B:90:0x01c8, B:91:0x01d1, B:92:0x01d9, B:83:0x0198, B:84:0x01a0, B:86:0x01a3, B:87:0x01b3, B:93:0x01da, B:94:0x01e2, B:95:0x01e3, B:96:0x01eb, B:102:0x01f8, B:36:0x00ca, B:37:0x00cc, B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6, B:46:0x00e9, B:50:0x00f0), top: B:152:0x0095, inners: #1, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ee A[Catch: all -> 0x01ec, TRY_ENTER, TryCatch #6 {, blocks: (B:27:0x0096, B:29:0x009c, B:30:0x009e, B:99:0x01ee, B:100:0x01f6), top: B:148:0x0096, outer: #8 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x0267, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00a8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0156, please report this as an issue */
    public static DynamiteModule d(Context context, b bVar, String str) throws Throwable {
        long j8;
        DynamiteModule dynamiteModuleG;
        int i8;
        Boolean bool;
        I4.h hVarK;
        int iQ;
        H4.a aVarT;
        Object objD;
        DynamiteModule dynamiteModule;
        I4.f fVar;
        I4.i iVar;
        I4.f fVar2;
        boolean z8;
        H4.a aVarQ;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        I4.g gVar = null;
        if (applicationContext == null) {
            throw new a("null application Context", null);
        }
        ThreadLocal threadLocal = f17923m;
        I4.f fVar3 = (I4.f) threadLocal.get();
        I4.f fVar4 = new I4.f(null);
        threadLocal.set(fVar4);
        ThreadLocal threadLocal2 = f17924n;
        Long l8 = (Long) threadLocal2.get();
        long jLongValue = l8.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0424b c0424bA = bVar.a(context, str, f17925o);
            int i9 = c0424bA.f17930a;
            j8 = 0;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i9 + " and remote module " + str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + c0424bA.f17931b);
                int i10 = c0424bA.f17932c;
                if (i10 != 0) {
                    if (i10 != -1) {
                        if (i10 == 1 || c0424bA.f17931b != 0) {
                            if (i10 == -1) {
                                dynamiteModuleG = g(applicationContext, str);
                            } else {
                                if (i10 == 1) {
                                    throw new a("VersionPolicy returned invalid code:" + i10, null);
                                }
                                try {
                                    i8 = c0424bA.f17931b;
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (j(context)) {
                                                throw new a("Remote loading disabled", null);
                                            }
                                            bool = f17918h;
                                        }
                                        if (bool != null) {
                                            throw new a("Failed to determine which loading route to use.", null);
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i(GIGvBf.YpeoOHKmMT, "Selected remote version of " + str + ", version >= " + i8);
                                            synchronized (DynamiteModule.class) {
                                                iVar = f17928r;
                                            }
                                            if (iVar != null) {
                                                throw new a(QhsKALGiniuQ.DJFgOCGWyv, null);
                                            }
                                            fVar2 = (I4.f) threadLocal.get();
                                            if (fVar2 != null || fVar2.f3778a == null) {
                                                throw new a("No result cursor", null);
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = fVar2.f3778a;
                                            H4.b.P(null);
                                            synchronized (DynamiteModule.class) {
                                                z8 = f17921k >= 2;
                                            }
                                            if (z8) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                aVarQ = iVar.R(H4.b.P(applicationContext2), str, i8, H4.b.P(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                aVarQ = iVar.Q(H4.b.P(applicationContext2), str, i8, H4.b.P(cursor2));
                                            }
                                            Context context2 = (Context) H4.b.d(aVarQ);
                                            if (context2 == null) {
                                                throw new a("Failed to get module context", gVar);
                                            }
                                            dynamiteModule = new DynamiteModule(context2);
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i8);
                                            hVarK = k(context);
                                            if (hVarK != null) {
                                                throw new a("Failed to create IDynamiteLoader.", null);
                                            }
                                            iQ = hVarK.Q();
                                            if (iQ >= 3) {
                                                fVar = (I4.f) threadLocal.get();
                                                if (fVar != null) {
                                                    throw new a("No cached result cursor holder", null);
                                                }
                                                aVarT = hVarK.U(H4.b.P(context), str, i8, H4.b.P(fVar.f3778a));
                                            } else if (iQ == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                aVarT = hVarK.V(H4.b.P(context), str, i8);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                aVarT = hVarK.T(H4.b.P(context), str, i8);
                                            }
                                            objD = H4.b.d(aVarT);
                                            if (objD != null) {
                                                throw new a("Failed to load remote module.", null);
                                            }
                                            dynamiteModule = new DynamiteModule((Context) objD);
                                        }
                                        dynamiteModuleG = dynamiteModule;
                                    } catch (RemoteException e8) {
                                        throw new a("Failed to load remote module.", e8, null);
                                    } catch (a e9) {
                                        throw e9;
                                    } catch (Throwable th) {
                                        F4.c.a(context, th);
                                        throw new a("Failed to load remote module.", th, null);
                                    }
                                } catch (a e10) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e10.getMessage());
                                    int i11 = c0424bA.f17930a;
                                    if (i11 == 0 || bVar.a(context, str, new i(i11, 0)).f17932c != -1) {
                                        throw new a("Remote load failed. No local fallback found.", e10, null);
                                    }
                                    dynamiteModuleG = g(applicationContext, str);
                                }
                            }
                            if (jLongValue == 0) {
                                f17924n.remove();
                            } else {
                                f17924n.set(l8);
                            }
                            cursor = fVar4.f3778a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            f17923m.set(fVar3);
                            return dynamiteModuleG;
                        }
                    } else if (c0424bA.f17930a != 0) {
                        i10 = -1;
                        if (i10 == 1) {
                        }
                        if (i10 == -1) {
                            dynamiteModuleG = g(applicationContext, str);
                        } else {
                            if (i10 == 1) {
                                throw new a("VersionPolicy returned invalid code:" + i10, null);
                            }
                            i8 = c0424bA.f17931b;
                            synchronized (DynamiteModule.class) {
                                if (j(context)) {
                                    throw new a("Remote loading disabled", null);
                                }
                                bool = f17918h;
                                if (bool != null) {
                                    throw new a("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    Log.i(GIGvBf.YpeoOHKmMT, "Selected remote version of " + str + ", version >= " + i8);
                                    synchronized (DynamiteModule.class) {
                                        iVar = f17928r;
                                        if (iVar != null) {
                                            throw new a(QhsKALGiniuQ.DJFgOCGWyv, null);
                                        }
                                        fVar2 = (I4.f) threadLocal.get();
                                        if (fVar2 != null) {
                                        }
                                        throw new a("No result cursor", null);
                                    }
                                }
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i8);
                                hVarK = k(context);
                                if (hVarK != null) {
                                    throw new a("Failed to create IDynamiteLoader.", null);
                                }
                                iQ = hVarK.Q();
                                if (iQ >= 3) {
                                    fVar = (I4.f) threadLocal.get();
                                    if (fVar != null) {
                                        throw new a("No cached result cursor holder", null);
                                    }
                                    aVarT = hVarK.U(H4.b.P(context), str, i8, H4.b.P(fVar.f3778a));
                                } else if (iQ == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    aVarT = hVarK.V(H4.b.P(context), str, i8);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    aVarT = hVarK.T(H4.b.P(context), str, i8);
                                }
                                objD = H4.b.d(aVarT);
                                if (objD != null) {
                                    throw new a("Failed to load remote module.", null);
                                }
                                dynamiteModule = new DynamiteModule((Context) objD);
                                dynamiteModuleG = dynamiteModule;
                            }
                        }
                        if (jLongValue == 0) {
                            f17924n.remove();
                        } else {
                            f17924n.set(l8);
                        }
                        cursor = fVar4.f3778a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f17923m.set(fVar3);
                        return dynamiteModuleG;
                    }
                }
                throw new a("No acceptable module " + str + " found. Local version is " + c0424bA.f17930a + " and remote version is " + c0424bA.f17931b + ".", null);
            } catch (Throwable th2) {
                th = th2;
                if (jLongValue == j8) {
                    f17924n.remove();
                } else {
                    f17924n.set(l8);
                }
                Cursor cursor3 = fVar4.f3778a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                f17923m.set(fVar3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j8 = 0;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:141:0x01cb */
    /* JADX WARN: Code duplicated, block: B:106:0x017b A[Catch: all -> 0x00ea, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00ea, blocks: (B:3:0x0002, B:64:0x00df, B:66:0x00e5, B:74:0x010b, B:102:0x016d, B:106:0x017b, B:124:0x01d1, B:125:0x01d4, B:119:0x01c8, B:72:0x00f0, B:127:0x01d6, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00dc, B:21:0x0049, B:45:0x009f, B:48:0x00a2, B:55:0x00ba, B:63:0x00de, B:61:0x00c0), top: B:133:0x0002, inners: #5, #12 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae A[Catch: all -> 0x0036, TryCatch #9 {all -> 0x0036, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b7, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004f, B:27:0x0053, B:31:0x005d, B:33:0x0065, B:36:0x006c, B:43:0x0096, B:44:0x009e, B:39:0x0073, B:41:0x0079, B:42:0x0088, B:47:0x00a1, B:50:0x00a4, B:51:0x00ae, B:17:0x003e), top: B:140:0x0026, inners: #1 }] */
    public static int e(Context context, String str, boolean z8) {
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f17918h;
                Cursor cursor2 = null;
                int iR = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        h(classLoader);
                                    } catch (a unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!j(context)) {
                                        return 0;
                                    }
                                    if (f17920j) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iF = f(context, str, z8, true);
                                                String str2 = f17919i;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderA = I4.b.a();
                                                    if (classLoaderA == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            String str3 = f17919i;
                                                            AbstractC3207p.k(str3);
                                                            classLoaderA = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = f17919i;
                                                            AbstractC3207p.k(str4);
                                                            classLoaderA = new I4.c(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    h(classLoaderA);
                                                    declaredField.set(null, classLoaderA);
                                                    f17918h = bool2;
                                                    return iF;
                                                }
                                                return iF;
                                            } catch (a unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f17918h = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e8) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e8.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z8, false);
                    } catch (a e9) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e9.getMessage());
                        return 0;
                    }
                }
                I4.h hVarK = k(context);
                try {
                    if (hVarK != null) {
                        try {
                            int iQ = hVarK.Q();
                            if (iQ >= 3) {
                                I4.f fVar = (I4.f) f17923m.get();
                                if (fVar == null || (cursor = fVar.f3778a) == null) {
                                    Cursor cursor3 = (Cursor) H4.b.d(hVarK.W(H4.b.P(context), str, z8, ((Long) f17924n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i8 = cursor3.getInt(0);
                                                cursor2 = (i8 <= 0 || !i(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iR = i8;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e10) {
                                            remoteException = e10;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", GOKsbdzhLhXAMt.gDWQWNpJzgd + remoteException.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iR = cursor.getInt(0);
                                }
                            } else if (iQ == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iR = hVarK.S(H4.b.P(context), str, z8);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iR = hVarK.R(H4.b.P(context), str, z8);
                            }
                        } catch (RemoteException e11) {
                            remoteException = e11;
                        }
                    }
                    return iR;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            F4.c.a(context, th5);
            throw th5;
        }
    }

    public static I4.h k(Context context) {
        I4.h hVar;
        synchronized (DynamiteModule.class) {
            I4.h hVar2 = f17927q;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(Oitvkwcwn.WxfQecAi);
                    hVar = iInterfaceQueryLocalInterface instanceof I4.h ? (I4.h) iInterfaceQueryLocalInterface : new I4.h(iBinder);
                }
                if (hVar != null) {
                    f17927q = hVar;
                    return hVar;
                }
            } catch (Exception e8) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e8.getMessage());
            }
            return null;
        }
    }
}
