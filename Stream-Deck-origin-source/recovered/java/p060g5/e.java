package p060g5;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import p042e5.c;
import p042e5.d;
import p042e5.f;
import p042e5.g;
import p042e5.h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f23783a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23784b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonWriter f23785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f23786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f23787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p042e5.e f23788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23789g;

    public e(Writer writer, Map map, Map map2, p042e5.e eVar, boolean z8) {
        this.f23785c = new JsonWriter(writer);
        this.f23786d = map;
        this.f23787e = map2;
        this.f23788f = eVar;
        this.f23789g = z8;
    }

    @Override // p042e5.f
    public f a(d dVar, long j8) {
        return h(dVar.b(), j8);
    }

    @Override // p042e5.f
    public f b(d dVar, Object obj) {
        return i(dVar.b(), obj);
    }

    public e e(long j8) throws IOException {
        q();
        this.f23785c.value(j8);
        return this;
    }

    public e f(Object obj, boolean z8) {
        if (z8 && l(obj)) {
            throw new c(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f23785c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f23785c.value((Number) obj);
            return this;
        }
        int i8 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f23785c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(it.next(), false);
                }
                this.f23785c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f23785c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i((String) key, entry.getValue());
                    } catch (ClassCastException e8) {
                        throw new c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e8);
                    }
                }
                this.f23785c.endObject();
                return this;
            }
            p042e5.e eVar = (p042e5.e) this.f23786d.get(obj.getClass());
            if (eVar != null) {
                return n(eVar, obj, z8);
            }
            g gVar = (g) this.f23787e.get(obj.getClass());
            if (gVar != null) {
                gVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return n(this.f23788f, obj, z8);
            }
            c(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return k((byte[]) obj);
        }
        this.f23785c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i8 < length) {
                this.f23785c.value(iArr[i8]);
                i8++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i8 < length2) {
                e(jArr[i8]);
                i8++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i8 < length3) {
                this.f23785c.value(dArr[i8]);
                i8++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i8 < length4) {
                this.f23785c.value(zArr[i8]);
                i8++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                f(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                f(obj2, false);
            }
        }
        this.f23785c.endArray();
        return this;
    }

    @Override // p042e5.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e c(String str) throws IOException {
        q();
        this.f23785c.value(str);
        return this;
    }

    public e h(String str, long j8) throws IOException {
        q();
        this.f23785c.name(str);
        return e(j8);
    }

    public e i(String str, Object obj) {
        return this.f23789g ? p(str, obj) : o(str, obj);
    }

    @Override // p042e5.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public e d(boolean z8) throws IOException {
        q();
        this.f23785c.value(z8);
        return this;
    }

    public e k(byte[] bArr) throws IOException {
        q();
        if (bArr == null) {
            this.f23785c.nullValue();
            return this;
        }
        this.f23785c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    public final boolean l(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void m() {
        q();
        this.f23785c.flush();
    }

    public e n(p042e5.e eVar, Object obj, boolean z8) throws IOException {
        if (!z8) {
            this.f23785c.beginObject();
        }
        eVar.a(obj, this);
        if (!z8) {
            this.f23785c.endObject();
        }
        return this;
    }

    public final e o(String str, Object obj) throws IOException {
        q();
        this.f23785c.name(str);
        if (obj != null) {
            return f(obj, false);
        }
        this.f23785c.nullValue();
        return this;
    }

    public final e p(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        q();
        this.f23785c.name(str);
        return f(obj, false);
    }

    public final void q() throws IOException {
        if (!this.f23784b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f23783a;
        if (eVar != null) {
            eVar.q();
            this.f23783a.f23784b = false;
            this.f23783a = null;
            this.f23785c.endObject();
        }
    }
}
