package p024c5;

import p087j5.a;
import p087j5.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class A implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16210c = y.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f16211d = z.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f16212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f16213b;

    public A(a aVar, b bVar) {
        this.f16212a = aVar;
        this.f16213b = bVar;
    }

    public static A a() {
        return new A(f16210c, f16211d);
    }

    public static /* synthetic */ Object c() {
        return null;
    }

    public void d(b bVar) {
        a aVar;
        if (this.f16213b != f16211d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f16212a;
            this.f16212a = null;
            this.f16213b = bVar;
        }
        aVar.a(bVar);
    }

    @Override // p087j5.b
    public Object get() {
        return this.f16213b.get();
    }

    public static /* synthetic */ void b(b bVar) {
    }
}
