package s7;

import C6.AbstractC0913b;
import C6.AbstractC0914c;
import C6.C0912a;
import C6.C0920i;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2894a f33208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f33209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33211d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.k implements Q6.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f33212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f33213c;

        public a(G6.d dVar) {
            super(3, dVar);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC0914c abstractC0914c, C6.G g8, G6.d dVar) {
            a aVar = T.this.new a(dVar);
            aVar.f33213c = abstractC0914c;
            return aVar.invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f33212b;
            if (i8 == 0) {
                C6.r.b(obj);
                AbstractC0914c abstractC0914c = (AbstractC0914c) this.f33213c;
                byte bH = T.this.f33208a.H();
                if (bH == 1) {
                    return T.this.j(true);
                }
                if (bH == 0) {
                    return T.this.j(false);
                }
                if (bH != 6) {
                    if (bH == 8) {
                        return T.this.f();
                    }
                    AbstractC2894a.x(T.this.f33208a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new C0920i();
                }
                T t8 = T.this;
                this.f33212b = 1;
                obj = t8.h(abstractC0914c, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return (r7.j) obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f33215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f33216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f33217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f33218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f33219e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f33221g;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f33219e = obj;
            this.f33221g |= Integer.MIN_VALUE;
            return T.this.h(null, this);
        }
    }

    public T(r7.h configuration, AbstractC2894a lexer) {
        kotlin.jvm.internal.t.g(configuration, "configuration");
        kotlin.jvm.internal.t.g(lexer, "lexer");
        this.f33208a = lexer;
        this.f33209b = configuration.p();
        this.f33210c = configuration.c();
    }

    public final r7.j e() {
        byte bH = this.f33208a.H();
        if (bH == 1) {
            return j(true);
        }
        if (bH == 0) {
            return j(false);
        }
        if (bH == 6) {
            int i8 = this.f33211d + 1;
            this.f33211d = i8;
            r7.j jVarG = i8 == 200 ? g() : i();
            this.f33211d--;
            return jVarG;
        }
        if (bH == 8) {
            return f();
        }
        AbstractC2894a.x(this.f33208a, "Cannot read Json element because of unexpected " + AbstractC2895b.c(bH), 0, null, 6, null);
        throw new C0920i();
    }

    public final r7.j f() {
        byte bJ = this.f33208a.j();
        if (this.f33208a.H() == 4) {
            AbstractC2894a.x(this.f33208a, "Unexpected leading comma", 0, null, 6, null);
            throw new C0920i();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f33208a.e()) {
            arrayList.add(e());
            bJ = this.f33208a.j();
            if (bJ != 4) {
                AbstractC2894a abstractC2894a = this.f33208a;
                boolean z8 = bJ == 9;
                int i8 = abstractC2894a.f33249a;
                if (!z8) {
                    AbstractC2894a.x(abstractC2894a, "Expected end of the array or comma", i8, null, 4, null);
                    throw new C0920i();
                }
            }
        }
        if (bJ == 8) {
            this.f33208a.k((byte) 9);
        } else if (bJ == 4) {
            if (!this.f33210c) {
                C.h(this.f33208a, "array");
                throw new C0920i();
            }
            this.f33208a.k((byte) 9);
        }
        return new r7.d(arrayList);
    }

    public final r7.j g() {
        return (r7.j) AbstractC0913b.b(new C0912a(new a(null)), C6.G.f1419a);
    }

    public final r7.j i() {
        byte bK = this.f33208a.k((byte) 6);
        if (this.f33208a.H() == 4) {
            AbstractC2894a.x(this.f33208a, "Unexpected leading comma", 0, null, 6, null);
            throw new C0920i();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (this.f33208a.e()) {
            String strQ = this.f33209b ? this.f33208a.q() : this.f33208a.o();
            this.f33208a.k((byte) 5);
            linkedHashMap.put(strQ, e());
            bK = this.f33208a.j();
            if (bK != 4) {
                if (bK == 7) {
                    break;
                }
                AbstractC2894a.x(this.f33208a, "Expected end of the object or comma", 0, null, 6, null);
                throw new C0920i();
            }
        }
        if (bK == 6) {
            this.f33208a.k((byte) 7);
        } else if (bK == 4) {
            if (!this.f33210c) {
                C.i(this.f33208a, null, 1, null);
                throw new C0920i();
            }
            this.f33208a.k((byte) 7);
        }
        return new r7.w(linkedHashMap);
    }

    public final r7.y j(boolean z8) {
        String strQ = (this.f33209b || !z8) ? this.f33208a.q() : this.f33208a.o();
        return (z8 || !kotlin.jvm.internal.t.c(strQ, "null")) ? new r7.q(strQ, z8, null, 4, null) : r7.u.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:25:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0097 -> B:27:0x00a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(C6.AbstractC0914c r20, G6.d r21) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.T.h(C6.c, G6.d):java.lang.Object");
    }
}
