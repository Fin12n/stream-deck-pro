package N4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f6596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p042e5.e f6597c;

    public V0(Map map, Map map2, p042e5.e eVar) {
        this.f6595a = map;
        this.f6596b = map2;
        this.f6597c = eVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new S0(byteArrayOutputStream, this.f6595a, this.f6596b, this.f6597c).h(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
