package p213y6;

import C6.C0920i;
import C6.D;
import I6.d;
import W6.n;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f38445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f38446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f38447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f38448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f38449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f38450f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f38451g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f38452h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f38453i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f38454j;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f38453i = obj;
            this.f38454j |= Integer.MIN_VALUE;
            return f.b(null, 0, null, null, this);
        }
    }

    public static final int a(char c8, char c9) {
        return ((c8 - 55232) << 10) | (c9 - 56320);
    }

    /* JADX WARN: Code duplicated, block: B:248:0x01c4 A[EDGE_INSN: B:248:0x01c4->B:79:0x01c4 BREAK  A[LOOP:2: B:74:0x01aa->B:78:0x01b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ad A[Catch: all -> 0x0164, TryCatch #1 {all -> 0x0164, blocks: (B:58:0x015c, B:157:0x0328, B:159:0x032e, B:160:0x0331, B:164:0x033e, B:163:0x0337, B:155:0x030d, B:63:0x0167, B:65:0x016d, B:67:0x017a, B:68:0x0191, B:69:0x0192, B:70:0x019c, B:71:0x019d, B:73:0x01a5, B:76:0x01ad, B:78:0x01b3, B:79:0x01c4, B:81:0x01d4, B:82:0x01dc, B:84:0x01ed, B:86:0x01f5, B:92:0x0201, B:102:0x0220, B:93:0x0204, B:148:0x02cf, B:98:0x0215, B:99:0x021a, B:101:0x021e, B:103:0x022b, B:105:0x022f, B:147:0x02c9, B:107:0x0238, B:108:0x024f, B:109:0x0250, B:111:0x025a, B:117:0x026a, B:143:0x02b6, B:118:0x026d, B:129:0x028f, B:135:0x029f, B:136:0x02a2, B:139:0x02ab, B:140:0x02b0, B:142:0x02b4, B:144:0x02c1, B:146:0x02c5, B:149:0x02d2, B:150:0x02e9, B:121:0x0276, B:122:0x027b, B:124:0x027f, B:126:0x0283, B:128:0x0287, B:151:0x02ea, B:152:0x0301, B:153:0x0302, B:154:0x030c, B:156:0x031b), top: B:212:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b3 A[Catch: all -> 0x0164, LOOP:2: B:74:0x01aa->B:78:0x01b3, LOOP_END, TryCatch #1 {all -> 0x0164, blocks: (B:58:0x015c, B:157:0x0328, B:159:0x032e, B:160:0x0331, B:164:0x033e, B:163:0x0337, B:155:0x030d, B:63:0x0167, B:65:0x016d, B:67:0x017a, B:68:0x0191, B:69:0x0192, B:70:0x019c, B:71:0x019d, B:73:0x01a5, B:76:0x01ad, B:78:0x01b3, B:79:0x01c4, B:81:0x01d4, B:82:0x01dc, B:84:0x01ed, B:86:0x01f5, B:92:0x0201, B:102:0x0220, B:93:0x0204, B:148:0x02cf, B:98:0x0215, B:99:0x021a, B:101:0x021e, B:103:0x022b, B:105:0x022f, B:147:0x02c9, B:107:0x0238, B:108:0x024f, B:109:0x0250, B:111:0x025a, B:117:0x026a, B:143:0x02b6, B:118:0x026d, B:129:0x028f, B:135:0x029f, B:136:0x02a2, B:139:0x02ab, B:140:0x02b0, B:142:0x02b4, B:144:0x02c1, B:146:0x02c5, B:149:0x02d2, B:150:0x02e9, B:121:0x0276, B:122:0x027b, B:124:0x027f, B:126:0x0283, B:128:0x0287, B:151:0x02ea, B:152:0x0301, B:153:0x0302, B:154:0x030c, B:156:0x031b), top: B:212:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00aa -> B:23:0x00af). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(java.lang.Appendable r28, int r29, Q6.o r30, Q6.k r31, G6.d r32) {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p213y6.f.b(java.lang.Appendable, int, Q6.o, Q6.k, G6.d):java.lang.Object");
    }

    public static final int c(ByteBuffer encodeUTF8, CharSequence text, int i8, int i9, int i10, int i11) {
        t.g(encodeUTF8, "$this$encodeUTF8");
        t.g(text, "text");
        int iMin = Math.min(i9, i8 + 65535);
        int iG = n.g(i11, 65535);
        int i12 = i8;
        int i13 = i10;
        while (i13 < iG && i12 < iMin) {
            int i14 = i12 + 1;
            char cCharAt = text.charAt(i12);
            int i15 = cCharAt & 65535;
            if ((cCharAt & 65408) != 0) {
                return d(encodeUTF8, text, i12, iMin, i8, i13, iG, i10);
            }
            encodeUTF8.put(i13, (byte) i15);
            i12 = i14;
            i13++;
        }
        return c.d(D.b((short) (i12 - i8)), D.b((short) (i13 - i10)));
    }

    public static final int d(ByteBuffer byteBuffer, CharSequence charSequence, int i8, int i9, int i10, int i11, int i12, int i13) {
        int iA;
        int i14;
        int i15 = i12 - 3;
        while (i15 - i11 > 0 && i8 < i9) {
            int i16 = i8 + 1;
            char cCharAt = charSequence.charAt(i8);
            if (!Character.isHighSurrogate(cCharAt)) {
                i8 = i16;
                iA = cCharAt;
            } else if (i16 == i9 || !Character.isLowSurrogate(charSequence.charAt(i16))) {
                i8 = i16;
                iA = 63;
            } else {
                i8 += 2;
                iA = a(cCharAt, charSequence.charAt(i16));
            }
            if (iA >= 0 && iA < 128) {
                byteBuffer.put(i11, (byte) iA);
                i14 = 1;
            } else if (128 <= iA && iA < 2048) {
                byteBuffer.put(i11, (byte) (((iA >> 6) & 31) | 192));
                byteBuffer.put(i11 + 1, (byte) (128 | (iA & 63)));
                i14 = 2;
            } else if (2048 <= iA && iA < 65536) {
                byteBuffer.put(i11, (byte) (((iA >> 12) & 15) | 224));
                byteBuffer.put(i11 + 1, (byte) ((63 & (iA >> 6)) | 128));
                byteBuffer.put(i11 + 2, (byte) (128 | (iA & 63)));
                i14 = 3;
            } else {
                if (65536 > iA || iA >= 1114112) {
                    k(iA);
                    throw new C0920i();
                }
                byteBuffer.put(i11, (byte) (((iA >> 18) & 7) | 240));
                byteBuffer.put(i11 + 1, (byte) (((iA >> 12) & 63) | 128));
                byteBuffer.put(i11 + 2, (byte) ((63 & (iA >> 6)) | 128));
                byteBuffer.put(i11 + 3, (byte) (128 | (iA & 63)));
                i14 = 4;
            }
            i11 += i14;
        }
        return i11 == i15 ? e(byteBuffer, charSequence, i8, i9, i10, i11, i12, i13) : c.d(D.b((short) (i8 - i10)), D.b((short) (i11 - i13)));
    }

    public static final int e(ByteBuffer byteBuffer, CharSequence charSequence, int i8, int i9, int i10, int i11, int i12, int i13) {
        int iA;
        int i14;
        int i15;
        int i16 = i8;
        int i17 = i11;
        while (true) {
            int i18 = i12 - i17;
            if (i18 <= 0 || i16 >= i9) {
                break;
            }
            int i19 = i16 + 1;
            char cCharAt = charSequence.charAt(i16);
            if (!Character.isHighSurrogate(cCharAt)) {
                i16 = i19;
                iA = cCharAt;
            } else if (i19 == i9 || !Character.isLowSurrogate(charSequence.charAt(i19))) {
                i16 = i19;
                iA = 63;
            } else {
                i16 += 2;
                iA = a(cCharAt, charSequence.charAt(i19));
            }
            if (1 <= iA && iA < 128) {
                i14 = 1;
            } else if (128 <= iA && iA < 2048) {
                i14 = 2;
            } else if (2048 <= iA && iA < 65536) {
                i14 = 3;
            } else {
                if (65536 > iA || iA >= 1114112) {
                    k(iA);
                    throw new C0920i();
                }
                i14 = 4;
            }
            if (i14 > i18) {
                i16--;
                break;
            }
            if (iA >= 0 && iA < 128) {
                byteBuffer.put(i17, (byte) iA);
                i15 = 1;
            } else if (128 <= iA && iA < 2048) {
                byteBuffer.put(i17, (byte) (((iA >> 6) & 31) | 192));
                byteBuffer.put(i17 + 1, (byte) ((iA & 63) | 128));
                i15 = 2;
            } else if (2048 <= iA && iA < 65536) {
                byteBuffer.put(i17, (byte) (((iA >> 12) & 15) | 224));
                byteBuffer.put(i17 + 1, (byte) (((iA >> 6) & 63) | 128));
                byteBuffer.put(i17 + 2, (byte) ((iA & 63) | 128));
                i15 = 3;
            } else {
                if (65536 > iA || iA >= 1114112) {
                    k(iA);
                    throw new C0920i();
                }
                byteBuffer.put(i17, (byte) (((iA >> 18) & 7) | 240));
                byteBuffer.put(i17 + 1, (byte) (((iA >> 12) & 63) | 128));
                byteBuffer.put(i17 + 2, (byte) (((iA >> 6) & 63) | 128));
                byteBuffer.put(i17 + 3, (byte) ((iA & 63) | 128));
                i15 = 4;
            }
            i17 += i15;
        }
        return c.d(D.b((short) (i16 - i10)), D.b((short) (i17 - i13)));
    }

    public static final int f(int i8) {
        return (i8 >>> 10) + 55232;
    }

    public static final boolean g(int i8) {
        return (i8 >>> 16) == 0;
    }

    public static final boolean h(int i8) {
        return i8 <= 1114111;
    }

    public static final int i(int i8) {
        return (i8 & 1023) + 56320;
    }

    public static final Void j(int i8) throws d {
        throw new d("Expected " + i8 + " more character bytes");
    }

    public static final Void k(int i8) {
        throw new IllegalArgumentException("Malformed code-point " + i8 + " found");
    }

    public static final Void l(int i8) throws EOFException {
        throw new EOFException("Premature end of stream: expected " + i8 + " bytes to decode UTF-8 char");
    }
}
