package com.google.android.datatransport.runtime.backends;

import T0.Vl.PCRzgdeK;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.amazon.a.a.o.b.f;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p068h4.d;
import p068h4.e;
import p068h4.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
class MetadataBackendRegistry implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreationContextFactory f17812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f17813c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f17814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f17815b = null;

        public a(Context context) {
            this.f17814a = context;
        }

        public static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        public final Map a(Context context) {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(f.f16777a, -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        public final Map c() {
            if (this.f17815b == null) {
                this.f17815b = a(this.f17814a);
            }
            return this.f17815b;
        }

        public d b(String str) {
            String str2 = PCRzgdeK.kBWVfhr;
            String str3 = (String) c().get(str);
            if (str3 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str3).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e8) {
                Log.w(str2, String.format("Class %s is not found.", str3), e8);
                return null;
            } catch (IllegalAccessException e9) {
                Log.w(str2, String.format("Could not instantiate %s.", str3), e9);
                return null;
            } catch (InstantiationException e10) {
                Log.w(str2, String.format("Could not instantiate %s.", str3), e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.w(str2, String.format("Could not instantiate %s", str3), e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.w(str2, String.format("Could not instantiate %s", str3), e12);
                return null;
            }
        }
    }

    public MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
        this(new a(context), creationContextFactory);
    }

    @Override // p068h4.e
    public synchronized i d(String str) {
        if (this.f17813c.containsKey(str)) {
            return (i) this.f17813c.get(str);
        }
        d dVarB = this.f17811a.b(str);
        if (dVarB == null) {
            return null;
        }
        i iVarCreate = dVarB.create(this.f17812b.a(str));
        this.f17813c.put(str, iVarCreate);
        return iVarCreate;
    }

    public MetadataBackendRegistry(a aVar, CreationContextFactory creationContextFactory) {
        this.f17813c = new HashMap();
        this.f17811a = aVar;
        this.f17812b = creationContextFactory;
    }
}
