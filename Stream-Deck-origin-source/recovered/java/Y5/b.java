package Y5;

import C6.G;
import I6.l;
import Q6.o;
import Z6.r;
import Z6.v;
import io.ktor.utils.io.InterfaceC2442c;
import io.ktor.utils.io.q;
import io.ktor.utils.io.x;
import io.ktor.utils.io.z;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.t;
import p017b7.C1802o0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p221z6.g f12442a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f12443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f12444c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends p221z6.d {
        public a() {
            super(2048);
        }

        @Override // p221z6.d
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public StringBuilder c(StringBuilder instance) {
            t.g(instance, "instance");
            r.i(instance);
            return instance;
        }

        @Override // p221z6.d
        /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
        public StringBuilder t() {
            return new StringBuilder(128);
        }
    }

    /* JADX INFO: renamed from: Y5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0316b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f12448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f12449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f12450f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12451g;

        public C0316b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12450f = obj;
            this.f12451g |= Integer.MIN_VALUE;
            return b.b(null, null, 0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f12453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.j f12454c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.ktor.utils.io.j jVar, G6.d dVar) {
            super(2, dVar);
            this.f12454c = jVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            c cVar = new c(this.f12454c, dVar);
            cVar.f12453b = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(z zVar, G6.d dVar) {
            return ((c) create(zVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f12452a;
            if (i8 == 0) {
                C6.r.b(obj);
                z zVar = (z) this.f12453b;
                io.ktor.utils.io.j jVar = this.f12454c;
                io.ktor.utils.io.g gVarMo220e = zVar.mo220e();
                this.f12452a = 1;
                if (b.e(jVar, gVarMo220e, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f12458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12459e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f12460f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12461g;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12460f = obj;
            this.f12461g |= Integer.MIN_VALUE;
            return b.e(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f12467f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12468g;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12467f = obj;
            this.f12468g |= Integer.MIN_VALUE;
            return b.g(null, null, 0, 0, this);
        }
    }

    static {
        byte[] bArrG;
        byte[] bArrG2;
        Charset charset = Z6.c.f12941b;
        if (t.c(charset, charset)) {
            bArrG = v.s("\r\n");
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            t.f(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrG = p197w6.a.g(charsetEncoderNewEncoder, "\r\n", 0, 2);
        }
        f12443b = bArrG;
        if (t.c(charset, charset)) {
            bArrG2 = v.s("0\r\n\r\n");
        } else {
            CharsetEncoder charsetEncoderNewEncoder2 = charset.newEncoder();
            t.f(charsetEncoderNewEncoder2, "charset.newEncoder()");
            bArrG2 = p197w6.a.g(charsetEncoderNewEncoder2, "0\r\n\r\n", 0, 5);
        }
        f12444c = bArrG2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:50:0x00f0, B:52:0x00f8, B:31:0x009c, B:33:0x00a4, B:35:0x00aa, B:37:0x00b0, B:43:0x00c3, B:46:0x00d6, B:47:0x00da, B:40:0x00bb, B:63:0x0135, B:64:0x013c, B:65:0x013d, B:66:0x0144, B:59:0x0111, B:60:0x0118, B:61:0x0119, B:62:0x0134, B:21:0x005d, B:24:0x0071), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:50:0x00f0, B:52:0x00f8, B:31:0x009c, B:33:0x00a4, B:35:0x00aa, B:37:0x00b0, B:43:0x00c3, B:46:0x00d6, B:47:0x00da, B:40:0x00bb, B:63:0x0135, B:64:0x013c, B:65:0x013d, B:66:0x0144, B:59:0x0111, B:60:0x0118, B:61:0x0119, B:62:0x0134, B:21:0x005d, B:24:0x0071), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:50:0x00f0, B:52:0x00f8, B:31:0x009c, B:33:0x00a4, B:35:0x00aa, B:37:0x00b0, B:43:0x00c3, B:46:0x00d6, B:47:0x00da, B:40:0x00bb, B:63:0x0135, B:64:0x013c, B:65:0x013d, B:66:0x0144, B:59:0x0111, B:60:0x0118, B:61:0x0119, B:62:0x0134, B:21:0x005d, B:24:0x0071), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:50:0x00f0, B:52:0x00f8, B:31:0x009c, B:33:0x00a4, B:35:0x00aa, B:37:0x00b0, B:43:0x00c3, B:46:0x00d6, B:47:0x00da, B:40:0x00bb, B:63:0x0135, B:64:0x013c, B:65:0x013d, B:66:0x0144, B:59:0x0111, B:60:0x0118, B:61:0x0119, B:62:0x0134, B:21:0x005d, B:24:0x0071), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:50:0x00f0, B:52:0x00f8, B:31:0x009c, B:33:0x00a4, B:35:0x00aa, B:37:0x00b0, B:43:0x00c3, B:46:0x00d6, B:47:0x00da, B:40:0x00bb, B:63:0x0135, B:64:0x013c, B:65:0x013d, B:66:0x0144, B:59:0x0111, B:60:0x0118, B:61:0x0119, B:62:0x0134, B:21:0x005d, B:24:0x0071), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6 A[Catch: all -> 0x0042, PHI: r0 r6 r8 r9 r10
      0x00d6: PHI (r0v4 ??) = (r0v19 ??), (r0v20 ??) binds: [B:44:0x00d3, B:21:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r6v2 long) = (r6v4 long), (r6v11 long) binds: [B:44:0x00d3, B:21:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r8v2 io.ktor.utils.io.j) = (r8v3 io.ktor.utils.io.j), (r8v10 io.ktor.utils.io.j) binds: [B:44:0x00d3, B:21:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r9v1 ??) = (r9v12 ??), (r9v13 ??) binds: [B:44:0x00d3, B:21:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r10v5 long) = (r10v12 long), (r10v27 long) binds: [B:44:0x00d3, B:21:0x005d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:50:0x00f0, B:52:0x00f8, B:31:0x009c, B:33:0x00a4, B:35:0x00aa, B:37:0x00b0, B:43:0x00c3, B:46:0x00d6, B:47:0x00da, B:40:0x00bb, B:63:0x0135, B:64:0x013c, B:65:0x013d, B:66:0x0144, B:59:0x0111, B:60:0x0118, B:61:0x0119, B:62:0x0134, B:21:0x005d, B:24:0x0071), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00da A[Catch: all -> 0x0042, PHI: r0 r6 r8 r9 r10
      0x00da: PHI (r0v3 ??) = (r0v21 ??), (r0v22 ??) binds: [B:46:0x00d6, B:42:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r6v1 long) = (r6v3 long), (r6v4 long) binds: [B:46:0x00d6, B:42:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r8v1 io.ktor.utils.io.j) = (r8v2 io.ktor.utils.io.j), (r8v3 io.ktor.utils.io.j) binds: [B:46:0x00d6, B:42:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r9v0 ??) = (r9v14 ??), (r9v15 ??) binds: [B:46:0x00d6, B:42:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r10v4 long) = (r10v5 long), (r10v12 long) binds: [B:46:0x00d6, B:42:0x00c1] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:50:0x00f0, B:52:0x00f8, B:31:0x009c, B:33:0x00a4, B:35:0x00aa, B:37:0x00b0, B:43:0x00c3, B:46:0x00d6, B:47:0x00da, B:40:0x00bb, B:63:0x0135, B:64:0x013c, B:65:0x013d, B:66:0x0144, B:59:0x0111, B:60:0x0118, B:61:0x0119, B:62:0x0134, B:21:0x005d, B:24:0x0071), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0135 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:50:0x00f0, B:52:0x00f8, B:31:0x009c, B:33:0x00a4, B:35:0x00aa, B:37:0x00b0, B:43:0x00c3, B:46:0x00d6, B:47:0x00da, B:40:0x00bb, B:63:0x0135, B:64:0x013c, B:65:0x013d, B:66:0x0144, B:59:0x0111, B:60:0x0118, B:61:0x0119, B:62:0x0134, B:21:0x005d, B:24:0x0071), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013d A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:50:0x00f0, B:52:0x00f8, B:31:0x009c, B:33:0x00a4, B:35:0x00aa, B:37:0x00b0, B:43:0x00c3, B:46:0x00d6, B:47:0x00da, B:40:0x00bb, B:63:0x0135, B:64:0x013c, B:65:0x013d, B:66:0x0144, B:59:0x0111, B:60:0x0118, B:61:0x0119, B:62:0x0134, B:21:0x005d, B:24:0x0071), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ed, code lost:
    
        if (r13 == r14) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Appendable, java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence, java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Appendable, java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v16, types: [io.ktor.utils.io.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24, types: [z6.g] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r11v1, types: [z6.g] */
    /* JADX WARN: Type inference failed for: r9v0, types: [io.ktor.utils.io.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [io.ktor.utils.io.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00ed -> B:50:0x00f0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(io.ktor.utils.io.g gVar, io.ktor.utils.io.j jVar, long j8, G6.d dVar) {
        C0316b c0316b;
        long j9;
        long jF;
        ?? r9;
        io.ktor.utils.io.j jVar2;
        ?? r8;
        ?? r10;
        ?? r11;
        ?? r12;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r16;
        if (dVar instanceof C0316b) {
            c0316b = (C0316b) dVar;
            int i8 = c0316b.f12451g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0316b.f12451g = i8 - Integer.MIN_VALUE;
            } else {
                c0316b = new C0316b(dVar);
            }
        } else {
            c0316b = new C0316b(dVar);
        }
        Object objR = c0316b.f12450f;
        Object objF = H6.c.f();
        ?? r17 = c0316b.f12451g;
        try {
            if (r17 == 0) {
                C6.r.b(objR);
                r17 = (StringBuilder) f12442a.b0();
                j9 = 0;
                r14 = gVar;
                try {
                    r.i(r17);
                    c0316b.f12445a = r14;
                    c0316b.f12446b = jVar;
                    c0316b.f12447c = r17;
                    c0316b.f12448d = j9;
                    c0316b.f12451g = 1;
                    objR = r14.r(r17, 128, c0316b);
                    if (objR != objF) {
                        r12 = r14;
                        jVar2 = jVar;
                        r13 = r17;
                        if (!((Boolean) objR).booleanValue()) {
                            throw new EOFException("Chunked stream has ended unexpectedly: no chunk size");
                        }
                        if (r13.length() == 0) {
                            throw new EOFException("Invalid chunk size: empty");
                        }
                        if (r13.length() == 1) {
                            jF = Z5.e.f(r13);
                        } else {
                            jF = Z5.e.f(r13);
                        }
                        r8 = r13;
                        r9 = r12;
                        if (jF > 0) {
                            c0316b.f12445a = r12;
                            c0316b.f12446b = jVar2;
                            c0316b.f12447c = r13;
                            c0316b.f12448d = j9;
                            c0316b.f12449e = jF;
                            c0316b.f12451g = 2;
                            if (io.ktor.utils.io.h.b(r12, jVar2, jF, c0316b) == objF) {
                                r11 = r13;
                                r10 = r12;
                            } else {
                                r11 = r13;
                                r10 = r12;
                                jVar2.flush();
                                j9 += jF;
                                r8 = r11;
                                r9 = r10;
                                r.i(r8);
                                c0316b.f12445a = r9;
                                c0316b.f12446b = jVar2;
                                c0316b.f12447c = r8;
                                c0316b.f12448d = j9;
                                c0316b.f12449e = jF;
                                c0316b.f12451g = 3;
                                objR = r9.r(r8, 2, c0316b);
                                r16 = r8;
                                r15 = r9;
                            }
                        } else {
                            r.i(r8);
                            c0316b.f12445a = r9;
                            c0316b.f12446b = jVar2;
                            c0316b.f12447c = r8;
                            c0316b.f12448d = j9;
                            c0316b.f12449e = jF;
                            c0316b.f12451g = 3;
                            objR = r9.r(r8, 2, c0316b);
                            r16 = r8;
                            r15 = r9;
                        }
                    }
                    return objF;
                } catch (Throwable th) {
                    th = th;
                    io.ktor.utils.io.j jVar3 = jVar;
                    try {
                        jVar3.d(th);
                        throw th;
                    } catch (Throwable th2) {
                        f12442a.H1(r17);
                        io.ktor.utils.io.k.a(jVar3);
                        throw th2;
                    }
                }
            }
            if (r17 == 1) {
                long j10 = c0316b.f12448d;
                StringBuilder sb = (StringBuilder) c0316b.f12447c;
                jVar2 = (io.ktor.utils.io.j) c0316b.f12446b;
                io.ktor.utils.io.g gVar2 = (io.ktor.utils.io.g) c0316b.f12445a;
                C6.r.b(objR);
                r12 = gVar2;
                j9 = j10;
                r13 = sb;
                if (!((Boolean) objR).booleanValue()) {
                    throw new EOFException("Chunked stream has ended unexpectedly: no chunk size");
                }
                if (r13.length() == 0) {
                    throw new EOFException("Invalid chunk size: empty");
                }
                if (r13.length() == 1 || r13.charAt(0) != '0') {
                    jF = Z5.e.f(r13);
                } else {
                    jF = 0;
                }
                r8 = r13;
                r9 = r12;
                if (jF > 0) {
                    c0316b.f12445a = r12;
                    c0316b.f12446b = jVar2;
                    c0316b.f12447c = r13;
                    c0316b.f12448d = j9;
                    c0316b.f12449e = jF;
                    c0316b.f12451g = 2;
                    if (io.ktor.utils.io.h.b(r12, jVar2, jF, c0316b) == objF) {
                        r11 = r13;
                        r10 = r12;
                    } else {
                        r11 = r13;
                        r10 = r12;
                        jVar2.flush();
                        j9 += jF;
                        r8 = r11;
                        r9 = r10;
                        r.i(r8);
                        c0316b.f12445a = r9;
                        c0316b.f12446b = jVar2;
                        c0316b.f12447c = r8;
                        c0316b.f12448d = j9;
                        c0316b.f12449e = jF;
                        c0316b.f12451g = 3;
                        objR = r9.r(r8, 2, c0316b);
                        r16 = r8;
                        r15 = r9;
                    }
                } else {
                    r.i(r8);
                    c0316b.f12445a = r9;
                    c0316b.f12446b = jVar2;
                    c0316b.f12447c = r8;
                    c0316b.f12448d = j9;
                    c0316b.f12449e = jF;
                    c0316b.f12451g = 3;
                    objR = r9.r(r8, 2, c0316b);
                    r16 = r8;
                    r15 = r9;
                }
                return objF;
            }
            if (r17 == 2) {
                jF = c0316b.f12449e;
                j9 = c0316b.f12448d;
                StringBuilder sb2 = (StringBuilder) c0316b.f12447c;
                jVar2 = (io.ktor.utils.io.j) c0316b.f12446b;
                io.ktor.utils.io.g gVar3 = (io.ktor.utils.io.g) c0316b.f12445a;
                C6.r.b(objR);
                r11 = sb2;
                r10 = gVar3;
                r11 = r13;
                r10 = r12;
                jVar2.flush();
                j9 += jF;
                r8 = r11;
                r9 = r10;
                r.i(r8);
                c0316b.f12445a = r9;
                c0316b.f12446b = jVar2;
                c0316b.f12447c = r8;
                c0316b.f12448d = j9;
                c0316b.f12449e = jF;
                c0316b.f12451g = 3;
                objR = r9.r(r8, 2, c0316b);
                r16 = r8;
                r15 = r9;
            } else {
                if (r17 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jF = c0316b.f12449e;
                j9 = c0316b.f12448d;
                StringBuilder sb3 = (StringBuilder) c0316b.f12447c;
                jVar2 = (io.ktor.utils.io.j) c0316b.f12446b;
                io.ktor.utils.io.g gVar4 = (io.ktor.utils.io.g) c0316b.f12445a;
                C6.r.b(objR);
                r16 = sb3;
                r15 = gVar4;
            }
            if (!((Boolean) objR).booleanValue()) {
                throw new EOFException("Invalid chunk: content block of size " + jF + " ended unexpectedly");
            }
            if (r16.length() > 0) {
                throw new EOFException("Invalid chunk: content block should end with CR+LF");
            }
            if (jF == 0) {
                f12442a.H1(r16);
                io.ktor.utils.io.k.a(jVar2);
                return G.f1419a;
            }
            jVar = jVar2;
            r14 = r15;
            r17 = r16;
            r.i(r17);
            c0316b.f12445a = r14;
            c0316b.f12446b = jVar;
            c0316b.f12447c = r17;
            c0316b.f12448d = j9;
            c0316b.f12451g = 1;
            objR = r14.r(r17, 128, c0316b);
            if (objR != objF) {
                r12 = r14;
                jVar2 = jVar;
                r13 = r17;
                if (!((Boolean) objR).booleanValue()) {
                    throw new EOFException("Chunked stream has ended unexpectedly: no chunk size");
                }
                if (r13.length() == 0) {
                    throw new EOFException("Invalid chunk size: empty");
                }
                if (r13.length() == 1) {
                    jF = Z5.e.f(r13);
                } else {
                    jF = Z5.e.f(r13);
                }
                r8 = r13;
                r9 = r12;
                if (jF > 0) {
                    c0316b.f12445a = r12;
                    c0316b.f12446b = jVar2;
                    c0316b.f12447c = r13;
                    c0316b.f12448d = j9;
                    c0316b.f12449e = jF;
                    c0316b.f12451g = 2;
                    if (io.ktor.utils.io.h.b(r12, jVar2, jF, c0316b) == objF) {
                        r11 = r13;
                        r10 = r12;
                    } else {
                        r11 = r13;
                        r10 = r12;
                        jVar2.flush();
                        j9 += jF;
                        r8 = r11;
                        r9 = r10;
                        r.i(r8);
                        c0316b.f12445a = r9;
                        c0316b.f12446b = jVar2;
                        c0316b.f12447c = r8;
                        c0316b.f12448d = j9;
                        c0316b.f12449e = jF;
                        c0316b.f12451g = 3;
                        objR = r9.r(r8, 2, c0316b);
                        r16 = r8;
                        r15 = r9;
                    }
                } else {
                    r.i(r8);
                    c0316b.f12445a = r9;
                    c0316b.f12446b = jVar2;
                    c0316b.f12447c = r8;
                    c0316b.f12448d = j9;
                    c0316b.f12449e = jF;
                    c0316b.f12451g = 3;
                    objR = r9.r(r8, 2, c0316b);
                    r16 = r8;
                    r15 = r9;
                }
            }
            return objF;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final Object c(io.ktor.utils.io.g gVar, io.ktor.utils.io.j jVar, G6.d dVar) {
        Object objB = b(gVar, jVar, -1L, dVar);
        return objB == H6.c.f() ? objB : G.f1419a;
    }

    public static final Object d(io.ktor.utils.io.j jVar, G6.g gVar, G6.d dVar) {
        return q.c(C1802o0.f15975a, gVar, false, new c(jVar, null));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ba A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #7 {all -> 0x005d, blocks: (B:23:0x0058, B:71:0x0158, B:41:0x00b4, B:43:0x00ba, B:74:0x015d), top: B:95:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4 A[Catch: all -> 0x00dc, TRY_LEAVE, TryCatch #6 {all -> 0x00dc, blocks: (B:47:0x00d0, B:49:0x00d4), top: B:97:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb A[Catch: all -> 0x0137, TRY_LEAVE, TryCatch #3 {all -> 0x0137, blocks: (B:53:0x00e0, B:56:0x00fb), top: B:91:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:74:0x015d A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #7 {all -> 0x005d, blocks: (B:23:0x0058, B:71:0x0158, B:41:0x00b4, B:43:0x00ba, B:74:0x015d), top: B:95:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0130, code lost:
    
        if (r0 == r2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0171, code lost:
    
        if (io.ktor.utils.io.k.b(r1, r4, r0) == r2) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [G6.d, Y5.b$d] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [G6.d, Y5.b$d] */
    /* JADX WARN: Type inference failed for: r1v13, types: [io.ktor.utils.io.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [io.ktor.utils.io.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [Y5.b$d] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26, types: [io.ktor.utils.io.j] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v4, types: [G6.d, Y5.b$d] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [io.ktor.utils.io.j] */
    /* JADX WARN: Type inference failed for: r1v9, types: [io.ktor.utils.io.j] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [io.ktor.utils.io.g] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.ktor.utils.io.g] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [x6.a] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, x6.a] */
    /* JADX WARN: Type inference failed for: r3v7, types: [G6.d, Y5.b$d] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0130 -> B:29:0x0074). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(io.ktor.utils.io.j jVar, io.ktor.utils.io.g gVar, G6.d dVar) throws Throwable {
        ?? dVar2;
        ?? r8;
        ?? r13;
        io.ktor.utils.io.g gVar2;
        io.ktor.utils.io.g gVar3;
        ?? r9;
        io.ktor.utils.io.g gVar4;
        ?? r10;
        ?? r11;
        ?? r14;
        p205x6.a aVar;
        ?? r12;
        int iIntValue;
        io.ktor.utils.io.g gVar5;
        io.ktor.utils.io.g gVar6;
        ?? r15;
        p205x6.a aVarA;
        p205x6.a aVar2;
        ByteBuffer byteBufferH;
        long jI;
        long jK;
        Object objE;
        ?? r16;
        ?? r17;
        if (dVar instanceof d) {
            d dVar3 = (d) dVar;
            int i8 = dVar3.f12461g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar3.f12461g = i8 - Integer.MIN_VALUE;
                dVar2 = dVar3;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objG = dVar2.f12460f;
        Object objF = H6.c.f();
        ?? r18 = dVar2.f12461g;
        int i9 = 1;
        try {
            try {
                if (r18 == 0) {
                    C6.r.b(objG);
                    gVar4 = gVar;
                    r10 = dVar2;
                    r11 = jVar;
                    if (gVar4.J()) {
                        f(gVar4);
                        byte[] bArr = f12444c;
                        r10.f12455a = r11;
                        r10.f12456b = gVar4;
                        r10.f12457c = null;
                        r10.f12458d = null;
                        r10.f12461g = 5;
                    } else {
                        r10.f12455a = r11;
                        r10.f12456b = gVar4;
                        r10.f12457c = gVar4;
                        r10.f12458d = null;
                        r10.f12461g = i9;
                        objE = x.e(gVar4, i9, r10);
                        if (objE != objF) {
                            gVar5 = gVar4;
                            r15 = r10;
                            objG = objE;
                            gVar6 = gVar5;
                            dVar2 = r11;
                            aVarA = (p205x6.a) objG;
                            if (aVarA == null) {
                                aVarA = p205x6.a.f37418g.a();
                            }
                            aVar2 = aVarA;
                            byteBufferH = aVar2.h();
                            jI = aVar2.i();
                            jK = aVar2.k();
                            if (jK == jI) {
                                r13 = dVar2;
                                dVar2 = r15;
                                r18 = aVar2;
                                io.ktor.utils.io.g gVar7 = gVar5;
                                gVar2 = gVar6;
                                gVar3 = gVar7;
                                iIntValue = 0;
                                dVar2.f12455a = r13;
                                dVar2.f12456b = gVar2;
                                dVar2.f12457c = gVar3;
                                dVar2.f12458d = r18;
                                dVar2.f12459e = iIntValue;
                                dVar2.f12461g = 3;
                                Object objC = x.c(gVar3, r18, iIntValue, dVar2);
                                r17 = dVar2;
                                r16 = r13;
                            } else {
                                r15.f12455a = dVar2;
                                r15.f12456b = gVar6;
                                r15.f12457c = gVar5;
                                r15.f12458d = aVar2;
                                r15.f12461g = 2;
                                objG = g(dVar2, byteBufferH, (int) jI, (int) jK, r15);
                                if (objG != objF) {
                                    r14 = dVar2;
                                    r12 = r15;
                                    aVar = aVar2;
                                    io.ktor.utils.io.g gVar8 = gVar5;
                                    gVar2 = gVar6;
                                    gVar3 = gVar8;
                                    iIntValue = ((Number) objG).intValue();
                                    dVar2 = r12;
                                    r18 = aVar;
                                    r13 = r14;
                                    dVar2.f12455a = r13;
                                    dVar2.f12456b = gVar2;
                                    dVar2.f12457c = gVar3;
                                    dVar2.f12458d = r18;
                                    dVar2.f12459e = iIntValue;
                                    dVar2.f12461g = 3;
                                    Object objC2 = x.c(gVar3, r18, iIntValue, dVar2);
                                    r17 = dVar2;
                                    r16 = r13;
                                }
                            }
                        }
                    }
                    r9 = r11;
                    return objF;
                }
                if (r18 == 1) {
                    io.ktor.utils.io.g gVar9 = (io.ktor.utils.io.g) dVar2.f12457c;
                    gVar6 = (io.ktor.utils.io.g) dVar2.f12456b;
                    io.ktor.utils.io.j jVar2 = (io.ktor.utils.io.j) dVar2.f12455a;
                    try {
                        C6.r.b(objG);
                        r15 = dVar2;
                        dVar2 = jVar2;
                        gVar5 = gVar9;
                        aVarA = (p205x6.a) objG;
                        if (aVarA == null) {
                            aVarA = p205x6.a.f37418g.a();
                        }
                        aVar2 = aVarA;
                        byteBufferH = aVar2.h();
                        jI = aVar2.i();
                        jK = aVar2.k();
                        if (jK == jI) {
                            r13 = dVar2;
                            dVar2 = r15;
                            r18 = aVar2;
                            io.ktor.utils.io.g gVar10 = gVar5;
                            gVar2 = gVar6;
                            gVar3 = gVar10;
                            iIntValue = 0;
                            dVar2.f12455a = r13;
                            dVar2.f12456b = gVar2;
                            dVar2.f12457c = gVar3;
                            dVar2.f12458d = r18;
                            dVar2.f12459e = iIntValue;
                            dVar2.f12461g = 3;
                            Object objC3 = x.c(gVar3, r18, iIntValue, dVar2);
                            r17 = dVar2;
                            r16 = r13;
                        } else {
                            r15.f12455a = dVar2;
                            r15.f12456b = gVar6;
                            r15.f12457c = gVar5;
                            r15.f12458d = aVar2;
                            r15.f12461g = 2;
                            objG = g(dVar2, byteBufferH, (int) jI, (int) jK, r15);
                            if (objG != objF) {
                                r14 = dVar2;
                                r12 = r15;
                                aVar = aVar2;
                                io.ktor.utils.io.g gVar11 = gVar5;
                                gVar2 = gVar6;
                                gVar3 = gVar11;
                                iIntValue = ((Number) objG).intValue();
                                dVar2 = r12;
                                r18 = aVar;
                                r13 = r14;
                                dVar2.f12455a = r13;
                                dVar2.f12456b = gVar2;
                                dVar2.f12457c = gVar3;
                                dVar2.f12458d = r18;
                                dVar2.f12459e = iIntValue;
                                dVar2.f12461g = 3;
                                Object objC4 = x.c(gVar3, r18, iIntValue, dVar2);
                                r17 = dVar2;
                                r16 = r13;
                            }
                        }
                        r9 = r11;
                        return objF;
                    } catch (Throwable th) {
                        th = th;
                        r8 = gVar6;
                        dVar2 = jVar2;
                    }
                } else if (r18 == 2) {
                    p205x6.a aVar3 = (p205x6.a) dVar2.f12458d;
                    gVar3 = (io.ktor.utils.io.g) dVar2.f12457c;
                    gVar2 = (io.ktor.utils.io.g) dVar2.f12456b;
                    io.ktor.utils.io.j jVar3 = (io.ktor.utils.io.j) dVar2.f12455a;
                    C6.r.b(objG);
                    r12 = dVar2;
                    aVar = aVar3;
                    r14 = jVar3;
                    iIntValue = ((Number) objG).intValue();
                    dVar2 = r12;
                    r18 = aVar;
                    r13 = r14;
                    dVar2.f12455a = r13;
                    dVar2.f12456b = gVar2;
                    dVar2.f12457c = gVar3;
                    dVar2.f12458d = r18;
                    dVar2.f12459e = iIntValue;
                    dVar2.f12461g = 3;
                    Object objC5 = x.c(gVar3, r18, iIntValue, dVar2);
                    r17 = dVar2;
                    r16 = r13;
                } else {
                    if (r18 == 3) {
                        gVar2 = (io.ktor.utils.io.g) dVar2.f12456b;
                        io.ktor.utils.io.j jVar4 = (io.ktor.utils.io.j) dVar2.f12455a;
                        C6.r.b(objG);
                        r17 = dVar2;
                        r16 = jVar4;
                        r10 = r17;
                        gVar4 = gVar2;
                        r11 = r16;
                        i9 = 1;
                        if (gVar4.J()) {
                            r10.f12455a = r11;
                            r10.f12456b = gVar4;
                            r10.f12457c = gVar4;
                            r10.f12458d = null;
                            r10.f12461g = i9;
                            objE = x.e(gVar4, i9, r10);
                            if (objE != objF) {
                                try {
                                    try {
                                        gVar5 = gVar4;
                                        r15 = r10;
                                        objG = objE;
                                        gVar6 = gVar5;
                                        dVar2 = r11;
                                        aVarA = (p205x6.a) objG;
                                        if (aVarA == null) {
                                            aVarA = p205x6.a.f37418g.a();
                                        }
                                        aVar2 = aVarA;
                                        byteBufferH = aVar2.h();
                                        jI = aVar2.i();
                                        jK = aVar2.k();
                                        if (jK == jI) {
                                            r13 = dVar2;
                                            dVar2 = r15;
                                            r18 = aVar2;
                                            io.ktor.utils.io.g gVar12 = gVar5;
                                            gVar2 = gVar6;
                                            gVar3 = gVar12;
                                            iIntValue = 0;
                                            dVar2.f12455a = r13;
                                            dVar2.f12456b = gVar2;
                                            dVar2.f12457c = gVar3;
                                            dVar2.f12458d = r18;
                                            dVar2.f12459e = iIntValue;
                                            dVar2.f12461g = 3;
                                            Object objC6 = x.c(gVar3, r18, iIntValue, dVar2);
                                            r17 = dVar2;
                                            r16 = r13;
                                        } else {
                                            r15.f12455a = dVar2;
                                            r15.f12456b = gVar6;
                                            r15.f12457c = gVar5;
                                            r15.f12458d = aVar2;
                                            r15.f12461g = 2;
                                            objG = g(dVar2, byteBufferH, (int) jI, (int) jK, r15);
                                            if (objG != objF) {
                                                r14 = dVar2;
                                                r12 = r15;
                                                aVar = aVar2;
                                                io.ktor.utils.io.g gVar13 = gVar5;
                                                gVar2 = gVar6;
                                                gVar3 = gVar13;
                                                iIntValue = ((Number) objG).intValue();
                                                dVar2 = r12;
                                                r18 = aVar;
                                                r13 = r14;
                                                dVar2.f12455a = r13;
                                                dVar2.f12456b = gVar2;
                                                dVar2.f12457c = gVar3;
                                                dVar2.f12458d = r18;
                                                dVar2.f12459e = iIntValue;
                                                dVar2.f12461g = 3;
                                                Object objC7 = x.c(gVar3, r18, iIntValue, dVar2);
                                                r17 = dVar2;
                                                r16 = r13;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r13 = dVar2;
                                        dVar2 = r15;
                                        r18 = aVar2;
                                        io.ktor.utils.io.g gVar14 = gVar5;
                                        gVar2 = gVar6;
                                        gVar3 = gVar14;
                                        try {
                                            dVar2.f12455a = r13;
                                            dVar2.f12456b = gVar2;
                                            dVar2.f12457c = th;
                                            dVar2.f12458d = null;
                                            dVar2.f12461g = 4;
                                            if (x.c(gVar3, r18, 0, dVar2) != objF) {
                                                throw th;
                                            }
                                            r9 = r11;
                                            return objF;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            r8 = gVar2;
                                            dVar2 = r13;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    r8 = gVar6;
                                    dVar2.d(th);
                                    r8.f(th);
                                    r9 = dVar2;
                                }
                            }
                        } else {
                            f(gVar4);
                            byte[] bArr2 = f12444c;
                            r10.f12455a = r11;
                            r10.f12456b = gVar4;
                            r10.f12457c = null;
                            r10.f12458d = null;
                            r10.f12461g = 5;
                        }
                        r9 = r11;
                        return objF;
                    }
                    if (r18 == 4) {
                        Throwable th5 = (Throwable) dVar2.f12457c;
                        C6.r.b(objG);
                        throw th5;
                    }
                    if (r18 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r8 = (io.ktor.utils.io.g) dVar2.f12456b;
                    dVar2 = (io.ktor.utils.io.j) dVar2.f12455a;
                    try {
                        C6.r.b(objG);
                        r9 = dVar2;
                    } catch (Throwable th6) {
                        th = th6;
                        dVar2.d(th);
                        r8.f(th);
                        r9 = dVar2;
                    }
                }
                try {
                    dVar2.d(th);
                    r8.f(th);
                    r9 = dVar2;
                } finally {
                    dVar2.flush();
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            r8 = r18;
        }
        return G.f1419a;
    }

    public static final void f(io.ktor.utils.io.g gVar) throws Throwable {
        Throwable thA = gVar instanceof InterfaceC2442c ? gVar.a() : null;
        if (thA != null) {
            throw thA;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        if (io.ktor.utils.io.k.b(r8, r9, r0) == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(io.ktor.utils.io.j jVar, ByteBuffer byteBuffer, int i8, int i9, G6.d dVar) {
        e eVar;
        int i10;
        ByteBuffer byteBuffer2;
        int i11;
        io.ktor.utils.io.j jVar2;
        int i12;
        io.ktor.utils.io.j jVar3;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i13 = eVar.f12468g;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f12468g = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f12467f;
        Object objF = H6.c.f();
        int i14 = eVar.f12468g;
        if (i14 == 0) {
            C6.r.b(obj);
            i10 = i9 - i8;
            eVar.f12462a = jVar;
            eVar.f12463b = byteBuffer;
            eVar.f12464c = i8;
            eVar.f12465d = i9;
            eVar.f12466e = i10;
            eVar.f12468g = 1;
            if (Z5.e.g(jVar, i10, eVar) != objF) {
            }
            return objF;
        }
        if (i14 == 1) {
            int i15 = eVar.f12466e;
            i9 = eVar.f12465d;
            i8 = eVar.f12464c;
            byteBuffer = (ByteBuffer) eVar.f12463b;
            io.ktor.utils.io.j jVar4 = (io.ktor.utils.io.j) eVar.f12462a;
            C6.r.b(obj);
            i10 = i15;
            jVar = jVar4;
        } else {
            if (i14 == 2) {
                i12 = eVar.f12466e;
                i11 = eVar.f12465d;
                i8 = eVar.f12464c;
                byteBuffer2 = (ByteBuffer) eVar.f12463b;
                jVar2 = (io.ktor.utils.io.j) eVar.f12462a;
                C6.r.b(obj);
                eVar.f12462a = jVar2;
                eVar.f12463b = null;
                eVar.f12464c = i12;
                eVar.f12468g = 3;
                if (jVar2.g(byteBuffer2, i8, i11, eVar) != objF) {
                    jVar3 = jVar2;
                    byte[] bArr = f12443b;
                    eVar.f12462a = jVar3;
                    eVar.f12464c = i12;
                    eVar.f12468g = 4;
                }
                return objF;
            }
            if (i14 == 3) {
                i12 = eVar.f12464c;
                jVar3 = (io.ktor.utils.io.j) eVar.f12462a;
                C6.r.b(obj);
                byte[] bArr2 = f12443b;
                eVar.f12462a = jVar3;
                eVar.f12464c = i12;
                eVar.f12468g = 4;
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = eVar.f12464c;
                jVar3 = (io.ktor.utils.io.j) eVar.f12462a;
                C6.r.b(obj);
            }
        }
        jVar3.flush();
        return I6.b.d(i12);
        eVar.f12462a = jVar;
        eVar.f12463b = byteBuffer;
        eVar.f12464c = i8;
        eVar.f12465d = i9;
        eVar.f12466e = i10;
        eVar.f12468g = 2;
        if (jVar.i((short) 3338, eVar) != objF) {
            int i16 = i9;
            byteBuffer2 = byteBuffer;
            i11 = i16;
            jVar2 = jVar;
            i12 = i10;
            eVar.f12462a = jVar2;
            eVar.f12463b = null;
            eVar.f12464c = i12;
            eVar.f12468g = 3;
            if (jVar2.g(byteBuffer2, i8, i11, eVar) != objF) {
                jVar3 = jVar2;
                byte[] bArr3 = f12443b;
                eVar.f12462a = jVar3;
                eVar.f12464c = i12;
                eVar.f12468g = 4;
            }
        }
        return objF;
    }
}
