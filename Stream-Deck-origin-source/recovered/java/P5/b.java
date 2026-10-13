package P5;

import C6.G;
import C6.r;
import D6.C0938s;
import D6.U;
import D6.z;
import I6.l;
import Q6.k;
import Q6.p;
import T5.g;
import U5.f;
import X5.AbstractC1691u;
import X5.C1674c;
import X5.InterfaceC1675d;
import X5.T;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p115m6.C2691a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0252b f8896c = new C0252b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2691a f8897d = new C2691a("ContentNegotiation");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f8899b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements p088j6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f8900a = z.V0(U.i(P5.d.a(), P5.c.b()));

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f8901b = new ArrayList();

        /* JADX INFO: renamed from: P5.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0250a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final p088j6.c f8902a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C1674c f8903b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final InterfaceC1675d f8904c;

            public C0250a(p088j6.c converter, C1674c contentTypeToSend, InterfaceC1675d contentTypeMatcher) {
                t.g(converter, "converter");
                t.g(contentTypeToSend, "contentTypeToSend");
                t.g(contentTypeMatcher, "contentTypeMatcher");
                this.f8902a = converter;
                this.f8903b = contentTypeToSend;
                this.f8904c = contentTypeMatcher;
            }

            public final InterfaceC1675d a() {
                return this.f8904c;
            }

            public final C1674c b() {
                return this.f8903b;
            }

            public final p088j6.c c() {
                return this.f8902a;
            }
        }

        /* JADX INFO: renamed from: P5.b$a$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0251b implements InterfaceC1675d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1674c f8905a;

            public C0251b(C1674c c1674c) {
                this.f8905a = c1674c;
            }

            @Override // X5.InterfaceC1675d
            public boolean a(C1674c contentType) {
                t.g(contentType, "contentType");
                return contentType.g(this.f8905a);
            }
        }

        @Override // p088j6.a
        public void a(C1674c contentType, p088j6.c converter, k configuration) {
            t.g(contentType, "contentType");
            t.g(converter, "converter");
            t.g(configuration, "configuration");
            e(contentType, converter, t.c(contentType, C1674c.a.f11811a.a()) ? P5.e.f8930a : b(contentType), configuration);
        }

        public final InterfaceC1675d b(C1674c c1674c) {
            return new C0251b(c1674c);
        }

        public final Set c() {
            return this.f8900a;
        }

        public final List d() {
            return this.f8901b;
        }

        public final void e(C1674c contentTypeToSend, p088j6.c converter, InterfaceC1675d contentTypeMatcher, k configuration) {
            t.g(contentTypeToSend, "contentTypeToSend");
            t.g(converter, "converter");
            t.g(contentTypeMatcher, "contentTypeMatcher");
            t.g(configuration, "configuration");
            configuration.invoke(converter);
            this.f8901b.add(new C0250a(converter, contentTypeToSend, contentTypeMatcher));
        }
    }

    /* JADX INFO: renamed from: P5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0252b implements M5.k {

        /* JADX INFO: renamed from: P5.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends l implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f8906a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f8907b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f8908c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, G6.d dVar) {
                super(3, dVar);
                this.f8908c = bVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p173t6.e eVar, Object obj, G6.d dVar) {
                a aVar = new a(this.f8908c, dVar);
                aVar.f8907b = eVar;
                return aVar.invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
            
                if (r1.h(r7, r6) == r0) goto L18;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws P5.a {
                p173t6.e eVar;
                Object objF = H6.c.f();
                int i8 = this.f8906a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        eVar = (p173t6.e) this.f8907b;
                        r.b(obj);
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return G.f1419a;
                }
                r.b(obj);
                eVar = (p173t6.e) this.f8907b;
                b bVar = this.f8908c;
                T5.d dVar = (T5.d) eVar.d();
                Object objF2 = eVar.f();
                this.f8907b = eVar;
                this.f8906a = 1;
                obj = bVar.b(dVar, objF2, this);
                if (obj != objF) {
                }
                return objF;
                if (obj == null) {
                    return G.f1419a;
                }
                this.f8907b = null;
                this.f8906a = 2;
            }
        }

        /* JADX INFO: renamed from: P5.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0253b extends l implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f8909a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f8910b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f8911c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f8912d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0253b(b bVar, G6.d dVar) {
                super(3, dVar);
                this.f8912d = bVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p173t6.e eVar, U5.d dVar, G6.d dVar2) {
                C0253b c0253b = new C0253b(this.f8912d, dVar2);
                c0253b.f8910b = eVar;
                c0253b.f8911c = dVar;
                return c0253b.invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
            
                if (r3.h(r5, r12) == r0) goto L23;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws p088j6.b {
                C0253b c0253b;
                p173t6.e eVar;
                p181u6.a aVar;
                Object objF = H6.c.f();
                int i8 = this.f8909a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        aVar = (p181u6.a) this.f8911c;
                        eVar = (p173t6.e) this.f8910b;
                        r.b(obj);
                        c0253b = this;
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return G.f1419a;
                }
                r.b(obj);
                p173t6.e eVar2 = (p173t6.e) this.f8910b;
                U5.d dVar = (U5.d) this.f8911c;
                p181u6.a aVarA = dVar.a();
                Object objB = dVar.b();
                C1674c c1674cD = AbstractC1691u.d(((H5.b) eVar2.d()).g());
                if (c1674cD == null) {
                    P5.c.f8927a.b("Response doesn't have \"Content-Type\" header, skipping ContentNegotiation plugin");
                    return G.f1419a;
                }
                Charset charsetC = p088j6.d.c(((H5.b) eVar2.d()).f().a(), null, 1, null);
                b bVar = this.f8912d;
                T tO = ((H5.b) eVar2.d()).f().o();
                this.f8910b = eVar2;
                this.f8911c = aVarA;
                this.f8909a = 1;
                c0253b = this;
                Object objC = bVar.c(tO, aVarA, objB, c1674cD, charsetC, c0253b);
                if (objC != objF) {
                    eVar = eVar2;
                    obj = objC;
                    aVar = aVarA;
                }
                return objF;
                if (obj == null) {
                    return G.f1419a;
                }
                U5.d dVar2 = new U5.d(aVar, obj);
                c0253b.f8910b = null;
                c0253b.f8911c = null;
                c0253b.f8909a = 2;
            }
        }

        public /* synthetic */ C0252b(AbstractC2633k abstractC2633k) {
            this();
        }

        @Override // M5.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(b plugin, G5.a scope) {
            t.g(plugin, "plugin");
            t.g(scope, "scope");
            scope.A().l(g.f9911h.d(), new a(plugin, null));
            scope.Y().l(f.f10219h.c(), new C0253b(plugin, null));
        }

        @Override // M5.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b b(k block) {
            t.g(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new b(aVar.d(), aVar.c());
        }

        @Override // M5.k
        public C2691a getKey() {
            return b.f8897d;
        }

        public C0252b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f8914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f8915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f8916d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f8917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f8918f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f8919g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8921i;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f8919g = obj;
            this.f8921i |= Integer.MIN_VALUE;
            return b.this.b(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f8922a = new d();

        public d() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(a.C0250a it) {
            t.g(it, "it");
            return it.c().toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8924b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8926d;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f8924b = obj;
            this.f8926d |= Integer.MIN_VALUE;
            return b.this.c(null, null, null, null, null, this);
        }
    }

    public b(List<a.C0250a> registrations, Set<? extends X6.d> ignoredTypes) {
        t.g(registrations, "registrations");
        t.g(ignoredTypes, "ignoredTypes");
        this.f8898a = registrations;
        this.f8899b = ignoredTypes;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x0204 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0205  */
    /* JADX WARN: Code duplicated, block: B:74:0x020f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0239  */
    /* JADX WARN: Code duplicated, block: B:78:0x023e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0205 -> B:72:0x020b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(T5.d r12, java.lang.Object r13, G6.d r14) throws P5.a {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.b.b(T5.d, java.lang.Object, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(T t8, p181u6.a aVar, Object obj, C1674c c1674c, Charset charset, G6.d dVar) throws p088j6.b {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f8926d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f8926d = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objA = eVar.f8924b;
        Object objF = H6.c.f();
        int i9 = eVar.f8926d;
        if (i9 == 0) {
            r.b(objA);
            if (!(obj instanceof io.ktor.utils.io.g)) {
                P5.c.f8927a.b("Response body is already transformed. Skipping ContentNegotiation for " + t8 + com.amazon.a.a.o.c.a.b.f16789a);
                return null;
            }
            if (this.f8899b.contains(aVar.b())) {
                P5.c.f8927a.b("Response body type " + aVar.b() + " is in ignored types. Skipping ContentNegotiation for " + t8 + com.amazon.a.a.o.c.a.b.f16789a);
                return null;
            }
            List list = this.f8898a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((a.C0250a) obj2).a().a(c1674c)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C0938s.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((a.C0250a) it.next()).c());
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 == null) {
                P5.c.f8927a.b("None of the registered converters match response with Content-Type=" + c1674c + ". Skipping ContentNegotiation for " + t8 + com.amazon.a.a.o.c.a.b.f16789a);
                return null;
            }
            eVar.f8923a = t8;
            eVar.f8926d = 1;
            objA = p088j6.d.a(arrayList2, (io.ktor.utils.io.g) obj, aVar, charset, eVar);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8 = (T) eVar.f8923a;
            r.b(objA);
        }
        if (!(objA instanceof io.ktor.utils.io.g)) {
            P5.c.f8927a.b("Response body was converted to " + K.b(objA.getClass()) + " for " + t8 + com.amazon.a.a.o.c.a.b.f16789a);
        }
        return objA;
    }
}
