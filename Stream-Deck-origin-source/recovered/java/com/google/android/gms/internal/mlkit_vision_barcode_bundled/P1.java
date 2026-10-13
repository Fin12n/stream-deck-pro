package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
public final class P1 implements InterfaceC1890f2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f17997l = new int[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Unsafe f17998m = AbstractC1989z2.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f17999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f18000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M1 f18003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f18005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC1954s2 f18008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final W0 f18009k;

    public P1(int[] iArr, Object[] objArr, int i8, int i9, M1 m8, boolean z8, int[] iArr2, int i10, int i11, S1 s8, A1 a8, AbstractC1954s2 abstractC1954s2, W0 w8, H1 h8) {
        this.f17999a = iArr;
        this.f18000b = objArr;
        this.f18001c = i8;
        this.f18002d = i9;
        boolean z9 = false;
        if (w8 != null && (m8 instanceof AbstractC1899h1)) {
            z9 = true;
        }
        this.f18004f = z9;
        this.f18005g = iArr2;
        this.f18006h = i10;
        this.f18007i = i11;
        this.f18008j = abstractC1954s2;
        this.f18009k = w8;
        this.f18003e = m8;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    public static P1 A(Class cls, J1 j8, S1 s8, A1 a8, AbstractC1954s2 abstractC1954s2, W0 w8, H1 h8) {
        int i8;
        int iCharAt;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr;
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
        int iObjectFieldOffset;
        char c8;
        int iObjectFieldOffset2;
        int i26;
        int i27;
        int i28;
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
        if (!(j8 instanceof W1)) {
            p063h.s.a(j8);
            throw null;
        }
        W1 w9 = (W1) j8;
        String strA = w9.a();
        int length = strA.length();
        char c9 = 55296;
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
            i10 = 0;
            i13 = 0;
            iCharAt = 0;
            i9 = 0;
            i11 = 0;
            i12 = 0;
            iArr = f17997l;
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
            int i67 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i68 = iCharAt7;
            i9 = iCharAt5;
            i10 = i68;
            i11 = iCharAt6;
            i12 = iCharAt9;
            i13 = i67;
            iArr = iArr2;
            i14 = iCharAt3;
            i40 = i64;
        }
        Unsafe unsafe = f17998m;
        Object[] objArrB = w9.b();
        Class<?> cls2 = w9.zza().getClass();
        int i69 = i12 + i10;
        int i70 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i70];
        int i71 = i12;
        int i72 = i69;
        int i73 = 0;
        int i74 = 0;
        while (i40 < length) {
            int i75 = i40 + 1;
            int iCharAt10 = strA.charAt(i40);
            if (iCharAt10 >= c9) {
                int i76 = iCharAt10 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i37 = i77 + 1;
                    cCharAt12 = strA.charAt(i77);
                    if (cCharAt12 < c9) {
                        break;
                    }
                    i76 |= (cCharAt12 & 8191) << i78;
                    i78 += 13;
                    i77 = i37;
                }
                iCharAt10 = i76 | (cCharAt12 << i78);
                i23 = i37;
            } else {
                i23 = i75;
            }
            int i79 = i23 + 1;
            int iCharAt11 = strA.charAt(i23);
            if (iCharAt11 >= c9) {
                int i80 = iCharAt11 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i36 = i81 + 1;
                    cCharAt11 = strA.charAt(i81);
                    if (cCharAt11 < c9) {
                        break;
                    }
                    i80 |= (cCharAt11 & 8191) << i82;
                    i82 += 13;
                    i81 = i36;
                }
                iCharAt11 = i80 | (cCharAt11 << i82);
                i24 = i36;
            } else {
                i24 = i79;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i73] = i74;
                i73++;
            }
            int i83 = iCharAt11 & 255;
            W1 w10 = w9;
            int i84 = iCharAt11 & 2048;
            if (i83 >= 51) {
                int i85 = i24 + 1;
                int iCharAt12 = strA.charAt(i24);
                char c10 = 55296;
                if (iCharAt12 >= 55296) {
                    int i86 = iCharAt12 & 8191;
                    int i87 = i85;
                    int i88 = 13;
                    while (true) {
                        i35 = i87 + 1;
                        cCharAt10 = strA.charAt(i87);
                        if (cCharAt10 < c10) {
                            break;
                        }
                        i86 |= (cCharAt10 & 8191) << i88;
                        i88 += 13;
                        i87 = i35;
                        c10 = 55296;
                    }
                    iCharAt12 = i86 | (cCharAt10 << i88);
                    i30 = i35;
                } else {
                    i30 = i85;
                }
                int i89 = i30;
                int i90 = i83 - 51;
                if (i90 == 9 || i90 == 17) {
                    i31 = i13 + 1;
                    int i91 = i74 / 3;
                    objArr[i91 + i91 + 1] = objArrB[i13];
                } else {
                    if (i90 != 12) {
                        i32 = i84;
                    } else if (w10.j() == 1 || i84 != 0) {
                        i31 = i13 + 1;
                        int i92 = i74 / 3;
                        objArr[i92 + i92 + 1] = objArrB[i13];
                    } else {
                        i32 = 0;
                    }
                    i33 = iCharAt12 + iCharAt12;
                    obj = objArrB[i33];
                    int i93 = i32;
                    if (obj instanceof Field) {
                        fieldO2 = (Field) obj;
                    } else {
                        fieldO2 = O(cls2, (String) obj);
                        objArrB[i33] = fieldO2;
                    }
                    int i94 = i14;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO2);
                    i34 = i33 + 1;
                    obj2 = objArrB[i34];
                    i25 = i94;
                    if (obj2 instanceof Field) {
                        fieldO3 = (Field) obj2;
                    } else {
                        fieldO3 = O(cls2, (String) obj2);
                        objArrB[i34] = fieldO3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                    strA = strA;
                    i27 = i93;
                    i24 = i89;
                    i26 = 0;
                    c8 = 55296;
                }
                i13 = i31;
                i32 = i84;
                i33 = iCharAt12 + iCharAt12;
                obj = objArrB[i33];
                int i95 = i32;
                if (obj instanceof Field) {
                    fieldO2 = (Field) obj;
                } else {
                    fieldO2 = O(cls2, (String) obj);
                    objArrB[i33] = fieldO2;
                }
                int i96 = i14;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO2);
                i34 = i33 + 1;
                obj2 = objArrB[i34];
                i25 = i96;
                if (obj2 instanceof Field) {
                    fieldO3 = (Field) obj2;
                } else {
                    fieldO3 = O(cls2, (String) obj2);
                    objArrB[i34] = fieldO3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                strA = strA;
                i27 = i95;
                i24 = i89;
                i26 = 0;
                c8 = 55296;
            } else {
                i25 = i14;
                int i97 = i13 + 1;
                Field fieldO4 = O(cls2, (String) objArrB[i13]);
                if (i83 == 9 || i83 == 17) {
                    int i98 = i74 / 3;
                    objArr[i98 + i98 + 1] = fieldO4.getType();
                } else {
                    if (i83 != 27) {
                        if (i83 == 49) {
                            i13 += 2;
                            i29 = 1;
                        } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                            if (w10.j() == 1 || i84 != 0) {
                                i13 += 2;
                                int i99 = i74 / 3;
                                objArr[i99 + i99 + 1] = objArrB[i97];
                            } else {
                                i13 = i97;
                                i84 = 0;
                            }
                        } else if (i83 == 50) {
                            int i100 = i13 + 2;
                            int i101 = i71 + 1;
                            iArr[i71] = i74;
                            int i102 = i74 / 3;
                            int i103 = i102 + i102;
                            objArr[i103] = objArrB[i97];
                            if (i84 != 0) {
                                objArr[i103 + 1] = objArrB[i100];
                                i13 += 3;
                                i71 = i101;
                            } else {
                                i13 = i100;
                                i71 = i101;
                                i84 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                        if ((iCharAt11 & 4096) != 0 || i83 > 17) {
                            c8 = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i26 = 0;
                        } else {
                            int i104 = i24 + 1;
                            int iCharAt13 = strA.charAt(i24);
                            if (iCharAt13 >= 55296) {
                                int i105 = iCharAt13 & 8191;
                                int i106 = 13;
                                while (true) {
                                    i28 = i104 + 1;
                                    cCharAt9 = strA.charAt(i104);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i105 |= (cCharAt9 & 8191) << i106;
                                    i106 += 13;
                                    i104 = i28;
                                }
                                iCharAt13 = i105 | (cCharAt9 << i106);
                            } else {
                                i28 = i104;
                            }
                            int i107 = i25 + i25 + (iCharAt13 / 32);
                            Object obj3 = objArrB[i107];
                            if (obj3 instanceof Field) {
                                fieldO = (Field) obj3;
                            } else {
                                fieldO = O(cls2, (String) obj3);
                                objArrB[i107] = fieldO;
                            }
                            int i108 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO);
                            i26 = i108 % 32;
                            i24 = i28;
                            c8 = 55296;
                            iObjectFieldOffset2 = iObjectFieldOffset3;
                        }
                        if (i83 >= 18 && i83 <= 49) {
                            iArr[i72] = iObjectFieldOffset;
                            i72++;
                        }
                        i27 = i84;
                    } else {
                        i29 = 1;
                        i13 += 2;
                    }
                    int i109 = i74 / 3;
                    objArr[i109 + i109 + i29] = objArrB[i97];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                    if ((iCharAt11 & 4096) != 0) {
                        c8 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i26 = 0;
                    } else {
                        c8 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i26 = 0;
                    }
                    if (i83 >= 18) {
                        iArr[i72] = iObjectFieldOffset;
                        i72++;
                    }
                    i27 = i84;
                }
                i13 = i97;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                if ((iCharAt11 & 4096) != 0) {
                    c8 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i26 = 0;
                } else {
                    c8 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i26 = 0;
                }
                if (i83 >= 18) {
                    iArr[i72] = iObjectFieldOffset;
                    i72++;
                }
                i27 = i84;
            }
            int i110 = i74 + 1;
            iArr3[i74] = iCharAt10;
            int i111 = i74 + 2;
            iArr3[i110] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i27 != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | iObjectFieldOffset;
            i74 += 3;
            iArr3[i111] = (i26 << 20) | iObjectFieldOffset2;
            i40 = i24;
            strA = strA;
            c9 = c8;
            w9 = w10;
            length = length;
            i14 = i25;
        }
        return new P1(iArr3, objArr, i9, i11, w9.zza(), false, iArr, i12, i69, s8, a8, abstractC1954s2, w8, h8);
    }

    public static double B(Object obj, long j8) {
        return ((Double) AbstractC1989z2.k(obj, j8)).doubleValue();
    }

    public static float C(Object obj, long j8) {
        return ((Float) AbstractC1989z2.k(obj, j8)).floatValue();
    }

    public static int D(Object obj, long j8) {
        return ((Integer) AbstractC1989z2.k(obj, j8)).intValue();
    }

    public static int G(int i8) {
        return (i8 >>> 20) & 255;
    }

    public static long I(Object obj, long j8) {
        return ((Long) AbstractC1989z2.k(obj, j8)).longValue();
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

    public static boolean t(Object obj, int i8, InterfaceC1890f2 interfaceC1890f2) {
        return interfaceC1890f2.b(AbstractC1989z2.k(obj, i8 & 1048575));
    }

    public static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1914k1) {
            return ((AbstractC1914k1) obj).F();
        }
        return true;
    }

    public static boolean w(Object obj, long j8) {
        return ((Boolean) AbstractC1989z2.k(obj, j8)).booleanValue();
    }

    public static final void x(int i8, Object obj, I2 i9) {
        if (obj instanceof String) {
            i9.b(i8, (String) obj);
        } else {
            i9.J(i8, (J0) obj);
        }
    }

    public static C1959t2 z(Object obj) {
        AbstractC1914k1 abstractC1914k1 = (AbstractC1914k1) obj;
        C1959t2 c1959t2 = abstractC1914k1.zzc;
        if (c1959t2 != C1959t2.c()) {
            return c1959t2;
        }
        C1959t2 c1959t2F = C1959t2.f();
        abstractC1914k1.zzc = c1959t2F;
        return c1959t2F;
    }

    public final int E(int i8) {
        return this.f17999a[i8 + 2];
    }

    public final int F(int i8, int i9) {
        int length = (this.f17999a.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = this.f17999a[i11];
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
        return this.f17999a[i8 + 1];
    }

    public final InterfaceC1934o1 J(int i8) {
        int i9 = i8 / 3;
        return (InterfaceC1934o1) this.f18000b[i9 + i9 + 1];
    }

    public final InterfaceC1890f2 K(int i8) {
        Object[] objArr = this.f18000b;
        int i9 = i8 / 3;
        int i10 = i9 + i9;
        InterfaceC1890f2 interfaceC1890f2 = (InterfaceC1890f2) objArr[i10];
        if (interfaceC1890f2 != null) {
            return interfaceC1890f2;
        }
        InterfaceC1890f2 interfaceC1890f2B = U1.a().b((Class) objArr[i10 + 1]);
        this.f18000b[i10] = interfaceC1890f2B;
        return interfaceC1890f2B;
    }

    public final Object L(int i8) {
        int i9 = i8 / 3;
        return this.f18000b[i9 + i9];
    }

    public final Object M(Object obj, int i8) {
        InterfaceC1890f2 interfaceC1890f2K = K(i8);
        int iH = H(i8) & 1048575;
        if (!r(obj, i8)) {
            return interfaceC1890f2K.f();
        }
        Object object = f17998m.getObject(obj, iH);
        if (u(object)) {
            return object;
        }
        Object objF = interfaceC1890f2K.f();
        if (object != null) {
            interfaceC1890f2K.e(objF, object);
        }
        return objF;
    }

    public final Object N(Object obj, int i8, int i9) {
        InterfaceC1890f2 interfaceC1890f2K = K(i9);
        if (!v(obj, i8, i9)) {
            return interfaceC1890f2K.f();
        }
        Object object = f17998m.getObject(obj, H(i9) & 1048575);
        if (u(object)) {
            return object;
        }
        Object objF = interfaceC1890f2K.f();
        if (object != null) {
            interfaceC1890f2K.e(objF, object);
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final void a(Object obj) {
        if (u(obj)) {
            if (obj instanceof AbstractC1914k1) {
                AbstractC1914k1 abstractC1914k1 = (AbstractC1914k1) obj;
                abstractC1914k1.D(Integer.MAX_VALUE);
                abstractC1914k1.zza = 0;
                abstractC1914k1.B();
            }
            int[] iArr = this.f17999a;
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
                                    K(i8).a(f17998m.getObject(obj, j8));
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
                                ((InterfaceC1948r1) AbstractC1989z2.k(obj, j8)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = f17998m;
                                Object object = unsafe.getObject(obj, j8);
                                if (object != null) {
                                    ((G1) object).d();
                                    unsafe.putObject(obj, j8, object);
                                }
                                break;
                        }
                    } else if (v(obj, this.f17999a[i8], i8)) {
                        K(i8).a(f17998m.getObject(obj, j8));
                    }
                } else if (r(obj, i8)) {
                    K(i8).a(f17998m.getObject(obj, j8));
                }
            }
            this.f18008j.a(obj);
            if (this.f18004f) {
                this.f18009k.a(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3 A[LOOP:1: B:45:0x00a2->B:50:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final boolean b(Object obj) {
        int i8;
        int i9;
        List list;
        InterfaceC1890f2 interfaceC1890f2K;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (i11 < this.f18006h) {
            int[] iArr = this.f18005g;
            int[] iArr2 = this.f17999a;
            int i14 = iArr[i11];
            int i15 = iArr2[i14];
            int iH = H(i14);
            int i16 = this.f17999a[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i13) {
                if (i17 != 1048575) {
                    i12 = f17998m.getInt(obj, i17);
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
                list = (List) AbstractC1989z2.k(obj2, iH & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    interfaceC1890f2K = K(i14);
                    for (i10 = 0; i10 < list.size(); i10++) {
                        if (!interfaceC1890f2K.b(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (iG == 60 || iG == 68) {
                if (v(obj2, i15, i14) && !t(obj2, iH, K(i14))) {
                    return false;
                }
            } else if (iG == 49) {
                list = (List) AbstractC1989z2.k(obj2, iH & 1048575);
                if (list.isEmpty()) {
                    interfaceC1890f2K = K(i14);
                    while (i10 < list.size()) {
                        if (!interfaceC1890f2K.b(list.get(i10))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iG == 50 && !((G1) AbstractC1989z2.k(obj2, iH & 1048575)).isEmpty()) {
                p063h.s.a(L(i14));
                throw null;
            }
            i11++;
            obj = obj2;
            i13 = i8;
            i12 = i9;
        }
        return !this.f18004f || ((AbstractC1899h1) obj).zzb.k();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final int c(Object obj) {
        int i8;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i9;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f17999a.length; i11 += 3) {
            int iH = H(i11);
            int[] iArr = this.f17999a;
            int i12 = 1048575 & iH;
            int iG = G(iH);
            int i13 = iArr[i11];
            long j8 = i12;
            int iHashCode = 37;
            switch (iG) {
                case 0:
                    i8 = i10 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(AbstractC1989z2.f(obj, j8));
                    Charset charset = AbstractC1953s1.f18650a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 1:
                    i8 = i10 * 53;
                    iFloatToIntBits = Float.floatToIntBits(AbstractC1989z2.g(obj, j8));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 2:
                    i8 = i10 * 53;
                    jDoubleToLongBits = AbstractC1989z2.i(obj, j8);
                    Charset charset2 = AbstractC1953s1.f18650a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 3:
                    i8 = i10 * 53;
                    jDoubleToLongBits = AbstractC1989z2.i(obj, j8);
                    Charset charset3 = AbstractC1953s1.f18650a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 4:
                    i8 = i10 * 53;
                    iFloatToIntBits = AbstractC1989z2.h(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 5:
                    i8 = i10 * 53;
                    jDoubleToLongBits = AbstractC1989z2.i(obj, j8);
                    Charset charset4 = AbstractC1953s1.f18650a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 6:
                    i8 = i10 * 53;
                    iFloatToIntBits = AbstractC1989z2.h(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 7:
                    i8 = i10 * 53;
                    iFloatToIntBits = AbstractC1953s1.a(AbstractC1989z2.B(obj, j8));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 8:
                    i8 = i10 * 53;
                    iFloatToIntBits = ((String) AbstractC1989z2.k(obj, j8)).hashCode();
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 9:
                    i9 = i10 * 53;
                    Object objK = AbstractC1989z2.k(obj, j8);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i10 = i9 + iHashCode;
                    break;
                case 10:
                    i8 = i10 * 53;
                    iFloatToIntBits = AbstractC1989z2.k(obj, j8).hashCode();
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 11:
                    i8 = i10 * 53;
                    iFloatToIntBits = AbstractC1989z2.h(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 12:
                    i8 = i10 * 53;
                    iFloatToIntBits = AbstractC1989z2.h(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    i8 = i10 * 53;
                    iFloatToIntBits = AbstractC1989z2.h(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    i8 = i10 * 53;
                    jDoubleToLongBits = AbstractC1989z2.i(obj, j8);
                    Charset charset5 = AbstractC1953s1.f18650a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    i8 = i10 * 53;
                    iFloatToIntBits = AbstractC1989z2.h(obj, j8);
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 16:
                    i8 = i10 * 53;
                    jDoubleToLongBits = AbstractC1989z2.i(obj, j8);
                    Charset charset6 = AbstractC1953s1.f18650a;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i10 = i8 + iFloatToIntBits;
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    i9 = i10 * 53;
                    Object objK2 = AbstractC1989z2.k(obj, j8);
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
                    iFloatToIntBits = AbstractC1989z2.k(obj, j8).hashCode();
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 50:
                    i8 = i10 * 53;
                    iFloatToIntBits = AbstractC1989z2.k(obj, j8).hashCode();
                    i10 = i8 + iFloatToIntBits;
                    break;
                case 51:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(B(obj, j8));
                        Charset charset7 = AbstractC1953s1.f18650a;
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
                        Charset charset8 = AbstractC1953s1.f18650a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        jDoubleToLongBits = I(obj, j8);
                        Charset charset9 = AbstractC1953s1.f18650a;
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
                        Charset charset10 = AbstractC1953s1.f18650a;
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
                        iFloatToIntBits = AbstractC1953s1.a(w(obj, j8));
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = ((String) AbstractC1989z2.k(obj, j8)).hashCode();
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = AbstractC1989z2.k(obj, j8).hashCode();
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = AbstractC1989z2.k(obj, j8).hashCode();
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
                        Charset charset11 = AbstractC1953s1.f18650a;
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
                        Charset charset12 = AbstractC1953s1.f18650a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        iFloatToIntBits = AbstractC1989z2.k(obj, j8).hashCode();
                        i10 = i8 + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i10 * 53) + ((AbstractC1914k1) obj).zzc.hashCode();
        return this.f18004f ? (iHashCode2 * 53) + ((AbstractC1899h1) obj).zzb.f18053a.hashCode() : iHashCode2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x038b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0482  */
    /* JADX WARN: Code duplicated, block: B:271:0x06ed A[PHI: r0
      0x06ed: PHI (r0v2 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1) = 
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v39 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
      (r0v1 com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1)
     binds: [B:18:0x004f, B:269:0x06e0, B:239:0x061c, B:216:0x058c, B:209:0x0559, B:138:0x036f, B:135:0x0357, B:132:0x033f, B:129:0x0327, B:126:0x030f, B:123:0x02f7, B:120:0x02df, B:117:0x02c7, B:114:0x02ae, B:111:0x0297, B:108:0x0280, B:105:0x0269, B:102:0x0252, B:97:0x0236, B:83:0x01e2, B:85:0x01f0, B:80:0x01c7, B:77:0x01b9, B:74:0x01a3, B:71:0x018d, B:68:0x0176, B:65:0x0168, B:62:0x015a, B:59:0x014b, B:53:0x0120, B:50:0x010c, B:46:0x00ee, B:43:0x00d9, B:40:0x00c3, B:36:0x00b4, B:32:0x00a5, B:29:0x008b, B:25:0x0070, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final int d(Object obj) {
        int i8;
        int iA;
        int iA2;
        int iB;
        int iA3;
        int iA4;
        int iA5;
        int iY;
        int iA6;
        int iM;
        int iL;
        int size;
        int iQ;
        int iA7;
        int iA8;
        int iA9;
        int iB2;
        int iJ;
        int iA10;
        int iA11;
        int iZ;
        int iA12;
        int iA13;
        int iA14;
        int iY2;
        int iA15;
        P1 p8 = this;
        Unsafe unsafe = f17998m;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int iA16 = 0;
        int i12 = 1048575;
        while (i10 < p8.f17999a.length) {
            int iH = p8.H(i10);
            int iG = G(iH);
            int[] iArr = p8.f17999a;
            int i13 = iArr[i10];
            int i14 = iArr[i10 + 2];
            int i15 = i14 & i9;
            if (iG <= 17) {
                if (i15 != i12) {
                    i11 = i15 == i9 ? 0 : unsafe.getInt(obj, i15);
                    i12 = i15;
                }
                i8 = 1 << (i14 >>> 20);
            } else {
                i8 = 0;
            }
            int i16 = iH & i9;
            if (iG >= EnumC1869b1.f18067W.zza()) {
                EnumC1869b1.f18089j0.zza();
            }
            int i17 = iA16;
            long j8 = i16;
            switch (iG) {
                case 0:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        iA16 = i17 + R0.a(i13 << 3) + 8;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 1:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        iA = R0.a(i13 << 3);
                        iA4 = iA + 4;
                        iA16 = i17 + iA4;
                        p8 = this;
                        i10 += 3;
                        i9 = 1048575;
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 2:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        long j9 = unsafe.getLong(obj, j8);
                        iA2 = R0.a(i13 << 3);
                        iB = R0.b(j9);
                        iA4 = iA2 + iB;
                        iA16 = i17 + iA4;
                        p8 = this;
                        i10 += 3;
                        i9 = 1048575;
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 3:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        long j10 = unsafe.getLong(obj, j8);
                        iA2 = R0.a(i13 << 3);
                        iB = R0.b(j10);
                        iA4 = iA2 + iB;
                        iA16 = i17 + iA4;
                        p8 = this;
                        i10 += 3;
                        i9 = 1048575;
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 4:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        long j11 = unsafe.getInt(obj, j8);
                        iA2 = R0.a(i13 << 3);
                        iB = R0.b(j11);
                        iA4 = iA2 + iB;
                        iA16 = i17 + iA4;
                        p8 = this;
                        i10 += 3;
                        i9 = 1048575;
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 5:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        iA3 = R0.a(i13 << 3);
                        iA4 = iA3 + 8;
                        iA16 = i17 + iA4;
                        p8 = this;
                        i10 += 3;
                        i9 = 1048575;
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 6:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        iA = R0.a(i13 << 3);
                        iA4 = iA + 4;
                        iA16 = i17 + iA4;
                        p8 = this;
                        i10 += 3;
                        i9 = 1048575;
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 7:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        iA4 = R0.a(i13 << 3) + 1;
                        iA16 = i17 + iA4;
                        p8 = this;
                        i10 += 3;
                        i9 = 1048575;
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 8:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        int i18 = i13 << 3;
                        Object object = unsafe.getObject(obj, j8);
                        if (object instanceof J0) {
                            iA5 = R0.a(i18);
                            iY = ((J0) object).y();
                            iA6 = R0.a(iY);
                            iA4 = iA5 + iA6 + iY;
                            iA16 = i17 + iA4;
                            p8 = this;
                            i10 += 3;
                            i9 = 1048575;
                        } else {
                            iA2 = R0.a(i18);
                            iB = R0.C((String) object);
                            iA4 = iA2 + iB;
                            iA16 = i17 + iA4;
                            p8 = this;
                            i10 += 3;
                            i9 = 1048575;
                        }
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 9:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        iM = AbstractC1900h2.m(i13, unsafe.getObject(obj, j8), p8.K(i10));
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 10:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        J0 j12 = (J0) unsafe.getObject(obj, j8);
                        iA5 = R0.a(i13 << 3);
                        iY = j12.y();
                        iA6 = R0.a(iY);
                        iA4 = iA5 + iA6 + iY;
                        iA16 = i17 + iA4;
                        p8 = this;
                        i10 += 3;
                        i9 = 1048575;
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 11:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        int i19 = unsafe.getInt(obj, j8);
                        iA2 = R0.a(i13 << 3);
                        iB = R0.a(i19);
                        iA4 = iA2 + iB;
                        iA16 = i17 + iA4;
                        p8 = this;
                        i10 += 3;
                        i9 = 1048575;
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 12:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        long j13 = unsafe.getInt(obj, j8);
                        iA2 = R0.a(i13 << 3);
                        iB = R0.b(j13);
                        iA4 = iA2 + iB;
                        iA16 = i17 + iA4;
                        p8 = this;
                        i10 += 3;
                        i9 = 1048575;
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        iA = R0.a(i13 << 3);
                        iA4 = iA + 4;
                        iA16 = i17 + iA4;
                        p8 = this;
                        i10 += 3;
                        i9 = 1048575;
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        iA3 = R0.a(i13 << 3);
                        iA4 = iA3 + 8;
                        iA16 = i17 + iA4;
                        p8 = this;
                        i10 += 3;
                        i9 = 1048575;
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        int i20 = unsafe.getInt(obj, j8);
                        iA2 = R0.a(i13 << 3);
                        iB = R0.a((i20 >> 31) ^ (i20 + i20));
                        iA4 = iA2 + iB;
                        iA16 = i17 + iA4;
                        p8 = this;
                        i10 += 3;
                        i9 = 1048575;
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 16:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        long j14 = unsafe.getLong(obj, j8);
                        iA2 = R0.a(i13 << 3);
                        iB = R0.b((j14 >> 63) ^ (j14 + j14));
                        iA4 = iA2 + iB;
                        iA16 = i17 + iA4;
                        p8 = this;
                        i10 += 3;
                        i9 = 1048575;
                    }
                    p8 = this;
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    if (p8.s(obj, i10, i12, i11, i8)) {
                        iM = R0.z(i13, (M1) unsafe.getObject(obj, j8), p8.K(i10));
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 18:
                    iM = AbstractC1900h2.i(i13, (List) unsafe.getObject(obj, j8), false);
                    iA16 = i17 + iM;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 19:
                    iM = AbstractC1900h2.g(i13, (List) unsafe.getObject(obj, j8), false);
                    iA16 = i17 + iM;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j8);
                    AbstractC1954s2 abstractC1954s2 = AbstractC1900h2.f18578a;
                    if (list.size() == 0) {
                        iL = 0;
                    } else {
                        iL = AbstractC1900h2.l(list) + (list.size() * R0.a(i13 << 3));
                    }
                    iA16 = iL + i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j8);
                    AbstractC1954s2 abstractC1954s3 = AbstractC1900h2.f18578a;
                    size = list2.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = AbstractC1900h2.q(list2);
                        iA7 = R0.a(i13 << 3);
                        iB2 = size * iA7;
                        iM = iQ + iB2;
                    }
                    iA16 = i17 + iM;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                    List list3 = (List) unsafe.getObject(obj, j8);
                    AbstractC1954s2 abstractC1954s4 = AbstractC1900h2.f18578a;
                    size = list3.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = AbstractC1900h2.k(list3);
                        iA7 = R0.a(i13 << 3);
                        iB2 = size * iA7;
                        iM = iQ + iB2;
                    }
                    iA16 = i17 + iM;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                    iM = AbstractC1900h2.i(i13, (List) unsafe.getObject(obj, j8), false);
                    iA16 = i17 + iM;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 24:
                    iM = AbstractC1900h2.g(i13, (List) unsafe.getObject(obj, j8), false);
                    iA16 = i17 + iM;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j8);
                    AbstractC1954s2 abstractC1954s5 = AbstractC1900h2.f18578a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM = 0;
                    } else {
                        iM = size2 * (R0.a(i13 << 3) + 1);
                    }
                    iA16 = i17 + iM;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j8);
                    AbstractC1954s2 abstractC1954s6 = AbstractC1900h2.f18578a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iL = 0;
                    } else {
                        iL = R0.a(i13 << 3) * size3;
                        for (int i21 = 0; i21 < size3; i21++) {
                            Object obj2 = list5.get(i21);
                            if (obj2 instanceof J0) {
                                int iY3 = ((J0) obj2).y();
                                iL += R0.a(iY3) + iY3;
                            } else {
                                iL += R0.C((String) obj2);
                            }
                        }
                    }
                    iA16 = iL + i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j8);
                    InterfaceC1890f2 interfaceC1890f2K = p8.K(i10);
                    AbstractC1954s2 abstractC1954s7 = AbstractC1900h2.f18578a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iA8 = 0;
                    } else {
                        iA8 = R0.a(i13 << 3) * size4;
                        for (int i22 = 0; i22 < size4; i22++) {
                            Object obj3 = list6.get(i22);
                            if (obj3 instanceof C1988z1) {
                                int iA17 = ((C1988z1) obj3).a();
                                iA8 += R0.a(iA17) + iA17;
                            } else {
                                iA8 += R0.B((M1) obj3, interfaceC1890f2K);
                            }
                        }
                    }
                    iA16 = i17 + iA8;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j8);
                    AbstractC1954s2 abstractC1954s8 = AbstractC1900h2.f18578a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iA9 = 0;
                    } else {
                        iA9 = size5 * R0.a(i13 << 3);
                        for (int i23 = 0; i23 < list7.size(); i23++) {
                            int iY4 = ((J0) list7.get(i23)).y();
                            iA9 += R0.a(iY4) + iY4;
                        }
                    }
                    iA16 = i17 + iA9;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j8);
                    AbstractC1954s2 abstractC1954s9 = AbstractC1900h2.f18578a;
                    size = list8.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = AbstractC1900h2.p(list8);
                        iA7 = R0.a(i13 << 3);
                        iB2 = size * iA7;
                        iM = iQ + iB2;
                    }
                    iA16 = i17 + iM;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j8);
                    AbstractC1954s2 abstractC1954s10 = AbstractC1900h2.f18578a;
                    size = list9.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = AbstractC1900h2.f(list9);
                        iA7 = R0.a(i13 << 3);
                        iB2 = size * iA7;
                        iM = iQ + iB2;
                    }
                    iA16 = i17 + iM;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 31:
                    iM = AbstractC1900h2.g(i13, (List) unsafe.getObject(obj, j8), false);
                    iA16 = i17 + iM;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 32:
                    iM = AbstractC1900h2.i(i13, (List) unsafe.getObject(obj, j8), false);
                    iA16 = i17 + iM;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j8);
                    AbstractC1954s2 abstractC1954s11 = AbstractC1900h2.f18578a;
                    size = list10.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = AbstractC1900h2.n(list10);
                        iA7 = R0.a(i13 << 3);
                        iB2 = size * iA7;
                        iM = iQ + iB2;
                    }
                    iA16 = i17 + iM;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j8);
                    AbstractC1954s2 abstractC1954s12 = AbstractC1900h2.f18578a;
                    size = list11.size();
                    if (size == 0) {
                        iM = 0;
                    } else {
                        iQ = AbstractC1900h2.o(list11);
                        iA7 = R0.a(i13 << 3);
                        iB2 = size * iA7;
                        iM = iQ + iB2;
                    }
                    iA16 = i17 + iM;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 35:
                    iJ = AbstractC1900h2.j((List) unsafe.getObject(obj, j8));
                    if (iJ > 0) {
                        iA10 = R0.a(i13 << 3);
                        iA11 = R0.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i17 + iA9;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 36:
                    iJ = AbstractC1900h2.h((List) unsafe.getObject(obj, j8));
                    if (iJ > 0) {
                        iA10 = R0.a(i13 << 3);
                        iA11 = R0.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i17 + iA9;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 37:
                    iJ = AbstractC1900h2.l((List) unsafe.getObject(obj, j8));
                    if (iJ > 0) {
                        iA10 = R0.a(i13 << 3);
                        iA11 = R0.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i17 + iA9;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 38:
                    iJ = AbstractC1900h2.q((List) unsafe.getObject(obj, j8));
                    if (iJ > 0) {
                        iA10 = R0.a(i13 << 3);
                        iA11 = R0.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i17 + iA9;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 39:
                    iJ = AbstractC1900h2.k((List) unsafe.getObject(obj, j8));
                    if (iJ > 0) {
                        iA10 = R0.a(i13 << 3);
                        iA11 = R0.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i17 + iA9;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case Messages.ServerMessage.ICON_FIELD_NUMBER /* 40 */:
                    iJ = AbstractC1900h2.j((List) unsafe.getObject(obj, j8));
                    if (iJ > 0) {
                        iA10 = R0.a(i13 << 3);
                        iA11 = R0.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i17 + iA9;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 41:
                    iJ = AbstractC1900h2.h((List) unsafe.getObject(obj, j8));
                    if (iJ > 0) {
                        iA10 = R0.a(i13 << 3);
                        iA11 = R0.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i17 + iA9;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j8);
                    AbstractC1954s2 abstractC1954s13 = AbstractC1900h2.f18578a;
                    iJ = list12.size();
                    if (iJ > 0) {
                        iA10 = R0.a(i13 << 3);
                        iA11 = R0.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i17 + iA9;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 43:
                    iJ = AbstractC1900h2.p((List) unsafe.getObject(obj, j8));
                    if (iJ > 0) {
                        iA10 = R0.a(i13 << 3);
                        iA11 = R0.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i17 + iA9;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 44:
                    iJ = AbstractC1900h2.f((List) unsafe.getObject(obj, j8));
                    if (iJ > 0) {
                        iA10 = R0.a(i13 << 3);
                        iA11 = R0.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i17 + iA9;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 45:
                    iJ = AbstractC1900h2.h((List) unsafe.getObject(obj, j8));
                    if (iJ > 0) {
                        iA10 = R0.a(i13 << 3);
                        iA11 = R0.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i17 + iA9;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 46:
                    iJ = AbstractC1900h2.j((List) unsafe.getObject(obj, j8));
                    if (iJ > 0) {
                        iA10 = R0.a(i13 << 3);
                        iA11 = R0.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i17 + iA9;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 47:
                    iJ = AbstractC1900h2.n((List) unsafe.getObject(obj, j8));
                    if (iJ > 0) {
                        iA10 = R0.a(i13 << 3);
                        iA11 = R0.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i17 + iA9;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 48:
                    iJ = AbstractC1900h2.o((List) unsafe.getObject(obj, j8));
                    if (iJ > 0) {
                        iA10 = R0.a(i13 << 3);
                        iA11 = R0.a(iJ);
                        iA9 = iA10 + iA11 + iJ;
                        iA16 = i17 + iA9;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j8);
                    InterfaceC1890f2 interfaceC1890f2K2 = p8.K(i10);
                    AbstractC1954s2 abstractC1954s14 = AbstractC1900h2.f18578a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZ = 0;
                    } else {
                        iZ = 0;
                        for (int i24 = 0; i24 < size6; i24++) {
                            iZ += R0.z(i13, (M1) list13.get(i24), interfaceC1890f2K2);
                        }
                    }
                    iA16 = i17 + iZ;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 50:
                    G1 g8 = (G1) unsafe.getObject(obj, j8);
                    p063h.s.a(p8.L(i10));
                    if (!g8.isEmpty()) {
                        Iterator it = g8.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 51:
                    if (p8.v(obj, i13, i10)) {
                        iA12 = R0.a(i13 << 3);
                        iM = iA12 + 8;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 52:
                    if (p8.v(obj, i13, i10)) {
                        iA13 = R0.a(i13 << 3);
                        iM = iA13 + 4;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 53:
                    if (p8.v(obj, i13, i10)) {
                        long jI = I(obj, j8);
                        iQ = R0.a(i13 << 3);
                        iB2 = R0.b(jI);
                        iM = iQ + iB2;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 54:
                    if (p8.v(obj, i13, i10)) {
                        long jI2 = I(obj, j8);
                        iQ = R0.a(i13 << 3);
                        iB2 = R0.b(jI2);
                        iM = iQ + iB2;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 55:
                    if (p8.v(obj, i13, i10)) {
                        long jD = D(obj, j8);
                        iQ = R0.a(i13 << 3);
                        iB2 = R0.b(jD);
                        iM = iQ + iB2;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 56:
                    if (p8.v(obj, i13, i10)) {
                        iA12 = R0.a(i13 << 3);
                        iM = iA12 + 8;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 57:
                    if (p8.v(obj, i13, i10)) {
                        iA13 = R0.a(i13 << 3);
                        iM = iA13 + 4;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 58:
                    if (p8.v(obj, i13, i10)) {
                        iM = R0.a(i13 << 3) + 1;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 59:
                    if (p8.v(obj, i13, i10)) {
                        int i25 = i13 << 3;
                        Object object2 = unsafe.getObject(obj, j8);
                        if (object2 instanceof J0) {
                            iA14 = R0.a(i25);
                            iY2 = ((J0) object2).y();
                            iA15 = R0.a(iY2);
                            iM = iA14 + iA15 + iY2;
                            iA16 = i17 + iM;
                        } else {
                            iQ = R0.a(i25);
                            iB2 = R0.C((String) object2);
                            iM = iQ + iB2;
                            iA16 = i17 + iM;
                        }
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 60:
                    if (p8.v(obj, i13, i10)) {
                        iM = AbstractC1900h2.m(i13, unsafe.getObject(obj, j8), p8.K(i10));
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 61:
                    if (p8.v(obj, i13, i10)) {
                        J0 j15 = (J0) unsafe.getObject(obj, j8);
                        iA14 = R0.a(i13 << 3);
                        iY2 = j15.y();
                        iA15 = R0.a(iY2);
                        iM = iA14 + iA15 + iY2;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 62:
                    if (p8.v(obj, i13, i10)) {
                        int iD = D(obj, j8);
                        iQ = R0.a(i13 << 3);
                        iB2 = R0.a(iD);
                        iM = iQ + iB2;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 63:
                    if (p8.v(obj, i13, i10)) {
                        long jD2 = D(obj, j8);
                        iQ = R0.a(i13 << 3);
                        iB2 = R0.b(jD2);
                        iM = iQ + iB2;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 64:
                    if (p8.v(obj, i13, i10)) {
                        iA13 = R0.a(i13 << 3);
                        iM = iA13 + 4;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 65:
                    if (p8.v(obj, i13, i10)) {
                        iA12 = R0.a(i13 << 3);
                        iM = iA12 + 8;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 66:
                    if (p8.v(obj, i13, i10)) {
                        int iD2 = D(obj, j8);
                        iQ = R0.a(i13 << 3);
                        iB2 = R0.a((iD2 >> 31) ^ (iD2 + iD2));
                        iM = iQ + iB2;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 67:
                    if (p8.v(obj, i13, i10)) {
                        long jI3 = I(obj, j8);
                        iQ = R0.a(i13 << 3);
                        iB2 = R0.b((jI3 >> 63) ^ (jI3 + jI3));
                        iM = iQ + iB2;
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                case 68:
                    if (p8.v(obj, i13, i10)) {
                        iM = R0.z(i13, (M1) unsafe.getObject(obj, j8), p8.K(i10));
                        iA16 = i17 + iM;
                    } else {
                        iA16 = i17;
                    }
                    i10 += 3;
                    i9 = 1048575;
                    break;
                default:
                    iA16 = i17;
                    i10 += 3;
                    i9 = 1048575;
                    break;
            }
        }
        int iA18 = iA16 + ((AbstractC1914k1) obj).zzc.a();
        if (!p8.f18004f) {
            return iA18;
        }
        C1864a1 c1864a1 = ((AbstractC1899h1) obj).zzb;
        int iC = c1864a1.f18053a.c();
        int iA19 = 0;
        for (int i26 = 0; i26 < iC; i26++) {
            Map.Entry entryG = c1864a1.f18053a.g(i26);
            iA19 += C1864a1.a((Z0) ((C1910j2) entryG).a(), entryG.getValue());
        }
        for (Map.Entry entry2 : c1864a1.f18053a.d()) {
            iA19 += C1864a1.a((Z0) entry2.getKey(), entry2.getValue());
        }
        return iA18 + iA19;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final void e(Object obj, Object obj2) {
        j(obj);
        obj2.getClass();
        for (int i8 = 0; i8 < this.f17999a.length; i8 += 3) {
            int iH = H(i8);
            int i9 = 1048575 & iH;
            int[] iArr = this.f17999a;
            int iG = G(iH);
            int i10 = iArr[i8];
            long j8 = i9;
            switch (iG) {
                case 0:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.t(obj, j8, AbstractC1989z2.f(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 1:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.u(obj, j8, AbstractC1989z2.g(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 2:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.w(obj, j8, AbstractC1989z2.i(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 3:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.w(obj, j8, AbstractC1989z2.i(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 4:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.v(obj, j8, AbstractC1989z2.h(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 5:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.w(obj, j8, AbstractC1989z2.i(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 6:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.v(obj, j8, AbstractC1989z2.h(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 7:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.r(obj, j8, AbstractC1989z2.B(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 8:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.x(obj, j8, AbstractC1989z2.k(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 9:
                    k(obj, obj2, i8);
                    break;
                case 10:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.x(obj, j8, AbstractC1989z2.k(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 11:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.v(obj, j8, AbstractC1989z2.h(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 12:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.v(obj, j8, AbstractC1989z2.h(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.v(obj, j8, AbstractC1989z2.h(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.w(obj, j8, AbstractC1989z2.i(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.v(obj, j8, AbstractC1989z2.h(obj2, j8));
                        m(obj, i8);
                    }
                    break;
                case 16:
                    if (r(obj2, i8)) {
                        AbstractC1989z2.w(obj, j8, AbstractC1989z2.i(obj2, j8));
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
                    InterfaceC1948r1 interfaceC1948r1B = (InterfaceC1948r1) AbstractC1989z2.k(obj, j8);
                    InterfaceC1948r1 interfaceC1948r1 = (InterfaceC1948r1) AbstractC1989z2.k(obj2, j8);
                    int size = interfaceC1948r1B.size();
                    int size2 = interfaceC1948r1.size();
                    if (size > 0 && size2 > 0) {
                        if (!interfaceC1948r1B.j()) {
                            interfaceC1948r1B = interfaceC1948r1B.b(size2 + size);
                        }
                        interfaceC1948r1B.addAll(interfaceC1948r1);
                    }
                    if (size > 0) {
                        interfaceC1948r1 = interfaceC1948r1B;
                    }
                    AbstractC1989z2.x(obj, j8, interfaceC1948r1);
                    break;
                case 50:
                    AbstractC1954s2 abstractC1954s2 = AbstractC1900h2.f18578a;
                    AbstractC1989z2.x(obj, j8, H1.a(AbstractC1989z2.k(obj, j8), AbstractC1989z2.k(obj2, j8)));
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
                        AbstractC1989z2.x(obj, j8, AbstractC1989z2.k(obj2, j8));
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
                        AbstractC1989z2.x(obj, j8, AbstractC1989z2.k(obj2, j8));
                        n(obj, i10, i8);
                    }
                    break;
                case 68:
                    l(obj, obj2, i8);
                    break;
            }
        }
        AbstractC1900h2.u(this.f18008j, obj, obj2);
        if (this.f18004f) {
            AbstractC1900h2.t(this.f18009k, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final Object f() {
        return ((AbstractC1914k1) this.f18003e).p();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final boolean g(Object obj, Object obj2) {
        boolean zE;
        for (int i8 = 0; i8 < this.f17999a.length; i8 += 3) {
            int iH = H(i8);
            long j8 = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (!q(obj, obj2, i8) || Double.doubleToLongBits(AbstractC1989z2.f(obj, j8)) != Double.doubleToLongBits(AbstractC1989z2.f(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!q(obj, obj2, i8) || Float.floatToIntBits(AbstractC1989z2.g(obj, j8)) != Float.floatToIntBits(AbstractC1989z2.g(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!q(obj, obj2, i8) || AbstractC1989z2.i(obj, j8) != AbstractC1989z2.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!q(obj, obj2, i8) || AbstractC1989z2.i(obj, j8) != AbstractC1989z2.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!q(obj, obj2, i8) || AbstractC1989z2.h(obj, j8) != AbstractC1989z2.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!q(obj, obj2, i8) || AbstractC1989z2.i(obj, j8) != AbstractC1989z2.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!q(obj, obj2, i8) || AbstractC1989z2.h(obj, j8) != AbstractC1989z2.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!q(obj, obj2, i8) || AbstractC1989z2.B(obj, j8) != AbstractC1989z2.B(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!q(obj, obj2, i8) || !AbstractC1900h2.e(AbstractC1989z2.k(obj, j8), AbstractC1989z2.k(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!q(obj, obj2, i8) || !AbstractC1900h2.e(AbstractC1989z2.k(obj, j8), AbstractC1989z2.k(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!q(obj, obj2, i8) || !AbstractC1900h2.e(AbstractC1989z2.k(obj, j8), AbstractC1989z2.k(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!q(obj, obj2, i8) || AbstractC1989z2.h(obj, j8) != AbstractC1989z2.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!q(obj, obj2, i8) || AbstractC1989z2.h(obj, j8) != AbstractC1989z2.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    if (!q(obj, obj2, i8) || AbstractC1989z2.h(obj, j8) != AbstractC1989z2.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    if (!q(obj, obj2, i8) || AbstractC1989z2.i(obj, j8) != AbstractC1989z2.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    if (!q(obj, obj2, i8) || AbstractC1989z2.h(obj, j8) != AbstractC1989z2.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!q(obj, obj2, i8) || AbstractC1989z2.i(obj, j8) != AbstractC1989z2.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    if (!q(obj, obj2, i8) || !AbstractC1900h2.e(AbstractC1989z2.k(obj, j8), AbstractC1989z2.k(obj2, j8))) {
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
                    zE = AbstractC1900h2.e(AbstractC1989z2.k(obj, j8), AbstractC1989z2.k(obj2, j8));
                    break;
                case 50:
                    zE = AbstractC1900h2.e(AbstractC1989z2.k(obj, j8), AbstractC1989z2.k(obj2, j8));
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
                    if (AbstractC1989z2.h(obj, jE) != AbstractC1989z2.h(obj2, jE) || !AbstractC1900h2.e(AbstractC1989z2.k(obj, j8), AbstractC1989z2.k(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zE) {
                return false;
            }
        }
        if (!((AbstractC1914k1) obj).zzc.equals(((AbstractC1914k1) obj2).zzc)) {
            return false;
        }
        if (this.f18004f) {
            return ((AbstractC1899h1) obj).zzb.equals(((AbstractC1899h1) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final void h(Object obj, byte[] bArr, int i8, int i9, C1982y0 c1982y0) {
        y(obj, bArr, i8, i9, 0, c1982y0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC1890f2
    public final void i(Object obj, I2 i8) {
        Map.Entry entry;
        Iterator it;
        int i9;
        int i10;
        int i11;
        int i12;
        P1 p8 = this;
        if (p8.f18004f) {
            C1864a1 c1864a1 = ((AbstractC1899h1) obj).zzb;
            if (c1864a1.f18053a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itF = c1864a1.f();
                entry = (Map.Entry) itF.next();
                it = itF;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = p8.f17999a;
        Unsafe unsafe = f17998m;
        int i13 = 0;
        int i14 = 1048575;
        int i15 = 0;
        while (i13 < iArr.length) {
            int iH = p8.H(i13);
            int[] iArr2 = p8.f17999a;
            int iG = G(iH);
            int i16 = iArr2[i13];
            if (iG <= 17) {
                int i17 = iArr2[i13 + 2];
                int i18 = i17 & 1048575;
                if (i18 != i14) {
                    i9 = 1;
                    i15 = i18 == 1048575 ? 0 : unsafe.getInt(obj, i18);
                    i14 = i18;
                } else {
                    i9 = 1;
                }
                i10 = i14;
                i11 = i15;
                i12 = i9 << (i17 >>> 20);
            } else {
                i9 = 1;
                i10 = i14;
                i11 = i15;
                i12 = 0;
            }
            while (entry != null && ((C1904i1) entry.getKey()).f18580a <= i16) {
                p8.f18009k.b(i8, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j8 = iH & 1048575;
            switch (iG) {
                case 0:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.r(i16, AbstractC1989z2.f(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 1:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.v(i16, AbstractC1989z2.g(obj, j8));
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 2:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.g(i16, unsafe.getLong(obj, j8));
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 3:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.F(i16, unsafe.getLong(obj, j8));
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 4:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.p(i16, unsafe.getInt(obj, j8));
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 5:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.D(i16, unsafe.getLong(obj, j8));
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 6:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.e(i16, unsafe.getInt(obj, j8));
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 7:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.f(i16, AbstractC1989z2.B(obj, j8));
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 8:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        x(i16, unsafe.getObject(obj, j8), i8);
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 9:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.I(i16, unsafe.getObject(obj, j8), p8.K(i13));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 10:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.J(i16, (J0) unsafe.getObject(obj, j8));
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 11:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.c(i16, unsafe.getInt(obj, j8));
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 12:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.n(i16, unsafe.getInt(obj, j8));
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.y(i16, unsafe.getInt(obj, j8));
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.m(i16, unsafe.getLong(obj, j8));
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.C(i16, unsafe.getInt(obj, j8));
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 16:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.s(i16, unsafe.getLong(obj, j8));
                    }
                    p8 = this;
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                    if (p8.s(obj, i13, i10, i11, i12)) {
                        i8.K(i16, unsafe.getObject(obj, j8), p8.K(i13));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 18:
                    AbstractC1900h2.w(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 19:
                    AbstractC1900h2.A(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 20:
                    AbstractC1900h2.C(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 21:
                    AbstractC1900h2.d(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case Messages.ClientMessage.PREVIOUSPAGE_FIELD_NUMBER /* 22 */:
                    AbstractC1900h2.B(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case Messages.ClientMessage.PAGEBYINDEX_FIELD_NUMBER /* 23 */:
                    AbstractC1900h2.z(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 24:
                    AbstractC1900h2.y(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 25:
                    AbstractC1900h2.v(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 26:
                    int i19 = p8.f17999a[i13];
                    List list = (List) unsafe.getObject(obj, j8);
                    AbstractC1954s2 abstractC1954s2 = AbstractC1900h2.f18578a;
                    if (list != null && !list.isEmpty()) {
                        i8.E(i19, list);
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 27:
                    int i20 = p8.f17999a[i13];
                    List list2 = (List) unsafe.getObject(obj, j8);
                    InterfaceC1890f2 interfaceC1890f2K = p8.K(i13);
                    AbstractC1954s2 abstractC1954s3 = AbstractC1900h2.f18578a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i21 = 0; i21 < list2.size(); i21++) {
                            ((S0) i8).I(i20, list2.get(i21), interfaceC1890f2K);
                        }
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 28:
                    int i22 = p8.f17999a[i13];
                    List list3 = (List) unsafe.getObject(obj, j8);
                    AbstractC1954s2 abstractC1954s4 = AbstractC1900h2.f18578a;
                    if (list3 != null && !list3.isEmpty()) {
                        i8.a(i22, list3);
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 29:
                    AbstractC1900h2.c(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 30:
                    AbstractC1900h2.x(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 31:
                    AbstractC1900h2.D(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 32:
                    AbstractC1900h2.E(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 33:
                    AbstractC1900h2.a(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 34:
                    AbstractC1900h2.b(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, false);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 35:
                    AbstractC1900h2.w(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, i9);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 36:
                    AbstractC1900h2.A(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, i9);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 37:
                    AbstractC1900h2.C(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, i9);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 38:
                    AbstractC1900h2.d(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, i9);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 39:
                    AbstractC1900h2.B(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, i9);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case Messages.ServerMessage.ICON_FIELD_NUMBER /* 40 */:
                    AbstractC1900h2.z(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, i9);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 41:
                    AbstractC1900h2.y(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, i9);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 42:
                    AbstractC1900h2.v(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, i9);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 43:
                    AbstractC1900h2.c(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, i9);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 44:
                    AbstractC1900h2.x(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, i9);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 45:
                    AbstractC1900h2.D(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, i9);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 46:
                    AbstractC1900h2.E(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, i9);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 47:
                    AbstractC1900h2.a(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, i9);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 48:
                    AbstractC1900h2.b(p8.f17999a[i13], (List) unsafe.getObject(obj, j8), i8, i9);
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 49:
                    int i23 = p8.f17999a[i13];
                    List list4 = (List) unsafe.getObject(obj, j8);
                    InterfaceC1890f2 interfaceC1890f2K2 = p8.K(i13);
                    AbstractC1954s2 abstractC1954s5 = AbstractC1900h2.f18578a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i24 = 0; i24 < list4.size(); i24++) {
                            ((S0) i8).K(i23, list4.get(i24), interfaceC1890f2K2);
                        }
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j8) != null) {
                        p063h.s.a(p8.L(i13));
                        throw null;
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 51:
                    if (p8.v(obj, i16, i13)) {
                        i8.r(i16, B(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 52:
                    if (p8.v(obj, i16, i13)) {
                        i8.v(i16, C(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 53:
                    if (p8.v(obj, i16, i13)) {
                        i8.g(i16, I(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 54:
                    if (p8.v(obj, i16, i13)) {
                        i8.F(i16, I(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 55:
                    if (p8.v(obj, i16, i13)) {
                        i8.p(i16, D(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 56:
                    if (p8.v(obj, i16, i13)) {
                        i8.D(i16, I(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 57:
                    if (p8.v(obj, i16, i13)) {
                        i8.e(i16, D(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 58:
                    if (p8.v(obj, i16, i13)) {
                        i8.f(i16, w(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 59:
                    if (p8.v(obj, i16, i13)) {
                        x(i16, unsafe.getObject(obj, j8), i8);
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 60:
                    if (p8.v(obj, i16, i13)) {
                        i8.I(i16, unsafe.getObject(obj, j8), p8.K(i13));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 61:
                    if (p8.v(obj, i16, i13)) {
                        i8.J(i16, (J0) unsafe.getObject(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 62:
                    if (p8.v(obj, i16, i13)) {
                        i8.c(i16, D(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 63:
                    if (p8.v(obj, i16, i13)) {
                        i8.n(i16, D(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 64:
                    if (p8.v(obj, i16, i13)) {
                        i8.y(i16, D(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 65:
                    if (p8.v(obj, i16, i13)) {
                        i8.m(i16, I(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 66:
                    if (p8.v(obj, i16, i13)) {
                        i8.C(i16, D(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 67:
                    if (p8.v(obj, i16, i13)) {
                        i8.s(i16, I(obj, j8));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                case 68:
                    if (p8.v(obj, i16, i13)) {
                        i8.K(i16, unsafe.getObject(obj, j8), p8.K(i13));
                    }
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
                default:
                    i13 += 3;
                    i15 = i11;
                    i14 = i10;
                    entry = entry;
                    break;
            }
        }
        while (entry != null) {
            p8.f18009k.b(i8, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((AbstractC1914k1) obj).zzc.l(i8);
    }

    public final void k(Object obj, Object obj2, int i8) {
        if (r(obj2, i8)) {
            int iH = H(i8) & 1048575;
            Unsafe unsafe = f17998m;
            long j8 = iH;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f17999a[i8] + " is present but null: " + obj2.toString());
            }
            InterfaceC1890f2 interfaceC1890f2K = K(i8);
            if (!r(obj, i8)) {
                if (u(object)) {
                    Object objF = interfaceC1890f2K.f();
                    interfaceC1890f2K.e(objF, object);
                    unsafe.putObject(obj, j8, objF);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                m(obj, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!u(object2)) {
                Object objF2 = interfaceC1890f2K.f();
                interfaceC1890f2K.e(objF2, object2);
                unsafe.putObject(obj, j8, objF2);
                object2 = objF2;
            }
            interfaceC1890f2K.e(object2, object);
        }
    }

    public final void l(Object obj, Object obj2, int i8) {
        int i9 = this.f17999a[i8];
        if (v(obj2, i9, i8)) {
            int iH = H(i8) & 1048575;
            Unsafe unsafe = f17998m;
            long j8 = iH;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f17999a[i8] + " is present but null: " + obj2.toString());
            }
            InterfaceC1890f2 interfaceC1890f2K = K(i8);
            if (!v(obj, i9, i8)) {
                if (u(object)) {
                    Object objF = interfaceC1890f2K.f();
                    interfaceC1890f2K.e(objF, object);
                    unsafe.putObject(obj, j8, objF);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                n(obj, i9, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!u(object2)) {
                Object objF2 = interfaceC1890f2K.f();
                interfaceC1890f2K.e(objF2, object2);
                unsafe.putObject(obj, j8, objF2);
                object2 = objF2;
            }
            interfaceC1890f2K.e(object2, object);
        }
    }

    public final void m(Object obj, int i8) {
        int iE = E(i8);
        long j8 = 1048575 & iE;
        if (j8 == 1048575) {
            return;
        }
        AbstractC1989z2.v(obj, j8, (1 << (iE >>> 20)) | AbstractC1989z2.h(obj, j8));
    }

    public final void n(Object obj, int i8, int i9) {
        AbstractC1989z2.v(obj, E(i9) & 1048575, i8);
    }

    public final void o(Object obj, int i8, Object obj2) {
        f17998m.putObject(obj, H(i8) & 1048575, obj2);
        m(obj, i8);
    }

    public final void p(Object obj, int i8, int i9, Object obj2) {
        f17998m.putObject(obj, H(i9) & 1048575, obj2);
        n(obj, i8, i9);
    }

    public final boolean q(Object obj, Object obj2, int i8) {
        return r(obj, i8) == r(obj2, i8);
    }

    public final boolean r(Object obj, int i8) {
        int iE = E(i8);
        long j8 = iE & 1048575;
        if (j8 != 1048575) {
            return (AbstractC1989z2.h(obj, j8) & (1 << (iE >>> 20))) != 0;
        }
        int iH = H(i8);
        long j9 = iH & 1048575;
        switch (G(iH)) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC1989z2.f(obj, j9)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC1989z2.g(obj, j9)) != 0;
            case 2:
                return AbstractC1989z2.i(obj, j9) != 0;
            case 3:
                return AbstractC1989z2.i(obj, j9) != 0;
            case 4:
                return AbstractC1989z2.h(obj, j9) != 0;
            case 5:
                return AbstractC1989z2.i(obj, j9) != 0;
            case 6:
                return AbstractC1989z2.h(obj, j9) != 0;
            case 7:
                return AbstractC1989z2.B(obj, j9);
            case 8:
                Object objK = AbstractC1989z2.k(obj, j9);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof J0) {
                    return !J0.f17985b.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC1989z2.k(obj, j9) != null;
            case 10:
                return !J0.f17985b.equals(AbstractC1989z2.k(obj, j9));
            case 11:
                return AbstractC1989z2.h(obj, j9) != 0;
            case 12:
                return AbstractC1989z2.h(obj, j9) != 0;
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                return AbstractC1989z2.h(obj, j9) != 0;
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                return AbstractC1989z2.i(obj, j9) != 0;
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                return AbstractC1989z2.h(obj, j9) != 0;
            case 16:
                return AbstractC1989z2.i(obj, j9) != 0;
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                return AbstractC1989z2.k(obj, j9) != null;
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
        return AbstractC1989z2.h(obj, (long) (E(i9) & 1048575)) == i8;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 37941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int y(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.mlkit_vision_barcode_bundled.C1982y0 r39) {
        /*
            Method dump skipped, instruction units count: 3794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.P1.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.y0):int");
    }
}
