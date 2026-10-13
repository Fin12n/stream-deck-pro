package p143q0;

import A1.d;
import A1.t;
import p128o1.I;
import p168t1.AbstractC3009n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f31512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f31513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC3009n.b f31514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public I f31515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f31516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f31517f = a();

    public T(t tVar, d dVar, AbstractC3009n.b bVar, I i8, Object obj) {
        this.f31512a = tVar;
        this.f31513b = dVar;
        this.f31514c = bVar;
        this.f31515d = i8;
        this.f31516e = obj;
    }

    public final long a() {
        return J.b(this.f31515d, this.f31513b, this.f31514c, null, 0, 24, null);
    }

    public final long b() {
        return this.f31517f;
    }

    public final void c(t tVar, d dVar, AbstractC3009n.b bVar, I i8, Object obj) {
        if (tVar == this.f31512a && kotlin.jvm.internal.t.c(dVar, this.f31513b) && kotlin.jvm.internal.t.c(bVar, this.f31514c) && kotlin.jvm.internal.t.c(i8, this.f31515d) && kotlin.jvm.internal.t.c(obj, this.f31516e)) {
            return;
        }
        this.f31512a = tVar;
        this.f31513b = dVar;
        this.f31514c = bVar;
        this.f31515d = i8;
        this.f31516e = obj;
        this.f31517f = a();
    }
}
