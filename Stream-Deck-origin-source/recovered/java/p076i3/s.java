package p076i3;

import android.graphics.Paint;
import java.util.List;
import p004a3.C1705k;
import p004a3.J;
import p022c3.t;
import p067h3.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class s implements p076i3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p067h3.b f24702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f24703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p067h3.a f24704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f24705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p067h3.b f24706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f24707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f24708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f24709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f24710j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f24712b;

        static {
            int[] iArr = new int[c.values().length];
            f24712b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24712b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24712b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f24711a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24711a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24711a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap b() {
            int i8 = a.f24711a[ordinal()];
            if (i8 != 1) {
                return i8 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join b() {
            int i8 = a.f24712b[ordinal()];
            if (i8 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i8 == 2) {
                return Paint.Join.MITER;
            }
            if (i8 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public s(String str, p067h3.b bVar, List<p067h3.b> list, p067h3.a aVar, d dVar, p067h3.b bVar2, b bVar3, c cVar, float f8, boolean z8) {
        this.f24701a = str;
        this.f24702b = bVar;
        this.f24703c = list;
        this.f24704d = aVar;
        this.f24705e = dVar;
        this.f24706f = bVar2;
        this.f24707g = bVar3;
        this.f24708h = cVar;
        this.f24709i = f8;
        this.f24710j = z8;
    }

    @Override // p076i3.c
    public p022c3.c a(J j8, C1705k c1705k, p085j3.b bVar) {
        return new t(j8, bVar, this);
    }

    public b b() {
        return this.f24707g;
    }

    public p067h3.a c() {
        return this.f24704d;
    }

    public p067h3.b d() {
        return this.f24702b;
    }

    public c e() {
        return this.f24708h;
    }

    public List f() {
        return this.f24703c;
    }

    public float g() {
        return this.f24709i;
    }

    public String h() {
        return this.f24701a;
    }

    public d i() {
        return this.f24705e;
    }

    public p067h3.b j() {
        return this.f24706f;
    }

    public boolean k() {
        return this.f24710j;
    }
}
