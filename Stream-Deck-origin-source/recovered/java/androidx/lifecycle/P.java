package androidx.lifecycle;

import android.app.Application;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f15244b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r2.a.b f15245c = t2.g.a.f34130a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p153r2.d f15246a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static a f15248g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Application f15250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f15247f = new b(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final r2.a.b f15249h = new C0377a();

        /* JADX INFO: renamed from: androidx.lifecycle.P$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0377a implements r2.a.b {
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b {
            public /* synthetic */ b(AbstractC2633k abstractC2633k) {
                this();
            }

            public final a a(Application application) {
                kotlin.jvm.internal.t.g(application, "application");
                if (a.f15248g == null) {
                    a.f15248g = new a(application);
                }
                a aVar = a.f15248g;
                kotlin.jvm.internal.t.d(aVar);
                return aVar;
            }

            public b() {
            }
        }

        public a(Application application, int i8) {
            this.f15250e = application;
        }

        @Override // androidx.lifecycle.P.d, androidx.lifecycle.P.c
        public O a(Class modelClass) {
            kotlin.jvm.internal.t.g(modelClass, "modelClass");
            Application application = this.f15250e;
            if (application != null) {
                return h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public final O h(Class cls, Application application) {
            if (!C1718a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                O o8 = (O) cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.t.f(o8, "{\n                try {\n…          }\n            }");
                return o8;
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (InstantiationException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        }

        @Override // androidx.lifecycle.P.d, androidx.lifecycle.P.c
        public O c(Class modelClass, p153r2.a extras) {
            kotlin.jvm.internal.t.g(modelClass, "modelClass");
            kotlin.jvm.internal.t.g(extras, "extras");
            if (this.f15250e != null) {
                return a(modelClass);
            }
            Application application = (Application) extras.a(f15249h);
            if (application != null) {
                return h(modelClass, application);
            }
            if (C1718a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException(LYdqVGvOGMNr.dBBdDLnlsjlw);
            }
            return super.a(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            kotlin.jvm.internal.t.g(application, "application");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15251a = a.f15252a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f15252a = new a();
        }

        default O a(Class modelClass) {
            kotlin.jvm.internal.t.g(modelClass, "modelClass");
            return p169t2.g.f34129a.d();
        }

        default O b(X6.d modelClass, p153r2.a extras) {
            kotlin.jvm.internal.t.g(modelClass, "modelClass");
            kotlin.jvm.internal.t.g(extras, "extras");
            return c(P6.a.a(modelClass), extras);
        }

        default O c(Class modelClass, p153r2.a extras) {
            kotlin.jvm.internal.t.g(modelClass, "modelClass");
            kotlin.jvm.internal.t.g(extras, "extras");
            return a(modelClass);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static d f15254c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f15253b = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final r2.a.b f15255d = t2.g.a.f34130a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public final d a() {
                if (d.f15254c == null) {
                    d.f15254c = new d();
                }
                d dVar = d.f15254c;
                kotlin.jvm.internal.t.d(dVar);
                return dVar;
            }

            public a() {
            }
        }

        @Override // androidx.lifecycle.P.c
        public O a(Class modelClass) {
            kotlin.jvm.internal.t.g(modelClass, "modelClass");
            return p169t2.d.f34124a.a(modelClass);
        }

        @Override // androidx.lifecycle.P.c
        public O b(X6.d modelClass, p153r2.a extras) {
            kotlin.jvm.internal.t.g(modelClass, "modelClass");
            kotlin.jvm.internal.t.g(extras, "extras");
            return c(P6.a.a(modelClass), extras);
        }

        @Override // androidx.lifecycle.P.c
        public O c(Class modelClass, p153r2.a extras) {
            kotlin.jvm.internal.t.g(modelClass, "modelClass");
            kotlin.jvm.internal.t.g(extras, "extras");
            return a(modelClass);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e {
        public void d(O viewModel) {
            kotlin.jvm.internal.t.g(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public P(Q store, c factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.t.g(store, "store");
        kotlin.jvm.internal.t.g(factory, "factory");
    }

    public final O a(X6.d modelClass) {
        kotlin.jvm.internal.t.g(modelClass, "modelClass");
        return p153r2.d.b(this.f15246a, modelClass, null, 2, null);
    }

    public O b(Class modelClass) {
        kotlin.jvm.internal.t.g(modelClass, "modelClass");
        return a(P6.a.c(modelClass));
    }

    public O c(String key, Class modelClass) {
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(modelClass, "modelClass");
        return this.f15246a.a(P6.a.c(modelClass), key);
    }

    public P(p153r2.d dVar) {
        this.f15246a = dVar;
    }

    public /* synthetic */ P(Q q8, c cVar, p153r2.a aVar, int i8, AbstractC2633k abstractC2633k) {
        this(q8, cVar, (i8 & 4) != 0 ? p153r2.a.C0703a.f32334b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public P(Q q8, c factory, p153r2.a defaultCreationExtras) {
        this(new p153r2.d(q8, factory, defaultCreationExtras));
        kotlin.jvm.internal.t.g(q8, uYOhHhTXuF.OeWWrtg);
        kotlin.jvm.internal.t.g(factory, "factory");
        kotlin.jvm.internal.t.g(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public P(S owner) {
        kotlin.jvm.internal.t.g(owner, "owner");
        Q qK = owner.k();
        p169t2.g gVar = p169t2.g.f34129a;
        this(qK, gVar.b(owner), gVar.a(owner));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public P(S owner, c factory) {
        this(owner.k(), factory, p169t2.g.f34129a.a(owner));
        kotlin.jvm.internal.t.g(owner, "owner");
        kotlin.jvm.internal.t.g(factory, "factory");
    }
}
