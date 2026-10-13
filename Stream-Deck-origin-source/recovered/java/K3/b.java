package K3;

import C6.G;
import Q6.k;
import Q6.o;
import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.H;
import p215z0.I;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f4613a;

        /* JADX INFO: renamed from: K3.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0169a implements H {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f4614a;

            public C0169a(Context context) {
                this.f4614a = context;
            }

            @Override // p215z0.H
            public void d() {
                b.b(p186v3.a.b(this.f4614a), false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(1);
            this.f4613a = context;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(I DisposableEffect) {
            t.g(DisposableEffect, "$this$DisposableEffect");
            b.b(p186v3.a.b(this.f4613a), true);
            return new C0169a(this.f4613a);
        }
    }

    /* JADX INFO: renamed from: K3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0170b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4615a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0170b(int i8) {
            super(2);
            this.f4615a = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            b.a(interfaceC3163l, F0.a(this.f4615a | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-850301110);
        if (i8 == 0 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-850301110, i8, -1, "com.elgato.streamdeck.ui.helper.KeepScreenOn (KeepScreenOn.kt:14)");
            }
            K.a(G.f1419a, new a((Context) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.g())), interfaceC3163lP, 6);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new C0170b(i8));
        }
    }

    public static final void b(Activity activity, boolean z8) {
        t.g(activity, "<this>");
        if (z8) {
            activity.getWindow().addFlags(128);
        } else {
            activity.getWindow().clearFlags(128);
        }
    }
}
