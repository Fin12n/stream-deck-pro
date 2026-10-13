package io.sentry.vendor;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: io.sentry.vendor.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class AbstractC0606a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f27753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27754b;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b extends AbstractC0606a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final byte[] f27755j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final byte[] f27756k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f27757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f27758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f27759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f27760f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f27761g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f27762h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final byte[] f27763i;

        public b(int i8, byte[] bArr) {
            this.f27753a = bArr;
            this.f27760f = (i8 & 1) == 0;
            boolean z8 = (i8 & 2) == 0;
            this.f27761g = z8;
            this.f27762h = (i8 & 4) != 0;
            this.f27763i = (i8 & 8) == 0 ? f27755j : f27756k;
            this.f27757c = new byte[2];
            this.f27758d = 0;
            this.f27759e = z8 ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        public boolean a(byte[] bArr, int i8, int i9, boolean z8) {
            int i10;
            int i11;
            int i12;
            int i13;
            byte b8;
            byte b9;
            byte b10;
            int i14;
            int i15;
            byte[] bArr2 = this.f27763i;
            byte[] bArr3 = this.f27753a;
            int i16 = this.f27759e;
            int i17 = i9 + i8;
            int i18 = this.f27758d;
            char c8 = 2;
            int i19 = 0;
            if (i18 != 1) {
                if (i18 == 2 && (i15 = i8 + 1) <= i17) {
                    byte[] bArr4 = this.f27757c;
                    i11 = ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16) | (bArr[i8] & 255);
                    this.f27758d = 0;
                    i10 = i15;
                } else {
                    i10 = i8;
                    i11 = -1;
                }
            } else if (i8 + 2 <= i17) {
                i10 = i8 + 2;
                i11 = (bArr[i8 + 1] & 255) | ((this.f27757c[0] & 255) << 16) | ((bArr[i8] & 255) << 8);
                this.f27758d = 0;
            } else {
                i10 = i8;
                i11 = -1;
            }
            if (i11 != -1) {
                bArr3[0] = bArr2[(i11 >> 18) & 63];
                bArr3[1] = bArr2[(i11 >> 12) & 63];
                bArr3[2] = bArr2[(i11 >> 6) & 63];
                bArr3[3] = bArr2[i11 & 63];
                i16--;
                if (i16 == 0) {
                    if (this.f27762h) {
                        bArr3[4] = 13;
                        i14 = 5;
                    } else {
                        i14 = 4;
                    }
                    i12 = i14 + 1;
                    bArr3[i14] = 10;
                    i16 = 19;
                } else {
                    i12 = 4;
                }
            } else {
                i12 = 0;
            }
            while (true) {
                i10 += 3;
                if (i10 > i17) {
                    break;
                }
                c8 = c8;
                int i20 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16) | (bArr[i10 + 2] & 255);
                bArr3[i12] = bArr2[(i20 >> 18) & 63];
                bArr3[i12 + 1] = bArr2[(i20 >> 12) & 63];
                bArr3[i12 + 2] = bArr2[(i20 >> 6) & 63];
                bArr3[i12 + 3] = bArr2[i20 & 63];
                int i21 = i12 + 4;
                i16--;
                if (i16 == 0) {
                    if (this.f27762h) {
                        bArr3[i21] = 13;
                        i21 = i12 + 5;
                    }
                    i12 = i21 + 1;
                    bArr3[i21] = 10;
                    i16 = 19;
                } else {
                    i12 = i21;
                }
            }
            if (z8) {
                int i22 = this.f27758d;
                if (i10 - i22 == i17 - 1) {
                    if (i22 > 0) {
                        b10 = this.f27757c[0];
                        i19 = 1;
                    } else {
                        b10 = bArr[i10];
                    }
                    int i23 = (b10 & 255) << 4;
                    this.f27758d = i22 - i19;
                    bArr3[i12] = bArr2[(i23 >> 6) & 63];
                    int i24 = i12 + 2;
                    bArr3[i12 + 1] = bArr2[i23 & 63];
                    if (this.f27760f) {
                        bArr3[i24] = 61;
                        i24 = i12 + 4;
                        bArr3[i12 + 3] = 61;
                    }
                    if (this.f27761g) {
                        if (this.f27762h) {
                            bArr3[i24] = 13;
                            i24++;
                        }
                        i13 = i24 + 1;
                        bArr3[i24] = 10;
                        i12 = i13;
                    } else {
                        i12 = i24;
                    }
                } else if (i10 - i22 == i17 - 2) {
                    if (i22 > 1) {
                        b8 = this.f27757c[0];
                        i19 = 1;
                    } else {
                        byte b11 = bArr[i10];
                        i10++;
                        b8 = b11;
                    }
                    int i25 = (b8 & 255) << 10;
                    if (i22 > 0) {
                        b9 = this.f27757c[i19];
                        i19++;
                    } else {
                        b9 = bArr[i10];
                    }
                    int i26 = i25 | ((b9 & 255) << 2);
                    this.f27758d = i22 - i19;
                    bArr3[i12] = bArr2[(i26 >> 12) & 63];
                    bArr3[i12 + 1] = bArr2[(i26 >> 6) & 63];
                    int i27 = i12 + 3;
                    bArr3[i12 + 2] = bArr2[i26 & 63];
                    if (this.f27760f) {
                        bArr3[i27] = 61;
                        i27 = i12 + 4;
                    }
                    if (this.f27761g) {
                        if (this.f27762h) {
                            bArr3[i27] = 13;
                            i27++;
                        }
                        i13 = i27 + 1;
                        bArr3[i27] = 10;
                        i12 = i13;
                    } else {
                        i12 = i27;
                    }
                } else if (this.f27761g && i12 > 0 && i16 != 19) {
                    if (this.f27762h) {
                        bArr3[i12] = 13;
                        i12++;
                    }
                    i13 = i12 + 1;
                    bArr3[i12] = 10;
                    i12 = i13;
                }
            } else if (i10 == i17 - 1) {
                byte[] bArr5 = this.f27757c;
                int i28 = this.f27758d;
                this.f27758d = i28 + 1;
                bArr5[i28] = bArr[i10];
            } else if (i10 == i17 - 2) {
                byte[] bArr6 = this.f27757c;
                int i29 = this.f27758d;
                int i30 = i29 + 1;
                this.f27758d = i30;
                bArr6[i29] = bArr[i10];
                this.f27758d = i29 + 2;
                bArr6[i30] = bArr[i10 + 1];
            }
            this.f27754b = i12;
            this.f27759e = i16;
            return true;
        }
    }

    public static byte[] a(byte[] bArr, int i8) {
        return b(bArr, 0, bArr.length, i8);
    }

    public static byte[] b(byte[] bArr, int i8, int i9, int i10) {
        b bVar = new b(i10, null);
        int i11 = (i9 / 3) * 4;
        if (!bVar.f27760f) {
            int i12 = i9 % 3;
            if (i12 == 1) {
                i11 += 2;
            } else if (i12 == 2) {
                i11 += 3;
            }
        } else if (i9 % 3 > 0) {
            i11 += 4;
        }
        if (bVar.f27761g && i9 > 0) {
            i11 += (((i9 - 1) / 57) + 1) * (bVar.f27762h ? 2 : 1);
        }
        bVar.f27753a = new byte[i11];
        bVar.a(bArr, i8, i9, true);
        return bVar.f27753a;
    }

    public static String c(byte[] bArr, int i8) {
        try {
            return new String(a(bArr, i8), "US-ASCII");
        } catch (UnsupportedEncodingException e8) {
            throw new AssertionError(e8);
        }
    }
}
