package M7;

import N7.e;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a implements L7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f5779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Queue f5780c;

    public a(e eVar, Queue<d> queue) {
        this.f5779b = eVar;
        this.f5778a = eVar.getName();
        this.f5780c = queue;
    }

    @Override // L7.a
    public void a(String str) {
        d(b.WARN, null, str, null);
    }

    @Override // L7.a
    public void b(String str) {
        d(b.TRACE, null, str, null);
    }

    public final void c(b bVar, L7.c cVar, String str, Object[] objArr, Throwable th) {
        d dVar = new d();
        dVar.j(System.currentTimeMillis());
        dVar.c(bVar);
        dVar.d(this.f5779b);
        dVar.e(this.f5778a);
        dVar.f(cVar);
        dVar.g(str);
        dVar.h(Thread.currentThread().getName());
        dVar.b(objArr);
        dVar.i(th);
        this.f5780c.add(dVar);
    }

    public final void d(b bVar, L7.c cVar, String str, Throwable th) {
        c(bVar, cVar, str, null, th);
    }

    @Override // L7.a
    public String getName() {
        return this.f5778a;
    }
}
