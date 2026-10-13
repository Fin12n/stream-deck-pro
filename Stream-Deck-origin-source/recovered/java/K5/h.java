package K5;

import C6.G;
import C6.m;
import M5.v;
import Q6.o;
import X5.C1693w;
import X5.InterfaceC1684m;
import Z6.w;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.u;
import p017b7.C1797m;
import u7.InterfaceC3045e;
import u7.t;
import u7.x;
import u7.y;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4717a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.SPDY_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y.HTTP_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[y.H2_PRIOR_KNOWLEDGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[y.QUIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f4717a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3045e f4718a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3045e interfaceC3045e) {
            super(1);
            this.f4718a = interfaceC3045e;
        }

        public final void b(Throwable th) {
            this.f4718a.cancel();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements InterfaceC1684m {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f4719c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t f4720d;

        public c(t tVar) {
            this.f4720d = tVar;
        }

        @Override // p115m6.B
        public Set a() {
            return this.f4720d.t().entrySet();
        }

        @Override // p115m6.B
        public boolean b() {
            return this.f4719c;
        }

        @Override // p115m6.B
        public List c(String name) {
            kotlin.jvm.internal.t.g(name, "name");
            List listY = this.f4720d.y(name);
            if (listY.isEmpty()) {
                return null;
            }
            return listY;
        }

        @Override // p115m6.B
        public boolean contains(String str) {
            return InterfaceC1684m.b.a(this, str);
        }

        @Override // p115m6.B
        public String d(String str) {
            return InterfaceC1684m.b.c(this, str);
        }

        @Override // p115m6.B
        public void e(o oVar) {
            InterfaceC1684m.b.b(this, oVar);
        }

        @Override // p115m6.B
        public Set names() {
            return this.f4720d.o();
        }
    }

    public static final Object b(x xVar, z zVar, T5.e eVar, G6.d dVar) {
        C1797m c1797m = new C1797m(H6.b.c(dVar), 1);
        c1797m.z();
        InterfaceC3045e interfaceC3045eE = xVar.E(zVar);
        interfaceC3045eE.t(new K5.b(eVar, c1797m));
        c1797m.J(new b(interfaceC3045eE));
        Object objS = c1797m.s();
        if (objS == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objS;
    }

    public static final InterfaceC1684m c(t tVar) {
        kotlin.jvm.internal.t.g(tVar, "<this>");
        return new c(tVar);
    }

    public static final C1693w d(y yVar) {
        kotlin.jvm.internal.t.g(yVar, "<this>");
        switch (a.f4717a[yVar.ordinal()]) {
            case 1:
                return C1693w.f11972d.b();
            case 2:
                return C1693w.f11972d.c();
            case 3:
                return C1693w.f11972d.f();
            case 4:
                return C1693w.f11972d.d();
            case 5:
                return C1693w.f11972d.d();
            case 6:
                return C1693w.f11972d.e();
            default:
                throw new m();
        }
    }

    public static final boolean e(IOException iOException) {
        String message = iOException.getMessage();
        return message != null && w.K(message, "connect", true);
    }

    public static final Throwable f(T5.e eVar, IOException iOException) {
        if (iOException instanceof i) {
            Throwable cause = iOException.getCause();
            return cause == null ? iOException : cause;
        }
        if (iOException instanceof SocketTimeoutException) {
            return e(iOException) ? v.a(eVar, iOException) : v.c(eVar, iOException);
        }
        return iOException;
    }
}
