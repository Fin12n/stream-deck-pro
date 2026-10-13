package p009b;

import Q6.k;
import android.content.res.Resources;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15483e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f15487d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: b.H$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0389a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0389a f15488a = new C0389a();

            public C0389a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                t.g(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ H b(a aVar, int i8, int i9, k kVar, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                kVar = C0389a.f15488a;
            }
            return aVar.a(i8, i9, kVar);
        }

        public final H a(int i8, int i9, k detectDarkMode) {
            t.g(detectDarkMode, "detectDarkMode");
            return new H(i8, i9, 0, detectDarkMode, null);
        }

        public a() {
        }
    }

    public /* synthetic */ H(int i8, int i9, int i10, k kVar, AbstractC2633k abstractC2633k) {
        this(i8, i9, i10, kVar);
    }

    public final k a() {
        return this.f15487d;
    }

    public final int b() {
        return this.f15486c;
    }

    public final int c(boolean z8) {
        return z8 ? this.f15485b : this.f15484a;
    }

    public final int d(boolean z8) {
        if (this.f15486c == 0) {
            return 0;
        }
        return z8 ? this.f15485b : this.f15484a;
    }

    public H(int i8, int i9, int i10, k kVar) {
        this.f15484a = i8;
        this.f15485b = i9;
        this.f15486c = i10;
        this.f15487d = kVar;
    }
}
