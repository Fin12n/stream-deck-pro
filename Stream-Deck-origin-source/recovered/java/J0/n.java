package J0;

import D6.C0933m;
import D6.C0938s;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable, R6.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f3987e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f3988f = new n(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f3992d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final n a() {
            return n.f3988f;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.k implements Q6.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f3993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3996e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f3997f;

        public b(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            b bVar = n.this.new b(dVar);
            bVar.f3997f = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y6.i iVar, G6.d dVar) {
            return ((b) create(iVar, dVar)).invokeSuspend(C6.G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b4 -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d2 -> B:43:0x00f2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f0 -> B:42:0x00f1). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // I6.a
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: J0.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public n(long j8, long j9, int i8, int[] iArr) {
        this.f3989a = j8;
        this.f3990b = j9;
        this.f3991c = i8;
        this.f3992d = iArr;
    }

    public final boolean A(int i8) {
        int[] iArr;
        int i9 = i8 - this.f3991c;
        if (i9 >= 0 && i9 < 64) {
            return ((1 << i9) & this.f3990b) != 0;
        }
        if (i9 < 64 || i9 >= 128) {
            return i9 <= 0 && (iArr = this.f3992d) != null && o.b(iArr, i8) >= 0;
        }
        return ((1 << (i9 - 64)) & this.f3989a) != 0;
    }

    public final int D(int i8) {
        int[] iArr = this.f3992d;
        if (iArr != null) {
            return iArr[0];
        }
        long j8 = this.f3990b;
        if (j8 != 0) {
            return this.f3991c + o.c(j8);
        }
        long j9 = this.f3989a;
        return j9 != 0 ? this.f3991c + 64 + o.c(j9) : i8;
    }

    public final n E(n nVar) {
        n nVar2 = f3988f;
        if (nVar == nVar2) {
            return this;
        }
        if (this == nVar2) {
            return nVar;
        }
        int i8 = nVar.f3991c;
        int i9 = this.f3991c;
        if (i8 == i9) {
            int[] iArr = nVar.f3992d;
            int[] iArr2 = this.f3992d;
            if (iArr == iArr2) {
                return new n(this.f3989a | nVar.f3989a, this.f3990b | nVar.f3990b, i9, iArr2);
            }
        }
        if (this.f3992d == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                nVar = nVar.F(((Number) it.next()).intValue());
            }
            return nVar;
        }
        Iterator it2 = nVar.iterator();
        n nVarF = this;
        while (it2.hasNext()) {
            nVarF = nVarF.F(((Number) it2.next()).intValue());
        }
        return nVarF;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[PHI: r9
      0x0084: PHI (r9v5 java.util.ArrayList) = (r9v2 java.util.ArrayList), (r9v7 java.util.ArrayList) binds: [B:24:0x0063, B:26:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    public final n F(int i8) {
        int i9;
        int[] iArrQ0;
        long j8;
        int i10 = this.f3991c;
        int i11 = i8 - i10;
        long j9 = 1;
        long j10 = 0;
        if (i11 >= 0 && i11 < 64) {
            long j11 = 1 << i11;
            long j12 = this.f3990b;
            if ((j12 & j11) == 0) {
                return new n(this.f3989a, j12 | j11, i10, this.f3992d);
            }
        } else if (i11 >= 64 && i11 < 128) {
            long j13 = 1 << (i11 - 64);
            long j14 = this.f3989a;
            if ((j14 & j13) == 0) {
                return new n(j14 | j13, this.f3990b, i10, this.f3992d);
            }
        } else if (i11 < 128) {
            int[] iArr = this.f3992d;
            if (iArr == null) {
                return new n(this.f3989a, this.f3990b, i10, new int[]{i8});
            }
            int iB = o.b(iArr, i8);
            if (iB < 0) {
                int i12 = -(iB + 1);
                int length = iArr.length;
                int[] iArr2 = new int[length + 1];
                C0933m.g(iArr, iArr2, 0, 0, i12);
                C0933m.g(iArr, iArr2, i12 + 1, i12, length);
                iArr2[i12] = i8;
                return new n(this.f3989a, this.f3990b, this.f3991c, iArr2);
            }
        } else if (!A(i8)) {
            long j15 = this.f3989a;
            long j16 = this.f3990b;
            int i13 = this.f3991c;
            int i14 = ((i8 + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j17 = j16;
            long j18 = j15;
            while (true) {
                if (i13 >= i14) {
                    i9 = i13;
                    break;
                }
                if (j17 != j10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr3 = this.f3992d;
                        if (iArr3 != null) {
                            int length2 = iArr3.length;
                            int i15 = 0;
                            while (i15 < length2) {
                                arrayList.add(Integer.valueOf(iArr3[i15]));
                                i15++;
                                j10 = j10;
                            }
                        }
                    }
                    j8 = j10;
                    for (int i16 = 0; i16 < 64; i16++) {
                        if (((j9 << i16) & j17) != j8) {
                            arrayList.add(Integer.valueOf(i16 + i13));
                        }
                    }
                } else {
                    j9 = j9;
                    j8 = j10;
                }
                if (j18 == j8) {
                    i9 = i14;
                    j17 = j8;
                    break;
                }
                i13 += 64;
                j17 = j18;
                j9 = j9;
                j10 = j8;
                j18 = j10;
            }
            if (arrayList == null || (iArrQ0 = D6.z.Q0(arrayList)) == null) {
                iArrQ0 = this.f3992d;
            }
            return new n(j18, j17, i9, iArrQ0).F(i8);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return Y6.j.b(new b(null)).iterator();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(C0938s.y(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        sb.append(AbstractC1019b.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }

    public final n u(n nVar) {
        n nVar2 = f3988f;
        if (nVar == nVar2) {
            return this;
        }
        if (this == nVar2) {
            return nVar2;
        }
        int i8 = nVar.f3991c;
        int i9 = this.f3991c;
        if (i8 == i9) {
            int[] iArr = nVar.f3992d;
            int[] iArr2 = this.f3992d;
            if (iArr == iArr2) {
                return new n(this.f3989a & (~nVar.f3989a), this.f3990b & (~nVar.f3990b), i9, iArr2);
            }
        }
        Iterator it = nVar.iterator();
        n nVarY = this;
        while (it.hasNext()) {
            nVarY = nVarY.y(((Number) it.next()).intValue());
        }
        return nVarY;
    }

    public final n y(int i8) {
        int[] iArr;
        int iB;
        int i9 = this.f3991c;
        int i10 = i8 - i9;
        if (i10 >= 0 && i10 < 64) {
            long j8 = 1 << i10;
            long j9 = this.f3990b;
            if ((j9 & j8) != 0) {
                return new n(this.f3989a, (~j8) & j9, i9, this.f3992d);
            }
        } else if (i10 >= 64 && i10 < 128) {
            long j10 = 1 << (i10 - 64);
            long j11 = this.f3989a;
            if ((j11 & j10) != 0) {
                return new n((~j10) & j11, this.f3990b, i9, this.f3992d);
            }
        } else if (i10 < 0 && (iArr = this.f3992d) != null && (iB = o.b(iArr, i8)) >= 0) {
            int length = iArr.length;
            int i11 = length - 1;
            if (i11 == 0) {
                return new n(this.f3989a, this.f3990b, this.f3991c, null);
            }
            int[] iArr2 = new int[i11];
            if (iB > 0) {
                C0933m.g(iArr, iArr2, 0, 0, iB);
            }
            if (iB < i11) {
                C0933m.g(iArr, iArr2, iB, iB + 1, length);
            }
            return new n(this.f3989a, this.f3990b, this.f3991c, iArr2);
        }
        return this;
    }
}
