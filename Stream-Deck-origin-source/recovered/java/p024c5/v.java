package p024c5;

import p087j5.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class v implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f16272c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f16273a = f16272c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f16274b;

    public v(b bVar) {
        this.f16274b = bVar;
    }

    @Override // p087j5.b
    public Object get() {
        Object obj;
        Object obj2 = this.f16273a;
        Object obj3 = f16272c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f16273a;
                if (obj == obj3) {
                    obj = this.f16274b.get();
                    this.f16273a = obj;
                    this.f16274b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
