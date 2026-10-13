package N6;

import I0.mIk.efuWFSeiT;
import Y6.l;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static /* synthetic */ long b(Reader reader, Writer writer, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 8192;
        }
        return a(reader, writer, i8);
    }

    public static final Y6.g c(BufferedReader bufferedReader) {
        t.g(bufferedReader, "<this>");
        return l.d(new f(bufferedReader));
    }

    public static final String d(Reader reader) {
        t.g(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        t.f(string, "toString(...)");
        return string;
    }

    public static final long a(Reader reader, Writer out, int i8) throws IOException {
        t.g(reader, efuWFSeiT.iAPUkZxCWL);
        t.g(out, "out");
        char[] cArr = new char[i8];
        int i9 = reader.read(cArr);
        long j8 = 0;
        while (i9 >= 0) {
            out.write(cArr, 0, i9);
            j8 += (long) i9;
            i9 = reader.read(cArr);
        }
        return j8;
    }
}
