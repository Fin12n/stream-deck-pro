package p011b1;

import C6.G;
import L0.h;
import L0.i;
import Q6.k;
import Q6.p;
import android.view.MotionEvent;
import kotlin.jvm.internal.u;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q f15692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f15693b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Q q8, k kVar) {
            super(1);
            this.f15692a = q8;
            this.f15693b = kVar;
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("pointerInteropFilter");
            c2403m0.a().b("requestDisallowInterceptTouchEvent", this.f15692a);
            c2403m0.a().b("onTouchEvent", this.f15693b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f15694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q f15695b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, Q q8) {
            super(3);
            this.f15694a = kVar;
            this.f15695b = q8;
        }

        public final i b(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(374375707);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(374375707, i8, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:78)");
            }
            interfaceC3163l.f(-492369756);
            Object objG = interfaceC3163l.g();
            if (objG == InterfaceC3163l.f38803a.a()) {
                objG = new J();
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            J j8 = (J) objG;
            j8.s(this.f15694a);
            j8.u(this.f15695b);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return j8;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D1.c f15696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(D1.c cVar) {
            super(1);
            this.f15696a = cVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = this.f15696a.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    zDispatchTouchEvent = this.f15696a.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    public static final i a(i iVar, D1.c cVar) {
        J j8 = new J();
        j8.s(new c(cVar));
        Q q8 = new Q();
        j8.u(q8);
        cVar.setOnRequestDisallowInterceptTouchEvent$ui_release(q8);
        return iVar.j(j8);
    }

    public static final i b(i iVar, Q q8, k kVar) {
        return h.a(iVar, AbstractC2401l0.c() ? new a(q8, kVar) : AbstractC2401l0.a(), new b(kVar, q8));
    }

    public static /* synthetic */ i c(i iVar, Q q8, k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            q8 = null;
        }
        return b(iVar, q8, kVar);
    }
}
