package p069h5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p042e5.c;
import p042e5.e;
import p042e5.f;
import p051f5.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f24465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f24466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f24467c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f24468d = new e() { // from class: h5.g
            @Override // p042e5.b
            public final void a(Object obj, Object obj2) {
                h.a.b(obj, (f) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f24469a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f24470b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f24471c = f24468d;

        public static /* synthetic */ void b(Object obj, f fVar) {
            throw new c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f24469a), new HashMap(this.f24470b), this.f24471c);
        }

        public a d(p051f5.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // p051f5.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, e eVar) {
            this.f24469a.put(cls, eVar);
            this.f24470b.remove(cls);
            return this;
        }
    }

    public h(Map map, Map map2, e eVar) {
        this.f24465a = map;
        this.f24466b = map2;
        this.f24467c = eVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f24465a, this.f24466b, this.f24467c).p(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
