package p215z0;

import B0.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E0 f38662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f38664c;

    public T(E0 e8, int i8, b bVar) {
        this.f38662a = e8;
        this.f38663b = i8;
        this.f38664c = bVar;
    }

    public final b a() {
        return this.f38664c;
    }

    public final int b() {
        return this.f38663b;
    }

    public final E0 c() {
        return this.f38662a;
    }

    public final boolean d() {
        return this.f38662a.v(this.f38664c);
    }

    public final void e(b bVar) {
        this.f38664c = bVar;
    }
}
