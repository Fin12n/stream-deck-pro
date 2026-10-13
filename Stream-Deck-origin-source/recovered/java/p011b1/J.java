package p011b1;

import C6.G;
import Q0.f;
import Q6.k;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p038e1.InterfaceC2247s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class J implements G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f15678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Q f15679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F f15681e = new b();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends F {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f15686b = a.Unknown;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ J f15688a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(J j8) {
                super(1);
                this.f15688a = j8;
            }

            public final void b(MotionEvent motionEvent) {
                this.f15688a.p().invoke(motionEvent);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((MotionEvent) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: b1.J$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0392b extends u implements k {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ J f15690b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0392b(J j8) {
                super(1);
                this.f15690b = j8;
            }

            public final void b(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    this.f15690b.p().invoke(motionEvent);
                } else {
                    b.this.f15686b = ((Boolean) this.f15690b.p().invoke(motionEvent)).booleanValue() ? a.Dispatching : a.NotDispatching;
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((MotionEvent) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ J f15691a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(J j8) {
                super(1);
                this.f15691a = j8;
            }

            public final void b(MotionEvent motionEvent) {
                this.f15691a.p().invoke(motionEvent);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((MotionEvent) obj);
                return G.f1419a;
            }
        }

        public b() {
        }

        @Override // p011b1.F
        public boolean c() {
            return true;
        }

        @Override // p011b1.F
        public void d() {
            if (this.f15686b == a.Dispatching) {
                L.a(SystemClock.uptimeMillis(), new c(J.this));
                i();
            }
        }

        @Override // p011b1.F
        public void e(C1766n c1766n, EnumC1768p enumC1768p, long j8) {
            boolean z8;
            List listC = c1766n.c();
            if (J.this.k()) {
                z8 = true;
                break;
            }
            int size = listC.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    z8 = false;
                    break;
                }
                z zVar = (z) listC.get(i8);
                if (AbstractC1767o.b(zVar) || AbstractC1767o.d(zVar)) {
                    z8 = true;
                    break;
                }
                i8++;
            }
            if (this.f15686b != a.NotDispatching) {
                if (enumC1768p == EnumC1768p.Initial && z8) {
                    h(c1766n);
                }
                if (enumC1768p == EnumC1768p.Final && !z8) {
                    h(c1766n);
                }
            }
            if (enumC1768p == EnumC1768p.Final) {
                int size2 = listC.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    if (!AbstractC1767o.d((z) listC.get(i9))) {
                        return;
                    }
                }
                i();
            }
        }

        public final void h(C1766n c1766n) {
            List listC = c1766n.c();
            int size = listC.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (((z) listC.get(i8)).q()) {
                    if (this.f15686b == a.Dispatching) {
                        InterfaceC2247s interfaceC2247sB = b();
                        if (interfaceC2247sB == null) {
                            throw new IllegalStateException("layoutCoordinates not set");
                        }
                        L.b(c1766n, interfaceC2247sB.S(f.f9082b.c()), new a(J.this));
                    }
                    this.f15686b = a.NotDispatching;
                    return;
                }
            }
            InterfaceC2247s interfaceC2247sB2 = b();
            if (interfaceC2247sB2 == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            L.c(c1766n, interfaceC2247sB2.S(f.f9082b.c()), new C0392b(J.this));
            if (this.f15686b == a.Dispatching) {
                int size2 = listC.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    ((z) listC.get(i9)).a();
                }
                C1760h c1760hD = c1766n.d();
                if (c1760hD == null) {
                    return;
                }
                c1760hD.e(!J.this.k());
            }
        }

        public final void i() {
            this.f15686b = a.Unknown;
            J.this.r(false);
        }
    }

    @Override // p011b1.G
    public F i() {
        return this.f15681e;
    }

    public final boolean k() {
        return this.f15680d;
    }

    public final k p() {
        k kVar = this.f15678b;
        if (kVar != null) {
            return kVar;
        }
        t.t("onTouchEvent");
        return null;
    }

    public final void r(boolean z8) {
        this.f15680d = z8;
    }

    public final void s(k kVar) {
        this.f15678b = kVar;
    }

    public final void u(Q q8) {
        Q q9 = this.f15679c;
        if (q9 != null) {
            q9.c(null);
        }
        this.f15679c = q8;
        if (q8 == null) {
            return;
        }
        q8.c(this);
    }
}
