package s7;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: renamed from: s7.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2906m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f33292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f33293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharsetDecoder f33294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteBuffer f33295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f33297f;

    public C2906m(InputStream inputStream, Charset charset) {
        kotlin.jvm.internal.t.g(inputStream, "inputStream");
        kotlin.jvm.internal.t.g(charset, "charset");
        this.f33292a = inputStream;
        this.f33293b = charset;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        kotlin.jvm.internal.t.f(charsetDecoderOnUnmappableCharacter, "onUnmappableCharacter(...)");
        this.f33294c = charsetDecoderOnUnmappableCharacter;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(C2900g.f33282c.b());
        kotlin.jvm.internal.t.f(byteBufferWrap, "wrap(...)");
        this.f33295d = byteBufferWrap;
        byteBufferWrap.flip();
    }

    public final int a(char[] cArr, int i8, int i9) throws CharacterCodingException {
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i8, i9);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z8 = false;
        while (true) {
            CoderResult coderResultDecode = this.f33294c.decode(this.f33295d, charBufferWrap, z8);
            if (coderResultDecode.isUnderflow()) {
                if (!z8 && charBufferWrap.hasRemaining()) {
                    if (b() < 0) {
                        if (charBufferWrap.position() == 0 && !this.f33295d.hasRemaining()) {
                            z8 = true;
                            break;
                        }
                        this.f33294c.reset();
                        z8 = true;
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBufferWrap.position();
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z8) {
            this.f33294c.reset();
        }
        if (charBufferWrap.position() == 0) {
            return -1;
        }
        return charBufferWrap.position();
    }

    public final int b() {
        this.f33295d.compact();
        try {
            int iLimit = this.f33295d.limit();
            int iPosition = this.f33295d.position();
            int i8 = this.f33292a.read(this.f33295d.array(), this.f33295d.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
            if (i8 < 0) {
                return i8;
            }
            ByteBuffer byteBuffer = this.f33295d;
            kotlin.jvm.internal.t.e(byteBuffer, "null cannot be cast to non-null type java.nio.Buffer");
            byteBuffer.position(iPosition + i8);
            return this.f33295d.remaining();
        } finally {
            this.f33295d.flip();
        }
    }

    public final int c() {
        if (this.f33296e) {
            this.f33296e = false;
            return this.f33297f;
        }
        char[] cArr = new char[2];
        int iD = d(cArr, 0, 2);
        if (iD == -1) {
            return -1;
        }
        if (iD == 1) {
            return cArr[0];
        }
        if (iD == 2) {
            this.f33297f = cArr[1];
            this.f33296e = true;
            return cArr[0];
        }
        throw new IllegalStateException(("Unreachable state: " + iD).toString());
    }

    public final int d(char[] array, int i8, int i9) {
        kotlin.jvm.internal.t.g(array, "array");
        int i10 = 0;
        if (i9 == 0) {
            return 0;
        }
        if (i8 < 0 || i8 >= array.length || i9 < 0 || i8 + i9 > array.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i8 + ", " + i9 + ", " + array.length).toString());
        }
        if (this.f33296e) {
            array[i8] = this.f33297f;
            i8++;
            i9--;
            this.f33296e = false;
            if (i9 == 0) {
                return 1;
            }
            i10 = 1;
        }
        if (i9 != 1) {
            return a(array, i8, i9) + i10;
        }
        int iC = c();
        if (iC != -1) {
            array[i8] = (char) iC;
            return i10 + 1;
        }
        if (i10 == 0) {
            return -1;
        }
        return i10;
    }
}
