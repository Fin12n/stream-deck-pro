package p069h5;

import I0.mIk.efuWFSeiT;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p042e5.c;
import p042e5.d;
import p042e5.e;
import p042e5.f;
import p042e5.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements p042e5.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f24455f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f24456g = d.a(efuWFSeiT.izlD).b(p069h5.a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f24457h = d.a("value").b(p069h5.a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f24458i = new e() { // from class: h5.e
        @Override // p042e5.b
        public final void a(Object obj, Object obj2) {
            f.c((Map.Entry) obj, (f) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f24459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f24460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f24461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f24462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f24463e = new i(this);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24464a;

        static {
            int[] iArr = new int[d.a.values().length];
            f24464a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24464a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24464a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(OutputStream outputStream, Map map, Map map2, e eVar) {
        this.f24459a = outputStream;
        this.f24460b = map;
        this.f24461c = map2;
        this.f24462d = eVar;
    }

    public static /* synthetic */ void c(Map.Entry entry, p042e5.f fVar) {
        fVar.b(f24456g, entry.getKey());
        fVar.b(f24457h, entry.getValue());
    }

    public static ByteBuffer l(int i8) {
        return ByteBuffer.allocate(i8).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static d q(d dVar) {
        d dVar2 = (d) dVar.c(d.class);
        if (dVar2 != null) {
            return dVar2;
        }
        throw new c("Field has no @Protobuf config");
    }

    public static int r(d dVar) {
        d dVar2 = (d) dVar.c(d.class);
        if (dVar2 != null) {
            return dVar2.tag();
        }
        throw new c("Field has no @Protobuf config");
    }

    @Override // p042e5.f
    public p042e5.f b(d dVar, Object obj) {
        return f(dVar, obj, true);
    }

    public p042e5.f d(d dVar, double d8, boolean z8) throws IOException {
        if (z8 && d8 == 0.0d) {
            return this;
        }
        s((r(dVar) << 3) | 1);
        this.f24459a.write(l(8).putDouble(d8).array());
        return this;
    }

    public p042e5.f e(d dVar, float f8, boolean z8) throws IOException {
        if (z8 && f8 == 0.0f) {
            return this;
        }
        s((r(dVar) << 3) | 5);
        this.f24459a.write(l(4).putFloat(f8).array());
        return this;
    }

    public p042e5.f f(d dVar, Object obj, boolean z8) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z8 || charSequence.length() != 0) {
                    s((r(dVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f24455f);
                    s(bytes.length);
                    this.f24459a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(dVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    n(f24458i, dVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return d(dVar, ((Double) obj).doubleValue(), z8);
                }
                if (obj instanceof Float) {
                    return e(dVar, ((Float) obj).floatValue(), z8);
                }
                if (obj instanceof Number) {
                    return j(dVar, ((Number) obj).longValue(), z8);
                }
                if (obj instanceof Boolean) {
                    return k(dVar, ((Boolean) obj).booleanValue(), z8);
                }
                if (!(obj instanceof byte[])) {
                    e eVar = (e) this.f24460b.get(obj.getClass());
                    if (eVar != null) {
                        return n(eVar, dVar, obj, z8);
                    }
                    g gVar = (g) this.f24461c.get(obj.getClass());
                    if (gVar != null) {
                        return o(gVar, dVar, obj, z8);
                    }
                    if (obj instanceof c) {
                        return g(dVar, ((c) obj).getNumber());
                    }
                    return obj instanceof Enum ? g(dVar, ((Enum) obj).ordinal()) : n(this.f24462d, dVar, obj, z8);
                }
                byte[] bArr = (byte[]) obj;
                if (!z8 || bArr.length != 0) {
                    s((r(dVar) << 3) | 2);
                    s(bArr.length);
                    this.f24459a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public f g(d dVar, int i8) {
        return h(dVar, i8, true);
    }

    public f h(d dVar, int i8, boolean z8) throws IOException {
        if (!z8 || i8 != 0) {
            d dVarQ = q(dVar);
            int i9 = a.f24464a[dVarQ.intEncoding().ordinal()];
            if (i9 == 1) {
                s(dVarQ.tag() << 3);
                s(i8);
                return this;
            }
            if (i9 == 2) {
                s(dVarQ.tag() << 3);
                s((i8 << 1) ^ (i8 >> 31));
                return this;
            }
            if (i9 == 3) {
                s((dVarQ.tag() << 3) | 5);
                this.f24459a.write(l(4).putInt(i8).array());
                return this;
            }
        }
        return this;
    }

    @Override // p042e5.f
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f a(d dVar, long j8) {
        return j(dVar, j8, true);
    }

    public f j(d dVar, long j8, boolean z8) throws IOException {
        if (!z8 || j8 != 0) {
            d dVarQ = q(dVar);
            int i8 = a.f24464a[dVarQ.intEncoding().ordinal()];
            if (i8 == 1) {
                s(dVarQ.tag() << 3);
                t(j8);
                return this;
            }
            if (i8 == 2) {
                s(dVarQ.tag() << 3);
                t((j8 >> 63) ^ (j8 << 1));
                return this;
            }
            if (i8 == 3) {
                s((dVarQ.tag() << 3) | 1);
                this.f24459a.write(l(8).putLong(j8).array());
                return this;
            }
        }
        return this;
    }

    public f k(d dVar, boolean z8, boolean z9) {
        return h(dVar, z8 ? 1 : 0, z9);
    }

    public final long m(e eVar, Object obj) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f24459a;
            this.f24459a = bVar;
            try {
                eVar.a(obj, this);
                this.f24459a = outputStream;
                long jB = bVar.b();
                bVar.close();
                return jB;
            } catch (Throwable th) {
                this.f24459a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final f n(e eVar, d dVar, Object obj, boolean z8) throws IOException {
        long jM = m(eVar, obj);
        if (z8 && jM == 0) {
            return this;
        }
        s((r(dVar) << 3) | 2);
        t(jM);
        eVar.a(obj, this);
        return this;
    }

    public final f o(g gVar, d dVar, Object obj, boolean z8) {
        this.f24463e.b(dVar, z8);
        gVar.a(obj, this.f24463e);
        return this;
    }

    public f p(Object obj) {
        if (obj == null) {
            return this;
        }
        e eVar = (e) this.f24460b.get(obj.getClass());
        if (eVar != null) {
            eVar.a(obj, this);
            return this;
        }
        throw new c("No encoder for " + obj.getClass());
    }

    public final void s(int i8) throws IOException {
        while ((i8 & (-128)) != 0) {
            this.f24459a.write((i8 & 127) | 128);
            i8 >>>= 7;
        }
        this.f24459a.write(i8 & 127);
    }

    public final void t(long j8) throws IOException {
        while (((-128) & j8) != 0) {
            this.f24459a.write((((int) j8) & 127) | 128);
            j8 >>>= 7;
        }
        this.f24459a.write(((int) j8) & 127);
    }
}
