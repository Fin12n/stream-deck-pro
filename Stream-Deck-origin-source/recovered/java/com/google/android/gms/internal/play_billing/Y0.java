package com.google.android.gms.internal.play_billing;

import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.vsd2.Messages;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y0 implements InterfaceC2017g1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f18833o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Unsafe f18834p = G1.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f18835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f18836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V0 f18839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f18841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final L0 f18844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC2076w1 f18845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AbstractC2012f0 f18846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1993a1 f18847m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Q0 f18848n;

    public Y0(int[] iArr, Object[] objArr, int i8, int i9, V0 v8, int i10, boolean z8, int[] iArr2, int i11, int i12, C1993a1 c1993a1, L0 l8, AbstractC2076w1 abstractC2076w1, AbstractC2012f0 abstractC2012f0, Q0 q8) {
        this.f18835a = iArr;
        this.f18836b = objArr;
        this.f18837c = i8;
        this.f18838d = i9;
        boolean z9 = false;
        if (abstractC2012f0 != null && abstractC2012f0.f(v8)) {
            z9 = true;
        }
        this.f18840f = z9;
        this.f18841g = iArr2;
        this.f18842h = i11;
        this.f18843i = i12;
        this.f18847m = c1993a1;
        this.f18844j = l8;
        this.f18845k = abstractC2076w1;
        this.f18846l = abstractC2012f0;
        this.f18839e = v8;
        this.f18848n = q8;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0268  */
    /* JADX WARN: Code duplicated, block: B:127:0x026e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0284  */
    /* JADX WARN: Code duplicated, block: B:131:0x0287  */
    /* JADX WARN: Code duplicated, block: B:171:0x0351  */
    /* JADX WARN: Code duplicated, block: B:186:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ad  */
    public static Y0 A(Class cls, S0 s8, C1993a1 c1993a1, L0 l8, AbstractC2076w1 abstractC2076w1, AbstractC2012f0 abstractC2012f0, Q0 q8) {
        int i8;
        int iCharAt;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        char cCharAt;
        int i16;
        char cCharAt2;
        int i17;
        char cCharAt3;
        int i18;
        char cCharAt4;
        int i19;
        char cCharAt5;
        int i20;
        char cCharAt6;
        int i21;
        char cCharAt7;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int iObjectFieldOffset;
        int i27;
        int iObjectFieldOffset2;
        int i28;
        int iObjectFieldOffset3;
        Field fieldO;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field fieldO2;
        int i34;
        Object obj2;
        Field fieldO3;
        int i35;
        char cCharAt10;
        int i36;
        char cCharAt11;
        int i37;
        char cCharAt12;
        int i38;
        char cCharAt13;
        if (!(s8 instanceof C2013f1)) {
            p063h.s.a(s8);
            throw null;
        }
        C2013f1 c2013f1 = (C2013f1) s8;
        String strA = c2013f1.a();
        int length = strA.length();
        char c8 = 55296;
        if (strA.charAt(0) >= 55296) {
            int i39 = 1;
            while (true) {
                i8 = i39 + 1;
                if (strA.charAt(i39) < 55296) {
                    break;
                }
                i39 = i8;
            }
        } else {
            i8 = 1;
        }
        int i40 = i8 + 1;
        int iCharAt2 = strA.charAt(i8);
        if (iCharAt2 >= 55296) {
            int i41 = iCharAt2 & 8191;
            int i42 = 13;
            while (true) {
                i38 = i40 + 1;
                cCharAt13 = strA.charAt(i40);
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
            i11 = 0;
            iCharAt = 0;
            i10 = 0;
            i12 = 0;
            i9 = 0;
            i13 = 0;
            iArr = f18833o;
            i14 = 0;
        } else {
            int i43 = i40 + 1;
            int iCharAt3 = strA.charAt(i40);
            if (iCharAt3 >= 55296) {
                int i44 = iCharAt3 & 8191;
                int i45 = 13;
                while (true) {
                    i22 = i43 + 1;
                    cCharAt8 = strA.charAt(i43);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i22;
                }
                iCharAt3 = i44 | (cCharAt8 << i45);
                i43 = i22;
            }
            int i46 = i43 + 1;
            int iCharAt4 = strA.charAt(i43);
            if (iCharAt4 >= 55296) {
                int i47 = iCharAt4 & 8191;
                int i48 = 13;
                while (true) {
                    i21 = i46 + 1;
                    cCharAt7 = strA.charAt(i46);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i21;
                }
                iCharAt4 = i47 | (cCharAt7 << i48);
                i46 = i21;
            }
            int i49 = i46 + 1;
            int iCharAt5 = strA.charAt(i46);
            if (iCharAt5 >= 55296) {
                int i50 = iCharAt5 & 8191;
                int i51 = 13;
                while (true) {
                    i20 = i49 + 1;
                    cCharAt6 = strA.charAt(i49);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i20;
                }
                iCharAt5 = i50 | (cCharAt6 << i51);
                i49 = i20;
            }
            int i52 = i49 + 1;
            int iCharAt6 = strA.charAt(i49);
            if (iCharAt6 >= 55296) {
                int i53 = iCharAt6 & 8191;
                int i54 = 13;
                while (true) {
                    i19 = i52 + 1;
                    cCharAt5 = strA.charAt(i52);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i19;
                }
                iCharAt6 = i53 | (cCharAt5 << i54);
                i52 = i19;
            }
            int i55 = i52 + 1;
            iCharAt = strA.charAt(i52);
            if (iCharAt >= 55296) {
                int i56 = iCharAt & 8191;
                int i57 = 13;
                while (true) {
                    i18 = i55 + 1;
                    cCharAt4 = strA.charAt(i55);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i18;
                }
                iCharAt = i56 | (cCharAt4 << i57);
                i55 = i18;
            }
            int i58 = i55 + 1;
            int iCharAt7 = strA.charAt(i55);
            if (iCharAt7 >= 55296) {
                int i59 = iCharAt7 & 8191;
                int i60 = 13;
                while (true) {
                    i17 = i58 + 1;
                    cCharAt3 = strA.charAt(i58);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i17;
                }
                iCharAt7 = i59 | (cCharAt3 << i60);
                i58 = i17;
            }
            int i61 = i58 + 1;
            int iCharAt8 = strA.charAt(i58);
            if (iCharAt8 >= 55296) {
                int i62 = iCharAt8 & 8191;
                int i63 = 13;
                while (true) {
                    i16 = i61 + 1;
                    cCharAt2 = strA.charAt(i61);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i62 |= (cCharAt2 & 8191) << i63;
                    i63 += 13;
                    i61 = i16;
                }
                iCharAt8 = i62 | (cCharAt2 << i63);
                i61 = i16;
            }
            int i64 = i61 + 1;
            int iCharAt9 = strA.charAt(i61);
            if (iCharAt9 >= 55296) {
                int i65 = iCharAt9 & 8191;
                int i66 = 13;
                while (true) {
                    i15 = i64 + 1;
                    cCharAt = strA.charAt(i64);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i65 |= (cCharAt & 8191) << i66;
                    i66 += 13;
                    i64 = i15;
                }
                iCharAt9 = i65 | (cCharAt << i66);
                i64 = i15;
            }
            i9 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i67 = iCharAt7;
            i10 = iCharAt5;
            i11 = i67;
            iArr = iArr2;
            i12 = iCharAt6;
            i13 = iCharAt9;
            i14 = iCharAt3;
            i40 = i64;
        }
        Unsafe unsafe = f18834p;
        Object[] objArrB = c2013f1.b();
        Class<?> cls2 = c2013f1.zza().getClass();
        int i68 = i13 + i11;
        int i69 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i69];
        int i70 = 0;
        int i71 = 0;
        int i72 = i13;
        int i73 = i68;
        while (i40 < length) {
            int i74 = i40 + 1;
            int iCharAt10 = strA.charAt(i40);
            if (iCharAt10 >= c8) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i37 = i76 + 1;
                    cCharAt12 = strA.charAt(i76);
                    if (cCharAt12 < c8) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i37;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i23 = i37;
            } else {
                i23 = i74;
            }
            int i78 = i23 + 1;
            int iCharAt11 = strA.charAt(i23);
            if (iCharAt11 >= c8) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i36 = i80 + 1;
                    cCharAt11 = strA.charAt(i80);
                    if (cCharAt11 < c8) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i36;
                }
                iCharAt11 = i79 | (cCharAt11 << i81);
                i24 = i36;
            } else {
                i24 = i78;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i70] = i71;
                i70++;
            }
            int i82 = iCharAt11 & 255;
            int i83 = iCharAt11 & 2048;
            C2013f1 c2013f2 = c2013f1;
            if (i82 >= 51) {
                int i84 = i24 + 1;
                int iCharAt12 = strA.charAt(i24);
                char c9 = 55296;
                if (iCharAt12 >= 55296) {
                    int i85 = iCharAt12 & 8191;
                    int i86 = i84;
                    int i87 = 13;
                    while (true) {
                        i35 = i86 + 1;
                        cCharAt10 = strA.charAt(i86);
                        if (cCharAt10 < c9) {
                            break;
                        }
                        i85 |= (cCharAt10 & 8191) << i87;
                        i87 += 13;
                        i86 = i35;
                        c9 = 55296;
                    }
                    iCharAt12 = i85 | (cCharAt10 << i87);
                    i31 = i35;
                } else {
                    i31 = i84;
                }
                int i88 = i31;
                int i89 = i82 - 51;
                if (i89 == 9 || i89 == 17) {
                    i32 = i9 + 1;
                    int i90 = i71 / 3;
                    objArr[i90 + i90 + 1] = objArrB[i9];
                } else {
                    if (i89 == 12) {
                        if (c2013f2.j() == 1 || i83 != 0) {
                            i32 = i9 + 1;
                            int i91 = i71 / 3;
                            objArr[i91 + i91 + 1] = objArrB[i9];
                        } else {
                            i83 = 0;
                        }
                    }
                    i33 = iCharAt12 + iCharAt12;
                    obj = objArrB[i33];
                    if (obj instanceof Field) {
                        fieldO2 = (Field) obj;
                    } else {
                        fieldO2 = O(cls2, (String) obj);
                        objArrB[i33] = fieldO2;
                    }
                    int i92 = iCharAt10;
                    int i93 = i83;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO2);
                    i34 = i33 + 1;
                    obj2 = objArrB[i34];
                    if (obj2 instanceof Field) {
                        fieldO3 = (Field) obj2;
                    } else {
                        fieldO3 = O(cls2, (String) obj2);
                        objArrB[i34] = fieldO3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                    strA = strA;
                    i27 = i88;
                    i83 = i93;
                    i28 = 0;
                    i25 = i92;
                }
                i9 = i32;
                i33 = iCharAt12 + iCharAt12;
                obj = objArrB[i33];
                if (obj instanceof Field) {
                    fieldO2 = (Field) obj;
                } else {
                    fieldO2 = O(cls2, (String) obj);
                    objArrB[i33] = fieldO2;
                }
                int i94 = iCharAt10;
                int i95 = i83;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO2);
                i34 = i33 + 1;
                obj2 = objArrB[i34];
                if (obj2 instanceof Field) {
                    fieldO3 = (Field) obj2;
                } else {
                    fieldO3 = O(cls2, (String) obj2);
                    objArrB[i34] = fieldO3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                strA = strA;
                i27 = i88;
                i83 = i95;
                i28 = 0;
                i25 = i94;
            } else {
                i25 = iCharAt10;
                int i96 = i9 + 1;
                Field fieldO4 = O(cls2, (String) objArrB[i9]);
                if (i82 == 9 || i82 == 17) {
                    int i97 = i71 / 3;
                    objArr[i97 + i97 + 1] = fieldO4.getType();
                } else {
                    if (i82 != 27) {
                        if (i82 == 49) {
                            i30 = i9 + 2;
                            i29 = 1;
                        } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                            i25 = i25;
                            if (c2013f2.j() == 1 || i83 != 0) {
                                i30 = i9 + 2;
                                int i98 = i71 / 3;
                                objArr[i98 + i98 + 1] = objArrB[i96];
                                i26 = i30;
                            } else {
                                i26 = i96;
                                i83 = 0;
                            }
                        } else if (i82 == 50) {
                            i26 = i9 + 2;
                            int i99 = i72 + 1;
                            iArr[i72] = i71;
                            int i100 = i71 / 3;
                            int i101 = i100 + i100;
                            objArr[i101] = objArrB[i96];
                            if (i83 != 0) {
                                objArr[i101 + 1] = objArrB[i26];
                                i26 = i9 + 3;
                                i72 = i99;
                                i25 = i25;
                            } else {
                                i72 = i99;
                                i83 = 0;
                                i25 = i25;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                        iCharAt11 = iCharAt11;
                        if ((iCharAt11 & 4096) != 0 || i82 > 17) {
                            i27 = i24;
                            iObjectFieldOffset2 = 1048575;
                            i28 = 0;
                        } else {
                            int i102 = i24 + 1;
                            int iCharAt13 = strA.charAt(i24);
                            if (iCharAt13 >= 55296) {
                                int i103 = iCharAt13 & 8191;
                                int i104 = 13;
                                while (true) {
                                    i27 = i102 + 1;
                                    cCharAt9 = strA.charAt(i102);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i103 |= (cCharAt9 & 8191) << i104;
                                    i104 += 13;
                                    i102 = i27;
                                }
                                iCharAt13 = i103 | (cCharAt9 << i104);
                            } else {
                                i27 = i102;
                            }
                            int i105 = i14 + i14 + (iCharAt13 / 32);
                            Object obj3 = objArrB[i105];
                            if (obj3 instanceof Field) {
                                fieldO = (Field) obj3;
                            } else {
                                fieldO = O(cls2, (String) obj3);
                                objArrB[i105] = fieldO;
                            }
                            i28 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO);
                        }
                        if (i82 >= 18 && i82 <= 49) {
                            iArr[i73] = iObjectFieldOffset;
                            i73++;
                        }
                        iObjectFieldOffset3 = iObjectFieldOffset;
                        i9 = i26;
                    } else {
                        i29 = 1;
                        i30 = i9 + 2;
                    }
                    int i106 = i71 / 3;
                    objArr[i106 + i106 + i29] = objArrB[i96];
                    i26 = i30;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                    iCharAt11 = iCharAt11;
                    if ((iCharAt11 & 4096) != 0) {
                        i27 = i24;
                        iObjectFieldOffset2 = 1048575;
                        i28 = 0;
                    } else {
                        i27 = i24;
                        iObjectFieldOffset2 = 1048575;
                        i28 = 0;
                    }
                    if (i82 >= 18) {
                        iArr[i73] = iObjectFieldOffset;
                        i73++;
                    }
                    iObjectFieldOffset3 = iObjectFieldOffset;
                    i9 = i26;
                }
                i26 = i96;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                iCharAt11 = iCharAt11;
                if ((iCharAt11 & 4096) != 0) {
                    i27 = i24;
                    iObjectFieldOffset2 = 1048575;
                    i28 = 0;
                } else {
                    i27 = i24;
                    iObjectFieldOffset2 = 1048575;
                    i28 = 0;
                }
                if (i82 >= 18) {
                    iArr[i73] = iObjectFieldOffset;
                    i73++;
                }
                iObjectFieldOffset3 = iObjectFieldOffset;
                i9 = i26;
            }
            int i107 = i71 + 1;
            iArr3[i71] = i25;
            int i108 = i71 + 2;
            iArr3[i107] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i83 != 0 ? Integer.MIN_VALUE : 0) | (i82 << 20) | iObjectFieldOffset3;
            i71 += 3;
            iArr3[i108] = (i28 << 20) | iObjectFieldOffset2;
            i40 = i27;
            c2013f1 = c2013f2;
            strA = strA;
            length = length;
            c8 = 55296;
        }
        C2013f1 c2013f3 = c2013f1;
        return new Y0(iArr3, objArr, i10, i12, c2013f3.zza(), c2013f3.j(), false, iArr, i13, i68, c1993a1, l8, abstractC2076w1, abstractC2012f0, q8);
    }

    public static double B(Object obj, long j8) {
        return ((Double) G1.k(obj, j8)).doubleValue();
    }

    public static float C(Object obj, long j8) {
        return ((Float) G1.k(obj, j8)).floatValue();
    }

    public static int D(Object obj, long j8) {
        return ((Integer) G1.k(obj, j8)).intValue();
    }

    public static int G(int i8) {
        return (i8 >>> 20) & 255;
    }

    public static long I(Object obj, long j8) {
        return ((Long) G1.k(obj, j8)).longValue();
    }

    public static Field O(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static void j(Object obj) {
        if (!u(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean t(Object obj, int i8, InterfaceC2017g1 interfaceC2017g1) {
        return interfaceC2017g1.b(G1.k(obj, i8 & 1048575));
    }

    public static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC2056q0) {
            return ((AbstractC2056q0) obj).x();
        }
        return true;
    }

    public static boolean w(Object obj, long j8) {
        return ((Boolean) G1.k(obj, j8)).booleanValue();
    }

    public static final void x(int i8, Object obj, O1 o8) {
        if (obj instanceof String) {
            o8.b(i8, (String) obj);
        } else {
            o8.J(i8, (S) obj);
        }
    }

    public static C2079x1 z(Object obj) {
        AbstractC2056q0 abstractC2056q0 = (AbstractC2056q0) obj;
        C2079x1 c2079x1 = abstractC2056q0.zzc;
        if (c2079x1 != C2079x1.c()) {
            return c2079x1;
        }
        C2079x1 c2079x1F = C2079x1.f();
        abstractC2056q0.zzc = c2079x1F;
        return c2079x1F;
    }

    public final int E(int i8) {
        return this.f18835a[i8 + 2];
    }

    public final int F(int i8, int i9) {
        int length = (this.f18835a.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = this.f18835a[i11];
            if (i8 == i12) {
                return i11;
            }
            if (i8 < i12) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    public final int H(int i8) {
        return this.f18835a[i8 + 1];
    }

    public final InterfaceC2069u0 J(int i8) {
        int i9 = i8 / 3;
        return (InterfaceC2069u0) this.f18836b[i9 + i9 + 1];
    }

    public final InterfaceC2017g1 K(int i8) {
        Object[] objArr = this.f18836b;
        int i9 = i8 / 3;
        int i10 = i9 + i9;
        InterfaceC2017g1 interfaceC2017g1 = (InterfaceC2017g1) objArr[i10];
        if (interfaceC2017g1 != null) {
            return interfaceC2017g1;
        }
        InterfaceC2017g1 interfaceC2017g1B = C2005d1.a().b((Class) objArr[i10 + 1]);
        this.f18836b[i10] = interfaceC2017g1B;
        return interfaceC2017g1B;
    }

    public final Object L(int i8) {
        int i9 = i8 / 3;
        return this.f18836b[i9 + i9];
    }

    public final Object M(Object obj, int i8) {
        InterfaceC2017g1 interfaceC2017g1K = K(i8);
        int iH = H(i8) & 1048575;
        if (!r(obj, i8)) {
            return interfaceC2017g1K.f();
        }
        Object object = f18834p.getObject(obj, iH);
        if (u(object)) {
            return object;
        }
        Object objF = interfaceC2017g1K.f();
        if (object != null) {
            interfaceC2017g1K.e(objF, object);
        }
        return objF;
    }

    public final Object N(Object obj, int i8, int i9) {
        InterfaceC2017g1 interfaceC2017g1K = K(i9);
        if (!v(obj, i8, i9)) {
            return interfaceC2017g1K.f();
        }
        Object object = f18834p.getObject(obj, H(i9) & 1048575);
        if (u(object)) {
            return object;
        }
        Object objF = interfaceC2017g1K.f();
        if (object != null) {
            interfaceC2017g1K.e(objF, object);
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final void a(Object obj) {
        if (u(obj)) {
            if (obj instanceof AbstractC2056q0) {
                AbstractC2056q0 abstractC2056q0 = (AbstractC2056q0) obj;
                abstractC2056q0.v(Integer.MAX_VALUE);
                abstractC2056q0.zza = 0;
                abstractC2056q0.t();
            }
            int[] iArr = this.f18835a;
            for (int i8 = 0; i8 < iArr.length; i8 += 3) {
                int iH = H(i8);
                int i9 = 1048575 & iH;
                int iG = G(iH);
                long j8 = i9;
                if (iG != 9) {
                    if (iG != 60 && iG != 68) {
                        switch (iG) {
                            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                                if (r(obj, i8)) {
                                    K(i8).a(f18834p.getObject(obj, j8));
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
                                this.f18844j.a(obj, j8);
                                break;
                            case 50:
                                Unsafe unsafe = f18834p;
                                Object object = unsafe.getObject(obj, j8);
                                if (object != null) {
                                    ((P0) object).d();
                                    unsafe.putObject(obj, j8, object);
                                }
                                break;
                        }
                    } else if (v(obj, this.f18835a[i8], i8)) {
                        K(i8).a(f18834p.getObject(obj, j8));
                    }
                } else if (r(obj, i8)) {
                    K(i8).a(f18834p.getObject(obj, j8));
                }
            }
            this.f18845k.g(obj);
            if (this.f18840f) {
                this.f18846l.d(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3 A[LOOP:1: B:45:0x00a2->B:50:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final boolean b(Object obj) {
        int i8;
        int i9;
        List list;
        InterfaceC2017g1 interfaceC2017g1K;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (i11 < this.f18842h) {
            int[] iArr = this.f18841g;
            int[] iArr2 = this.f18835a;
            int i14 = iArr[i11];
            int i15 = iArr2[i14];
            int iH = H(i14);
            int i16 = this.f18835a[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i13) {
                if (i17 != 1048575) {
                    i12 = f18834p.getInt(obj, i17);
                }
                i9 = i12;
                i8 = i17;
            } else {
                i8 = i13;
                i9 = i12;
            }
            Object obj2 = obj;
            if ((268435456 & iH) != 0 && !s(obj2, i14, i8, i9, i18)) {
                return false;
            }
            int iG = G(iH);
            if (iG == 9 || iG == 17) {
                if (s(obj2, i14, i8, i9, i18) && !t(obj2, iH, K(i14))) {
                    return false;
                }
            } else if (iG == 27) {
                list = (List) G1.k(obj2, iH & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC2017g1K = K(i14);
                    for (i10 = 0; i10 < list.size(); i10++) {
                        if (!interfaceC2017g1K.b(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (iG == 60 || iG == 68) {
                if (v(obj2, i15, i14) && !t(obj2, iH, K(i14))) {
                    return false;
                }
            } else if (iG == 49) {
                list = (List) G1.k(obj2, iH & 1048575);
                if (list.isEmpty()) {
                    interfaceC2017g1K = K(i14);
                    while (i10 < list.size()) {
                        if (!interfaceC2017g1K.b(list.get(i10))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iG == 50 && !((P0) G1.k(obj2, iH & 1048575)).isEmpty()) {
                p063h.s.a(L(i14));
                throw null;
            }
            i11++;
            obj = obj2;
            i13 = i8;
            i12 = i9;
        }
        return !this.f18840f || this.f18846l.b(obj).i();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final int c(Object obj) {
        int i8;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i9;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f18835a.length; i11 += 3) {
            int iH = H(i11);
            int[] iArr = this.f18835a;
            int i12 = 1048575 & iH;
            int iG = G(iH);
            int i13 = iArr[i11];
            long j8 = i12;
            int iHashCode = 37;
            switch (iG) {
                case 0:
                    i8 = i10 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(G1.f(obj, j8));
                    Charset charset = AbstractC2081y0.f19031a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 1:
                    i8 = i10 * 53;
                    iFloatToIntBits = Float.floatToIntBits(G1.g(obj, j8));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 2:
                    i8 = i10 * 53;
                    jDoubleToLongBits = G1.i(obj, j8);
                    Charset charset2 = AbstractC2081y0.f19031a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 3:
                    i8 = i10 * 53;
                    jDoubleToLongBits = G1.i(obj, j8);
                    Charset charset3 = AbstractC2081y0.f19031a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 4:
                    i8 = i10 * 53;
                    iFloatToIntBits = G1.h(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 5:
                    i8 = i10 * 53;
                    jDoubleToLongBits = G1.i(obj, j8);
                    Charset charset4 = AbstractC2081y0.f19031a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 6:
                    i8 = i10 * 53;
                    iFloatToIntBits = G1.h(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 7:
                    i8 = i10 * 53;
                    iFloatToIntBits = AbstractC2081y0.a(G1.B(obj, j8));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 8:
                    i8 = i10 * 53;
                    iFloatToIntBits = ((String) G1.k(obj, j8)).hashCode();
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 9:
                    i9 = i10 * 53;
                    Object objK = G1.k(obj, j8);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i10 = i9 + iHashCode;
                    break;
                case 10:
                    i8 = i10 * 53;
                    iFloatToIntBits = G1.k(obj, j8).hashCode();
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 11:
                    i8 = i10 * 53;
                    iFloatToIntBits = G1.h(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 12:
                    i8 = i10 * 53;
                    iFloatToIntBits = G1.h(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    i8 = i10 * 53;
                    iFloatToIntBits = G1.h(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    i8 = i10 * 53;
                    jDoubleToLongBits = G1.i(obj, j8);
                    Charset charset5 = AbstractC2081y0.f19031a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    i8 = i10 * 53;
                    iFloatToIntBits = G1.h(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 16:
                    i8 = i10 * 53;
                    jDoubleToLongBits = G1.i(obj, j8);
                    Charset charset6 = AbstractC2081y0.f19031a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    i9 = i10 * 53;
                    Object objK2 = G1.k(obj, j8);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i10 = i9 + iHashCode;
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
                    i8 = i10 * 53;
                    iFloatToIntBits = G1.k(obj, j8).hashCode();
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 50:
                    i8 = i10 * 53;
                    iFloatToIntBits = G1.k(obj, j8).hashCode();
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 51:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(B(obj, j8));
                        Charset charset7 = AbstractC2081y0.f19031a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = Float.floatToIntBits(C(obj, j8));
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        jDoubleToLongBits = I(obj, j8);
                        Charset charset8 = AbstractC2081y0.f19031a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        jDoubleToLongBits = I(obj, j8);
                        Charset charset9 = AbstractC2081y0.f19031a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = D(obj, j8);
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        jDoubleToLongBits = I(obj, j8);
                        Charset charset10 = AbstractC2081y0.f19031a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = D(obj, j8);
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = AbstractC2081y0.a(w(obj, j8));
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = ((String) G1.k(obj, j8)).hashCode();
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = G1.k(obj, j8).hashCode();
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = G1.k(obj, j8).hashCode();
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = D(obj, j8);
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = D(obj, j8);
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = D(obj, j8);
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        jDoubleToLongBits = I(obj, j8);
                        Charset charset11 = AbstractC2081y0.f19031a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = D(obj, j8);
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        jDoubleToLongBits = I(obj, j8);
                        Charset charset12 = AbstractC2081y0.f19031a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = G1.k(obj, j8).hashCode();
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i10 * 53) + this.f18845k.d(obj).hashCode();
        return this.f18840f ? (iHashCode2 * 53) + this.f18846l.b(obj).f18917a.hashCode() : iHashCode2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x038d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0484  */
    /* JADX WARN: Code duplicated, block: B:282:0x0723 A[PHI: r0 r1
      0x0723: PHI (r0v2 com.google.android.gms.internal.play_billing.Y0) = 
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v33 com.google.android.gms.internal.play_billing.Y0)
      (r0v42 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
      (r0v1 com.google.android.gms.internal.play_billing.Y0)
     binds: [B:18:0x0051, B:280:0x0719, B:250:0x0654, B:234:0x05ed, B:225:0x05b7, B:218:0x0584, B:138:0x0371, B:135:0x0359, B:132:0x0341, B:129:0x0329, B:126:0x0311, B:123:0x02f9, B:120:0x02e1, B:117:0x02c9, B:114:0x02b0, B:111:0x0299, B:108:0x0282, B:105:0x026b, B:102:0x0254, B:97:0x0238, B:83:0x01e5, B:85:0x01f3, B:80:0x01ca, B:77:0x01bc, B:74:0x01a6, B:71:0x0190, B:68:0x0179, B:65:0x016b, B:62:0x015d, B:59:0x014d, B:53:0x0122, B:50:0x010e, B:46:0x00f0, B:43:0x00db, B:40:0x00c5, B:36:0x00b6, B:32:0x00a7, B:29:0x008d, B:25:0x0072, B:21:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0723: PHI (r1v6 java.lang.Object) = 
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v7 java.lang.Object)
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
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
     binds: [B:18:0x0051, B:280:0x0719, B:250:0x0654, B:234:0x05ed, B:225:0x05b7, B:218:0x0584, B:138:0x0371, B:135:0x0359, B:132:0x0341, B:129:0x0329, B:126:0x0311, B:123:0x02f9, B:120:0x02e1, B:117:0x02c9, B:114:0x02b0, B:111:0x0299, B:108:0x0282, B:105:0x026b, B:102:0x0254, B:97:0x0238, B:83:0x01e5, B:85:0x01f3, B:80:0x01ca, B:77:0x01bc, B:74:0x01a6, B:71:0x0190, B:68:0x0179, B:65:0x016b, B:62:0x015d, B:59:0x014d, B:53:0x0122, B:50:0x010e, B:46:0x00f0, B:43:0x00db, B:40:0x00c5, B:36:0x00b6, B:32:0x00a7, B:29:0x008d, B:25:0x0072, B:21:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final int d(Object obj) {
        int i8;
        int iW;
        int iW2;
        int iW3;
        int iX;
        int iW4;
        int iW5;
        int iW6;
        int iT;
        int iW7;
        int iO;
        int i9;
        int iN;
        int size;
        int iS;
        int iW8;
        int iW9;
        int iW10;
        int iX2;
        int iL;
        int iW11;
        int iW12;
        int iT2;
        int iW13;
        int iW14;
        int iT3;
        int iW15;
        Y0 y8 = this;
        Object obj2 = obj;
        Unsafe unsafe = f18834p;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i11 < y8.f18835a.length) {
            int iH = y8.H(i11);
            int iG = G(iH);
            int[] iArr = y8.f18835a;
            int i15 = iArr[i11];
            int i16 = iArr[i11 + 2];
            int i17 = i16 & i10;
            if (iG <= 17) {
                if (i17 != i14) {
                    i12 = i17 == i10 ? 0 : unsafe.getInt(obj2, i17);
                    i14 = i17;
                }
                i8 = 1 << (i16 >>> 20);
            } else {
                i8 = 0;
            }
            int i18 = iH & i10;
            if (iG >= EnumC2032k0.f18935Y.zza()) {
                EnumC2032k0.f18957l0.zza();
            }
            int i19 = i13;
            long j8 = i18;
            switch (iG) {
                case 0:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        iW = AbstractC1992a0.w(i15 << 3);
                        iO = iW + 8;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 1:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        iW2 = AbstractC1992a0.w(i15 << 3);
                        iW5 = iW2 + 4;
                        i13 = i19 + iW5;
                        y8 = this;
                        obj2 = obj;
                        i11 += 3;
                        i10 = 1048575;
                    }
                    y8 = this;
                    obj2 = obj;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 2:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        long j9 = unsafe.getLong(obj2, j8);
                        iW3 = AbstractC1992a0.w(i15 << 3);
                        iX = AbstractC1992a0.x(j9);
                        i9 = iW3 + iX;
                        i13 = i19 + i9;
                        y8 = this;
                        i11 += 3;
                        i10 = 1048575;
                    }
                    y8 = this;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 3:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        long j10 = unsafe.getLong(obj2, j8);
                        iW3 = AbstractC1992a0.w(i15 << 3);
                        iX = AbstractC1992a0.x(j10);
                        i9 = iW3 + iX;
                        i13 = i19 + i9;
                        y8 = this;
                        i11 += 3;
                        i10 = 1048575;
                    }
                    y8 = this;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 4:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        long j11 = unsafe.getInt(obj2, j8);
                        iW3 = AbstractC1992a0.w(i15 << 3);
                        iX = AbstractC1992a0.x(j11);
                        i9 = iW3 + iX;
                        i13 = i19 + i9;
                        y8 = this;
                        i11 += 3;
                        i10 = 1048575;
                    }
                    y8 = this;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 5:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        iW4 = AbstractC1992a0.w(i15 << 3);
                        iW5 = iW4 + 8;
                        i13 = i19 + iW5;
                        y8 = this;
                        obj2 = obj;
                        i11 += 3;
                        i10 = 1048575;
                    }
                    y8 = this;
                    obj2 = obj;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 6:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        iW2 = AbstractC1992a0.w(i15 << 3);
                        iW5 = iW2 + 4;
                        i13 = i19 + iW5;
                        y8 = this;
                        obj2 = obj;
                        i11 += 3;
                        i10 = 1048575;
                    }
                    y8 = this;
                    obj2 = obj;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 7:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        iW5 = AbstractC1992a0.w(i15 << 3) + 1;
                        i13 = i19 + iW5;
                        y8 = this;
                        obj2 = obj;
                        i11 += 3;
                        i10 = 1048575;
                    }
                    y8 = this;
                    obj2 = obj;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 8:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        int i20 = i15 << 3;
                        Object object = unsafe.getObject(obj2, j8);
                        if (object instanceof S) {
                            iW6 = AbstractC1992a0.w(i20);
                            iT = ((S) object).t();
                            iW7 = AbstractC1992a0.w(iT);
                            i9 = iW6 + iW7 + iT;
                            i13 = i19 + i9;
                            y8 = this;
                            i11 += 3;
                            i10 = 1048575;
                        } else {
                            iW3 = AbstractC1992a0.w(i20);
                            iX = AbstractC1992a0.v((String) object);
                            i9 = iW3 + iX;
                            i13 = i19 + i9;
                            y8 = this;
                            i11 += 3;
                            i10 = 1048575;
                        }
                    }
                    y8 = this;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 9:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        iO = AbstractC2025i1.o(i15, unsafe.getObject(obj2, j8), y8.K(i11));
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 10:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        S s8 = (S) unsafe.getObject(obj2, j8);
                        iW6 = AbstractC1992a0.w(i15 << 3);
                        iT = s8.t();
                        iW7 = AbstractC1992a0.w(iT);
                        i9 = iW6 + iW7 + iT;
                        i13 = i19 + i9;
                        y8 = this;
                        i11 += 3;
                        i10 = 1048575;
                    }
                    y8 = this;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 11:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        int i21 = unsafe.getInt(obj2, j8);
                        iW3 = AbstractC1992a0.w(i15 << 3);
                        iX = AbstractC1992a0.w(i21);
                        i9 = iW3 + iX;
                        i13 = i19 + i9;
                        y8 = this;
                        i11 += 3;
                        i10 = 1048575;
                    }
                    y8 = this;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 12:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        long j12 = unsafe.getInt(obj2, j8);
                        iW3 = AbstractC1992a0.w(i15 << 3);
                        iX = AbstractC1992a0.x(j12);
                        i9 = iW3 + iX;
                        i13 = i19 + i9;
                        y8 = this;
                        i11 += 3;
                        i10 = 1048575;
                    }
                    y8 = this;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        iW2 = AbstractC1992a0.w(i15 << 3);
                        iW5 = iW2 + 4;
                        i13 = i19 + iW5;
                        y8 = this;
                        obj2 = obj;
                        i11 += 3;
                        i10 = 1048575;
                    }
                    y8 = this;
                    obj2 = obj;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        iW4 = AbstractC1992a0.w(i15 << 3);
                        iW5 = iW4 + 8;
                        i13 = i19 + iW5;
                        y8 = this;
                        obj2 = obj;
                        i11 += 3;
                        i10 = 1048575;
                    }
                    y8 = this;
                    obj2 = obj;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        int i22 = unsafe.getInt(obj2, j8);
                        iW3 = AbstractC1992a0.w(i15 << 3);
                        iX = AbstractC1992a0.w((i22 >> 31) ^ (i22 + i22));
                        i9 = iW3 + iX;
                        i13 = i19 + i9;
                        y8 = this;
                        i11 += 3;
                        i10 = 1048575;
                    }
                    y8 = this;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 16:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        long j13 = unsafe.getLong(obj2, j8);
                        iW3 = AbstractC1992a0.w(i15 << 3);
                        iX = AbstractC1992a0.x((j13 >> 63) ^ (j13 + j13));
                        i9 = iW3 + iX;
                        i13 = i19 + i9;
                        y8 = this;
                        i11 += 3;
                        i10 = 1048575;
                    }
                    y8 = this;
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    if (y8.s(obj2, i11, i14, i12, i8)) {
                        iO = AbstractC1992a0.t(i15, (V0) unsafe.getObject(obj2, j8), y8.K(i11));
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 18:
                    iO = AbstractC2025i1.k(i15, (List) unsafe.getObject(obj2, j8), false);
                    i13 = i19 + iO;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 19:
                    iO = AbstractC2025i1.i(i15, (List) unsafe.getObject(obj2, j8), false);
                    i13 = i19 + iO;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j8);
                    Class cls = AbstractC2025i1.f18912a;
                    if (list.size() == 0) {
                        iN = 0;
                    } else {
                        iN = AbstractC2025i1.n(list) + (list.size() * AbstractC1992a0.w(i15 << 3));
                    }
                    i13 = iN + i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j8);
                    Class cls2 = AbstractC2025i1.f18912a;
                    size = list2.size();
                    if (size == 0) {
                        iO = 0;
                    } else {
                        iS = AbstractC2025i1.s(list2);
                        iW8 = AbstractC1992a0.w(i15 << 3);
                        iX2 = size * iW8;
                        iO = iS + iX2;
                    }
                    i13 = i19 + iO;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                    List list3 = (List) unsafe.getObject(obj2, j8);
                    Class cls3 = AbstractC2025i1.f18912a;
                    size = list3.size();
                    if (size == 0) {
                        iO = 0;
                    } else {
                        iS = AbstractC2025i1.m(list3);
                        iW8 = AbstractC1992a0.w(i15 << 3);
                        iX2 = size * iW8;
                        iO = iS + iX2;
                    }
                    i13 = i19 + iO;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                    iO = AbstractC2025i1.k(i15, (List) unsafe.getObject(obj2, j8), false);
                    i13 = i19 + iO;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 24:
                    iO = AbstractC2025i1.i(i15, (List) unsafe.getObject(obj2, j8), false);
                    i13 = i19 + iO;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j8);
                    Class cls4 = AbstractC2025i1.f18912a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iO = 0;
                    } else {
                        iO = size2 * (AbstractC1992a0.w(i15 << 3) + 1);
                    }
                    i13 = i19 + iO;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j8);
                    Class cls5 = AbstractC2025i1.f18912a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iN = 0;
                    } else {
                        iN = AbstractC1992a0.w(i15 << 3) * size3;
                        if (list5 instanceof F0) {
                            F0 f8 = (F0) list5;
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object objN = f8.n(i23);
                                if (objN instanceof S) {
                                    int iT4 = ((S) objN).t();
                                    iN += AbstractC1992a0.w(iT4) + iT4;
                                } else {
                                    iN += AbstractC1992a0.v((String) objN);
                                }
                            }
                        } else {
                            for (int i24 = 0; i24 < size3; i24++) {
                                Object obj3 = list5.get(i24);
                                if (obj3 instanceof S) {
                                    int iT5 = ((S) obj3).t();
                                    iN += AbstractC1992a0.w(iT5) + iT5;
                                } else {
                                    iN += AbstractC1992a0.v((String) obj3);
                                }
                            }
                        }
                    }
                    i13 = iN + i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j8);
                    InterfaceC2017g1 interfaceC2017g1K = y8.K(i11);
                    Class cls6 = AbstractC2025i1.f18912a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iW9 = 0;
                    } else {
                        iW9 = AbstractC1992a0.w(i15 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj4 = list6.get(i25);
                            if (obj4 instanceof D0) {
                                int iA = ((D0) obj4).a();
                                iW9 += AbstractC1992a0.w(iA) + iA;
                            } else {
                                iW9 += AbstractC1992a0.u((V0) obj4, interfaceC2017g1K);
                            }
                        }
                    }
                    i13 = i19 + iW9;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j8);
                    Class cls7 = AbstractC2025i1.f18912a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iW10 = 0;
                    } else {
                        iW10 = size5 * AbstractC1992a0.w(i15 << 3);
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int iT6 = ((S) list7.get(i26)).t();
                            iW10 += AbstractC1992a0.w(iT6) + iT6;
                        }
                    }
                    i13 = i19 + iW10;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j8);
                    Class cls8 = AbstractC2025i1.f18912a;
                    size = list8.size();
                    if (size == 0) {
                        iO = 0;
                    } else {
                        iS = AbstractC2025i1.r(list8);
                        iW8 = AbstractC1992a0.w(i15 << 3);
                        iX2 = size * iW8;
                        iO = iS + iX2;
                    }
                    i13 = i19 + iO;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j8);
                    Class cls9 = AbstractC2025i1.f18912a;
                    size = list9.size();
                    if (size == 0) {
                        iO = 0;
                    } else {
                        iS = AbstractC2025i1.h(list9);
                        iW8 = AbstractC1992a0.w(i15 << 3);
                        iX2 = size * iW8;
                        iO = iS + iX2;
                    }
                    i13 = i19 + iO;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 31:
                    iO = AbstractC2025i1.i(i15, (List) unsafe.getObject(obj2, j8), false);
                    i13 = i19 + iO;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 32:
                    iO = AbstractC2025i1.k(i15, (List) unsafe.getObject(obj2, j8), false);
                    i13 = i19 + iO;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j8);
                    Class cls10 = AbstractC2025i1.f18912a;
                    size = list10.size();
                    if (size == 0) {
                        iO = 0;
                    } else {
                        iS = AbstractC2025i1.p(list10);
                        iW8 = AbstractC1992a0.w(i15 << 3);
                        iX2 = size * iW8;
                        iO = iS + iX2;
                    }
                    i13 = i19 + iO;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j8);
                    Class cls11 = AbstractC2025i1.f18912a;
                    size = list11.size();
                    if (size == 0) {
                        iO = 0;
                    } else {
                        iS = AbstractC2025i1.q(list11);
                        iW8 = AbstractC1992a0.w(i15 << 3);
                        iX2 = size * iW8;
                        iO = iS + iX2;
                    }
                    i13 = i19 + iO;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 35:
                    iL = AbstractC2025i1.l((List) unsafe.getObject(obj2, j8));
                    if (iL > 0) {
                        iW11 = AbstractC1992a0.w(i15 << 3);
                        iW12 = AbstractC1992a0.w(iL);
                        iW10 = iW11 + iW12 + iL;
                        i13 = i19 + iW10;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 36:
                    iL = AbstractC2025i1.j((List) unsafe.getObject(obj2, j8));
                    if (iL > 0) {
                        iW11 = AbstractC1992a0.w(i15 << 3);
                        iW12 = AbstractC1992a0.w(iL);
                        iW10 = iW11 + iW12 + iL;
                        i13 = i19 + iW10;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 37:
                    iL = AbstractC2025i1.n((List) unsafe.getObject(obj2, j8));
                    if (iL > 0) {
                        iW11 = AbstractC1992a0.w(i15 << 3);
                        iW12 = AbstractC1992a0.w(iL);
                        iW10 = iW11 + iW12 + iL;
                        i13 = i19 + iW10;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 38:
                    iL = AbstractC2025i1.s((List) unsafe.getObject(obj2, j8));
                    if (iL > 0) {
                        iW11 = AbstractC1992a0.w(i15 << 3);
                        iW12 = AbstractC1992a0.w(iL);
                        iW10 = iW11 + iW12 + iL;
                        i13 = i19 + iW10;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 39:
                    iL = AbstractC2025i1.m((List) unsafe.getObject(obj2, j8));
                    if (iL > 0) {
                        iW11 = AbstractC1992a0.w(i15 << 3);
                        iW12 = AbstractC1992a0.w(iL);
                        iW10 = iW11 + iW12 + iL;
                        i13 = i19 + iW10;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case Messages.ServerMessage.ICON_FIELD_NUMBER /* 40 */:
                    iL = AbstractC2025i1.l((List) unsafe.getObject(obj2, j8));
                    if (iL > 0) {
                        iW11 = AbstractC1992a0.w(i15 << 3);
                        iW12 = AbstractC1992a0.w(iL);
                        iW10 = iW11 + iW12 + iL;
                        i13 = i19 + iW10;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 41:
                    iL = AbstractC2025i1.j((List) unsafe.getObject(obj2, j8));
                    if (iL > 0) {
                        iW11 = AbstractC1992a0.w(i15 << 3);
                        iW12 = AbstractC1992a0.w(iL);
                        iW10 = iW11 + iW12 + iL;
                        i13 = i19 + iW10;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j8);
                    Class cls12 = AbstractC2025i1.f18912a;
                    iL = list12.size();
                    if (iL > 0) {
                        iW11 = AbstractC1992a0.w(i15 << 3);
                        iW12 = AbstractC1992a0.w(iL);
                        iW10 = iW11 + iW12 + iL;
                        i13 = i19 + iW10;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 43:
                    iL = AbstractC2025i1.r((List) unsafe.getObject(obj2, j8));
                    if (iL > 0) {
                        iW11 = AbstractC1992a0.w(i15 << 3);
                        iW12 = AbstractC1992a0.w(iL);
                        iW10 = iW11 + iW12 + iL;
                        i13 = i19 + iW10;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 44:
                    iL = AbstractC2025i1.h((List) unsafe.getObject(obj2, j8));
                    if (iL > 0) {
                        iW11 = AbstractC1992a0.w(i15 << 3);
                        iW12 = AbstractC1992a0.w(iL);
                        iW10 = iW11 + iW12 + iL;
                        i13 = i19 + iW10;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 45:
                    iL = AbstractC2025i1.j((List) unsafe.getObject(obj2, j8));
                    if (iL > 0) {
                        iW11 = AbstractC1992a0.w(i15 << 3);
                        iW12 = AbstractC1992a0.w(iL);
                        iW10 = iW11 + iW12 + iL;
                        i13 = i19 + iW10;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 46:
                    iL = AbstractC2025i1.l((List) unsafe.getObject(obj2, j8));
                    if (iL > 0) {
                        iW11 = AbstractC1992a0.w(i15 << 3);
                        iW12 = AbstractC1992a0.w(iL);
                        iW10 = iW11 + iW12 + iL;
                        i13 = i19 + iW10;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 47:
                    iL = AbstractC2025i1.p((List) unsafe.getObject(obj2, j8));
                    if (iL > 0) {
                        iW11 = AbstractC1992a0.w(i15 << 3);
                        iW12 = AbstractC1992a0.w(iL);
                        iW10 = iW11 + iW12 + iL;
                        i13 = i19 + iW10;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 48:
                    iL = AbstractC2025i1.q((List) unsafe.getObject(obj2, j8));
                    if (iL > 0) {
                        iW11 = AbstractC1992a0.w(i15 << 3);
                        iW12 = AbstractC1992a0.w(iL);
                        iW10 = iW11 + iW12 + iL;
                        i13 = i19 + iW10;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j8);
                    InterfaceC2017g1 interfaceC2017g1K2 = y8.K(i11);
                    Class cls13 = AbstractC2025i1.f18912a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iT2 = 0;
                    } else {
                        iT2 = 0;
                        for (int i27 = 0; i27 < size6; i27++) {
                            iT2 += AbstractC1992a0.t(i15, (V0) list13.get(i27), interfaceC2017g1K2);
                        }
                    }
                    i13 = i19 + iT2;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 50:
                    P0 p8 = (P0) unsafe.getObject(obj2, j8);
                    p063h.s.a(y8.L(i11));
                    if (!p8.isEmpty()) {
                        Iterator it = p8.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 51:
                    if (y8.v(obj2, i15, i11)) {
                        iW = AbstractC1992a0.w(i15 << 3);
                        iO = iW + 8;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 52:
                    if (y8.v(obj2, i15, i11)) {
                        iW13 = AbstractC1992a0.w(i15 << 3);
                        iO = iW13 + 4;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 53:
                    if (y8.v(obj2, i15, i11)) {
                        long jI = I(obj2, j8);
                        iS = AbstractC1992a0.w(i15 << 3);
                        iX2 = AbstractC1992a0.x(jI);
                        iO = iS + iX2;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 54:
                    if (y8.v(obj2, i15, i11)) {
                        long jI2 = I(obj2, j8);
                        iS = AbstractC1992a0.w(i15 << 3);
                        iX2 = AbstractC1992a0.x(jI2);
                        iO = iS + iX2;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 55:
                    if (y8.v(obj2, i15, i11)) {
                        long jD = D(obj2, j8);
                        iS = AbstractC1992a0.w(i15 << 3);
                        iX2 = AbstractC1992a0.x(jD);
                        iO = iS + iX2;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 56:
                    if (y8.v(obj2, i15, i11)) {
                        iW = AbstractC1992a0.w(i15 << 3);
                        iO = iW + 8;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 57:
                    if (y8.v(obj2, i15, i11)) {
                        iW13 = AbstractC1992a0.w(i15 << 3);
                        iO = iW13 + 4;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 58:
                    if (y8.v(obj2, i15, i11)) {
                        iO = AbstractC1992a0.w(i15 << 3) + 1;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 59:
                    if (y8.v(obj2, i15, i11)) {
                        int i28 = i15 << 3;
                        Object object2 = unsafe.getObject(obj2, j8);
                        if (object2 instanceof S) {
                            iW14 = AbstractC1992a0.w(i28);
                            iT3 = ((S) object2).t();
                            iW15 = AbstractC1992a0.w(iT3);
                            iO = iW14 + iW15 + iT3;
                            i13 = i19 + iO;
                        } else {
                            iS = AbstractC1992a0.w(i28);
                            iX2 = AbstractC1992a0.v((String) object2);
                            iO = iS + iX2;
                            i13 = i19 + iO;
                        }
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 60:
                    if (y8.v(obj2, i15, i11)) {
                        iO = AbstractC2025i1.o(i15, unsafe.getObject(obj2, j8), y8.K(i11));
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 61:
                    if (y8.v(obj2, i15, i11)) {
                        S s9 = (S) unsafe.getObject(obj2, j8);
                        iW14 = AbstractC1992a0.w(i15 << 3);
                        iT3 = s9.t();
                        iW15 = AbstractC1992a0.w(iT3);
                        iO = iW14 + iW15 + iT3;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 62:
                    if (y8.v(obj2, i15, i11)) {
                        int iD = D(obj2, j8);
                        iS = AbstractC1992a0.w(i15 << 3);
                        iX2 = AbstractC1992a0.w(iD);
                        iO = iS + iX2;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 63:
                    if (y8.v(obj2, i15, i11)) {
                        long jD2 = D(obj2, j8);
                        iS = AbstractC1992a0.w(i15 << 3);
                        iX2 = AbstractC1992a0.x(jD2);
                        iO = iS + iX2;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 64:
                    if (y8.v(obj2, i15, i11)) {
                        iW13 = AbstractC1992a0.w(i15 << 3);
                        iO = iW13 + 4;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 65:
                    if (y8.v(obj2, i15, i11)) {
                        iW = AbstractC1992a0.w(i15 << 3);
                        iO = iW + 8;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 66:
                    if (y8.v(obj2, i15, i11)) {
                        int iD2 = D(obj2, j8);
                        iS = AbstractC1992a0.w(i15 << 3);
                        iX2 = AbstractC1992a0.w((iD2 >> 31) ^ (iD2 + iD2));
                        iO = iS + iX2;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 67:
                    if (y8.v(obj2, i15, i11)) {
                        long jI3 = I(obj2, j8);
                        iS = AbstractC1992a0.w(i15 << 3);
                        iX2 = AbstractC1992a0.x((jI3 >> 63) ^ (jI3 + jI3));
                        iO = iS + iX2;
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                case 68:
                    if (y8.v(obj2, i15, i11)) {
                        iO = AbstractC1992a0.t(i15, (V0) unsafe.getObject(obj2, j8), y8.K(i11));
                        i13 = i19 + iO;
                    } else {
                        i13 = i19;
                    }
                    i11 += 3;
                    i10 = 1048575;
                    break;
                default:
                    i13 = i19;
                    i11 += 3;
                    i10 = 1048575;
                    break;
            }
        }
        AbstractC2076w1 abstractC2076w1 = y8.f18845k;
        int iA2 = i13 + abstractC2076w1.a(abstractC2076w1.d(obj2));
        if (!y8.f18840f) {
            return iA2;
        }
        C2028j0 c2028j0B = y8.f18846l.b(obj2);
        int iB = 0;
        for (int i29 = 0; i29 < c2028j0B.f18917a.b(); i29++) {
            Map.Entry entryG = c2028j0B.f18917a.g(i29);
            p063h.s.a(entryG.getKey());
            iB += C2028j0.b(null, entryG.getValue());
        }
        for (Map.Entry entry2 : c2028j0B.f18917a.c()) {
            p063h.s.a(entry2.getKey());
            iB += C2028j0.b(null, entry2.getValue());
        }
        return iA2 + iB;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final void e(Object obj, Object obj2) {
        j(obj);
        obj2.getClass();
        for (int i8 = 0; i8 < this.f18835a.length; i8 += 3) {
            int iH = H(i8);
            int i9 = 1048575 & iH;
            int[] iArr = this.f18835a;
            int iG = G(iH);
            int i10 = iArr[i8];
            long j8 = i9;
            switch (iG) {
                case 0:
                    if (r(obj2, i8)) {
                        G1.t(obj, j8, G1.f(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 1:
                    if (r(obj2, i8)) {
                        G1.u(obj, j8, G1.g(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 2:
                    if (r(obj2, i8)) {
                        G1.w(obj, j8, G1.i(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 3:
                    if (r(obj2, i8)) {
                        G1.w(obj, j8, G1.i(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 4:
                    if (r(obj2, i8)) {
                        G1.v(obj, j8, G1.h(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 5:
                    if (r(obj2, i8)) {
                        G1.w(obj, j8, G1.i(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 6:
                    if (r(obj2, i8)) {
                        G1.v(obj, j8, G1.h(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 7:
                    if (r(obj2, i8)) {
                        G1.r(obj, j8, G1.B(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 8:
                    if (r(obj2, i8)) {
                        G1.x(obj, j8, G1.k(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 9:
                    k(obj, obj2, i8);
                    break;
                case 10:
                    if (r(obj2, i8)) {
                        G1.x(obj, j8, G1.k(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 11:
                    if (r(obj2, i8)) {
                        G1.v(obj, j8, G1.h(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 12:
                    if (r(obj2, i8)) {
                        G1.v(obj, j8, G1.h(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    if (r(obj2, i8)) {
                        G1.v(obj, j8, G1.h(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    if (r(obj2, i8)) {
                        G1.w(obj, j8, G1.i(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    if (r(obj2, i8)) {
                        G1.v(obj, j8, G1.h(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 16:
                    if (r(obj2, i8)) {
                        G1.w(obj, j8, G1.i(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    k(obj, obj2, i8);
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
                    this.f18844j.b(obj, obj2, j8);
                    break;
                case 50:
                    Class cls = AbstractC2025i1.f18912a;
                    G1.x(obj, j8, Q0.a(G1.k(obj, j8), G1.k(obj2, j8)));
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
                    if (v(obj2, i10, i8)) {
                        G1.x(obj, j8, G1.k(obj2, j8));
                        n(obj, i10, i8);
                    }
                    break;
                case 60:
                    l(obj, obj2, i8);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (v(obj2, i10, i8)) {
                        G1.x(obj, j8, G1.k(obj2, j8));
                        n(obj, i10, i8);
                    }
                    break;
                case 68:
                    l(obj, obj2, i8);
                    break;
            }
        }
        AbstractC2025i1.x(this.f18845k, obj, obj2);
        if (this.f18840f) {
            AbstractC2025i1.w(this.f18846l, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final Object f() {
        return ((AbstractC2056q0) this.f18839e).k();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final boolean g(Object obj, Object obj2) {
        boolean zG;
        for (int i8 = 0; i8 < this.f18835a.length; i8 += 3) {
            int iH = H(i8);
            long j8 = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (!q(obj, obj2, i8) || Double.doubleToLongBits(G1.f(obj, j8)) != Double.doubleToLongBits(G1.f(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!q(obj, obj2, i8) || Float.floatToIntBits(G1.g(obj, j8)) != Float.floatToIntBits(G1.g(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!q(obj, obj2, i8) || G1.i(obj, j8) != G1.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!q(obj, obj2, i8) || G1.i(obj, j8) != G1.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!q(obj, obj2, i8) || G1.h(obj, j8) != G1.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!q(obj, obj2, i8) || G1.i(obj, j8) != G1.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!q(obj, obj2, i8) || G1.h(obj, j8) != G1.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!q(obj, obj2, i8) || G1.B(obj, j8) != G1.B(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!q(obj, obj2, i8) || !AbstractC2025i1.g(G1.k(obj, j8), G1.k(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!q(obj, obj2, i8) || !AbstractC2025i1.g(G1.k(obj, j8), G1.k(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!q(obj, obj2, i8) || !AbstractC2025i1.g(G1.k(obj, j8), G1.k(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!q(obj, obj2, i8) || G1.h(obj, j8) != G1.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!q(obj, obj2, i8) || G1.h(obj, j8) != G1.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    if (!q(obj, obj2, i8) || G1.h(obj, j8) != G1.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    if (!q(obj, obj2, i8) || G1.i(obj, j8) != G1.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    if (!q(obj, obj2, i8) || G1.h(obj, j8) != G1.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!q(obj, obj2, i8) || G1.i(obj, j8) != G1.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    if (!q(obj, obj2, i8) || !AbstractC2025i1.g(G1.k(obj, j8), G1.k(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
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
                    zG = AbstractC2025i1.g(G1.k(obj, j8), G1.k(obj2, j8));
                    break;
                case 50:
                    zG = AbstractC2025i1.g(G1.k(obj, j8), G1.k(obj2, j8));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jE = E(i8) & 1048575;
                    if (G1.h(obj, jE) != G1.h(obj2, jE) || !AbstractC2025i1.g(G1.k(obj, j8), G1.k(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zG) {
                return false;
            }
        }
        if (!this.f18845k.d(obj).equals(this.f18845k.d(obj2))) {
            return false;
        }
        if (this.f18840f) {
            return this.f18846l.b(obj).equals(this.f18846l.b(obj2));
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final void h(Object obj, O1 o8) {
        Map.Entry entry;
        Iterator it;
        int i8;
        int i9;
        int i10;
        int i11;
        Y0 y8 = this;
        if (y8.f18840f) {
            C2028j0 c2028j0B = y8.f18846l.b(obj);
            if (c2028j0B.f18917a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itE = c2028j0B.e();
                entry = (Map.Entry) itE.next();
                it = itE;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = y8.f18835a;
        Unsafe unsafe = f18834p;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
        while (i12 < iArr.length) {
            int iH = y8.H(i12);
            int[] iArr2 = y8.f18835a;
            int iG = G(iH);
            int i15 = iArr2[i12];
            if (iG <= 17) {
                int i16 = iArr2[i12 + 2];
                int i17 = i16 & 1048575;
                if (i17 != i13) {
                    i8 = 1;
                    i14 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                } else {
                    i8 = 1;
                }
                i9 = i13;
                i10 = i14;
                i11 = i8 << (i16 >>> 20);
            } else {
                i8 = 1;
                i9 = i13;
                i10 = i14;
                i11 = 0;
            }
            while (entry != null && y8.f18846l.a(entry) <= i15) {
                y8.f18846l.e(o8, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j8 = iH & 1048575;
            switch (iG) {
                case 0:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.r(i15, G1.f(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 1:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.v(i15, G1.g(obj, j8));
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 2:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.g(i15, unsafe.getLong(obj, j8));
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 3:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.F(i15, unsafe.getLong(obj, j8));
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 4:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.p(i15, unsafe.getInt(obj, j8));
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 5:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.D(i15, unsafe.getLong(obj, j8));
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 6:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.e(i15, unsafe.getInt(obj, j8));
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 7:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.f(i15, G1.B(obj, j8));
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 8:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        x(i15, unsafe.getObject(obj, j8), o8);
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 9:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.K(i15, unsafe.getObject(obj, j8), y8.K(i12));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 10:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.J(i15, (S) unsafe.getObject(obj, j8));
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 11:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.c(i15, unsafe.getInt(obj, j8));
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 12:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.n(i15, unsafe.getInt(obj, j8));
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.y(i15, unsafe.getInt(obj, j8));
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.m(i15, unsafe.getLong(obj, j8));
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.C(i15, unsafe.getInt(obj, j8));
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 16:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.s(i15, unsafe.getLong(obj, j8));
                    }
                    y8 = this;
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    if (y8.s(obj, i12, i9, i10, i11)) {
                        o8.I(i15, unsafe.getObject(obj, j8), y8.K(i12));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 18:
                    AbstractC2025i1.A(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, false);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 19:
                    AbstractC2025i1.E(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, false);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 20:
                    AbstractC2025i1.G(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, false);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 21:
                    AbstractC2025i1.f(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, false);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                    AbstractC2025i1.F(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, false);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                    AbstractC2025i1.D(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, false);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 24:
                    AbstractC2025i1.C(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, false);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 25:
                    AbstractC2025i1.z(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, false);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 26:
                    int i18 = y8.f18835a[i12];
                    List list = (List) unsafe.getObject(obj, j8);
                    Class cls = AbstractC2025i1.f18912a;
                    if (list != null && !list.isEmpty()) {
                        o8.E(i18, list);
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 27:
                    int i19 = y8.f18835a[i12];
                    List list2 = (List) unsafe.getObject(obj, j8);
                    InterfaceC2017g1 interfaceC2017g1K = y8.K(i12);
                    Class cls2 = AbstractC2025i1.f18912a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i20 = 0; i20 < list2.size(); i20++) {
                            ((C1996b0) o8).K(i19, list2.get(i20), interfaceC2017g1K);
                        }
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 28:
                    int i21 = y8.f18835a[i12];
                    List list3 = (List) unsafe.getObject(obj, j8);
                    Class cls3 = AbstractC2025i1.f18912a;
                    if (list3 != null && !list3.isEmpty()) {
                        o8.a(i21, list3);
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 29:
                    AbstractC2025i1.e(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, false);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 30:
                    AbstractC2025i1.B(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, false);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 31:
                    AbstractC2025i1.a(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, false);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 32:
                    AbstractC2025i1.b(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, false);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 33:
                    AbstractC2025i1.c(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, false);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 34:
                    AbstractC2025i1.d(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, false);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 35:
                    AbstractC2025i1.A(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, i8);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 36:
                    AbstractC2025i1.E(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, i8);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 37:
                    AbstractC2025i1.G(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, i8);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 38:
                    AbstractC2025i1.f(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, i8);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 39:
                    AbstractC2025i1.F(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, i8);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case Messages.ServerMessage.ICON_FIELD_NUMBER /* 40 */:
                    AbstractC2025i1.D(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, i8);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 41:
                    AbstractC2025i1.C(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, i8);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 42:
                    AbstractC2025i1.z(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, i8);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 43:
                    AbstractC2025i1.e(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, i8);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 44:
                    AbstractC2025i1.B(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, i8);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 45:
                    AbstractC2025i1.a(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, i8);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 46:
                    AbstractC2025i1.b(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, i8);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 47:
                    AbstractC2025i1.c(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, i8);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 48:
                    AbstractC2025i1.d(y8.f18835a[i12], (List) unsafe.getObject(obj, j8), o8, i8);
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 49:
                    int i22 = y8.f18835a[i12];
                    List list4 = (List) unsafe.getObject(obj, j8);
                    InterfaceC2017g1 interfaceC2017g1K2 = y8.K(i12);
                    Class cls4 = AbstractC2025i1.f18912a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i23 = 0; i23 < list4.size(); i23++) {
                            ((C1996b0) o8).I(i22, list4.get(i23), interfaceC2017g1K2);
                        }
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j8) != null) {
                        p063h.s.a(y8.L(i12));
                        throw null;
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 51:
                    if (y8.v(obj, i15, i12)) {
                        o8.r(i15, B(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 52:
                    if (y8.v(obj, i15, i12)) {
                        o8.v(i15, C(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 53:
                    if (y8.v(obj, i15, i12)) {
                        o8.g(i15, I(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 54:
                    if (y8.v(obj, i15, i12)) {
                        o8.F(i15, I(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 55:
                    if (y8.v(obj, i15, i12)) {
                        o8.p(i15, D(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 56:
                    if (y8.v(obj, i15, i12)) {
                        o8.D(i15, I(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 57:
                    if (y8.v(obj, i15, i12)) {
                        o8.e(i15, D(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 58:
                    if (y8.v(obj, i15, i12)) {
                        o8.f(i15, w(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 59:
                    if (y8.v(obj, i15, i12)) {
                        x(i15, unsafe.getObject(obj, j8), o8);
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 60:
                    if (y8.v(obj, i15, i12)) {
                        o8.K(i15, unsafe.getObject(obj, j8), y8.K(i12));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 61:
                    if (y8.v(obj, i15, i12)) {
                        o8.J(i15, (S) unsafe.getObject(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 62:
                    if (y8.v(obj, i15, i12)) {
                        o8.c(i15, D(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 63:
                    if (y8.v(obj, i15, i12)) {
                        o8.n(i15, D(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 64:
                    if (y8.v(obj, i15, i12)) {
                        o8.y(i15, D(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 65:
                    if (y8.v(obj, i15, i12)) {
                        o8.m(i15, I(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 66:
                    if (y8.v(obj, i15, i12)) {
                        o8.C(i15, D(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 67:
                    if (y8.v(obj, i15, i12)) {
                        o8.s(i15, I(obj, j8));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                case 68:
                    if (y8.v(obj, i15, i12)) {
                        o8.I(i15, unsafe.getObject(obj, j8), y8.K(i12));
                    }
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
                default:
                    i12 += 3;
                    i14 = i10;
                    i13 = i9;
                    entry = entry;
                    break;
            }
        }
        while (entry != null) {
            y8.f18846l.e(o8, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        AbstractC2076w1 abstractC2076w1 = y8.f18845k;
        abstractC2076w1.j(abstractC2076w1.d(obj), o8);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2017g1
    public final void i(Object obj, byte[] bArr, int i8, int i9, E e8) throws A0 {
        y(obj, bArr, i8, i9, 0, e8);
    }

    public final void k(Object obj, Object obj2, int i8) {
        if (r(obj2, i8)) {
            int iH = H(i8) & 1048575;
            Unsafe unsafe = f18834p;
            long j8 = iH;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f18835a[i8] + " is present but null: " + obj2.toString());
            }
            InterfaceC2017g1 interfaceC2017g1K = K(i8);
            if (!r(obj, i8)) {
                if (u(object)) {
                    Object objF = interfaceC2017g1K.f();
                    interfaceC2017g1K.e(objF, object);
                    unsafe.putObject(obj, j8, objF);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                m(obj, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!u(object2)) {
                Object objF2 = interfaceC2017g1K.f();
                interfaceC2017g1K.e(objF2, object2);
                unsafe.putObject(obj, j8, objF2);
                object2 = objF2;
            }
            interfaceC2017g1K.e(object2, object);
        }
    }

    public final void l(Object obj, Object obj2, int i8) {
        int i9 = this.f18835a[i8];
        if (v(obj2, i9, i8)) {
            int iH = H(i8) & 1048575;
            Unsafe unsafe = f18834p;
            long j8 = iH;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f18835a[i8] + " is present but null: " + obj2.toString());
            }
            InterfaceC2017g1 interfaceC2017g1K = K(i8);
            if (!v(obj, i9, i8)) {
                if (u(object)) {
                    Object objF = interfaceC2017g1K.f();
                    interfaceC2017g1K.e(objF, object);
                    unsafe.putObject(obj, j8, objF);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                n(obj, i9, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!u(object2)) {
                Object objF2 = interfaceC2017g1K.f();
                interfaceC2017g1K.e(objF2, object2);
                unsafe.putObject(obj, j8, objF2);
                object2 = objF2;
            }
            interfaceC2017g1K.e(object2, object);
        }
    }

    public final void m(Object obj, int i8) {
        int iE = E(i8);
        long j8 = 1048575 & iE;
        if (j8 == 1048575) {
            return;
        }
        G1.v(obj, j8, (1 << (iE >>> 20)) | G1.h(obj, j8));
    }

    public final void n(Object obj, int i8, int i9) {
        G1.v(obj, E(i9) & 1048575, i8);
    }

    public final void o(Object obj, int i8, Object obj2) {
        f18834p.putObject(obj, H(i8) & 1048575, obj2);
        m(obj, i8);
    }

    public final void p(Object obj, int i8, int i9, Object obj2) {
        f18834p.putObject(obj, H(i9) & 1048575, obj2);
        n(obj, i8, i9);
    }

    public final boolean q(Object obj, Object obj2, int i8) {
        return r(obj, i8) == r(obj2, i8);
    }

    public final boolean r(Object obj, int i8) {
        int iE = E(i8);
        long j8 = iE & 1048575;
        if (j8 != 1048575) {
            return (G1.h(obj, j8) & (1 << (iE >>> 20))) != 0;
        }
        int iH = H(i8);
        long j9 = iH & 1048575;
        switch (G(iH)) {
            case 0:
                return Double.doubleToRawLongBits(G1.f(obj, j9)) != 0;
            case 1:
                return Float.floatToRawIntBits(G1.g(obj, j9)) != 0;
            case 2:
                return G1.i(obj, j9) != 0;
            case 3:
                return G1.i(obj, j9) != 0;
            case 4:
                return G1.h(obj, j9) != 0;
            case 5:
                return G1.i(obj, j9) != 0;
            case 6:
                return G1.h(obj, j9) != 0;
            case 7:
                return G1.B(obj, j9);
            case 8:
                Object objK = G1.k(obj, j9);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof S) {
                    return !S.f18819b.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return G1.k(obj, j9) != null;
            case 10:
                return !S.f18819b.equals(G1.k(obj, j9));
            case 11:
                return G1.h(obj, j9) != 0;
            case 12:
                return G1.h(obj, j9) != 0;
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                return G1.h(obj, j9) != 0;
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                return G1.i(obj, j9) != 0;
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                return G1.h(obj, j9) != 0;
            case 16:
                return G1.i(obj, j9) != 0;
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                return G1.k(obj, j9) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean s(Object obj, int i8, int i9, int i10, int i11) {
        if (i9 == 1048575) {
            return r(obj, i8);
        }
        return (i10 & i11) != 0;
    }

    public final boolean v(Object obj, int i8, int i9) {
        return G1.h(obj, (long) (E(i9) & 1048575)) == i8;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 35241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int y(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.play_billing.E r38) throws com.google.android.gms.internal.play_billing.A0 {
        /*
            Method dump skipped, instruction units count: 3524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.Y0.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.E):int");
    }
}
