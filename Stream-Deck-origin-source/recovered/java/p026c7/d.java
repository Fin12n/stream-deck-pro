package p026c7;

import C6.G;
import G6.g;
import Q6.k;
import W6.n;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1823z0;
import p017b7.InterfaceC1776b0;
import p017b7.InterfaceC1795l;
import p017b7.K0;
import p017b7.T;
import p017b7.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends e implements T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f16285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f16288f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1795l f16289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f16290b;

        public a(InterfaceC1795l interfaceC1795l, d dVar) {
            this.f16289a = interfaceC1795l;
            this.f16290b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f16289a.C(this.f16290b, G.f1419a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f16292b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable) {
            super(1);
            this.f16292b = runnable;
        }

        public final void b(Throwable th) {
            d.this.f16285c.removeCallbacks(this.f16292b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    public d(Handler handler, String str, boolean z8) {
        super(null);
        this.f16285c = handler;
        this.f16286d = str;
        this.f16287e = z8;
        this.f16288f = z8 ? this : new d(handler, str, true);
    }

    public static final void b2(d dVar, Runnable runnable) {
        dVar.f16285c.removeCallbacks(runnable);
    }

    @Override // p017b7.F
    public void L0(g gVar, Runnable runnable) {
        if (this.f16285c.post(runnable)) {
            return;
        }
        Z1(gVar, runnable);
    }

    public final void Z1(g gVar, Runnable runnable) {
        AbstractC1823z0.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Z.b().L0(gVar, runnable);
    }

    @Override // p017b7.H0
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d o1() {
        return this.f16288f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f16285c == this.f16285c && dVar.f16287e == this.f16287e;
    }

    @Override // p017b7.F
    public boolean g1(g gVar) {
        return (this.f16287e && t.c(Looper.myLooper(), this.f16285c.getLooper())) ? false : true;
    }

    public int hashCode() {
        return System.identityHashCode(this.f16285c) ^ (this.f16287e ? 1231 : 1237);
    }

    @Override // p026c7.e, p017b7.T
    public InterfaceC1776b0 o(long j8, final Runnable runnable, g gVar) {
        if (this.f16285c.postDelayed(runnable, n.h(j8, 4611686018427387903L))) {
            return new InterfaceC1776b0() { // from class: c7.c
                @Override // p017b7.InterfaceC1776b0
                public final void d() {
                    d.b2(this.f16283a, runnable);
                }
            };
        }
        Z1(gVar, runnable);
        return K0.f15903a;
    }

    @Override // p017b7.H0, p017b7.F
    public String toString() {
        String strQ1 = q1();
        if (strQ1 != null) {
            return strQ1;
        }
        String string = this.f16286d;
        if (string == null) {
            string = this.f16285c.toString();
        }
        if (!this.f16287e) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // p017b7.T
    public void w0(long j8, InterfaceC1795l interfaceC1795l) {
        a aVar = new a(interfaceC1795l, this);
        if (this.f16285c.postDelayed(aVar, n.h(j8, 4611686018427387903L))) {
            interfaceC1795l.J(new b(aVar));
        } else {
            Z1(interfaceC1795l.getContext(), aVar);
        }
    }

    public /* synthetic */ d(Handler handler, String str, int i8, AbstractC2633k abstractC2633k) {
        this(handler, (i8 & 2) != 0 ? null : str);
    }

    public d(Handler handler, String str) {
        this(handler, str, false);
    }
}
