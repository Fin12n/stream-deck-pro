package U5;

import kotlin.jvm.internal.AbstractC2633k;
import p173t6.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends p173t6.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f10219h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f10220i = new h("Receive");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f10221j = new h("Parse");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f10222k = new h("Transform");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f10223l = new h("State");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f10224m = new h("After");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10225g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final h a() {
            return f.f10221j;
        }

        public final h b() {
            return f.f10220i;
        }

        public final h c() {
            return f.f10222k;
        }

        public a() {
        }
    }

    public f() {
        this(false, 1, null);
    }

    @Override // p173t6.d
    public boolean g() {
        return this.f10225g;
    }

    public /* synthetic */ f(boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8);
    }

    public f(boolean z8) {
        super(f10220i, f10221j, f10222k, f10223l, f10224m);
        this.f10225g = z8;
    }
}
