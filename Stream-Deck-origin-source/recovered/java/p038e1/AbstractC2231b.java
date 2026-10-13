package p038e1;

import Q6.o;
import kotlin.jvm.internal.C2639q;

/* JADX INFO: renamed from: e1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2231b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2241l f20445a = new C2241l(a.f20447a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2241l f20446b = new C2241l(C0471b.f20448a);

    /* JADX INFO: renamed from: e1.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a extends C2639q implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20447a = new a();

        public a() {
            super(2, S6.a.class, "min", "min(II)I", 1);
        }

        public final Integer h(int i8, int i9) {
            return Integer.valueOf(Math.min(i8, i9));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return h(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: renamed from: e1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C0471b extends C2639q implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0471b f20448a = new C0471b();

        public C0471b() {
            super(2, S6.a.class, "max", "max(II)I", 1);
        }

        public final Integer h(int i8, int i9) {
            return Integer.valueOf(Math.max(i8, i9));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return h(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    public static final C2241l a() {
        return f20445a;
    }

    public static final C2241l b() {
        return f20446b;
    }

    public static final int c(AbstractC2230a abstractC2230a, int i8, int i9) {
        return ((Number) abstractC2230a.a().invoke(Integer.valueOf(i8), Integer.valueOf(i9))).intValue();
    }
}
