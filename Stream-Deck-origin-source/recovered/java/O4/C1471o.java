package O4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: O4.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1471o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f8363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f8364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p042e5.e f8365c;

    public C1471o(Map map, Map map2, p042e5.e eVar) {
        this.f8363a = map;
        this.f8364b = map2;
        this.f8365c = eVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C1450l(byteArrayOutputStream, this.f8363a, this.f8364b, this.f8365c).h(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
