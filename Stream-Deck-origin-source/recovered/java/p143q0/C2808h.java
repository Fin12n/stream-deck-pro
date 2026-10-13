package p143q0;

import C6.G;
import H0.c;
import Q6.o;
import Q6.p;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: renamed from: q0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2808h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2808h f31673a = new C2808h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p f31674b = c.c(671295101, false, a.f31675a);

    /* JADX INFO: renamed from: q0.h$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31675a = new a();

        public a() {
            super(3);
        }

        public final void b(o oVar, InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 14) == 0) {
                i8 |= interfaceC3163l.l(oVar) ? 4 : 2;
            }
            if ((i8 & 91) == 18 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(671295101, i8, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:212)");
            }
            oVar.invoke(interfaceC3163l, Integer.valueOf(i8 & 14));
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((o) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    public final p a() {
        return f31674b;
    }
}
