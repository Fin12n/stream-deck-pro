package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2068u extends AbstractC2039m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC2039m f19021g = new C2068u(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f19022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f19023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f19024f;

    public C2068u(Object obj, Object[] objArr, int i8) {
        this.f19022d = obj;
        this.f19023e = objArr;
        this.f19024f = i8;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    public static C2068u g(int i8, Object[] objArr, C2035l c2035l) {
        int iHighestOneBit;
        boolean z8;
        int i9;
        char c8;
        ?? r8;
        char c9;
        short[] sArr;
        boolean z9;
        int i10;
        ?? r16;
        boolean z10;
        ?? r9;
        Object[] objArr2;
        C2031k c2031k;
        boolean z11;
        int i11 = i8;
        Object[] objArrCopyOf = objArr;
        if (i11 == 0) {
            return (C2068u) f19021g;
        }
        C2031k c2031k2 = null;
        ?? r10 = 0;
        C2031k c2031k3 = null;
        C2031k c2031k4 = null;
        boolean z12 = false;
        int i12 = 1;
        if (i11 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            AbstractC2007e.a(obj, obj2);
            return new C2068u(null, objArrCopyOf, 1);
        }
        AbstractC1995b.b(i11, objArrCopyOf.length >> 1, "index");
        char c10 = 2;
        int iMax = Math.max(i11, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i11 != 1) {
            int i13 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i15 + i15;
                    int i17 = i14 + i14;
                    Object obj3 = objArrCopyOf[i17];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i17 ^ i12];
                    Objects.requireNonNull(obj4);
                    AbstractC2007e.a(obj3, obj4);
                    int iA = AbstractC2011f.a(obj3.hashCode());
                    while (true) {
                        int i18 = iA & i13;
                        z9 = z12;
                        i10 = i12;
                        int i19 = bArr[i18] & 255;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i16;
                            if (i15 < i14) {
                                objArrCopyOf[i16] = obj3;
                                objArrCopyOf[i16 ^ 1] = obj4;
                            }
                            i15++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                            int i20 = ~i19;
                            Object obj5 = objArrCopyOf[i20 == true ? 1 : 0];
                            Objects.requireNonNull(obj5);
                            C2031k c2031k5 = new C2031k(obj3, obj4, obj5);
                            objArrCopyOf[i20 == true ? 1 : 0] = obj4;
                            c2031k3 = c2031k5;
                            break;
                        }
                        iA = i18 + 1;
                        z12 = z9;
                        i12 = i10;
                    }
                    i14++;
                    z12 = z9;
                    i12 = i10;
                }
                z8 = z12;
                i9 = i12;
                if (i15 == i11) {
                    c8 = 2;
                    r8 = bArr;
                    r16 = z8;
                } else {
                    sArr = new Object[3];
                    sArr[z8 ? 1 : 0] = bArr;
                    sArr[i9] = Integer.valueOf(i15);
                    sArr[2] = c2031k3;
                    r10 = sArr;
                    z11 = z8;
                }
            } else {
                z8 = false;
                i9 = 1;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i21 = 0;
                    for (int i22 = 0; i22 < i11; i22++) {
                        int i23 = i21 + i21;
                        int i24 = i22 + i22;
                        Object obj6 = objArrCopyOf[i24];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i24 ^ 1];
                        Objects.requireNonNull(obj7);
                        AbstractC2007e.a(obj6, obj7);
                        int iA2 = AbstractC2011f.a(obj6.hashCode());
                        while (true) {
                            int i25 = iA2 & i13;
                            char c11 = (char) sArr[i25];
                            if (c11 == 65535) {
                                sArr[i25] = (short) i23;
                                if (i21 < i22) {
                                    objArrCopyOf[i23] = obj6;
                                    objArrCopyOf[i23 ^ 1] = obj7;
                                }
                                i21++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c11])) {
                                int i26 = c11 ^ 1;
                                Object obj8 = objArrCopyOf[i26 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                C2031k c2031k6 = new C2031k(obj6, obj7, obj8);
                                objArrCopyOf[i26 == true ? 1 : 0] = obj7;
                                c2031k4 = c2031k6;
                                break;
                            }
                            iA2 = i25 + 1;
                        }
                    }
                    if (i21 == i11) {
                        r10 = sArr;
                        z11 = z8;
                    } else {
                        r10 = new Object[]{sArr, Integer.valueOf(i21), c2031k4};
                        z11 = z8;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < i11) {
                        int i29 = i28 + i28;
                        int i30 = i27 + i27;
                        Object obj9 = objArrCopyOf[i30];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i30 ^ 1];
                        Objects.requireNonNull(obj10);
                        AbstractC2007e.a(obj9, obj10);
                        int iA3 = AbstractC2011f.a(obj9.hashCode());
                        while (true) {
                            int i31 = iA3 & i13;
                            int i32 = iArr[i31];
                            if (i32 == -1) {
                                iArr[i31] = i29;
                                if (i28 < i27) {
                                    objArrCopyOf[i29] = obj9;
                                    objArrCopyOf[i29 ^ 1] = obj10;
                                }
                                i28++;
                                c9 = c10;
                                break;
                            }
                            c9 = c10;
                            if (obj9.equals(objArrCopyOf[i32])) {
                                int i33 = i32 ^ 1;
                                Object obj11 = objArrCopyOf[i33];
                                Objects.requireNonNull(obj11);
                                C2031k c2031k7 = new C2031k(obj9, obj10, obj11);
                                objArrCopyOf[i33] = obj10;
                                c2031k2 = c2031k7;
                                break;
                            }
                            iA3 = i31 + 1;
                            c10 = c9;
                        }
                        i27++;
                        c10 = c9;
                    }
                    c8 = c10;
                    if (i28 == i11) {
                        r8 = iArr;
                        r16 = z8;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i28);
                        objArr3[c8] = c2031k2;
                        r8 = objArr3;
                        r16 = z8;
                    }
                }
            }
            z10 = r8 instanceof Object[];
            r9 = r8;
            if (z10) {
                objArr2 = (Object[]) r8;
                c2031k = (C2031k) objArr2[c8];
                if (c2035l != null) {
                    throw c2031k.a();
                }
                c2035l.f18981c = c2031k;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i9]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r9 = obj12;
                i11 = iIntValue;
            }
            return new C2068u(r9, objArrCopyOf, i11);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        AbstractC2007e.a(obj13, obj14);
        z11 = false;
        i11 = 1;
        i9 = 1;
        c8 = 2;
        r8 = r10;
        r16 = z11;
        z10 = r8 instanceof Object[];
        r9 = r8;
        if (z10) {
            objArr2 = (Object[]) r8;
            c2031k = (C2031k) objArr2[c8];
            if (c2035l != null) {
                throw c2031k.a();
            }
            c2035l.f18981c = c2031k;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i9]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r9 = obj15;
            i11 = iIntValue2;
        }
        return new C2068u(r9, objArrCopyOf, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2039m
    public final AbstractC2015g a() {
        return new C2065t(this.f19023e, 1, this.f19024f);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2039m
    public final AbstractC2043n d() {
        return new r(this, this.f19023e, 0, this.f19024f);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2039m
    public final AbstractC2043n e() {
        return new C2062s(this, new C2065t(this.f19023e, 0, this.f19024f));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2039m, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i8 = this.f19024f;
            Object[] objArr = this.f19023e;
            if (i8 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f19022d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iA = AbstractC2011f.a(obj.hashCode());
                    while (true) {
                        int i9 = iA & length;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i10])) {
                            obj2 = objArr[i10 ^ 1];
                        } else {
                            iA = i9 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iA2 = AbstractC2011f.a(obj.hashCode());
                    while (true) {
                        int i11 = iA2 & length2;
                        char c8 = (char) sArr[i11];
                        if (c8 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c8])) {
                            obj2 = objArr[c8 ^ 1];
                        } else {
                            iA2 = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iA3 = AbstractC2011f.a(obj.hashCode());
                    while (true) {
                        int i12 = iA3 & length3;
                        int i13 = iArr[i12];
                        if (i13 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i13])) {
                            obj2 = objArr[i13 ^ 1];
                        } else {
                            iA3 = i12 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19024f;
    }
}
