package com.elgato.streamdeck;

import A5.o;
import C5.d;
import C5.f;
import C5.g;
import C5.h;
import C6.G;
import C6.InterfaceC0919h;
import C6.r;
import X6.l;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.InterfaceC2636n;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p035d7.yY.JrkbXHtbgnbib;
import p063h.e;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends p063h.b implements p063h.c {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ l[] f17651F = {K.f(new D(MainActivity.class, "injector", "getInjector()Lio/jentz/winter/delegate/Injector;", 0)), K.f(new D(MainActivity.class, "graph", "getGraph()Lio/jentz/winter/Graph;", 0)), K.f(new D(MainActivity.class, "scope", "getScope()Lkotlinx/coroutines/CoroutineScope;", 0)), K.f(new D(MainActivity.class, "mainViewModel", "getMainViewModel()Lcom/elgato/streamdeck/MainViewModel;", 0))};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f17652G = 8;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public e f17653D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final AtomicBoolean f17654E;
    public final d graph$delegate;
    public final f injector$delegate = g.a(o.f855d, this, f17651F[0]);
    public final d mainViewModel$delegate;
    public final d scope$delegate;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a implements R1.d.InterfaceC0261d, InterfaceC2636n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f17655a;

        public a(AtomicBoolean atomicBoolean) {
            this.f17655a = atomicBoolean;
        }

        @Override // kotlin.jvm.internal.InterfaceC2636n
        public final InterfaceC0919h a() {
            return new C2639q(0, this.f17655a, AtomicBoolean.class, com.amazon.a.a.o.b.au, "get()Z", 0);
        }

        @Override // R1.d.InterfaceC0261d
        public final boolean b() {
            return this.f17655a.get();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof R1.d.InterfaceC0261d) && (obj instanceof InterfaceC2636n)) {
                return t.c(a(), ((InterfaceC2636n) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17656a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bundle f17658c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Bundle bundle, G6.d dVar) {
            super(2, dVar);
            this.f17658c = bundle;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return MainActivity.this.new b(this.f17658c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f17656a;
            if (i8 == 0) {
                r.b(obj);
                p154r3.d dVarD0 = MainActivity.this.D0();
                Bundle bundle = this.f17658c;
                this.f17656a = 1;
                if (dVarD0.i(bundle, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            MainActivity.this.F0();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.o {
        public c() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1517006520, i8, -1, "com.elgato.streamdeck.MainActivity.setContent.<anonymous> (MainActivity.kt:72)");
            }
            AbstractC3182v.a(DiKt.d().c(D5.a.a(MainActivity.this.B0())), p154r3.a.f32339a.a(), interfaceC3163l, 56);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public MainActivity() {
        f fVarC0 = C0();
        h hVar = new h(new A5.a(A5.h.class, false, null, null), null);
        fVarC0.a().add(hVar);
        this.graph$delegate = hVar;
        f fVarC1 = C0();
        h hVar2 = new h(new A5.a(J.class, false, null, null), null);
        fVarC1.a().add(hVar2);
        this.scope$delegate = hVar2;
        f fVarC2 = C0();
        h hVar3 = new h(new A5.a(p154r3.d.class, false, null, null), null);
        fVarC2.a().add(hVar3);
        this.mainViewModel$delegate = hVar3;
        this.f17654E = new AtomicBoolean(true);
    }

    public final A5.h B0() {
        return (A5.h) this.graph$delegate.c(this, f17651F[1]);
    }

    public final f C0() {
        return this.injector$delegate.b(this, f17651F[0]);
    }

    public final p154r3.d D0() {
        return (p154r3.d) this.mainViewModel$delegate.c(this, f17651F[3]);
    }

    public final J E0() {
        return (J) this.scope$delegate.c(this, f17651F[2]);
    }

    public final void F0() {
        p018c.e.b(this, null, H0.c.c(-1517006520, true, new c()), 1, null);
        this.f17654E.set(false);
    }

    @Override // p111m2.ActivityC2686k, p009b.ActivityC1747j, H1.f, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, InvocationTargetException {
        JrkbXHtbgnbib.jIokrrlFAKwfFQq.invoke(null, this, bundle);
    }

    @Override // p009b.ActivityC1747j, H1.f, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        t.g(outState, "outState");
        super.onSaveInstanceState(outState);
        D0().m(outState);
    }
}
