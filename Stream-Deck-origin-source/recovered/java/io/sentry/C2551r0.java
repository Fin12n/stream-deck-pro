package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: io.sentry.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2551r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f27536a = new ArrayList();

    /* JADX INFO: renamed from: io.sentry.r0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27537a;

        static {
            int[] iArr = new int[io.sentry.vendor.gson.stream.b.values().length];
            f27537a = iArr;
            try {
                iArr[io.sentry.vendor.gson.stream.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27537a[io.sentry.vendor.gson.stream.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27537a[io.sentry.vendor.gson.stream.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27537a[io.sentry.vendor.gson.stream.b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27537a[io.sentry.vendor.gson.stream.b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27537a[io.sentry.vendor.gson.stream.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27537a[io.sentry.vendor.gson.stream.b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27537a[io.sentry.vendor.gson.stream.b.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27537a[io.sentry.vendor.gson.stream.b.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27537a[io.sentry.vendor.gson.stream.b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.r0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        Object a();
    }

    /* JADX INFO: renamed from: io.sentry.r0$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        Object getValue();
    }

    /* JADX INFO: renamed from: io.sentry.r0$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27540a;

        public f(String str) {
            this.f27540a = str;
        }

        @Override // io.sentry.C2551r0.c
        public Object getValue() {
            return this.f27540a;
        }
    }

    /* JADX INFO: renamed from: io.sentry.r0$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f27541a;

        public g(Object obj) {
            this.f27541a = obj;
        }

        @Override // io.sentry.C2551r0.c
        public Object getValue() {
            return this.f27541a;
        }
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    public Object e(C2555s0 c2555s0) {
        k(c2555s0);
        c cVarF = f();
        if (cVarF != null) {
            return cVarF.getValue();
        }
        return null;
    }

    public final c f() {
        if (this.f27536a.isEmpty()) {
            return null;
        }
        ArrayList arrayList = this.f27536a;
        return (c) arrayList.get(arrayList.size() - 1);
    }

    public final boolean g() {
        if (i()) {
            return true;
        }
        c cVarF = f();
        l();
        if (!(f() instanceof f)) {
            if (!(f() instanceof d)) {
                return false;
            }
            d dVar = (d) f();
            if (cVarF == null || dVar == null) {
                return false;
            }
            dVar.f27538a.add(cVarF.getValue());
            return false;
        }
        f fVar = (f) f();
        l();
        e eVar = (e) f();
        if (fVar == null || cVarF == null || eVar == null) {
            return false;
        }
        eVar.f27539a.put(fVar.f27540a, cVarF.getValue());
        return false;
    }

    public final boolean h(b bVar) {
        Object objA = bVar.a();
        if (f() == null && objA != null) {
            m(new g(objA));
            return true;
        }
        if (f() instanceof f) {
            f fVar = (f) f();
            l();
            ((e) f()).f27539a.put(fVar.f27540a, objA);
            return false;
        }
        if (!(f() instanceof d)) {
            return false;
        }
        ((d) f()).f27538a.add(objA);
        return false;
    }

    public final boolean i() {
        return this.f27536a.size() == 1;
    }

    public final Object j(C2555s0 c2555s0) {
        try {
            try {
                return Integer.valueOf(c2555s0.nextInt());
            } catch (Exception unused) {
                return Double.valueOf(c2555s0.nextDouble());
            }
        } catch (Exception unused2) {
            return Long.valueOf(c2555s0.nextLong());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void k(final C2555s0 c2555s0) {
        boolean zG;
        a aVar = null;
        switch (a.f27537a[c2555s0.peek().ordinal()]) {
            case 1:
                c2555s0.b();
                m(new d(aVar));
                zG = false;
                break;
            case 2:
                c2555s0.c();
                zG = g();
                break;
            case 3:
                c2555s0.x();
                m(new e(aVar));
                zG = false;
                break;
            case 4:
                c2555s0.u();
                zG = g();
                break;
            case 5:
                m(new f(c2555s0.F0()));
                zG = false;
                break;
            case 6:
                zG = h(new b() { // from class: io.sentry.n0
                    @Override // io.sentry.C2551r0.b
                    public final Object a() {
                        return c2555s0.G();
                    }
                });
                break;
            case 7:
                zG = h(new b() { // from class: io.sentry.o0
                    @Override // io.sentry.C2551r0.b
                    public final Object a() {
                        return this.f27239a.j(c2555s0);
                    }
                });
                break;
            case 8:
                zG = h(new b() { // from class: io.sentry.p0
                    @Override // io.sentry.C2551r0.b
                    public final Object a() {
                        return Boolean.valueOf(c2555s0.j());
                    }
                });
                break;
            case 9:
                c2555s0.o();
                zG = h(new b() { // from class: io.sentry.q0
                    @Override // io.sentry.C2551r0.b
                    public final Object a() {
                        return C2551r0.a();
                    }
                });
                break;
            case 10:
                zG = true;
                break;
            default:
                zG = false;
                break;
        }
        if (zG) {
            return;
        }
        k(c2555s0);
    }

    public final void l() {
        if (this.f27536a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f27536a;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void m(c cVar) {
        this.f27536a.add(cVar);
    }

    /* JADX INFO: renamed from: io.sentry.r0$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f27538a;

        public d() {
            this.f27538a = new ArrayList();
        }

        @Override // io.sentry.C2551r0.c
        public Object getValue() {
            return this.f27538a;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: io.sentry.r0$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f27539a;

        public e() {
            this.f27539a = new HashMap();
        }

        @Override // io.sentry.C2551r0.c
        public Object getValue() {
            return this.f27539a;
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }
}
