package p046f0;

import C6.G;
import C6.r;
import H6.c;
import I6.l;
import L0.i;
import Q6.o;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1789i;
import p017b7.J;
import p073i0.d;
import p073i0.e;
import p073i0.j;
import p073i0.m;

/* JADX INFO: renamed from: f0.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2292u extends i.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f21498n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d f21499o;

    /* JADX INFO: renamed from: f0.u$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f21501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f21502c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, j jVar, G6.d dVar) {
            super(2, dVar);
            this.f21501b = mVar;
            this.f21502c = jVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new a(this.f21501b, this.f21502c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f21500a;
            if (i8 == 0) {
                r.b(obj);
                m mVar = this.f21501b;
                j jVar = this.f21502c;
                this.f21500a = 1;
                if (mVar.b(jVar, this) == objF) {
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

    public C2292u(m mVar) {
        this.f21498n = mVar;
    }

    private final void d2() {
        d dVar;
        m mVar = this.f21498n;
        if (mVar != null && (dVar = this.f21499o) != null) {
            mVar.a(new e(dVar));
        }
        this.f21499o = null;
    }

    public final void e2(m mVar, j jVar) {
        if (K1()) {
            AbstractC1789i.d(D1(), null, null, new a(mVar, jVar, null), 3, null);
        } else {
            mVar.a(jVar);
        }
    }

    public final void f2(boolean z8) {
        m mVar = this.f21498n;
        if (mVar != null) {
            if (!z8) {
                d dVar = this.f21499o;
                if (dVar != null) {
                    e2(mVar, new e(dVar));
                    this.f21499o = null;
                    return;
                }
                return;
            }
            d dVar2 = this.f21499o;
            if (dVar2 != null) {
                e2(mVar, new e(dVar2));
                this.f21499o = null;
            }
            d dVar3 = new d();
            e2(mVar, dVar3);
            this.f21499o = dVar3;
        }
    }

    public final void g2(m mVar) {
        if (t.c(this.f21498n, mVar)) {
            return;
        }
        d2();
        this.f21498n = mVar;
    }
}
