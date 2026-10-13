package H;

import A.AbstractC0890p0;
import A.InterfaceC0881l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: H.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0970b0 implements B.a.InterfaceC0021a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f2940a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B.a f2943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f2944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2945f;

    /* JADX INFO: renamed from: H.b0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public J.a f2946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f2947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f2948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f2949d;

        public a(J.a aVar, Executor executor, b bVar, c cVar) {
            this.f2946a = aVar;
            this.f2947b = executor;
            this.f2948c = bVar;
            this.f2949d = cVar;
        }

        public J.a a() {
            return this.f2946a;
        }

        public void b() {
            try {
                Executor executor = this.f2947b;
                final b bVar = this.f2948c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: H.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.a();
                    }
                });
            } catch (RejectedExecutionException e8) {
                AbstractC0890p0.d("CameraStateRegistry", "Unable to notify camera to configure.", e8);
            }
        }

        public void c() {
            try {
                Executor executor = this.f2947b;
                final c cVar = this.f2949d;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() { // from class: H.Z
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.a();
                    }
                });
            } catch (RejectedExecutionException e8) {
                AbstractC0890p0.d("CameraStateRegistry", "Unable to notify camera to open.", e8);
            }
        }

        public J.a d(J.a aVar) {
            J.a aVar2 = this.f2946a;
            this.f2946a = aVar;
            return aVar2;
        }
    }

    /* JADX INFO: renamed from: H.b0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        void a();
    }

    /* JADX INFO: renamed from: H.b0$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        void a();
    }

    public C0970b0(B.a aVar, int i8) {
        Object obj = new Object();
        this.f2941b = obj;
        this.f2944e = new HashMap();
        this.f2942c = i8;
        synchronized (obj) {
            this.f2943d = aVar;
            this.f2945f = this.f2942c;
        }
    }

    public static boolean d(J.a aVar) {
        return aVar != null && aVar.b();
    }

    public static void h(InterfaceC0881l interfaceC0881l, J.a aVar) {
        if (E2.a.d()) {
            E2.a.f("CX:State[" + interfaceC0881l + "]", aVar.ordinal());
        }
    }

    @Override // B.a.InterfaceC0021a
    public void a(int i8, int i9) {
        synchronized (this.f2941b) {
            boolean z8 = true;
            this.f2942c = i9 == 2 ? 2 : 1;
            boolean z9 = i8 != 2 && i9 == 2;
            if (i8 != 2 || i9 == 2) {
                z8 = false;
            }
            if (z9 || z8) {
                f();
            }
        }
    }

    public final a b(String str) {
        for (InterfaceC0881l interfaceC0881l : this.f2944e.keySet()) {
            if (str.equals(((I) interfaceC0881l.c()).e())) {
                return (a) this.f2944e.get(interfaceC0881l);
            }
        }
        return null;
    }

    public boolean c() {
        synchronized (this.f2941b) {
            try {
                Iterator it = this.f2944e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((a) ((Map.Entry) it.next()).getValue()).a() == J.a.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    public void e(InterfaceC0881l interfaceC0881l, J.a aVar, boolean z8) {
        a aVarB;
        synchronized (this.f2941b) {
            try {
                int i8 = this.f2945f;
                if ((aVar == J.a.RELEASED ? k(interfaceC0881l) : l(interfaceC0881l, aVar)) == aVar) {
                    return;
                }
                HashMap map = null;
                if (this.f2943d.c() == 2 && aVar == J.a.CONFIGURED) {
                    String strG = this.f2943d.g(((I) interfaceC0881l.c()).e());
                    if (strG != null) {
                        aVarB = b(strG);
                    } else {
                        aVarB = null;
                    }
                } else {
                    aVarB = null;
                }
                if (i8 < 1 && this.f2945f > 0) {
                    map = new HashMap();
                    for (Map.Entry entry : this.f2944e.entrySet()) {
                        if (((a) entry.getValue()).a() == J.a.PENDING_OPEN) {
                            map.put((InterfaceC0881l) entry.getKey(), (a) entry.getValue());
                        }
                    }
                } else if (aVar == J.a.PENDING_OPEN && this.f2945f > 0) {
                    map = new HashMap();
                    map.put(interfaceC0881l, (a) this.f2944e.get(interfaceC0881l));
                }
                if (map != null && !z8) {
                    map.remove(interfaceC0881l);
                }
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).c();
                    }
                }
                if (aVarB != null) {
                    aVarB.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        if (AbstractC0890p0.f("CameraStateRegistry")) {
            this.f2940a.setLength(0);
            this.f2940a.append("Recalculating open cameras:\n");
            this.f2940a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f2940a.append("-------------------------------------------------------------------\n");
        }
        int i8 = 0;
        for (Map.Entry entry : this.f2944e.entrySet()) {
            if (AbstractC0890p0.f("CameraStateRegistry")) {
                this.f2940a.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC0881l) entry.getKey()).toString(), ((a) entry.getValue()).a() != null ? ((a) entry.getValue()).a().toString() : "UNKNOWN"));
            }
            if (d(((a) entry.getValue()).a())) {
                i8++;
            }
        }
        if (AbstractC0890p0.f("CameraStateRegistry")) {
            this.f2940a.append("-------------------------------------------------------------------\n");
            this.f2940a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i8), Integer.valueOf(this.f2942c)));
            AbstractC0890p0.a("CameraStateRegistry", this.f2940a.toString());
        }
        this.f2945f = Math.max(this.f2942c - i8, 0);
    }

    public void g(InterfaceC0881l interfaceC0881l, Executor executor, b bVar, c cVar) {
        synchronized (this.f2941b) {
            T1.f.j(!this.f2944e.containsKey(interfaceC0881l), "Camera is already registered: " + interfaceC0881l);
            this.f2944e.put(interfaceC0881l, new a(null, executor, bVar, cVar));
        }
    }

    public boolean i(InterfaceC0881l interfaceC0881l) {
        boolean z8;
        synchronized (this.f2941b) {
            try {
                a aVar = (a) T1.f.h((a) this.f2944e.get(interfaceC0881l), "Camera must first be registered with registerCamera()");
                z8 = false;
                if (AbstractC0890p0.f("CameraStateRegistry")) {
                    this.f2940a.setLength(0);
                    this.f2940a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", interfaceC0881l, Integer.valueOf(this.f2945f), Boolean.valueOf(d(aVar.a())), aVar.a()));
                }
                if (this.f2945f > 0 || d(aVar.a())) {
                    J.a aVar2 = J.a.OPENING;
                    aVar.d(aVar2);
                    h(interfaceC0881l, aVar2);
                    z8 = true;
                }
                if (AbstractC0890p0.f("CameraStateRegistry")) {
                    this.f2940a.append(String.format(Locale.US, " --> %s", z8 ? "SUCCESS" : "FAIL"));
                    AbstractC0890p0.a("CameraStateRegistry", this.f2940a.toString());
                }
                if (z8) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }

    public boolean j(String str, String str2) {
        synchronized (this.f2941b) {
            try {
                boolean z8 = true;
                if (this.f2943d.c() != 2) {
                    return true;
                }
                a aVarB = b(str);
                J.a aVarA = aVarB != null ? aVarB.a() : null;
                a aVarB2 = str2 != null ? b(str2) : null;
                J.a aVarA2 = aVarB2 != null ? aVarB2.a() : null;
                J.a aVar = J.a.OPEN;
                boolean z9 = aVar.equals(aVarA) || J.a.CONFIGURED.equals(aVarA);
                boolean z10 = aVar.equals(aVarA2) || J.a.CONFIGURED.equals(aVarA2);
                if (!z9 || !z10) {
                    z8 = false;
                }
                return z8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final J.a k(InterfaceC0881l interfaceC0881l) {
        a aVar = (a) this.f2944e.remove(interfaceC0881l);
        if (aVar == null) {
            return null;
        }
        f();
        return aVar.a();
    }

    public final J.a l(InterfaceC0881l interfaceC0881l, J.a aVar) {
        J.a aVarD = ((a) T1.f.h((a) this.f2944e.get(interfaceC0881l), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).d(aVar);
        J.a aVar2 = J.a.OPENING;
        if (aVar == aVar2) {
            T1.f.j(d(aVar) || aVarD == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (aVarD != aVar) {
            h(interfaceC0881l, aVar);
            f();
        }
        return aVarD;
    }
}
