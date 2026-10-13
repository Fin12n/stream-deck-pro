package p007a6;

import X5.AbstractC1676e;
import X5.C1674c;
import X5.x;
import Z6.c;
import Z6.v;
import Z6.y;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p197w6.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1674c f13443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f13444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13445d;

    public /* synthetic */ d(String str, C1674c c1674c, x xVar, int i8, AbstractC2633k abstractC2633k) {
        this(str, c1674c, (i8 & 4) != 0 ? null : xVar);
    }

    @Override // p007a6.c
    public Long a() {
        return Long.valueOf(this.f13445d.length);
    }

    @Override // p007a6.c
    public C1674c b() {
        return this.f13443b;
    }

    @Override // a6.c.a
    public byte[] d() {
        return this.f13445d;
    }

    public String toString() {
        return "TextContent[" + b() + "] \"" + y.d1(this.f13442a, 30) + '\"';
    }

    public d(String text, C1674c contentType, x xVar) {
        byte[] bArrG;
        t.g(text, "text");
        t.g(contentType, "contentType");
        this.f13442a = text;
        this.f13443b = contentType;
        this.f13444c = xVar;
        Charset charsetA = AbstractC1676e.a(b());
        charsetA = charsetA == null ? c.f12941b : charsetA;
        if (t.c(charsetA, c.f12941b)) {
            bArrG = v.s(text);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charsetA.newEncoder();
            t.f(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrG = a.g(charsetEncoderNewEncoder, text, 0, text.length());
        }
        this.f13445d = bArrG;
    }
}
