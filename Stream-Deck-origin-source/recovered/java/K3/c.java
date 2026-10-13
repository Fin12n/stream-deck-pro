package K3;

import C6.G;
import L0.i;
import Q6.k;
import java.util.Arrays;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p101l1.f;
import p110m1.n;
import p110m1.x;
import p135p0.Dyk.GOKsbdzhLhXAMt;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f4616a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f4616a = str;
        }

        public final void b(x semantics) {
            t.g(semantics, "$this$semantics");
            p110m1.u.M(semantics, this.f4616a);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }
    }

    public static final i a(i iVar, int i8, InterfaceC3163l interfaceC3163l, int i9) {
        t.g(iVar, "<this>");
        interfaceC3163l.f(74190612);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(74190612, i9, -1, "com.elgato.streamdeck.ui.helper.contentDescription (ModifierExt.kt:12)");
        }
        i iVarC = c(iVar, f.b(i8, interfaceC3163l, (i9 >> 3) & 14));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return iVarC;
    }

    public static final i c(i iVar, String text) {
        t.g(iVar, "<this>");
        t.g(text, "text");
        return n.d(iVar, false, new a(text), 1, null);
    }

    public static final i b(i iVar, int i8, Object[] objArr, InterfaceC3163l interfaceC3163l, int i9) {
        t.g(iVar, "<this>");
        t.g(objArr, GOKsbdzhLhXAMt.fKUHmraC);
        interfaceC3163l.f(1421559143);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1421559143, i9, -1, "com.elgato.streamdeck.ui.helper.contentDescription (ModifierExt.kt:16)");
        }
        i iVarC = c(iVar, f.c(i8, Arrays.copyOf(objArr, objArr.length), interfaceC3163l, ((i9 >> 3) & 14) | 64));
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return iVarC;
    }
}
