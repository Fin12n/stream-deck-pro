package O4;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: O4.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1450l implements p042e5.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f8300f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p042e5.d f8301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p042e5.d f8302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p042e5.e f8303i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f8304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f8305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f8306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p042e5.e f8307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1478p f8308e = new C1478p(this);

    static {
        e5.d.b bVarA = p042e5.d.a(SubscriberAttributeKt.JSON_NAME_KEY);
        C1408f c1408f = new C1408f();
        c1408f.a(1);
        f8301g = bVarA.b(c1408f.b()).a();
        e5.d.b bVarA2 = p042e5.d.a("value");
        C1408f c1408f2 = new C1408f();
        c1408f2.a(2);
        f8302h = bVarA2.b(c1408f2.b()).a();
        f8303i = new p042e5.e() { // from class: O4.k
            @Override // p042e5.b
            public final void a(Object obj, Object obj2) {
                C1450l.i((Map.Entry) obj, (p042e5.f) obj2);
            }
        };
    }

    public C1450l(OutputStream outputStream, Map map, Map map2, p042e5.e eVar) {
        this.f8304a = outputStream;
        this.f8305b = map;
        this.f8306c = map2;
        this.f8307d = eVar;
    }

    public static /* synthetic */ void i(Map.Entry entry, p042e5.f fVar) {
        fVar.b(f8301g, entry.getKey());
        fVar.b(f8302h, entry.getValue());
    }

    private static int j(p042e5.d dVar) {
        InterfaceC1436j interfaceC1436j = (InterfaceC1436j) dVar.c(InterfaceC1436j.class);
        if (interfaceC1436j != null) {
            return interfaceC1436j.zza();
        }
        throw new p042e5.c("Field has no @Protobuf config");
    }

    private final long k(p042e5.e eVar, Object obj) throws IOException {
        C1415g c1415g = new C1415g();
        try {
            OutputStream outputStream = this.f8304a;
            this.f8304a = c1415g;
            try {
                eVar.a(obj, this);
                this.f8304a = outputStream;
                long jB = c1415g.b();
                c1415g.close();
                return jB;
            } catch (Throwable th) {
                this.f8304a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c1415g.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public static InterfaceC1436j l(p042e5.d dVar) {
        InterfaceC1436j interfaceC1436j = (InterfaceC1436j) dVar.c(InterfaceC1436j.class);
        if (interfaceC1436j != null) {
            return interfaceC1436j;
        }
        throw new p042e5.c("Field has no @Protobuf config");
    }

    private static ByteBuffer o(int i8) {
        return ByteBuffer.allocate(i8).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void p(int i8) throws IOException {
        while ((i8 & (-128)) != 0) {
            this.f8304a.write((i8 & 127) | 128);
            i8 >>>= 7;
        }
        this.f8304a.write(i8 & 127);
    }

    private final void q(long j8) throws IOException {
        while (((-128) & j8) != 0) {
            this.f8304a.write((((int) j8) & 127) | 128);
            j8 >>>= 7;
        }
        this.f8304a.write(((int) j8) & 127);
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
        this.f8304a.write(o(8).putDouble(d8).array());
        return this;
    }

    public final p042e5.f d(p042e5.d dVar, float f8, boolean z8) throws IOException {
        if (z8 && f8 == 0.0f) {
            return this;
        }
        p((j(dVar) << 3) | 5);
        this.f8304a.write(o(4).putFloat(f8).array());
        return this;
    }

    public final p042e5.f e(p042e5.d dVar, Object obj, boolean z8) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z8 || charSequence.length() != 0) {
                    p((j(dVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f8300f);
                    p(bytes.length);
                    this.f8304a.write(bytes);
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
                    m(f8303i, dVar, (Map.Entry) it2.next(), false);
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
                    p042e5.e eVar = (p042e5.e) this.f8305b.get(obj.getClass());
                    if (eVar != null) {
                        m(eVar, dVar, obj, z8);
                        return this;
                    }
                    p042e5.g gVar = (p042e5.g) this.f8306c.get(obj.getClass());
                    if (gVar != null) {
                        n(gVar, dVar, obj, z8);
                        return this;
                    }
                    if (obj instanceof InterfaceC1422h) {
                        f(dVar, ((InterfaceC1422h) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        f(dVar, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    m(this.f8307d, dVar, obj, z8);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z8 || bArr.length != 0) {
                    p((j(dVar) << 3) | 2);
                    p(bArr.length);
                    this.f8304a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final C1450l f(p042e5.d dVar, int i8, boolean z8) throws IOException {
        if (!z8 || i8 != 0) {
            InterfaceC1436j interfaceC1436jL = l(dVar);
            EnumC1429i enumC1429i = EnumC1429i.DEFAULT;
            int iOrdinal = interfaceC1436jL.zzb().ordinal();
            if (iOrdinal == 0) {
                p(interfaceC1436jL.zza() << 3);
                p(i8);
                return this;
            }
            if (iOrdinal == 1) {
                p(interfaceC1436jL.zza() << 3);
                p((i8 + i8) ^ (i8 >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                p((interfaceC1436jL.zza() << 3) | 5);
                this.f8304a.write(o(4).putInt(i8).array());
                return this;
            }
        }
        return this;
    }

    public final C1450l g(p042e5.d dVar, long j8, boolean z8) throws IOException {
        if (!z8 || j8 != 0) {
            InterfaceC1436j interfaceC1436jL = l(dVar);
            EnumC1429i enumC1429i = EnumC1429i.DEFAULT;
            int iOrdinal = interfaceC1436jL.zzb().ordinal();
            if (iOrdinal == 0) {
                p(interfaceC1436jL.zza() << 3);
                q(j8);
                return this;
            }
            if (iOrdinal == 1) {
                p(interfaceC1436jL.zza() << 3);
                q((j8 >> 63) ^ (j8 + j8));
                return this;
            }
            if (iOrdinal == 2) {
                p((interfaceC1436jL.zza() << 3) | 1);
                this.f8304a.write(o(8).putLong(j8).array());
                return this;
            }
        }
        return this;
    }

    public final C1450l h(Object obj) {
        if (obj == null) {
            return this;
        }
        p042e5.e eVar = (p042e5.e) this.f8305b.get(obj.getClass());
        if (eVar == null) {
            throw new p042e5.c("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        eVar.a(obj, this);
        return this;
    }

    public final C1450l m(p042e5.e eVar, p042e5.d dVar, Object obj, boolean z8) throws IOException {
        long jK = k(eVar, obj);
        if (z8 && jK == 0) {
            return this;
        }
        p((j(dVar) << 3) | 2);
        q(jK);
        eVar.a(obj, this);
        return this;
    }

    public final C1450l n(p042e5.g gVar, p042e5.d dVar, Object obj, boolean z8) {
        this.f8308e.a(dVar, z8);
        gVar.a(obj, this.f8308e);
        return this;
    }
}
