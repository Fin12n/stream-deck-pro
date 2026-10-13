package io.sentry;

import androidx.startup.TrZh.ZWZaxQrCHfNe;
import io.sentry.util.C2569a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map f25876h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f25877a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25878b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2569a f25879c = new C2569a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2479b f25880d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2479b f25881e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2479b f25882f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2517k1 f25883g = null;

    public void a(List list) {
        if (list != null) {
            this.f25878b.addAll(list);
        }
    }

    public void b() {
        InterfaceC2480b0 interfaceC2480b0A = this.f25879c.a();
        try {
            Iterator it = this.f25877a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
                    it.remove();
                }
            }
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Object c(String str) {
        InterfaceC2480b0 interfaceC2480b0A = this.f25879c.a();
        try {
            Object obj = this.f25877a.get(str);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return obj;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Object d(String str, Class cls) {
        InterfaceC2480b0 interfaceC2480b0A = this.f25879c.a();
        try {
            Object obj = this.f25877a.get(str);
            if (cls.isInstance(obj)) {
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                    return obj;
                }
            } else {
                if (!j(obj, cls)) {
                    if (interfaceC2480b0A != null) {
                        interfaceC2480b0A.close();
                    }
                    return null;
                }
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
            }
            return obj;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public List e() {
        return new ArrayList(this.f25878b);
    }

    public C2517k1 f() {
        return this.f25883g;
    }

    public C2479b g() {
        return this.f25880d;
    }

    public C2479b h() {
        return this.f25882f;
    }

    public C2479b i() {
        return this.f25881e;
    }

    public final boolean j(Object obj, Class cls) {
        Class cls2 = (Class) f25876h.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    public void k(String str, Object obj) {
        InterfaceC2480b0 interfaceC2480b0A = this.f25879c.a();
        try {
            this.f25877a.put(str, obj);
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void l(C2517k1 c2517k1) {
        this.f25883g = c2517k1;
    }

    public void m(C2479b c2479b) {
        this.f25880d = c2479b;
    }

    public void n(C2479b c2479b) {
        this.f25882f = c2479b;
    }

    public void o(C2479b c2479b) {
        this.f25881e = c2479b;
    }

    static {
        HashMap map = new HashMap();
        f25876h = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put(ZWZaxQrCHfNe.POBczgN, Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }
}
