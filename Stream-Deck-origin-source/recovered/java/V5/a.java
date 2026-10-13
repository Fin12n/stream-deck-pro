package V5;

import C6.G;
import I6.l;
import Q6.o;
import Q6.p;
import io.ktor.utils.io.C;
import io.ktor.utils.io.q;
import kotlin.jvm.internal.t;
import p017b7.C1802o0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: V5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0292a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f10723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f10724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f10725d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f10726e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f10727f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f10728g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f10729h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f10730i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f10731j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Long f10732k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.g f10733l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p f10734m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0292a(Long l8, io.ktor.utils.io.g gVar, p pVar, G6.d dVar) {
            super(2, dVar);
            this.f10732k = l8;
            this.f10733l = gVar;
            this.f10734m = pVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            C0292a c0292a = new C0292a(this.f10732k, this.f10733l, this.f10734m, dVar);
            c0292a.f10731j = obj;
            return c0292a;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C c8, G6.d dVar) {
            return ((C0292a) create(c8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00f3 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:64:0x019f, B:40:0x00ed, B:42:0x00f3, B:45:0x010d, B:57:0x016f, B:61:0x0180), top: B:69:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:44:0x010b  */
        /* JADX WARN: Code duplicated, block: B:45:0x010d A[Catch: all -> 0x0022, PHI: r2 r3 r4 r6 r9 r10 r11 r12 r14 r16
          0x010d: PHI (r2v12 java.lang.Object) = (r2v33 java.lang.Object), (r2v19 java.lang.Object) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r3v5 ??) = (r3v24 ??), (r3v10 ??) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r4v5 long) = (r4v6 long), (r4v10 long) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r6v5 long) = (r6v7 long), (r6v10 long) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r9v3 byte[]) = (r9v4 byte[]), (r9v8 byte[]) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r10v2 java.lang.Object) = (r10v6 java.lang.Object), (r10v8 java.lang.Object) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r11v4 Q6.p) = (r11v5 Q6.p), (r11v8 Q6.p) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r12v6 io.ktor.utils.io.g) = (r12v8 io.ktor.utils.io.g), (r12v11 io.ktor.utils.io.g) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r14v2 io.ktor.utils.io.C) = (r14v3 io.ktor.utils.io.C), (r14v6 io.ktor.utils.io.C) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          0x010d: PHI (r16v2 long) = (r16v3 long), (r16v5 long) binds: [B:43:0x0109, B:28:0x00b1] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:9:0x001d, B:64:0x019f, B:40:0x00ed, B:42:0x00f3, B:45:0x010d, B:57:0x016f, B:61:0x0180), top: B:69:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0135  */
        /* JADX WARN: Code duplicated, block: B:53:0x0161  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r3v1, types: [z6.g] */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v14, types: [z6.g] */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v2, types: [z6.g] */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v23 */
        /* JADX WARN: Type inference failed for: r3v24 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8, types: [z6.g] */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0161 -> B:18:0x0059). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 427
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: V5.a.C0292a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final io.ktor.utils.io.g a(io.ktor.utils.io.g gVar, G6.g context, Long l8, p listener) {
        t.g(gVar, "<this>");
        t.g(context, "context");
        t.g(listener, "listener");
        return q.e(C1802o0.f15975a, context, true, new C0292a(l8, gVar, listener, null)).mo219e();
    }
}
