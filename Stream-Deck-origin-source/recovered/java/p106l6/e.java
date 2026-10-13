package p106l6;

import C6.G;
import C6.r;
import I6.l;
import Q6.o;
import X5.AbstractC1676e;
import X5.C1674c;
import Z6.v;
import com.google.mlkit.common.internal.ckI.WqXA;
import io.ktor.utils.io.g;
import io.ktor.utils.io.j;
import io.ktor.utils.io.k;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements p097k6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.c f29222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f29223b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f29224a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29226c;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f29224a = obj;
            this.f29226c |= Integer.MIN_VALUE;
            return e.this.a(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2261g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f29228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p106l6.a f29229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e f29230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p116m7.b f29231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Charset f29232f;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f29233a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f29234b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f29236d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f29237e;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f29233a = obj;
                this.f29234b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(j jVar, p106l6.a aVar, e eVar, p116m7.b bVar, Charset charset) {
            this.f29228b = jVar;
            this.f29229c = aVar;
            this.f29230d = eVar;
            this.f29231e = bVar;
            this.f29232f = charset;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0083  */
        /* JADX WARN: Code duplicated, block: B:28:0x0088  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
        
            if (io.ktor.utils.io.k.b(r2, r9, r0) == r1) goto L31;
         */
        @Override // p044e7.InterfaceC2261g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(Object obj, G6.d dVar) {
            a aVar;
            Object obj2;
            b bVar;
            b bVar2;
            String strC;
            byte[] bArrG;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i8 = aVar.f29234b;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.f29234b = i8 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj3 = aVar.f29233a;
            Object objF = H6.c.f();
            int i9 = aVar.f29234b;
            if (i9 != 0) {
                if (i9 == 1) {
                    obj = aVar.f29237e;
                    bVar2 = (b) aVar.f29236d;
                    r.b(obj3);
                } else {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) aVar.f29236d;
                    r.b(obj3);
                }
                bVar.f29228b.flush();
                return G.f1419a;
            }
            r.b(obj3);
            int i10 = this.f29227a;
            this.f29227a = i10 + 1;
            if (i10 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            if (i10 > 0) {
                j jVar = this.f29228b;
                byte[] bArrC = this.f29229c.c();
                aVar.f29236d = this;
                aVar.f29237e = obj;
                aVar.f29234b = 1;
                if (k.b(jVar, bArrC, aVar) != objF) {
                    bVar2 = this;
                }
            } else {
                obj2 = obj;
                bVar = this;
                strC = bVar.f29230d.f29222a.c(bVar.f29231e, obj2);
                j jVar2 = bVar.f29228b;
                if (t.c(bVar.f29232f, Z6.c.f12941b)) {
                    bArrG = v.s(strC);
                } else {
                    CharsetEncoder charsetEncoderNewEncoder = bVar.f29232f.newEncoder();
                    t.f(charsetEncoderNewEncoder, WqXA.tTRZqjkirJ);
                    bArrG = p197w6.a.g(charsetEncoderNewEncoder, strC, 0, strC.length());
                }
                aVar.f29236d = bVar;
                aVar.f29237e = null;
                aVar.f29234b = 2;
            }
            return objF;
            obj2 = obj;
            bVar = bVar2;
            strC = bVar.f29230d.f29222a.c(bVar.f29231e, obj2);
            j jVar3 = bVar.f29228b;
            if (t.c(bVar.f29232f, Z6.c.f12941b)) {
                bArrG = v.s(strC);
            } else {
                CharsetEncoder charsetEncoderNewEncoder2 = bVar.f29232f.newEncoder();
                t.f(charsetEncoderNewEncoder2, WqXA.tTRZqjkirJ);
                bArrG = p197w6.a.g(charsetEncoderNewEncoder2, strC, 0, strC.length());
            }
            aVar.f29236d = bVar;
            aVar.f29237e = null;
            aVar.f29234b = 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f29239b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f29241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p116m7.b f29242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Charset f29243f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, p116m7.b bVar, Charset charset, G6.d dVar) {
            super(2, dVar);
            this.f29241d = obj;
            this.f29242e = bVar;
            this.f29243f = charset;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            c cVar = e.this.new c(this.f29241d, this.f29242e, this.f29243f, dVar);
            cVar.f29239b = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j jVar, G6.d dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f29238a;
            if (i8 == 0) {
                r.b(obj);
                j jVar = (j) this.f29239b;
                e eVar = e.this;
                Object obj2 = this.f29241d;
                t.e(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<*>");
                p116m7.b bVar = this.f29242e;
                t.e(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                Charset charset = this.f29243f;
                this.f29238a = 1;
                if (eVar.e((InterfaceC2260f) obj2, bVar, charset, jVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f29244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f29245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f29246c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f29247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f29248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f29249f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f29250g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f29252i;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f29250g = obj;
            this.f29252i |= Integer.MIN_VALUE;
            return e.this.e(null, null, null, null, this);
        }
    }

    public e(r7.c format) {
        t.g(format, "format");
        this.f29222a = format;
        this.f29223b = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p097k6.e
    public Object a(Charset charset, p181u6.a aVar, g gVar, G6.d dVar) throws p088j6.e {
        a aVar2;
        if (dVar instanceof a) {
            aVar2 = (a) dVar;
            int i8 = aVar2.f29226c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar2.f29226c = i8 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(dVar);
            }
        } else {
            aVar2 = new a(dVar);
        }
        Object obj = aVar2.f29224a;
        Object objF = H6.c.f();
        int i9 = aVar2.f29226c;
        try {
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            if (!t.c(charset, Z6.c.f12941b) || !t.c(aVar.b(), K.b(Y6.g.class))) {
                return null;
            }
            r7.c cVar = this.f29222a;
            aVar2.f29226c = 1;
            Object objA = p106l6.b.a(cVar, gVar, aVar, aVar2);
            return objA == objF ? objF : objA;
        } catch (Throwable th) {
            throw new p088j6.e("Illegal input: " + th.getMessage(), th);
        }
    }

    @Override // p097k6.e
    public Object b(C1674c c1674c, Charset charset, p181u6.a aVar, Object obj, G6.d dVar) {
        if (!t.c(charset, Z6.c.f12941b) || !t.c(aVar.b(), K.b(InterfaceC2260f.class))) {
            return null;
        }
        return new p007a6.a(new c(obj, p097k6.g.d(this.f29222a.a(), f.a(aVar)), charset, null), AbstractC1676e.c(c1674c, charset), null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (io.ktor.utils.io.k.b(r2, r1, r4) == r5) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(InterfaceC2260f interfaceC2260f, p116m7.b bVar, Charset charset, j jVar, G6.d dVar) {
        d dVar2;
        InterfaceC2260f interfaceC2260f2;
        e eVar;
        Charset charset2;
        p106l6.a aVar;
        p116m7.b bVar2;
        j jVar2;
        p106l6.a aVar2;
        j jVar3 = jVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i8 = dVar2.f29252i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.f29252i = i8 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f29250g;
        Object objF = H6.c.f();
        int i9 = dVar2.f29252i;
        if (i9 == 0) {
            r.b(obj);
            Map map = this.f29223b;
            Object aVar3 = map.get(charset);
            if (aVar3 == null) {
                aVar3 = new p106l6.a(charset);
                map.put(charset, aVar3);
            }
            p106l6.a aVar4 = (p106l6.a) aVar3;
            byte[] bArrA = aVar4.a();
            dVar2.f29244a = this;
            interfaceC2260f2 = interfaceC2260f;
            dVar2.f29245b = interfaceC2260f2;
            dVar2.f29246c = bVar;
            dVar2.f29247d = charset;
            dVar2.f29248e = jVar3;
            dVar2.f29249f = aVar4;
            dVar2.f29252i = 1;
            if (k.b(jVar3, bArrA, dVar2) != objF) {
                eVar = this;
                charset2 = charset;
                aVar = aVar4;
                bVar2 = bVar;
            }
            return objF;
        }
        if (i9 == 1) {
            p106l6.a aVar5 = (p106l6.a) dVar2.f29249f;
            jVar3 = (j) dVar2.f29248e;
            Charset charset3 = (Charset) dVar2.f29247d;
            p116m7.b bVar3 = (p116m7.b) dVar2.f29246c;
            interfaceC2260f2 = (InterfaceC2260f) dVar2.f29245b;
            e eVar2 = (e) dVar2.f29244a;
            r.b(obj);
            aVar = aVar5;
            charset2 = charset3;
            bVar2 = bVar3;
            eVar = eVar2;
        } else if (i9 == 2) {
            aVar2 = (p106l6.a) dVar2.f29245b;
            jVar2 = (j) dVar2.f29244a;
            r.b(obj);
            byte[] bArrB = aVar2.b();
            dVar2.f29244a = null;
            dVar2.f29245b = null;
            dVar2.f29252i = 3;
        } else {
            if (i9 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
        }
        return G.f1419a;
        j jVar4 = jVar3;
        b bVar4 = new b(jVar4, aVar, eVar, bVar2, charset2);
        dVar2.f29244a = jVar4;
        dVar2.f29245b = aVar;
        dVar2.f29246c = null;
        dVar2.f29247d = null;
        dVar2.f29248e = null;
        dVar2.f29249f = null;
        dVar2.f29252i = 2;
        if (interfaceC2260f2.collect(bVar4, dVar2) != objF) {
            jVar2 = jVar4;
            aVar2 = aVar;
            byte[] bArrB2 = aVar2.b();
            dVar2.f29244a = null;
            dVar2.f29245b = null;
            dVar2.f29252i = 3;
        }
        return objF;
    }
}
