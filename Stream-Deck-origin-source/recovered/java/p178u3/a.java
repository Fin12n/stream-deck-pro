package p178u3;

import A5.h;
import C6.G;
import C6.v;
import H3.e;
import Q6.o;
import V3.c;
import V3.d;
import V3.f;
import V3.g;
import V3.i;
import com.elgato.streamdeck.DiKt;
import io.jentz.winter.js.HRHLwtyqJWz;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: u3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C0780a extends C2639q implements Function0 {
        public final void h() {
            ((O3.b) this.receiver).a();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            h();
            return G.f1419a;
        }

        public C0780a(Object obj) {
            super(0, obj, O3.b.class, HRHLwtyqJWz.XXrkspNpIhCRyM, "dismiss()V", 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O3.b f34495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f34496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f34497c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(O3.b bVar, int i8, int i9) {
            super(2);
            this.f34495a = bVar;
            this.f34496b = i8;
            this.f34497c = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            a.a(this.f34495a, interfaceC3163l, F0.a(this.f34496b | 1), this.f34497c);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(O3.b bVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1487498551);
        if ((i8 & 14) == 0) {
            i10 = (((i9 & 1) == 0 && interfaceC3163lP.R(bVar)) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i10 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) != 0 && !interfaceC3163lP.F()) {
                interfaceC3163lP.z();
                if ((i9 & 1) != 0) {
                    i10 &= -15;
                }
            } else if ((i9 & 1) != 0) {
                interfaceC3163lP.f(1853070191);
                A5.a aVar = new A5.a(O3.b.class, false, null, null);
                h hVar = (h) interfaceC3163lP.e(DiKt.d());
                interfaceC3163lP.f(1468160259);
                Object objG = interfaceC3163lP.g();
                if (objG == InterfaceC3163l.f38803a.a()) {
                    objG = hVar.h(aVar, null);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                interfaceC3163lP.N();
                bVar = (O3.b) objG;
                i10 &= -15;
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1487498551, i10, -1, "com.elgato.streamdeck.errors.ErrorAlert (ErrorAlert.kt:16)");
            }
            O3.a aVar2 = (O3.a) p137p2.a.b(bVar.b(), null, null, null, interfaceC3163lP, 8, 7).getValue();
            if (aVar2 != null) {
                String strE = aVar2.e();
                if (strE == null) {
                    strE = "Error";
                }
                e.b(b(strE, aVar2.b(), aVar2.a()), interfaceC3163lP, 8);
                if (aVar2.a() != null && aVar2.e() != null) {
                    Throwable thA = aVar2.a();
                    t.e(thA, "null cannot be cast to non-null type kotlin.Throwable");
                    f.b(new g.c(thA));
                }
                interfaceC3163lP.f(1628699311);
                boolean z8 = (((i10 & 14) ^ 6) > 4 && interfaceC3163lP.R(bVar)) || (i10 & 6) == 4;
                Object objG2 = interfaceC3163lP.g();
                if (z8 || objG2 == InterfaceC3163l.f38803a.a()) {
                    objG2 = new C0780a(bVar);
                    interfaceC3163lP.H(objG2);
                }
                interfaceC3163lP.N();
                J3.h.b((Function0) ((X6.h) objG2), null, null, aVar2.d(), aVar2.b(), null, null, false, interfaceC3163lP, 0, 230);
                interfaceC3163lP = interfaceC3163lP;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(bVar, i8, i9));
        }
    }

    public static final i b(String str, String str2, Throwable th) {
        String strB;
        String strA;
        String message;
        c.a aVar = c.f10602a;
        c.d dVar = c.d.ERROR_ALERT;
        C6.o oVarA = v.a(com.amazon.a.a.o.b.f16718S, str);
        C6.o oVarA2 = v.a("message", str2);
        String str3 = "-1";
        if (th == null || (strB = defpackage.a.b(th)) == null) {
            strB = "-1";
        }
        C6.o oVarA3 = v.a("type", strB);
        if (th == null || (strA = defpackage.a.a(th)) == null) {
            strA = "-1";
        }
        C6.o oVarA4 = v.a("code", strA);
        if (th != null && (message = th.getMessage()) != null) {
            str3 = message;
        }
        return d.c(aVar, dVar, oVarA, oVarA2, oVarA3, oVarA4, v.a(com.amazon.a.a.o.b.f16728c, str3));
    }
}
