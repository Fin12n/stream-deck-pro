package p052f6;

import C6.G;
import D6.C0933m;
import D6.C0934n;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p017b7.I;
import p017b7.J;
import p035d7.v;
import p035d7.x;
import p035d7.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f22164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G6.g f22165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p205x6.j f22166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f22167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C6.j f22168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C6.j f22169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f22170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f22171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x f22172i;
    private volatile SecretKeySpec masterSecret;
    private volatile F serverHello;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f22174b;

        static {
            int[] iArr = new int[p052f6.p.values().length];
            try {
                iArr[p052f6.p.ECDHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p052f6.p.RSA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22173a = iArr;
            int[] iArr2 = new int[C.values().length];
            try {
                iArr2[C.Certificate.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[C.CertificateRequest.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[C.ServerKeyExchange.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[C.ServerDone.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f22174b = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p061g6.f invoke() {
            g6.f.a aVar = p061g6.f.f23809a;
            F f8 = t.this.serverHello;
            if (f8 == null) {
                kotlin.jvm.internal.t.t("serverHello");
                f8 = null;
            }
            return aVar.a(f8.a(), t.this.v());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f22178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f22179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f22180e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f22181f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22183h;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22181f = obj;
            this.f22183h |= Integer.MIN_VALUE;
            return t.this.x(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f22186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f22187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f22188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f22189f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22191h;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22189f = obj;
            this.f22191h |= Integer.MIN_VALUE;
            return t.this.y(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f22195d;

        public e(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            e eVar = t.this.new e(dVar);
            eVar.f22195d = obj;
            return eVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, G6.d dVar) {
            return ((e) create(vVar, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0062  */
        /* JADX WARN: Code duplicated, block: B:23:0x0076  */
        /* JADX WARN: Code duplicated, block: B:27:0x0092  */
        /* JADX WARN: Code duplicated, block: B:36:0x006e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:17:0x005c->B:38:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0057 -> B:17:0x005c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0092 -> B:28:0x0094). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 202
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f6.t.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f22199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f22200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t f22201e;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f22202a;

            static {
                int[] iArr = new int[E.values().length];
                try {
                    iArr[E.f21984e.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[E.ChangeCipherSpec.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f22202a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.ktor.utils.io.g gVar, t tVar, G6.d dVar) {
            super(2, dVar);
            this.f22200d = gVar;
            this.f22201e = tVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            f fVar = new f(this.f22200d, this.f22201e, dVar);
            fVar.f22199c = obj;
            return fVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v vVar, G6.d dVar) {
            return ((f) create(vVar, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0046  */
        /* JADX WARN: Code duplicated, block: B:20:0x0047 A[Catch: all -> 0x0019, p -> 0x0114, Merged into TryCatch #0 {all -> 0x0111, all -> 0x0019, p -> 0x0114, blocks: (B:44:0x0100, B:48:0x0114, B:7:0x0015, B:17:0x0038, B:20:0x0047, B:22:0x004b, B:23:0x0055, B:26:0x0069, B:30:0x0088, B:33:0x0090, B:34:0x00ab, B:35:0x00ac, B:36:0x00b3, B:37:0x00b4, B:39:0x00cc, B:42:0x00d8, B:14:0x002b), top: B:54:0x0009 }, PHI: r1 r5 r14
          0x0047: PHI (r1v2 int) = (r1v8 int), (r1v9 int) binds: [B:18:0x0044, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE]
          0x0047: PHI (r5v3 d7.v) = (r5v4 d7.v), (r5v6 d7.v) binds: [B:18:0x0044, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE]
          0x0047: PHI (r14v9 java.lang.Object) = (r14v27 java.lang.Object), (r14v0 java.lang.Object) binds: [B:18:0x0044, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:22:0x004b A[Catch: all -> 0x0019, p -> 0x0114, Merged into TryCatch #0 {all -> 0x0111, all -> 0x0019, p -> 0x0114, blocks: (B:44:0x0100, B:48:0x0114, B:7:0x0015, B:17:0x0038, B:20:0x0047, B:22:0x004b, B:23:0x0055, B:26:0x0069, B:30:0x0088, B:33:0x0090, B:34:0x00ab, B:35:0x00ac, B:36:0x00b3, B:37:0x00b4, B:39:0x00cc, B:42:0x00d8, B:14:0x002b), top: B:54:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:25:0x0067  */
        /* JADX WARN: Code duplicated, block: B:26:0x0069 A[Catch: all -> 0x0019, p -> 0x0114, Merged into TryCatch #0 {all -> 0x0111, all -> 0x0019, p -> 0x0114, blocks: (B:44:0x0100, B:48:0x0114, B:7:0x0015, B:17:0x0038, B:20:0x0047, B:22:0x004b, B:23:0x0055, B:26:0x0069, B:30:0x0088, B:33:0x0090, B:34:0x00ab, B:35:0x00ac, B:36:0x00b3, B:37:0x00b4, B:39:0x00cc, B:42:0x00d8, B:14:0x002b), top: B:54:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:29:0x0086  */
        /* JADX WARN: Code duplicated, block: B:30:0x0088 A[Catch: all -> 0x0019, p -> 0x0114, Merged into TryCatch #0 {all -> 0x0111, all -> 0x0019, p -> 0x0114, blocks: (B:44:0x0100, B:48:0x0114, B:7:0x0015, B:17:0x0038, B:20:0x0047, B:22:0x004b, B:23:0x0055, B:26:0x0069, B:30:0x0088, B:33:0x0090, B:34:0x00ab, B:35:0x00ac, B:36:0x00b3, B:37:0x00b4, B:39:0x00cc, B:42:0x00d8, B:14:0x002b), top: B:54:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x008e  */
        /* JADX WARN: Code duplicated, block: B:33:0x0090 A[Catch: all -> 0x0019, p -> 0x0114, Merged into TryCatch #0 {all -> 0x0111, all -> 0x0019, p -> 0x0114, blocks: (B:44:0x0100, B:48:0x0114, B:7:0x0015, B:17:0x0038, B:20:0x0047, B:22:0x004b, B:23:0x0055, B:26:0x0069, B:30:0x0088, B:33:0x0090, B:34:0x00ab, B:35:0x00ac, B:36:0x00b3, B:37:0x00b4, B:39:0x00cc, B:42:0x00d8, B:14:0x002b), top: B:54:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00ac A[Catch: all -> 0x0019, p -> 0x0114, Merged into TryCatch #0 {all -> 0x0111, all -> 0x0019, p -> 0x0114, blocks: (B:44:0x0100, B:48:0x0114, B:7:0x0015, B:17:0x0038, B:20:0x0047, B:22:0x004b, B:23:0x0055, B:26:0x0069, B:30:0x0088, B:33:0x0090, B:34:0x00ab, B:35:0x00ac, B:36:0x00b3, B:37:0x00b4, B:39:0x00cc, B:42:0x00d8, B:14:0x002b), top: B:54:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[Catch: all -> 0x0019, p -> 0x0114, Merged into TryCatch #0 {all -> 0x0111, all -> 0x0019, p -> 0x0114, blocks: (B:44:0x0100, B:48:0x0114, B:7:0x0015, B:17:0x0038, B:20:0x0047, B:22:0x004b, B:23:0x0055, B:26:0x0069, B:30:0x0088, B:33:0x0090, B:34:0x00ab, B:35:0x00ac, B:36:0x00b3, B:37:0x00b4, B:39:0x00cc, B:42:0x00d8, B:14:0x002b), top: B:54:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00cc A[Catch: all -> 0x0019, p -> 0x0114, Merged into TryCatch #0 {all -> 0x0111, all -> 0x0019, p -> 0x0114, blocks: (B:44:0x0100, B:48:0x0114, B:7:0x0015, B:17:0x0038, B:20:0x0047, B:22:0x004b, B:23:0x0055, B:26:0x0069, B:30:0x0088, B:33:0x0090, B:34:0x00ab, B:35:0x00ac, B:36:0x00b3, B:37:0x00b4, B:39:0x00cc, B:42:0x00d8, B:14:0x002b), top: B:54:0x0009 }, TRY_LEAVE] */
        /* JADX WARN: Code duplicated, block: B:42:0x00d8 A[Catch: all -> 0x0019, p -> 0x0114, Merged into TryCatch #0 {all -> 0x0111, all -> 0x0019, p -> 0x0114, blocks: (B:44:0x0100, B:48:0x0114, B:7:0x0015, B:17:0x0038, B:20:0x0047, B:22:0x004b, B:23:0x0055, B:26:0x0069, B:30:0x0088, B:33:0x0090, B:34:0x00ab, B:35:0x00ac, B:36:0x00b3, B:37:0x00b4, B:39:0x00cc, B:42:0x00d8, B:14:0x002b), top: B:54:0x0009 }, TRY_ENTER, TRY_LEAVE] */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0100: INVOKE (r0 I:d7.y) = (r5 I:d7.v) INTERFACE call: d7.v.e():d7.y A[Catch: all -> 0x0111, MD:():d7.y (m), TRY_ENTER] (LINE:257), block:B:44:0x0100 */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0114: INVOKE (r14 I:d7.y) = (r5 I:d7.v) INTERFACE call: d7.v.e():d7.y A[Catch: all -> 0x0111, MD:():d7.y (m), TRY_ENTER] (LINE:277), block:B:48:0x0114 */
        /* JADX WARN: Type inference failed for: r5v0, types: [d7.v] */
        /* JADX WARN: Type inference failed for: r5v1, types: [d7.v] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0083 -> B:17:0x0038). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008e -> B:17:0x0038). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 297
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f6.t.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final byte[] invoke() {
            F f8 = t.this.serverHello;
            F f9 = null;
            if (f8 == null) {
                kotlin.jvm.internal.t.t("serverHello");
                f8 = null;
            }
            C2314e c2314eA = f8.a();
            t tVar = t.this;
            SecretKeySpec secretKeySpec = tVar.masterSecret;
            if (secretKeySpec == null) {
                kotlin.jvm.internal.t.t("masterSecret");
                secretKeySpec = null;
            }
            F f10 = tVar.serverHello;
            if (f10 == null) {
                kotlin.jvm.internal.t.t("serverHello");
            } else {
                f9 = f10;
            }
            return p052f6.l.f(secretKeySpec, C0933m.x(f9.c(), tVar.f22167d), c2314eA.j(), c2314eA.l(), c2314eA.e());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f22206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f22208e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22210g;

        public h(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22208e = obj;
            this.f22210g |= Integer.MIN_VALUE;
            return t.this.z(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f22214d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.j f22216f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.ktor.utils.io.j jVar, G6.d dVar) {
            super(2, dVar);
            this.f22216f = jVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            i iVar = t.this.new i(this.f22216f, dVar);
            iVar.f22214d = obj;
            return iVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p035d7.c cVar, G6.d dVar) {
            return ((i) create(cVar, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0075  */
        /* JADX WARN: Code duplicated, block: B:27:0x0077  */
        /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:24:0x0067, B:28:0x007a, B:30:0x0082, B:40:0x00b1, B:18:0x004c, B:23:0x005e, B:13:0x0037, B:32:0x008a, B:34:0x0096, B:37:0x009f), top: B:62:0x000b, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #3 {all -> 0x003d, blocks: (B:13:0x0037, B:32:0x008a, B:34:0x0096, B:37:0x009f), top: B:68:0x0037, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x0095  */
        /* JADX WARN: Code duplicated, block: B:36:0x009e  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
        
            if (p052f6.o.n(r14, r0, r13) == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00ed, code lost:
        
            if (p052f6.o.n(r14, r7, r13) == r1) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0131, code lost:
        
            if (p052f6.o.n(r14, r7, r13) == r1) goto L56;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ad -> B:14:0x003a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00b1 -> B:41:0x00b8). Please report as a decompilation issue!!! */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            p035d7.c cVar;
            p035d7.i it;
            int i8;
            p035d7.c cVar2;
            p035d7.i iVar;
            p205x6.j jVar;
            D d8;
            D dA;
            Object objA;
            Object objF = H6.c.f();
            int i9 = this.f22213c;
            try {
                if (i9 == 0) {
                    C6.r.b(obj);
                    cVar = (p035d7.c) this.f22214d;
                    it = cVar.e().iterator();
                    i8 = 0;
                    this.f22214d = cVar;
                    this.f22211a = it;
                    this.f22212b = i8;
                    this.f22213c = 1;
                    objA = it.a(this);
                    if (objA != objF) {
                        cVar2 = cVar;
                        obj = objA;
                        iVar = it;
                        if (((Boolean) obj).booleanValue()) {
                            d8 = (D) iVar.next();
                            if (i8 != 0) {
                                dA = t.this.t().a(d8);
                            } else {
                                dA = d8;
                            }
                            if (d8.b() == E.ChangeCipherSpec) {
                                i8 = 1;
                            }
                            io.ktor.utils.io.j jVar2 = this.f22216f;
                            this.f22214d = cVar2;
                            this.f22211a = iVar;
                            this.f22212b = i8;
                            this.f22213c = 2;
                        } else {
                            io.ktor.utils.io.j jVar3 = this.f22216f;
                            E e8 = E.f21984e;
                            jVar = new p205x6.j(null, 1, null);
                            jVar.g1((byte) p052f6.r.WARNING.c());
                            jVar.g1((byte) p052f6.s.CloseNotify.c());
                            D d9 = new D(e8, null, jVar.M1(), 2, null);
                            this.f22214d = null;
                            this.f22211a = null;
                            this.f22213c = 3;
                        }
                    }
                    return objF;
                }
                if (i9 == 1) {
                    int i10 = this.f22212b;
                    p035d7.i iVar2 = (p035d7.i) this.f22211a;
                    p035d7.c cVar3 = (p035d7.c) this.f22214d;
                    C6.r.b(obj);
                    cVar2 = cVar3;
                    iVar = iVar2;
                    i8 = i10;
                    if (((Boolean) obj).booleanValue()) {
                        d8 = (D) iVar.next();
                        if (i8 != 0) {
                            dA = t.this.t().a(d8);
                        } else {
                            dA = d8;
                        }
                        if (d8.b() == E.ChangeCipherSpec) {
                            i8 = 1;
                        }
                        io.ktor.utils.io.j jVar4 = this.f22216f;
                        this.f22214d = cVar2;
                        this.f22211a = iVar;
                        this.f22212b = i8;
                        this.f22213c = 2;
                    } else {
                        io.ktor.utils.io.j jVar5 = this.f22216f;
                        E e9 = E.f21984e;
                        jVar = new p205x6.j(null, 1, null);
                        jVar.g1((byte) p052f6.r.WARNING.c());
                        jVar.g1((byte) p052f6.s.CloseNotify.c());
                        D d10 = new D(e9, null, jVar.M1(), 2, null);
                        this.f22214d = null;
                        this.f22211a = null;
                        this.f22213c = 3;
                    }
                    return objF;
                }
                if (i9 == 2) {
                    i8 = this.f22212b;
                    iVar = (p035d7.i) this.f22211a;
                    cVar2 = (p035d7.c) this.f22214d;
                    try {
                        C6.r.b(obj);
                    } catch (Throwable th) {
                        it = iVar;
                        cVar2.e().d(th);
                        cVar = cVar2;
                        this.f22214d = cVar;
                        this.f22211a = it;
                        this.f22212b = i8;
                        this.f22213c = 1;
                        objA = it.a(this);
                        if (objA != objF) {
                            cVar2 = cVar;
                            obj = objA;
                            iVar = it;
                            if (((Boolean) obj).booleanValue()) {
                                d8 = (D) iVar.next();
                                if (i8 != 0) {
                                    dA = t.this.t().a(d8);
                                } else {
                                    dA = d8;
                                }
                                if (d8.b() == E.ChangeCipherSpec) {
                                    i8 = 1;
                                }
                                io.ktor.utils.io.j jVar6 = this.f22216f;
                                this.f22214d = cVar2;
                                this.f22211a = iVar;
                                this.f22212b = i8;
                                this.f22213c = 2;
                            } else {
                                io.ktor.utils.io.j jVar7 = this.f22216f;
                                E e10 = E.f21984e;
                                jVar = new p205x6.j(null, 1, null);
                                try {
                                    jVar.g1((byte) p052f6.r.WARNING.c());
                                    jVar.g1((byte) p052f6.s.CloseNotify.c());
                                    D d11 = new D(e10, null, jVar.M1(), 2, null);
                                    this.f22214d = null;
                                    this.f22211a = null;
                                    this.f22213c = 3;
                                } catch (Throwable th2) {
                                    jVar.T0();
                                    throw th2;
                                }
                            }
                        }
                        return objF;
                    }
                    it = iVar;
                    cVar = cVar2;
                    this.f22214d = cVar;
                    this.f22211a = it;
                    this.f22212b = i8;
                    this.f22213c = 1;
                    objA = it.a(this);
                    if (objA != objF) {
                        cVar2 = cVar;
                        obj = objA;
                        iVar = it;
                        if (((Boolean) obj).booleanValue()) {
                            d8 = (D) iVar.next();
                            if (i8 != 0) {
                                dA = t.this.t().a(d8);
                            } else {
                                dA = d8;
                            }
                            if (d8.b() == E.ChangeCipherSpec) {
                                i8 = 1;
                            }
                            io.ktor.utils.io.j jVar8 = this.f22216f;
                            this.f22214d = cVar2;
                            this.f22211a = iVar;
                            this.f22212b = i8;
                            this.f22213c = 2;
                        } else {
                            io.ktor.utils.io.j jVar9 = this.f22216f;
                            E e11 = E.f21984e;
                            jVar = new p205x6.j(null, 1, null);
                            jVar.g1((byte) p052f6.r.WARNING.c());
                            jVar.g1((byte) p052f6.s.CloseNotify.c());
                            D d12 = new D(e11, null, jVar.M1(), 2, null);
                            this.f22214d = null;
                            this.f22211a = null;
                            this.f22213c = 3;
                        }
                    }
                    return objF;
                }
                if (i9 == 3) {
                    C6.r.b(obj);
                } else {
                    if (i9 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.f22214d;
                    C6.r.b(obj);
                }
                io.ktor.utils.io.k.a(this.f22216f);
                return G.f1419a;
            } catch (Throwable th3) {
                th = th3;
                io.ktor.utils.io.j jVar10 = this.f22216f;
                E e12 = E.f21984e;
                p205x6.j jVar11 = new p205x6.j(null, 1, null);
                try {
                    jVar11.g1((byte) p052f6.r.WARNING.c());
                    jVar11.g1((byte) p052f6.s.CloseNotify.c());
                    D d13 = new D(e12, null, jVar11.M1(), 2, null);
                    this.f22214d = th;
                    this.f22211a = null;
                    this.f22213c = 4;
                } catch (Throwable th4) {
                    jVar11.T0();
                    throw th4;
                }
            }
            io.ktor.utils.io.k.a(this.f22216f);
            throw th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22218b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22220d;

        public j(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22218b = obj;
            this.f22220d |= Integer.MIN_VALUE;
            return t.this.A(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f22221a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22223c;

        public k(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22221a = obj;
            this.f22223c |= Integer.MIN_VALUE;
            return t.this.B(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22225b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22227d;

        public l(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22225b = obj;
            this.f22227d |= Integer.MIN_VALUE;
            return t.this.C(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22229b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22231d;

        public m(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22229b = obj;
            this.f22231d |= Integer.MIN_VALUE;
            return t.this.D(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2311b f22232a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C2311b c2311b) {
            super(1);
            this.f22232a = c2311b;
        }

        public final void b(p205x6.j sendHandshakeRecord) {
            X509Certificate[] x509CertificateArrA;
            kotlin.jvm.internal.t.g(sendHandshakeRecord, "$this$sendHandshakeRecord");
            C2311b c2311b = this.f22232a;
            if (c2311b == null || (x509CertificateArrA = c2311b.a()) == null) {
                x509CertificateArrA = new X509Certificate[0];
            }
            p052f6.o.o(sendHandshakeRecord, x509CertificateArrA);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((p205x6.j) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p070h6.b f22233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f22234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Signature f22235c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(p070h6.b bVar, t tVar, Signature signature) {
            super(1);
            this.f22233a = bVar;
            this.f22234b = tVar;
            this.f22235c = signature;
        }

        public final void b(p205x6.j sendHandshakeRecord) throws p205x6.r, SignatureException {
            kotlin.jvm.internal.t.g(sendHandshakeRecord, "$this$sendHandshakeRecord");
            sendHandshakeRecord.g1(this.f22233a.a().b());
            sendHandshakeRecord.g1(this.f22233a.d().b());
            p205x6.j jVar = this.f22234b.f22166c;
            Signature signature = this.f22235c;
            p205x6.k kVarA = p205x6.x.a(jVar);
            try {
                signature.update(p205x6.y.c(kVarA, 0, 1, null));
                G g8 = G.f1419a;
                kVarA.a2();
                byte[] bArrSign = this.f22235c.sign();
                kotlin.jvm.internal.t.d(bArrSign);
                p205x6.v.e(sendHandshakeRecord, (short) bArrSign.length);
                p205x6.u.d(sendHandshakeRecord, bArrSign, 0, 0, 6, null);
            } catch (Throwable th) {
                kVarA.a2();
                throw th;
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws p205x6.r, SignatureException {
            b((p205x6.j) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p205x6.k f22236a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(p205x6.k kVar) {
            super(1);
            this.f22236a = kVar;
        }

        public final void b(p205x6.j sendHandshakeRecord) {
            kotlin.jvm.internal.t.g(sendHandshakeRecord, "$this$sendHandshakeRecord");
            sendHandshakeRecord.o1(this.f22236a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((p205x6.j) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class q extends u implements Q6.k {
        public q() {
            super(1);
        }

        public final void b(p205x6.j sendHandshakeRecord) {
            kotlin.jvm.internal.t.g(sendHandshakeRecord, "$this$sendHandshakeRecord");
            p052f6.o.p(sendHandshakeRecord, H.TLS12, t.this.f22164a.b(), t.this.f22167d, new byte[32], t.this.f22164a.d());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((p205x6.j) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class r extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p205x6.k f22238a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(p205x6.k kVar) {
            super(1);
            this.f22238a = kVar;
        }

        public final void b(p205x6.j sendHandshakeRecord) {
            kotlin.jvm.internal.t.g(sendHandshakeRecord, "$this$sendHandshakeRecord");
            sendHandshakeRecord.o1(this.f22238a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((p205x6.j) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class s extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22240b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22242d;

        public s(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22240b = obj;
            this.f22242d |= Integer.MIN_VALUE;
            return t.this.I(null, null, this);
        }
    }

    public t(io.ktor.utils.io.g rawInput, io.ktor.utils.io.j rawOutput, x config, G6.g coroutineContext) {
        kotlin.jvm.internal.t.g(rawInput, "rawInput");
        kotlin.jvm.internal.t.g(rawOutput, "rawOutput");
        kotlin.jvm.internal.t.g(config, "config");
        kotlin.jvm.internal.t.g(coroutineContext, "coroutineContext");
        this.f22164a = config;
        this.f22165b = coroutineContext;
        this.f22166c = I.a();
        this.f22167d = u.c(config.c());
        this.f22168e = C6.k.b(new g());
        this.f22169f = C6.k.b(new b());
        this.f22170g = p035d7.t.d(this, new I("cio-tls-parser"), 0, new f(rawInput, this, null), 2, null);
        this.f22171h = p035d7.b.b(this, new I("cio-tls-encoder"), 0, null, null, new i(rawOutput, null), 14, null);
        this.f22172i = p035d7.t.d(this, new I("cio-tls-handshake"), 0, new e(null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object A(G6.d dVar) throws A {
        j jVar;
        t tVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i8 = jVar.f22220d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                jVar.f22220d = i8 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object objL = jVar.f22218b;
        Object objF = H6.c.f();
        int i9 = jVar.f22220d;
        if (i9 == 0) {
            C6.r.b(objL);
            x xVar = this.f22172i;
            jVar.f22217a = this;
            jVar.f22220d = 1;
            objL = xVar.l(jVar);
            if (objL == objF) {
                return objF;
            }
            tVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = (t) jVar.f22217a;
            C6.r.b(objL);
        }
        B b8 = (B) objL;
        if (b8.b() != C.Finished) {
            throw new A("Finished handshake expected, received: " + b8, null, 2, null);
        }
        byte[] bArrC = p205x6.y.c(b8.a(), 0, 1, null);
        p205x6.j jVar2 = tVar.f22166c;
        F f8 = tVar.serverHello;
        if (f8 == null) {
            kotlin.jvm.internal.t.t("serverHello");
            f8 = null;
        }
        byte[] bArrO = C2317h.o(jVar2, f8.a().f().d());
        SecretKeySpec secretKeySpec = tVar.masterSecret;
        if (secretKeySpec == null) {
            kotlin.jvm.internal.t.t("masterSecret");
            secretKeySpec = null;
        }
        byte[] bArrI = p052f6.o.i(bArrO, secretKeySpec, bArrC.length);
        if (Arrays.equals(bArrC, bArrI)) {
            return G.f1419a;
        }
        throw new A(Z6.o.h("Handshake: ServerFinished verification failed:\n                |Expected: " + C0934n.f0(bArrI, null, null, null, 0, null, null, 63, null) + "\n                |Actual: " + C0934n.f0(bArrC, null, null, null, 0, null, null, 63, null) + "\n                ", null, 1, null), null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(G6.d dVar) {
        k kVar;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i8 = kVar.f22223c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                kVar.f22223c = i8 - Integer.MIN_VALUE;
            } else {
                kVar = new k(dVar);
            }
        } else {
            kVar = new k(dVar);
        }
        Object objL = kVar.f22221a;
        Object objF = H6.c.f();
        int i9 = kVar.f22223c;
        if (i9 == 0) {
            C6.r.b(objL);
            x xVar = this.f22172i;
            kVar.f22223c = 1;
            objL = xVar.l(kVar);
            if (objL == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(objL);
        }
        B b8 = (B) objL;
        if (b8.b() == C.ServerHello) {
            return p052f6.n.h(b8.a());
        }
        throw new IllegalStateException(("Expected TLS handshake ServerHello but got " + b8.b()).toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(G6.d dVar) throws Throwable {
        l lVar;
        Throwable th;
        p205x6.k kVar;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i8 = lVar.f22227d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                lVar.f22227d = i8 - Integer.MIN_VALUE;
            } else {
                lVar = new l(dVar);
            }
        } else {
            lVar = new l(dVar);
        }
        Object obj = lVar.f22225b;
        Object objF = H6.c.f();
        int i9 = lVar.f22227d;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (p205x6.k) lVar.f22224a;
            try {
                C6.r.b(obj);
                return G.f1419a;
            } catch (Throwable th2) {
                th = th2;
                kVar.a2();
                throw th;
            }
        }
        C6.r.b(obj);
        p205x6.j jVar = new p205x6.j(null, 1, null);
        try {
            jVar.g1((byte) 1);
            p205x6.k kVarM1 = jVar.M1();
            try {
                y yVar = this.f22171h;
                D d8 = new D(E.ChangeCipherSpec, null, kVarM1, 2, null);
                lVar.f22224a = kVarM1;
                lVar.f22227d = 1;
                if (yVar.i(d8, lVar) == objF) {
                    return objF;
                }
                return G.f1419a;
            } catch (Throwable th3) {
                th = th3;
                kVar = kVarM1;
                kVar.a2();
                throw th;
            }
        } catch (Throwable th4) {
            jVar.T0();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(C2312c c2312c, G6.d dVar) {
        m mVar;
        Object next;
        boolean z8;
        boolean z9;
        boolean z10;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i8 = mVar.f22231d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                mVar.f22231d = i8 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar);
            }
        } else {
            mVar = new m(dVar);
        }
        Object obj = mVar.f22229b;
        Object objF = H6.c.f();
        int i9 = mVar.f22231d;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2311b c2311b = (C2311b) mVar.f22228a;
            C6.r.b(obj);
            return c2311b;
        }
        C6.r.b(obj);
        Iterator it = this.f22164a.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C2311b c2311b2 = (C2311b) next;
            X509Certificate x509Certificate = (X509Certificate) C0934n.N(c2311b2.a());
            String algorithm = x509Certificate.getPublicKey().getAlgorithm();
            z8 = false;
            if (kotlin.jvm.internal.t.c(algorithm, "RSA") ? C0934n.F(c2312c.c(), C2313d.f22044a.b()) : kotlin.jvm.internal.t.c(algorithm, "DSS") ? C0934n.F(c2312c.c(), C2313d.f22044a.a()) : false) {
                p070h6.b[] bVarArrB = c2312c.b();
                int length = bVarArrB.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z9 = true;
                        break;
                    }
                    if (Z6.v.v(bVarArrB[i10].b(), x509Certificate.getSigAlgName(), true)) {
                        z9 = false;
                        break;
                    }
                    i10++;
                }
                if (!z9) {
                    if (c2312c.a().isEmpty()) {
                        z8 = true;
                    } else {
                        X509Certificate[] x509CertificateArrA = c2311b2.a();
                        ArrayList arrayList = new ArrayList(x509CertificateArrA.length);
                        for (X509Certificate x509Certificate2 : x509CertificateArrA) {
                            arrayList.add(new X500Principal(x509Certificate2.getIssuerX500Principal().getName()));
                        }
                        if (arrayList.isEmpty()) {
                            z10 = false;
                            break;
                        }
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z10 = false;
                                break;
                            }
                            if (c2312c.a().contains((X500Principal) it2.next())) {
                                z10 = true;
                                break;
                            }
                        }
                        if (z10) {
                            z8 = true;
                        }
                    }
                }
            }
        } while (!z8);
        C2311b c2311b3 = (C2311b) next;
        C c8 = C.Certificate;
        Q6.k nVar = new n(c2311b3);
        mVar.f22228a = c2311b3;
        mVar.f22231d = 1;
        return I(c8, nVar, mVar) == objF ? objF : c2311b3;
    }

    public final Object E(C2312c c2312c, C2311b c2311b, G6.d dVar) throws Throwable {
        p070h6.b bVar;
        X509Certificate x509Certificate = (X509Certificate) C0934n.N(c2311b.a());
        p070h6.b[] bVarArrB = c2312c.b();
        int length = bVarArrB.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrB[i8];
            if (Z6.v.v(bVar.b(), x509Certificate.getSigAlgName(), true)) {
                break;
            }
            i8++;
        }
        if (bVar == null) {
            return G.f1419a;
        }
        if (bVar.d() == p070h6.g.DSA) {
            return G.f1419a;
        }
        Signature signature = Signature.getInstance(((X509Certificate) C0934n.N(c2311b.a())).getSigAlgName());
        kotlin.jvm.internal.t.d(signature);
        signature.initSign(c2311b.b());
        Object objI = I(C.CertificateVerify, new o(bVar, this, signature), dVar);
        return objI == H6.c.f() ? objI : G.f1419a;
    }

    public final Object F(SecretKeySpec secretKeySpec, G6.d dVar) throws Throwable {
        p205x6.j jVar = this.f22166c;
        F f8 = this.serverHello;
        if (f8 == null) {
            kotlin.jvm.internal.t.t("serverHello");
            f8 = null;
        }
        Object objI = I(C.Finished, new p(p052f6.o.h(C2317h.o(jVar, f8.a().f().d()), secretKeySpec)), dVar);
        return objI == H6.c.f() ? objI : G.f1419a;
    }

    public final Object G(G6.d dVar) throws Throwable {
        Object objI = I(C.ClientHello, new q(), dVar);
        return objI == H6.c.f() ? objI : G.f1419a;
    }

    public final Object H(p052f6.p pVar, Certificate certificate, byte[] bArr, C2318i c2318i, G6.d dVar) throws Throwable {
        p205x6.k kVarM1;
        int i8 = a.f22173a[pVar.ordinal()];
        if (i8 == 1) {
            p205x6.j jVar = new p205x6.j(null, 1, null);
            try {
                if (c2318i == null) {
                    throw new A("ECDHE: Encryption info should be provided", null, 2, null);
                }
                p052f6.o.m(jVar, c2318i.b());
                kVarM1 = jVar.M1();
            } catch (Throwable th) {
                jVar.T0();
                throw th;
            }
        } else {
            if (i8 != 2) {
                throw new C6.m();
            }
            p205x6.j jVar2 = new p205x6.j(null, 1, null);
            try {
                PublicKey publicKey = certificate.getPublicKey();
                kotlin.jvm.internal.t.f(publicKey, "serverCertificate.publicKey");
                p052f6.o.l(jVar2, bArr, publicKey, this.f22164a.c());
                kVarM1 = jVar2.M1();
            } catch (Throwable th2) {
                jVar2.T0();
                throw th2;
            }
        }
        Object objI = I(C.ClientKeyExchange, new r(kVarM1), dVar);
        return objI == H6.c.f() ? objI : G.f1419a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(C c8, Q6.k kVar, G6.d dVar) throws Throwable {
        s sVar;
        Throwable th;
        D d8;
        if (dVar instanceof s) {
            sVar = (s) dVar;
            int i8 = sVar.f22242d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                sVar.f22242d = i8 - Integer.MIN_VALUE;
            } else {
                sVar = new s(dVar);
            }
        } else {
            sVar = new s(dVar);
        }
        Object obj = sVar.f22240b;
        Object objF = H6.c.f();
        int i9 = sVar.f22242d;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d8 = (D) sVar.f22239a;
            try {
                C6.r.b(obj);
                return G.f1419a;
            } catch (Throwable th2) {
                th = th2;
                d8.a().a2();
                throw th;
            }
        }
        C6.r.b(obj);
        p205x6.j jVar = new p205x6.j(null, 1, null);
        try {
            kVar.invoke(jVar);
            p205x6.k kVarM1 = jVar.M1();
            p205x6.j jVar2 = new p205x6.j(null, 1, null);
            try {
                p052f6.o.q(jVar2, c8, (int) kVarM1.o1());
                jVar2.o1(kVarM1);
                p205x6.k kVarM2 = jVar2.M1();
                C2317h.A(this.f22166c, kVarM2);
                D d9 = new D(E.Handshake, null, kVarM2, 2, null);
                try {
                    y yVar = this.f22171h;
                    sVar.f22239a = d9;
                    sVar.f22242d = 1;
                    if (yVar.i(d9, sVar) == objF) {
                        return objF;
                    }
                    return G.f1419a;
                } catch (Throwable th3) {
                    th = th3;
                    d8 = d9;
                    d8.a().a2();
                    throw th;
                }
            } catch (Throwable th4) {
                jVar2.T0();
                throw th4;
            }
        } catch (Throwable th5) {
            jVar.T0();
            throw th5;
        }
    }

    public final void J(F f8) throws A {
        C2314e c2314eA = f8.a();
        if (!this.f22164a.b().contains(c2314eA)) {
            throw new IllegalStateException(("Unsupported cipher suite " + c2314eA.m() + " in SERVER_HELLO").toString());
        }
        List listD = p070h6.h.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            p070h6.b bVar = (p070h6.b) obj;
            if (bVar.a() == c2314eA.f() && bVar.d() == c2314eA.n()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new A("No appropriate hash algorithm for suite: " + c2314eA, null, 2, null);
        }
        List listB = f8.b();
        if (listB.isEmpty()) {
            return;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (listB.contains((p070h6.b) it.next())) {
                    return;
                }
            }
        }
        throw new A("No sign algorithms in common. \nServer candidates: " + listB + " \nClient candidates: " + arrayList, null, 2, null);
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f22165b;
    }

    public final byte[] s(C2318i c2318i) throws NoSuchAlgorithmException, InvalidKeyException, A {
        F f8 = this.serverHello;
        if (f8 == null) {
            kotlin.jvm.internal.t.t("serverHello");
            f8 = null;
        }
        int i8 = a.f22173a[f8.a().d().ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                throw new C6.m();
            }
            byte[] bArr = new byte[48];
            this.f22164a.c().nextBytes(bArr);
            bArr[0] = 3;
            bArr[1] = 3;
            return bArr;
        }
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        kotlin.jvm.internal.t.d(keyAgreement);
        if (c2318i == null) {
            throw new A("ECDHE_ECDSA: Encryption info should be provided", null, 2, null);
        }
        keyAgreement.init(c2318i.a());
        keyAgreement.doPhase(c2318i.c(), true);
        byte[] bArrGenerateSecret = keyAgreement.generateSecret();
        kotlin.jvm.internal.t.d(bArrGenerateSecret);
        return bArrGenerateSecret;
    }

    public final p061g6.f t() {
        return (p061g6.f) this.f22169f.getValue();
    }

    public final x u() {
        return this.f22170g;
    }

    public final byte[] v() {
        return (byte[]) this.f22168e.getValue();
    }

    public final y w() {
        return this.f22171h;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0253 A[LOOP:2: B:93:0x022a->B:104:0x0253, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:95:0x0230  */
    /* JADX WARN: Code duplicated, block: B:97:0x023c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0242  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Throwable, kotlin.jvm.internal.k] */
    /* JADX WARN: Type inference failed for: r7v22, types: [f6.F] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.lang.Throwable, kotlin.jvm.internal.k, z6.g] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0088 -> B:16:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object x(G6.d r24) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p052f6.t.x(G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00da  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x011b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c A[PHI: r1
      0x012c: PHI (r1v5 f6.t) = (r1v4 f6.t), (r1v4 f6.t), (r1v16 f6.t) binds: [B:43:0x0119, B:45:0x0129, B:20:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x013d A[PHI: r1
      0x013d: PHI (r1v6 f6.t) = (r1v5 f6.t), (r1v18 f6.t) binds: [B:48:0x013a, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0141  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014f, code lost:
    
        if (r1.F(r2, r9) == r3) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(p052f6.p pVar, Certificate certificate, C2312c c2312c, C2318i c2318i, G6.d dVar) throws NoSuchAlgorithmException, InvalidKeyException, A {
        d dVar2;
        p052f6.p pVar2;
        C2318i c2318i2;
        Certificate certificate2;
        C2311b c2311b;
        t tVar;
        Certificate certificate3;
        Object objD;
        t tVar2;
        C2318i c2318i3;
        byte[] bArrS;
        C2312c c2312c2;
        t tVar3;
        C2311b c2311b2;
        byte[] bArr;
        F f8;
        F f9;
        SecretKeySpec secretKeySpec;
        C2312c c2312c3 = c2312c;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i8 = dVar2.f22191h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.f22191h = i8 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        d dVar3 = dVar2;
        Object obj = dVar3.f22189f;
        Object objF = H6.c.f();
        int i9 = dVar3.f22191h;
        if (i9 == 0) {
            C6.r.b(obj);
            if (c2312c3 != null) {
                dVar3.f22184a = this;
                pVar2 = pVar;
                dVar3.f22185b = pVar2;
                certificate3 = certificate;
                dVar3.f22186c = certificate3;
                dVar3.f22187d = c2312c3;
                c2318i2 = c2318i;
                dVar3.f22188e = c2318i2;
                dVar3.f22191h = 1;
                objD = D(c2312c3, dVar3);
                if (objD != objF) {
                    tVar2 = this;
                }
            } else {
                pVar2 = pVar;
                c2318i2 = c2318i;
                certificate2 = certificate;
                c2311b = null;
                tVar = this;
                c2318i3 = c2318i2;
                bArrS = tVar.s(c2318i3);
                dVar3.f22184a = tVar;
                dVar3.f22185b = c2312c3;
                dVar3.f22186c = c2311b;
                dVar3.f22187d = bArrS;
                dVar3.f22188e = null;
                dVar3.f22191h = 2;
                if (tVar.H(pVar2, certificate2, bArrS, c2318i3, dVar3) != objF) {
                    c2312c2 = c2312c3;
                    tVar3 = tVar;
                    c2311b2 = c2311b;
                    bArr = bArrS;
                    f8 = tVar3.serverHello;
                    if (f8 == null) {
                        kotlin.jvm.internal.t.t("serverHello");
                        f8 = null;
                    }
                    SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArr, f8.a().f().c());
                    byte[] bArr2 = tVar3.f22167d;
                    f9 = tVar3.serverHello;
                    if (f9 == null) {
                        kotlin.jvm.internal.t.t("serverHello");
                        f9 = null;
                    }
                    tVar3.masterSecret = p052f6.l.g(secretKeySpec2, bArr2, f9.c());
                    C0933m.t(bArr, (byte) 0, 0, 0, 6, null);
                    if (c2311b2 != null) {
                        dVar3.f22184a = tVar3;
                        dVar3.f22185b = null;
                        dVar3.f22186c = null;
                        dVar3.f22187d = null;
                        dVar3.f22191h = 3;
                        if (tVar3.E(c2312c2, c2311b2, dVar3) != objF) {
                            dVar3.f22184a = tVar3;
                            dVar3.f22185b = null;
                            dVar3.f22186c = null;
                            dVar3.f22187d = null;
                            dVar3.f22191h = 4;
                            if (tVar3.C(dVar3) != objF) {
                                secretKeySpec = tVar3.masterSecret;
                                if (secretKeySpec == null) {
                                    kotlin.jvm.internal.t.t("masterSecret");
                                    secretKeySpec = null;
                                }
                                dVar3.f22184a = null;
                                dVar3.f22191h = 5;
                            }
                        }
                    } else {
                        dVar3.f22184a = tVar3;
                        dVar3.f22185b = null;
                        dVar3.f22186c = null;
                        dVar3.f22187d = null;
                        dVar3.f22191h = 4;
                        if (tVar3.C(dVar3) != objF) {
                            secretKeySpec = tVar3.masterSecret;
                            if (secretKeySpec == null) {
                                kotlin.jvm.internal.t.t("masterSecret");
                                secretKeySpec = null;
                            }
                            dVar3.f22184a = null;
                            dVar3.f22191h = 5;
                        }
                    }
                }
            }
            return objF;
        }
        if (i9 == 1) {
            C2318i c2318i4 = (C2318i) dVar3.f22188e;
            C2312c c2312c4 = (C2312c) dVar3.f22187d;
            Certificate certificate4 = (Certificate) dVar3.f22186c;
            p052f6.p pVar3 = (p052f6.p) dVar3.f22185b;
            tVar2 = (t) dVar3.f22184a;
            C6.r.b(obj);
            c2318i2 = c2318i4;
            c2312c3 = c2312c4;
            certificate3 = certificate4;
            objD = obj;
            pVar2 = pVar3;
        } else {
            if (i9 == 2) {
                byte[] bArr3 = (byte[]) dVar3.f22187d;
                c2311b2 = (C2311b) dVar3.f22186c;
                c2312c2 = (C2312c) dVar3.f22185b;
                t tVar4 = (t) dVar3.f22184a;
                C6.r.b(obj);
                bArr = bArr3;
                tVar3 = tVar4;
                f8 = tVar3.serverHello;
                if (f8 == null) {
                    kotlin.jvm.internal.t.t("serverHello");
                    f8 = null;
                }
                SecretKeySpec secretKeySpec3 = new SecretKeySpec(bArr, f8.a().f().c());
                byte[] bArr4 = tVar3.f22167d;
                f9 = tVar3.serverHello;
                if (f9 == null) {
                    kotlin.jvm.internal.t.t("serverHello");
                    f9 = null;
                }
                tVar3.masterSecret = p052f6.l.g(secretKeySpec3, bArr4, f9.c());
                C0933m.t(bArr, (byte) 0, 0, 0, 6, null);
                if (c2311b2 != null) {
                    dVar3.f22184a = tVar3;
                    dVar3.f22185b = null;
                    dVar3.f22186c = null;
                    dVar3.f22187d = null;
                    dVar3.f22191h = 3;
                    if (tVar3.E(c2312c2, c2311b2, dVar3) != objF) {
                        dVar3.f22184a = tVar3;
                        dVar3.f22185b = null;
                        dVar3.f22186c = null;
                        dVar3.f22187d = null;
                        dVar3.f22191h = 4;
                        if (tVar3.C(dVar3) != objF) {
                            secretKeySpec = tVar3.masterSecret;
                            if (secretKeySpec == null) {
                                kotlin.jvm.internal.t.t("masterSecret");
                                secretKeySpec = null;
                            }
                            dVar3.f22184a = null;
                            dVar3.f22191h = 5;
                        }
                    }
                } else {
                    dVar3.f22184a = tVar3;
                    dVar3.f22185b = null;
                    dVar3.f22186c = null;
                    dVar3.f22187d = null;
                    dVar3.f22191h = 4;
                    if (tVar3.C(dVar3) != objF) {
                        secretKeySpec = tVar3.masterSecret;
                        if (secretKeySpec == null) {
                            kotlin.jvm.internal.t.t("masterSecret");
                            secretKeySpec = null;
                        }
                        dVar3.f22184a = null;
                        dVar3.f22191h = 5;
                    }
                }
                return objF;
            }
            if (i9 == 3) {
                tVar3 = (t) dVar3.f22184a;
                C6.r.b(obj);
                dVar3.f22184a = tVar3;
                dVar3.f22185b = null;
                dVar3.f22186c = null;
                dVar3.f22187d = null;
                dVar3.f22191h = 4;
                if (tVar3.C(dVar3) != objF) {
                    secretKeySpec = tVar3.masterSecret;
                    if (secretKeySpec == null) {
                        kotlin.jvm.internal.t.t("masterSecret");
                        secretKeySpec = null;
                    }
                    dVar3.f22184a = null;
                    dVar3.f22191h = 5;
                }
                return objF;
            }
            if (i9 == 4) {
                tVar3 = (t) dVar3.f22184a;
                C6.r.b(obj);
                secretKeySpec = tVar3.masterSecret;
                if (secretKeySpec == null) {
                    kotlin.jvm.internal.t.t("masterSecret");
                    secretKeySpec = null;
                }
                dVar3.f22184a = null;
                dVar3.f22191h = 5;
            } else {
                if (i9 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
        }
        return G.f1419a;
        c2311b = (C2311b) objD;
        certificate2 = certificate3;
        tVar = tVar2;
        c2318i3 = c2318i2;
        bArrS = tVar.s(c2318i3);
        dVar3.f22184a = tVar;
        dVar3.f22185b = c2312c3;
        dVar3.f22186c = c2311b;
        dVar3.f22187d = bArrS;
        dVar3.f22188e = null;
        dVar3.f22191h = 2;
        if (tVar.H(pVar2, certificate2, bArrS, c2318i3, dVar3) != objF) {
            c2312c2 = c2312c3;
            tVar3 = tVar;
            c2311b2 = c2311b;
            bArr = bArrS;
            f8 = tVar3.serverHello;
            if (f8 == null) {
                kotlin.jvm.internal.t.t("serverHello");
                f8 = null;
            }
            SecretKeySpec secretKeySpec4 = new SecretKeySpec(bArr, f8.a().f().c());
            byte[] bArr5 = tVar3.f22167d;
            f9 = tVar3.serverHello;
            if (f9 == null) {
                kotlin.jvm.internal.t.t("serverHello");
                f9 = null;
            }
            tVar3.masterSecret = p052f6.l.g(secretKeySpec4, bArr5, f9.c());
            C0933m.t(bArr, (byte) 0, 0, 0, 6, null);
            if (c2311b2 != null) {
                dVar3.f22184a = tVar3;
                dVar3.f22185b = null;
                dVar3.f22186c = null;
                dVar3.f22187d = null;
                dVar3.f22191h = 3;
                if (tVar3.E(c2312c2, c2311b2, dVar3) != objF) {
                    dVar3.f22184a = tVar3;
                    dVar3.f22185b = null;
                    dVar3.f22186c = null;
                    dVar3.f22187d = null;
                    dVar3.f22191h = 4;
                    if (tVar3.C(dVar3) != objF) {
                        secretKeySpec = tVar3.masterSecret;
                        if (secretKeySpec == null) {
                            kotlin.jvm.internal.t.t("masterSecret");
                            secretKeySpec = null;
                        }
                        dVar3.f22184a = null;
                        dVar3.f22191h = 5;
                    }
                }
            } else {
                dVar3.f22184a = tVar3;
                dVar3.f22185b = null;
                dVar3.f22186c = null;
                dVar3.f22187d = null;
                dVar3.f22191h = 4;
                if (tVar3.C(dVar3) != objF) {
                    secretKeySpec = tVar3.masterSecret;
                    if (secretKeySpec == null) {
                        kotlin.jvm.internal.t.t("masterSecret");
                        secretKeySpec = null;
                    }
                    dVar3.f22184a = null;
                    dVar3.f22191h = 5;
                }
            }
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b4 A[Catch: all -> 0x0068, TryCatch #3 {all -> 0x0068, blocks: (B:27:0x0064, B:43:0x00ac, B:45:0x00b4, B:46:0x00ba, B:32:0x0076), top: B:70:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [f6.h] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [f6.h] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Object z(G6.d dVar) throws Throwable {
        h hVar;
        ?? r8;
        C2317h c2317hB;
        int i8;
        t tVar;
        t tVar2;
        F f8;
        ?? r9;
        t tVar3;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i9 = hVar.f22210g;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                hVar.f22210g = i9 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object obj = hVar.f22208e;
        Object objF = H6.c.f();
        int i10 = hVar.f22210g;
        ?? r10 = 1;
        try {
            if (i10 == 0) {
                C6.r.b(obj);
                c2317hB = C2317h.b(this.f22166c);
                try {
                    c2317hB.z();
                    hVar.f22204a = this;
                    hVar.f22205b = c2317hB;
                    i8 = 0;
                    hVar.f22207d = 0;
                    hVar.f22210g = 1;
                    if (G(hVar) != objF) {
                        tVar = this;
                    }
                    return objF;
                } catch (Throwable th) {
                    r8 = c2317hB;
                    th = th;
                    r8.close();
                    throw th;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i8 = hVar.f22207d;
                    tVar2 = (t) hVar.f22206c;
                    C2317h c2317h = (C2317h) hVar.f22205b;
                    tVar = (t) hVar.f22204a;
                    C6.r.b(obj);
                    r10 = c2317h;
                    tVar2.serverHello = (F) obj;
                    f8 = tVar.serverHello;
                    if (f8 == null) {
                        kotlin.jvm.internal.t.t("serverHello");
                        f8 = null;
                    }
                    tVar.J(f8);
                    hVar.f22204a = tVar;
                    hVar.f22205b = r10;
                    hVar.f22206c = null;
                    hVar.f22207d = i8;
                    hVar.f22210g = 3;
                    if (tVar.x(hVar) != objF) {
                        r9 = r10;
                        tVar3 = tVar;
                        hVar.f22204a = r9;
                        hVar.f22205b = null;
                        hVar.f22207d = i8;
                        hVar.f22210g = 4;
                        if (tVar3.A(hVar) != objF) {
                            r8 = r9;
                            G g8 = G.f1419a;
                            r8.close();
                            return G.f1419a;
                        }
                    }
                    return objF;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r8 = (C2317h) hVar.f22204a;
                    try {
                        C6.r.b(obj);
                        r8 = r8;
                        G g9 = G.f1419a;
                        r8.close();
                        return G.f1419a;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            r8.close();
                        } catch (Throwable th3) {
                            p205x6.l.a(th, th3);
                        }
                        throw th;
                    }
                }
                i8 = hVar.f22207d;
                r9 = (C2317h) hVar.f22205b;
                tVar3 = (t) hVar.f22204a;
                try {
                    C6.r.b(obj);
                    r9 = r9;
                    hVar.f22204a = r9;
                    hVar.f22205b = null;
                    hVar.f22207d = i8;
                    hVar.f22210g = 4;
                    if (tVar3.A(hVar) != objF) {
                        r8 = r9;
                        G g10 = G.f1419a;
                        r8.close();
                        return G.f1419a;
                    }
                    return objF;
                } catch (Throwable th4) {
                    th = th4;
                    r8 = r9;
                    r8.close();
                    throw th;
                }
            }
            i8 = hVar.f22207d;
            C2317h c2317h2 = (C2317h) hVar.f22205b;
            tVar = (t) hVar.f22204a;
            C6.r.b(obj);
            c2317hB = c2317h2;
            hVar.f22204a = tVar;
            hVar.f22205b = c2317hB;
            hVar.f22206c = tVar;
            hVar.f22207d = i8;
            hVar.f22210g = 2;
            Object objB = tVar.B(hVar);
            if (objB != objF) {
                r10 = c2317hB;
                obj = objB;
                tVar2 = tVar;
                tVar2.serverHello = (F) obj;
                f8 = tVar.serverHello;
                if (f8 == null) {
                    kotlin.jvm.internal.t.t("serverHello");
                    f8 = null;
                }
                tVar.J(f8);
                hVar.f22204a = tVar;
                hVar.f22205b = r10;
                hVar.f22206c = null;
                hVar.f22207d = i8;
                hVar.f22210g = 3;
                if (tVar.x(hVar) != objF) {
                    r9 = r10;
                    tVar3 = tVar;
                    hVar.f22204a = r9;
                    hVar.f22205b = null;
                    hVar.f22207d = i8;
                    hVar.f22210g = 4;
                    if (tVar3.A(hVar) != objF) {
                        r8 = r9;
                        G g11 = G.f1419a;
                        r8.close();
                        return G.f1419a;
                    }
                }
            }
            return objF;
        } catch (Throwable th5) {
            th = th5;
            r8 = r10;
        }
    }
}
