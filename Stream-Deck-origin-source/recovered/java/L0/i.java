package L0;

import V.ocy.SVzBK;
import kotlin.jvm.functions.Function0;
import p017b7.AbstractC1823z0;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;
import p056g1.AbstractC2347k;
import p056g1.InterfaceC2346j;
import p056g1.X;
import p056g1.e0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4836a = a.f4837b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b extends i {
        @Override // L0.i
        default boolean a(Q6.k kVar) {
            return ((Boolean) kVar.invoke(this)).booleanValue();
        }

        @Override // L0.i
        default Object b(Object obj, Q6.o oVar) {
            return oVar.invoke(obj, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class c implements InterfaceC2346j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public J f4839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4840c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f4842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f4843f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public e0 f4844g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public X f4845h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f4846i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f4847j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f4848k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f4849l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f4850m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f4838a = this;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4841d = -1;

        public final int A1() {
            return this.f4841d;
        }

        public final c B1() {
            return this.f4843f;
        }

        public final X C1() {
            return this.f4845h;
        }

        public final J D1() {
            J j8 = this.f4839b;
            if (j8 != null) {
                return j8;
            }
            J jA = K.a(AbstractC2347k.l(this).getCoroutineContext().P1(AbstractC1823z0.a((InterfaceC1815v0) AbstractC2347k.l(this).getCoroutineContext().A(InterfaceC1815v0.f15985O))));
            this.f4839b = jA;
            return jA;
        }

        public final boolean E1() {
            return this.f4846i;
        }

        public final int F1() {
            return this.f4840c;
        }

        public final e0 G1() {
            return this.f4844g;
        }

        public final c H1() {
            return this.f4842e;
        }

        @Override // p056g1.InterfaceC2346j
        public final c I0() {
            return this.f4838a;
        }

        public boolean I1() {
            return true;
        }

        public final boolean J1() {
            return this.f4847j;
        }

        public final boolean K1() {
            return this.f4850m;
        }

        public void L1() {
            if (this.f4850m) {
                throw new IllegalStateException("node attached multiple times");
            }
            if (this.f4845h == null) {
                throw new IllegalStateException("attach invoked on a node without a coordinator");
            }
            this.f4850m = true;
            this.f4848k = true;
        }

        public void M1() {
            if (!this.f4850m) {
                throw new IllegalStateException("Cannot detach a node that is not attached");
            }
            if (this.f4848k) {
                throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.f4849l) {
                throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.f4850m = false;
            J j8 = this.f4839b;
            if (j8 != null) {
                K.d(j8, new j());
                this.f4839b = null;
            }
        }

        public void N1() {
        }

        public void O1() {
        }

        public void P1() {
        }

        public void R1() {
            if (!this.f4850m) {
                throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.f4848k) {
                throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.f4848k = false;
            N1();
            this.f4849l = true;
        }

        public void S1() {
            if (!this.f4850m) {
                throw new IllegalStateException("node detached multiple times");
            }
            if (this.f4845h == null) {
                throw new IllegalStateException("detach invoked on a node without a coordinator");
            }
            if (!this.f4849l) {
                throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.f4849l = false;
            O1();
        }

        public final void T1(int i8) {
            this.f4841d = i8;
        }

        public final void U1(c cVar) {
            this.f4838a = cVar;
        }

        public final void V1(c cVar) {
            this.f4843f = cVar;
        }

        public final void W1(boolean z8) {
            this.f4846i = z8;
        }

        public final void X1(int i8) {
            this.f4840c = i8;
        }

        public final void Y1(e0 e0Var) {
            this.f4844g = e0Var;
        }

        public final void Z1(c cVar) {
            this.f4842e = cVar;
        }

        public final void a2(boolean z8) {
            this.f4847j = z8;
        }

        public final void b2(Function0 function0) {
            AbstractC2347k.l(this).r(function0);
        }

        public void c2(X x8) {
            this.f4845h = x8;
        }

        public void Q1() {
            if (!this.f4850m) {
                throw new IllegalStateException(SVzBK.hXKR);
            }
            P1();
        }
    }

    boolean a(Q6.k kVar);

    Object b(Object obj, Q6.o oVar);

    default i j(i iVar) {
        return iVar == f4836a ? this : new f(this, iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a f4837b = new a();

        @Override // L0.i
        public boolean a(Q6.k kVar) {
            return true;
        }

        public String toString() {
            return "Modifier";
        }

        @Override // L0.i
        public i j(i iVar) {
            return iVar;
        }

        @Override // L0.i
        public Object b(Object obj, Q6.o oVar) {
            return obj;
        }
    }
}
