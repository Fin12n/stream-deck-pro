package p085j3;

import java.util.List;
import java.util.Locale;
import p004a3.C1705k;
import p067h3.j;
import p067h3.k;
import p067h3.l;
import p076i3.c;
import p076i3.h;
import p076i3.i;
import p103l3.C2658j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f28204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1705k f28205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f28207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f28208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f28209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f28210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f28211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f28212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f28213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f28214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f28215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f28216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f28217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f28218o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f28219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f28220q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f28221r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p067h3.b f28222s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f28223t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f28224u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f28225v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p076i3.a f28226w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C2658j f28227x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h f28228y;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<c> list, C1705k c1705k, String str, long j8, a aVar, long j9, String str2, List<i> list2, l lVar, int i8, int i9, int i10, float f8, float f9, float f10, float f11, j jVar, k kVar, List<p130o3.a> list3, b bVar, p067h3.b bVar2, boolean z8, p076i3.a aVar2, C2658j c2658j, h hVar) {
        this.f28204a = list;
        this.f28205b = c1705k;
        this.f28206c = str;
        this.f28207d = j8;
        this.f28208e = aVar;
        this.f28209f = j9;
        this.f28210g = str2;
        this.f28211h = list2;
        this.f28212i = lVar;
        this.f28213j = i8;
        this.f28214k = i9;
        this.f28215l = i10;
        this.f28216m = f8;
        this.f28217n = f9;
        this.f28218o = f10;
        this.f28219p = f11;
        this.f28220q = jVar;
        this.f28221r = kVar;
        this.f28223t = list3;
        this.f28224u = bVar;
        this.f28222s = bVar2;
        this.f28225v = z8;
        this.f28226w = aVar2;
        this.f28227x = c2658j;
        this.f28228y = hVar;
    }

    public h a() {
        return this.f28228y;
    }

    public p076i3.a b() {
        return this.f28226w;
    }

    public C1705k c() {
        return this.f28205b;
    }

    public C2658j d() {
        return this.f28227x;
    }

    public long e() {
        return this.f28207d;
    }

    public List f() {
        return this.f28223t;
    }

    public a g() {
        return this.f28208e;
    }

    public List h() {
        return this.f28211h;
    }

    public b i() {
        return this.f28224u;
    }

    public String j() {
        return this.f28206c;
    }

    public long k() {
        return this.f28209f;
    }

    public float l() {
        return this.f28219p;
    }

    public float m() {
        return this.f28218o;
    }

    public String n() {
        return this.f28210g;
    }

    public List o() {
        return this.f28204a;
    }

    public int p() {
        return this.f28215l;
    }

    public int q() {
        return this.f28214k;
    }

    public int r() {
        return this.f28213j;
    }

    public float s() {
        return this.f28217n / this.f28205b.e();
    }

    public j t() {
        return this.f28220q;
    }

    public String toString() {
        return z("");
    }

    public k u() {
        return this.f28221r;
    }

    public p067h3.b v() {
        return this.f28222s;
    }

    public float w() {
        return this.f28216m;
    }

    public l x() {
        return this.f28212i;
    }

    public boolean y() {
        return this.f28225v;
    }

    public String z(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j());
        sb.append("\n");
        e eVarU = this.f28205b.u(k());
        if (eVarU != null) {
            sb.append("\t\tParents: ");
            sb.append(eVarU.j());
            e eVarU2 = this.f28205b.u(eVarU.k());
            while (eVarU2 != null) {
                sb.append("->");
                sb.append(eVarU2.j());
                eVarU2 = this.f28205b.u(eVarU2.k());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!h().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(h().size());
            sb.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.f28204a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : this.f28204a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
