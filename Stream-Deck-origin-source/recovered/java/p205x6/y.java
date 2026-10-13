package p205x6;

import Z6.c;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.t;
import p197w6.a;
import p197w6.b;
import p213y6.f;
import p213y6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y {
    public static final Void a(int i8) throws EOFException {
        throw new EOFException("Premature end of stream: expected " + i8 + " bytes");
    }

    public static final byte[] b(k kVar, int i8) {
        t.g(kVar, "<this>");
        if (i8 == 0) {
            return g.f38455a;
        }
        byte[] bArr = new byte[i8];
        o.b(kVar, bArr, 0, i8);
        return bArr;
    }

    public static /* synthetic */ byte[] c(k kVar, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            long jO1 = kVar.o1();
            if (jO1 > 2147483647L) {
                throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
            }
            i8 = (int) jO1;
        }
        return b(kVar, i8);
    }

    public static final String d(n nVar, Charset charset, int i8) {
        t.g(nVar, "<this>");
        t.g(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        t.f(charsetDecoderNewDecoder, "charset.newDecoder()");
        return b.a(charsetDecoderNewDecoder, nVar, i8);
    }

    public static /* synthetic */ String e(n nVar, Charset charset, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            charset = c.f12941b;
        }
        if ((i9 & 2) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        return d(nVar, charset, i8);
    }

    public static final String f(n nVar, int i8, Charset charset) {
        t.g(nVar, "<this>");
        t.g(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        t.f(charsetDecoderNewDecoder, "charset.newDecoder()");
        return a.b(charsetDecoderNewDecoder, nVar, i8);
    }

    public static /* synthetic */ String g(n nVar, int i8, Charset charset, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            charset = c.f12941b;
        }
        return f(nVar, i8, charset);
    }

    public static final void h(s sVar, CharSequence text, int i8, int i9, Charset charset) {
        t.g(sVar, "<this>");
        t.g(text, "text");
        t.g(charset, "charset");
        if (charset == c.f12941b) {
            j(sVar, text, i8, i9);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        t.f(charsetEncoderNewEncoder, "charset.newEncoder()");
        b.f(charsetEncoderNewEncoder, sVar, text, i8, i9);
    }

    public static /* synthetic */ void i(s sVar, CharSequence charSequence, int i8, int i9, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = charSequence.length();
        }
        if ((i10 & 8) != 0) {
            charset = c.f12941b;
        }
        h(sVar, charSequence, i8, i9, charset);
    }

    public static final void j(s sVar, CharSequence charSequence, int i8, int i9) {
        int i10;
        p213y6.a aVarD = g.d(sVar, 1, null);
        int i11 = i8;
        while (true) {
            try {
                CharSequence charSequence2 = charSequence;
                int i12 = i9;
                int iC = f.c(aVarD.h(), charSequence2, i11, i12, aVarD.k(), aVarD.g());
                int iA = p213y6.c.a(iC) & 65535;
                i11 += iA;
                aVarD.a(p213y6.c.b(iC) & 65535);
                if (iA != 0 || i11 >= i12) {
                    i10 = i11 < i12 ? 1 : 0;
                } else {
                    i10 = 8;
                }
                if (i10 <= 0) {
                    sVar.c();
                    return;
                } else {
                    aVarD = g.d(sVar, i10, aVarD);
                    charSequence = charSequence2;
                    i9 = i12;
                }
            } catch (Throwable th) {
                sVar.c();
                throw th;
            }
        }
    }
}
