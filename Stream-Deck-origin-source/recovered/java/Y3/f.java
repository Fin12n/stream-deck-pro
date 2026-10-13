package Y3;

import C6.G;
import D6.C0934n;
import D6.z;
import X5.C1685n;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import com.revenuecat.purchases.common.networking.HTTPResult;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import u7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f implements m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f12304f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G5.a f12309e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f12311a;

            /* JADX INFO: renamed from: Y3.f$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0312a extends u implements Q6.k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ f f12312a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0312a(f fVar) {
                    super(1);
                    this.f12312a = fVar;
                }

                public final void b(x.a config) {
                    t.g(config, "$this$config");
                    long j8 = this.f12312a.f12308d;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    config.b(j8, timeUnit);
                    config.M(this.f12312a.f12308d, timeUnit);
                    config.O(this.f12312a.f12308d, timeUnit);
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((x.a) obj);
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar) {
                super(1);
                this.f12311a = fVar;
            }

            public final void b(K5.c engine) {
                t.g(engine, "$this$engine");
                engine.c(new C0312a(this.f12311a));
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((K5.c) obj);
                return G.f1419a;
            }
        }

        public b() {
            super(1);
        }

        public final void b(G5.b HttpClient) {
            t.g(HttpClient, "$this$HttpClient");
            HttpClient.b(new a(f.this));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((G5.b) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f12313a = new c();

        public c() {
            super(1);
        }

        public final CharSequence b(byte b8) {
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b8)}, 1));
            t.f(str, "format(...)");
            return str;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).byteValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f12315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f12316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f12317d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f12319f;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f12317d = obj;
            this.f12319f |= Integer.MIN_VALUE;
            return f.this.a(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f12320a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f12321a = new a();

            public a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(k it) {
                t.g(it, "it");
                return it.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(0);
            this.f12320a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Sent " + this.f12320a.size() + " events successfully: " + z.r0(this.f12320a, null, null, null, 0, null, a.f12321a, 31, null);
        }
    }

    /* JADX INFO: renamed from: Y3.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0313f extends u implements Q6.k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f12323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f12324c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0313f(String str, String str2) {
            super(1);
            this.f12323b = str;
            this.f12324c = str2;
        }

        public final void b(C1685n headers) {
            t.g(headers, "$this$headers");
            headers.f("X-API-Key", f.this.f12306b);
            String timestamp = this.f12323b;
            t.f(timestamp, "$timestamp");
            headers.f("X-Timestamp", timestamp);
            headers.f(HTTPResult.SIGNATURE_HEADER_NAME, this.f12324c);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C1685n) obj);
            return G.f1419a;
        }
    }

    public f(String baseUrl, String str, String secret, long j8) {
        t.g(baseUrl, "baseUrl");
        t.g(str, yOZfxp.TeMNwLgRpqpX);
        t.g(secret, "secret");
        this.f12305a = baseUrl;
        this.f12306b = str;
        this.f12307c = secret;
        this.f12308d = j8;
        this.f12309e = G5.e.a(K5.a.f4641a, new b());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:33:0x0106  */
    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    /* JADX WARN: Code duplicated, block: B:39:0x0141  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00f7 -> B:31:0x00fa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // Y3.m
    public java.lang.Object a(java.util.List r14, G6.d r15) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.f.a(java.util.List, G6.d):java.lang.Object");
    }

    public final String d(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        String str3 = this.f12307c;
        Charset charset = Z6.c.f12941b;
        byte[] bytes = str3.getBytes(charset);
        t.f(bytes, "getBytes(...)");
        mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
        byte[] bytes2 = (str + "\n" + str2).getBytes(charset);
        t.f(bytes2, "getBytes(...)");
        byte[] bArrDoFinal = mac.doFinal(bytes2);
        t.d(bArrDoFinal);
        return C0934n.f0(bArrDoFinal, "", null, null, 0, null, c.f12313a, 30, null);
    }

    public /* synthetic */ f(String str, String str2, String str3, long j8, int i8, AbstractC2633k abstractC2633k) {
        this(str, str2, str3, (i8 & 8) != 0 ? 5000L : j8);
    }
}
