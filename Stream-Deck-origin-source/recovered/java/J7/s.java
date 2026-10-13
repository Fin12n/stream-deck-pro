package J7;

import D6.AbstractC0922b;
import D6.C0934n;
import D6.C0941v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends AbstractC0922b implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f4411d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h[] f4412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f4413c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ void b(a aVar, long j8, C1034e c1034e, int i8, List list, int i9, int i10, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j8 = 0;
            }
            aVar.a(j8, c1034e, (i11 & 4) != 0 ? 0 : i8, list, (i11 & 16) != 0 ? 0 : i9, (i11 & 32) != 0 ? list.size() : i10, list2);
        }

        public final void a(long j8, C1034e c1034e, int i8, List list, int i9, int i10, List list2) {
            int i11;
            int i12;
            int i13;
            long j9;
            int i14 = i8;
            if (i9 >= i10) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i15 = i9; i15 < i10; i15++) {
                if (((h) list.get(i15)).H() < i14) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            h hVar = (h) list.get(i9);
            h hVar2 = (h) list.get(i10 - 1);
            if (i14 == hVar.H()) {
                int iIntValue = ((Number) list2.get(i9)).intValue();
                int i16 = i9 + 1;
                h hVar3 = (h) list.get(i16);
                i11 = i16;
                i12 = iIntValue;
                hVar = hVar3;
            } else {
                i11 = i9;
                i12 = -1;
            }
            if (hVar.e(i14) == hVar2.e(i14)) {
                int iMin = Math.min(hVar.H(), hVar2.H());
                int i17 = 0;
                for (int i18 = i14; i18 < iMin && hVar.e(i18) == hVar2.e(i18); i18++) {
                    i17++;
                }
                long jC = j8 + c(c1034e) + ((long) 2) + ((long) i17) + 1;
                c1034e.writeInt(-i17);
                c1034e.writeInt(i12);
                int i19 = i14 + i17;
                while (i14 < i19) {
                    c1034e.writeInt(hVar.e(i14) & 255);
                    i14++;
                }
                if (i11 + 1 == i10) {
                    if (i19 != ((h) list.get(i11)).H()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c1034e.writeInt(((Number) list2.get(i11)).intValue());
                    return;
                } else {
                    C1034e c1034e2 = new C1034e();
                    c1034e.writeInt(((int) (c(c1034e2) + jC)) * (-1));
                    a(jC, c1034e2, i19, list, i11, i10, list2);
                    c1034e.M(c1034e2);
                    return;
                }
            }
            int i20 = 1;
            for (int i21 = i11 + 1; i21 < i10; i21++) {
                if (((h) list.get(i21 - 1)).e(i14) != ((h) list.get(i21)).e(i14)) {
                    i20++;
                }
            }
            long jC2 = j8 + c(c1034e) + ((long) 2) + ((long) (i20 * 2));
            c1034e.writeInt(i20);
            c1034e.writeInt(i12);
            for (int i22 = i11; i22 < i10; i22++) {
                byte bE = ((h) list.get(i22)).e(i14);
                if (i22 == i11 || bE != ((h) list.get(i22 - 1)).e(i14)) {
                    c1034e.writeInt(bE & 255);
                }
            }
            C1034e c1034e3 = new C1034e();
            while (i11 < i10) {
                byte bE2 = ((h) list.get(i11)).e(i14);
                int i23 = i11 + 1;
                int i24 = i23;
                while (true) {
                    if (i24 >= i10) {
                        i13 = i10;
                        break;
                    } else {
                        if (bE2 != ((h) list.get(i24)).e(i14)) {
                            i13 = i24;
                            break;
                        }
                        i24++;
                    }
                }
                if (i23 == i13 && i14 + 1 == ((h) list.get(i11)).H()) {
                    c1034e.writeInt(((Number) list2.get(i11)).intValue());
                    j9 = jC2;
                } else {
                    c1034e.writeInt(((int) (c(c1034e3) + jC2)) * (-1));
                    j9 = jC2;
                    a(j9, c1034e3, i14 + 1, list, i11, i13, list2);
                }
                jC2 = j9;
                i11 = i13;
            }
            c1034e.M(c1034e3);
        }

        public final long c(C1034e c1034e) {
            return c1034e.size() / ((long) 4);
        }

        public final s d(h... byteStrings) {
            kotlin.jvm.internal.t.g(byteStrings, "byteStrings");
            AbstractC2633k abstractC2633k = null;
            int i8 = 0;
            if (byteStrings.length == 0) {
                return new s(new h[0], new int[]{0, -1}, abstractC2633k);
            }
            List listT0 = C0934n.t0(byteStrings);
            C0941v.B(listT0);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (h hVar : byteStrings) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List listT = D6.r.t(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i9 = 0;
            int i10 = 0;
            while (i9 < length) {
                listT.set(D6.r.m(listT0, byteStrings[i9], 0, 0, 6, null), Integer.valueOf(i10));
                i9++;
                i10++;
            }
            if (((h) listT0.get(0)).H() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i11 = 0;
            while (i11 < listT0.size()) {
                h hVar2 = (h) listT0.get(i11);
                int i12 = i11 + 1;
                int i13 = i12;
                while (i13 < listT0.size()) {
                    h hVar3 = (h) listT0.get(i13);
                    if (!hVar3.I(hVar2)) {
                        break;
                    }
                    if (hVar3.H() == hVar2.H()) {
                        throw new IllegalArgumentException(("duplicate option: " + hVar3).toString());
                    }
                    if (((Number) listT.get(i13)).intValue() > ((Number) listT.get(i11)).intValue()) {
                        listT0.remove(i13);
                        listT.remove(i13);
                    } else {
                        i13++;
                    }
                }
                i11 = i12;
            }
            C1034e c1034e = new C1034e();
            b(this, 0L, c1034e, 0, listT0, 0, 0, listT, 53, null);
            int[] iArr = new int[(int) c(c1034e)];
            while (!c1034e.f0()) {
                iArr[i8] = c1034e.readInt();
                i8++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            kotlin.jvm.internal.t.f(objArrCopyOf, "copyOf(...)");
            return new s((h[]) objArrCopyOf, iArr, abstractC2633k);
        }

        public a() {
        }
    }

    public /* synthetic */ s(h[] hVarArr, int[] iArr, AbstractC2633k abstractC2633k) {
        this(hVarArr, iArr);
    }

    public static final s F(h... hVarArr) {
        return f4411d.d(hVarArr);
    }

    public final int[] A() {
        return this.f4413c;
    }

    public /* bridge */ int D(h hVar) {
        return super.indexOf(hVar);
    }

    public /* bridge */ int E(h hVar) {
        return super.lastIndexOf(hVar);
    }

    @Override // D6.AbstractC0921a
    public int c() {
        return this.f4412b.length;
    }

    @Override // D6.AbstractC0921a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return o((h) obj);
        }
        return false;
    }

    @Override // D6.AbstractC0922b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return D((h) obj);
        }
        return -1;
    }

    @Override // D6.AbstractC0922b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return E((h) obj);
        }
        return -1;
    }

    public /* bridge */ boolean o(h hVar) {
        return super.contains(hVar);
    }

    @Override // D6.AbstractC0922b, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public h get(int i8) {
        return this.f4412b[i8];
    }

    public final h[] y() {
        return this.f4412b;
    }

    public s(h[] hVarArr, int[] iArr) {
        this.f4412b = hVarArr;
        this.f4413c = iArr;
    }
}
