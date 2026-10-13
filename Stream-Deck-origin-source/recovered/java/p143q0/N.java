package p143q0;

import L0.h;
import L0.i;
import Q6.k;
import Q6.p;
import Z0.b;
import android.view.KeyEvent;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.u;
import p159s0.I;
import p159s0.L;
import p176u1.D;
import p176u1.M;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V f31452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ I f31453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ M f31454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f31455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f31456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ D f31457f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b0 f31458g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k f31459h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f31460i;

        /* JADX INFO: renamed from: q0.N$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C0675a extends C2639q implements k {
            public C0675a(Object obj) {
                super(1, obj, M.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            }

            public final Boolean h(KeyEvent keyEvent) {
                return Boolean.valueOf(((M) this.receiver).l(keyEvent));
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return h(((b) obj).f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V v8, I i8, M m8, boolean z8, boolean z9, D d8, b0 b0Var, k kVar, int i9) {
            super(3);
            this.f31452a = v8;
            this.f31453b = i8;
            this.f31454c = m8;
            this.f31455d = z8;
            this.f31456e = z9;
            this.f31457f = d8;
            this.f31458g = b0Var;
            this.f31459h = kVar;
            this.f31460i = i9;
        }

        public final i b(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(2057323757);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(2057323757, i8, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
            }
            interfaceC3163l.f(-492369756);
            Object objG = interfaceC3163l.g();
            InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
            if (objG == aVar.a()) {
                objG = new L();
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            L l8 = (L) objG;
            interfaceC3163l.f(-492369756);
            Object objG2 = interfaceC3163l.g();
            if (objG2 == aVar.a()) {
                objG2 = new C2810j();
                interfaceC3163l.H(objG2);
            }
            interfaceC3163l.N();
            i iVarA = androidx.compose.ui.input.key.a.a(i.f4836a, new C0675a(new M(this.f31452a, this.f31453b, this.f31454c, this.f31455d, this.f31456e, l8, this.f31457f, this.f31458g, (C2810j) objG2, null, this.f31459h, this.f31460i, 512, null)));
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return iVarA;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final i a(i iVar, V v8, I i8, M m8, k kVar, boolean z8, boolean z9, D d8, b0 b0Var, int i9) {
        return h.b(iVar, null, new a(v8, i8, m8, z8, z9, d8, b0Var, kVar, i9), 1, null);
    }
}
