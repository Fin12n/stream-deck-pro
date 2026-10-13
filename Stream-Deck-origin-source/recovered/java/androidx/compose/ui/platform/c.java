package androidx.compose.ui.platform;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p128o1.E;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.compose.ui.platform.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static c f14897f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E f14900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14895d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f14896e = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p216z1.i f14898g = p216z1.i.Rtl;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p216z1.i f14899h = p216z1.i.Ltr;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final c a() {
            if (c.f14897f == null) {
                c.f14897f = new c(null);
            }
            c cVar = c.f14897f;
            t.e(cVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return cVar;
        }

        public a() {
        }
    }

    public /* synthetic */ c(AbstractC2633k abstractC2633k) {
        this();
    }

    @Override // p065h1.InterfaceC2380b
    public int[] a(int i8) {
        int iQ;
        if (d().length() <= 0 || i8 >= d().length()) {
            return null;
        }
        if (i8 < 0) {
            E e8 = this.f14900c;
            if (e8 == null) {
                t.t("layoutResult");
                e8 = null;
            }
            iQ = e8.q(0);
        } else {
            E e9 = this.f14900c;
            if (e9 == null) {
                t.t("layoutResult");
                e9 = null;
            }
            int iQ2 = e9.q(i8);
            iQ = i(iQ2, f14898g) == i8 ? iQ2 : iQ2 + 1;
        }
        E e10 = this.f14900c;
        if (e10 == null) {
            t.t("layoutResult");
            e10 = null;
        }
        if (iQ >= e10.n()) {
            return null;
        }
        return c(i(iQ, f14898g), i(iQ, f14899h) + 1);
    }

    @Override // p065h1.InterfaceC2380b
    public int[] b(int i8) {
        int iQ;
        if (d().length() <= 0 || i8 <= 0) {
            return null;
        }
        if (i8 > d().length()) {
            E e8 = this.f14900c;
            if (e8 == null) {
                t.t("layoutResult");
                e8 = null;
            }
            iQ = e8.q(d().length());
        } else {
            E e9 = this.f14900c;
            if (e9 == null) {
                t.t("layoutResult");
                e9 = null;
            }
            int iQ2 = e9.q(i8);
            iQ = i(iQ2, f14899h) + 1 == i8 ? iQ2 : iQ2 - 1;
        }
        if (iQ < 0) {
            return null;
        }
        return c(i(iQ, f14898g), i(iQ, f14899h) + 1);
    }

    public final int i(int i8, p216z1.i iVar) {
        E e8 = this.f14900c;
        E e9 = null;
        if (e8 == null) {
            t.t("layoutResult");
            e8 = null;
        }
        int iU = e8.u(i8);
        E e10 = this.f14900c;
        if (e10 == null) {
            t.t("layoutResult");
            e10 = null;
        }
        if (iVar != e10.y(iU)) {
            E e11 = this.f14900c;
            if (e11 == null) {
                t.t("layoutResult");
            } else {
                e9 = e11;
            }
            return e9.u(i8);
        }
        E e12 = this.f14900c;
        if (e12 == null) {
            t.t("layoutResult");
            e12 = null;
        }
        return E.p(e12, i8, false, 2, null) - 1;
    }

    public final void j(String str, E e8) {
        f(str);
        this.f14900c = e8;
    }

    public c() {
    }
}
