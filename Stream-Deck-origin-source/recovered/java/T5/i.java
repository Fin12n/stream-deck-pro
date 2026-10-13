package T5;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends p173t6.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f9925h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p173t6.h f9926i = new p173t6.h("Before");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p173t6.h f9927j = new p173t6.h("State");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p173t6.h f9928k = new p173t6.h("Monitoring");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p173t6.h f9929l = new p173t6.h("Engine");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p173t6.h f9930m = new p173t6.h("Receive");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9931g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final p173t6.h a() {
            return i.f9929l;
        }

        public final p173t6.h b() {
            return i.f9930m;
        }

        public final p173t6.h c() {
            return i.f9927j;
        }

        public a() {
        }
    }

    public i() {
        this(false, 1, null);
    }

    @Override // p173t6.d
    public boolean g() {
        return this.f9931g;
    }

    public /* synthetic */ i(boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8);
    }

    public i(boolean z8) {
        super(f9926i, f9927j, f9928k, f9929l, f9930m);
        this.f9931g = z8;
    }
}
