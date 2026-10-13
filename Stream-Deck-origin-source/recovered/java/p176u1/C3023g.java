package p176u1;

import C6.G;
import Q0.h;
import Q6.k;
import R0.B0;
import R0.K;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p011b1.O;
import p128o1.E;

/* JADX INFO: renamed from: u1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3023g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f34424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3038w f34425b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f34431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f34432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public M f34433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public E f34434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public D f34435l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f34437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f34438o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f34426c = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f34436m = b.f34443a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f34439p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f34440q = B0.c(null, 1, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f34441r = new Matrix();

    public C3023g(O o8, InterfaceC3038w interfaceC3038w) {
        this.f34424a = o8;
        this.f34425b = interfaceC3038w;
    }

    public final void a() {
        synchronized (this.f34426c) {
            this.f34433j = null;
            this.f34435l = null;
            this.f34434k = null;
            this.f34436m = a.f34442a;
            this.f34437n = null;
            this.f34438o = null;
            G g8 = G.f1419a;
        }
    }

    public final void b(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        synchronized (this.f34426c) {
            try {
                this.f34429f = z10;
                this.f34430g = z11;
                this.f34431h = z12;
                this.f34432i = z13;
                if (z8) {
                    this.f34428e = true;
                    if (this.f34433j != null) {
                        c();
                    }
                }
                this.f34427d = z9;
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (this.f34425b.b()) {
            this.f34436m.invoke(B0.a(this.f34440q));
            this.f34424a.q(this.f34440q);
            K.a(this.f34441r, this.f34440q);
            InterfaceC3038w interfaceC3038w = this.f34425b;
            CursorAnchorInfo.Builder builder = this.f34439p;
            M m8 = this.f34433j;
            t.d(m8);
            D d8 = this.f34435l;
            t.d(d8);
            E e8 = this.f34434k;
            t.d(e8);
            Matrix matrix = this.f34441r;
            h hVar = this.f34437n;
            t.d(hVar);
            h hVar2 = this.f34438o;
            t.d(hVar2);
            interfaceC3038w.updateCursorAnchorInfo(AbstractC3022f.b(builder, m8, d8, e8, matrix, hVar, hVar2, this.f34429f, this.f34430g, this.f34431h, this.f34432i));
            this.f34428e = false;
        }
    }

    public final void d(M m8, D d8, E e8, k kVar, h hVar, h hVar2) {
        synchronized (this.f34426c) {
            try {
                this.f34433j = m8;
                this.f34435l = d8;
                this.f34434k = e8;
                this.f34436m = kVar;
                this.f34437n = hVar;
                this.f34438o = hVar2;
                if (this.f34428e || this.f34427d) {
                    c();
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u1.g$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34442a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((B0) obj).o());
            return G.f1419a;
        }

        public final void b(float[] fArr) {
        }
    }

    /* JADX INFO: renamed from: u1.g$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f34443a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((B0) obj).o());
            return G.f1419a;
        }

        public final void b(float[] fArr) {
        }
    }
}
