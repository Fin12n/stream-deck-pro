package io.ktor.websocket;

import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.InterfaceC1776b0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f25649i = new c(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f25650j = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f25652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f25653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1776b0 f25654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ByteBuffer f25658h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends e {
        public /* synthetic */ a(boolean z8, byte[] bArr, boolean z9, boolean z10, boolean z11, int i8, AbstractC2633k abstractC2633k) {
            this(z8, bArr, (i8 & 4) != 0 ? false : z9, (i8 & 8) != 0 ? false : z10, (i8 & 16) != 0 ? false : z11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z8, byte[] data, boolean z9, boolean z10, boolean z11) {
            super(z8, i.BINARY, data, j.f25689a, z9, z10, z11, null);
            kotlin.jvm.internal.t.g(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(boolean z8, ByteBuffer buffer) {
            this(z8, p115m6.w.e(buffer));
            kotlin.jvm.internal.t.g(buffer, "buffer");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(boolean z8, byte[] data) {
            this(z8, data, false, false, false);
            kotlin.jvm.internal.t.g(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(boolean z8, p205x6.k packet) {
            this(z8, p205x6.y.c(packet, 0, 1, null));
            kotlin.jvm.internal.t.g(packet, "packet");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte[] data) {
            super(true, i.CLOSE, data, j.f25689a, false, false, false, null);
            kotlin.jvm.internal.t.g(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(p205x6.k packet) {
            this(p205x6.y.c(packet, 0, 1, null));
            kotlin.jvm.internal.t.g(packet, "packet");
        }

        public b() {
            this(e.f25650j);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(ByteBuffer buffer) {
            this(p115m6.w.e(buffer));
            kotlin.jvm.internal.t.g(buffer, "buffer");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(io.ktor.websocket.a reason) {
            kotlin.jvm.internal.t.g(reason, "reason");
            p205x6.j jVar = new p205x6.j(null, 1, 0 == true ? 1 : 0);
            try {
                p205x6.v.e(jVar, reason.a());
                p205x6.y.i(jVar, reason.c(), 0, 0, null, 14, null);
                this(jVar.M1());
            } catch (Throwable th) {
                jVar.T0();
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25659a;

            static {
                int[] iArr = new int[i.values().length];
                try {
                    iArr[i.BINARY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i.TEXT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[i.CLOSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[i.PING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[i.f25685j.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f25659a = iArr;
            }
        }

        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public final e a(boolean z8, i frameType, byte[] data, boolean z9, boolean z10, boolean z11) {
            kotlin.jvm.internal.t.g(frameType, "frameType");
            kotlin.jvm.internal.t.g(data, "data");
            int i8 = a.f25659a[frameType.ordinal()];
            if (i8 == 1) {
                return new a(z8, data, z9, z10, z11);
            }
            if (i8 == 2) {
                return new f(z8, data, z9, z10, z11);
            }
            if (i8 == 3) {
                return new b(data);
            }
            if (i8 == 4) {
                return new d(data);
            }
            if (i8 == 5) {
                return new C0584e(data, j.f25689a);
            }
            throw new C6.m();
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(byte[] data) {
            super(true, i.PING, data, j.f25689a, false, false, false, null);
            kotlin.jvm.internal.t.g(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(p205x6.k packet) {
            this(p205x6.y.c(packet, 0, 1, null));
            kotlin.jvm.internal.t.g(packet, "packet");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(ByteBuffer buffer) {
            this(p115m6.w.e(buffer));
            kotlin.jvm.internal.t.g(buffer, "buffer");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends e {
        public /* synthetic */ f(boolean z8, byte[] bArr, boolean z9, boolean z10, boolean z11, int i8, AbstractC2633k abstractC2633k) {
            this(z8, bArr, (i8 & 4) != 0 ? false : z9, (i8 & 8) != 0 ? false : z10, (i8 & 16) != 0 ? false : z11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z8, byte[] data, boolean z9, boolean z10, boolean z11) {
            super(z8, i.TEXT, data, j.f25689a, z9, z10, z11, null);
            kotlin.jvm.internal.t.g(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(boolean z8, byte[] bArr) {
            this(z8, bArr, false, false, false);
            kotlin.jvm.internal.t.g(bArr, LYdqVGvOGMNr.XrViKKiNOVHli);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(boolean z8, p205x6.k packet) {
            this(z8, p205x6.y.c(packet, 0, 1, null));
            kotlin.jvm.internal.t.g(packet, "packet");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(boolean z8, ByteBuffer buffer) {
            this(z8, p115m6.w.e(buffer));
            kotlin.jvm.internal.t.g(buffer, "buffer");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public f(String text) {
            byte[] bArrG;
            kotlin.jvm.internal.t.g(text, "text");
            Charset charset = Z6.c.f12941b;
            if (kotlin.jvm.internal.t.c(charset, charset)) {
                bArrG = Z6.v.s(text);
            } else {
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                kotlin.jvm.internal.t.f(charsetEncoderNewEncoder, "charset.newEncoder()");
                bArrG = p197w6.a.g(charsetEncoderNewEncoder, text, 0, text.length());
            }
            this(true, bArrG);
        }
    }

    public /* synthetic */ e(boolean z8, i iVar, byte[] bArr, InterfaceC1776b0 interfaceC1776b0, boolean z9, boolean z10, boolean z11, AbstractC2633k abstractC2633k) {
        this(z8, iVar, bArr, interfaceC1776b0, z9, z10, z11);
    }

    public final ByteBuffer b() {
        return this.f25658h;
    }

    public final byte[] c() {
        return this.f25653c;
    }

    public final boolean d() {
        return this.f25651a;
    }

    public final i e() {
        return this.f25652b;
    }

    public final boolean f() {
        return this.f25655e;
    }

    public final boolean g() {
        return this.f25656f;
    }

    public final boolean h() {
        return this.f25657g;
    }

    public String toString() {
        return "Frame " + this.f25652b + " (fin=" + this.f25651a + ", buffer len = " + this.f25653c.length + ')';
    }

    /* JADX INFO: renamed from: io.ktor.websocket.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0584e extends e {
        public /* synthetic */ C0584e(byte[] bArr, InterfaceC1776b0 interfaceC1776b0, int i8, AbstractC2633k abstractC2633k) {
            this(bArr, (i8 & 2) != 0 ? j.f25689a : interfaceC1776b0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0584e(byte[] data, InterfaceC1776b0 interfaceC1776b0) {
            super(true, i.f25685j, data, interfaceC1776b0, false, false, false, null);
            kotlin.jvm.internal.t.g(data, "data");
            kotlin.jvm.internal.t.g(interfaceC1776b0, LYdqVGvOGMNr.hxClvVbriRirQLx);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C0584e(p205x6.k packet) {
            this(p205x6.y.c(packet, 0, 1, null), j.f25689a);
            kotlin.jvm.internal.t.g(packet, "packet");
        }

        public /* synthetic */ C0584e(ByteBuffer byteBuffer, InterfaceC1776b0 interfaceC1776b0, int i8, AbstractC2633k abstractC2633k) {
            this(byteBuffer, (i8 & 2) != 0 ? j.f25689a : interfaceC1776b0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C0584e(ByteBuffer buffer, InterfaceC1776b0 disposableHandle) {
            this(p115m6.w.e(buffer), disposableHandle);
            kotlin.jvm.internal.t.g(buffer, "buffer");
            kotlin.jvm.internal.t.g(disposableHandle, "disposableHandle");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C0584e(ByteBuffer buffer) {
            this(p115m6.w.e(buffer), j.f25689a);
            kotlin.jvm.internal.t.g(buffer, "buffer");
        }
    }

    public e(boolean z8, i iVar, byte[] bArr, InterfaceC1776b0 interfaceC1776b0, boolean z9, boolean z10, boolean z11) {
        this.f25651a = z8;
        this.f25652b = iVar;
        this.f25653c = bArr;
        this.f25654d = interfaceC1776b0;
        this.f25655e = z9;
        this.f25656f = z10;
        this.f25657g = z11;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        kotlin.jvm.internal.t.f(byteBufferWrap, "wrap(data)");
        this.f25658h = byteBufferWrap;
    }

    public /* synthetic */ e(boolean z8, i iVar, byte[] bArr, InterfaceC1776b0 interfaceC1776b0, boolean z9, boolean z10, boolean z11, int i8, AbstractC2633k abstractC2633k) {
        this(z8, iVar, bArr, (i8 & 8) != 0 ? j.f25689a : interfaceC1776b0, (i8 & 16) != 0 ? false : z9, (i8 & 32) != 0 ? false : z10, (i8 & 64) != 0 ? false : z11, null);
    }
}
