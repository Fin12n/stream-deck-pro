package com.google.protobuf;

import com.elgato.streamdeck.vsd2.KnownHost;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2107s extends r {

    /* JADX INFO: renamed from: com.google.protobuf.s$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19398a;

        static {
            int[] iArr = new int[C0.b.values().length];
            f19398a = iArr;
            try {
                iArr[C0.b.f19067c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19398a[C0.b.f19068d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19398a[C0.b.f19069e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19398a[C0.b.f19070f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19398a[C0.b.f19071g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19398a[C0.b.f19072h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19398a[C0.b.f19073i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19398a[C0.b.f19074j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19398a[C0.b.f19079o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19398a[C0.b.f19081q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19398a[C0.b.f19082r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19398a[C0.b.f19083s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19398a[C0.b.f19084t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19398a[C0.b.f19080p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19398a[C0.b.f19078n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19398a[C0.b.f19075k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19398a[C0.b.f19076l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19398a[C0.b.f19077m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.r
    public int a(Map.Entry entry) {
        return ((GeneratedMessageLite.d) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.r
    public Object b(C2106q c2106q, T t8, int i8) {
        return c2106q.a(t8, i8);
    }

    @Override // com.google.protobuf.r
    public C2110v c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.r
    public C2110v d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.r
    public boolean e(T t8) {
        return t8 instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.protobuf.r
    public void f(Object obj) {
        c(obj).x();
    }

    @Override // com.google.protobuf.r
    public Object g(Object obj, m0 m0Var, Object obj2, C2106q c2106q, C2110v c2110v, Object obj3, v0 v0Var) {
        Object objValueOf;
        Object objI;
        ArrayList arrayList;
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj2;
        int iF = eVar.f();
        if (eVar.f19184d.g() && eVar.f19184d.q()) {
            switch (a.f19398a[eVar.d().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    m0Var.M(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    m0Var.H(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    m0Var.p(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    m0Var.n(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    m0Var.r(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    m0Var.P(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    m0Var.v(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    m0Var.y(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    m0Var.g(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    m0Var.d(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    m0Var.q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    m0Var.a(arrayList);
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    arrayList = new ArrayList();
                    m0Var.e(arrayList);
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    arrayList = new ArrayList();
                    m0Var.s(arrayList);
                    obj3 = p0.z(obj, iF, arrayList, eVar.f19184d.b(), obj3, v0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f19184d.h());
            }
            c2110v.C(eVar.f19184d, arrayList);
            return obj3;
        }
        if (eVar.d() != C0.b.f19080p) {
            switch (a.f19398a[eVar.d().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(m0Var.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(m0Var.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(m0Var.N());
                    break;
                case 4:
                    objValueOf = Long.valueOf(m0Var.b());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(m0Var.I());
                    break;
                case 6:
                    objValueOf = Long.valueOf(m0Var.c());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(m0Var.j());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(m0Var.k());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(m0Var.o());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(m0Var.K());
                    break;
                case 11:
                    objValueOf = Long.valueOf(m0Var.m());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(m0Var.w());
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    objValueOf = Long.valueOf(m0Var.x());
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    throw new IllegalStateException("Shouldn't reach here.");
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    objValueOf = m0Var.G();
                    break;
                case 16:
                    objValueOf = m0Var.z();
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    if (!eVar.g()) {
                        Object objI2 = c2110v.i(eVar.f19184d);
                        if (objI2 instanceof GeneratedMessageLite) {
                            n0 n0VarD = j0.a().d(objI2);
                            if (!((GeneratedMessageLite) objI2).isMutable()) {
                                Object objI3 = n0VarD.i();
                                n0VarD.a(objI3, objI2);
                                c2110v.C(eVar.f19184d, objI3);
                                objI2 = objI3;
                            }
                            m0Var.i(objI2, n0VarD, c2106q);
                            return obj3;
                        }
                    }
                    objValueOf = m0Var.A(eVar.e().getClass(), c2106q);
                    break;
                case 18:
                    if (!eVar.g()) {
                        Object objI4 = c2110v.i(eVar.f19184d);
                        if (objI4 instanceof GeneratedMessageLite) {
                            n0 n0VarD2 = j0.a().d(objI4);
                            if (!((GeneratedMessageLite) objI4).isMutable()) {
                                Object objI5 = n0VarD2.i();
                                n0VarD2.a(objI5, objI4);
                                c2110v.C(eVar.f19184d, objI5);
                                objI4 = objI5;
                            }
                            m0Var.D(objI4, n0VarD2, c2106q);
                            return obj3;
                        }
                    }
                    objValueOf = m0Var.h(eVar.e().getClass(), c2106q);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int I8 = m0Var.I();
            if (eVar.f19184d.b().findValueByNumber(I8) == null) {
                return p0.J(obj, iF, I8, obj3, v0Var);
            }
            objValueOf = Integer.valueOf(I8);
        }
        if (eVar.g()) {
            c2110v.a(eVar.f19184d, objValueOf);
            return obj3;
        }
        int i8 = a.f19398a[eVar.d().ordinal()];
        if ((i8 == 17 || i8 == 18) && (objI = c2110v.i(eVar.f19184d)) != null) {
            objValueOf = A.h(objI, objValueOf);
        }
        c2110v.C(eVar.f19184d, objValueOf);
        return obj3;
    }

    @Override // com.google.protobuf.r
    public void h(m0 m0Var, Object obj, C2106q c2106q, C2110v c2110v) {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        c2110v.C(eVar.f19184d, m0Var.h(eVar.e().getClass(), c2106q));
    }

    @Override // com.google.protobuf.r
    public void i(AbstractC2097h abstractC2097h, Object obj, C2106q c2106q, C2110v c2110v) {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        T.a aVarNewBuilderForType = eVar.e().newBuilderForType();
        AbstractC2098i abstractC2098iL = abstractC2097h.L();
        aVarNewBuilderForType.mergeFrom(abstractC2098iL, c2106q);
        c2110v.C(eVar.f19184d, aVarNewBuilderForType.buildPartial());
        abstractC2098iL.a(0);
    }

    @Override // com.google.protobuf.r
    public void j(D0 d8, Map.Entry entry) {
        GeneratedMessageLite.d dVar = (GeneratedMessageLite.d) entry.getKey();
        if (!dVar.g()) {
            switch (a.f19398a[dVar.h().ordinal()]) {
                case 1:
                    d8.g(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    d8.G(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    d8.q(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    d8.o(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    d8.w(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    d8.k(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    d8.f(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    d8.r(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    d8.d(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    d8.t(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    d8.z(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    d8.N(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    d8.F(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    d8.w(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    d8.v(dVar.getNumber(), (AbstractC2097h) entry.getValue());
                    break;
                case 16:
                    d8.n(dVar.getNumber(), (String) entry.getValue());
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    d8.s(dVar.getNumber(), entry.getValue(), j0.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    d8.j(dVar.getNumber(), entry.getValue(), j0.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f19398a[dVar.h().ordinal()]) {
            case 1:
                p0.O(dVar.getNumber(), (List) entry.getValue(), d8, dVar.q());
                break;
            case 2:
                p0.S(dVar.getNumber(), (List) entry.getValue(), d8, dVar.q());
                break;
            case 3:
                p0.V(dVar.getNumber(), (List) entry.getValue(), d8, dVar.q());
                break;
            case 4:
                p0.d0(dVar.getNumber(), (List) entry.getValue(), d8, dVar.q());
                break;
            case 5:
                p0.U(dVar.getNumber(), (List) entry.getValue(), d8, dVar.q());
                break;
            case 6:
                p0.R(dVar.getNumber(), (List) entry.getValue(), d8, dVar.q());
                break;
            case 7:
                p0.Q(dVar.getNumber(), (List) entry.getValue(), d8, dVar.q());
                break;
            case 8:
                p0.M(dVar.getNumber(), (List) entry.getValue(), d8, dVar.q());
                break;
            case 9:
                p0.c0(dVar.getNumber(), (List) entry.getValue(), d8, dVar.q());
                break;
            case 10:
                p0.X(dVar.getNumber(), (List) entry.getValue(), d8, dVar.q());
                break;
            case 11:
                p0.Y(dVar.getNumber(), (List) entry.getValue(), d8, dVar.q());
                break;
            case 12:
                p0.Z(dVar.getNumber(), (List) entry.getValue(), d8, dVar.q());
                break;
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                p0.a0(dVar.getNumber(), (List) entry.getValue(), d8, dVar.q());
                break;
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                p0.U(dVar.getNumber(), (List) entry.getValue(), d8, dVar.q());
                break;
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                p0.N(dVar.getNumber(), (List) entry.getValue(), d8);
                break;
            case 16:
                p0.b0(dVar.getNumber(), (List) entry.getValue(), d8);
                break;
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    p0.T(dVar.getNumber(), (List) entry.getValue(), d8, j0.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    p0.W(dVar.getNumber(), (List) entry.getValue(), d8, j0.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
