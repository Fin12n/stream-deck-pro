package S0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: S0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1626a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f9601b = new d(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1626a f9602c = new C0266a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1626a f9603d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1626a f9604e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f9605a;

    /* JADX INFO: renamed from: S0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0266a extends AbstractC1626a {
        public C0266a(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Bradford";
        }
    }

    /* JADX INFO: renamed from: S0.a$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends AbstractC1626a {
        public b(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "Ciecat02";
        }
    }

    /* JADX INFO: renamed from: S0.a$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends AbstractC1626a {
        public c(float[] fArr) {
            super(fArr, null);
        }

        public String toString() {
            return "VonKries";
        }
    }

    /* JADX INFO: renamed from: S0.a$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {
        public /* synthetic */ d(AbstractC2633k abstractC2633k) {
            this();
        }

        public final AbstractC1626a a() {
            return AbstractC1626a.f9602c;
        }

        public d() {
        }
    }

    public /* synthetic */ AbstractC1626a(float[] fArr, AbstractC2633k abstractC2633k) {
        this(fArr);
    }

    public final float[] b() {
        return this.f9605a;
    }

    public AbstractC1626a(float[] fArr) {
        this.f9605a = fArr;
    }
}
