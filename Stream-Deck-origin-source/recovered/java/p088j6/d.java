package p088j6;

import C6.G;
import C6.r;
import I6.l;
import Q6.o;
import X5.AbstractC1687p;
import X5.C1680i;
import X5.C1688q;
import X5.InterfaceC1684m;
import X6.m;
import io.ktor.utils.io.g;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f28321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Charset f28322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p181u6.a f28323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f28324d;

        /* JADX INFO: renamed from: j6.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0617a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f28325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Charset f28326b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p181u6.a f28327c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g f28328d;

            /* JADX INFO: renamed from: j6.d$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0618a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f28329a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f28330b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f28331c;

                public C0618a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f28329a = obj;
                    this.f28330b |= Integer.MIN_VALUE;
                    return C0617a.this.emit(null, this);
                }
            }

            public C0617a(InterfaceC2261g interfaceC2261g, Charset charset, p181u6.a aVar, g gVar) {
                this.f28325a = interfaceC2261g;
                this.f28326b = charset;
                this.f28327c = aVar;
                this.f28328d = gVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
            
                if (r9.emit(r10, r0) == r1) goto L22;
             */
            @Override // p044e7.InterfaceC2261g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, G6.d dVar) {
                C0618a c0618a;
                InterfaceC2261g interfaceC2261g;
                if (dVar instanceof C0618a) {
                    c0618a = (C0618a) dVar;
                    int i8 = c0618a.f28330b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0618a.f28330b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0618a = new C0618a(dVar);
                    }
                } else {
                    c0618a = new C0618a(dVar);
                }
                Object obj2 = c0618a.f28329a;
                Object objF = H6.c.f();
                int i9 = c0618a.f28330b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        interfaceC2261g = (InterfaceC2261g) c0618a.f28331c;
                        r.b(obj2);
                    } else {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj2);
                    }
                    return G.f1419a;
                }
                r.b(obj2);
                InterfaceC2261g interfaceC2261g2 = this.f28325a;
                Charset charset = this.f28326b;
                p181u6.a aVar = this.f28327c;
                g gVar = this.f28328d;
                c0618a.f28331c = interfaceC2261g2;
                c0618a.f28330b = 1;
                Object objA = ((p088j6.c) obj).a(charset, aVar, gVar, c0618a);
                if (objA != objF) {
                    obj2 = objA;
                    interfaceC2261g = interfaceC2261g2;
                }
                return objF;
                c0618a.f28331c = null;
                c0618a.f28330b = 2;
            }
        }

        public a(InterfaceC2260f interfaceC2260f, Charset charset, p181u6.a aVar, g gVar) {
            this.f28321a = interfaceC2260f;
            this.f28322b = charset;
            this.f28323c = aVar;
            this.f28324d = gVar;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f28321a.collect(new C0617a(interfaceC2261g, this.f28322b, this.f28323c, this.f28324d), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f28333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f28334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f28335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28336d;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f28335c = obj;
            this.f28336d |= Integer.MIN_VALUE;
            return d.a(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f28338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f28339c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar, G6.d dVar) {
            super(2, dVar);
            this.f28339c = gVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            c cVar = new c(this.f28339c, dVar);
            cVar.f28338b = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, G6.d dVar) {
            return ((c) create(obj, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f28337a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return I6.b.a(this.f28338b != null || this.f28339c.J());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(List list, g gVar, p181u6.a aVar, Charset charset, G6.d dVar) throws p088j6.b {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f28336d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f28336d = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objA = bVar.f28335c;
        Object objF = H6.c.f();
        int i9 = bVar.f28336d;
        if (i9 == 0) {
            r.b(objA);
            a aVar2 = new a(AbstractC2262h.a(list), charset, aVar, gVar);
            c cVar = new c(gVar, null);
            bVar.f28333a = gVar;
            bVar.f28334b = aVar;
            bVar.f28336d = 1;
            objA = AbstractC2262h.A(aVar2, cVar, bVar);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (p181u6.a) bVar.f28334b;
            gVar = (g) bVar.f28333a;
            r.b(objA);
        }
        if (objA != null) {
            return objA;
        }
        if (!gVar.J()) {
            return gVar;
        }
        m mVarA = aVar.a();
        if (mVarA != null && mVarA.c()) {
            return p007a6.b.f13441a;
        }
        throw new p088j6.b("No suitable converter found for " + aVar, null, 2, null);
    }

    public static final Charset b(InterfaceC1684m interfaceC1684m, Charset defaultCharset) {
        t.g(interfaceC1684m, "<this>");
        t.g(defaultCharset, "defaultCharset");
        Charset charsetD = d(interfaceC1684m, defaultCharset);
        return charsetD == null ? defaultCharset : charsetD;
    }

    public static /* synthetic */ Charset c(InterfaceC1684m interfaceC1684m, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = Z6.c.f12941b;
        }
        return b(interfaceC1684m, charset);
    }

    public static final Charset d(InterfaceC1684m interfaceC1684m, Charset defaultCharset) {
        t.g(interfaceC1684m, "<this>");
        t.g(defaultCharset, "defaultCharset");
        Iterator it = AbstractC1687p.b(interfaceC1684m.d(C1688q.f11910a.d())).iterator();
        while (it.hasNext()) {
            String strA = ((C1680i) it.next()).a();
            if (t.c(strA, "*")) {
                return defaultCharset;
            }
            if (Charset.isSupported(strA)) {
                return Charset.forName(strA);
            }
        }
        return null;
    }
}
