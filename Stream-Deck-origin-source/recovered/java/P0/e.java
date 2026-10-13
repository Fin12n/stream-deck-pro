package P0;

import C6.G;
import androidx.compose.ui.focus.FocusTargetNode;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p056g1.AbstractC2347k;
import p056g1.AbstractC2348l;
import p056g1.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q6.k f8846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f8847b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f8848c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f8849d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f8850e = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m73invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m73invoke() {
            int i8;
            int i9;
            l lVarK2;
            int i10;
            int i11;
            Set set = e.this.f8849d;
            e eVar = e.this;
            Iterator it = set.iterator();
            while (true) {
                int i12 = 1024;
                int i13 = 16;
                int i14 = 0;
                int i15 = 1;
                if (!it.hasNext()) {
                    e.this.f8849d.clear();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Set<c> set2 = e.this.f8848c;
                    e eVar2 = e.this;
                    for (c cVar : set2) {
                        if (cVar.I0().K1()) {
                            int iA = Z.a(i12);
                            L0.i.c cVarI0 = cVar.I0();
                            int i16 = i14;
                            int i17 = i15;
                            FocusTargetNode focusTargetNode = null;
                            B0.d dVar = null;
                            while (cVarI0 != null) {
                                if (cVarI0 instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarI0;
                                    if (focusTargetNode != null) {
                                        i16 = i15;
                                    }
                                    if (eVar2.f8847b.contains(focusTargetNode2)) {
                                        linkedHashSet.add(focusTargetNode2);
                                        i17 = i14;
                                    }
                                    focusTargetNode = focusTargetNode2;
                                } else if ((cVarI0.F1() & iA) != 0 && (cVarI0 instanceof AbstractC2348l)) {
                                    L0.i.c cVarE2 = ((AbstractC2348l) cVarI0).e2();
                                    int i18 = i14;
                                    while (cVarE2 != null) {
                                        if ((cVarE2.F1() & iA) != 0) {
                                            i18++;
                                            if (i18 == i15) {
                                                cVarI0 = cVarE2;
                                            } else {
                                                if (dVar == null) {
                                                    dVar = new B0.d(new L0.i.c[i13], i14);
                                                }
                                                if (cVarI0 != null) {
                                                    dVar.d(cVarI0);
                                                    cVarI0 = null;
                                                }
                                                dVar.d(cVarE2);
                                            }
                                        }
                                        cVarE2 = cVarE2.B1();
                                        i15 = 1;
                                    }
                                    int i19 = i15;
                                    if (i18 == i19) {
                                        i15 = i19;
                                    }
                                }
                                cVarI0 = AbstractC2347k.g(dVar);
                                i15 = 1;
                            }
                            if (!cVar.I0().K1()) {
                                throw new IllegalStateException("visitChildren called on an unattached node");
                            }
                            B0.d dVar2 = new B0.d(new L0.i.c[i13], i14);
                            L0.i.c cVarB1 = cVar.I0().B1();
                            if (cVarB1 == null) {
                                AbstractC2347k.c(dVar2, cVar.I0());
                            } else {
                                dVar2.d(cVarB1);
                            }
                            while (dVar2.v()) {
                                L0.i.c cVarG = (L0.i.c) dVar2.D(dVar2.s() - 1);
                                if ((cVarG.A1() & iA) == 0) {
                                    AbstractC2347k.c(dVar2, cVarG);
                                } else {
                                    while (true) {
                                        if (cVarG != null) {
                                            if ((cVarG.F1() & iA) != 0) {
                                                B0.d dVar3 = null;
                                                while (cVarG != null) {
                                                    if (cVarG instanceof FocusTargetNode) {
                                                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVarG;
                                                        if (focusTargetNode != null) {
                                                            i16 = 1;
                                                        }
                                                        if (eVar2.f8847b.contains(focusTargetNode3)) {
                                                            linkedHashSet.add(focusTargetNode3);
                                                            i17 = i14;
                                                        }
                                                        focusTargetNode = focusTargetNode3;
                                                    } else {
                                                        if ((cVarG.F1() & iA) != 0 && (cVarG instanceof AbstractC2348l)) {
                                                            L0.i.c cVarE3 = ((AbstractC2348l) cVarG).e2();
                                                            int i20 = i14;
                                                            while (cVarE3 != null) {
                                                                if ((cVarE3.F1() & iA) != 0) {
                                                                    i20++;
                                                                    if (i20 == 1) {
                                                                        cVarG = cVarE3;
                                                                        i11 = 0;
                                                                    } else {
                                                                        if (dVar3 == null) {
                                                                            L0.i.c[] cVarArr = new L0.i.c[i13];
                                                                            i11 = 0;
                                                                            dVar3 = new B0.d(cVarArr, 0);
                                                                        } else {
                                                                            i11 = 0;
                                                                        }
                                                                        if (cVarG != null) {
                                                                            dVar3.d(cVarG);
                                                                            cVarG = null;
                                                                        }
                                                                        dVar3.d(cVarE3);
                                                                    }
                                                                } else {
                                                                    i11 = i14;
                                                                }
                                                                cVarE3 = cVarE3.B1();
                                                                i14 = i11;
                                                                i13 = 16;
                                                            }
                                                            i10 = i14;
                                                            if (i20 == 1) {
                                                            }
                                                            i14 = i10;
                                                            i13 = 16;
                                                        }
                                                        cVarG = AbstractC2347k.g(dVar3);
                                                        i14 = i10;
                                                        i13 = 16;
                                                    }
                                                    i10 = i14;
                                                    cVarG = AbstractC2347k.g(dVar3);
                                                    i14 = i10;
                                                    i13 = 16;
                                                }
                                            } else {
                                                cVarG = cVarG.B1();
                                                i14 = i14;
                                                i13 = 16;
                                            }
                                        }
                                    }
                                }
                                i14 = i14;
                                i13 = 16;
                            }
                            i8 = i14;
                            i9 = 1;
                            if (i17 != 0) {
                                if (i16 != 0) {
                                    lVarK2 = d.a(cVar);
                                } else if (focusTargetNode == null || (lVarK2 = focusTargetNode.k2()) == null) {
                                    lVarK2 = m.Inactive;
                                }
                                cVar.J(lVarK2);
                            }
                        } else {
                            cVar.J(m.Inactive);
                            i8 = i14;
                            i9 = i15;
                        }
                        i15 = i9;
                        i12 = 1024;
                        i14 = i8;
                        i13 = 16;
                    }
                    e.this.f8848c.clear();
                    for (FocusTargetNode focusTargetNode4 : e.this.f8847b) {
                        if (focusTargetNode4.K1()) {
                            m mVarK2 = focusTargetNode4.k2();
                            focusTargetNode4.l2();
                            if (mVarK2 != focusTargetNode4.k2() || linkedHashSet.contains(focusTargetNode4)) {
                                d.c(focusTargetNode4);
                            }
                        }
                    }
                    e.this.f8847b.clear();
                    linkedHashSet.clear();
                    if (!e.this.f8849d.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusProperties nodes");
                    }
                    if (!e.this.f8848c.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusEvent nodes");
                    }
                    if (!e.this.f8847b.isEmpty()) {
                        throw new IllegalStateException("Unprocessed FocusTarget nodes");
                    }
                    return;
                }
                h hVar = (h) it.next();
                if (hVar.I0().K1()) {
                    int iA2 = Z.a(1024);
                    L0.i.c cVarI1 = hVar.I0();
                    B0.d dVar4 = null;
                    while (cVarI1 != null) {
                        if (cVarI1 instanceof FocusTargetNode) {
                            eVar.f8847b.add((FocusTargetNode) cVarI1);
                        } else if ((cVarI1.F1() & iA2) != 0 && (cVarI1 instanceof AbstractC2348l)) {
                            int i21 = 0;
                            for (L0.i.c cVarE4 = ((AbstractC2348l) cVarI1).e2(); cVarE4 != null; cVarE4 = cVarE4.B1()) {
                                if ((cVarE4.F1() & iA2) != 0) {
                                    i21++;
                                    if (i21 == 1) {
                                        cVarI1 = cVarE4;
                                    } else {
                                        if (dVar4 == null) {
                                            dVar4 = new B0.d(new L0.i.c[16], 0);
                                        }
                                        if (cVarI1 != null) {
                                            dVar4.d(cVarI1);
                                            cVarI1 = null;
                                        }
                                        dVar4.d(cVarE4);
                                    }
                                }
                            }
                            if (i21 == 1) {
                            }
                        }
                        cVarI1 = AbstractC2347k.g(dVar4);
                    }
                    if (!hVar.I0().K1()) {
                        throw new IllegalStateException("visitChildren called on an unattached node");
                    }
                    B0.d dVar5 = new B0.d(new L0.i.c[16], 0);
                    L0.i.c cVarB2 = hVar.I0().B1();
                    if (cVarB2 == null) {
                        AbstractC2347k.c(dVar5, hVar.I0());
                    } else {
                        dVar5.d(cVarB2);
                    }
                    while (dVar5.v()) {
                        L0.i.c cVarG2 = (L0.i.c) dVar5.D(dVar5.s() - 1);
                        if ((cVarG2.A1() & iA2) == 0) {
                            AbstractC2347k.c(dVar5, cVarG2);
                        } else {
                            while (cVarG2 != null) {
                                if ((cVarG2.F1() & iA2) != 0) {
                                    B0.d dVar6 = null;
                                    while (cVarG2 != null) {
                                        if (cVarG2 instanceof FocusTargetNode) {
                                            eVar.f8847b.add((FocusTargetNode) cVarG2);
                                        } else if ((cVarG2.F1() & iA2) != 0 && (cVarG2 instanceof AbstractC2348l)) {
                                            int i22 = 0;
                                            for (L0.i.c cVarE5 = ((AbstractC2348l) cVarG2).e2(); cVarE5 != null; cVarE5 = cVarE5.B1()) {
                                                if ((cVarE5.F1() & iA2) != 0) {
                                                    i22++;
                                                    if (i22 == 1) {
                                                        cVarG2 = cVarE5;
                                                    } else {
                                                        if (dVar6 == null) {
                                                            dVar6 = new B0.d(new L0.i.c[16], 0);
                                                        }
                                                        if (cVarG2 != null) {
                                                            dVar6.d(cVarG2);
                                                            cVarG2 = null;
                                                        }
                                                        dVar6.d(cVarE5);
                                                    }
                                                }
                                            }
                                            if (i22 == 1) {
                                            }
                                        }
                                        cVarG2 = AbstractC2347k.g(dVar6);
                                    }
                                    break;
                                }
                                cVarG2 = cVarG2.B1();
                            }
                        }
                    }
                }
            }
        }
    }

    public e(Q6.k kVar) {
        this.f8846a = kVar;
    }

    public final void d(c cVar) {
        g(this.f8848c, cVar);
    }

    public final void e(h hVar) {
        g(this.f8849d, hVar);
    }

    public final void f(FocusTargetNode focusTargetNode) {
        g(this.f8847b, focusTargetNode);
    }

    public final void g(Set set, Object obj) {
        if (set.add(obj) && this.f8847b.size() + this.f8848c.size() + this.f8849d.size() == 1) {
            this.f8846a.invoke(this.f8850e);
        }
    }
}
