package N6;

import C6.G;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class c extends b {
    public static final ByteBuffer c(int i8, CharsetEncoder encoder) {
        t.g(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i8 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        t.f(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final CharsetEncoder d(Charset charset) {
        t.g(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static final String e(File file, Charset charset) throws IllegalAccessException, IOException, InvocationTargetException {
        t.g(file, "<this>");
        t.g(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strD = g.d(inputStreamReader);
            a.a(inputStreamReader, null);
            return strD;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ String f(File file, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = Z6.c.f12941b;
        }
        return e(file, charset);
    }

    public static final void g(File file, String text, Charset charset) throws IllegalAccessException, IOException, InvocationTargetException {
        t.g(file, "<this>");
        t.g(text, "text");
        t.g(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            i(fileOutputStream, text, charset);
            G g8 = G.f1419a;
            a.a(fileOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ void h(File file, String str, Charset charset, int i8, Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        if ((i8 & 2) != 0) {
            charset = Z6.c.f12941b;
        }
        g(file, str, charset);
    }

    public static final void i(OutputStream outputStream, String text, Charset charset) throws IOException {
        t.g(outputStream, "<this>");
        t.g(text, "text");
        t.g(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            t.f(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderD = d(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        t.d(charsetEncoderD);
        ByteBuffer byteBufferC = c(8192, charsetEncoderD);
        int i8 = 0;
        int i9 = 0;
        while (i8 < text.length()) {
            int iMin = Math.min(8192 - i9, text.length() - i8);
            int i10 = i8 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            t.f(cArrArray, "array(...)");
            text.getChars(i8, i10, cArrArray, i9);
            charBufferAllocate.limit(iMin + i9);
            i9 = 1;
            if (!charsetEncoderD.encode(charBufferAllocate, byteBufferC, i10 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferC.array(), 0, byteBufferC.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i9 = 0;
            }
            charBufferAllocate.clear();
            byteBufferC.clear();
            i8 = i10;
        }
    }
}
