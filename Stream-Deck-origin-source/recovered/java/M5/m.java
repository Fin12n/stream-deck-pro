package M5;

import C6.G;
import D6.O;
import X5.AbstractC1676e;
import X5.AbstractC1691u;
import X5.C1674c;
import X5.C1685n;
import X5.C1688q;
import X5.InterfaceC1690t;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.K;
import p115m6.C2691a;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5679d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2691a f5680e = new C2691a(QhsKALGiniuQ.MIgICXoDDpZeNe);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Charset f5681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f5682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5683c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Charset f5686c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f5684a = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f5685b = new LinkedHashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Charset f5687d = Z6.c.f12941b;

        public final Map a() {
            return this.f5685b;
        }

        public final Set b() {
            return this.f5684a;
        }

        public final Charset c() {
            return this.f5687d;
        }

        public final Charset d() {
            return this.f5686c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements k {

        /* JADX INFO: renamed from: M5.m$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0207b extends I6.l implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5692a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5693b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f5694c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ m f5695d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0207b(m mVar, G6.d dVar) {
                super(3, dVar);
                this.f5695d = mVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p173t6.e eVar, U5.d dVar, G6.d dVar2) {
                C0207b c0207b = new C0207b(this.f5695d, dVar2);
                c0207b.f5693b = eVar;
                c0207b.f5694c = dVar;
                return c0207b.invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
            
                if (r3.h(r4, r12) == r0) goto L21;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                C0207b c0207b;
                p173t6.e eVar;
                p181u6.a aVar;
                Object objF = H6.c.f();
                int i8 = this.f5692a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        aVar = (p181u6.a) this.f5694c;
                        eVar = (p173t6.e) this.f5693b;
                        C6.r.b(obj);
                        c0207b = this;
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj);
                    }
                    return G.f1419a;
                }
                C6.r.b(obj);
                p173t6.e eVar2 = (p173t6.e) this.f5693b;
                U5.d dVar = (U5.d) this.f5694c;
                p181u6.a aVarA = dVar.a();
                Object objB = dVar.b();
                if (!kotlin.jvm.internal.t.c(aVarA.b(), K.b(String.class)) || !(objB instanceof io.ktor.utils.io.g)) {
                    return G.f1419a;
                }
                this.f5693b = eVar2;
                this.f5694c = aVarA;
                this.f5692a = 1;
                c0207b = this;
                Object objA = io.ktor.utils.io.g.b.a((io.ktor.utils.io.g) objB, 0L, c0207b, 1, null);
                if (objA != objF) {
                    eVar = eVar2;
                    obj = objA;
                    aVar = aVarA;
                }
                return objF;
                U5.d dVar2 = new U5.d(aVar, c0207b.f5695d.d((H5.b) eVar.d(), (p205x6.k) obj));
                c0207b.f5693b = null;
                c0207b.f5694c = null;
                c0207b.f5692a = 2;
            }
        }

        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        @Override // M5.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(m plugin, G5.a scope) {
            kotlin.jvm.internal.t.g(plugin, "plugin");
            kotlin.jvm.internal.t.g(scope, "scope");
            scope.A().l(T5.g.f9911h.b(), new a(plugin, null));
            scope.Y().l(U5.f.f10219h.c(), new C0207b(plugin, null));
        }

        @Override // M5.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public m b(Q6.k block) {
            kotlin.jvm.internal.t.g(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new m(aVar.b(), aVar.a(), aVar.d(), aVar.c());
        }

        @Override // M5.k
        public C2691a getKey() {
            return m.f5680e;
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5688a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5689b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f5690c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ m f5691d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, G6.d dVar) {
                super(3, dVar);
                this.f5691d = mVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p173t6.e eVar, Object obj, G6.d dVar) {
                a aVar = new a(this.f5691d, dVar);
                aVar.f5689b = eVar;
                aVar.f5690c = obj;
                return aVar.invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f5688a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        C6.r.b(obj);
                    } else {
                        throw new IllegalStateException(cFAYKUlMj.ZrTCrdQYi);
                    }
                } else {
                    C6.r.b(obj);
                    p173t6.e eVar = (p173t6.e) this.f5689b;
                    Object obj2 = this.f5690c;
                    this.f5691d.c((T5.d) eVar.d());
                    if (!(obj2 instanceof String)) {
                        return G.f1419a;
                    }
                    C1674c c1674cE = AbstractC1691u.e((InterfaceC1690t) eVar.d());
                    if (c1674cE == null || kotlin.jvm.internal.t.c(c1674cE.e(), C1674c.C0302c.f11833a.a().e())) {
                        Object objE = this.f5691d.e((T5.d) eVar.d(), (String) obj2, c1674cE);
                        this.f5689b = null;
                        this.f5688a = 1;
                        if (eVar.h(objE, this) == objF) {
                            return objF;
                        }
                    } else {
                        return G.f1419a;
                    }
                }
                return G.f1419a;
            }
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(p197w6.a.i((Charset) obj), p197w6.a.i((Charset) obj2));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a((Float) ((C6.o) obj2).d(), (Float) ((C6.o) obj).d());
        }
    }

    public m(Set<? extends Charset> charsets, Map<Charset, Float> charsetQuality, Charset charset, Charset responseCharsetFallback) {
        kotlin.jvm.internal.t.g(charsets, "charsets");
        kotlin.jvm.internal.t.g(charsetQuality, "charsetQuality");
        kotlin.jvm.internal.t.g(responseCharsetFallback, "responseCharsetFallback");
        this.f5681a = responseCharsetFallback;
        List<C6.o> listJ0 = D6.z.J0(O.z(charsetQuality), new d());
        ArrayList arrayList = new ArrayList();
        for (Object obj : charsets) {
            if (!charsetQuality.containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> listJ1 = D6.z.J0(arrayList, new c());
        StringBuilder sb = new StringBuilder();
        for (Charset charset2 : listJ1) {
            if (sb.length() > 0) {
                sb.append(com.amazon.a.a.o.b.f.f16777a);
            }
            sb.append(p197w6.a.i(charset2));
        }
        for (C6.o oVar : listJ0) {
            Charset charset3 = (Charset) oVar.a();
            float fFloatValue = ((Number) oVar.b()).floatValue();
            if (sb.length() > 0) {
                sb.append(com.amazon.a.a.o.b.f.f16777a);
            }
            double d8 = fFloatValue;
            if (0.0d > d8 || d8 > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb.append(p197w6.a.i(charset3) + ";q=" + (((double) S6.c.d(100 * fFloatValue)) / 100.0d));
        }
        if (sb.length() == 0) {
            sb.append(p197w6.a.i(this.f5681a));
        }
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "StringBuilder().apply(builderAction).toString()");
        this.f5683c = string;
        if (charset == null && (charset = (Charset) D6.z.k0(listJ1)) == null) {
            C6.o oVar2 = (C6.o) D6.z.k0(listJ0);
            charset = oVar2 != null ? (Charset) oVar2.c() : null;
            if (charset == null) {
                charset = Z6.c.f12941b;
            }
        }
        this.f5682b = charset;
    }

    public final void c(T5.d context) {
        kotlin.jvm.internal.t.g(context, "context");
        C1685n c1685nA = context.a();
        C1688q c1688q = C1688q.f11910a;
        if (c1685nA.i(c1688q.d()) != null) {
            return;
        }
        n.f5696a.b("Adding Accept-Charset=" + this.f5683c + " to " + context.i());
        context.a().l(c1688q.d(), this.f5683c);
    }

    public final Object e(T5.d dVar, String str, C1674c c1674c) {
        Charset charsetA;
        C1674c c1674cA = c1674c == null ? C1674c.C0302c.f11833a.a() : c1674c;
        if (c1674c == null || (charsetA = AbstractC1676e.a(c1674c)) == null) {
            charsetA = this.f5682b;
        }
        n.f5696a.b("Sending request body to " + dVar.i() + " as text/plain with charset " + charsetA);
        return new p007a6.d(str, AbstractC1676e.b(c1674cA, charsetA), null, 4, null);
    }

    public final String d(H5.b call, p205x6.n body) {
        kotlin.jvm.internal.t.g(call, "call");
        kotlin.jvm.internal.t.g(body, "body");
        Charset charsetB = AbstractC1691u.b(call.g());
        if (charsetB == null) {
            charsetB = this.f5681a;
        }
        n.f5696a.b("Reading response body for " + call.f().o() + ajyWhveMDgQ.NSD + charsetB);
        return p205x6.y.e(body, charsetB, 0, 2, null);
    }
}
