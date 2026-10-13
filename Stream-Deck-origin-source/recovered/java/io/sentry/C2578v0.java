package io.sentry;

import I0.mIk.efuWFSeiT;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: io.sentry.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2578v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f27748a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27749b;

    public C2578v0(int i8) {
        this.f27749b = i8;
    }

    public final List a(Collection collection, ILogger iLogger) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next(), iLogger));
        }
        return arrayList;
    }

    public final List b(Object[] objArr, ILogger iLogger) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(d(obj, iLogger));
        }
        return arrayList;
    }

    public final Map c(Map map, ILogger iLogger) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), d(obj2, iLogger));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    public Object d(Object obj, ILogger iLogger) {
        Object string;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return io.sentry.util.p.a((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return io.sentry.util.p.c((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        if (this.f27748a.contains(obj)) {
            iLogger.c(EnumC2596z2.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        this.f27748a.add(obj);
        try {
            if (this.f27748a.size() > this.f27749b) {
                this.f27748a.remove(obj);
                iLogger.c(EnumC2596z2.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    string = b((Object[]) obj, iLogger);
                } else if (obj instanceof Collection) {
                    string = a((Collection) obj, iLogger);
                } else if (obj instanceof Map) {
                    string = c((Map) obj, iLogger);
                } else {
                    Map mapE = e(obj, iLogger);
                    string = mapE.isEmpty() ? obj.toString() : mapE;
                }
                return string;
            } catch (Exception e8) {
                iLogger.b(EnumC2596z2.INFO, "Not serializing object due to throwing sub-path.", e8);
                return null;
            }
        } finally {
            this.f27748a.remove(obj);
        }
    }

    public Map e(Object obj, ILogger iLogger) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, d(field.get(obj), iLogger));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.c(EnumC2596z2.INFO, HRHLwtyqJWz.DJoGzcFI + name + efuWFSeiT.pCdPWyTlNhg, new Object[0]);
                }
            }
        }
        return map;
    }
}
