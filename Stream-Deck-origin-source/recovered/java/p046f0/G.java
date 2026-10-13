package p046f0;

import L0.h;
import L0.i;
import Q6.k;
import Q6.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;
import p143q0.nKy.bGZGhbtQmA;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.B0;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f21272a = AbstractC3182v.e(a.f21273a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21273a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final E invoke() {
            return C2289q.f21492a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E f21274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p073i0.k f21275b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(E e8, p073i0.k kVar) {
            super(1);
            this.f21274a = e8;
            this.f21275b = kVar;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return C6.G.f1419a;
        }

        public final void b(C2403m0 c2403m0) {
            String str = bGZGhbtQmA.iUbp;
            c2403m0.b(str);
            c2403m0.a().b(str, this.f21274a);
            c2403m0.a().b("interactionSource", this.f21275b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E f21276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p073i0.k f21277b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(E e8, p073i0.k kVar) {
            super(3);
            this.f21276a = e8;
            this.f21277b = kVar;
        }

        public final i b(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(-353972293);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-353972293, i8, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:108)");
            }
            E e8 = this.f21276a;
            if (e8 == null) {
                e8 = N.f21334a;
            }
            F fA = e8.a(this.f21277b, interfaceC3163l, 0);
            interfaceC3163l.f(1157296644);
            boolean zR = interfaceC3163l.R(fA);
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = new H(fA);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            H h8 = (H) objG;
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return h8;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final B0 a() {
        return f21272a;
    }

    public static final i b(i iVar, p073i0.k kVar, E e8) {
        return h.a(iVar, AbstractC2401l0.c() ? new b(e8, kVar) : AbstractC2401l0.a(), new c(e8, kVar));
    }
}
