package p055g0;

import C6.G;
import C6.r;
import G6.g;
import H6.c;
import I6.d;
import I6.k;
import Q6.o;
import java.util.List;
import java.util.concurrent.CancellationException;
import p011b1.I;
import p011b1.InterfaceC1755c;
import p011b1.z;
import p017b7.AbstractC1823z0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f23294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f23295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23296c;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f23295b = obj;
            this.f23296c |= Integer.MIN_VALUE;
            return x.b(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends k implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f23298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f23299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o f23300e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, o oVar, G6.d dVar) {
            super(2, dVar);
            this.f23299d = gVar;
            this.f23300e = oVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            b bVar = new b(this.f23299d, this.f23300e, dVar);
            bVar.f23298c = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1755c interfaceC1755c, G6.d dVar) {
            return ((b) create(interfaceC1755c, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(4:38|21|(2:24|25)|34) */
        /* JADX WARN: Code duplicated, block: B:24:0x0050  */
        /* JADX WARN: Code duplicated, block: B:32:0x0068  */
        /* JADX WARN: Code duplicated, block: B:35:0x0073  */
        /* JADX WARN: Code duplicated, block: B:36:0x0074  */
        /* JADX WARN: Code duplicated, block: B:38:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        
            if (r8 == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
        
            r1 = r8;
            r8 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        
            if (p055g0.x.b(r1, r7) == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [b1.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [b1.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [Q6.o] */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v8 */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0059 -> B:12:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0070 -> B:12:0x0028). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ?? r8;
            ?? r9;
            ?? r10;
            Object objF = c.f();
            ?? r11 = this.f23297b;
            try {
                if (r11 == 0) {
                    r.b(obj);
                    r8 = (InterfaceC1755c) this.f23298c;
                    if (AbstractC1823z0.q(this.f23299d)) {
                        return G.f1419a;
                    }
                    r9 = this.f23300e;
                    this.f23298c = r8;
                    this.f23297b = 1;
                    if (r9.invoke(r8, this) != objF) {
                        r11 = r8;
                        this.f23298c = r11;
                        this.f23297b = 2;
                        Object objB = x.b(r11, this);
                        r10 = r11;
                    }
                    r10 = r11;
                    return objF;
                }
                if (r11 == 1) {
                    InterfaceC1755c interfaceC1755c = (InterfaceC1755c) this.f23298c;
                    r.b(obj);
                    r11 = interfaceC1755c;
                    this.f23298c = r11;
                    this.f23297b = 2;
                    Object objB2 = x.b(r11, this);
                    r10 = r11;
                } else if (r11 == 2) {
                    InterfaceC1755c interfaceC1755c2 = (InterfaceC1755c) this.f23298c;
                    r.b(obj);
                    r10 = interfaceC1755c2;
                } else {
                    if (r11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC1755c interfaceC1755c3 = (InterfaceC1755c) this.f23298c;
                    r.b(obj);
                    r10 = interfaceC1755c3;
                }
            } catch (CancellationException e8) {
                e = e8;
                if (!AbstractC1823z0.q(this.f23299d)) {
                    throw e;
                }
                this.f23298c = r11;
                this.f23297b = 3;
            }
            r10 = r11;
            r8 = r10;
            if (AbstractC1823z0.q(this.f23299d)) {
                return G.f1419a;
            }
            r9 = this.f23300e;
            this.f23298c = r8;
            this.f23297b = 1;
            if (r9.invoke(r8, this) != objF) {
                r11 = r8;
                this.f23298c = r11;
                this.f23297b = 2;
                Object objB3 = x.b(r11, this);
                r10 = r11;
            }
            r10 = r11;
            return objF;
        }
    }

    public static final boolean a(InterfaceC1755c interfaceC1755c) {
        List listC = interfaceC1755c.E().c();
        int size = listC.size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            if (((z) listC.get(i8)).j()) {
                z8 = true;
                break;
            }
        }
        return !z8;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065 A[LOOP:0: B:20:0x0056->B:24:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x003e A[EDGE_INSN: B:28:0x003e->B:16:0x003e BREAK  A[LOOP:0: B:20:0x0056->B:24:0x0065], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(p011b1.InterfaceC1755c r6, G6.d r7) {
        /*
            boolean r0 = r7 instanceof g0.x.a
            if (r0 == 0) goto L13
            r0 = r7
            g0.x$a r0 = (g0.x.a) r0
            int r1 = r0.f23296c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23296c = r1
            goto L18
        L13:
            g0.x$a r0 = new g0.x$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23295b
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f23296c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f23294a
            b1.c r6 = (p011b1.InterfaceC1755c) r6
            C6.r.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            C6.r.b(r7)
            boolean r7 = a(r6)
            if (r7 != 0) goto L68
        L3e:
            b1.p r7 = p011b1.EnumC1768p.Final
            r0.f23294a = r6
            r0.f23296c = r3
            java.lang.Object r7 = r6.e1(r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            b1.n r7 = (p011b1.C1766n) r7
            java.util.List r7 = r7.c()
            int r2 = r7.size()
            r4 = 0
        L56:
            if (r4 >= r2) goto L68
            java.lang.Object r5 = r7.get(r4)
            b1.z r5 = (p011b1.z) r5
            boolean r5 = r5.j()
            if (r5 == 0) goto L65
            goto L3e
        L65:
            int r4 = r4 + 1
            goto L56
        L68:
            C6.G r6 = C6.G.f1419a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p055g0.x.b(b1.c, G6.d):java.lang.Object");
    }

    public static final Object c(I i8, o oVar, G6.d dVar) {
        Object objA1 = i8.a1(new b(dVar.getContext(), oVar, null), dVar);
        return objA1 == c.f() ? objA1 : G.f1419a;
    }
}
