package p110m1;

import C6.G;
import D6.z;
import Q6.o;
import java.util.List;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f29573a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f29574b = u.b("ContentDescription", a.f29599a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f29575c = u.a("StateDescription");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f29576d = u.a("ProgressBarRangeInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f29577e = u.b("PaneTitle", e.f29603a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w f29578f = u.a("SelectableGroup");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w f29579g = u.a("CollectionInfo");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final w f29580h = u.a("CollectionItemInfo");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final w f29581i = u.a("Heading");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final w f29582j = u.a("Disabled");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final w f29583k = u.a("LiveRegion");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final w f29584l = u.a("Focused");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final w f29585m = u.a("IsTraversalGroup");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w f29586n = new w("InvisibleToUser", b.f29600a);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final w f29587o = u.b("TraversalIndex", i.f29607a);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final w f29588p = u.a("HorizontalScrollAxisRange");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final w f29589q = u.a("VerticalScrollAxisRange");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final w f29590r = u.b("IsPopup", d.f29602a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final w f29591s = u.b("IsDialog", c.f29601a);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final w f29592t = u.b("Role", f.f29604a);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final w f29593u = new w("TestTag", false, g.f29605a);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final w f29594v = u.b("Text", h.f29606a);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final w f29595w = new w("TextSubstitution", null, 2, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final w f29596x = new w("IsShowingTextSubstitution", null, 2, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final w f29597y = u.a("EditableText");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final w f29598z = u.a("TextSelectionRange");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final w f29566A = u.a("ImeAction");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final w f29567B = u.a("Selected");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final w f29568C = u.a("ToggleableState");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final w f29569D = u.a("Password");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final w f29570E = u.a("Error");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final w f29571F = new w("IndexForKey", null, 2, null);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f29572G = 8;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29599a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List list2) {
            List listU0;
            if (list == null || (listU0 = z.U0(list)) == null) {
                return list2;
            }
            listU0.addAll(list2);
            return listU0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f29601a = new c();

        public c() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G invoke(G g8, G g9) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f29602a = new d();

        public d() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G invoke(G g8, G g9) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f29603a = new e();

        public e() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f29606a = new h();

        public h() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List list2) {
            List listU0;
            if (list == null || (listU0 = z.U0(list)) == null) {
                return list2;
            }
            listU0.addAll(list2);
            return listU0;
        }
    }

    public final w A() {
        return f29598z;
    }

    public final w B() {
        return f29595w;
    }

    public final w C() {
        return f29568C;
    }

    public final w D() {
        return f29587o;
    }

    public final w E() {
        return f29589q;
    }

    public final w a() {
        return f29579g;
    }

    public final w b() {
        return f29580h;
    }

    public final w c() {
        return f29574b;
    }

    public final w d() {
        return f29582j;
    }

    public final w e() {
        return f29597y;
    }

    public final w f() {
        return f29570E;
    }

    public final w g() {
        return f29584l;
    }

    public final w h() {
        return f29581i;
    }

    public final w i() {
        return f29588p;
    }

    public final w j() {
        return f29566A;
    }

    public final w k() {
        return f29571F;
    }

    public final w l() {
        return f29586n;
    }

    public final w m() {
        return f29591s;
    }

    public final w n() {
        return f29590r;
    }

    public final w o() {
        return f29596x;
    }

    public final w p() {
        return f29585m;
    }

    public final w q() {
        return f29583k;
    }

    public final w r() {
        return f29577e;
    }

    public final w s() {
        return f29569D;
    }

    public final w t() {
        return f29576d;
    }

    public final w u() {
        return f29592t;
    }

    public final w v() {
        return f29578f;
    }

    public final w w() {
        return f29567B;
    }

    public final w x() {
        return f29575c;
    }

    public final w y() {
        return f29593u;
    }

    public final w z() {
        return f29594v;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29600a = new b();

        public b() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G invoke(G g8, G g9) {
            return g8;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f29604a = new f();

        public f() {
            super(2);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((p110m1.h) obj, ((p110m1.h) obj2).n());
        }

        public final p110m1.h b(p110m1.h hVar, int i8) {
            return hVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f29605a = new g();

        public g() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f29607a = new i();

        public i() {
            super(2);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((Float) obj, ((Number) obj2).floatValue());
        }

        public final Float b(Float f8, float f9) {
            return f8;
        }
    }
}
