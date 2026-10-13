package p065h1;

import C6.C0920i;
import C6.G;
import C6.r;
import G6.e;
import G6.h;
import I0.mIk.efuWFSeiT;
import I6.l;
import L0.k;
import P1.f;
import Q6.o;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.InterfaceC1730m;
import androidx.lifecycle.InterfaceC1733p;
import androidx.lifecycle.T;
import java.util.LinkedHashMap;
import java.util.Map;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;
import p017b7.L;
import p035d7.g;
import p035d7.i;
import p035d7.j;
import p044e7.AbstractC2262h;
import p044e7.H;
import p044e7.InterfaceC2261g;
import p044e7.M;
import p215z0.AbstractC3173q;
import p215z0.C3179t0;
import p215z0.H0;
import p215z0.InterfaceC3146c0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f24241a = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC1730m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f24244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3179t0 f24245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ H0 f24246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.J f24247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ View f24248e;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f24249a;

            static {
                int[] iArr = new int[AbstractC1726i.a.values().length];
                try {
                    iArr[AbstractC1726i.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC1726i.a.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC1726i.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbstractC1726i.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AbstractC1726i.a.ON_PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AbstractC1726i.a.ON_RESUME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AbstractC1726i.a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f24249a = iArr;
            }
        }

        /* JADX INFO: renamed from: h1.c1$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0559b extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f24250a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f24251b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.J f24252c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ H0 f24253d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1733p f24254e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f24255f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ View f24256g;

            /* JADX INFO: renamed from: h1.c1$b$b$a */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f24257a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ M f24258b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ C2412r0 f24259c;

                /* JADX INFO: renamed from: h1.c1$b$b$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0560a implements InterfaceC2261g {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ C2412r0 f24260a;

                    public C0560a(C2412r0 c2412r0) {
                        this.f24260a = c2412r0;
                    }

                    public final Object a(float f8, G6.d dVar) {
                        this.f24260a.a(f8);
                        return G.f1419a;
                    }

                    @Override // p044e7.InterfaceC2261g
                    public /* bridge */ /* synthetic */ Object emit(Object obj, G6.d dVar) {
                        return a(((Number) obj).floatValue(), dVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(M m8, C2412r0 c2412r0, G6.d dVar) {
                    super(2, dVar);
                    this.f24258b = m8;
                    this.f24259c = c2412r0;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new a(this.f24258b, this.f24259c, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f24257a;
                    if (i8 == 0) {
                        r.b(obj);
                        M m8 = this.f24258b;
                        C0560a c0560a = new C0560a(this.f24259c);
                        this.f24257a = 1;
                        if (m8.collect(c0560a, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    throw new C0920i();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0559b(kotlin.jvm.internal.J j8, H0 h8, InterfaceC1733p interfaceC1733p, b bVar, View view, G6.d dVar) {
                super(2, dVar);
                this.f24252c = j8;
                this.f24253d = h8;
                this.f24254e = interfaceC1733p;
                this.f24255f = bVar;
                this.f24256g = view;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                C0559b c0559b = new C0559b(this.f24252c, this.f24253d, this.f24254e, this.f24255f, this.f24256g, dVar);
                c0559b.f24251b = obj;
                return c0559b;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j8, G6.d dVar) {
                return ((C0559b) create(j8, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v12, types: [b7.v0] */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v2, types: [b7.v0] */
            /* JADX WARN: Type inference failed for: r1v4 */
            @Override // I6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Throwable th;
                ?? r8;
                InterfaceC1815v0 interfaceC1815v0D;
                Object objF = H6.c.f();
                ?? r9 = this.f24250a;
                try {
                    if (r9 == 0) {
                        r.b(obj);
                        J j8 = (J) this.f24251b;
                        try {
                            C2412r0 c2412r0 = (C2412r0) this.f24252c.f28779a;
                            if (c2412r0 != null) {
                                M mE = c1.e(this.f24256g.getContext().getApplicationContext());
                                c2412r0.a(((Number) mE.getValue()).floatValue());
                                interfaceC1815v0D = AbstractC1789i.d(j8, null, null, new a(mE, c2412r0, null), 3, null);
                            } else {
                                interfaceC1815v0D = null;
                            }
                            H0 h8 = this.f24253d;
                            this.f24251b = interfaceC1815v0D;
                            this.f24250a = 1;
                            r9 = interfaceC1815v0D;
                            if (h8.y0(this) == objF) {
                                return objF;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r8 = 0;
                            if (r8 != 0) {
                                InterfaceC1815v0.a.a(r8, null, 1, null);
                            }
                            this.f24254e.w().d(this.f24255f);
                            throw th;
                        }
                    } else {
                        if (r9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) this.f24251b;
                        r.b(obj);
                        r9 = interfaceC1815v0;
                    }
                    if (r9 != 0) {
                        InterfaceC1815v0.a.a(r9, null, 1, null);
                    }
                    this.f24254e.w().d(this.f24255f);
                    return G.f1419a;
                } catch (Throwable th3) {
                    th = th3;
                    r8 = r9;
                }
            }
        }

        public b(J j8, C3179t0 c3179t0, H0 h8, kotlin.jvm.internal.J j9, View view) {
            this.f24244a = j8;
            this.f24245b = c3179t0;
            this.f24246c = h8;
            this.f24247d = j9;
            this.f24248e = view;
        }

        @Override // androidx.lifecycle.InterfaceC1730m
        public void j(InterfaceC1733p interfaceC1733p, AbstractC1726i.a aVar) {
            int i8 = a.f24249a[aVar.ordinal()];
            if (i8 == 1) {
                AbstractC1789i.d(this.f24244a, null, L.UNDISPATCHED, new C0559b(this.f24247d, this.f24246c, interfaceC1733p, this, this.f24248e, null), 1, null);
                return;
            }
            if (i8 == 2) {
                C3179t0 c3179t0 = this.f24245b;
                if (c3179t0 != null) {
                    c3179t0.c();
                }
                this.f24246c.x0();
                return;
            }
            if (i8 == 3) {
                this.f24246c.l0();
            } else {
                if (i8 != 4) {
                    return;
                }
                this.f24246c.Y();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f24263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ContentResolver f24264d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Uri f24265e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d f24266f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ g f24267g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Context f24268h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ContentResolver contentResolver, Uri uri, d dVar, g gVar, Context context, G6.d dVar2) {
            super(2, dVar2);
            this.f24264d = contentResolver;
            this.f24265e = uri;
            this.f24266f = dVar;
            this.f24267g = gVar;
            this.f24268h = context;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            c cVar = new c(this.f24264d, this.f24265e, this.f24266f, this.f24267g, this.f24268h, dVar);
            cVar.f24263c = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            return ((c) create(interfaceC2261g, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0054  */
        /* JADX WARN: Code duplicated, block: B:21:0x0055  */
        /* JADX WARN: Code duplicated, block: B:24:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0048, B:22:0x0058, B:24:0x0060, B:14:0x002d, B:17:0x0042), top: B:31:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0082  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        
            if (r4.emit(r9, r8) == r0) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:8:0x0019). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC2261g interfaceC2261g;
            i it;
            InterfaceC2261g interfaceC2261g2;
            Object objA;
            Object objF = H6.c.f();
            int i8 = this.f24262b;
            try {
                if (i8 == 0) {
                    r.b(obj);
                    interfaceC2261g = (InterfaceC2261g) this.f24263c;
                    this.f24264d.registerContentObserver(this.f24265e, false, this.f24266f);
                    it = this.f24267g.iterator();
                    this.f24263c = interfaceC2261g;
                    this.f24261a = it;
                    this.f24262b = 1;
                    objA = it.a(this);
                    if (objA == objF) {
                        interfaceC2261g2 = interfaceC2261g;
                        obj = objA;
                        if (!((Boolean) obj).booleanValue()) {
                            this.f24264d.unregisterContentObserver(this.f24266f);
                            return G.f1419a;
                        }
                        it.next();
                        Float fC = I6.b.c(Settings.Global.getFloat(this.f24268h.getContentResolver(), "animator_duration_scale", 1.0f));
                        this.f24263c = interfaceC2261g2;
                        this.f24261a = it;
                        this.f24262b = 2;
                    }
                    return objF;
                }
                if (i8 == 1) {
                    it = (i) this.f24261a;
                    interfaceC2261g2 = (InterfaceC2261g) this.f24263c;
                    r.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        this.f24264d.unregisterContentObserver(this.f24266f);
                        return G.f1419a;
                    }
                    it.next();
                    Float fC2 = I6.b.c(Settings.Global.getFloat(this.f24268h.getContentResolver(), "animator_duration_scale", 1.0f));
                    this.f24263c = interfaceC2261g2;
                    this.f24261a = it;
                    this.f24262b = 2;
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (i) this.f24261a;
                    interfaceC2261g2 = (InterfaceC2261g) this.f24263c;
                    r.b(obj);
                }
                interfaceC2261g = interfaceC2261g2;
                this.f24263c = interfaceC2261g;
                this.f24261a = it;
                this.f24262b = 1;
                objA = it.a(this);
                if (objA == objF) {
                    interfaceC2261g2 = interfaceC2261g;
                    obj = objA;
                    if (!((Boolean) obj).booleanValue()) {
                        this.f24264d.unregisterContentObserver(this.f24266f);
                        return G.f1419a;
                    }
                    it.next();
                    Float fC3 = I6.b.c(Settings.Global.getFloat(this.f24268h.getContentResolver(), "animator_duration_scale", 1.0f));
                    this.f24263c = interfaceC2261g2;
                    this.f24261a = it;
                    this.f24262b = 2;
                }
                return objF;
            } catch (Throwable th) {
                this.f24264d.unregisterContentObserver(this.f24266f);
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f24269a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g gVar, Handler handler) {
            super(handler);
            this.f24269a = gVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z8, Uri uri) {
            this.f24269a.m(G.f1419a);
        }
    }

    public static final H0 b(View view, G6.g gVar, AbstractC1726i abstractC1726i) {
        C3179t0 c3179t0;
        if (gVar.A(e.f2817J) == null || gVar.A(InterfaceC3146c0.f38734U) == null) {
            gVar = K.f24114m.a().P1(gVar);
        }
        InterfaceC3146c0 interfaceC3146c0 = (InterfaceC3146c0) gVar.A(InterfaceC3146c0.f38734U);
        if (interfaceC3146c0 != null) {
            C3179t0 c3179t1 = new C3179t0(interfaceC3146c0);
            c3179t1.a();
            c3179t0 = c3179t1;
        } else {
            c3179t0 = null;
        }
        kotlin.jvm.internal.J j8 = new kotlin.jvm.internal.J();
        G6.g c2412r0 = (k) gVar.A(k.f4851K);
        if (c2412r0 == null) {
            c2412r0 = new C2412r0();
            j8.f28779a = c2412r0;
        }
        G6.g gVarP1 = gVar.P1(c3179t0 != null ? c3179t0 : h.f2820a).P1(c2412r0);
        H0 h8 = new H0(gVarP1);
        h8.l0();
        J jA = K.a(gVarP1);
        if (abstractC1726i == null) {
            InterfaceC1733p interfaceC1733pA = T.a(view);
            abstractC1726i = interfaceC1733pA != null ? interfaceC1733pA.w() : null;
        }
        if (abstractC1726i != null) {
            view.addOnAttachStateChangeListener(new a(view, h8));
            abstractC1726i.a(new b(jA, c3179t0, h8, j8, view));
            return h8;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ H0 c(View view, G6.g gVar, AbstractC1726i abstractC1726i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = h.f2820a;
        }
        if ((i8 & 2) != 0) {
            abstractC1726i = null;
        }
        return b(view, gVar, abstractC1726i);
    }

    public static final AbstractC3173q d(View view) {
        AbstractC3173q abstractC3173qF = f(view);
        if (abstractC3173qF != null) {
            return abstractC3173qF;
        }
        for (ViewParent parent = view.getParent(); abstractC3173qF == null && (parent instanceof View); parent = parent.getParent()) {
            abstractC3173qF = f((View) parent);
        }
        return abstractC3173qF;
    }

    public static final M e(Context context) {
        M m8;
        Map map = f24241a;
        synchronized (map) {
            try {
                Object objT = map.get(context);
                if (objT == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    g gVarB = j.b(-1, null, null, 6, null);
                    objT = AbstractC2262h.T(AbstractC2262h.D(new c(contentResolver, uriFor, new d(gVarB, f.a(Looper.getMainLooper())), gVarB, context, null)), K.b(), H.a.b(H.f20929a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, objT);
                }
                m8 = (M) objT;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m8;
    }

    public static final AbstractC3173q f(View view) {
        Object tag = view.getTag(L0.l.f4859G);
        if (tag instanceof AbstractC3173q) {
            return (AbstractC3173q) tag;
        }
        return null;
    }

    public static final View g(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final void i(View view, AbstractC3173q abstractC3173q) {
        view.setTag(L0.l.f4859G, abstractC3173q);
    }

    public static final H0 h(View view) {
        if (view.isAttachedToWindow()) {
            View viewG = g(view);
            AbstractC3173q abstractC3173qF = f(viewG);
            if (abstractC3173qF == null) {
                return b1.f24233a.a(viewG);
            }
            if (abstractC3173qF instanceof H0) {
                return (H0) abstractC3173qF;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
        }
        throw new IllegalStateException((efuWFSeiT.tBw + view + " is not attached to a window").toString());
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f24242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ H0 f24243b;

        public a(View view, H0 h8) {
            this.f24242a = view;
            this.f24243b = h8;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f24242a.removeOnAttachStateChangeListener(this);
            this.f24243b.Y();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
