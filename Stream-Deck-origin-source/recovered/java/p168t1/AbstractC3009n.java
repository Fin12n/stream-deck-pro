package p168t1;

import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import kotlin.jvm.internal.AbstractC2633k;
import p215z0.q1;

/* JADX INFO: renamed from: t1.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3009n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34080b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N f34081c = new C3004i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final E f34082d = new E("sans-serif", "FontFamily.SansSerif");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final E f34083e = new E("serif", "FontFamily.Serif");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final E f34084f = new E("monospace", "FontFamily.Monospace");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final E f34085g = new E("cursive", "FontFamily.Cursive");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34086a;

    /* JADX INFO: renamed from: t1.n$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final N a() {
            return AbstractC3009n.f34081c;
        }

        public final E b() {
            return AbstractC3009n.f34084f;
        }

        public final E c() {
            return AbstractC3009n.f34082d;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: t1.n$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        q1 b(AbstractC3009n abstractC3009n, C c8, int i8, int i9);

        static /* synthetic */ q1 a(b bVar, AbstractC3009n abstractC3009n, C c8, int i8, int i9, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(yOZfxp.qNNgZM);
            }
            if ((i10 & 1) != 0) {
                abstractC3009n = null;
            }
            if ((i10 & 2) != 0) {
                c8 = C.f33980b.c();
            }
            if ((i10 & 4) != 0) {
                i8 = y.f34112b.b();
            }
            if ((i10 & 8) != 0) {
                i9 = z.f34116b.a();
            }
            return bVar.b(abstractC3009n, c8, i8, i9);
        }
    }

    public /* synthetic */ AbstractC3009n(boolean z8, AbstractC2633k abstractC2633k) {
        this(z8);
    }

    public AbstractC3009n(boolean z8) {
        this.f34086a = z8;
    }
}
