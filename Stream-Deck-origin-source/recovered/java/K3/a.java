package K3;

import C6.G;
import Q6.o;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3160j0;
import p215z0.InterfaceC3163l;
import p215z0.P0;
import p215z0.X0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: K3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0168a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4607a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0168a(int i8) {
            super(0);
            this.f4607a = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3160j0 invoke() {
            return X0.a(this.f4607a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f4610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f4611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f4612e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8, int i9, String str, int i10, int i11) {
            super(2);
            this.f4608a = i8;
            this.f4609b = i9;
            this.f4610c = str;
            this.f4611d = i10;
            this.f4612e = i11;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            a.a(this.f4608a, this.f4609b, this.f4610c, interfaceC3163l, F0.a(this.f4611d | 1), this.f4612e);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(int i8, int i9, String text, InterfaceC3163l interfaceC3163l, int i10, int i11) {
        int i12;
        t.g(text, "text");
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1891398147);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (interfaceC3163lP.i(i8) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            i12 |= ((i11 & 2) == 0 && interfaceC3163lP.i(i9)) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= interfaceC3163lP.R(text) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            interfaceC3163lP.o();
            if ((i10 & 1) != 0 && !interfaceC3163lP.F()) {
                interfaceC3163lP.z();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                i12 &= -113;
                i9 = i8;
            }
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1891398147, i12, -1, "com.elgato.streamdeck.ui.helper.A11yAnnounceValueChange (A11yAnnounceValueChange.kt:15)");
            }
            Object[] objArr = new Object[0];
            interfaceC3163lP.f(-2093684800);
            boolean z8 = (((i12 & 112) ^ 48) > 32 && interfaceC3163lP.i(i9)) || (i12 & 48) == 32;
            Object objG = interfaceC3163lP.g();
            if (z8 || objG == InterfaceC3163l.f38803a.a()) {
                objG = new C0168a(i9);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            InterfaceC3160j0 interfaceC3160j0 = (InterfaceC3160j0) I0.b.b(objArr, null, null, (Function0) objG, interfaceC3163lP, 8, 6);
            if (interfaceC3160j0.f() != i8) {
                ((View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j())).announceForAccessibility(text);
                interfaceC3160j0.p(i8);
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        int i13 = i9;
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(i8, i13, text, i10, i11));
        }
    }
}
