package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class X implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f19259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f19260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f19262d;

    public X(v0 v0Var, r rVar, T t8) {
        this.f19260b = v0Var;
        this.f19261c = rVar.e(t8);
        this.f19262d = rVar;
        this.f19259a = t8;
    }

    private int k(v0 v0Var, Object obj) {
        return v0Var.i(v0Var.g(obj));
    }

    private void l(v0 v0Var, r rVar, Object obj, m0 m0Var, C2106q c2106q) throws Throwable {
        v0 v0Var2;
        Object objF = v0Var.f(obj);
        C2110v c2110vD = rVar.d(obj);
        while (m0Var.B() != Integer.MAX_VALUE) {
            try {
                v0Var2 = v0Var;
                r rVar2 = rVar;
                m0 m0Var2 = m0Var;
                C2106q c2106q2 = c2106q;
                try {
                    if (!n(m0Var2, c2106q2, rVar2, c2110vD, v0Var2, objF)) {
                        v0Var2.o(obj, objF);
                        return;
                    }
                    m0Var = m0Var2;
                    c2106q = c2106q2;
                    rVar = rVar2;
                    v0Var = v0Var2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    v0Var2.o(obj, objF);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                v0Var2 = v0Var;
            }
        }
        v0Var.o(obj, objF);
    }

    public static X m(v0 v0Var, r rVar, T t8) {
        return new X(v0Var, rVar, t8);
    }

    @Override // com.google.protobuf.n0
    public void a(Object obj, Object obj2) {
        p0.G(this.f19260b, obj, obj2);
        if (this.f19261c) {
            p0.E(this.f19262d, obj, obj2);
        }
    }

    @Override // com.google.protobuf.n0
    public void b(Object obj, D0 d8) {
        Iterator itW = this.f19262d.c(obj).w();
        while (itW.hasNext()) {
            Map.Entry entry = (Map.Entry) itW.next();
            C2110v.b bVar = (C2110v.b) entry.getKey();
            if (bVar.n() != C0.c.MESSAGE || bVar.g() || bVar.q()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof E.b) {
                d8.e(bVar.getNumber(), ((E.b) entry).a().f());
            } else {
                d8.e(bVar.getNumber(), entry.getValue());
            }
        }
        o(this.f19260b, obj, d8);
    }

    @Override // com.google.protobuf.n0
    public void c(Object obj) {
        this.f19260b.j(obj);
        this.f19262d.f(obj);
    }

    @Override // com.google.protobuf.n0
    public final boolean d(Object obj) {
        return this.f19262d.c(obj).s();
    }

    @Override // com.google.protobuf.n0
    public void e(Object obj, m0 m0Var, C2106q c2106q) throws Throwable {
        l(this.f19260b, this.f19262d, obj, m0Var, c2106q);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    @Override // com.google.protobuf.n0
    public void f(Object obj, byte[] bArr, int i8, int i9, AbstractC2094e.b bVar) throws B {
        int I8;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        w0 w0VarO = generatedMessageLite.unknownFields;
        if (w0VarO == w0.c()) {
            w0VarO = w0.o();
            generatedMessageLite.unknownFields = w0VarO;
        }
        w0 w0Var = w0VarO;
        C2110v c2110vEnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
        GeneratedMessageLite.e eVar = null;
        while (i8 < i9) {
            int I9 = AbstractC2094e.I(bArr, i8, bVar);
            int i10 = bVar.f19273a;
            if (i10 == C0.f19062a) {
                int i11 = i9;
                AbstractC2094e.b bVar2 = bVar;
                int i12 = 0;
                AbstractC2097h abstractC2097h = null;
                while (true) {
                    if (I9 >= i11) {
                        I8 = I9;
                        break;
                    }
                    I8 = AbstractC2094e.I(bArr, I9, bVar2);
                    int i13 = bVar2.f19273a;
                    int iA = C0.a(i13);
                    int iB = C0.b(i13);
                    if (iA != 2) {
                        if (iA == 3) {
                            if (eVar != null) {
                                I9 = AbstractC2094e.p(j0.a().c(eVar.e().getClass()), bArr, I8, i11, bVar2);
                                c2110vEnsureExtensionsAreMutable.C(eVar.f19184d, bVar2.f19275c);
                            } else if (iB == 2) {
                                I9 = AbstractC2094e.b(bArr, I8, bVar2);
                                abstractC2097h = (AbstractC2097h) bVar2.f19275c;
                            }
                        }
                        if (i13 == C0.f19063b) {
                            break;
                        } else {
                            I9 = AbstractC2094e.P(i13, bArr, I8, i11, bVar2);
                        }
                    } else if (iB == 0) {
                        I9 = AbstractC2094e.I(bArr, I8, bVar2);
                        i12 = bVar2.f19273a;
                        eVar = (GeneratedMessageLite.e) this.f19262d.b(bVar2.f19276d, this.f19259a, i12);
                    } else {
                        if (i13 == C0.f19063b) {
                            break;
                            break;
                        }
                        I9 = AbstractC2094e.P(i13, bArr, I8, i11, bVar2);
                    }
                }
                if (abstractC2097h != null) {
                    w0Var.r(C0.c(i12, 2), abstractC2097h);
                }
                i8 = I8;
                i9 = i11;
                bVar = bVar2;
            } else if (C0.b(i10) == 2) {
                eVar = (GeneratedMessageLite.e) this.f19262d.b(bVar.f19276d, this.f19259a, C0.a(i10));
                if (eVar != null) {
                    i8 = AbstractC2094e.p(j0.a().c(eVar.e().getClass()), bArr, I9, i9, bVar);
                    c2110vEnsureExtensionsAreMutable.C(eVar.f19184d, bVar.f19275c);
                } else {
                    i8 = AbstractC2094e.G(i10, bArr, I9, i9, w0Var, bVar);
                }
            } else {
                i8 = AbstractC2094e.P(i10, bArr, I9, i9, bVar);
            }
        }
        if (i8 != i9) {
            throw B.h();
        }
    }

    @Override // com.google.protobuf.n0
    public boolean g(Object obj, Object obj2) {
        if (!this.f19260b.g(obj).equals(this.f19260b.g(obj2))) {
            return false;
        }
        if (this.f19261c) {
            return this.f19262d.c(obj).equals(this.f19262d.c(obj2));
        }
        return true;
    }

    @Override // com.google.protobuf.n0
    public int h(Object obj) {
        int iK = k(this.f19260b, obj);
        return this.f19261c ? iK + this.f19262d.c(obj).j() : iK;
    }

    @Override // com.google.protobuf.n0
    public Object i() {
        T t8 = this.f19259a;
        return t8 instanceof GeneratedMessageLite ? ((GeneratedMessageLite) t8).newMutableInstance() : t8.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.n0
    public int j(Object obj) {
        int iHashCode = this.f19260b.g(obj).hashCode();
        return this.f19261c ? (iHashCode * 53) + this.f19262d.c(obj).hashCode() : iHashCode;
    }

    public final boolean n(m0 m0Var, C2106q c2106q, r rVar, C2110v c2110v, v0 v0Var, Object obj) throws B {
        int iU = m0Var.u();
        if (iU != C0.f19062a) {
            if (C0.b(iU) != 2) {
                return m0Var.J();
            }
            Object objB = rVar.b(c2106q, this.f19259a, C0.a(iU));
            if (objB == null) {
                return v0Var.m(obj, m0Var);
            }
            rVar.h(m0Var, objB, c2106q, c2110v);
            return true;
        }
        Object objB2 = null;
        int iO = 0;
        AbstractC2097h abstractC2097hG = null;
        while (m0Var.B() != Integer.MAX_VALUE) {
            int iU2 = m0Var.u();
            if (iU2 == C0.f19064c) {
                iO = m0Var.o();
                objB2 = rVar.b(c2106q, this.f19259a, iO);
            } else if (iU2 == C0.f19065d) {
                if (objB2 != null) {
                    rVar.h(m0Var, objB2, c2106q, c2110v);
                } else {
                    abstractC2097hG = m0Var.G();
                }
            } else if (!m0Var.J()) {
                break;
            }
        }
        if (m0Var.u() != C0.f19063b) {
            throw B.b();
        }
        if (abstractC2097hG != null) {
            if (objB2 != null) {
                rVar.i(abstractC2097hG, objB2, c2106q, c2110v);
            } else {
                v0Var.d(obj, iO, abstractC2097hG);
            }
        }
        return true;
    }

    public final void o(v0 v0Var, Object obj, D0 d8) {
        v0Var.s(v0Var.g(obj), d8);
    }
}
