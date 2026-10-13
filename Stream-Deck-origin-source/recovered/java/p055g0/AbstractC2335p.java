package p055g0;

import C6.G;
import C6.r;
import I6.k;
import Q6.o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.u;
import p011b1.AbstractC1767o;
import p011b1.C1766n;
import p011b1.C1769q;
import p011b1.I;
import p011b1.InterfaceC1755c;
import p011b1.N;
import p011b1.y;
import p011b1.z;
import p065h1.R0;

/* JADX INFO: renamed from: g0.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2335p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f23211a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C f23212b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f23213c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f23214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f23215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f23216f;

    /* JADX INFO: renamed from: g0.p$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements C {
        @Override // p055g0.C
        public long a(long j8, float f8) {
            return Q0.f.s(j8, Q0.f.u(Q0.f.j(j8, b(j8)), f8));
        }

        @Override // p055g0.C
        public float b(long j8) {
            return Q0.f.m(j8);
        }
    }

    /* JADX INFO: renamed from: g0.p$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements C {
        @Override // p055g0.C
        public long a(long j8, float f8) {
            return Q0.g.a(Q0.f.o(j8) - (Math.signum(Q0.f.o(j8)) * f8), Q0.f.p(j8));
        }

        @Override // p055g0.C
        public float b(long j8) {
            return Math.abs(Q0.f.o(j8));
        }
    }

    /* JADX INFO: renamed from: g0.p$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements C {
        @Override // p055g0.C
        public long a(long j8, float f8) {
            return Q0.g.a(Q0.f.o(j8), Q0.f.p(j8) - (Math.signum(Q0.f.p(j8)) * f8));
        }

        @Override // p055g0.C
        public float b(long j8) {
            return Math.abs(Q0.f.p(j8));
        }
    }

    /* JADX INFO: renamed from: g0.p$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f23217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f23218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f23219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23220d;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f23219c = obj;
            this.f23220d |= Integer.MIN_VALUE;
            return AbstractC2335p.b(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: g0.p$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f23221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f23222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f23223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23224d;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f23223c = obj;
            this.f23224d |= Integer.MIN_VALUE;
            return AbstractC2335p.c(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: g0.p$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends k implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f23225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23226c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23227d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f23228e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ J f23229f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ J f23230g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(J j8, J j9, G6.d dVar) {
            super(2, dVar);
            this.f23229f = j8;
            this.f23230g = j9;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            f fVar = new f(this.f23229f, this.f23230g, dVar);
            fVar.f23228e = obj;
            return fVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1755c interfaceC1755c, G6.d dVar) {
            return ((f) create(interfaceC1755c, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005f  */
        /* JADX WARN: Code duplicated, block: B:20:0x006c A[LOOP:2: B:16:0x005d->B:20:0x006c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:69:0x006f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:70:0x0070 A[EDGE_INSN: B:70:0x0070->B:22:0x0070 BREAK  A[LOOP:2: B:16:0x005d->B:20:0x006c], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ac -> B:35:0x00af). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p055g0.AbstractC2335p.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: g0.p$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends k implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f23231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f23232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f23233d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f23234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f23235f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f23236g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f23237h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f23238i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f23239j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f23240k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Q6.k f23241l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ o f23242m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Function0 f23243n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23244o;

        /* JADX INFO: renamed from: g0.p$g$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f23245a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o oVar) {
                super(1);
                this.f23245a = oVar;
            }

            public final void b(z zVar) {
                this.f23245a.invoke(zVar, Q0.f.d(AbstractC1767o.g(zVar)));
                zVar.a();
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((z) obj);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Q6.k kVar, o oVar, Function0 function0, Function0 function1, G6.d dVar) {
            super(2, dVar);
            this.f23241l = kVar;
            this.f23242m = oVar;
            this.f23243n = function0;
            this.f23244o = function1;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            g gVar = new g(this.f23241l, this.f23242m, this.f23243n, this.f23244o, dVar);
            gVar.f23240k = obj;
            return gVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1755c interfaceC1755c, G6.d dVar) {
            return ((g) create(interfaceC1755c, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x011a  */
        /* JADX WARN: Code duplicated, block: B:31:0x0135 A[LOOP:0: B:27:0x0118->B:31:0x0135, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:84:0x013f A[EDGE_INSN: B:84:0x013f->B:33:0x013f BREAK  A[LOOP:0: B:27:0x0118->B:31:0x0135], SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00cf -> B:66:0x01f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0145 -> B:66:0x01f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01c3 -> B:12:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01f0 -> B:66:0x01f3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0256 -> B:23:0x00ee). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 613
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p055g0.AbstractC2335p.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: g0.p$h */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f23246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f23247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f23248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23249d;

        public h(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f23248c = obj;
            this.f23249d |= Integer.MIN_VALUE;
            return AbstractC2335p.e(null, 0L, null, this);
        }
    }

    static {
        float fM = A1.h.m((float) 0.125d);
        f23214d = fM;
        float fM2 = A1.h.m(18);
        f23215e = fM2;
        f23216f = fM / fM2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e A[LOOP:0: B:23:0x0078->B:27:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0092 A[EDGE_INSN: B:54:0x0092->B:29:0x0092 BREAK  A[LOOP:0: B:23:0x0078->B:27:0x008e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(p011b1.InterfaceC1755c r17, long r18, G6.d r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g0.AbstractC2335p.b(b1.c, long, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(InterfaceC1755c interfaceC1755c, long j8, G6.d dVar) {
        e eVar;
        Object obj;
        z zVar;
        J j9;
        z zVar2;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f23224d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f23224d = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj2 = eVar.f23223c;
        Object objF = H6.c.f();
        int i9 = eVar.f23224d;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j9 = (J) eVar.f23222b;
            zVar = (z) eVar.f23221a;
            try {
                r.b(obj2);
                return null;
            } catch (C1769q unused) {
                zVar2 = (z) j9.f28779a;
                if (zVar2 == null) {
                    return zVar;
                }
                return zVar2;
            }
        }
        r.b(obj2);
        if (g(interfaceC1755c.E(), j8)) {
            return null;
        }
        List listC = interfaceC1755c.E().c();
        int size = listC.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = listC.get(i10);
            if (y.d(((z) obj).g(), j8)) {
                break;
            }
            i10++;
        }
        zVar = (z) obj;
        if (zVar == null) {
            return null;
        }
        J j10 = new J();
        J j11 = new J();
        j11.f28779a = zVar;
        long jC = interfaceC1755c.getViewConfiguration().c();
        try {
            o fVar = new f(j11, j10, null);
            eVar.f23221a = zVar;
            eVar.f23222b = j10;
            eVar.f23224d = 1;
            if (interfaceC1755c.l0(jC, fVar, eVar) == objF) {
                return objF;
            }
            return null;
        } catch (C1769q unused2) {
            j9 = j10;
            zVar2 = (z) j9.f28779a;
            if (zVar2 == null) {
                return zVar;
            }
            return zVar2;
        }
    }

    public static final Object d(I i8, Q6.k kVar, Function0 function0, Function0 function1, o oVar, G6.d dVar) {
        Object objC = x.c(i8, new g(kVar, oVar, function1, function0, null), dVar);
        return objC == H6.c.f() ? objC : G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(p011b1.InterfaceC1755c r4, long r5, Q6.k r7, G6.d r8) {
        /*
            boolean r0 = r8 instanceof p055g0.AbstractC2335p.h
            if (r0 == 0) goto L13
            r0 = r8
            g0.p$h r0 = (p055g0.AbstractC2335p.h) r0
            int r1 = r0.f23249d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23249d = r1
            goto L18
        L13:
            g0.p$h r0 = new g0.p$h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23248c
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f23249d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f23247b
            Q6.k r4 = (Q6.k) r4
            java.lang.Object r5 = r0.f23246a
            b1.c r5 = (p011b1.InterfaceC1755c) r5
            C6.r.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            C6.r.b(r8)
        L3e:
            r0.f23246a = r4
            r0.f23247b = r7
            r0.f23249d = r3
            java.lang.Object r8 = b(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            b1.z r8 = (p011b1.z) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = I6.b.a(r4)
            return r4
        L55:
            boolean r5 = p011b1.AbstractC1767o.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = I6.b.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.g()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g0.AbstractC2335p.e(b1.c, long, Q6.k, G6.d):java.lang.Object");
    }

    public static final C f() {
        return f23213c;
    }

    public static final boolean g(C1766n c1766n, long j8) {
        Object obj;
        List listC = c1766n.c();
        int size = listC.size();
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = listC.get(i8);
            if (y.d(((z) obj).g(), j8)) {
                break;
            }
            i8++;
        }
        z zVar = (z) obj;
        if (zVar != null && zVar.j()) {
            z8 = true;
        }
        return true ^ z8;
    }

    public static final float h(R0 r8, int i8) {
        return N.g(i8, N.f15698a.b()) ? r8.f() * f23216f : r8.f();
    }

    public static final C i(B b8) {
        return b8 == B.Vertical ? f23212b : f23211a;
    }
}
