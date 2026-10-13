package N4;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class S0 implements p042e5.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f6553f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p042e5.d f6554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p042e5.d f6555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p042e5.e f6556i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f6557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f6558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f6559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p042e5.e f6560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final W0 f6561e = new W0(this);

    static {
        e5.d.b bVarA = p042e5.d.a(SubscriberAttributeKt.JSON_NAME_KEY);
        M0 m8 = new M0();
        m8.a(1);
        f6554g = bVarA.b(m8.b()).a();
        e5.d.b bVarA2 = p042e5.d.a("value");
        M0 m9 = new M0();
        m9.a(2);
        f6555h = bVarA2.b(m9.b()).a();
        f6556i = new p042e5.e() { // from class: N4.R0
            @Override // p042e5.b
            public final void a(Object obj, Object obj2) {
                S0.i((Map.Entry) obj, (p042e5.f) obj2);
            }
        };
    }

    public S0(OutputStream outputStream, Map map, Map map2, p042e5.e eVar) {
        this.f6557a = outputStream;
        this.f6558b = map;
        this.f6559c = map2;
        this.f6560d = eVar;
    }

    public static /* synthetic */ void i(Map.Entry entry, p042e5.f fVar) {
        fVar.b(f6554g, entry.getKey());
        fVar.b(f6555h, entry.getValue());
    }

    public static int j(p042e5.d dVar) {
        Q0 q8 = (Q0) dVar.c(Q0.class);
        if (q8 != null) {
            return q8.zza();
        }
        throw new p042e5.c("Field has no @Protobuf config");
    }

    public static Q0 l(p042e5.d dVar) {
        Q0 q8 = (Q0) dVar.c(Q0.class);
        if (q8 != null) {
            return q8;
        }
        throw new p042e5.c("Field has no @Protobuf config");
    }

    public static ByteBuffer o(int i8) {
        return ByteBuffer.allocate(i8).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // p042e5.f
    public final /* synthetic */ p042e5.f a(p042e5.d dVar, long j8) throws IOException {
        g(dVar, j8, true);
        return this;
    }

    @Override // p042e5.f
    public final p042e5.f b(p042e5.d dVar, Object obj) throws IOException {
        e(dVar, obj, true);
        return this;
    }

    public final p042e5.f c(p042e5.d dVar, double d8, boolean z8) throws IOException {
        if (z8 && d8 == 0.0d) {
            return this;
        }
        p((j(dVar) << 3) | 1);
        this.f6557a.write(o(8).putDouble(d8).array());
        return this;
    }

    public final p042e5.f d(p042e5.d dVar, float f8, boolean z8) throws IOException {
        if (z8 && f8 == 0.0f) {
            return this;
        }
        p((j(dVar) << 3) | 5);
        this.f6557a.write(o(4).putFloat(f8).array());
        return this;
    }

    public final p042e5.f e(p042e5.d dVar, Object obj, boolean z8) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z8 || charSequence.length() != 0) {
                    p((j(dVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f6553f);
                    p(bytes.length);
                    this.f6557a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(dVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    m(f6556i, dVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    c(dVar, ((Double) obj).doubleValue(), z8);
                    return this;
                }
                if (obj instanceof Float) {
                    d(dVar, ((Float) obj).floatValue(), z8);
                    return this;
                }
                if (obj instanceof Number) {
                    g(dVar, ((Number) obj).longValue(), z8);
                    return this;
                }
                if (obj instanceof Boolean) {
                    f(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z8);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    p042e5.e eVar = (p042e5.e) this.f6558b.get(obj.getClass());
                    if (eVar != null) {
                        m(eVar, dVar, obj, z8);
                        return this;
                    }
                    p042e5.g gVar = (p042e5.g) this.f6559c.get(obj.getClass());
                    if (gVar != null) {
                        n(gVar, dVar, obj, z8);
                        return this;
                    }
                    if (obj instanceof O0) {
                        f(dVar, ((O0) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        f(dVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    m(this.f6560d, dVar, obj, z8);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z8 || bArr.length != 0) {
                    p((j(dVar) << 3) | 2);
                    p(bArr.length);
                    this.f6557a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final S0 f(p042e5.d dVar, int i8, boolean z8) throws IOException {
        if (!z8 || i8 != 0) {
            Q0 q0L = l(dVar);
            int iOrdinal = q0L.zzb().ordinal();
            if (iOrdinal == 0) {
                p(q0L.zza() << 3);
                p(i8);
                return this;
            }
            if (iOrdinal == 1) {
                p(q0L.zza() << 3);
                p((i8 + i8) ^ (i8 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                p((q0L.zza() << 3) | 5);
                this.f6557a.write(o(4).putInt(i8).array());
                return this;
            }
        }
        return this;
    }

    public final S0 g(p042e5.d dVar, long j8, boolean z8) throws IOException {
        if (!z8 || j8 != 0) {
            Q0 q0L = l(dVar);
            int iOrdinal = q0L.zzb().ordinal();
            if (iOrdinal == 0) {
                p(q0L.zza() << 3);
                q(j8);
                return this;
            }
            if (iOrdinal == 1) {
                p(q0L.zza() << 3);
                q((j8 >> 63) ^ (j8 + j8));
                return this;
            }
            if (iOrdinal == 2) {
                p((q0L.zza() << 3) | 1);
                this.f6557a.write(o(8).putLong(j8).array());
                return this;
            }
        }
        return this;
    }

    public final S0 h(Object obj) {
        if (obj == null) {
            return this;
        }
        p042e5.e eVar = (p042e5.e) this.f6558b.get(obj.getClass());
        if (eVar == null) {
            throw new p042e5.c("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        eVar.a(obj, this);
        return this;
    }

    public final long k(p042e5.e eVar, Object obj) throws IOException {
        N0 n8 = new N0();
        try {
            OutputStream outputStream = this.f6557a;
            this.f6557a = n8;
            try {
                eVar.a(obj, this);
                this.f6557a = outputStream;
                long jB = n8.b();
                n8.close();
                return jB;
            } catch (Throwable th) {
                this.f6557a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                n8.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final S0 m(p042e5.e eVar, p042e5.d dVar, Object obj, boolean z8) throws IOException {
        long jK = k(eVar, obj);
        if (z8 && jK == 0) {
            return this;
        }
        p((j(dVar) << 3) | 2);
        q(jK);
        eVar.a(obj, this);
        return this;
    }

    public final S0 n(p042e5.g gVar, p042e5.d dVar, Object obj, boolean z8) {
        this.f6561e.a(dVar, z8);
        gVar.a(obj, this.f6561e);
        return this;
    }

    public final void p(int i8) throws IOException {
        while (true) {
            int i9 = i8 & 127;
            if ((i8 & (-128)) == 0) {
                this.f6557a.write(i9);
                return;
            } else {
                this.f6557a.write(i9 | 128);
                i8 >>>= 7;
            }
        }
    }

    public final void q(long j8) throws IOException {
        while (true) {
            int i8 = ((int) j8) & 127;
            if (((-128) & j8) == 0) {
                this.f6557a.write(i8);
                return;
            } else {
                this.f6557a.write(i8 | 128);
                j8 >>>= 7;
            }
        }
    }
}
