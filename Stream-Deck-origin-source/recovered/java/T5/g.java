package T5;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends p173t6.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f9911h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p173t6.h f9912i = new p173t6.h("Before");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p173t6.h f9913j = new p173t6.h("State");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p173t6.h f9914k = new p173t6.h("Transform");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p173t6.h f9915l = new p173t6.h("Render");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p173t6.h f9916m = new p173t6.h("Send");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9917g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final p173t6.h a() {
            return g.f9912i;
        }

        public final p173t6.h b() {
            return g.f9915l;
        }

        public final p173t6.h c() {
            return g.f9916m;
        }

        public final p173t6.h d() {
            return g.f9914k;
        }

        public a() {
        }
    }

    public g() {
        this(false, 1, null);
    }

    @Override // p173t6.d
    public boolean g() {
        return this.f9917g;
    }

    public /* synthetic */ g(boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8);
    }

    public g(boolean z8) {
        super(f9912i, f9913j, f9914k, f9915l, f9916m);
        this.f9917g = z8;
    }
}
