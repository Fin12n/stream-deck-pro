package C3;

import C6.G;
import Q6.o;
import R0.C1598l0;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import kotlin.jvm.internal.u;
import p191w0.O;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1257a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static o f1258b = H0.c.c(-591216469, false, C0053a.f1259a);

    /* JADX INFO: renamed from: C3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0053a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0053a f1259a = new C0053a();

        public C0053a() {
            super(2);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-591216469, i8, -1, cFAYKUlMj.ismKbcRRXciqkir);
            }
            O.a(p101l1.c.d(p154r3.h.f32464O, interfaceC3163l, 0), null, androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.e.i(L0.i.f4836a, W3.c.f11463a.g()), A1.h.m(24)), C1598l0.f9405b.f(), interfaceC3163l, 3128, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
    }

    public final o a() {
        return f1258b;
    }
}
