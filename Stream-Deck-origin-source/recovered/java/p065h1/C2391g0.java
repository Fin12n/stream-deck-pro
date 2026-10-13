package p065h1;

import C6.G;
import G6.d;
import I6.l;
import J0.AbstractC1028k;
import Q6.k;
import Q6.o;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p017b7.K;
import p035d7.g;
import p035d7.j;

/* JADX INFO: renamed from: h1.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2391g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2391g0 f24284a = new C2391g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f24285b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f24286c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f24287d = 8;

    /* JADX INFO: renamed from: h1.g0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f24288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f24289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f24291d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, d dVar) {
            super(2, dVar);
            this.f24291d = gVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new a(this.f24291d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0037 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0040 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:17:0x0038). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = H6.c.f()
                int r1 = r5.f24290c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r5.f24289b
                d7.i r1 = (p035d7.i) r1
                java.lang.Object r3 = r5.f24288a
                d7.x r3 = (p035d7.x) r3
                C6.r.b(r6)     // Catch: java.lang.Throwable -> L17
                goto L38
            L17:
                r6 = move-exception
                goto L5d
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                C6.r.b(r6)
                d7.g r3 = r5.f24291d
                d7.i r6 = r3.iterator()     // Catch: java.lang.Throwable -> L17
                r1 = r6
            L2b:
                r5.f24288a = r3     // Catch: java.lang.Throwable -> L17
                r5.f24289b = r1     // Catch: java.lang.Throwable -> L17
                r5.f24290c = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L17
                if (r6 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L17
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L17
                if (r6 == 0) goto L54
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L17
                C6.G r6 = (C6.G) r6     // Catch: java.lang.Throwable -> L17
                java.util.concurrent.atomic.AtomicBoolean r6 = p065h1.C2391g0.a()     // Catch: java.lang.Throwable -> L17
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L17
                J0.k$a r6 = J0.AbstractC1028k.f3974e     // Catch: java.lang.Throwable -> L17
                r6.k()     // Catch: java.lang.Throwable -> L17
                goto L2b
            L54:
                C6.G r6 = C6.G.f1419a     // Catch: java.lang.Throwable -> L17
                r6 = 0
                p035d7.m.a(r3, r6)
                C6.G r6 = C6.G.f1419a
                return r6
            L5d:
                throw r6     // Catch: java.lang.Throwable -> L5e
            L5e:
                r0 = move-exception
                p035d7.m.a(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p065h1.C2391g0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: h1.g0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f24292a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar) {
            super(1);
            this.f24292a = gVar;
        }

        public final void b(Object obj) {
            if (C2391g0.f24286c.compareAndSet(false, true)) {
                this.f24292a.m(G.f1419a);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return G.f1419a;
        }
    }

    public final void b() {
        if (f24285b.compareAndSet(false, true)) {
            g gVarB = j.b(1, null, null, 6, null);
            AbstractC1789i.d(K.a(K.f24114m.b()), null, null, new a(gVarB, null), 3, null);
            AbstractC1028k.f3974e.i(new b(gVarB));
        }
    }
}
