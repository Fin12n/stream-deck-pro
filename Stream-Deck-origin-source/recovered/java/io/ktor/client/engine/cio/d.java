package io.ktor.client.engine.cio;

import C6.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p034d6.i f24833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p098k7.d f24835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p133o6.b f24836d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f24838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f24839c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f24840d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f24841e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f24843g;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f24841e = obj;
            this.f24843g |= Integer.MIN_VALUE;
            return d.this.b(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p098k7.d invoke() {
            return p098k7.f.b(d.this.f24834b, 0, 2, null);
        }
    }

    public d(p034d6.i selector, int i8, int i9) {
        t.g(selector, "selector");
        this.f24833a = selector;
        this.f24834b = i9;
        this.f24835c = p098k7.f.b(i8, 0, 2, null);
        this.f24836d = new p133o6.b(0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c4, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v5, types: [o6.b] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [Q6.k] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [e6.o] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [io.ktor.client.engine.cio.d] */
    /* JADX WARN: Type inference failed for: r4v2, types: [io.ktor.client.engine.cio.d] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9, types: [e6.u] */
    /* JADX WARN: Type inference failed for: r8v0, types: [e6.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [k7.d] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Q6.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [io.ktor.client.engine.cio.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(p043e6.j jVar, Q6.k kVar, G6.d dVar) throws Throwable {
        a aVar;
        ?? r8;
        d dVar2;
        ?? r9;
        ?? r10;
        ?? r11;
        p098k7.d dVar3;
        ?? r12;
        ?? r13;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f24843g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f24843g = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objE = aVar.f24841e;
        Object objF = H6.c.f();
        int i9 = aVar.f24843g;
        try {
            try {
                if (i9 == 0) {
                    r.b(objE);
                    p098k7.d dVar4 = this.f24835c;
                    aVar.f24837a = this;
                    aVar.f24838b = jVar;
                    aVar.f24839c = kVar;
                    aVar.f24843g = 1;
                    if (dVar4.d(aVar) != objF) {
                        dVar2 = this;
                        r10 = jVar;
                        r9 = kVar;
                    }
                    return objF;
                }
                if (i9 != 1) {
                    if (i9 == 2) {
                        p098k7.d dVar5 = (p098k7.d) aVar.f24840d;
                        Q6.k kVar2 = (Q6.k) aVar.f24839c;
                        p043e6.j jVar2 = (p043e6.j) aVar.f24838b;
                        r8 = (d) aVar.f24837a;
                        try {
                            r.b(objE);
                            r12 = kVar2;
                            r13 = r8;
                            r11 = jVar2;
                            dVar3 = dVar5;
                            ?? E8 = ((p043e6.p) p043e6.d.b(p043e6.d.a(r13.f24833a))).e();
                            aVar.f24837a = r13;
                            aVar.f24838b = dVar3;
                            aVar.f24839c = null;
                            aVar.f24840d = null;
                            aVar.f24843g = 3;
                            objE = E8.e(r11, r12, aVar);
                            jVar = dVar3;
                            kVar = r13;
                        } catch (Throwable th) {
                            th = th;
                            r8.f24835c.a();
                            throw th;
                        }
                    } else {
                        if (i9 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p098k7.d dVar6 = (p098k7.d) aVar.f24838b;
                        d dVar7 = (d) aVar.f24837a;
                        r.b(objE);
                        jVar = dVar6;
                        kVar = dVar7;
                    }
                    return (p043e6.n) objE;
                }
                Q6.k kVar3 = (Q6.k) aVar.f24839c;
                p043e6.j jVar3 = (p043e6.j) aVar.f24838b;
                dVar2 = (d) aVar.f24837a;
                r.b(objE);
                r10 = jVar3;
                r9 = kVar3;
                p098k7.d dVar8 = (p098k7.d) dVar2.f24836d.b(r10, dVar2.new b());
                aVar.f24837a = dVar2;
                aVar.f24838b = r10;
                aVar.f24839c = r9;
                aVar.f24840d = dVar8;
                aVar.f24843g = 2;
                if (dVar8.d(aVar) != objF) {
                    d dVar9 = dVar2;
                    r11 = r10;
                    dVar3 = dVar8;
                    r12 = r9;
                    r13 = dVar9;
                    ?? E9 = ((p043e6.p) p043e6.d.b(p043e6.d.a(r13.f24833a))).e();
                    aVar.f24837a = r13;
                    aVar.f24838b = dVar3;
                    aVar.f24839c = null;
                    aVar.f24840d = null;
                    aVar.f24843g = 3;
                    objE = E9.e(r11, r12, aVar);
                    jVar = dVar3;
                    kVar = r13;
                }
                return objF;
            } catch (Throwable th2) {
                th = th2;
                r8 = dVar2;
                r8.f24835c.a();
                throw th;
            }
        } catch (Throwable th3) {
            try {
                jVar.a();
                throw th3;
            } catch (Throwable th4) {
                th = th4;
                r8 = kVar;
                r8.f24835c.a();
                throw th;
            }
        }
    }

    public final void c(p043e6.j address) {
        t.g(address, "address");
        Object obj = this.f24836d.get(address);
        t.d(obj);
        ((p098k7.d) obj).a();
        this.f24835c.a();
    }
}
