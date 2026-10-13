package L;

import A.AbstractC0890p0;
import A.C0864c0;
import C6.G;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k implements C0864c0.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f4773e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0864c0.i f4774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0864c0.j f4777d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final k a(C0864c0.i iVar) {
            return new k(iVar, null);
        }

        public a() {
        }
    }

    public /* synthetic */ k(C0864c0.i iVar, AbstractC2633k abstractC2633k) {
        this(iVar);
    }

    public static final void c(k kVar) {
        synchronized (kVar.f4775b) {
            try {
                if (kVar.f4777d == null) {
                    AbstractC0890p0.l("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                kVar.e();
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final k g(C0864c0.i iVar) {
        return f4773e.a(iVar);
    }

    @Override // A.C0864c0.i
    public void a(long j8, C0864c0.j screenFlashListener) {
        t.g(screenFlashListener, "screenFlashListener");
        synchronized (this.f4775b) {
            this.f4776c = true;
            this.f4777d = screenFlashListener;
            G g8 = G.f1419a;
        }
        C0864c0.i iVar = this.f4774a;
        if (iVar != null) {
            iVar.a(j8, new C0864c0.j() { // from class: L.j
                @Override // A.C0864c0.j
                public final void a() {
                    k.c(this.f4772a);
                }
            });
        } else {
            AbstractC0890p0.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            e();
        }
    }

    @Override // A.C0864c0.i
    public void clear() {
        d();
    }

    public final void d() {
        synchronized (this.f4775b) {
            try {
                if (this.f4776c) {
                    C0864c0.i iVar = this.f4774a;
                    if (iVar != null) {
                        iVar.clear();
                    } else {
                        AbstractC0890p0.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    AbstractC0890p0.l("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.f4776c = false;
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f4775b) {
            try {
                C0864c0.j jVar = this.f4777d;
                if (jVar != null) {
                    jVar.a();
                }
                this.f4777d = null;
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        e();
        d();
    }

    public k(C0864c0.i iVar) {
        this.f4774a = iVar;
        this.f4775b = new Object();
    }
}
