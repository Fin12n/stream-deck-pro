package K7;

import C6.G;
import J7.C1034e;
import J7.h;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f4729a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int c(byte[] bArr, int i8) {
        byte b8;
        int i9;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            byte b9 = bArr[i10];
            if (b9 >= 0) {
                int i13 = i12 + 1;
                if (i12 == i8) {
                    break;
                }
                if ((b9 != 10 && b9 != 13 && ((b9 >= 0 && b9 < 32) || (127 <= b9 && b9 < 160))) || b9 == 65533) {
                    return -1;
                }
                i11 += b9 < 65536 ? 1 : 2;
                i10++;
                while (true) {
                    i12 = i13;
                    if (i10 >= length || (b8 = bArr[i10]) < 0) {
                        break;
                    }
                    i10++;
                    i13 = i12 + 1;
                    if (i12 == i8) {
                        return i11;
                    }
                    if ((b8 != 10 && b8 != 13 && ((b8 >= 0 && b8 < 32) || (127 <= b8 && b8 < 160))) || b8 == 65533) {
                        return -1;
                    }
                    i11 += b8 < 65536 ? 1 : 2;
                }
            } else if ((b9 >> 5) == -2) {
                int i14 = i10 + 1;
                if (length <= i14) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                byte b10 = bArr[i14];
                if ((b10 & 192) != 128) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                int i15 = (b9 << 6) ^ (b10 ^ 3968);
                if (i15 < 128) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                int i16 = i12 + 1;
                if (i12 == i8) {
                    break;
                }
                if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                    return -1;
                }
                i11 += i15 < 65536 ? 1 : 2;
                G g8 = G.f1419a;
                i10 += 2;
                i12 = i16;
            } else if ((b9 >> 4) == -2) {
                int i17 = i10 + 2;
                if (length <= i17) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                byte b11 = bArr[i10 + 1];
                if ((b11 & 192) != 128) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                byte b12 = bArr[i17];
                if ((b12 & 192) != 128) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                int i18 = (b9 << 12) ^ ((b12 ^ (-123008)) ^ (b11 << 6));
                if (i18 < 2048) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i18 && i18 < 57344) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                i9 = i12 + 1;
                if (i12 == i8) {
                    break;
                }
                if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                    return -1;
                }
                i11 += i18 < 65536 ? 1 : 2;
                G g9 = G.f1419a;
                i10 += 3;
                i12 = i9;
            } else {
                if ((b9 >> 3) != -2) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                int i19 = i10 + 3;
                if (length <= i19) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                byte b13 = bArr[i10 + 1];
                if ((b13 & 192) != 128) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                byte b14 = bArr[i10 + 2];
                if ((b14 & 192) != 128) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                byte b15 = bArr[i19];
                if ((b15 & 192) != 128) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                int i20 = (b9 << 18) ^ (((b15 ^ 3678080) ^ (b14 << 6)) ^ (b13 << 12));
                if (i20 > 1114111) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i20 && i20 < 57344) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                if (i20 < 65536) {
                    if (i12 == i8) {
                        break;
                    }
                    return -1;
                }
                i9 = i12 + 1;
                if (i12 == i8) {
                    break;
                }
                if ((i20 != 10 && i20 != 13 && ((i20 >= 0 && i20 < 32) || (127 <= i20 && i20 < 160))) || i20 == 65533) {
                    return -1;
                }
                i11 += i20 < 65536 ? 1 : 2;
                G g10 = G.f1419a;
                i10 += 4;
                i12 = i9;
            }
        }
        return i11;
    }

    public static final void d(h hVar, C1034e buffer, int i8, int i9) {
        t.g(hVar, "<this>");
        t.g(buffer, "buffer");
        buffer.write(hVar.j(), i8, i9);
    }

    public static final int e(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - '0';
        }
        if ('a' <= c8 && c8 < 'g') {
            return c8 - 'W';
        }
        if ('A' <= c8 && c8 < 'G') {
            return c8 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c8);
    }

    public static final char[] f() {
        return f4729a;
    }
}
