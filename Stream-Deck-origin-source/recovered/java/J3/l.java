package J3;

import C6.G;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p065h1.I0;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f4262a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f4262a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m67invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m67invoke() {
            V3.f.a(l.b());
            p154r3.j.a(this.f4262a, "https://help.elgato.com/hc/sections/360005918272-Elgato-Stream-Deck-Mobile/");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L0.i f4263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4265c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L0.i iVar, int i8, int i9) {
            super(2);
            this.f4263a = iVar;
            this.f4264b = i8;
            this.f4265c = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            l.a(this.f4263a, interfaceC3163l, F0.a(this.f4264b | 1), this.f4265c);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(L0.i iVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        int i10;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1565360121);
        int i11 = i9 & 1;
        if (i11 != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (interfaceC3163lP.R(iVar) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i10 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (i11 != 0) {
                iVar = L0.i.f4836a;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(1565360121, i10, -1, "com.elgato.streamdeck.ui.components.GetHelpButton (GetHelpButton.kt:24)");
            }
            J3.b.a(p194w3.b.f37009c0, I0.a(androidx.compose.foundation.layout.f.h(iVar, 0.0f, 1, null), "help_button"), null, null, null, null, false, new a((Context) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.g())), interfaceC3163lP, 0, 124);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(iVar, i8, i9));
        }
    }

    public static final V3.i b() {
        return new V3.i(new V3.h.a(V3.c.b.HELP_BUTTON_TAPPED.b(), (V3.a) null, (Map) null, 6, (AbstractC2633k) null));
    }
}
