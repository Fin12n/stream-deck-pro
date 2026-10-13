package com.google.protobuf;

import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.vsd2.Messages;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class W implements n0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f19239r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Unsafe f19240s = z0.H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f19241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f19242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T f19245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f19248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f19250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f19251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f19252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC2087a0 f19253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final I f19254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v0 f19255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f19256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final N f19257q;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19258a;

        static {
            int[] iArr = new int[C0.b.values().length];
            f19258a = iArr;
            try {
                iArr[C0.b.f19074j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19258a[C0.b.f19078n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19258a[C0.b.f19067c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19258a[C0.b.f19073i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19258a[C0.b.f19081q.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19258a[C0.b.f19072h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19258a[C0.b.f19082r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19258a[C0.b.f19068d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19258a[C0.b.f19080p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19258a[C0.b.f19071g.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19258a[C0.b.f19079o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19258a[C0.b.f19069e.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19258a[C0.b.f19070f.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19258a[C0.b.f19077m.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19258a[C0.b.f19083s.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19258a[C0.b.f19084t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19258a[C0.b.f19075k.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public W(int[] iArr, Object[] objArr, int i8, int i9, T t8, i0 i0Var, boolean z8, int[] iArr2, int i10, int i11, InterfaceC2087a0 interfaceC2087a0, I i12, v0 v0Var, r rVar, N n8) {
        this.f19241a = iArr;
        this.f19242b = objArr;
        this.f19243c = i8;
        this.f19244d = i9;
        this.f19247g = t8 instanceof GeneratedMessageLite;
        this.f19248h = i0Var;
        this.f19246f = rVar != null && rVar.e(t8);
        this.f19249i = z8;
        this.f19250j = iArr2;
        this.f19251k = i10;
        this.f19252l = i11;
        this.f19253m = interfaceC2087a0;
        this.f19254n = i12;
        this.f19255o = v0Var;
        this.f19256p = rVar;
        this.f19245e = t8;
        this.f19257q = n8;
    }

    public static boolean A(int i8) {
        return (i8 & 536870912) != 0;
    }

    public static boolean D(Object obj, int i8, n0 n0Var) {
        return n0Var.d(z0.G(obj, X(i8)));
    }

    public static boolean E(int i8) {
        return (i8 & Integer.MIN_VALUE) != 0;
    }

    public static boolean H(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    public static boolean K(int i8) {
        return (i8 & 268435456) != 0;
    }

    public static long L(Object obj, long j8) {
        return z0.E(obj, j8);
    }

    public static W T(Class cls, Q q8, InterfaceC2087a0 interfaceC2087a0, I i8, v0 v0Var, r rVar, N n8) {
        if (q8 instanceof l0) {
            return V((l0) q8, interfaceC2087a0, i8, v0Var, rVar, n8);
        }
        p063h.s.a(q8);
        return U(null, interfaceC2087a0, i8, v0Var, rVar, n8);
    }

    public static W U(r0 r0Var, InterfaceC2087a0 interfaceC2087a0, I i8, v0 v0Var, r rVar, N n8) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    public static W V(l0 l0Var, InterfaceC2087a0 interfaceC2087a0, I i8, v0 v0Var, r rVar, N n8) {
        int i9;
        int iCharAt;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        int iObjectFieldOffset3;
        int i30;
        java.lang.reflect.Field fieldO0;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        Object obj;
        java.lang.reflect.Field fieldO1;
        int i34;
        Object obj2;
        java.lang.reflect.Field fieldO2;
        int i35;
        char cCharAt10;
        int i36;
        char cCharAt11;
        int i37;
        char cCharAt12;
        int i38;
        char cCharAt13;
        String strE = l0Var.e();
        int length = strE.length();
        char c8 = 55296;
        if (strE.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i9 = i39 + 1;
                if (strE.charAt(i39) < 55296) {
                    break;
                }
                i39 = i9;
            }
        } else {
            i9 = 1;
        }
        int i40 = i9 + 1;
        int iCharAt2 = strE.charAt(i9);
        if (iCharAt2 >= 55296) {
            int i41 = iCharAt2 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                cCharAt13 = strE.charAt(i40);
                if (cCharAt13 < 55296) {
                    break;
                }
                i41 |= (cCharAt13 & 8191) << i42;
                i42 += 13;
                i40 = i38;
            }
            iCharAt2 = i41 | (cCharAt13 << i42);
            i40 = i38;
        }
        if (iCharAt2 == 0) {
            i12 = 0;
            iCharAt = 0;
            i11 = 0;
            i15 = 0;
            i10 = 0;
            i14 = 0;
            iArr = f19239r;
            i13 = 0;
        } else {
            int i43 = i40 + 1;
            int iCharAt3 = strE.charAt(i40);
            if (iCharAt3 >= 55296) {
                int i44 = iCharAt3 & 8191;
                int i45 = 13;
                while (true) {
                    i23 = i43 + 1;
                    cCharAt8 = strE.charAt(i43);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i23;
                }
                iCharAt3 = i44 | (cCharAt8 << i45);
                i43 = i23;
            }
            int i46 = i43 + 1;
            int iCharAt4 = strE.charAt(i43);
            if (iCharAt4 >= 55296) {
                int i47 = iCharAt4 & 8191;
                int i48 = 13;
                while (true) {
                    i22 = i46 + 1;
                    cCharAt7 = strE.charAt(i46);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i22;
                }
                iCharAt4 = i47 | (cCharAt7 << i48);
                i46 = i22;
            }
            int i49 = i46 + 1;
            int iCharAt5 = strE.charAt(i46);
            if (iCharAt5 >= 55296) {
                int i50 = iCharAt5 & 8191;
                int i51 = 13;
                while (true) {
                    i21 = i49 + 1;
                    cCharAt6 = strE.charAt(i49);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i21;
                }
                iCharAt5 = i50 | (cCharAt6 << i51);
                i49 = i21;
            }
            int i52 = i49 + 1;
            int iCharAt6 = strE.charAt(i49);
            if (iCharAt6 >= 55296) {
                int i53 = iCharAt6 & 8191;
                int i54 = 13;
                while (true) {
                    i20 = i52 + 1;
                    cCharAt5 = strE.charAt(i52);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i20;
                }
                iCharAt6 = i53 | (cCharAt5 << i54);
                i52 = i20;
            }
            int i55 = i52 + 1;
            iCharAt = strE.charAt(i52);
            if (iCharAt >= 55296) {
                int i56 = iCharAt & 8191;
                int i57 = 13;
                while (true) {
                    i19 = i55 + 1;
                    cCharAt4 = strE.charAt(i55);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i19;
                }
                iCharAt = i56 | (cCharAt4 << i57);
                i55 = i19;
            }
            int i58 = i55 + 1;
            int iCharAt7 = strE.charAt(i55);
            if (iCharAt7 >= 55296) {
                int i59 = iCharAt7 & 8191;
                int i60 = 13;
                while (true) {
                    i18 = i58 + 1;
                    cCharAt3 = strE.charAt(i58);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i18;
                }
                iCharAt7 = i59 | (cCharAt3 << i60);
                i58 = i18;
            }
            int i61 = i58 + 1;
            int iCharAt8 = strE.charAt(i58);
            if (iCharAt8 >= 55296) {
                int i62 = iCharAt8 & 8191;
                int i63 = 13;
                while (true) {
                    i17 = i61 + 1;
                    cCharAt2 = strE.charAt(i61);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt2 & 8191) << i63;
                    i63 += 13;
                    i61 = i17;
                }
                iCharAt8 = i62 | (cCharAt2 << i63);
                i61 = i17;
            }
            int i64 = i61 + 1;
            int iCharAt9 = strE.charAt(i61);
            if (iCharAt9 >= 55296) {
                int i65 = iCharAt9 & 8191;
                int i66 = 13;
                while (true) {
                    i16 = i64 + 1;
                    cCharAt = strE.charAt(i64);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i65 |= (cCharAt & 8191) << i66;
                    i66 += 13;
                    i64 = i16;
                }
                iCharAt9 = i65 | (cCharAt << i66);
                i64 = i16;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i10 = (iCharAt3 * 2) + iCharAt4;
            int i67 = iCharAt7;
            i11 = iCharAt5;
            i12 = i67;
            i13 = iCharAt3;
            iArr = iArr2;
            i14 = iCharAt9;
            i40 = i64;
            i15 = iCharAt6;
        }
        Unsafe unsafe = f19240s;
        Object[] objArrD = l0Var.d();
        Class<?> cls = l0Var.b().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i68 = i14 + i12;
        int i69 = i68;
        int i70 = i14;
        int i71 = 0;
        int i72 = 0;
        while (i40 < length) {
            int i73 = i40 + 1;
            int iCharAt10 = strE.charAt(i40);
            if (iCharAt10 >= c8) {
                int i74 = iCharAt10 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i37 = i75 + 1;
                    cCharAt12 = strE.charAt(i75);
                    if (cCharAt12 < c8) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i37;
                }
                iCharAt10 = i74 | (cCharAt12 << i76);
                i24 = i37;
            } else {
                i24 = i73;
            }
            int i77 = i24 + 1;
            int iCharAt11 = strE.charAt(i24);
            if (iCharAt11 >= c8) {
                int i78 = iCharAt11 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i36 = i79 + 1;
                    cCharAt11 = strE.charAt(i79);
                    if (cCharAt11 < c8) {
                        break;
                    }
                    i78 |= (cCharAt11 & 8191) << i80;
                    i80 += 13;
                    i79 = i36;
                }
                iCharAt11 = i78 | (cCharAt11 << i80);
                i25 = i36;
            } else {
                i25 = i77;
            }
            int i81 = iCharAt11 & 255;
            int i82 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int[] iArr4 = iArr3;
            if (i81 >= 51) {
                int i83 = i25 + 1;
                int iCharAt12 = strE.charAt(i25);
                char c9 = 55296;
                if (iCharAt12 >= 55296) {
                    int i84 = iCharAt12 & 8191;
                    int i85 = 13;
                    while (true) {
                        i35 = i83 + 1;
                        cCharAt10 = strE.charAt(i83);
                        if (cCharAt10 < c9) {
                            break;
                        }
                        i84 |= (cCharAt10 & 8191) << i85;
                        i85 += 13;
                        i83 = i35;
                        c9 = 55296;
                    }
                    iCharAt12 = i84 | (cCharAt10 << i85);
                    i83 = i35;
                }
                int i86 = i81 - 51;
                int i87 = i83;
                if (i86 == 9 || i86 == 17) {
                    i32 = i10 + 1;
                    objArr[((i72 / 3) * 2) + 1] = objArrD[i10];
                } else {
                    if (i86 == 12 && (l0Var.c().equals(i0.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i32 = i10 + 1;
                        objArr[((i72 / 3) * 2) + 1] = objArrD[i10];
                    }
                    i33 = iCharAt12 * 2;
                    obj = objArrD[i33];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldO1 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldO1 = o0(cls, (String) obj);
                        objArrD[i33] = fieldO1;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldO1);
                    i34 = i33 + 1;
                    obj2 = objArrD[i34];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldO2 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldO2 = o0(cls, (String) obj2);
                        objArrD[i34] = fieldO2;
                    }
                    strE = strE;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO2);
                    i30 = iObjectFieldOffset4;
                    i29 = 0;
                    i26 = iCharAt10;
                    i40 = i87;
                }
                i10 = i32;
                i33 = iCharAt12 * 2;
                obj = objArrD[i33];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldO1 = (java.lang.reflect.Field) obj;
                } else {
                    fieldO1 = o0(cls, (String) obj);
                    objArrD[i33] = fieldO1;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldO1);
                i34 = i33 + 1;
                obj2 = objArrD[i34];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldO2 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldO2 = o0(cls, (String) obj2);
                    objArrD[i34] = fieldO2;
                }
                strE = strE;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO2);
                i30 = iObjectFieldOffset5;
                i29 = 0;
                i26 = iCharAt10;
                i40 = i87;
            } else {
                int i88 = i10 + 1;
                java.lang.reflect.Field fieldO3 = o0(cls, (String) objArrD[i10]);
                if (i81 == 9 || i81 == 17) {
                    i26 = iCharAt10;
                    objArr[((i72 / 3) * 2) + 1] = fieldO3.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        i26 = iCharAt10;
                        i31 = i10 + 2;
                        objArr[((i72 / 3) * 2) + 1] = objArrD[i88];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        i26 = iCharAt10;
                        if (l0Var.c() == i0.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i31 = i10 + 2;
                            objArr[((i72 / 3) * 2) + 1] = objArrD[i88];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO3);
                        if ((iCharAt11 & 4096) != 0 || i81 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i28 = i25;
                            i29 = 0;
                        } else {
                            int i89 = i25 + 1;
                            int iCharAt13 = strE.charAt(i25);
                            if (iCharAt13 >= 55296) {
                                int i90 = iCharAt13 & 8191;
                                int i91 = 13;
                                while (true) {
                                    i28 = i89 + 1;
                                    cCharAt9 = strE.charAt(i89);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i90 |= (cCharAt9 & 8191) << i91;
                                    i91 += 13;
                                    i89 = i28;
                                }
                                iCharAt13 = i90 | (cCharAt9 << i91);
                            } else {
                                i28 = i89;
                            }
                            int i92 = (i13 * 2) + (iCharAt13 / 32);
                            Object obj3 = objArrD[i92];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldO0 = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldO0 = o0(cls, (String) obj3);
                                objArrD[i92] = fieldO0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO0);
                            i29 = iCharAt13 % 32;
                        }
                        int i93 = iObjectFieldOffset2;
                        if (i81 >= 18 && i81 <= 49) {
                            iArr[i69] = iObjectFieldOffset;
                            i69++;
                        }
                        iObjectFieldOffset3 = i93;
                        i30 = iObjectFieldOffset;
                        i10 = i27;
                        i40 = i28;
                    } else {
                        if (i81 == 50) {
                            int i94 = i70 + 1;
                            iArr[i70] = i72;
                            int i95 = (i72 / 3) * 2;
                            int i96 = i10 + 2;
                            objArr[i95] = objArrD[i88];
                            if ((iCharAt11 & 2048) != 0) {
                                i27 = i10 + 3;
                                objArr[i95 + 1] = objArrD[i96];
                                i26 = iCharAt10;
                                i70 = i94;
                            } else {
                                i27 = i96;
                                i70 = i94;
                                i26 = iCharAt10;
                            }
                        } else {
                            i26 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO3);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i28 = i25;
                            i29 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i28 = i25;
                            i29 = 0;
                        }
                        int i97 = iObjectFieldOffset2;
                        if (i81 >= 18) {
                            iArr[i69] = iObjectFieldOffset;
                            i69++;
                        }
                        iObjectFieldOffset3 = i97;
                        i30 = iObjectFieldOffset;
                        i10 = i27;
                        i40 = i28;
                    }
                    i27 = i31;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO3);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i28 = i25;
                        i29 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i28 = i25;
                        i29 = 0;
                    }
                    int i98 = iObjectFieldOffset2;
                    if (i81 >= 18) {
                        iArr[i69] = iObjectFieldOffset;
                        i69++;
                    }
                    iObjectFieldOffset3 = i98;
                    i30 = iObjectFieldOffset;
                    i10 = i27;
                    i40 = i28;
                }
                i27 = i88;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO3);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i28 = i25;
                    i29 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i28 = i25;
                    i29 = 0;
                }
                int i99 = iObjectFieldOffset2;
                if (i81 >= 18) {
                    iArr[i69] = iObjectFieldOffset;
                    i69++;
                }
                iObjectFieldOffset3 = i99;
                i30 = iObjectFieldOffset;
                i10 = i27;
                i40 = i28;
            }
            int i100 = i72 + 1;
            iArr4[i72] = i26;
            int i101 = i72 + 2;
            int i102 = iObjectFieldOffset3;
            iArr4[i100] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i81 << 20) | i30;
            i72 += 3;
            iArr4[i101] = (i29 << 20) | i102;
            length = i82;
            iArr3 = iArr4;
            strE = strE;
            c8 = 55296;
        }
        return new W(iArr3, objArr, i11, i15, l0Var.b(), l0Var.c(), false, iArr, i14, i68, interfaceC2087a0, i8, v0Var, rVar, n8);
    }

    public static long X(int i8) {
        return i8 & 1048575;
    }

    public static boolean Y(Object obj, long j8) {
        return ((Boolean) z0.G(obj, j8)).booleanValue();
    }

    public static double Z(Object obj, long j8) {
        return ((Double) z0.G(obj, j8)).doubleValue();
    }

    public static float a0(Object obj, long j8) {
        return ((Float) z0.G(obj, j8)).floatValue();
    }

    public static int b0(Object obj, long j8) {
        return ((Integer) z0.G(obj, j8)).intValue();
    }

    public static long c0(Object obj, long j8) {
        return ((Long) z0.G(obj, j8)).longValue();
    }

    public static boolean l(Object obj, long j8) {
        return z0.t(obj, j8);
    }

    public static void m(Object obj) {
        if (H(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static java.lang.reflect.Field o0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static double p(Object obj, long j8) {
        return z0.A(obj, j8);
    }

    public static float t(Object obj, long j8) {
        return z0.B(obj, j8);
    }

    public static int u0(int i8) {
        return (i8 & 267386880) >>> 20;
    }

    public static w0 x(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        w0 w0Var = generatedMessageLite.unknownFields;
        if (w0Var != w0.c()) {
            return w0Var;
        }
        w0 w0VarO = w0.o();
        generatedMessageLite.unknownFields = w0VarO;
        return w0VarO;
    }

    public static int z(Object obj, long j8) {
        return z0.C(obj, j8);
    }

    public final void A0(v0 v0Var, Object obj, D0 d8) {
        v0Var.t(v0Var.g(obj), d8);
    }

    public final boolean B(Object obj, int i8) {
        boolean zEquals;
        int iJ0 = j0(i8);
        long j8 = 1048575 & iJ0;
        if (j8 != 1048575) {
            return (z0.C(obj, j8) & (1 << (iJ0 >>> 20))) != 0;
        }
        int iV0 = v0(i8);
        long jX = X(iV0);
        switch (u0(iV0)) {
            case 0:
                return Double.doubleToRawLongBits(z0.A(obj, jX)) != 0;
            case 1:
                return Float.floatToRawIntBits(z0.B(obj, jX)) != 0;
            case 2:
                return z0.E(obj, jX) != 0;
            case 3:
                return z0.E(obj, jX) != 0;
            case 4:
                return z0.C(obj, jX) != 0;
            case 5:
                return z0.E(obj, jX) != 0;
            case 6:
                return z0.C(obj, jX) != 0;
            case 7:
                return z0.t(obj, jX);
            case 8:
                Object objG = z0.G(obj, jX);
                if (objG instanceof String) {
                    zEquals = ((String) objG).isEmpty();
                } else {
                    if (!(objG instanceof AbstractC2097h)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = AbstractC2097h.f19285b.equals(objG);
                }
                break;
            case 9:
                return z0.G(obj, jX) != null;
            case 10:
                zEquals = AbstractC2097h.f19285b.equals(z0.G(obj, jX));
                break;
            case 11:
                return z0.C(obj, jX) != 0;
            case 12:
                return z0.C(obj, jX) != 0;
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                return z0.C(obj, jX) != 0;
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                return z0.E(obj, jX) != 0;
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                return z0.C(obj, jX) != 0;
            case 16:
                return z0.E(obj, jX) != 0;
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                return z0.G(obj, jX) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    public final boolean C(Object obj, int i8, int i9, int i10, int i11) {
        if (i9 == 1048575) {
            return B(obj, i8);
        }
        return (i10 & i11) != 0;
    }

    public final boolean F(Object obj, int i8, int i9) {
        List list = (List) z0.G(obj, X(i8));
        if (list.isEmpty()) {
            return true;
        }
        n0 n0VarW = w(i9);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!n0VarW.d(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean G(Object obj, int i8, int i9) {
        Map mapH = this.f19257q.h(z0.G(obj, X(i8)));
        if (mapH.isEmpty()) {
            return true;
        }
        if (this.f19257q.c(v(i9)).f19210c.a() != C0.c.MESSAGE) {
            return true;
        }
        n0 n0VarC = null;
        for (Object obj2 : mapH.values()) {
            if (n0VarC == null) {
                n0VarC = j0.a().c(obj2.getClass());
            }
            if (!n0VarC.d(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean I(Object obj, Object obj2, int i8) {
        long jJ0 = j0(i8) & 1048575;
        return z0.C(obj, jJ0) == z0.C(obj2, jJ0);
    }

    public final boolean J(Object obj, int i8, int i9) {
        return z0.C(obj, (long) (j0(i9) & 1048575)) == i8;
    }

    /* JADX WARN: Code duplicated, block: B:240:0x06f8 A[Catch: all -> 0x0719, TRY_LEAVE, TryCatch #31 {all -> 0x0719, blocks: (B:238:0x06f2, B:240:0x06f8, B:251:0x071d, B:252:0x0722), top: B:297:0x06f2 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x0705 A[LOOP:2: B:243:0x0701->B:245:0x0705, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:250:0x071b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x071d A[Catch: all -> 0x0719, TRY_ENTER, TryCatch #31 {all -> 0x0719, blocks: (B:238:0x06f2, B:240:0x06f8, B:251:0x071d, B:252:0x0722), top: B:297:0x06f2 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x072f A[LOOP:3: B:255:0x072b->B:257:0x072f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:267:0x0752 A[LOOP:4: B:265:0x074e->B:267:0x0752, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:270:0x0765  */
    /* JADX WARN: Code duplicated, block: B:327:0x06fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0728 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:? A[RETURN, SYNTHETIC] */
    public final void M(v0 v0Var, r rVar, Object obj, m0 m0Var, C2106q c2106q) throws Throwable {
        Object obj2;
        int i8;
        Object objR;
        v0 v0Var2;
        W w8;
        Object obj3;
        Object objF;
        v0 v0Var3;
        r rVar2;
        Object objB;
        v0 v0Var4;
        int i9;
        Object objR2;
        int i10;
        m0 m0Var2;
        W w9;
        Object obj4;
        Object obj5;
        W w10 = this;
        C2106q c2106q2 = c2106q;
        C2110v c2110vD = null;
        Object objG = null;
        while (true) {
            try {
                int iB = m0Var.B();
                int iH0 = w10.h0(iB);
                if (iH0 >= 0) {
                    obj3 = obj;
                    c2106q = c2106q2;
                    objF = objG;
                    v0Var3 = v0Var;
                    m0 m0Var3 = m0Var;
                    try {
                        int iV0 = w10.v0(iH0);
                        try {
                            switch (u0(iV0)) {
                                case 0:
                                    z0.R(obj3, X(iV0), m0Var3.readDouble());
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 1:
                                    z0.S(obj3, X(iV0), m0Var3.readFloat());
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 2:
                                    z0.U(obj3, X(iV0), m0Var3.N());
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 3:
                                    z0.U(obj3, X(iV0), m0Var3.b());
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 4:
                                    z0.T(obj3, X(iV0), m0Var3.I());
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 5:
                                    z0.U(obj3, X(iV0), m0Var3.c());
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 6:
                                    z0.T(obj3, X(iV0), m0Var3.j());
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 7:
                                    z0.L(obj3, X(iV0), m0Var3.k());
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 8:
                                    w10.m0(obj3, iV0, m0Var3);
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 9:
                                    T t8 = (T) w10.R(obj3, iH0);
                                    m0Var3.D(t8, w10.w(iH0), c2106q);
                                    w10.s0(obj3, iH0, t8);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 10:
                                    z0.V(obj3, X(iV0), m0Var3.G());
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 11:
                                    z0.T(obj3, X(iV0), m0Var3.o());
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 12:
                                    int iT = m0Var3.t();
                                    A.e eVarU = w10.u(iH0);
                                    if (eVarU == null || eVarU.isInRange(iT)) {
                                        z0.T(obj3, X(iV0), iT);
                                        w10.p0(obj3, iH0);
                                        objG = objF;
                                    } else {
                                        objG = p0.J(obj3, iB, iT, objF, v0Var3);
                                    }
                                    c2106q2 = c2106q;
                                    break;
                                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                                    z0.T(obj3, X(iV0), m0Var3.K());
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                                    z0.U(obj3, X(iV0), m0Var3.m());
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                                    z0.T(obj3, X(iV0), m0Var3.w());
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 16:
                                    z0.U(obj3, X(iV0), m0Var3.x());
                                    w10.p0(obj3, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                                    T t9 = (T) w10.R(obj3, iH0);
                                    m0Var3.i(t9, w10.w(iH0), c2106q);
                                    w10.s0(obj3, iH0, t9);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 18:
                                    m0Var3.M(w10.f19254n.e(obj3, X(iV0)));
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 19:
                                    m0Var3.H(w10.f19254n.e(obj3, X(iV0)));
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 20:
                                    m0Var3.p(w10.f19254n.e(obj3, X(iV0)));
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 21:
                                    m0Var3.n(w10.f19254n.e(obj3, X(iV0)));
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                                    m0Var3.r(w10.f19254n.e(obj3, X(iV0)));
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                                    m0Var3.P(w10.f19254n.e(obj3, X(iV0)));
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 24:
                                    m0Var3.v(w10.f19254n.e(obj3, X(iV0)));
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 25:
                                    m0Var3.y(w10.f19254n.e(obj3, X(iV0)));
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 26:
                                    w10.n0(obj3, iV0, m0Var3);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 27:
                                    v0Var = v0Var3;
                                    obj2 = obj3;
                                    W w11 = w10;
                                    try {
                                        c2106q = c2106q;
                                        try {
                                            w10.l0(obj2, iV0, m0Var3, w11.w(iH0), c2106q);
                                            objG = objF;
                                        } catch (B.a unused) {
                                            objG = objF;
                                            try {
                                                if (v0Var.q(m0Var3)) {
                                                    if (objG == null) {
                                                        objG = v0Var.f(obj2);
                                                    }
                                                    if (!v0Var.m(objG, m0Var3)) {
                                                        objR2 = objG;
                                                        for (i9 = w10.f19251k; i9 < w10.f19252l; i9++) {
                                                            objR2 = w10.r(obj2, w10.f19250j[i9], objR2, v0Var, obj);
                                                        }
                                                        if (objR2 == null) {
                                                            return;
                                                        }
                                                        v0Var.o(obj2, objR2);
                                                        return;
                                                    }
                                                } else if (!m0Var3.J()) {
                                                    objR2 = objG;
                                                    for (i10 = w10.f19251k; i10 < w10.f19252l; i10++) {
                                                        objR2 = w10.r(obj2, w10.f19250j[i10], objR2, v0Var, obj);
                                                    }
                                                    if (objR2 == null) {
                                                        return;
                                                    }
                                                    v0Var.o(obj2, objR2);
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (B.a unused2) {
                                        c2106q = c2106q;
                                        w10 = w11;
                                        m0Var3 = m0Var3;
                                    }
                                    c2106q2 = c2106q;
                                    break;
                                case 28:
                                    m0Var2 = m0Var3;
                                    w9 = w10;
                                    m0Var2.L(w9.f19254n.e(obj3, X(iV0)));
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 29:
                                    m0Var2 = m0Var3;
                                    v0Var = v0Var3;
                                    obj2 = obj3;
                                    w9 = w10;
                                    try {
                                        try {
                                            m0Var2.g(w9.f19254n.e(obj2, X(iV0)));
                                            w10 = w9;
                                            objG = objF;
                                        } catch (B.a unused3) {
                                            w10 = w9;
                                            objG = objF;
                                            m0Var3 = m0Var2;
                                            if (v0Var.q(m0Var3)) {
                                                if (objG == null) {
                                                    objG = v0Var.f(obj2);
                                                }
                                                if (!v0Var.m(objG, m0Var3)) {
                                                    objR2 = objG;
                                                    while (i9 < w10.f19252l) {
                                                        objR2 = w10.r(obj2, w10.f19250j[i9], objR2, v0Var, obj);
                                                    }
                                                    if (objR2 == null) {
                                                        return;
                                                    }
                                                    v0Var.o(obj2, objR2);
                                                    return;
                                                }
                                            } else if (!m0Var3.J()) {
                                                objR2 = objG;
                                                while (i10 < w10.f19252l) {
                                                    objR2 = w10.r(obj2, w10.f19250j[i10], objR2, v0Var, obj);
                                                }
                                                if (objR2 == null) {
                                                    return;
                                                }
                                                v0Var.o(obj2, objR2);
                                                return;
                                            }
                                        }
                                        c2106q2 = c2106q;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        w10 = w9;
                                        objG = objF;
                                        i8 = w10.f19251k;
                                        objR = objG;
                                        while (i8 < w10.f19252l) {
                                            objR = w10.r(obj2, w10.f19250j[i8], objR, v0Var, obj);
                                            i8++;
                                            w10 = this;
                                        }
                                        v0Var2 = v0Var;
                                        if (objR != null) {
                                            v0Var2.o(obj2, objR);
                                        }
                                        throw th;
                                    }
                                    break;
                                case 30:
                                    w9 = w10;
                                    obj2 = obj3;
                                    m0Var2 = m0Var3;
                                    objG = objF;
                                    try {
                                        List listE = w9.f19254n.e(obj2, X(iV0));
                                        m0Var2.s(listE);
                                        obj4 = obj2;
                                        try {
                                            objG = p0.A(obj4, iB, listE, w9.u(iH0), objG, v0Var);
                                            c2106q = c2106q;
                                            w10 = w9;
                                        } catch (B.a unused4) {
                                            v0Var = v0Var;
                                            obj2 = obj4;
                                            w10 = w9;
                                            m0Var3 = m0Var2;
                                            if (v0Var.q(m0Var3)) {
                                                if (objG == null) {
                                                    objG = v0Var.f(obj2);
                                                }
                                                if (!v0Var.m(objG, m0Var3)) {
                                                    objR2 = objG;
                                                    while (i9 < w10.f19252l) {
                                                        objR2 = w10.r(obj2, w10.f19250j[i9], objR2, v0Var, obj);
                                                    }
                                                    if (objR2 == null) {
                                                        return;
                                                    }
                                                    v0Var.o(obj2, objR2);
                                                    return;
                                                }
                                            } else if (!m0Var3.J()) {
                                                objR2 = objG;
                                                while (i10 < w10.f19252l) {
                                                    objR2 = w10.r(obj2, w10.f19250j[i10], objR2, v0Var, obj);
                                                }
                                                if (objR2 == null) {
                                                    return;
                                                }
                                                v0Var.o(obj2, objR2);
                                                return;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj2 = obj4;
                                            v0Var = v0Var;
                                            w10 = w9;
                                            i8 = w10.f19251k;
                                            objR = objG;
                                            while (i8 < w10.f19252l) {
                                                objR = w10.r(obj2, w10.f19250j[i8], objR, v0Var, obj);
                                                i8++;
                                                w10 = this;
                                            }
                                            v0Var2 = v0Var;
                                            if (objR != null) {
                                                v0Var2.o(obj2, objR);
                                            }
                                            throw th;
                                        }
                                        break;
                                    } catch (B.a unused5) {
                                        w10 = w9;
                                        m0Var3 = m0Var2;
                                        if (v0Var.q(m0Var3)) {
                                            if (objG == null) {
                                                objG = v0Var.f(obj2);
                                            }
                                            if (!v0Var.m(objG, m0Var3)) {
                                                objR2 = objG;
                                                while (i9 < w10.f19252l) {
                                                    objR2 = w10.r(obj2, w10.f19250j[i9], objR2, v0Var, obj);
                                                }
                                                if (objR2 == null) {
                                                    return;
                                                }
                                                v0Var.o(obj2, objR2);
                                                return;
                                            }
                                        } else if (!m0Var3.J()) {
                                            objR2 = objG;
                                            while (i10 < w10.f19252l) {
                                                objR2 = w10.r(obj2, w10.f19250j[i10], objR2, v0Var, obj);
                                            }
                                            if (objR2 == null) {
                                                return;
                                            }
                                            v0Var.o(obj2, objR2);
                                            return;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        v0Var = v0Var;
                                    }
                                    c2106q2 = c2106q;
                                    break;
                                case 31:
                                    m0Var2 = m0Var3;
                                    objG = objF;
                                    w9 = w10;
                                    m0Var2.d(w9.f19254n.e(obj3, X(iV0)));
                                    objF = objG;
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 32:
                                    m0Var2 = m0Var3;
                                    objG = objF;
                                    w9 = w10;
                                    m0Var2.q(w9.f19254n.e(obj3, X(iV0)));
                                    objF = objG;
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 33:
                                    m0Var2 = m0Var3;
                                    objG = objF;
                                    w9 = w10;
                                    m0Var2.a(w9.f19254n.e(obj3, X(iV0)));
                                    objF = objG;
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 34:
                                    m0Var2 = m0Var3;
                                    objG = objF;
                                    w9 = w10;
                                    m0Var2.e(w9.f19254n.e(obj3, X(iV0)));
                                    objF = objG;
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 35:
                                    m0Var2 = m0Var3;
                                    objG = objF;
                                    w9 = w10;
                                    m0Var2.M(w9.f19254n.e(obj3, X(iV0)));
                                    objF = objG;
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 36:
                                    m0Var2 = m0Var3;
                                    objG = objF;
                                    w9 = w10;
                                    m0Var2.H(w9.f19254n.e(obj3, X(iV0)));
                                    objF = objG;
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 37:
                                    m0Var2 = m0Var3;
                                    objG = objF;
                                    w9 = w10;
                                    m0Var2.p(w9.f19254n.e(obj3, X(iV0)));
                                    objF = objG;
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 38:
                                    m0Var2 = m0Var3;
                                    objG = objF;
                                    w9 = w10;
                                    m0Var2.n(w9.f19254n.e(obj3, X(iV0)));
                                    objF = objG;
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 39:
                                    m0Var2 = m0Var3;
                                    objG = objF;
                                    w9 = w10;
                                    m0Var2.r(w9.f19254n.e(obj3, X(iV0)));
                                    objF = objG;
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case Messages.ServerMessage.ICON_FIELD_NUMBER /* 40 */:
                                    m0Var2 = m0Var3;
                                    objG = objF;
                                    w9 = w10;
                                    m0Var2.P(w9.f19254n.e(obj3, X(iV0)));
                                    objF = objG;
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 41:
                                    m0Var2 = m0Var3;
                                    objG = objF;
                                    w9 = w10;
                                    m0Var2.v(w9.f19254n.e(obj3, X(iV0)));
                                    objF = objG;
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 42:
                                    m0Var2 = m0Var3;
                                    objG = objF;
                                    w9 = w10;
                                    m0Var2.y(w9.f19254n.e(obj3, X(iV0)));
                                    objF = objG;
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 43:
                                    m0Var2 = m0Var3;
                                    obj2 = obj3;
                                    objG = objF;
                                    w9 = w10;
                                    try {
                                        m0Var2.g(w9.f19254n.e(obj2, X(iV0)));
                                        objF = objG;
                                        w10 = w9;
                                        objG = objF;
                                    } catch (B.a unused6) {
                                        w10 = w9;
                                        m0Var3 = m0Var2;
                                        if (v0Var.q(m0Var3)) {
                                            if (objG == null) {
                                                objG = v0Var.f(obj2);
                                            }
                                            if (!v0Var.m(objG, m0Var3)) {
                                                objR2 = objG;
                                                while (i9 < w10.f19252l) {
                                                    objR2 = w10.r(obj2, w10.f19250j[i9], objR2, v0Var, obj);
                                                }
                                                if (objR2 == null) {
                                                    return;
                                                }
                                                v0Var.o(obj2, objR2);
                                                return;
                                            }
                                        } else if (!m0Var3.J()) {
                                            objR2 = objG;
                                            while (i10 < w10.f19252l) {
                                                objR2 = w10.r(obj2, w10.f19250j[i10], objR2, v0Var, obj);
                                            }
                                            if (objR2 == null) {
                                                return;
                                            }
                                            v0Var.o(obj2, objR2);
                                            return;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        v0Var = v0Var;
                                        w10 = w9;
                                        i8 = w10.f19251k;
                                        objR = objG;
                                        while (i8 < w10.f19252l) {
                                            objR = w10.r(obj2, w10.f19250j[i8], objR, v0Var, obj);
                                            i8++;
                                            w10 = this;
                                        }
                                        v0Var2 = v0Var;
                                        if (objR != null) {
                                            v0Var2.o(obj2, objR);
                                        }
                                        throw th;
                                    }
                                    c2106q2 = c2106q;
                                    break;
                                case 44:
                                    w9 = w10;
                                    obj4 = obj3;
                                    m0Var2 = m0Var3;
                                    try {
                                        List listE2 = w9.f19254n.e(obj4, X(iV0));
                                        m0Var2.s(listE2);
                                        objG = objF;
                                        try {
                                            objG = p0.A(obj4, iB, listE2, w9.u(iH0), objG, v0Var3);
                                            c2106q = c2106q;
                                            w10 = w9;
                                        } catch (B.a unused7) {
                                            v0Var = v0Var;
                                            obj2 = obj4;
                                            w10 = w9;
                                            m0Var3 = m0Var2;
                                            if (v0Var.q(m0Var3)) {
                                                if (objG == null) {
                                                    objG = v0Var.f(obj2);
                                                }
                                                if (!v0Var.m(objG, m0Var3)) {
                                                    objR2 = objG;
                                                    while (i9 < w10.f19252l) {
                                                        objR2 = w10.r(obj2, w10.f19250j[i9], objR2, v0Var, obj);
                                                    }
                                                    if (objR2 == null) {
                                                        return;
                                                    }
                                                    v0Var.o(obj2, objR2);
                                                    return;
                                                }
                                            } else if (!m0Var3.J()) {
                                                objR2 = objG;
                                                while (i10 < w10.f19252l) {
                                                    objR2 = w10.r(obj2, w10.f19250j[i10], objR2, v0Var, obj);
                                                }
                                                if (objR2 == null) {
                                                    return;
                                                }
                                                v0Var.o(obj2, objR2);
                                                return;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            obj2 = obj4;
                                            v0Var = v0Var;
                                            w10 = w9;
                                            i8 = w10.f19251k;
                                            objR = objG;
                                            while (i8 < w10.f19252l) {
                                                objR = w10.r(obj2, w10.f19250j[i8], objR, v0Var, obj);
                                                i8++;
                                                w10 = this;
                                            }
                                            v0Var2 = v0Var;
                                            if (objR != null) {
                                                v0Var2.o(obj2, objR);
                                            }
                                            throw th;
                                        }
                                    } catch (B.a unused8) {
                                        objG = objF;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        obj2 = obj4;
                                        objG = objF;
                                    }
                                    c2106q2 = c2106q;
                                    break;
                                case 45:
                                    w9 = w10;
                                    obj5 = obj3;
                                    m0Var2 = m0Var3;
                                    m0Var2.d(w9.f19254n.e(obj5, X(iV0)));
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 46:
                                    w9 = w10;
                                    obj5 = obj3;
                                    m0Var2 = m0Var3;
                                    m0Var2.q(w9.f19254n.e(obj5, X(iV0)));
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 47:
                                    w9 = w10;
                                    obj5 = obj3;
                                    m0Var2 = m0Var3;
                                    m0Var2.a(w9.f19254n.e(obj5, X(iV0)));
                                    w10 = w9;
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 48:
                                    w9 = w10;
                                    obj5 = obj3;
                                    m0Var2 = m0Var3;
                                    v0Var = v0Var3;
                                    try {
                                        m0Var2.e(w9.f19254n.e(obj5, X(iV0)));
                                        w10 = w9;
                                        objG = objF;
                                    } catch (B.a unused9) {
                                        obj2 = obj5;
                                        w10 = w9;
                                        objG = objF;
                                        m0Var3 = m0Var2;
                                        if (v0Var.q(m0Var3)) {
                                            if (objG == null) {
                                                objG = v0Var.f(obj2);
                                            }
                                            if (!v0Var.m(objG, m0Var3)) {
                                                objR2 = objG;
                                                while (i9 < w10.f19252l) {
                                                    objR2 = w10.r(obj2, w10.f19250j[i9], objR2, v0Var, obj);
                                                }
                                                if (objR2 == null) {
                                                    return;
                                                }
                                                v0Var.o(obj2, objR2);
                                                return;
                                            }
                                        } else if (!m0Var3.J()) {
                                            objR2 = objG;
                                            while (i10 < w10.f19252l) {
                                                objR2 = w10.r(obj2, w10.f19250j[i10], objR2, v0Var, obj);
                                            }
                                            if (objR2 == null) {
                                                return;
                                            }
                                            v0Var.o(obj2, objR2);
                                            return;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        obj2 = obj5;
                                        w10 = w9;
                                        objG = objF;
                                        i8 = w10.f19251k;
                                        objR = objG;
                                        while (i8 < w10.f19252l) {
                                            objR = w10.r(obj2, w10.f19250j[i8], objR, v0Var, obj);
                                            i8++;
                                            w10 = this;
                                        }
                                        v0Var2 = v0Var;
                                        if (objR != null) {
                                            v0Var2.o(obj2, objR);
                                        }
                                        throw th;
                                    }
                                    c2106q2 = c2106q;
                                    break;
                                case 49:
                                    v0Var = v0Var3;
                                    try {
                                        obj2 = obj;
                                        try {
                                            w10.k0(obj2, X(iV0), m0Var, w10.w(iH0), c2106q);
                                            w9 = w10;
                                            obj5 = obj2;
                                            m0Var2 = m0Var;
                                            w10 = w9;
                                            objG = objF;
                                        } catch (B.a unused10) {
                                            c2106q = c2106q;
                                            m0Var3 = m0Var;
                                            objG = objF;
                                            if (v0Var.q(m0Var3)) {
                                                if (objG == null) {
                                                    objG = v0Var.f(obj2);
                                                }
                                                if (!v0Var.m(objG, m0Var3)) {
                                                    objR2 = objG;
                                                    while (i9 < w10.f19252l) {
                                                        objR2 = w10.r(obj2, w10.f19250j[i9], objR2, v0Var, obj);
                                                    }
                                                    if (objR2 == null) {
                                                        return;
                                                    }
                                                    v0Var.o(obj2, objR2);
                                                    return;
                                                }
                                            } else if (!m0Var3.J()) {
                                                objR2 = objG;
                                                while (i10 < w10.f19252l) {
                                                    objR2 = w10.r(obj2, w10.f19250j[i10], objR2, v0Var, obj);
                                                }
                                                if (objR2 == null) {
                                                    return;
                                                }
                                                v0Var.o(obj2, objR2);
                                                return;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            w9 = w10;
                                            w10 = w9;
                                            objG = objF;
                                            i8 = w10.f19251k;
                                            objR = objG;
                                            while (i8 < w10.f19252l) {
                                                objR = w10.r(obj2, w10.f19250j[i8], objR, v0Var, obj);
                                                i8++;
                                                w10 = this;
                                            }
                                            v0Var2 = v0Var;
                                            if (objR != null) {
                                                v0Var2.o(obj2, objR);
                                            }
                                            throw th;
                                        }
                                        c2106q2 = c2106q;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        w9 = w10;
                                        obj5 = obj;
                                        obj2 = obj5;
                                        w10 = w9;
                                        objG = objF;
                                        i8 = w10.f19251k;
                                        objR = objG;
                                        while (i8 < w10.f19252l) {
                                            objR = w10.r(obj2, w10.f19250j[i8], objR, v0Var, obj);
                                            i8++;
                                            w10 = this;
                                        }
                                        v0Var2 = v0Var;
                                        if (objR != null) {
                                            v0Var2.o(obj2, objR);
                                        }
                                        throw th;
                                    }
                                    break;
                                case 50:
                                    v0Var = v0Var3;
                                    try {
                                        try {
                                            w10.N(obj3, iH0, w10.v(iH0), c2106q, m0Var);
                                            c2106q = c2106q;
                                            objG = objF;
                                        } catch (Throwable th12) {
                                            th = th12;
                                            obj2 = obj;
                                        }
                                        break;
                                    } catch (B.a unused11) {
                                        obj2 = obj;
                                        m0Var3 = m0Var;
                                        c2106q = c2106q;
                                        objG = objF;
                                        if (v0Var.q(m0Var3)) {
                                            if (objG == null) {
                                                objG = v0Var.f(obj2);
                                            }
                                            if (!v0Var.m(objG, m0Var3)) {
                                                objR2 = objG;
                                                while (i9 < w10.f19252l) {
                                                    objR2 = w10.r(obj2, w10.f19250j[i9], objR2, v0Var, obj);
                                                }
                                                if (objR2 == null) {
                                                    return;
                                                }
                                                v0Var.o(obj2, objR2);
                                                return;
                                            }
                                        } else if (!m0Var3.J()) {
                                            objR2 = objG;
                                            while (i10 < w10.f19252l) {
                                                objR2 = w10.r(obj2, w10.f19250j[i10], objR2, v0Var, obj);
                                            }
                                            if (objR2 == null) {
                                                return;
                                            }
                                            v0Var.o(obj2, objR2);
                                            return;
                                        }
                                    }
                                    c2106q2 = c2106q;
                                    break;
                                case 51:
                                    z0.V(obj3, X(iV0), Double.valueOf(m0Var3.readDouble()));
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 52:
                                    z0.V(obj3, X(iV0), Float.valueOf(m0Var3.readFloat()));
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 53:
                                    z0.V(obj3, X(iV0), Long.valueOf(m0Var3.N()));
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 54:
                                    z0.V(obj3, X(iV0), Long.valueOf(m0Var3.b()));
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 55:
                                    z0.V(obj3, X(iV0), Integer.valueOf(m0Var3.I()));
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 56:
                                    z0.V(obj3, X(iV0), Long.valueOf(m0Var3.c()));
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 57:
                                    z0.V(obj3, X(iV0), Integer.valueOf(m0Var3.j()));
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 58:
                                    z0.V(obj3, X(iV0), Boolean.valueOf(m0Var3.k()));
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 59:
                                    w10.m0(obj3, iV0, m0Var3);
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 60:
                                    T t10 = (T) w10.S(obj3, iB, iH0);
                                    m0Var3.D(t10, w10.w(iH0), c2106q);
                                    w10.t0(obj3, iB, iH0, t10);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 61:
                                    z0.V(obj3, X(iV0), m0Var3.G());
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 62:
                                    z0.V(obj3, X(iV0), Integer.valueOf(m0Var3.o()));
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 63:
                                    int iT2 = m0Var3.t();
                                    A.e eVarU2 = w10.u(iH0);
                                    if (eVarU2 == null || eVarU2.isInRange(iT2)) {
                                        z0.V(obj3, X(iV0), Integer.valueOf(iT2));
                                        w10.q0(obj3, iB, iH0);
                                        objG = objF;
                                    } else {
                                        objG = p0.J(obj3, iB, iT2, objF, v0Var3);
                                    }
                                    c2106q2 = c2106q;
                                    break;
                                case 64:
                                    z0.V(obj3, X(iV0), Integer.valueOf(m0Var3.K()));
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 65:
                                    z0.V(obj3, X(iV0), Long.valueOf(m0Var3.m()));
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 66:
                                    z0.V(obj3, X(iV0), Integer.valueOf(m0Var3.w()));
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 67:
                                    z0.V(obj3, X(iV0), Long.valueOf(m0Var3.x()));
                                    w10.q0(obj3, iB, iH0);
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                case 68:
                                    v0Var = v0Var3;
                                    try {
                                        T t11 = (T) w10.S(obj3, iB, iH0);
                                        m0Var3.i(t11, w10.w(iH0), c2106q);
                                        w10.t0(obj3, iB, iH0, t11);
                                        objG = objF;
                                    } catch (B.a unused12) {
                                        obj2 = obj3;
                                        objG = objF;
                                        if (v0Var.q(m0Var3)) {
                                            if (objG == null) {
                                                objG = v0Var.f(obj2);
                                            }
                                            if (!v0Var.m(objG, m0Var3)) {
                                                objR2 = objG;
                                                while (i9 < w10.f19252l) {
                                                    objR2 = w10.r(obj2, w10.f19250j[i9], objR2, v0Var, obj);
                                                }
                                                if (objR2 == null) {
                                                    return;
                                                }
                                                v0Var.o(obj2, objR2);
                                                return;
                                            }
                                        } else if (!m0Var3.J()) {
                                            objR2 = objG;
                                            while (i10 < w10.f19252l) {
                                                objR2 = w10.r(obj2, w10.f19250j[i10], objR2, v0Var, obj);
                                            }
                                            if (objR2 == null) {
                                                return;
                                            }
                                            v0Var.o(obj2, objR2);
                                            return;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        obj2 = obj3;
                                        objG = objF;
                                        i8 = w10.f19251k;
                                        objR = objG;
                                        while (i8 < w10.f19252l) {
                                            objR = w10.r(obj2, w10.f19250j[i8], objR, v0Var, obj);
                                            i8++;
                                            w10 = this;
                                        }
                                        v0Var2 = v0Var;
                                        if (objR != null) {
                                            v0Var2.o(obj2, objR);
                                        }
                                        throw th;
                                    }
                                    c2106q2 = c2106q;
                                    break;
                                default:
                                    if (objF == null) {
                                        objF = v0Var3.f(obj3);
                                    }
                                    if (!v0Var3.m(objF, m0Var3)) {
                                        Object objR3 = objF;
                                        for (int i11 = w10.f19251k; i11 < w10.f19252l; i11++) {
                                            objR3 = w10.r(obj3, w10.f19250j[i11], objR3, v0Var3, obj);
                                        }
                                        if (objR3 != null) {
                                            v0Var3.o(obj3, objR3);
                                            return;
                                        }
                                        return;
                                    }
                                    objG = objF;
                                    c2106q2 = c2106q;
                                    break;
                                    break;
                            }
                        } catch (B.a unused13) {
                            v0Var = v0Var3;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        v0Var = v0Var3;
                        obj2 = obj3;
                        objG = objF;
                        i8 = w10.f19251k;
                        objR = objG;
                        while (i8 < w10.f19252l) {
                            objR = w10.r(obj2, w10.f19250j[i8], objR, v0Var, obj);
                            i8++;
                            w10 = this;
                        }
                        v0Var2 = v0Var;
                        if (objR != null) {
                            v0Var2.o(obj2, objR);
                        }
                        throw th;
                    }
                } else {
                    if (iB == Integer.MAX_VALUE) {
                        int i12 = w10.f19251k;
                        Object objR4 = objG;
                        while (i12 < w10.f19252l) {
                            objR4 = w10.r(obj, w10.f19250j[i12], objR4, v0Var, obj);
                            i12++;
                            w10 = w10;
                        }
                        if (objR4 != null) {
                            v0Var.o(obj, objR4);
                        }
                        return;
                    }
                    w8 = w10;
                    try {
                        if (w8.f19246f) {
                            rVar2 = rVar;
                            objB = rVar2.b(c2106q2, w8.f19245e, iB);
                        } else {
                            rVar2 = rVar;
                            objB = null;
                        }
                        if (objB != null) {
                            if (c2110vD == null) {
                                try {
                                    c2110vD = rVar.d(obj);
                                } catch (Throwable th15) {
                                    th = th15;
                                    obj2 = obj;
                                    v0Var = v0Var;
                                    w10 = w8;
                                }
                            }
                            Object obj6 = objG;
                            C2110v c2110v = c2110vD;
                            try {
                                c2110vD = c2110v;
                                objG = rVar2.g(obj, m0Var, objB, c2106q2, c2110v, obj6, v0Var);
                                c2106q2 = c2106q2;
                                w10 = w8;
                            } catch (Throwable th16) {
                                th = th16;
                                obj2 = obj;
                                objF = obj6;
                                v0Var4 = v0Var;
                                v0Var = v0Var4;
                                w10 = w8;
                                objG = objF;
                                i8 = w10.f19251k;
                                objR = objG;
                                while (i8 < w10.f19252l) {
                                    objR = w10.r(obj2, w10.f19250j[i8], objR, v0Var, obj);
                                    i8++;
                                    w10 = this;
                                }
                                v0Var2 = v0Var;
                                if (objR != null) {
                                    v0Var2.o(obj2, objR);
                                }
                                throw th;
                            }
                        } else {
                            obj2 = obj;
                            objF = objG;
                            v0Var4 = v0Var;
                            C2106q c2106q3 = c2106q2;
                            try {
                                if (v0Var4.q(m0Var)) {
                                    try {
                                        if (!m0Var.J()) {
                                        }
                                        c2106q2 = c2106q3;
                                        w10 = w8;
                                        objG = objF;
                                    } catch (Throwable th17) {
                                        th = th17;
                                        v0Var = v0Var4;
                                        w10 = w8;
                                        objG = objF;
                                        i8 = w10.f19251k;
                                        objR = objG;
                                        while (i8 < w10.f19252l) {
                                            objR = w10.r(obj2, w10.f19250j[i8], objR, v0Var, obj);
                                            i8++;
                                            w10 = this;
                                        }
                                        v0Var2 = v0Var;
                                        if (objR != null) {
                                            v0Var2.o(obj2, objR);
                                        }
                                        throw th;
                                    }
                                } else {
                                    if (objF == null) {
                                        objF = v0Var4.f(obj2);
                                    }
                                    if (!v0Var4.m(objF, m0Var)) {
                                    }
                                    c2106q2 = c2106q3;
                                    w10 = w8;
                                    objG = objF;
                                }
                            } catch (Throwable th18) {
                                th = th18;
                                w10 = w8;
                                v0Var = v0Var4;
                            }
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        obj3 = obj;
                        objF = objG;
                        v0Var3 = v0Var;
                        w10 = w8;
                        v0Var = v0Var3;
                        obj2 = obj3;
                    }
                }
                objG = objF;
            } catch (Throwable th20) {
                th = th20;
                v0Var = v0Var;
                obj2 = obj;
            }
            i8 = w10.f19251k;
            objR = objG;
            while (i8 < w10.f19252l) {
                objR = w10.r(obj2, w10.f19250j[i8], objR, v0Var, obj);
                i8++;
                w10 = this;
            }
            v0Var2 = v0Var;
            if (objR != null) {
                v0Var2.o(obj2, objR);
            }
            throw th;
        }
        Object objR5 = objF;
        for (int i13 = w8.f19251k; i13 < w8.f19252l; i13++) {
            objR5 = w8.r(obj2, w8.f19250j[i13], objR5, v0Var4, obj);
        }
        if (objR5 != null) {
            v0Var4.o(obj2, objR5);
        }
    }

    public final void N(Object obj, int i8, Object obj2, C2106q c2106q, m0 m0Var) {
        long jX = X(v0(i8));
        Object objG = z0.G(obj, jX);
        if (objG == null) {
            objG = this.f19257q.e(obj2);
            z0.V(obj, jX, objG);
        } else if (this.f19257q.g(objG)) {
            Object objE = this.f19257q.e(obj2);
            this.f19257q.a(objE, objG);
            z0.V(obj, jX, objE);
            objG = objE;
        }
        m0Var.E(this.f19257q.d(objG), this.f19257q.c(obj2), c2106q);
    }

    public final void O(Object obj, Object obj2, int i8) {
        if (B(obj2, i8)) {
            long jX = X(v0(i8));
            Unsafe unsafe = f19240s;
            Object object = unsafe.getObject(obj2, jX);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + W(i8) + " is present but null: " + obj2);
            }
            n0 n0VarW = w(i8);
            if (!B(obj, i8)) {
                if (H(object)) {
                    Object objI = n0VarW.i();
                    n0VarW.a(objI, object);
                    unsafe.putObject(obj, jX, objI);
                } else {
                    unsafe.putObject(obj, jX, object);
                }
                p0(obj, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, jX);
            if (!H(object2)) {
                Object objI2 = n0VarW.i();
                n0VarW.a(objI2, object2);
                unsafe.putObject(obj, jX, objI2);
                object2 = objI2;
            }
            n0VarW.a(object2, object);
        }
    }

    public final void P(Object obj, Object obj2, int i8) {
        int iW = W(i8);
        if (J(obj2, iW, i8)) {
            long jX = X(v0(i8));
            Unsafe unsafe = f19240s;
            Object object = unsafe.getObject(obj2, jX);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + W(i8) + " is present but null: " + obj2);
            }
            n0 n0VarW = w(i8);
            if (!J(obj, iW, i8)) {
                if (H(object)) {
                    Object objI = n0VarW.i();
                    n0VarW.a(objI, object);
                    unsafe.putObject(obj, jX, objI);
                } else {
                    unsafe.putObject(obj, jX, object);
                }
                q0(obj, iW, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, jX);
            if (!H(object2)) {
                Object objI2 = n0VarW.i();
                n0VarW.a(objI2, object2);
                unsafe.putObject(obj, jX, objI2);
                object2 = objI2;
            }
            n0VarW.a(object2, object);
        }
    }

    public final void Q(Object obj, Object obj2, int i8) {
        int iV0 = v0(i8);
        long jX = X(iV0);
        int iW = W(i8);
        switch (u0(iV0)) {
            case 0:
                if (B(obj2, i8)) {
                    z0.R(obj, jX, z0.A(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case 1:
                if (B(obj2, i8)) {
                    z0.S(obj, jX, z0.B(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case 2:
                if (B(obj2, i8)) {
                    z0.U(obj, jX, z0.E(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case 3:
                if (B(obj2, i8)) {
                    z0.U(obj, jX, z0.E(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case 4:
                if (B(obj2, i8)) {
                    z0.T(obj, jX, z0.C(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case 5:
                if (B(obj2, i8)) {
                    z0.U(obj, jX, z0.E(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case 6:
                if (B(obj2, i8)) {
                    z0.T(obj, jX, z0.C(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case 7:
                if (B(obj2, i8)) {
                    z0.L(obj, jX, z0.t(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case 8:
                if (B(obj2, i8)) {
                    z0.V(obj, jX, z0.G(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case 9:
                O(obj, obj2, i8);
                break;
            case 10:
                if (B(obj2, i8)) {
                    z0.V(obj, jX, z0.G(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case 11:
                if (B(obj2, i8)) {
                    z0.T(obj, jX, z0.C(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case 12:
                if (B(obj2, i8)) {
                    z0.T(obj, jX, z0.C(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                if (B(obj2, i8)) {
                    z0.T(obj, jX, z0.C(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                if (B(obj2, i8)) {
                    z0.U(obj, jX, z0.E(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                if (B(obj2, i8)) {
                    z0.T(obj, jX, z0.C(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case 16:
                if (B(obj2, i8)) {
                    z0.U(obj, jX, z0.E(obj2, jX));
                    p0(obj, i8);
                }
                break;
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                O(obj, obj2, i8);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
            case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case Messages.ServerMessage.ICON_FIELD_NUMBER /* 40 */:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f19254n.d(obj, obj2, jX);
                break;
            case 50:
                p0.F(this.f19257q, obj, obj2, jX);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (J(obj2, iW, i8)) {
                    z0.V(obj, jX, z0.G(obj2, jX));
                    q0(obj, iW, i8);
                }
                break;
            case 60:
                P(obj, obj2, i8);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (J(obj2, iW, i8)) {
                    z0.V(obj, jX, z0.G(obj2, jX));
                    q0(obj, iW, i8);
                }
                break;
            case 68:
                P(obj, obj2, i8);
                break;
        }
    }

    public final Object R(Object obj, int i8) {
        n0 n0VarW = w(i8);
        long jX = X(v0(i8));
        if (!B(obj, i8)) {
            return n0VarW.i();
        }
        Object object = f19240s.getObject(obj, jX);
        if (H(object)) {
            return object;
        }
        Object objI = n0VarW.i();
        if (object != null) {
            n0VarW.a(objI, object);
        }
        return objI;
    }

    public final Object S(Object obj, int i8, int i9) {
        n0 n0VarW = w(i9);
        if (!J(obj, i8, i9)) {
            return n0VarW.i();
        }
        Object object = f19240s.getObject(obj, X(v0(i9)));
        if (H(object)) {
            return object;
        }
        Object objI = n0VarW.i();
        if (object != null) {
            n0VarW.a(objI, object);
        }
        return objI;
    }

    public final int W(int i8) {
        return this.f19241a[i8];
    }

    @Override // com.google.protobuf.n0
    public void a(Object obj, Object obj2) {
        m(obj);
        obj2.getClass();
        for (int i8 = 0; i8 < this.f19241a.length; i8 += 3) {
            Q(obj, obj2, i8);
        }
        p0.G(this.f19255o, obj, obj2);
        if (this.f19246f) {
            p0.E(this.f19256p, obj, obj2);
        }
    }

    @Override // com.google.protobuf.n0
    public void b(Object obj, D0 d8) {
        if (d8.l() == D0.a.DESCENDING) {
            x0(obj, d8);
        } else {
            w0(obj, d8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    @Override // com.google.protobuf.n0
    public void c(Object obj) {
        if (H(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.f19241a.length;
            for (int i8 = 0; i8 < length; i8 += 3) {
                int iV0 = v0(i8);
                long jX = X(iV0);
                int iU0 = u0(iV0);
                if (iU0 != 9) {
                    if (iU0 != 60 && iU0 != 68) {
                        switch (iU0) {
                            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                                if (B(obj, i8)) {
                                    w(i8).c(f19240s.getObject(obj, jX));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                            case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case Messages.ServerMessage.ICON_FIELD_NUMBER /* 40 */:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f19254n.c(obj, jX);
                                break;
                            case 50:
                                Unsafe unsafe = f19240s;
                                Object object = unsafe.getObject(obj, jX);
                                if (object != null) {
                                    unsafe.putObject(obj, jX, this.f19257q.b(object));
                                }
                                break;
                        }
                    } else if (J(obj, W(i8), i8)) {
                        w(i8).c(f19240s.getObject(obj, jX));
                    }
                } else if (B(obj, i8)) {
                    w(i8).c(f19240s.getObject(obj, jX));
                }
            }
            this.f19255o.j(obj);
            if (this.f19246f) {
                this.f19256p.f(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // com.google.protobuf.n0
    public final boolean d(Object obj) {
        int i8;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.f19251k) {
            int i13 = this.f19250j[i11];
            int iW = W(i13);
            int iV0 = v0(i13);
            int i14 = this.f19241a[i13 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i10) {
                if (i15 != 1048575) {
                    i12 = f19240s.getInt(obj, i15);
                }
                i9 = i12;
                i8 = i15;
            } else {
                i8 = i10;
                i9 = i12;
            }
            Object obj2 = obj;
            if (K(iV0) && !C(obj2, i13, i8, i9, i16)) {
                return false;
            }
            int iU0 = u0(iV0);
            if (iU0 == 9 || iU0 == 17) {
                if (C(obj2, i13, i8, i9, i16) && !D(obj2, iV0, w(i13))) {
                    return false;
                }
            } else if (iU0 == 27) {
                if (!F(obj2, iV0, i13)) {
                    return false;
                }
            } else if (iU0 == 60 || iU0 == 68) {
                if (J(obj2, iW, i13) && !D(obj2, iV0, w(i13))) {
                    return false;
                }
            } else if (iU0 != 49) {
                if (iU0 == 50 && !G(obj2, iV0, i13)) {
                    return false;
                }
            } else if (!F(obj2, iV0, i13)) {
                return false;
            }
            i11++;
            obj = obj2;
            i10 = i8;
            i12 = i9;
        }
        return !this.f19246f || this.f19256p.c(obj).s();
    }

    public final int d0(Object obj, byte[] bArr, int i8, int i9, int i10, long j8, AbstractC2094e.b bVar) {
        Unsafe unsafe = f19240s;
        Object objV = v(i10);
        Object object = unsafe.getObject(obj, j8);
        if (this.f19257q.g(object)) {
            Object objE = this.f19257q.e(objV);
            this.f19257q.a(objE, object);
            unsafe.putObject(obj, j8, objE);
            object = objE;
        }
        return n(bArr, i8, i9, this.f19257q.c(objV), this.f19257q.d(object), bVar);
    }

    @Override // com.google.protobuf.n0
    public void e(Object obj, m0 m0Var, C2106q c2106q) throws Throwable {
        c2106q.getClass();
        m(obj);
        M(this.f19255o, this.f19256p, obj, m0Var, c2106q);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public int e0(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.AbstractC2094e.b r32) {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.W.e0(java.lang.Object, byte[], int, int, int, com.google.protobuf.e$b):int");
    }

    @Override // com.google.protobuf.n0
    public void f(Object obj, byte[] bArr, int i8, int i9, AbstractC2094e.b bVar) {
        e0(obj, bArr, i8, i9, 0, bVar);
    }

    public final int f0(Object obj, byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j8, int i15, AbstractC2094e.b bVar) throws B {
        Unsafe unsafe = f19240s;
        long j9 = this.f19241a[i15 + 2] & 1048575;
        switch (i14) {
            case 51:
                if (i12 != 1) {
                    return i8;
                }
                unsafe.putObject(obj, j8, Double.valueOf(AbstractC2094e.d(bArr, i8)));
                int i16 = i8 + 8;
                unsafe.putInt(obj, j9, i11);
                return i16;
            case 52:
                if (i12 != 5) {
                    return i8;
                }
                unsafe.putObject(obj, j8, Float.valueOf(AbstractC2094e.l(bArr, i8)));
                int i17 = i8 + 4;
                unsafe.putInt(obj, j9, i11);
                return i17;
            case 53:
            case 54:
                if (i12 != 0) {
                    return i8;
                }
                int iL = AbstractC2094e.L(bArr, i8, bVar);
                unsafe.putObject(obj, j8, Long.valueOf(bVar.f19274b));
                unsafe.putInt(obj, j9, i11);
                return iL;
            case 55:
            case 62:
                if (i12 != 0) {
                    return i8;
                }
                int I8 = AbstractC2094e.I(bArr, i8, bVar);
                unsafe.putObject(obj, j8, Integer.valueOf(bVar.f19273a));
                unsafe.putInt(obj, j9, i11);
                return I8;
            case 56:
            case 65:
                if (i12 != 1) {
                    return i8;
                }
                unsafe.putObject(obj, j8, Long.valueOf(AbstractC2094e.j(bArr, i8)));
                int i18 = i8 + 8;
                unsafe.putInt(obj, j9, i11);
                return i18;
            case 57:
            case 64:
                if (i12 != 5) {
                    return i8;
                }
                unsafe.putObject(obj, j8, Integer.valueOf(AbstractC2094e.h(bArr, i8)));
                int i19 = i8 + 4;
                unsafe.putInt(obj, j9, i11);
                return i19;
            case 58:
                if (i12 != 0) {
                    return i8;
                }
                int iL2 = AbstractC2094e.L(bArr, i8, bVar);
                unsafe.putObject(obj, j8, Boolean.valueOf(bVar.f19274b != 0));
                unsafe.putInt(obj, j9, i11);
                return iL2;
            case 59:
                if (i12 != 2) {
                    return i8;
                }
                int I9 = AbstractC2094e.I(bArr, i8, bVar);
                int i20 = bVar.f19273a;
                if (i20 == 0) {
                    unsafe.putObject(obj, j8, "");
                } else {
                    if ((i13 & 536870912) != 0 && !A0.t(bArr, I9, I9 + i20)) {
                        throw B.d();
                    }
                    unsafe.putObject(obj, j8, new String(bArr, I9, i20, A.f19048b));
                    I9 += i20;
                }
                unsafe.putInt(obj, j9, i11);
                return I9;
            case 60:
                if (i12 != 2) {
                    return i8;
                }
                Object objS = S(obj, i11, i15);
                int iO = AbstractC2094e.O(objS, w(i15), bArr, i8, i9, bVar);
                t0(obj, i11, i15, objS);
                return iO;
            case 61:
                if (i12 != 2) {
                    return i8;
                }
                int iB = AbstractC2094e.b(bArr, i8, bVar);
                unsafe.putObject(obj, j8, bVar.f19275c);
                unsafe.putInt(obj, j9, i11);
                return iB;
            case 63:
                if (i12 != 0) {
                    return i8;
                }
                int I10 = AbstractC2094e.I(bArr, i8, bVar);
                int i21 = bVar.f19273a;
                A.e eVarU = u(i15);
                if (eVarU != null && !eVarU.isInRange(i21)) {
                    x(obj).r(i10, Long.valueOf(i21));
                    return I10;
                }
                unsafe.putObject(obj, j8, Integer.valueOf(i21));
                unsafe.putInt(obj, j9, i11);
                return I10;
            case 66:
                if (i12 != 0) {
                    return i8;
                }
                int I11 = AbstractC2094e.I(bArr, i8, bVar);
                unsafe.putObject(obj, j8, Integer.valueOf(AbstractC2098i.c(bVar.f19273a)));
                unsafe.putInt(obj, j9, i11);
                return I11;
            case 67:
                if (i12 != 0) {
                    return i8;
                }
                int iL3 = AbstractC2094e.L(bArr, i8, bVar);
                unsafe.putObject(obj, j8, Long.valueOf(AbstractC2098i.d(bVar.f19274b)));
                unsafe.putInt(obj, j9, i11);
                return iL3;
            case 68:
                if (i12 == 3) {
                    Object objS2 = S(obj, i11, i15);
                    int iN = AbstractC2094e.N(objS2, w(i15), bArr, i8, i9, (i10 & (-8)) | 4, bVar);
                    t0(obj, i11, i15, objS2);
                    return iN;
                }
                break;
        }
        return i8;
    }

    @Override // com.google.protobuf.n0
    public boolean g(Object obj, Object obj2) {
        int length = this.f19241a.length;
        for (int i8 = 0; i8 < length; i8 += 3) {
            if (!q(obj, obj2, i8)) {
                return false;
            }
        }
        if (!this.f19255o.g(obj).equals(this.f19255o.g(obj2))) {
            return false;
        }
        if (this.f19246f) {
            return this.f19256p.c(obj).equals(this.f19256p.c(obj2));
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int g0(Object obj, byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, long j8, int i14, long j9, AbstractC2094e.b bVar) throws B {
        int iJ;
        Unsafe unsafe = f19240s;
        A.j jVarA = (A.j) unsafe.getObject(obj, j9);
        if (!jVarA.C()) {
            int size = jVarA.size();
            jVarA = jVarA.a(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j9, jVarA);
        }
        A.j jVar = jVarA;
        switch (i14) {
            case 18:
            case 35:
                if (i12 == 2) {
                    return AbstractC2094e.s(bArr, i8, jVar, bVar);
                }
                if (i12 == 1) {
                    return AbstractC2094e.e(i10, bArr, i8, i9, jVar, bVar);
                }
                return i8;
            case 19:
            case 36:
                if (i12 == 2) {
                    return AbstractC2094e.v(bArr, i8, jVar, bVar);
                }
                if (i12 == 5) {
                    return AbstractC2094e.m(i10, bArr, i8, i9, jVar, bVar);
                }
                return i8;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i12 == 2) {
                    return AbstractC2094e.z(bArr, i8, jVar, bVar);
                }
                if (i12 == 0) {
                    return AbstractC2094e.M(i10, bArr, i8, i9, jVar, bVar);
                }
                return i8;
            case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
            case 29:
            case 39:
            case 43:
                if (i12 == 2) {
                    return AbstractC2094e.y(bArr, i8, jVar, bVar);
                }
                if (i12 == 0) {
                    return AbstractC2094e.J(i10, bArr, i8, i9, jVar, bVar);
                }
                return i8;
            case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
            case 32:
            case Messages.ServerMessage.ICON_FIELD_NUMBER /* 40 */:
            case 46:
                if (i12 == 2) {
                    return AbstractC2094e.u(bArr, i8, jVar, bVar);
                }
                if (i12 == 1) {
                    return AbstractC2094e.k(i10, bArr, i8, i9, jVar, bVar);
                }
                return i8;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i12 == 2) {
                    return AbstractC2094e.t(bArr, i8, jVar, bVar);
                }
                if (i12 == 5) {
                    return AbstractC2094e.i(i10, bArr, i8, i9, jVar, bVar);
                }
                return i8;
            case 25:
            case 42:
                if (i12 == 2) {
                    return AbstractC2094e.r(bArr, i8, jVar, bVar);
                }
                if (i12 == 0) {
                    return AbstractC2094e.a(i10, bArr, i8, i9, jVar, bVar);
                }
                return i8;
            case 26:
                if (i12 == 2) {
                    return (j8 & 536870912) == 0 ? AbstractC2094e.D(i10, bArr, i8, i9, jVar, bVar) : AbstractC2094e.E(i10, bArr, i8, i9, jVar, bVar);
                }
                return i8;
            case 27:
                if (i12 == 2) {
                    return AbstractC2094e.q(w(i13), i10, bArr, i8, i9, jVar, bVar);
                }
                return i8;
            case 28:
                if (i12 == 2) {
                    return AbstractC2094e.c(i10, bArr, i8, i9, jVar, bVar);
                }
                return i8;
            case 30:
            case 44:
                if (i12 != 2) {
                    if (i12 == 0) {
                        iJ = AbstractC2094e.J(i10, bArr, i8, i9, jVar, bVar);
                    }
                    return i8;
                }
                iJ = AbstractC2094e.y(bArr, i8, jVar, bVar);
                p0.A(obj, i11, jVar, u(i13), null, this.f19255o);
                return iJ;
            case 33:
            case 47:
                if (i12 == 2) {
                    return AbstractC2094e.w(bArr, i8, jVar, bVar);
                }
                if (i12 == 0) {
                    return AbstractC2094e.A(i10, bArr, i8, i9, jVar, bVar);
                }
                return i8;
            case 34:
            case 48:
                if (i12 == 2) {
                    return AbstractC2094e.x(bArr, i8, jVar, bVar);
                }
                if (i12 == 0) {
                    return AbstractC2094e.B(i10, bArr, i8, i9, jVar, bVar);
                }
                return i8;
            case 49:
                if (i12 == 3) {
                    return AbstractC2094e.o(w(i13), i10, bArr, i8, i9, jVar, bVar);
                }
                return i8;
            default:
                return i8;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:247:0x0552 A[PHI: r0 r1
      0x0552: PHI (r0v2 com.google.protobuf.W) = 
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v24 com.google.protobuf.W)
      (r0v30 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
      (r0v1 com.google.protobuf.W)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0552: PHI (r1v4 java.lang.Object) = 
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v5 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.n0
    public int h(Object obj) {
        int i8;
        int iJ;
        int iR;
        int iY;
        int i9;
        int iV;
        int iX;
        W w8 = this;
        Object obj2 = obj;
        Unsafe unsafe = f19240s;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i11 < w8.f19241a.length) {
            int iV0 = w8.v0(i11);
            int iU0 = u0(iV0);
            int iW = w8.W(i11);
            int i15 = w8.f19241a[i11 + 2];
            int i16 = i15 & i10;
            if (iU0 <= 17) {
                if (i16 != i14) {
                    i12 = i16 == i10 ? 0 : unsafe.getInt(obj2, i16);
                    i14 = i16;
                }
                i8 = 1 << (i15 >>> 20);
            } else {
                i8 = 0;
            }
            int i17 = i13;
            long jX = X(iV0);
            if (iU0 < EnumC2111w.f19430a0.a() || iU0 > EnumC2111w.f19452n0.a()) {
                i16 = 0;
            }
            switch (iU0) {
                case 0:
                    if (!w8.C(obj2, i11, i14, i12, i8)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.j(iW, 0.0d);
                        i13 = i17 + iJ;
                    }
                    break;
                case 1:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        iR = AbstractC2100k.r(iW, 0.0f);
                        i13 = i17 + iR;
                        w8 = this;
                        obj2 = obj;
                    }
                    w8 = this;
                    obj2 = obj;
                    i13 = i17;
                    break;
                case 2:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        iY = AbstractC2100k.y(iW, unsafe.getLong(obj2, jX));
                        i13 = i17 + iY;
                        w8 = this;
                    }
                    w8 = this;
                    i13 = i17;
                    break;
                case 3:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        iY = AbstractC2100k.Y(iW, unsafe.getLong(obj2, jX));
                        i13 = i17 + iY;
                        w8 = this;
                    }
                    w8 = this;
                    i13 = i17;
                    break;
                case 4:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        iY = AbstractC2100k.w(iW, unsafe.getInt(obj2, jX));
                        i13 = i17 + iY;
                        w8 = this;
                    }
                    w8 = this;
                    i13 = i17;
                    break;
                case 5:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        iR = AbstractC2100k.p(iW, 0L);
                        i13 = i17 + iR;
                        w8 = this;
                        obj2 = obj;
                    }
                    w8 = this;
                    obj2 = obj;
                    i13 = i17;
                    break;
                case 6:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        iR = AbstractC2100k.n(iW, 0);
                        i13 = i17 + iR;
                        w8 = this;
                        obj2 = obj;
                    }
                    w8 = this;
                    obj2 = obj;
                    i13 = i17;
                    break;
                case 7:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        iR = AbstractC2100k.e(iW, true);
                        i13 = i17 + iR;
                        w8 = this;
                        obj2 = obj;
                    }
                    w8 = this;
                    obj2 = obj;
                    i13 = i17;
                    break;
                case 8:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        Object object = unsafe.getObject(obj2, jX);
                        iY = object instanceof AbstractC2097h ? AbstractC2100k.h(iW, (AbstractC2097h) object) : AbstractC2100k.T(iW, (String) object);
                        i13 = i17 + iY;
                        w8 = this;
                    }
                    w8 = this;
                    i13 = i17;
                    break;
                case 9:
                    if (!w8.C(obj2, i11, i14, i12, i8)) {
                        i13 = i17;
                    } else {
                        iJ = p0.o(iW, unsafe.getObject(obj2, jX), w8.w(i11));
                        i13 = i17 + iJ;
                    }
                    break;
                case 10:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        iY = AbstractC2100k.h(iW, (AbstractC2097h) unsafe.getObject(obj2, jX));
                        i13 = i17 + iY;
                        w8 = this;
                    }
                    w8 = this;
                    i13 = i17;
                    break;
                case 11:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        iY = AbstractC2100k.W(iW, unsafe.getInt(obj2, jX));
                        i13 = i17 + iY;
                        w8 = this;
                    }
                    w8 = this;
                    i13 = i17;
                    break;
                case 12:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        iY = AbstractC2100k.l(iW, unsafe.getInt(obj2, jX));
                        i13 = i17 + iY;
                        w8 = this;
                    }
                    w8 = this;
                    i13 = i17;
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        iR = AbstractC2100k.L(iW, 0);
                        i13 = i17 + iR;
                        w8 = this;
                        obj2 = obj;
                    }
                    w8 = this;
                    obj2 = obj;
                    i13 = i17;
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        iR = AbstractC2100k.N(iW, 0L);
                        i13 = i17 + iR;
                        w8 = this;
                        obj2 = obj;
                    }
                    w8 = this;
                    obj2 = obj;
                    i13 = i17;
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        iY = AbstractC2100k.P(iW, unsafe.getInt(obj2, jX));
                        i13 = i17 + iY;
                        w8 = this;
                    }
                    w8 = this;
                    i13 = i17;
                    break;
                case 16:
                    if (w8.C(obj2, i11, i14, i12, i8)) {
                        iY = AbstractC2100k.R(iW, unsafe.getLong(obj2, jX));
                        i13 = i17 + iY;
                        w8 = this;
                    }
                    w8 = this;
                    i13 = i17;
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    if (!w8.C(obj2, i11, i14, i12, i8)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.t(iW, (T) unsafe.getObject(obj2, jX), w8.w(i11));
                        i13 = i17 + iJ;
                    }
                    break;
                case 18:
                    iJ = p0.h(iW, (List) unsafe.getObject(obj2, jX), false);
                    i13 = i17 + iJ;
                    break;
                case 19:
                    iJ = p0.f(iW, (List) unsafe.getObject(obj2, jX), false);
                    i13 = i17 + iJ;
                    break;
                case 20:
                    iJ = p0.m(iW, (List) unsafe.getObject(obj2, jX), false);
                    i13 = i17 + iJ;
                    break;
                case 21:
                    iJ = p0.x(iW, (List) unsafe.getObject(obj2, jX), false);
                    i13 = i17 + iJ;
                    break;
                case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                    iJ = p0.k(iW, (List) unsafe.getObject(obj2, jX), false);
                    i13 = i17 + iJ;
                    break;
                case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                    iJ = p0.h(iW, (List) unsafe.getObject(obj2, jX), false);
                    i13 = i17 + iJ;
                    break;
                case 24:
                    iJ = p0.f(iW, (List) unsafe.getObject(obj2, jX), false);
                    i13 = i17 + iJ;
                    break;
                case 25:
                    iJ = p0.a(iW, (List) unsafe.getObject(obj2, jX), false);
                    i13 = i17 + iJ;
                    break;
                case 26:
                    iJ = p0.u(iW, (List) unsafe.getObject(obj2, jX));
                    i13 = i17 + iJ;
                    break;
                case 27:
                    iJ = p0.p(iW, (List) unsafe.getObject(obj2, jX), w8.w(i11));
                    i13 = i17 + iJ;
                    break;
                case 28:
                    iJ = p0.c(iW, (List) unsafe.getObject(obj2, jX));
                    i13 = i17 + iJ;
                    break;
                case 29:
                    iJ = p0.v(iW, (List) unsafe.getObject(obj2, jX), false);
                    i13 = i17 + iJ;
                    break;
                case 30:
                    iJ = p0.d(iW, (List) unsafe.getObject(obj2, jX), false);
                    i13 = i17 + iJ;
                    break;
                case 31:
                    iJ = p0.f(iW, (List) unsafe.getObject(obj2, jX), false);
                    i13 = i17 + iJ;
                    break;
                case 32:
                    iJ = p0.h(iW, (List) unsafe.getObject(obj2, jX), false);
                    i13 = i17 + iJ;
                    break;
                case 33:
                    iJ = p0.q(iW, (List) unsafe.getObject(obj2, jX), false);
                    i13 = i17 + iJ;
                    break;
                case 34:
                    iJ = p0.s(iW, (List) unsafe.getObject(obj2, jX), false);
                    i13 = i17 + iJ;
                    break;
                case 35:
                    i9 = p0.i((List) unsafe.getObject(obj2, jX));
                    if (i9 <= 0) {
                        i13 = i17;
                    } else {
                        if (w8.f19249i) {
                            unsafe.putInt(obj2, i16, i9);
                        }
                        iV = AbstractC2100k.V(iW);
                        iX = AbstractC2100k.X(i9);
                        i13 = i17 + iV + iX + i9;
                    }
                    break;
                case 36:
                    i9 = p0.g((List) unsafe.getObject(obj2, jX));
                    if (i9 <= 0) {
                        i13 = i17;
                    } else {
                        if (w8.f19249i) {
                            unsafe.putInt(obj2, i16, i9);
                        }
                        iV = AbstractC2100k.V(iW);
                        iX = AbstractC2100k.X(i9);
                        i13 = i17 + iV + iX + i9;
                    }
                    break;
                case 37:
                    i9 = p0.n((List) unsafe.getObject(obj2, jX));
                    if (i9 <= 0) {
                        i13 = i17;
                    } else {
                        if (w8.f19249i) {
                            unsafe.putInt(obj2, i16, i9);
                        }
                        iV = AbstractC2100k.V(iW);
                        iX = AbstractC2100k.X(i9);
                        i13 = i17 + iV + iX + i9;
                    }
                    break;
                case 38:
                    i9 = p0.y((List) unsafe.getObject(obj2, jX));
                    if (i9 <= 0) {
                        i13 = i17;
                    } else {
                        if (w8.f19249i) {
                            unsafe.putInt(obj2, i16, i9);
                        }
                        iV = AbstractC2100k.V(iW);
                        iX = AbstractC2100k.X(i9);
                        i13 = i17 + iV + iX + i9;
                    }
                    break;
                case 39:
                    i9 = p0.l((List) unsafe.getObject(obj2, jX));
                    if (i9 <= 0) {
                        i13 = i17;
                    } else {
                        if (w8.f19249i) {
                            unsafe.putInt(obj2, i16, i9);
                        }
                        iV = AbstractC2100k.V(iW);
                        iX = AbstractC2100k.X(i9);
                        i13 = i17 + iV + iX + i9;
                    }
                    break;
                case Messages.ServerMessage.ICON_FIELD_NUMBER /* 40 */:
                    i9 = p0.i((List) unsafe.getObject(obj2, jX));
                    if (i9 <= 0) {
                        i13 = i17;
                    } else {
                        if (w8.f19249i) {
                            unsafe.putInt(obj2, i16, i9);
                        }
                        iV = AbstractC2100k.V(iW);
                        iX = AbstractC2100k.X(i9);
                        i13 = i17 + iV + iX + i9;
                    }
                    break;
                case 41:
                    i9 = p0.g((List) unsafe.getObject(obj2, jX));
                    if (i9 <= 0) {
                        i13 = i17;
                    } else {
                        if (w8.f19249i) {
                            unsafe.putInt(obj2, i16, i9);
                        }
                        iV = AbstractC2100k.V(iW);
                        iX = AbstractC2100k.X(i9);
                        i13 = i17 + iV + iX + i9;
                    }
                    break;
                case 42:
                    i9 = p0.b((List) unsafe.getObject(obj2, jX));
                    if (i9 <= 0) {
                        i13 = i17;
                    } else {
                        if (w8.f19249i) {
                            unsafe.putInt(obj2, i16, i9);
                        }
                        iV = AbstractC2100k.V(iW);
                        iX = AbstractC2100k.X(i9);
                        i13 = i17 + iV + iX + i9;
                    }
                    break;
                case 43:
                    i9 = p0.w((List) unsafe.getObject(obj2, jX));
                    if (i9 <= 0) {
                        i13 = i17;
                    } else {
                        if (w8.f19249i) {
                            unsafe.putInt(obj2, i16, i9);
                        }
                        iV = AbstractC2100k.V(iW);
                        iX = AbstractC2100k.X(i9);
                        i13 = i17 + iV + iX + i9;
                    }
                    break;
                case 44:
                    i9 = p0.e((List) unsafe.getObject(obj2, jX));
                    if (i9 <= 0) {
                        i13 = i17;
                    } else {
                        if (w8.f19249i) {
                            unsafe.putInt(obj2, i16, i9);
                        }
                        iV = AbstractC2100k.V(iW);
                        iX = AbstractC2100k.X(i9);
                        i13 = i17 + iV + iX + i9;
                    }
                    break;
                case 45:
                    i9 = p0.g((List) unsafe.getObject(obj2, jX));
                    if (i9 <= 0) {
                        i13 = i17;
                    } else {
                        if (w8.f19249i) {
                            unsafe.putInt(obj2, i16, i9);
                        }
                        iV = AbstractC2100k.V(iW);
                        iX = AbstractC2100k.X(i9);
                        i13 = i17 + iV + iX + i9;
                    }
                    break;
                case 46:
                    i9 = p0.i((List) unsafe.getObject(obj2, jX));
                    if (i9 <= 0) {
                        i13 = i17;
                    } else {
                        if (w8.f19249i) {
                            unsafe.putInt(obj2, i16, i9);
                        }
                        iV = AbstractC2100k.V(iW);
                        iX = AbstractC2100k.X(i9);
                        i13 = i17 + iV + iX + i9;
                    }
                    break;
                case 47:
                    i9 = p0.r((List) unsafe.getObject(obj2, jX));
                    if (i9 <= 0) {
                        i13 = i17;
                    } else {
                        if (w8.f19249i) {
                            unsafe.putInt(obj2, i16, i9);
                        }
                        iV = AbstractC2100k.V(iW);
                        iX = AbstractC2100k.X(i9);
                        i13 = i17 + iV + iX + i9;
                    }
                    break;
                case 48:
                    i9 = p0.t((List) unsafe.getObject(obj2, jX));
                    if (i9 <= 0) {
                        i13 = i17;
                    } else {
                        if (w8.f19249i) {
                            unsafe.putInt(obj2, i16, i9);
                        }
                        iV = AbstractC2100k.V(iW);
                        iX = AbstractC2100k.X(i9);
                        i13 = i17 + iV + iX + i9;
                    }
                    break;
                case 49:
                    iJ = p0.j(iW, (List) unsafe.getObject(obj2, jX), w8.w(i11));
                    i13 = i17 + iJ;
                    break;
                case 50:
                    iJ = w8.f19257q.f(iW, unsafe.getObject(obj2, jX), w8.v(i11));
                    i13 = i17 + iJ;
                    break;
                case 51:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.j(iW, 0.0d);
                        i13 = i17 + iJ;
                    }
                    break;
                case 52:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.r(iW, 0.0f);
                        i13 = i17 + iJ;
                    }
                    break;
                case 53:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.y(iW, c0(obj2, jX));
                        i13 = i17 + iJ;
                    }
                    break;
                case 54:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.Y(iW, c0(obj2, jX));
                        i13 = i17 + iJ;
                    }
                    break;
                case 55:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.w(iW, b0(obj2, jX));
                        i13 = i17 + iJ;
                    }
                    break;
                case 56:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.p(iW, 0L);
                        i13 = i17 + iJ;
                    }
                    break;
                case 57:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.n(iW, 0);
                        i13 = i17 + iJ;
                    }
                    break;
                case 58:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.e(iW, true);
                        i13 = i17 + iJ;
                    }
                    break;
                case 59:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        Object object2 = unsafe.getObject(obj2, jX);
                        iJ = object2 instanceof AbstractC2097h ? AbstractC2100k.h(iW, (AbstractC2097h) object2) : AbstractC2100k.T(iW, (String) object2);
                        i13 = i17 + iJ;
                    }
                    break;
                case 60:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = p0.o(iW, unsafe.getObject(obj2, jX), w8.w(i11));
                        i13 = i17 + iJ;
                    }
                    break;
                case 61:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.h(iW, (AbstractC2097h) unsafe.getObject(obj2, jX));
                        i13 = i17 + iJ;
                    }
                    break;
                case 62:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.W(iW, b0(obj2, jX));
                        i13 = i17 + iJ;
                    }
                    break;
                case 63:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.l(iW, b0(obj2, jX));
                        i13 = i17 + iJ;
                    }
                    break;
                case 64:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.L(iW, 0);
                        i13 = i17 + iJ;
                    }
                    break;
                case 65:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.N(iW, 0L);
                        i13 = i17 + iJ;
                    }
                    break;
                case 66:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.P(iW, b0(obj2, jX));
                        i13 = i17 + iJ;
                    }
                    break;
                case 67:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.R(iW, c0(obj2, jX));
                        i13 = i17 + iJ;
                    }
                    break;
                case 68:
                    if (!w8.J(obj2, iW, i11)) {
                        i13 = i17;
                    } else {
                        iJ = AbstractC2100k.t(iW, (T) unsafe.getObject(obj2, jX), w8.w(i11));
                        i13 = i17 + iJ;
                    }
                    break;
                default:
                    i13 = i17;
                    break;
            }
            i11 += 3;
            i10 = 1048575;
        }
        int iY2 = i13 + w8.y(w8.f19255o, obj2);
        return w8.f19246f ? iY2 + w8.f19256p.c(obj2).n() : iY2;
    }

    public final int h0(int i8) {
        if (i8 < this.f19243c || i8 > this.f19244d) {
            return -1;
        }
        return r0(i8, 0);
    }

    @Override // com.google.protobuf.n0
    public Object i() {
        return this.f19253m.a(this.f19245e);
    }

    public final int i0(int i8, int i9) {
        if (i8 < this.f19243c || i8 > this.f19244d) {
            return -1;
        }
        return r0(i8, i9);
    }

    @Override // com.google.protobuf.n0
    public int j(Object obj) {
        int i8;
        int iF;
        int length = this.f19241a.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iV0 = v0(i10);
            int iW = W(i10);
            long jX = X(iV0);
            int iHashCode = 37;
            switch (u0(iV0)) {
                case 0:
                    i8 = i9 * 53;
                    iF = A.f(Double.doubleToLongBits(z0.A(obj, jX)));
                    i9 = i8 + iF;
                    break;
                case 1:
                    i8 = i9 * 53;
                    iF = Float.floatToIntBits(z0.B(obj, jX));
                    i9 = i8 + iF;
                    break;
                case 2:
                    i8 = i9 * 53;
                    iF = A.f(z0.E(obj, jX));
                    i9 = i8 + iF;
                    break;
                case 3:
                    i8 = i9 * 53;
                    iF = A.f(z0.E(obj, jX));
                    i9 = i8 + iF;
                    break;
                case 4:
                    i8 = i9 * 53;
                    iF = z0.C(obj, jX);
                    i9 = i8 + iF;
                    break;
                case 5:
                    i8 = i9 * 53;
                    iF = A.f(z0.E(obj, jX));
                    i9 = i8 + iF;
                    break;
                case 6:
                    i8 = i9 * 53;
                    iF = z0.C(obj, jX);
                    i9 = i8 + iF;
                    break;
                case 7:
                    i8 = i9 * 53;
                    iF = A.c(z0.t(obj, jX));
                    i9 = i8 + iF;
                    break;
                case 8:
                    i8 = i9 * 53;
                    iF = ((String) z0.G(obj, jX)).hashCode();
                    i9 = i8 + iF;
                    break;
                case 9:
                    Object objG = z0.G(obj, jX);
                    if (objG != null) {
                        iHashCode = objG.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
                    break;
                case 10:
                    i8 = i9 * 53;
                    iF = z0.G(obj, jX).hashCode();
                    i9 = i8 + iF;
                    break;
                case 11:
                    i8 = i9 * 53;
                    iF = z0.C(obj, jX);
                    i9 = i8 + iF;
                    break;
                case 12:
                    i8 = i9 * 53;
                    iF = z0.C(obj, jX);
                    i9 = i8 + iF;
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    i8 = i9 * 53;
                    iF = z0.C(obj, jX);
                    i9 = i8 + iF;
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    i8 = i9 * 53;
                    iF = A.f(z0.E(obj, jX));
                    i9 = i8 + iF;
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    i8 = i9 * 53;
                    iF = z0.C(obj, jX);
                    i9 = i8 + iF;
                    break;
                case 16:
                    i8 = i9 * 53;
                    iF = A.f(z0.E(obj, jX));
                    i9 = i8 + iF;
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    Object objG2 = z0.G(obj, jX);
                    if (objG2 != null) {
                        iHashCode = objG2.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case Messages.ServerMessage.ICON_FIELD_NUMBER /* 40 */:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i8 = i9 * 53;
                    iF = z0.G(obj, jX).hashCode();
                    i9 = i8 + iF;
                    break;
                case 50:
                    i8 = i9 * 53;
                    iF = z0.G(obj, jX).hashCode();
                    i9 = i8 + iF;
                    break;
                case 51:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = A.f(Double.doubleToLongBits(Z(obj, jX)));
                        i9 = i8 + iF;
                    }
                    break;
                case 52:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = Float.floatToIntBits(a0(obj, jX));
                        i9 = i8 + iF;
                    }
                    break;
                case 53:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = A.f(c0(obj, jX));
                        i9 = i8 + iF;
                    }
                    break;
                case 54:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = A.f(c0(obj, jX));
                        i9 = i8 + iF;
                    }
                    break;
                case 55:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = b0(obj, jX);
                        i9 = i8 + iF;
                    }
                    break;
                case 56:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = A.f(c0(obj, jX));
                        i9 = i8 + iF;
                    }
                    break;
                case 57:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = b0(obj, jX);
                        i9 = i8 + iF;
                    }
                    break;
                case 58:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = A.c(Y(obj, jX));
                        i9 = i8 + iF;
                    }
                    break;
                case 59:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = ((String) z0.G(obj, jX)).hashCode();
                        i9 = i8 + iF;
                    }
                    break;
                case 60:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = z0.G(obj, jX).hashCode();
                        i9 = i8 + iF;
                    }
                    break;
                case 61:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = z0.G(obj, jX).hashCode();
                        i9 = i8 + iF;
                    }
                    break;
                case 62:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = b0(obj, jX);
                        i9 = i8 + iF;
                    }
                    break;
                case 63:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = b0(obj, jX);
                        i9 = i8 + iF;
                    }
                    break;
                case 64:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = b0(obj, jX);
                        i9 = i8 + iF;
                    }
                    break;
                case 65:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = A.f(c0(obj, jX));
                        i9 = i8 + iF;
                    }
                    break;
                case 66:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = b0(obj, jX);
                        i9 = i8 + iF;
                    }
                    break;
                case 67:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = A.f(c0(obj, jX));
                        i9 = i8 + iF;
                    }
                    break;
                case 68:
                    if (J(obj, iW, i10)) {
                        i8 = i9 * 53;
                        iF = z0.G(obj, jX).hashCode();
                        i9 = i8 + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i9 * 53) + this.f19255o.g(obj).hashCode();
        return this.f19246f ? (iHashCode2 * 53) + this.f19256p.c(obj).hashCode() : iHashCode2;
    }

    public final int j0(int i8) {
        return this.f19241a[i8 + 2];
    }

    public final boolean k(Object obj, Object obj2, int i8) {
        return B(obj, i8) == B(obj2, i8);
    }

    public final void k0(Object obj, long j8, m0 m0Var, n0 n0Var, C2106q c2106q) {
        m0Var.f(this.f19254n.e(obj, j8), n0Var, c2106q);
    }

    public final void l0(Object obj, int i8, m0 m0Var, n0 n0Var, C2106q c2106q) {
        m0Var.l(this.f19254n.e(obj, X(i8)), n0Var, c2106q);
    }

    public final void m0(Object obj, int i8, m0 m0Var) {
        if (A(i8)) {
            z0.V(obj, X(i8), m0Var.O());
        } else if (this.f19247g) {
            z0.V(obj, X(i8), m0Var.z());
        } else {
            z0.V(obj, X(i8), m0Var.G());
        }
    }

    public final int n(byte[] bArr, int i8, int i9, L.a aVar, Map map, AbstractC2094e.b bVar) throws B {
        int I8 = AbstractC2094e.I(bArr, i8, bVar);
        int i10 = bVar.f19273a;
        if (i10 < 0 || i10 > i9 - I8) {
            throw B.n();
        }
        int i11 = I8 + i10;
        Object obj = aVar.f19209b;
        Object obj2 = aVar.f19211d;
        while (I8 < i11) {
            int iH = I8 + 1;
            int i12 = bArr[I8];
            if (i12 < 0) {
                iH = AbstractC2094e.H(i12, bArr, iH, bVar);
                i12 = bVar.f19273a;
            }
            int i13 = iH;
            int i14 = i12 >>> 3;
            int i15 = i12 & 7;
            if (i14 != 1) {
                if (i14 == 2 && i15 == aVar.f19210c.b()) {
                    I8 = o(bArr, i13, i9, aVar.f19210c, aVar.f19211d.getClass(), bVar);
                    obj2 = bVar.f19275c;
                } else {
                    I8 = AbstractC2094e.P(i12, bArr, i13, i9, bVar);
                }
            } else if (i15 == aVar.f19208a.b()) {
                I8 = o(bArr, i13, i9, aVar.f19208a, null, bVar);
                obj = bVar.f19275c;
            } else {
                I8 = AbstractC2094e.P(i12, bArr, i13, i9, bVar);
            }
        }
        if (I8 != i11) {
            throw B.h();
        }
        map.put(obj, obj2);
        return i11;
    }

    public final void n0(Object obj, int i8, m0 m0Var) {
        if (A(i8)) {
            m0Var.F(this.f19254n.e(obj, X(i8)));
        } else {
            m0Var.C(this.f19254n.e(obj, X(i8)));
        }
    }

    public final int o(byte[] bArr, int i8, int i9, C0.b bVar, Class cls, AbstractC2094e.b bVar2) {
        switch (a.f19258a[bVar.ordinal()]) {
            case 1:
                int iL = AbstractC2094e.L(bArr, i8, bVar2);
                bVar2.f19275c = Boolean.valueOf(bVar2.f19274b != 0);
                return iL;
            case 2:
                return AbstractC2094e.b(bArr, i8, bVar2);
            case 3:
                bVar2.f19275c = Double.valueOf(AbstractC2094e.d(bArr, i8));
                return i8 + 8;
            case 4:
            case 5:
                bVar2.f19275c = Integer.valueOf(AbstractC2094e.h(bArr, i8));
                return i8 + 4;
            case 6:
            case 7:
                bVar2.f19275c = Long.valueOf(AbstractC2094e.j(bArr, i8));
                return i8 + 8;
            case 8:
                bVar2.f19275c = Float.valueOf(AbstractC2094e.l(bArr, i8));
                return i8 + 4;
            case 9:
            case 10:
            case 11:
                int I8 = AbstractC2094e.I(bArr, i8, bVar2);
                bVar2.f19275c = Integer.valueOf(bVar2.f19273a);
                return I8;
            case 12:
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                int iL2 = AbstractC2094e.L(bArr, i8, bVar2);
                bVar2.f19275c = Long.valueOf(bVar2.f19274b);
                return iL2;
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                return AbstractC2094e.p(j0.a().c(cls), bArr, i8, i9, bVar2);
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                int I9 = AbstractC2094e.I(bArr, i8, bVar2);
                bVar2.f19275c = Integer.valueOf(AbstractC2098i.c(bVar2.f19273a));
                return I9;
            case 16:
                int iL3 = AbstractC2094e.L(bArr, i8, bVar2);
                bVar2.f19275c = Long.valueOf(AbstractC2098i.d(bVar2.f19274b));
                return iL3;
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                return AbstractC2094e.F(bArr, i8, bVar2);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public final void p0(Object obj, int i8) {
        int iJ0 = j0(i8);
        long j8 = 1048575 & iJ0;
        if (j8 == 1048575) {
            return;
        }
        z0.T(obj, j8, (1 << (iJ0 >>> 20)) | z0.C(obj, j8));
    }

    public final boolean q(Object obj, Object obj2, int i8) {
        int iV0 = v0(i8);
        long jX = X(iV0);
        switch (u0(iV0)) {
            case 0:
                return k(obj, obj2, i8) && Double.doubleToLongBits(z0.A(obj, jX)) == Double.doubleToLongBits(z0.A(obj2, jX));
            case 1:
                return k(obj, obj2, i8) && Float.floatToIntBits(z0.B(obj, jX)) == Float.floatToIntBits(z0.B(obj2, jX));
            case 2:
                return k(obj, obj2, i8) && z0.E(obj, jX) == z0.E(obj2, jX);
            case 3:
                return k(obj, obj2, i8) && z0.E(obj, jX) == z0.E(obj2, jX);
            case 4:
                return k(obj, obj2, i8) && z0.C(obj, jX) == z0.C(obj2, jX);
            case 5:
                return k(obj, obj2, i8) && z0.E(obj, jX) == z0.E(obj2, jX);
            case 6:
                return k(obj, obj2, i8) && z0.C(obj, jX) == z0.C(obj2, jX);
            case 7:
                return k(obj, obj2, i8) && z0.t(obj, jX) == z0.t(obj2, jX);
            case 8:
                return k(obj, obj2, i8) && p0.I(z0.G(obj, jX), z0.G(obj2, jX));
            case 9:
                return k(obj, obj2, i8) && p0.I(z0.G(obj, jX), z0.G(obj2, jX));
            case 10:
                return k(obj, obj2, i8) && p0.I(z0.G(obj, jX), z0.G(obj2, jX));
            case 11:
                return k(obj, obj2, i8) && z0.C(obj, jX) == z0.C(obj2, jX);
            case 12:
                return k(obj, obj2, i8) && z0.C(obj, jX) == z0.C(obj2, jX);
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                return k(obj, obj2, i8) && z0.C(obj, jX) == z0.C(obj2, jX);
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                return k(obj, obj2, i8) && z0.E(obj, jX) == z0.E(obj2, jX);
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                return k(obj, obj2, i8) && z0.C(obj, jX) == z0.C(obj2, jX);
            case 16:
                return k(obj, obj2, i8) && z0.E(obj, jX) == z0.E(obj2, jX);
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                return k(obj, obj2, i8) && p0.I(z0.G(obj, jX), z0.G(obj2, jX));
            case 18:
            case 19:
            case 20:
            case 21:
            case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
            case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case Messages.ServerMessage.ICON_FIELD_NUMBER /* 40 */:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return p0.I(z0.G(obj, jX), z0.G(obj2, jX));
            case 50:
                return p0.I(z0.G(obj, jX), z0.G(obj2, jX));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return I(obj, obj2, i8) && p0.I(z0.G(obj, jX), z0.G(obj2, jX));
            default:
                return true;
        }
    }

    public final void q0(Object obj, int i8, int i9) {
        z0.T(obj, j0(i9) & 1048575, i8);
    }

    public final Object r(Object obj, int i8, Object obj2, v0 v0Var, Object obj3) {
        A.e eVarU;
        int iW = W(i8);
        Object objG = z0.G(obj, X(v0(i8)));
        return (objG == null || (eVarU = u(i8)) == null) ? obj2 : s(i8, iW, this.f19257q.d(objG), eVarU, obj2, v0Var, obj3);
    }

    public final int r0(int i8, int i9) {
        int length = (this.f19241a.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int iW = W(i11);
            if (i8 == iW) {
                return i11;
            }
            if (i8 < iW) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    public final Object s(int i8, int i9, Map map, A.e eVar, Object obj, v0 v0Var, Object obj2) {
        L.a aVarC = this.f19257q.c(v(i8));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!eVar.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = v0Var.f(obj2);
                }
                AbstractC2097h.C0429h c0429hK = AbstractC2097h.K(L.b(aVarC, entry.getKey(), entry.getValue()));
                try {
                    L.e(c0429hK.b(), aVarC, entry.getKey(), entry.getValue());
                    v0Var.d(obj, i9, c0429hK.a());
                    it.remove();
                } catch (IOException e8) {
                    throw new RuntimeException(e8);
                }
            }
        }
        return obj;
    }

    public final void s0(Object obj, int i8, Object obj2) {
        f19240s.putObject(obj, X(v0(i8)), obj2);
        p0(obj, i8);
    }

    public final void t0(Object obj, int i8, int i9, Object obj2) {
        f19240s.putObject(obj, X(v0(i9)), obj2);
        q0(obj, i8, i9);
    }

    public final A.e u(int i8) {
        return (A.e) this.f19242b[((i8 / 3) * 2) + 1];
    }

    public final Object v(int i8) {
        return this.f19242b[(i8 / 3) * 2];
    }

    public final int v0(int i8) {
        return this.f19241a[i8 + 1];
    }

    public final n0 w(int i8) {
        int i9 = (i8 / 3) * 2;
        n0 n0Var = (n0) this.f19242b[i9];
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0VarC = j0.a().c((Class) this.f19242b[i9 + 1]);
        this.f19242b[i9] = n0VarC;
        return n0VarC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public final void w0(Object obj, D0 d8) {
        Map.Entry entry;
        Iterator it;
        boolean z8;
        int i8;
        int i9;
        int i10;
        boolean z9;
        W w8 = this;
        if (w8.f19246f) {
            C2110v c2110vC = w8.f19256p.c(obj);
            if (c2110vC.q()) {
                entry = null;
                it = null;
            } else {
                Iterator itW = c2110vC.w();
                entry = (Map.Entry) itW.next();
                it = itW;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = w8.f19241a.length;
        Unsafe unsafe = f19240s;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int iV0 = w8.v0(i12);
            int iW = w8.W(i12);
            int iU0 = u0(iV0);
            if (iU0 <= 17) {
                int i14 = w8.f19241a[i12 + 2];
                z8 = true;
                int i15 = i14 & 1048575;
                if (i15 != i11) {
                    i13 = i15 == 1048575 ? 0 : unsafe.getInt(obj, i15);
                    i11 = i15;
                }
                i8 = i11;
                i9 = i13;
                i10 = 1 << (i14 >>> 20);
            } else {
                z8 = true;
                i8 = i11;
                i9 = i13;
                i10 = 0;
            }
            while (entry != null && w8.f19256p.a(entry) <= iW) {
                w8.f19256p.j(d8, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jX = X(iV0);
            switch (iU0) {
                case 0:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.g(iW, p(obj, jX));
                    }
                    break;
                case 1:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.G(iW, t(obj, jX));
                    }
                    w8 = this;
                    break;
                case 2:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.q(iW, unsafe.getLong(obj, jX));
                    }
                    w8 = this;
                    break;
                case 3:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.o(iW, unsafe.getLong(obj, jX));
                    }
                    w8 = this;
                    break;
                case 4:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.w(iW, unsafe.getInt(obj, jX));
                    }
                    w8 = this;
                    break;
                case 5:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.k(iW, unsafe.getLong(obj, jX));
                    }
                    w8 = this;
                    break;
                case 6:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.f(iW, unsafe.getInt(obj, jX));
                    }
                    w8 = this;
                    break;
                case 7:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.r(iW, l(obj, jX));
                    }
                    w8 = this;
                    break;
                case 8:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        w8.z0(iW, unsafe.getObject(obj, jX), d8);
                    }
                    break;
                case 9:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.j(iW, unsafe.getObject(obj, jX), w8.w(i12));
                    }
                    break;
                case 10:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.v(iW, (AbstractC2097h) unsafe.getObject(obj, jX));
                    }
                    w8 = this;
                    break;
                case 11:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.d(iW, unsafe.getInt(obj, jX));
                    }
                    w8 = this;
                    break;
                case 12:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.J(iW, unsafe.getInt(obj, jX));
                    }
                    w8 = this;
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.t(iW, unsafe.getInt(obj, jX));
                    }
                    w8 = this;
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.z(iW, unsafe.getLong(obj, jX));
                    }
                    w8 = this;
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.N(iW, unsafe.getInt(obj, jX));
                    }
                    w8 = this;
                    break;
                case 16:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.F(iW, unsafe.getLong(obj, jX));
                    }
                    w8 = this;
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    if (w8.C(obj, i12, i8, i9, i10)) {
                        d8.s(iW, unsafe.getObject(obj, jX), w8.w(i12));
                    }
                    break;
                case 18:
                    p0.O(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, false);
                    break;
                case 19:
                    p0.S(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, false);
                    break;
                case 20:
                    p0.V(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, false);
                    break;
                case 21:
                    p0.d0(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, false);
                    break;
                case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                    p0.U(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, false);
                    break;
                case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                    p0.R(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, false);
                    break;
                case 24:
                    p0.Q(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, false);
                    break;
                case 25:
                    p0.M(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, false);
                    break;
                case 26:
                    p0.b0(w8.W(i12), (List) unsafe.getObject(obj, jX), d8);
                    break;
                case 27:
                    p0.W(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, w8.w(i12));
                    break;
                case 28:
                    p0.N(w8.W(i12), (List) unsafe.getObject(obj, jX), d8);
                    break;
                case 29:
                    z9 = false;
                    p0.c0(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, false);
                    break;
                case 30:
                    z9 = false;
                    p0.P(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, false);
                    break;
                case 31:
                    z9 = false;
                    p0.X(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, false);
                    break;
                case 32:
                    z9 = false;
                    p0.Y(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, false);
                    break;
                case 33:
                    z9 = false;
                    p0.Z(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, false);
                    break;
                case 34:
                    z9 = false;
                    p0.a0(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, false);
                    break;
                case 35:
                    p0.O(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, z8);
                    break;
                case 36:
                    p0.S(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, z8);
                    break;
                case 37:
                    p0.V(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, z8);
                    break;
                case 38:
                    p0.d0(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, z8);
                    break;
                case 39:
                    p0.U(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, z8);
                    break;
                case Messages.ServerMessage.ICON_FIELD_NUMBER /* 40 */:
                    p0.R(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, z8);
                    break;
                case 41:
                    p0.Q(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, z8);
                    break;
                case 42:
                    p0.M(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, z8);
                    break;
                case 43:
                    p0.c0(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, z8);
                    break;
                case 44:
                    p0.P(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, z8);
                    break;
                case 45:
                    p0.X(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, z8);
                    break;
                case 46:
                    p0.Y(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, z8);
                    break;
                case 47:
                    p0.Z(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, z8);
                    break;
                case 48:
                    p0.a0(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, z8);
                    break;
                case 49:
                    p0.T(w8.W(i12), (List) unsafe.getObject(obj, jX), d8, w8.w(i12));
                    break;
                case 50:
                    w8.y0(d8, iW, unsafe.getObject(obj, jX), i12);
                    break;
                case 51:
                    if (w8.J(obj, iW, i12)) {
                        d8.g(iW, Z(obj, jX));
                    }
                    break;
                case 52:
                    if (w8.J(obj, iW, i12)) {
                        d8.G(iW, a0(obj, jX));
                    }
                    break;
                case 53:
                    if (w8.J(obj, iW, i12)) {
                        d8.q(iW, c0(obj, jX));
                    }
                    break;
                case 54:
                    if (w8.J(obj, iW, i12)) {
                        d8.o(iW, c0(obj, jX));
                    }
                    break;
                case 55:
                    if (w8.J(obj, iW, i12)) {
                        d8.w(iW, b0(obj, jX));
                    }
                    break;
                case 56:
                    if (w8.J(obj, iW, i12)) {
                        d8.k(iW, c0(obj, jX));
                    }
                    break;
                case 57:
                    if (w8.J(obj, iW, i12)) {
                        d8.f(iW, b0(obj, jX));
                    }
                    break;
                case 58:
                    if (w8.J(obj, iW, i12)) {
                        d8.r(iW, Y(obj, jX));
                    }
                    break;
                case 59:
                    if (w8.J(obj, iW, i12)) {
                        w8.z0(iW, unsafe.getObject(obj, jX), d8);
                    }
                    break;
                case 60:
                    if (w8.J(obj, iW, i12)) {
                        d8.j(iW, unsafe.getObject(obj, jX), w8.w(i12));
                    }
                    break;
                case 61:
                    if (w8.J(obj, iW, i12)) {
                        d8.v(iW, (AbstractC2097h) unsafe.getObject(obj, jX));
                    }
                    break;
                case 62:
                    if (w8.J(obj, iW, i12)) {
                        d8.d(iW, b0(obj, jX));
                    }
                    break;
                case 63:
                    if (w8.J(obj, iW, i12)) {
                        d8.J(iW, b0(obj, jX));
                    }
                    break;
                case 64:
                    if (w8.J(obj, iW, i12)) {
                        d8.t(iW, b0(obj, jX));
                    }
                    break;
                case 65:
                    if (w8.J(obj, iW, i12)) {
                        d8.z(iW, c0(obj, jX));
                    }
                    break;
                case 66:
                    if (w8.J(obj, iW, i12)) {
                        d8.N(iW, b0(obj, jX));
                    }
                    break;
                case 67:
                    if (w8.J(obj, iW, i12)) {
                        d8.F(iW, c0(obj, jX));
                    }
                    break;
                case 68:
                    if (w8.J(obj, iW, i12)) {
                        d8.s(iW, unsafe.getObject(obj, jX), w8.w(i12));
                    }
                    break;
                default:
                    break;
            }
            i12 += 3;
            i13 = i9;
            i11 = i8;
            entry = entry;
        }
        while (entry != null) {
            w8.f19256p.j(d8, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        w8.A0(w8.f19255o, obj, d8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void x0(Object obj, D0 d8) {
        Iterator itG;
        Map.Entry entry;
        A0(this.f19255o, obj, d8);
        if (this.f19246f) {
            C2110v c2110vC = this.f19256p.c(obj);
            if (c2110vC.q()) {
                itG = null;
                entry = null;
            } else {
                itG = c2110vC.g();
                entry = (Map.Entry) itG.next();
            }
        } else {
            itG = null;
            entry = null;
        }
        for (int length = this.f19241a.length - 3; length >= 0; length -= 3) {
            int iV0 = v0(length);
            int iW = W(length);
            while (entry != null && this.f19256p.a(entry) > iW) {
                this.f19256p.j(d8, entry);
                entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
            }
            switch (u0(iV0)) {
                case 0:
                    if (B(obj, length)) {
                        d8.g(iW, p(obj, X(iV0)));
                    }
                    break;
                case 1:
                    if (B(obj, length)) {
                        d8.G(iW, t(obj, X(iV0)));
                    }
                    break;
                case 2:
                    if (B(obj, length)) {
                        d8.q(iW, L(obj, X(iV0)));
                    }
                    break;
                case 3:
                    if (B(obj, length)) {
                        d8.o(iW, L(obj, X(iV0)));
                    }
                    break;
                case 4:
                    if (B(obj, length)) {
                        d8.w(iW, z(obj, X(iV0)));
                    }
                    break;
                case 5:
                    if (B(obj, length)) {
                        d8.k(iW, L(obj, X(iV0)));
                    }
                    break;
                case 6:
                    if (B(obj, length)) {
                        d8.f(iW, z(obj, X(iV0)));
                    }
                    break;
                case 7:
                    if (B(obj, length)) {
                        d8.r(iW, l(obj, X(iV0)));
                    }
                    break;
                case 8:
                    if (B(obj, length)) {
                        z0(iW, z0.G(obj, X(iV0)), d8);
                    }
                    break;
                case 9:
                    if (B(obj, length)) {
                        d8.j(iW, z0.G(obj, X(iV0)), w(length));
                    }
                    break;
                case 10:
                    if (B(obj, length)) {
                        d8.v(iW, (AbstractC2097h) z0.G(obj, X(iV0)));
                    }
                    break;
                case 11:
                    if (B(obj, length)) {
                        d8.d(iW, z(obj, X(iV0)));
                    }
                    break;
                case 12:
                    if (B(obj, length)) {
                        d8.J(iW, z(obj, X(iV0)));
                    }
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    if (B(obj, length)) {
                        d8.t(iW, z(obj, X(iV0)));
                    }
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    if (B(obj, length)) {
                        d8.z(iW, L(obj, X(iV0)));
                    }
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    if (B(obj, length)) {
                        d8.N(iW, z(obj, X(iV0)));
                    }
                    break;
                case 16:
                    if (B(obj, length)) {
                        d8.F(iW, L(obj, X(iV0)));
                    }
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    if (B(obj, length)) {
                        d8.s(iW, z0.G(obj, X(iV0)), w(length));
                    }
                    break;
                case 18:
                    p0.O(W(length), (List) z0.G(obj, X(iV0)), d8, false);
                    break;
                case 19:
                    p0.S(W(length), (List) z0.G(obj, X(iV0)), d8, false);
                    break;
                case 20:
                    p0.V(W(length), (List) z0.G(obj, X(iV0)), d8, false);
                    break;
                case 21:
                    p0.d0(W(length), (List) z0.G(obj, X(iV0)), d8, false);
                    break;
                case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                    p0.U(W(length), (List) z0.G(obj, X(iV0)), d8, false);
                    break;
                case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                    p0.R(W(length), (List) z0.G(obj, X(iV0)), d8, false);
                    break;
                case 24:
                    p0.Q(W(length), (List) z0.G(obj, X(iV0)), d8, false);
                    break;
                case 25:
                    p0.M(W(length), (List) z0.G(obj, X(iV0)), d8, false);
                    break;
                case 26:
                    p0.b0(W(length), (List) z0.G(obj, X(iV0)), d8);
                    break;
                case 27:
                    p0.W(W(length), (List) z0.G(obj, X(iV0)), d8, w(length));
                    break;
                case 28:
                    p0.N(W(length), (List) z0.G(obj, X(iV0)), d8);
                    break;
                case 29:
                    p0.c0(W(length), (List) z0.G(obj, X(iV0)), d8, false);
                    break;
                case 30:
                    p0.P(W(length), (List) z0.G(obj, X(iV0)), d8, false);
                    break;
                case 31:
                    p0.X(W(length), (List) z0.G(obj, X(iV0)), d8, false);
                    break;
                case 32:
                    p0.Y(W(length), (List) z0.G(obj, X(iV0)), d8, false);
                    break;
                case 33:
                    p0.Z(W(length), (List) z0.G(obj, X(iV0)), d8, false);
                    break;
                case 34:
                    p0.a0(W(length), (List) z0.G(obj, X(iV0)), d8, false);
                    break;
                case 35:
                    p0.O(W(length), (List) z0.G(obj, X(iV0)), d8, true);
                    break;
                case 36:
                    p0.S(W(length), (List) z0.G(obj, X(iV0)), d8, true);
                    break;
                case 37:
                    p0.V(W(length), (List) z0.G(obj, X(iV0)), d8, true);
                    break;
                case 38:
                    p0.d0(W(length), (List) z0.G(obj, X(iV0)), d8, true);
                    break;
                case 39:
                    p0.U(W(length), (List) z0.G(obj, X(iV0)), d8, true);
                    break;
                case Messages.ServerMessage.ICON_FIELD_NUMBER /* 40 */:
                    p0.R(W(length), (List) z0.G(obj, X(iV0)), d8, true);
                    break;
                case 41:
                    p0.Q(W(length), (List) z0.G(obj, X(iV0)), d8, true);
                    break;
                case 42:
                    p0.M(W(length), (List) z0.G(obj, X(iV0)), d8, true);
                    break;
                case 43:
                    p0.c0(W(length), (List) z0.G(obj, X(iV0)), d8, true);
                    break;
                case 44:
                    p0.P(W(length), (List) z0.G(obj, X(iV0)), d8, true);
                    break;
                case 45:
                    p0.X(W(length), (List) z0.G(obj, X(iV0)), d8, true);
                    break;
                case 46:
                    p0.Y(W(length), (List) z0.G(obj, X(iV0)), d8, true);
                    break;
                case 47:
                    p0.Z(W(length), (List) z0.G(obj, X(iV0)), d8, true);
                    break;
                case 48:
                    p0.a0(W(length), (List) z0.G(obj, X(iV0)), d8, true);
                    break;
                case 49:
                    p0.T(W(length), (List) z0.G(obj, X(iV0)), d8, w(length));
                    break;
                case 50:
                    y0(d8, iW, z0.G(obj, X(iV0)), length);
                    break;
                case 51:
                    if (J(obj, iW, length)) {
                        d8.g(iW, Z(obj, X(iV0)));
                    }
                    break;
                case 52:
                    if (J(obj, iW, length)) {
                        d8.G(iW, a0(obj, X(iV0)));
                    }
                    break;
                case 53:
                    if (J(obj, iW, length)) {
                        d8.q(iW, c0(obj, X(iV0)));
                    }
                    break;
                case 54:
                    if (J(obj, iW, length)) {
                        d8.o(iW, c0(obj, X(iV0)));
                    }
                    break;
                case 55:
                    if (J(obj, iW, length)) {
                        d8.w(iW, b0(obj, X(iV0)));
                    }
                    break;
                case 56:
                    if (J(obj, iW, length)) {
                        d8.k(iW, c0(obj, X(iV0)));
                    }
                    break;
                case 57:
                    if (J(obj, iW, length)) {
                        d8.f(iW, b0(obj, X(iV0)));
                    }
                    break;
                case 58:
                    if (J(obj, iW, length)) {
                        d8.r(iW, Y(obj, X(iV0)));
                    }
                    break;
                case 59:
                    if (J(obj, iW, length)) {
                        z0(iW, z0.G(obj, X(iV0)), d8);
                    }
                    break;
                case 60:
                    if (J(obj, iW, length)) {
                        d8.j(iW, z0.G(obj, X(iV0)), w(length));
                    }
                    break;
                case 61:
                    if (J(obj, iW, length)) {
                        d8.v(iW, (AbstractC2097h) z0.G(obj, X(iV0)));
                    }
                    break;
                case 62:
                    if (J(obj, iW, length)) {
                        d8.d(iW, b0(obj, X(iV0)));
                    }
                    break;
                case 63:
                    if (J(obj, iW, length)) {
                        d8.J(iW, b0(obj, X(iV0)));
                    }
                    break;
                case 64:
                    if (J(obj, iW, length)) {
                        d8.t(iW, b0(obj, X(iV0)));
                    }
                    break;
                case 65:
                    if (J(obj, iW, length)) {
                        d8.z(iW, c0(obj, X(iV0)));
                    }
                    break;
                case 66:
                    if (J(obj, iW, length)) {
                        d8.N(iW, b0(obj, X(iV0)));
                    }
                    break;
                case 67:
                    if (J(obj, iW, length)) {
                        d8.F(iW, c0(obj, X(iV0)));
                    }
                    break;
                case 68:
                    if (J(obj, iW, length)) {
                        d8.s(iW, z0.G(obj, X(iV0)), w(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f19256p.j(d8, entry);
            entry = itG.hasNext() ? (Map.Entry) itG.next() : null;
        }
    }

    public final int y(v0 v0Var, Object obj) {
        return v0Var.h(v0Var.g(obj));
    }

    public final void y0(D0 d8, int i8, Object obj, int i9) {
        if (obj != null) {
            d8.C(i8, this.f19257q.c(v(i9)), this.f19257q.h(obj));
        }
    }

    public final void z0(int i8, Object obj, D0 d8) {
        if (obj instanceof String) {
            d8.n(i8, (String) obj);
        } else {
            d8.v(i8, (AbstractC2097h) obj);
        }
    }
}
