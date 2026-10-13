package p106l6;

import Z6.c;
import Z6.v;
import com.amazon.a.a.o.b.f;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f29213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f29214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f29215c;

    public a(Charset charset) {
        byte[] bArrG;
        byte[] bArrG2;
        byte[] bArrG3;
        t.g(charset, "charset");
        Charset charset2 = c.f12941b;
        if (t.c(charset, charset2)) {
            bArrG = v.s("[");
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            t.f(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrG = p197w6.a.g(charsetEncoderNewEncoder, "[", 0, 1);
        }
        this.f29213a = bArrG;
        if (t.c(charset, charset2)) {
            bArrG2 = v.s("]");
        } else {
            CharsetEncoder charsetEncoderNewEncoder2 = charset.newEncoder();
            t.f(charsetEncoderNewEncoder2, "charset.newEncoder()");
            bArrG2 = p197w6.a.g(charsetEncoderNewEncoder2, "]", 0, 1);
        }
        this.f29214b = bArrG2;
        if (t.c(charset, charset2)) {
            bArrG3 = v.s(f.f16777a);
        } else {
            CharsetEncoder charsetEncoderNewEncoder3 = charset.newEncoder();
            t.f(charsetEncoderNewEncoder3, "charset.newEncoder()");
            bArrG3 = p197w6.a.g(charsetEncoderNewEncoder3, f.f16777a, 0, 1);
        }
        this.f29215c = bArrG3;
    }

    public final byte[] a() {
        return this.f29213a;
    }

    public final byte[] b() {
        return this.f29214b;
    }

    public final byte[] c() {
        return this.f29215c;
    }
}
