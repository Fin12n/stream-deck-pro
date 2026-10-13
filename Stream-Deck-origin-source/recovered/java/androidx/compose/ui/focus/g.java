package androidx.compose.ui.focus;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.Z;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14622b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f14623c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f14624d = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0.d f14625a = new B0.d(new P0.j[16], 0);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final g a() {
            return g.f14624d;
        }

        public final g b() {
            return g.f14623c;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14626a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(j.j(focusTargetNode));
        }
    }

    public final B0.d d() {
        return this.f14625a;
    }

    public final void e() {
        c();
    }

    public final boolean c() {
        a aVar = f14622b;
        g gVarB = aVar.b();
        String str = BpgIURjN.YhuiE;
        if (this == gVarB) {
            throw new IllegalStateException(str);
        }
        if (this == aVar.a()) {
            throw new IllegalStateException(str);
        }
        if (!this.f14625a.v()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        B0.d dVar = this.f14625a;
        int iS = dVar.s();
        if (iS <= 0) {
            return false;
        }
        Object[] objArrR = dVar.r();
        int i8 = 0;
        boolean z8 = false;
        do {
            P0.j jVar = (P0.j) objArrR[i8];
            int iA = Z.a(1024);
            if (!jVar.I0().K1()) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            B0.d dVar2 = new B0.d(new L0.i.c[16], 0);
            L0.i.c cVarB1 = jVar.I0().B1();
            if (cVarB1 == null) {
                AbstractC2347k.c(dVar2, jVar.I0());
            } else {
                dVar2.d(cVarB1);
            }
            while (dVar2.v()) {
                L0.i.c cVarG = (L0.i.c) dVar2.D(dVar2.s() - 1);
                if ((cVarG.A1() & iA) == 0) {
                    AbstractC2347k.c(dVar2, cVarG);
                } else {
                    while (cVarG != null) {
                        if ((cVarG.F1() & iA) != 0) {
                            B0.d dVar3 = null;
                            while (cVarG != null) {
                                if (cVarG instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) cVarG;
                                    if (focusTargetNode.i2().e() ? j.j(focusTargetNode) : m.k(focusTargetNode, c.f14597b.b(), b.f14626a)) {
                                        z8 = true;
                                        break;
                                    }
                                } else if (((cVarG.F1() & iA) != 0) && (cVarG instanceof AbstractC2348l)) {
                                    int i9 = 0;
                                    for (L0.i.c cVarE2 = ((AbstractC2348l) cVarG).e2(); cVarE2 != null; cVarE2 = cVarE2.B1()) {
                                        if ((cVarE2.F1() & iA) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                cVarG = cVarE2;
                                            } else {
                                                if (dVar3 == null) {
                                                    dVar3 = new B0.d(new L0.i.c[16], 0);
                                                }
                                                if (cVarG != null) {
                                                    dVar3.d(cVarG);
                                                    cVarG = null;
                                                }
                                                dVar3.d(cVarE2);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                cVarG = AbstractC2347k.g(dVar3);
                            }
                            break;
                        }
                        cVarG = cVarG.B1();
                    }
                }
            }
            i8++;
        } while (i8 < iS);
        return z8;
    }
}
