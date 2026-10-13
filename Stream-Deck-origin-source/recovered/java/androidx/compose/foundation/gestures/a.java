package androidx.compose.foundation.gestures;

import C6.G;
import C6.r;
import L0.i;
import Q6.k;
import Q6.o;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p011b1.N;
import p011b1.z;
import p017b7.J;
import p046f0.S;
import p047f1.l;
import p055g0.B;
import p055g0.I;
import p055g0.InterfaceC2329j;
import p055g0.M;
import p055g0.w;
import p073i0.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f14398a = C0357a.f14405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f14399b = new e(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I f14400c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f14401d = p047f1.e.a(c.f14406a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f14402e = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L0.k f14403f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f14404g = new g();

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0357a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0357a f14405a = new C0357a();

        public C0357a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(z zVar) {
            return Boolean.valueOf(!N.g(zVar.o(), N.f15698a.b()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements L0.k {
        @Override // G6.g.b, G6.g
        public G6.g.b A(G6.g.c cVar) {
            return L0.k.a.b(this, cVar);
        }

        @Override // L0.k
        public float A0() {
            return 1.0f;
        }

        @Override // G6.g
        public G6.g P1(G6.g gVar) {
            return L0.k.a.d(this, gVar);
        }

        @Override // G6.g.b, G6.g
        public G6.g j(G6.g.c cVar) {
            return L0.k.a.c(this, cVar);
        }

        @Override // G6.g.b, G6.g
        public Object t(Object obj, o oVar) {
            return L0.k.a.a(this, obj, oVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f14406a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements w {
        @Override // p055g0.w
        public Object a(I i8, float f8, G6.d dVar) {
            return I6.b.c(0.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14407a;

        public e(G6.d dVar) {
            super(3, dVar);
        }

        public final Object g(J j8, long j9, G6.d dVar) {
            return new e(dVar).invokeSuspend(G.f1419a);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((J) obj, ((Q0.f) obj2).x(), (G6.d) obj3);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f14407a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g implements A1.d {
        @Override // A1.d
        public float getDensity() {
            return 1.0f;
        }

        @Override // A1.l
        public float x0() {
            return 1.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f14408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f14409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14410c;

        public h(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f14409b = obj;
            this.f14410c |= Integer.MIN_VALUE;
            return a.f(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object f(p011b1.InterfaceC1755c r5, G6.d r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.a.h
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.a$h r0 = (androidx.compose.foundation.gestures.a.h) r0
            int r1 = r0.f14410c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14410c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.a$h r0 = new androidx.compose.foundation.gestures.a$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14409b
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f14410c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f14408a
            b1.c r5 = (p011b1.InterfaceC1755c) r5
            C6.r.b(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            C6.r.b(r6)
        L38:
            r0.f14408a = r5
            r0.f14410c = r3
            r6 = 0
            java.lang.Object r6 = p011b1.InterfaceC1755c.r1(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L44
            return r1
        L44:
            b1.n r6 = (p011b1.C1766n) r6
            int r2 = r6.f()
            b1.r$a r4 = p011b1.r.f15774a
            int r4 = r4.f()
            boolean r2 = p011b1.r.i(r2, r4)
            if (r2 == 0) goto L38
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.f(b1.c, G6.d):java.lang.Object");
    }

    public static final L0.k g() {
        return f14403f;
    }

    public static final l h() {
        return f14401d;
    }

    public static final i i(i iVar, M m8, B b8, S s8, boolean z8, boolean z9, w wVar, m mVar, InterfaceC2329j interfaceC2329j) {
        return iVar.j(new ScrollableElement(m8, b8, s8, z8, z9, wVar, mVar, interfaceC2329j));
    }

    public static final i j(i iVar, M m8, B b8, boolean z8, boolean z9, w wVar, m mVar) {
        return k(iVar, m8, b8, null, z8, z9, wVar, mVar, null, 128, null);
    }

    public static /* synthetic */ i k(i iVar, M m8, B b8, S s8, boolean z8, boolean z9, w wVar, m mVar, InterfaceC2329j interfaceC2329j, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z8 = true;
        }
        return i(iVar, m8, b8, s8, z8, (i8 & 16) != 0 ? false : z9, (i8 & 32) != 0 ? null : wVar, (i8 & 64) != 0 ? null : mVar, (i8 & 128) != 0 ? p055g0.J.f22820a.a() : interfaceC2329j);
    }

    public static /* synthetic */ i l(i iVar, M m8, B b8, boolean z8, boolean z9, w wVar, m mVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        boolean z10 = z8;
        if ((i8 & 8) != 0) {
            z9 = false;
        }
        return j(iVar, m8, b8, z10, z9, (i8 & 16) != 0 ? null : wVar, (i8 & 32) != 0 ? null : mVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f implements I {
        @Override // p055g0.I
        public float a(float f8) {
            return f8;
        }
    }
}
