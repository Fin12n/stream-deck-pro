package I5;

import C6.G;
import C6.m;
import C6.r;
import G6.d;
import G6.g;
import H5.h;
import I6.l;
import Q6.o;
import Q6.p;
import X5.C1674c;
import X5.InterfaceC1684m;
import io.ktor.utils.io.C;
import io.ktor.utils.io.j;
import io.ktor.utils.io.q;
import kotlin.jvm.internal.t;
import p007a6.c;
import p017b7.C1802o0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f3780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f3781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.ktor.utils.io.g f3782d;

    /* JADX INFO: renamed from: I5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0142a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3784b;

        public C0142a(d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            C0142a c0142a = a.this.new C0142a(dVar);
            c0142a.f3784b = obj;
            return c0142a;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C c8, d dVar) {
            return ((C0142a) create(c8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f3783a;
            if (i8 == 0) {
                r.b(obj);
                C c8 = (C) this.f3784b;
                c.e eVar = (c.e) a.this.f3779a;
                j jVarMo220e = c8.mo220e();
                this.f3783a = 1;
                if (eVar.d(jVarMo220e, this) == objF) {
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

    public a(c delegate, g callContext, p listener) {
        io.ktor.utils.io.g gVarMo219e;
        t.g(delegate, "delegate");
        t.g(callContext, "callContext");
        t.g(listener, "listener");
        this.f3779a = delegate;
        this.f3780b = callContext;
        this.f3781c = listener;
        if (delegate instanceof c.a) {
            gVarMo219e = io.ktor.utils.io.d.a(((c.a) delegate).d());
        } else {
            if (delegate instanceof c.AbstractC0337c) {
                throw new h(delegate);
            }
            if (delegate instanceof c.b) {
                gVarMo219e = io.ktor.utils.io.g.f25425a.a();
            } else if (delegate instanceof c.d) {
                gVarMo219e = ((c.d) delegate).d();
            } else {
                if (!(delegate instanceof c.e)) {
                    throw new m();
                }
                gVarMo219e = q.e(C1802o0.f15975a, callContext, true, new C0142a(null)).mo219e();
            }
        }
        this.f3782d = gVarMo219e;
    }

    @Override // p007a6.c
    public Long a() {
        return this.f3779a.a();
    }

    @Override // p007a6.c
    public C1674c b() {
        return this.f3779a.b();
    }

    @Override // p007a6.c
    public InterfaceC1684m c() {
        return this.f3779a.c();
    }

    @Override // a6.c.d
    public io.ktor.utils.io.g d() {
        return V5.a.a(this.f3782d, this.f3780b, a(), this.f3781c);
    }
}
