package androidx.compose.ui.platform;

import W6.n;
import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p110m1.o;
import p128o1.E;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d extends androidx.compose.ui.platform.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static d f14903h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E f14906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f14907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Rect f14908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f14901f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f14902g = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p216z1.i f14904i = p216z1.i.Rtl;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p216z1.i f14905j = p216z1.i.Ltr;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final d a() {
            if (d.f14903h == null) {
                d.f14903h = new d(null);
            }
            d dVar = d.f14903h;
            t.e(dVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return dVar;
        }

        public a() {
        }
    }

    public /* synthetic */ d(AbstractC2633k abstractC2633k) {
        this();
    }

    private final int i(int i8, p216z1.i iVar) {
        E e8 = this.f14906c;
        E e9 = null;
        if (e8 == null) {
            t.t("layoutResult");
            e8 = null;
        }
        int iU = e8.u(i8);
        E e10 = this.f14906c;
        if (e10 == null) {
            t.t("layoutResult");
            e10 = null;
        }
        if (iVar != e10.y(iU)) {
            E e11 = this.f14906c;
            if (e11 == null) {
                t.t("layoutResult");
            } else {
                e9 = e11;
            }
            return e9.u(i8);
        }
        E e12 = this.f14906c;
        if (e12 == null) {
            t.t("layoutResult");
            e12 = null;
        }
        return E.p(e12, i8, false, 2, null) - 1;
    }

    @Override // p065h1.InterfaceC2380b
    public int[] a(int i8) {
        int iN;
        E e8 = null;
        if (d().length() <= 0 || i8 >= d().length()) {
            return null;
        }
        try {
            o oVar = this.f14907d;
            if (oVar == null) {
                t.t("node");
                oVar = null;
            }
            int iD = S6.c.d(oVar.i().h());
            int iD2 = n.d(0, i8);
            E e9 = this.f14906c;
            if (e9 == null) {
                t.t("layoutResult");
                e9 = null;
            }
            int iQ = e9.q(iD2);
            E e10 = this.f14906c;
            if (e10 == null) {
                t.t("layoutResult");
                e10 = null;
            }
            float fV = e10.v(iQ) + iD;
            E e11 = this.f14906c;
            if (e11 == null) {
                t.t("layoutResult");
                e11 = null;
            }
            E e12 = this.f14906c;
            if (e12 == null) {
                t.t("layoutResult");
                e12 = null;
            }
            if (fV < e11.v(e12.n() - 1)) {
                E e13 = this.f14906c;
                if (e13 == null) {
                    t.t("layoutResult");
                } else {
                    e8 = e13;
                }
                iN = e8.r(fV);
            } else {
                E e14 = this.f14906c;
                if (e14 == null) {
                    t.t("layoutResult");
                } else {
                    e8 = e14;
                }
                iN = e8.n();
            }
            return c(iD2, i(iN - 1, f14905j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // p065h1.InterfaceC2380b
    public int[] b(int i8) {
        int iR;
        E e8 = null;
        if (d().length() <= 0 || i8 <= 0) {
            return null;
        }
        try {
            o oVar = this.f14907d;
            if (oVar == null) {
                t.t("node");
                oVar = null;
            }
            int iD = S6.c.d(oVar.i().h());
            int iG = n.g(d().length(), i8);
            E e9 = this.f14906c;
            if (e9 == null) {
                t.t("layoutResult");
                e9 = null;
            }
            int iQ = e9.q(iG);
            E e10 = this.f14906c;
            if (e10 == null) {
                t.t("layoutResult");
                e10 = null;
            }
            float fV = e10.v(iQ) - iD;
            if (fV > 0.0f) {
                E e11 = this.f14906c;
                if (e11 == null) {
                    t.t("layoutResult");
                } else {
                    e8 = e11;
                }
                iR = e8.r(fV);
            } else {
                iR = 0;
            }
            if (iG == d().length() && iR < iQ) {
                iR++;
            }
            return c(i(iR, f14904i), iG);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String str, E e8, o oVar) {
        f(str);
        this.f14906c = e8;
        this.f14907d = oVar;
    }

    public d() {
        this.f14908e = new Rect();
    }
}
