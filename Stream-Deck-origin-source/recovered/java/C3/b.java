package C3;

import D6.r;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f1260f = new d(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f1261g = r.q(new h(), new C0054b(), new c(), new f(), new g(), new i(), new j(), new k(), new l(), new m(), new n(), new o());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f1266e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        TOP,
        BOTTOM,
        CENTER;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ J6.a f1271e = J6.b.a(a());
    }

    /* JADX INFO: renamed from: C3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0054b extends b {
        public C0054b() {
            super("camouflage", p154r3.h.f32480c, p154r3.h.f32484e, p154r3.h.f32482d, null, 16, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends b {
        public c() {
            super("circuit", p154r3.h.f32486f, p154r3.h.f32490h, p154r3.h.f32488g, a.TOP, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {
        public /* synthetic */ d(AbstractC2633k abstractC2633k) {
            this();
        }

        public final b a(String id) {
            Object next;
            t.g(id, "id");
            Iterator it = b().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!t.c(((b) next).b(), id));
            b bVar = (b) next;
            return bVar == null ? new h() : bVar;
        }

        public final List b() {
            return b.f1261g;
        }

        public d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final File f1272h;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(File file) {
            t.g(file, "file");
            String name = file.getName();
            t.f(name, "getName(...)");
            super(name, 0, 0, 0, null, 16, null);
            this.f1272h = file;
        }

        public final File f() {
            return this.f1272h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends b {
        public f() {
            super("desert", p154r3.h.f32492i, p154r3.h.f32496k, p154r3.h.f32494j, null, 16, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends b {
        public g() {
            super("doodle", p154r3.h.f32497l, p154r3.h.f32499n, p154r3.h.f32498m, null, 16, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends b {
        public h() {
            super("elgato", p154r3.h.f32500o, p154r3.h.f32502q, p154r3.h.f32501p, null, 16, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends b {
        public i() {
            super("galactic", p154r3.h.f32503r, p154r3.h.f32505t, p154r3.h.f32504s, null, 16, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends b {
        public j() {
            super("lagoon", p154r3.h.f32506u, p154r3.h.f32508w, p154r3.h.f32507v, null, 16, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends b {
        public k() {
            super("landscape", p154r3.h.f32509x, p154r3.h.f32511z, p154r3.h.f32510y, null, 16, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends b {
        public l() {
            super("mecha", p154r3.h.f32450A, p154r3.h.f32452C, p154r3.h.f32451B, null, 16, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends b {
        public m() {
            super("mochi", p154r3.h.f32453D, p154r3.h.f32455F, p154r3.h.f32454E, a.BOTTOM, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends b {
        public n() {
            super("ornate", p154r3.h.f32456G, p154r3.h.f32458I, p154r3.h.f32457H, null, 16, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends b {
        public o() {
            super("twilight", p154r3.h.f32459J, p154r3.h.f32461L, p154r3.h.f32460K, null, 16, null);
        }
    }

    public /* synthetic */ b(String str, int i8, int i9, int i10, a aVar, AbstractC2633k abstractC2633k) {
        this(str, i8, i9, i10, aVar);
    }

    public final String b() {
        return this.f1262a;
    }

    public final a c() {
        return this.f1266e;
    }

    public final int d() {
        return this.f1265d;
    }

    public final int e(long j8) {
        return Math.max(A1.r.g(j8), A1.r.f(j8)) <= 932 ? this.f1263b : this.f1264c;
    }

    public b(String str, int i8, int i9, int i10, a aVar) {
        this.f1262a = str;
        this.f1263b = i8;
        this.f1264c = i9;
        this.f1265d = i10;
        this.f1266e = aVar;
    }

    public /* synthetic */ b(String str, int i8, int i9, int i10, a aVar, int i11, AbstractC2633k abstractC2633k) {
        this(str, i8, i9, i10, (i11 & 16) != 0 ? a.CENTER : aVar, null);
    }
}
