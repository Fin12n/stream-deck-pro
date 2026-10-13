package U5;

import kotlin.jvm.internal.AbstractC2633k;
import p173t6.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends p173t6.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f10209h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f10210i = new h("Before");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f10211j = new h("State");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f10212k = new h("After");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10213g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final h a() {
            return b.f10212k;
        }

        public final h b() {
            return b.f10211j;
        }

        public a() {
        }
    }

    public b() {
        this(false, 1, null);
    }

    @Override // p173t6.d
    public boolean g() {
        return this.f10213g;
    }

    public /* synthetic */ b(boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8);
    }

    public b(boolean z8) {
        super(f10210i, f10211j, f10212k);
        this.f10213g = z8;
    }
}
