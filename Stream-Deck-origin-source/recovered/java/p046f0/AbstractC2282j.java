package p046f0;

import C6.G;
import L0.i;
import Q6.k;
import Q6.o;
import kotlin.jvm.internal.u;
import p082j0.X;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: renamed from: f0.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2282j {

    /* JADX INFO: renamed from: f0.j$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f21477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f21478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f21479c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, k kVar, int i8) {
            super(2);
            this.f21477a = iVar;
            this.f21478b = kVar;
            this.f21479c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC2282j.a(this.f21477a, this.f21478b, interfaceC3163l, F0.a(this.f21479c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(i iVar, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-932836462);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(iVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.l(kVar) ? 32 : 16;
        }
        if ((i9 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-932836462, i9, -1, "androidx.compose.foundation.Canvas (Canvas.kt:42)");
            }
            X.a(androidx.compose.ui.draw.a.b(iVar, kVar), interfaceC3163lP, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(iVar, kVar, i8));
        }
    }
}
