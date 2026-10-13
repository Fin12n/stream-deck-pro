package O4;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: O4.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1464n implements p051f5.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p042e5.e f8339d = new p042e5.e() { // from class: O4.m
        @Override // p042e5.b
        public final void a(Object obj, Object obj2) {
            p042e5.e eVar = C1464n.f8339d;
            throw new p042e5.c("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f8340a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f8341b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p042e5.e f8342c = f8339d;

    @Override // p051f5.b
    public final /* bridge */ /* synthetic */ p051f5.b a(Class cls, p042e5.e eVar) {
        this.f8340a.put(cls, eVar);
        this.f8341b.remove(cls);
        return this;
    }

    public final C1471o b() {
        return new C1471o(new HashMap(this.f8340a), new HashMap(this.f8341b), this.f8342c);
    }
}
