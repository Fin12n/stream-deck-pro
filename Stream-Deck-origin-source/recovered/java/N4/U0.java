package N4;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class U0 implements p051f5.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p042e5.e f6576d = new p042e5.e() { // from class: N4.T0
        @Override // p042e5.b
        public final void a(Object obj, Object obj2) {
            p042e5.e eVar = U0.f6576d;
            throw new p042e5.c("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6577a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f6578b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p042e5.e f6579c = f6576d;

    @Override // p051f5.b
    public final /* bridge */ /* synthetic */ p051f5.b a(Class cls, p042e5.e eVar) {
        this.f6577a.put(cls, eVar);
        this.f6578b.remove(cls);
        return this;
    }

    public final V0 b() {
        return new V0(new HashMap(this.f6577a), new HashMap(this.f6578b), this.f6579c);
    }
}
