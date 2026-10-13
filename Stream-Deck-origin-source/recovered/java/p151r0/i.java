package p151r0;

import Q0.f;
import kotlin.jvm.functions.Function0;
import p038e1.InterfaceC2247s;
import p143q0.G;
import p159s0.D;
import p159s0.E;
import p159s0.InterfaceC2887i;
import p159s0.t;
import p159s0.v;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2887i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f32243a = f.f9082b.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f32244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f32245c;

        public b(Function0 function0, D d8, long j8) {
            this.f32244b = function0;
            this.f32245c = j8;
        }

        @Override // p159s0.InterfaceC2887i
        public boolean a(long j8, t tVar) {
            InterfaceC2247s interfaceC2247s = (InterfaceC2247s) this.f32244b.invoke();
            if (interfaceC2247s == null || !interfaceC2247s.y()) {
                return false;
            }
            throw null;
        }

        @Override // p159s0.InterfaceC2887i
        public boolean b(long j8) {
            InterfaceC2247s interfaceC2247s = (InterfaceC2247s) this.f32244b.invoke();
            if (interfaceC2247s == null) {
                return true;
            }
            long j9 = this.f32245c;
            if (!interfaceC2247s.y() || !E.b(null, j9)) {
                return false;
            }
            t.f32803a.l();
            throw null;
        }

        @Override // p159s0.InterfaceC2887i
        public boolean c(long j8, t tVar) {
            InterfaceC2247s interfaceC2247s = (InterfaceC2247s) this.f32244b.invoke();
            if (interfaceC2247s == null) {
                return true;
            }
            long j9 = this.f32245c;
            if (interfaceC2247s.y() && E.b(null, j9)) {
                throw null;
            }
            return false;
        }

        @Override // p159s0.InterfaceC2887i
        public void d() {
            throw null;
        }

        @Override // p159s0.InterfaceC2887i
        public boolean e(long j8) {
            InterfaceC2247s interfaceC2247s = (InterfaceC2247s) this.f32244b.invoke();
            if (interfaceC2247s == null || !interfaceC2247s.y()) {
                return false;
            }
            t.f32803a.l();
            throw null;
        }
    }

    public static final L0.i b(D d8, long j8, Function0 function0) {
        a aVar = new a(function0, d8, j8);
        return v.h(L0.i.f4836a, new b(function0, d8, j8), aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements G {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f32239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f32240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f32241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f32242d;

        public a(Function0 function0, D d8, long j8) {
            this.f32241c = function0;
            this.f32242d = j8;
            f.a aVar = f.f9082b;
            this.f32239a = aVar.c();
            this.f32240b = aVar.c();
        }

        @Override // p143q0.G
        public void b(long j8) {
            InterfaceC2247s interfaceC2247s = (InterfaceC2247s) this.f32241c.invoke();
            if (interfaceC2247s != null) {
                if (interfaceC2247s.y()) {
                    t.f32803a.n();
                    throw null;
                }
            } else if (E.b(null, this.f32242d)) {
                this.f32240b = f.f9082b.c();
            }
        }

        @Override // p143q0.G
        public void c() {
            if (E.b(null, this.f32242d)) {
                throw null;
            }
        }

        @Override // p143q0.G
        public void e(long j8) {
            InterfaceC2247s interfaceC2247s = (InterfaceC2247s) this.f32241c.invoke();
            if (interfaceC2247s != null) {
                long j9 = this.f32242d;
                if (interfaceC2247s.y() && E.b(null, j9)) {
                    long jT = f.t(this.f32240b, j8);
                    this.f32240b = jT;
                    f.t(this.f32239a, jT);
                    t.f32803a.k();
                    throw null;
                }
            }
        }

        @Override // p143q0.G
        public void onCancel() {
            if (E.b(null, this.f32242d)) {
                throw null;
            }
        }

        @Override // p143q0.G
        public void d() {
        }

        @Override // p143q0.G
        public void a(long j8) {
        }
    }
}
