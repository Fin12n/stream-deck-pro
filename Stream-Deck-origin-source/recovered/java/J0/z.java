package J0;

import C6.C0920i;
import D6.C0933m;
import D6.C0937q;
import I0.mIk.efuWFSeiT;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.P;
import p043e6.dT.GIGvBf;
import p215z0.AbstractC3145c;
import p215z0.AbstractC3169o;
import p215z0.f1;
import p215z0.g1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f4034k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q6.k f4035a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4037c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1023f f4041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f4043i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f4036b = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q6.o f4038d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Q6.k f4039e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B0.d f4040f = new B0.d(new a[16], 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4044j = -1;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Q6.k f4045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f4046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p010b0.t f4047c;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f4054j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4048d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final B0.f f4049e = new B0.f();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final p010b0.u f4050f = new p010b0.u(0, 1, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final p010b0.v f4051g = new p010b0.v(0, 1, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final B0.d f4052h = new B0.d(new p215z0.E[16], 0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final p215z0.F f4053i = new C0147a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final B0.f f4055k = new B0.f();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final HashMap f4056l = new HashMap();

        /* JADX INFO: renamed from: J0.z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0147a implements p215z0.F {
            public C0147a() {
            }

            @Override // p215z0.F
            public void a(p215z0.E e8) {
                a.this.f4054j--;
            }

            @Override // p215z0.F
            public void b(p215z0.E e8) {
                a.this.f4054j++;
            }
        }

        public a(Q6.k kVar) {
            this.f4045a = kVar;
        }

        public final void c() {
            this.f4049e.b();
            this.f4050f.h();
            this.f4055k.b();
            this.f4056l.clear();
        }

        public final void d(Object obj) {
            int i8 = this.f4048d;
            p010b0.t tVar = this.f4047c;
            if (tVar == null) {
                return;
            }
            long[] jArr = tVar.f15640a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i9 = 0;
            while (true) {
                long j8 = jArr[i9];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j8) < 128) {
                            int i12 = (i9 << 3) + i11;
                            Object obj2 = tVar.f15641b[i12];
                            boolean z8 = tVar.f15642c[i12] != i8;
                            if (z8) {
                                m(obj, obj2);
                            }
                            if (z8) {
                                tVar.o(i12);
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i10 != 8) {
                        return;
                    }
                }
                if (i9 == length) {
                    return;
                } else {
                    i9++;
                }
            }
        }

        public final void e(Object obj) {
            p010b0.t tVar = (p010b0.t) this.f4050f.n(obj);
            if (tVar == null) {
                return;
            }
            Object[] objArr = tVar.f15641b;
            int[] iArr = tVar.f15642c;
            long[] jArr = tVar.f15640a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i8 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i8 << 3) + i10;
                            Object obj2 = objArr[i11];
                            int i12 = iArr[i11];
                            m(obj, obj2);
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        return;
                    }
                }
                if (i8 == length) {
                    return;
                } else {
                    i8++;
                }
            }
        }

        public final Q6.k f() {
            return this.f4045a;
        }

        public final boolean g() {
            return this.f4050f.f();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0044 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:15:0x0046 A[LOOP:0: B:5:0x0011->B:15:0x0046, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:19:0x0049 A[EDGE_INSN: B:19:0x0049->B:16:0x0049 BREAK  A[LOOP:0: B:5:0x0011->B:15:0x0046], SYNTHETIC] */
        public final void h() {
            p010b0.v vVar = this.f4051g;
            Q6.k kVar = this.f4045a;
            Object[] objArr = vVar.f15564b;
            long[] jArr = vVar.f15563a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i8 = 0;
                while (true) {
                    long j8 = jArr[i8];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i8 != length) {
                            break;
                            break;
                        }
                        i8++;
                    } else {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((255 & j8) < 128) {
                                kVar.invoke(objArr[(i8 << 3) + i10]);
                            }
                            j8 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        } else if (i8 != length) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
            }
            vVar.i();
        }

        public final void i(Object obj, Q6.k kVar, Function0 function0) {
            Object obj2 = this.f4046b;
            p010b0.t tVar = this.f4047c;
            int i8 = this.f4048d;
            this.f4046b = obj;
            this.f4047c = (p010b0.t) this.f4050f.b(obj);
            if (this.f4048d == -1) {
                this.f4048d = p.H().f();
            }
            p215z0.F f8 = this.f4053i;
            B0.d dVarC = g1.c();
            try {
                dVarC.d(f8);
                AbstractC1028k.f3974e.f(kVar, null, function0);
                dVarC.D(dVarC.s() - 1);
                Object obj3 = this.f4046b;
                kotlin.jvm.internal.t.d(obj3);
                d(obj3);
                this.f4046b = obj2;
                this.f4047c = tVar;
                this.f4048d = i8;
            } catch (Throwable th) {
                dVarC.D(dVarC.s() - 1);
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x0266  */
        /* JADX WARN: Code duplicated, block: B:104:0x0273  */
        /* JADX WARN: Code duplicated, block: B:106:0x0279  */
        /* JADX WARN: Code duplicated, block: B:110:0x028d A[DONT_INVERT, PHI: r20
          0x028d: PHI (r20v35 boolean) = (r20v34 boolean), (r20v36 boolean) binds: [B:101:0x0264, B:109:0x028b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:111:0x028f A[LOOP:5: B:100:0x025a->B:111:0x028f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:112:0x0292  */
        /* JADX WARN: Code duplicated, block: B:200:0x0493 A[DONT_INVERT, PHI: r20
          0x0493: PHI (r20v11 boolean) = (r20v10 boolean), (r20v12 boolean) binds: [B:191:0x046a, B:199:0x0491] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:201:0x0495 A[LOOP:17: B:190:0x0460->B:201:0x0495, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:204:0x04a4  */
        /* JADX WARN: Code duplicated, block: B:242:0x0297 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:243:0x0297 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:244:0x0297 A[EDGE_INSN: B:244:0x0297->B:113:0x0297 BREAK  A[LOOP:5: B:100:0x025a->B:111:0x028f], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:245:0x0297 A[EDGE_INSN: B:245:0x0297->B:113:0x0297 BREAK  A[LOOP:5: B:100:0x025a->B:111:0x028f], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:252:0x0154 A[EDGE_INSN: B:252:0x0154->B:55:0x0154 BREAK  A[LOOP:3: B:39:0x00f7->B:51:0x0133], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:258:0x0283 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:260:0x023f A[EDGE_INSN: B:260:0x023f->B:93:0x023f BREAK  A[LOOP:7: B:77:0x01ea->B:88:0x021f], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:280:0x04aa A[EDGE_INSN: B:280:0x04aa->B:205:0x04aa BREAK  A[LOOP:17: B:190:0x0460->B:201:0x0495], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:50:0x0131 A[DONT_INVERT, PHI: r20
          0x0131: PHI (r20v52 boolean) = (r20v51 boolean), (r20v53 boolean) binds: [B:40:0x0105, B:49:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:51:0x0133 A[LOOP:3: B:39:0x00f7->B:51:0x0133, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:52:0x013c  */
        /* JADX WARN: Code duplicated, block: B:87:0x021d A[DONT_INVERT, PHI: r20
          0x021d: PHI (r20v41 boolean) = (r20v40 boolean), (r20v42 boolean) binds: [B:78:0x01f4, B:86:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:88:0x021f A[LOOP:7: B:77:0x01ea->B:88:0x021f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:95:0x0249  */
        /* JADX WARN: Code duplicated, block: B:97:0x024d  */
        /* JADX WARN: Code duplicated, block: B:99:0x0258  */
        public final boolean j(Set set) {
            boolean z8;
            Iterator it;
            String str;
            Object objB;
            long[] jArr;
            Object[] objArr;
            Iterator it2;
            B0.f fVar;
            long[] jArr2;
            String str2;
            Object[] objArr2;
            long j8;
            long[] jArr3;
            int i8;
            char c8;
            int i9;
            long j9;
            Object objB2;
            Object[] objArr3;
            long[] jArr4;
            int length;
            int i10;
            long j10;
            int i11;
            int i12;
            Object objB3;
            B0.f fVar2;
            B0.f fVar3;
            long j11;
            B0.f fVar4 = this.f4055k;
            HashMap map = this.f4056l;
            B0.f fVar5 = this.f4049e;
            p010b0.v vVar = this.f4051g;
            String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            int i13 = 2;
            int i14 = 0;
            if (set instanceof B0.b) {
                B0.b bVar = (B0.b) set;
                Object[] objArrT = bVar.t();
                int size = bVar.size();
                int i15 = 0;
                z8 = false;
                while (i15 < size) {
                    Object obj = objArrT[i15];
                    kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if (obj instanceof H) {
                        c8 = 7;
                        if (!((H) obj).e(AbstractC1024g.a(i13))) {
                            size = size;
                            fVar4 = fVar4;
                            fVar5 = fVar5;
                            objArrT = objArrT;
                            i15 = i15;
                            i9 = i13;
                        }
                        i15++;
                        i13 = i9;
                        size = size;
                        fVar4 = fVar4;
                        fVar5 = fVar5;
                        objArrT = objArrT;
                    } else {
                        c8 = 7;
                    }
                    if (!fVar4.c(obj) || (objB3 = fVar4.d().b(obj)) == null) {
                        i9 = i13;
                    } else {
                        if (objB3 instanceof p010b0.v) {
                            p010b0.v vVar2 = (p010b0.v) objB3;
                            Object[] objArr4 = vVar2.f15564b;
                            long[] jArr5 = vVar2.f15563a;
                            i9 = i13;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                i15 = i15;
                                int i16 = 0;
                                j9 = -9187201950435737472L;
                                while (true) {
                                    int i17 = 8;
                                    long j12 = jArr5[i16];
                                    long[] jArr6 = jArr5;
                                    Object[] objArr5 = objArr4;
                                    if ((((~j12) << c8) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i18 = 8 - ((~(i16 - length2)) >>> 31);
                                        int i19 = 0;
                                        while (i19 < i18) {
                                            if ((j12 & 255) < 128) {
                                                int i20 = i17;
                                                p215z0.E e8 = (p215z0.E) objArr5[(i16 << 3) + i19];
                                                kotlin.jvm.internal.t.e(e8, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                Object obj2 = map.get(e8);
                                                f1 f1VarD = e8.d();
                                                if (f1VarD == null) {
                                                    f1VarD = g1.r();
                                                }
                                                fVar3 = fVar5;
                                                if (f1VarD.a(e8.z().a(), obj2)) {
                                                    fVar2 = fVar4;
                                                    j11 = j12;
                                                    this.f4052h.d(e8);
                                                } else {
                                                    Object objB4 = fVar3.d().b(e8);
                                                    if (objB4 == null) {
                                                        fVar2 = fVar4;
                                                        j11 = j12;
                                                    } else if (objB4 instanceof p010b0.v) {
                                                        p010b0.v vVar3 = (p010b0.v) objB4;
                                                        Object[] objArr6 = vVar3.f15564b;
                                                        long[] jArr7 = vVar3.f15563a;
                                                        int length3 = jArr7.length - 2;
                                                        if (length3 >= 0) {
                                                            j11 = j12;
                                                            int i21 = 0;
                                                            while (true) {
                                                                long j13 = jArr7[i21];
                                                                long[] jArr8 = jArr7;
                                                                fVar2 = fVar4;
                                                                if ((((~j13) << c8) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                    if (i21 != length3) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i21++;
                                                                    fVar4 = fVar2;
                                                                    jArr7 = jArr8;
                                                                    i20 = 8;
                                                                } else {
                                                                    int i22 = 8 - ((~(i21 - length3)) >>> 31);
                                                                    for (int i23 = 0; i23 < i22; i23++) {
                                                                        if ((j13 & 255) < 128) {
                                                                            vVar.g(objArr6[(i21 << 3) + i23]);
                                                                            z8 = true;
                                                                        }
                                                                        j13 >>= i20;
                                                                    }
                                                                    if (i22 != i20) {
                                                                        break;
                                                                    }
                                                                    if (i21 != length3) {
                                                                        break;
                                                                    }
                                                                    i21++;
                                                                    fVar4 = fVar2;
                                                                    jArr7 = jArr8;
                                                                    i20 = 8;
                                                                }
                                                            }
                                                        } else {
                                                            fVar2 = fVar4;
                                                            j11 = j12;
                                                        }
                                                    } else {
                                                        fVar2 = fVar4;
                                                        j11 = j12;
                                                        vVar.g(objB4);
                                                        z8 = true;
                                                    }
                                                }
                                                i17 = 8;
                                            } else {
                                                fVar2 = fVar4;
                                                fVar3 = fVar5;
                                                j11 = j12;
                                            }
                                            j12 = j11 >> i17;
                                            i19++;
                                            size = size;
                                            fVar4 = fVar2;
                                            fVar5 = fVar3;
                                            objArrT = objArrT;
                                        }
                                        size = size;
                                        fVar4 = fVar4;
                                        fVar5 = fVar5;
                                        objArrT = objArrT;
                                        if (i18 != i17) {
                                            break;
                                        }
                                    } else {
                                        size = size;
                                        fVar4 = fVar4;
                                        fVar5 = fVar5;
                                        objArrT = objArrT;
                                    }
                                    if (i16 == length2) {
                                        break;
                                    }
                                    i16++;
                                    objArr4 = objArr5;
                                    jArr5 = jArr6;
                                    size = size;
                                    fVar4 = fVar4;
                                    fVar5 = fVar5;
                                    objArrT = objArrT;
                                }
                            }
                        } else {
                            size = size;
                            fVar4 = fVar4;
                            fVar5 = fVar5;
                            objArrT = objArrT;
                            i15 = i15;
                            i9 = i13;
                            j9 = -9187201950435737472L;
                            p215z0.E e9 = (p215z0.E) objB3;
                            Object obj3 = map.get(e9);
                            f1 f1VarD2 = e9.d();
                            if (f1VarD2 == null) {
                                f1VarD2 = g1.r();
                            }
                            if (f1VarD2.a(e9.z().a(), obj3)) {
                                this.f4052h.d(e9);
                            } else {
                                Object objB5 = fVar5.d().b(e9);
                                if (objB5 != null) {
                                    if (objB5 instanceof p010b0.v) {
                                        p010b0.v vVar4 = (p010b0.v) objB5;
                                        Object[] objArr7 = vVar4.f15564b;
                                        long[] jArr9 = vVar4.f15563a;
                                        int length4 = jArr9.length - 2;
                                        if (length4 >= 0) {
                                            int i24 = 0;
                                            while (true) {
                                                long j14 = jArr9[i24];
                                                if ((((~j14) << c8) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i24 != length4) {
                                                        break;
                                                        break;
                                                    }
                                                    i24++;
                                                } else {
                                                    int i25 = 8 - ((~(i24 - length4)) >>> 31);
                                                    for (int i26 = 0; i26 < i25; i26++) {
                                                        if ((j14 & 255) < 128) {
                                                            vVar.g(objArr7[(i24 << 3) + i26]);
                                                            z8 = true;
                                                        }
                                                        j14 >>= 8;
                                                    }
                                                    if (i25 != 8) {
                                                        break;
                                                    }
                                                    if (i24 != length4) {
                                                        break;
                                                    }
                                                    i24++;
                                                }
                                            }
                                        }
                                    } else {
                                        vVar.g(objB5);
                                        z8 = true;
                                    }
                                }
                            }
                        }
                        objB2 = fVar5.d().b(obj);
                        if (objB2 == null) {
                            if (objB2 instanceof p010b0.v) {
                                p010b0.v vVar5 = (p010b0.v) objB2;
                                objArr3 = vVar5.f15564b;
                                jArr4 = vVar5.f15563a;
                                length = jArr4.length - 2;
                                if (length >= 0) {
                                    i10 = 0;
                                    while (true) {
                                        j10 = jArr4[i10];
                                        if ((((~j10) << c8) & j10 & j9) != j9) {
                                            if (i10 != length) {
                                                break;
                                                break;
                                            }
                                            i10++;
                                        } else {
                                            i11 = 8 - ((~(i10 - length)) >>> 31);
                                            for (i12 = 0; i12 < i11; i12++) {
                                                if ((j10 & 255) < 128) {
                                                    vVar.g(objArr3[(i10 << 3) + i12]);
                                                    z8 = true;
                                                }
                                                j10 >>= 8;
                                            }
                                            if (i11 == 8) {
                                                break;
                                            }
                                            if (i10 != length) {
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                }
                            } else {
                                vVar.g(objB2);
                                z8 = true;
                            }
                        }
                        i15++;
                        i13 = i9;
                        size = size;
                        fVar4 = fVar4;
                        fVar5 = fVar5;
                        objArrT = objArrT;
                    }
                    j9 = -9187201950435737472L;
                    objB2 = fVar5.d().b(obj);
                    if (objB2 == null) {
                        if (objB2 instanceof p010b0.v) {
                            p010b0.v vVar6 = (p010b0.v) objB2;
                            objArr3 = vVar6.f15564b;
                            jArr4 = vVar6.f15563a;
                            length = jArr4.length - 2;
                            if (length >= 0) {
                                i10 = 0;
                                while (true) {
                                    j10 = jArr4[i10];
                                    if ((((~j10) << c8) & j10 & j9) != j9) {
                                        if (i10 != length) {
                                            break;
                                            break;
                                        }
                                        i10++;
                                    } else {
                                        i11 = 8 - ((~(i10 - length)) >>> 31);
                                        while (i12 < i11) {
                                            if ((j10 & 255) < 128) {
                                                vVar.g(objArr3[(i10 << 3) + i12]);
                                                z8 = true;
                                            }
                                            j10 >>= 8;
                                        }
                                        if (i11 == 8) {
                                            break;
                                            break;
                                        }
                                        if (i10 != length) {
                                            break;
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                            }
                        } else {
                            vVar.g(objB2);
                            z8 = true;
                        }
                    }
                    i15++;
                    i13 = i9;
                    size = size;
                    fVar4 = fVar4;
                    fVar5 = fVar5;
                    objArrT = objArrT;
                }
            } else {
                B0.f fVar6 = fVar4;
                Iterator it3 = set.iterator();
                z8 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof H) || ((H) next).e(AbstractC1024g.a(2))) {
                        B0.f fVar7 = fVar6;
                        if (!fVar7.c(next) || (objB = fVar7.d().b(next)) == null) {
                            it = it3;
                            fVar6 = fVar7;
                            str = str3;
                        } else if (objB instanceof p010b0.v) {
                            p010b0.v vVar7 = (p010b0.v) objB;
                            Object[] objArr8 = vVar7.f15564b;
                            long[] jArr10 = vVar7.f15563a;
                            int length5 = jArr10.length - 2;
                            if (length5 >= 0) {
                                int i27 = 0;
                                while (true) {
                                    long j15 = jArr10[i27];
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i28 = 8 - ((~(i27 - length5)) >>> 31);
                                        int i29 = 0;
                                        while (i29 < i28) {
                                            if ((j15 & 255) < 128) {
                                                p215z0.E e10 = (p215z0.E) objArr8[(i27 << 3) + i29];
                                                kotlin.jvm.internal.t.e(e10, str3);
                                                it2 = it3;
                                                Object obj4 = map.get(e10);
                                                f1 f1VarD3 = e10.d();
                                                if (f1VarD3 == null) {
                                                    f1VarD3 = g1.r();
                                                }
                                                fVar = fVar7;
                                                jArr2 = jArr10;
                                                if (f1VarD3.a(e10.z().a(), obj4)) {
                                                    str2 = str3;
                                                    objArr2 = objArr8;
                                                    j8 = j15;
                                                    this.f4052h.d(e10);
                                                } else {
                                                    Object objB6 = fVar5.d().b(e10);
                                                    if (objB6 != null) {
                                                        if (objB6 instanceof p010b0.v) {
                                                            p010b0.v vVar8 = (p010b0.v) objB6;
                                                            Object[] objArr9 = vVar8.f15564b;
                                                            long[] jArr11 = vVar8.f15563a;
                                                            int length6 = jArr11.length - 2;
                                                            if (length6 >= 0) {
                                                                str2 = str3;
                                                                objArr2 = objArr8;
                                                                int i30 = 0;
                                                                while (true) {
                                                                    long j16 = jArr11[i30];
                                                                    j8 = j15;
                                                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i31 = 8 - ((~(i30 - length6)) >>> 31);
                                                                        i8 = i30;
                                                                        int i32 = 0;
                                                                        while (i32 < i31) {
                                                                            if ((j16 & 255) < 128) {
                                                                                vVar.g(objArr9[(i8 << 3) + i32]);
                                                                                z8 = true;
                                                                            }
                                                                            j16 >>= 8;
                                                                            i32++;
                                                                            jArr11 = jArr11;
                                                                        }
                                                                        jArr3 = jArr11;
                                                                        if (i31 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr11;
                                                                        i8 = i30;
                                                                    }
                                                                    if (i8 == length6) {
                                                                        break;
                                                                    }
                                                                    i30 = i8 + 1;
                                                                    j15 = j8;
                                                                    jArr11 = jArr3;
                                                                }
                                                            }
                                                        } else {
                                                            str2 = str3;
                                                            objArr2 = objArr8;
                                                            j8 = j15;
                                                            vVar.g(objB6);
                                                            z8 = true;
                                                        }
                                                    }
                                                }
                                                j15 = j8 >> 8;
                                                i29++;
                                                it3 = it2;
                                                str3 = str2;
                                                jArr10 = jArr2;
                                                objArr8 = objArr2;
                                                fVar7 = fVar;
                                            } else {
                                                it2 = it3;
                                                fVar = fVar7;
                                                jArr2 = jArr10;
                                            }
                                            str2 = str3;
                                            objArr2 = objArr8;
                                            j8 = j15;
                                            j15 = j8 >> 8;
                                            i29++;
                                            it3 = it2;
                                            str3 = str2;
                                            jArr10 = jArr2;
                                            objArr8 = objArr2;
                                            fVar7 = fVar;
                                        }
                                        it = it3;
                                        fVar6 = fVar7;
                                        jArr = jArr10;
                                        str = str3;
                                        objArr = objArr8;
                                        if (i28 != 8) {
                                            break;
                                        }
                                    } else {
                                        it = it3;
                                        fVar6 = fVar7;
                                        jArr = jArr10;
                                        str = str3;
                                        objArr = objArr8;
                                    }
                                    if (i27 == length5) {
                                        break;
                                    }
                                    i27++;
                                    it3 = it;
                                    str3 = str;
                                    jArr10 = jArr;
                                    objArr8 = objArr;
                                    fVar7 = fVar6;
                                }
                            } else {
                                it = it3;
                                fVar6 = fVar7;
                                str = str3;
                            }
                        } else {
                            it = it3;
                            fVar6 = fVar7;
                            str = str3;
                            p215z0.E e11 = (p215z0.E) objB;
                            Object obj5 = map.get(e11);
                            f1 f1VarD4 = e11.d();
                            if (f1VarD4 == null) {
                                f1VarD4 = g1.r();
                            }
                            if (f1VarD4.a(e11.z().a(), obj5)) {
                                this.f4052h.d(e11);
                            } else {
                                Object objB7 = fVar5.d().b(e11);
                                if (objB7 != null) {
                                    if (objB7 instanceof p010b0.v) {
                                        p010b0.v vVar9 = (p010b0.v) objB7;
                                        Object[] objArr10 = vVar9.f15564b;
                                        long[] jArr12 = vVar9.f15563a;
                                        int length7 = jArr12.length - 2;
                                        if (length7 >= 0) {
                                            int i33 = 0;
                                            while (true) {
                                                long j17 = jArr12[i33];
                                                if ((((~j17) << 7) & j17 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i33 != length7) {
                                                        break;
                                                        break;
                                                    }
                                                    i33++;
                                                } else {
                                                    int i34 = 8 - ((~(i33 - length7)) >>> 31);
                                                    for (int i35 = 0; i35 < i34; i35++) {
                                                        if ((j17 & 255) < 128) {
                                                            vVar.g(objArr10[(i33 << 3) + i35]);
                                                            z8 = true;
                                                        }
                                                        j17 >>= 8;
                                                    }
                                                    if (i34 != 8) {
                                                        break;
                                                    }
                                                    if (i33 != length7) {
                                                        break;
                                                    }
                                                    i33++;
                                                }
                                            }
                                        }
                                    } else {
                                        vVar.g(objB7);
                                        z8 = true;
                                    }
                                }
                            }
                        }
                        Object objB8 = fVar5.d().b(next);
                        if (objB8 != null) {
                            if (objB8 instanceof p010b0.v) {
                                p010b0.v vVar10 = (p010b0.v) objB8;
                                Object[] objArr11 = vVar10.f15564b;
                                long[] jArr13 = vVar10.f15563a;
                                int length8 = jArr13.length - 2;
                                if (length8 >= 0) {
                                    int i36 = 0;
                                    while (true) {
                                        long j18 = jArr13[i36];
                                        if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i37 = 8 - ((~(i36 - length8)) >>> 31);
                                            for (int i38 = 0; i38 < i37; i38++) {
                                                if ((j18 & 255) < 128) {
                                                    vVar.g(objArr11[(i36 << 3) + i38]);
                                                    z8 = true;
                                                }
                                                j18 >>= 8;
                                            }
                                            if (i37 != 8) {
                                                break;
                                            }
                                        }
                                        if (i36 == length8) {
                                            break;
                                        }
                                        i36++;
                                    }
                                }
                            } else {
                                vVar.g(objB8);
                                z8 = true;
                            }
                        }
                        it3 = it;
                        str3 = str;
                    } else {
                        it = it3;
                        str = str3;
                    }
                    it3 = it;
                    str3 = str;
                }
            }
            if (this.f4052h.v()) {
                B0.d dVar = this.f4052h;
                int iS = dVar.s();
                if (iS > 0) {
                    Object[] objArrR = dVar.r();
                    while (true) {
                        o((p215z0.E) objArrR[i14]);
                        int i39 = i14 + 1;
                        if (i39 >= iS) {
                            break;
                        }
                        i14 = i39;
                    }
                }
                this.f4052h.m();
            }
            return z8;
        }

        public final void k(Object obj) {
            Object obj2 = this.f4046b;
            kotlin.jvm.internal.t.d(obj2);
            int i8 = this.f4048d;
            p010b0.t tVar = this.f4047c;
            if (tVar == null) {
                tVar = new p010b0.t(0, 1, null);
                this.f4047c = tVar;
                this.f4050f.q(obj2, tVar);
                C6.G g8 = C6.G.f1419a;
            }
            l(obj, i8, obj2, tVar);
        }

        public final void l(Object obj, int i8, Object obj2, p010b0.t tVar) {
            int i9;
            int i10;
            int i11;
            if (this.f4054j > 0) {
                return;
            }
            int iN = tVar.n(obj, i8, -1);
            int i12 = 2;
            if (!(obj instanceof p215z0.E) || iN == i8) {
                i9 = 2;
                i10 = -1;
            } else {
                z0.E.a aVarZ = ((p215z0.E) obj).z();
                this.f4056l.put(obj, aVarZ.a());
                p010b0.w wVarB = aVarZ.b();
                B0.f fVar = this.f4055k;
                fVar.f(obj);
                Object[] objArr = wVarB.f15641b;
                long[] jArr = wVarB.f15640a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j8 = jArr[i13];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((j8 & 255) < 128) {
                                    i11 = i12;
                                    G g8 = (G) objArr[(i13 << 3) + i15];
                                    if (g8 instanceof H) {
                                        ((H) g8).q(AbstractC1024g.a(i11));
                                    }
                                    fVar.a(g8, obj);
                                } else {
                                    i11 = i12;
                                }
                                j8 >>= 8;
                                i15++;
                                i12 = i11;
                            }
                            i9 = i12;
                            if (i14 != 8) {
                                break;
                            }
                        } else {
                            i9 = i12;
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                        i12 = i9;
                    }
                } else {
                    i9 = 2;
                }
                i10 = -1;
            }
            if (iN == i10) {
                if (obj instanceof H) {
                    ((H) obj).q(AbstractC1024g.a(i9));
                }
                this.f4049e.a(obj, obj2);
            }
        }

        public final void m(Object obj, Object obj2) {
            this.f4049e.e(obj2, obj);
            if (!(obj2 instanceof p215z0.E) || this.f4049e.c(obj2)) {
                return;
            }
            this.f4055k.f(obj2);
            this.f4056l.remove(obj2);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0066->B:28:0x009f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00ac A[EDGE_INSN: B:49:0x00ac->B:30:0x00ac BREAK  A[LOOP:2: B:16:0x0066->B:28:0x009f], SYNTHETIC] */
        public final void n(Q6.k kVar) {
            long[] jArr;
            long[] jArr2;
            long j8;
            char c8;
            long j9;
            int i8;
            p010b0.u uVar = this.f4050f;
            long[] jArr3 = uVar.f15646a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i9 = 0;
            while (true) {
                long j10 = jArr3[i9];
                char c9 = 7;
                long j11 = -9187201950435737472L;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8;
                    int i11 = 8 - ((~(i9 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j10 & 255) < 128) {
                            int i13 = (i9 << 3) + i12;
                            c8 = c9;
                            Object obj = uVar.f15647b[i13];
                            j9 = j11;
                            p010b0.t tVar = (p010b0.t) uVar.f15648c[i13];
                            Boolean bool = (Boolean) kVar.invoke(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = tVar.f15641b;
                                int[] iArr = tVar.f15642c;
                                long[] jArr4 = tVar.f15640a;
                                int i14 = i10;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j8 = j10;
                                    int i15 = 0;
                                    while (true) {
                                        long j12 = jArr4[i15];
                                        long[] jArr5 = jArr4;
                                        if ((((~j12) << c8) & j12 & j9) != j9) {
                                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                            for (int i17 = 0; i17 < i16; i17++) {
                                                if ((j12 & 255) < 128) {
                                                    int i18 = (i15 << 3) + i17;
                                                    Object obj2 = objArr[i18];
                                                    int i19 = iArr[i18];
                                                    m(obj, obj2);
                                                }
                                                j12 >>= i14;
                                            }
                                            if (i16 != i14) {
                                                break;
                                            }
                                            if (i15 != length2) {
                                                break;
                                            }
                                            i15++;
                                            jArr4 = jArr5;
                                            i14 = 8;
                                        } else if (i15 != length2) {
                                            break;
                                            break;
                                        } else {
                                            i15++;
                                            jArr4 = jArr5;
                                            i14 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j8 = j10;
                                }
                            } else {
                                jArr2 = jArr3;
                                j8 = j10;
                            }
                            if (bool.booleanValue()) {
                                uVar.o(i13);
                            }
                            i8 = 8;
                        } else {
                            jArr2 = jArr3;
                            j8 = j10;
                            c8 = c9;
                            j9 = j11;
                            i8 = i10;
                        }
                        i12++;
                        i10 = i8;
                        j10 = j8 >> i8;
                        c9 = c8;
                        j11 = j9;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i11 != i10) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i9 == length) {
                    return;
                }
                i9++;
                jArr3 = jArr;
            }
        }

        public final void o(p215z0.E e8) {
            long[] jArr;
            p010b0.t tVar;
            p010b0.u uVar = this.f4050f;
            int iF = p.H().f();
            Object objB = this.f4049e.d().b(e8);
            if (objB == null) {
                return;
            }
            if (!(objB instanceof p010b0.v)) {
                p010b0.t tVar2 = (p010b0.t) uVar.b(objB);
                if (tVar2 == null) {
                    tVar2 = new p010b0.t(0, 1, null);
                    uVar.q(objB, tVar2);
                    C6.G g8 = C6.G.f1419a;
                }
                l(e8, iF, objB, tVar2);
                return;
            }
            p010b0.v vVar = (p010b0.v) objB;
            Object[] objArr = vVar.f15564b;
            long[] jArr2 = vVar.f15563a;
            int length = jArr2.length - 2;
            if (length < 0) {
                return;
            }
            int i8 = 0;
            while (true) {
                long j8 = jArr2[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j8 & 255) < 128) {
                            Object obj = objArr[(i8 << 3) + i11];
                            p010b0.t tVar3 = (p010b0.t) uVar.b(obj);
                            if (tVar3 == null) {
                                tVar = new p010b0.t(0, 1, null);
                                uVar.q(obj, tVar);
                                C6.G g9 = C6.G.f1419a;
                            } else {
                                tVar = tVar3;
                            }
                            l(e8, iF, obj, tVar);
                        }
                        j8 >>= i9;
                        i11++;
                        i9 = i9;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i10 != i9) {
                        return;
                    }
                } else {
                    jArr = jArr2;
                }
                if (i8 == length) {
                    return;
                }
                i8++;
                jArr2 = jArr;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Q6.o {
        public b() {
            super(2);
        }

        public final void b(Set set, AbstractC1028k abstractC1028k) {
            z.this.i(set);
            if (z.this.m()) {
                z.this.r();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((Set) obj, (AbstractC1028k) obj2);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Q6.k {
        public c() {
            super(1);
        }

        public final void b(Object obj) {
            if (z.this.f4042h) {
                return;
            }
            B0.d dVar = z.this.f4040f;
            z zVar = z.this;
            synchronized (dVar) {
                a aVar = zVar.f4043i;
                kotlin.jvm.internal.t.d(aVar);
                aVar.k(obj);
                C6.G g8 = C6.G.f1419a;
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(obj);
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends kotlin.jvm.internal.u implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m61invoke();
            return C6.G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m61invoke() {
            do {
                B0.d dVar = z.this.f4040f;
                z zVar = z.this;
                synchronized (dVar) {
                    try {
                        if (!zVar.f4037c) {
                            zVar.f4037c = true;
                            try {
                                B0.d dVar2 = zVar.f4040f;
                                int iS = dVar2.s();
                                if (iS > 0) {
                                    Object[] objArrR = dVar2.r();
                                    int i8 = 0;
                                    do {
                                        ((a) objArrR[i8]).h();
                                        i8++;
                                    } while (i8 < iS);
                                }
                                zVar.f4037c = false;
                            } catch (Throwable th) {
                                zVar.f4037c = false;
                                throw th;
                            }
                        }
                        C6.G g8 = C6.G.f1419a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (z.this.m());
        }
    }

    public z(Q6.k kVar) {
        this.f4035a = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Set set) {
        Object obj;
        Set setB0;
        do {
            obj = this.f4036b.get();
            if (obj == null) {
                setB0 = set;
            } else if (obj instanceof Set) {
                setB0 = D6.r.q(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new C0920i();
                }
                setB0 = D6.z.B0((Collection) obj, C0937q.e(set));
            }
        } while (!X.i.a(this.f4036b, obj, setB0));
    }

    public final void j() {
        synchronized (this.f4040f) {
            try {
                B0.d dVar = this.f4040f;
                int iS = dVar.s();
                if (iS > 0) {
                    Object[] objArrR = dVar.r();
                    int i8 = 0;
                    do {
                        ((a) objArrR[i8]).c();
                        i8++;
                    } while (i8 < iS);
                }
                C6.G g8 = C6.G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(Object obj) {
        synchronized (this.f4040f) {
            try {
                B0.d dVar = this.f4040f;
                int iS = dVar.s();
                int i8 = 0;
                for (int i9 = 0; i9 < iS; i9++) {
                    a aVar = (a) dVar.r()[i9];
                    aVar.e(obj);
                    if (!aVar.g()) {
                        i8++;
                    } else if (i8 > 0) {
                        dVar.r()[i9 - i8] = dVar.r()[i9];
                    }
                }
                int i10 = iS - i8;
                C0933m.s(dVar.r(), null, i10, iS);
                dVar.H(i10);
                C6.G g8 = C6.G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(Q6.k kVar) {
        synchronized (this.f4040f) {
            try {
                B0.d dVar = this.f4040f;
                int iS = dVar.s();
                int i8 = 0;
                for (int i9 = 0; i9 < iS; i9++) {
                    a aVar = (a) dVar.r()[i9];
                    aVar.n(kVar);
                    if (!aVar.g()) {
                        i8++;
                    } else if (i8 > 0) {
                        dVar.r()[i9 - i8] = dVar.r()[i9];
                    }
                }
                int i10 = iS - i8;
                C0933m.s(dVar.r(), null, i10, iS);
                dVar.H(i10);
                C6.G g8 = C6.G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m() {
        boolean z8;
        synchronized (this.f4040f) {
            z8 = this.f4037c;
        }
        if (z8) {
            return false;
        }
        boolean z9 = false;
        while (true) {
            Set setP = p();
            if (setP == null) {
                return z9;
            }
            synchronized (this.f4040f) {
                try {
                    B0.d dVar = this.f4040f;
                    int iS = dVar.s();
                    if (iS > 0) {
                        Object[] objArrR = dVar.r();
                        int i8 = 0;
                        do {
                            z9 = ((a) objArrR[i8]).j(setP) || z9;
                            i8++;
                        } while (i8 < iS);
                    }
                    C6.G g8 = C6.G.f1419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void o(Object obj, Q6.k kVar, Function0 function0) {
        a aVarN;
        synchronized (this.f4040f) {
            aVarN = n(kVar);
        }
        boolean z8 = this.f4042h;
        a aVar = this.f4043i;
        long j8 = this.f4044j;
        if (j8 == -1 || j8 == AbstractC3145c.a()) {
            try {
                this.f4042h = false;
                this.f4043i = aVarN;
                this.f4044j = Thread.currentThread().getId();
                aVarN.i(obj, this.f4039e, function0);
                return;
            } finally {
                this.f4043i = aVar;
                this.f4042h = z8;
                this.f4044j = j8;
            }
        }
        throw new IllegalArgumentException(("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j8 + "), currentThread={id=" + AbstractC3145c.a() + ", name=" + AbstractC3145c.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.").toString());
    }

    public final Set p() {
        Object obj;
        Object objSubList;
        Set set;
        do {
            obj = this.f4036b.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new C0920i();
                }
                List list = (List) obj;
                Set set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!X.i.a(this.f4036b, obj, objSubList));
        return set;
    }

    public final void r() {
        this.f4035a.invoke(new d());
    }

    public final void s() {
        this.f4041g = AbstractC1028k.f3974e.g(this.f4038d);
    }

    public final void t() {
        InterfaceC1023f interfaceC1023f = this.f4041g;
        if (interfaceC1023f != null) {
            interfaceC1023f.d();
        }
    }

    public final a n(Q6.k kVar) {
        Object obj;
        B0.d dVar = this.f4040f;
        int iS = dVar.s();
        if (iS <= 0) {
            obj = null;
            break;
        }
        Object[] objArrR = dVar.r();
        int i8 = 0;
        while (true) {
            obj = objArrR[i8];
            if (((a) obj).f() == kVar) {
                break;
            }
            i8++;
            if (i8 >= iS) {
                obj = null;
                break;
            }
        }
        a aVar = (a) obj;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.t.e(kVar, GIGvBf.vPxLObbO);
        a aVar2 = new a((Q6.k) P.e(kVar, 1));
        this.f4040f.d(aVar2);
        return aVar2;
    }

    public final Void q() {
        AbstractC3169o.v(efuWFSeiT.qAckpUXFpD);
        throw new C0920i();
    }
}
