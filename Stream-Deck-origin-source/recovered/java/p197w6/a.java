package p197w6;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import kotlin.jvm.internal.t;
import p189v6.c;
import p205x6.n;
import p213y6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CharBuffer f37134a = CharBuffer.allocate(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f37135b;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        t.d(byteBufferAllocate);
        f37135b = byteBufferAllocate;
    }

    public static final int a(CharsetDecoder charsetDecoder, n input, Appendable dst, int i8) {
        CoderResult cr;
        p213y6.a aVarC;
        t.g(charsetDecoder, "<this>");
        t.g(input, "input");
        t.g(dst, "dst");
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        boolean z8 = true;
        p213y6.a aVarB = g.b(input, 1);
        int iRemaining = 0;
        if (aVarB != null) {
            int i9 = 1;
            int i10 = 1;
            int iRemaining2 = 0;
            while (true) {
                try {
                    int iK = aVarB.k() - aVarB.i();
                    if (iK >= i9) {
                        int i11 = i8 - iRemaining2;
                        if (i11 == 0) {
                            i9 = 0;
                        } else {
                            try {
                                ByteBuffer byteBufferH = aVarB.h();
                                int i12 = aVarB.i();
                                int iK2 = aVarB.k() - i12;
                                ByteBuffer byteBufferE = c.e(byteBufferH, i12, iK2);
                                charBufferAllocate.clear();
                                if (i11 < 8192) {
                                    charBufferAllocate.limit(i11);
                                }
                                CoderResult rc = charsetDecoder.decode(byteBufferE, charBufferAllocate, false);
                                charBufferAllocate.flip();
                                iRemaining2 += charBufferAllocate.remaining();
                                dst.append(charBufferAllocate);
                                if (rc.isMalformed() || rc.isUnmappable()) {
                                    t.f(rc, "rc");
                                    j(rc);
                                }
                                i10 = (rc.isUnderflow() && byteBufferE.hasRemaining()) ? i10 + 1 : 1;
                                if (byteBufferE.limit() != iK2) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                aVarB.c(byteBufferE.position());
                                i9 = i10;
                            } catch (Throwable th) {
                                aVarB.k();
                                aVarB.i();
                                throw th;
                            }
                        }
                        iK = aVarB.k() - aVarB.i();
                    }
                    if (iK == 0) {
                        try {
                            aVarC = g.c(input, aVarB);
                        } catch (Throwable th2) {
                            th = th2;
                            z8 = false;
                            if (z8) {
                                g.a(input, aVarB);
                            }
                            throw th;
                        }
                    } else if (iK < i9 || aVarB.f() - aVarB.g() < 8) {
                        g.a(input, aVarB);
                        aVarC = g.b(input, i9);
                    } else {
                        aVarC = aVarB;
                    }
                    if (aVarC == null) {
                        break;
                    }
                    if (i9 <= 0) {
                        iRemaining = 1;
                        aVarB = aVarC;
                        break;
                    }
                    aVarB = aVarC;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (iRemaining != 0) {
                g.a(input, aVarB);
            }
            iRemaining = iRemaining2;
        }
        do {
            charBufferAllocate.clear();
            int i13 = i8 - iRemaining;
            if (i13 == 0) {
                break;
            }
            if (i13 < 8192) {
                charBufferAllocate.limit(i13);
            }
            cr = charsetDecoder.decode(f37135b, charBufferAllocate, true);
            charBufferAllocate.flip();
            iRemaining += charBufferAllocate.remaining();
            dst.append(charBufferAllocate);
            if (cr.isUnmappable() || cr.isMalformed()) {
                t.f(cr, "cr");
                j(cr);
            }
        } while (cr.isOverflow());
        return iRemaining;
    }

    public static final String b(CharsetDecoder charsetDecoder, n input, int i8) throws EOFException {
        t.g(charsetDecoder, "<this>");
        t.g(input, "input");
        if (i8 == 0) {
            return "";
        }
        if (input.a1() - input.i1() < i8) {
            return d(charsetDecoder, input, i8);
        }
        if (!input.g1().hasArray()) {
            return c(charsetDecoder, input, i8);
        }
        ByteBuffer byteBufferG1 = input.g1();
        byte[] bArrArray = byteBufferG1.array();
        t.f(bArrArray, "bb.array()");
        int iArrayOffset = byteBufferG1.arrayOffset() + byteBufferG1.position() + input.V0().i();
        Charset charset = charsetDecoder.charset();
        t.f(charset, "charset()");
        String str = new String(bArrArray, iArrayOffset, i8, charset);
        input.i0(i8);
        return str;
    }

    public static final String c(CharsetDecoder charsetDecoder, n nVar, int i8) throws CharacterCodingException, EOFException {
        CharBuffer charBufferAllocate = CharBuffer.allocate(i8);
        ByteBuffer byteBufferE = c.e(nVar.g1(), nVar.V0().i(), i8);
        CoderResult rc = charsetDecoder.decode(byteBufferE, charBufferAllocate, true);
        if (rc.isMalformed() || rc.isUnmappable()) {
            t.f(rc, "rc");
            j(rc);
        }
        charBufferAllocate.flip();
        nVar.i0(byteBufferE.position());
        String string = charBufferAllocate.toString();
        t.f(string, "cb.toString()");
        return string;
    }

    public static final String d(CharsetDecoder charsetDecoder, n nVar, int i8) throws Throwable {
        int iPosition;
        p213y6.a aVarC;
        CharBuffer charBufferAllocate = CharBuffer.allocate(i8);
        boolean z8 = true;
        p213y6.a aVarB = g.b(nVar, 1);
        boolean z9 = false;
        if (aVarB == null) {
            iPosition = i8;
        } else {
            iPosition = i8;
            int i9 = 1;
            int i10 = 1;
            boolean z10 = false;
            while (true) {
                try {
                    int iK = aVarB.k() - aVarB.i();
                    if (iK >= i9) {
                        try {
                            if (charBufferAllocate.hasRemaining() && iPosition != 0) {
                                ByteBuffer byteBufferH = aVarB.h();
                                int i11 = aVarB.i();
                                int iK2 = aVarB.k() - i11;
                                ByteBuffer byteBufferE = c.e(byteBufferH, i11, iK2);
                                int iLimit = byteBufferE.limit();
                                int iPosition2 = byteBufferE.position();
                                boolean z11 = iLimit - iPosition2 >= iPosition;
                                if (z11) {
                                    byteBufferE.limit(iPosition2 + iPosition);
                                }
                                CoderResult rc = charsetDecoder.decode(byteBufferE, charBufferAllocate, z11);
                                if (rc.isMalformed() || rc.isUnmappable()) {
                                    t.f(rc, "rc");
                                    j(rc);
                                }
                                i10 = (rc.isUnderflow() && byteBufferE.hasRemaining()) ? i10 + 1 : 1;
                                byteBufferE.limit(iLimit);
                                iPosition -= byteBufferE.position() - iPosition2;
                                if (byteBufferE.limit() != iK2) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                aVarB.c(byteBufferE.position());
                                i9 = i10;
                                z10 = z11;
                                th = th;
                                if (z8) {
                                    g.a(nVar, aVarB);
                                }
                                throw th;
                            }
                            i9 = 0;
                            iK = aVarB.k() - aVarB.i();
                        } catch (Throwable th) {
                            aVarB.k();
                            aVarB.i();
                            throw th;
                        }
                    }
                    if (iK == 0) {
                        try {
                            aVarC = g.c(nVar, aVarB);
                        } catch (Throwable th2) {
                            th = th2;
                            z8 = false;
                        }
                    } else if (iK < i9 || aVarB.f() - aVarB.g() < 8) {
                        g.a(nVar, aVarB);
                        aVarC = g.b(nVar, i9);
                    } else {
                        aVarC = aVarB;
                    }
                    if (aVarC == null) {
                        break;
                    }
                    if (i9 <= 0) {
                        z9 = true;
                        aVarB = aVarC;
                        break;
                    }
                    aVarB = aVarC;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (z9) {
                g.a(nVar, aVarB);
            }
            z9 = z10;
        }
        if (charBufferAllocate.hasRemaining() && !z9) {
            CoderResult rc2 = charsetDecoder.decode(f37135b, charBufferAllocate, true);
            if (rc2.isMalformed() || rc2.isUnmappable()) {
                t.f(rc2, "rc");
                j(rc2);
            }
        }
        if (iPosition <= 0) {
            if (iPosition < 0) {
                throw new AssertionError("remainingInputBytes < 0");
            }
            charBufferAllocate.flip();
            String string = charBufferAllocate.toString();
            t.f(string, "cb.toString()");
            return string;
        }
        throw new EOFException("Not enough bytes available: had only " + (i8 - iPosition) + " instead of " + i8);
    }

    public static final boolean e(CharsetEncoder charsetEncoder, p205x6.a dst) throws CharacterCodingException {
        t.g(charsetEncoder, "<this>");
        t.g(dst, "dst");
        ByteBuffer byteBufferH = dst.h();
        int iK = dst.k();
        int iG = dst.g() - iK;
        ByteBuffer byteBufferE = c.e(byteBufferH, iK, iG);
        CoderResult result = charsetEncoder.encode(f37134a, byteBufferE, true);
        if (result.isMalformed() || result.isUnmappable()) {
            t.f(result, "result");
            j(result);
        }
        boolean zIsUnderflow = result.isUnderflow();
        if (byteBufferE.limit() != iG) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        dst.a(byteBufferE.position());
        return zIsUnderflow;
    }

    public static final int f(CharsetEncoder charsetEncoder, CharSequence input, int i8, int i9, p205x6.a dst) throws CharacterCodingException {
        t.g(charsetEncoder, "<this>");
        t.g(input, "input");
        t.g(dst, "dst");
        CharBuffer charBufferWrap = CharBuffer.wrap(input, i8, i9);
        int iRemaining = charBufferWrap.remaining();
        ByteBuffer byteBufferH = dst.h();
        int iK = dst.k();
        int iG = dst.g() - iK;
        ByteBuffer byteBufferE = c.e(byteBufferH, iK, iG);
        CoderResult result = charsetEncoder.encode(charBufferWrap, byteBufferE, false);
        if (result.isMalformed() || result.isUnmappable()) {
            t.f(result, "result");
            j(result);
        }
        if (byteBufferE.limit() != iG) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        dst.a(byteBufferE.position());
        return iRemaining - charBufferWrap.remaining();
    }

    public static final byte[] g(CharsetEncoder charsetEncoder, CharSequence input, int i8, int i9) {
        t.g(charsetEncoder, "<this>");
        t.g(input, "input");
        if (!(input instanceof String)) {
            return h(charsetEncoder, input, i8, i9);
        }
        if (i8 == 0 && i9 == input.length()) {
            byte[] bytes = ((String) input).getBytes(charsetEncoder.charset());
            t.f(bytes, "input as java.lang.String).getBytes(charset())");
            return bytes;
        }
        String strSubstring = ((String) input).substring(i8, i9);
        t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        t.e(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
        t.f(bytes2, "input.substring(fromInde…ring).getBytes(charset())");
        return bytes2;
    }

    public static final byte[] h(CharsetEncoder charsetEncoder, CharSequence charSequence, int i8, int i9) throws CharacterCodingException {
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i8, i9));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static final String i(Charset charset) {
        t.g(charset, "<this>");
        String strName = charset.name();
        t.f(strName, "name()");
        return strName;
    }

    public static final void j(CoderResult coderResult) throws CharacterCodingException {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e8) {
            String message = e8.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new c(message);
        }
    }
}
