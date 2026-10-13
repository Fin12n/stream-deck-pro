package s7;

import M6.eLZq.eGwOBWCdOTaKus;

/* JADX INFO: renamed from: s7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2895b {
    public static final byte a(char c8) {
        if (c8 < '~') {
            return C2905l.f33291c[c8];
        }
        return (byte) 0;
    }

    public static final char b(int i8) {
        if (i8 < 117) {
            return C2905l.f33290b[i8];
        }
        return (char) 0;
    }

    public static final String c(byte b8) {
        if (b8 == 1) {
            return "quotation mark '\"'";
        }
        if (b8 == 2) {
            return eGwOBWCdOTaKus.rZoYK;
        }
        if (b8 == 4) {
            return "comma ','";
        }
        if (b8 == 5) {
            return "colon ':'";
        }
        if (b8 == 6) {
            return "start of the object '{'";
        }
        if (b8 == 7) {
            return "end of the object '}'";
        }
        if (b8 == 8) {
            return "start of the array '['";
        }
        if (b8 == 9) {
            return "end of the array ']'";
        }
        if (b8 == 10) {
            return "end of the input";
        }
        return b8 == 127 ? "invalid token" : "valid token";
    }
}
