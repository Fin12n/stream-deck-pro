package p130o3;

import p031d3.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f30894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f30895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f30896c;

    public c() {
        this.f30894a = new b();
        this.f30896c = null;
    }

    public Object a(b bVar) {
        return this.f30896c;
    }

    public final Object b(float f8, float f9, Object obj, Object obj2, float f10, float f11, float f12) {
        return a(this.f30894a.h(f8, f9, obj, obj2, f10, f11, f12));
    }

    public final void c(a aVar) {
        this.f30895b = aVar;
    }

    public c(Object obj) {
        this.f30894a = new b();
        this.f30896c = obj;
    }
}
