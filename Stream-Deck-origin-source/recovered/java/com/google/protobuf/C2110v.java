package com.google.protobuf;

import P2.Lsk.mHPawN;
import com.elgato.streamdeck.vsd2.KnownHost;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2110v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2110v f19410d = new C2110v(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f19411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19413c;

    /* JADX INFO: renamed from: com.google.protobuf.v$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f19415b;

        static {
            int[] iArr = new int[C0.b.values().length];
            f19415b = iArr;
            try {
                iArr[C0.b.f19067c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19415b[C0.b.f19068d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19415b[C0.b.f19069e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19415b[C0.b.f19070f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19415b[C0.b.f19071g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19415b[C0.b.f19072h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19415b[C0.b.f19073i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19415b[C0.b.f19074j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19415b[C0.b.f19076l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19415b[C0.b.f19077m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19415b[C0.b.f19075k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19415b[C0.b.f19078n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19415b[C0.b.f19079o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19415b[C0.b.f19081q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19415b[C0.b.f19082r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19415b[C0.b.f19083s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19415b[C0.b.f19084t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19415b[C0.b.f19080p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C0.c.values().length];
            f19414a = iArr2;
            try {
                iArr2[C0.c.f19088b.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f19414a[C0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f19414a[C0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f19414a[C0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f19414a[C0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f19414a[C0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f19414a[C0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f19414a[C0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f19414a[C0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.v$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b extends Comparable {
        boolean g();

        int getNumber();

        C0.b h();

        T.a i(T.a aVar, T t8);

        C0.c n();

        boolean q();
    }

    public C2110v() {
        this.f19411a = q0.q(16);
    }

    public static C2110v A() {
        return new C2110v();
    }

    public static Object B(AbstractC2098i abstractC2098i, C0.b bVar, boolean z8) {
        return z8 ? C0.d(abstractC2098i, bVar, C0.d.f19100b) : C0.d(abstractC2098i, bVar, C0.d.f19099a);
    }

    public static void E(AbstractC2100k abstractC2100k, C0.b bVar, int i8, Object obj) {
        if (bVar == C0.b.f19076l) {
            abstractC2100k.A0(i8, (T) obj);
        } else {
            abstractC2100k.W0(i8, o(bVar, false));
            F(abstractC2100k, bVar, obj);
        }
    }

    public static void F(AbstractC2100k abstractC2100k, C0.b bVar, Object obj) {
        switch (a.f19415b[bVar.ordinal()]) {
            case 1:
                abstractC2100k.r0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC2100k.z0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC2100k.H0(((Long) obj).longValue());
                break;
            case 4:
                abstractC2100k.a1(((Long) obj).longValue());
                break;
            case 5:
                abstractC2100k.F0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC2100k.x0(((Long) obj).longValue());
                break;
            case 7:
                abstractC2100k.v0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC2100k.l0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC2100k.C0((T) obj);
                break;
            case 10:
                abstractC2100k.J0((T) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC2097h)) {
                    abstractC2100k.V0((String) obj);
                } else {
                    abstractC2100k.p0((AbstractC2097h) obj);
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC2097h)) {
                    abstractC2100k.m0((byte[]) obj);
                } else {
                    abstractC2100k.p0((AbstractC2097h) obj);
                }
                break;
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                abstractC2100k.Y0(((Integer) obj).intValue());
                break;
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                abstractC2100k.N0(((Integer) obj).intValue());
                break;
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                abstractC2100k.P0(((Long) obj).longValue());
                break;
            case 16:
                abstractC2100k.R0(((Integer) obj).intValue());
                break;
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                abstractC2100k.T0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof A.c)) {
                    abstractC2100k.t0(((Integer) obj).intValue());
                } else {
                    abstractC2100k.t0(((A.c) obj).getNumber());
                }
                break;
        }
    }

    public static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int d(C0.b bVar, int i8, Object obj) {
        int iV = AbstractC2100k.V(i8);
        if (bVar == C0.b.f19076l) {
            iV *= 2;
        }
        return iV + e(bVar, obj);
    }

    public static int e(C0.b bVar, Object obj) {
        switch (a.f19415b[bVar.ordinal()]) {
            case 1:
                return AbstractC2100k.k(((Double) obj).doubleValue());
            case 2:
                return AbstractC2100k.s(((Float) obj).floatValue());
            case 3:
                return AbstractC2100k.z(((Long) obj).longValue());
            case 4:
                return AbstractC2100k.Z(((Long) obj).longValue());
            case 5:
                return AbstractC2100k.x(((Integer) obj).intValue());
            case 6:
                return AbstractC2100k.q(((Long) obj).longValue());
            case 7:
                return AbstractC2100k.o(((Integer) obj).intValue());
            case 8:
                return AbstractC2100k.f(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC2100k.u((T) obj);
            case 10:
                return obj instanceof E ? AbstractC2100k.C((E) obj) : AbstractC2100k.H((T) obj);
            case 11:
                return obj instanceof AbstractC2097h ? AbstractC2100k.i((AbstractC2097h) obj) : AbstractC2100k.U((String) obj);
            case 12:
                return obj instanceof AbstractC2097h ? AbstractC2100k.i((AbstractC2097h) obj) : AbstractC2100k.g((byte[]) obj);
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                return AbstractC2100k.X(((Integer) obj).intValue());
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                return AbstractC2100k.M(((Integer) obj).intValue());
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                return AbstractC2100k.O(((Long) obj).longValue());
            case 16:
                return AbstractC2100k.Q(((Integer) obj).intValue());
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                return AbstractC2100k.S(((Long) obj).longValue());
            case 18:
                return obj instanceof A.c ? AbstractC2100k.m(((A.c) obj).getNumber()) : AbstractC2100k.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b bVar, Object obj) {
        C0.b bVarH = bVar.h();
        int number = bVar.getNumber();
        if (!bVar.g()) {
            return d(bVarH, number, obj);
        }
        List list = (List) obj;
        int iD = 0;
        if (!bVar.q()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iD += d(bVarH, number, it.next());
            }
            return iD;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iD += e(bVarH, it2.next());
        }
        return AbstractC2100k.V(number) + iD + AbstractC2100k.X(iD);
    }

    public static C2110v h() {
        return f19410d;
    }

    public static int o(C0.b bVar, boolean z8) {
        if (z8) {
            return 2;
        }
        return bVar.b();
    }

    public static boolean t(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.n() != C0.c.MESSAGE) {
            return true;
        }
        if (!bVar.g()) {
            return u(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!u(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean u(Object obj) {
        if (obj instanceof U) {
            return ((U) obj).isInitialized();
        }
        if (obj instanceof E) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static boolean v(C0.b bVar, Object obj) {
        A.a(obj);
        switch (a.f19414a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC2097h) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof A.c);
            case 9:
                return (obj instanceof T) || (obj instanceof E);
            default:
                return false;
        }
    }

    public void C(b bVar, Object obj) {
        if (!bVar.g()) {
            D(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                D(bVar, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof E) {
            this.f19413c = true;
        }
        this.f19411a.r(bVar, obj);
    }

    public void a(b bVar, Object obj) {
        List arrayList;
        if (!bVar.g()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        D(bVar, obj);
        Object objI = i(bVar);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f19411a.r(bVar, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2110v clone() {
        C2110v c2110vA = A();
        for (int i8 = 0; i8 < this.f19411a.k(); i8++) {
            Map.Entry entryJ = this.f19411a.j(i8);
            c2110vA.C((b) entryJ.getKey(), entryJ.getValue());
        }
        for (Map.Entry entry : this.f19411a.m()) {
            c2110vA.C((b) entry.getKey(), entry.getValue());
        }
        c2110vA.f19413c = this.f19413c;
        return c2110vA;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2110v) {
            return this.f19411a.equals(((C2110v) obj).f19411a);
        }
        return false;
    }

    public Iterator g() {
        return this.f19413c ? new E.c(this.f19411a.h().iterator()) : this.f19411a.h().iterator();
    }

    public int hashCode() {
        return this.f19411a.hashCode();
    }

    public Object i(b bVar) {
        Object obj = this.f19411a.get(bVar);
        return obj instanceof E ? ((E) obj).g() : obj;
    }

    public int j() {
        int iK = 0;
        for (int i8 = 0; i8 < this.f19411a.k(); i8++) {
            iK += k(this.f19411a.j(i8));
        }
        Iterator it = this.f19411a.m().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public final int k(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.n() != C0.c.MESSAGE || bVar.g() || bVar.q()) {
            return f(bVar, value);
        }
        return value instanceof E ? AbstractC2100k.A(((b) entry.getKey()).getNumber(), (E) value) : AbstractC2100k.E(((b) entry.getKey()).getNumber(), (T) value);
    }

    public Object l(b bVar, int i8) {
        if (!bVar.g()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objI = i(bVar);
        if (objI != null) {
            return ((List) objI).get(i8);
        }
        throw new IndexOutOfBoundsException();
    }

    public int m(b bVar) {
        if (!bVar.g()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objI = i(bVar);
        if (objI == null) {
            return 0;
        }
        return ((List) objI).size();
    }

    public int n() {
        int iF = 0;
        for (int i8 = 0; i8 < this.f19411a.k(); i8++) {
            Map.Entry entryJ = this.f19411a.j(i8);
            iF += f((b) entryJ.getKey(), entryJ.getValue());
        }
        for (Map.Entry entry : this.f19411a.m()) {
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean p(b bVar) {
        if (bVar.g()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f19411a.get(bVar) != null;
    }

    public boolean q() {
        return this.f19411a.isEmpty();
    }

    public boolean r() {
        return this.f19412b;
    }

    public boolean s() {
        for (int i8 = 0; i8 < this.f19411a.k(); i8++) {
            if (!t(this.f19411a.j(i8))) {
                return false;
            }
        }
        Iterator it = this.f19411a.m().iterator();
        while (it.hasNext()) {
            if (!t((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator w() {
        return this.f19413c ? new E.c(this.f19411a.entrySet().iterator()) : this.f19411a.entrySet().iterator();
    }

    public void x() {
        if (this.f19412b) {
            return;
        }
        for (int i8 = 0; i8 < this.f19411a.k(); i8++) {
            Map.Entry entryJ = this.f19411a.j(i8);
            if (entryJ.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) entryJ.getValue()).makeImmutable();
            }
        }
        this.f19411a.p();
        this.f19412b = true;
    }

    public void y(C2110v c2110v) {
        for (int i8 = 0; i8 < c2110v.f19411a.k(); i8++) {
            z(c2110v.f19411a.j(i8));
        }
        Iterator it = c2110v.f19411a.m().iterator();
        while (it.hasNext()) {
            z((Map.Entry) it.next());
        }
    }

    public final void z(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof E) {
            value = ((E) value).g();
        }
        if (bVar.g()) {
            Object objI = i(bVar);
            if (objI == null) {
                objI = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI).add(c(it.next()));
            }
            this.f19411a.r(bVar, objI);
            return;
        }
        if (bVar.n() != C0.c.MESSAGE) {
            this.f19411a.r(bVar, c(value));
            return;
        }
        Object objI2 = i(bVar);
        if (objI2 == null) {
            this.f19411a.r(bVar, c(value));
        } else {
            this.f19411a.r(bVar, bVar.i(((T) objI2).toBuilder(), (T) value).build());
        }
    }

    public C2110v(boolean z8) {
        this(q0.q(0));
        x();
    }

    public final void D(b bVar, Object obj) {
        if (v(bVar.h(), obj)) {
            return;
        }
        throw new IllegalArgumentException(String.format(mHPawN.HFwtMfmEslCsxoZ, Integer.valueOf(bVar.getNumber()), bVar.h().a(), obj.getClass().getName()));
    }

    public C2110v(q0 q0Var) {
        this.f19411a = q0Var;
        x();
    }
}
