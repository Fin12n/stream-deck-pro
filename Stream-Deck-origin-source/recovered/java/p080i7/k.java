package p080i7;

import p017b7.N;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f24784c;

    public k(Runnable runnable, long j8, i iVar) {
        super(j8, iVar);
        this.f24784c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f24784c.run();
        } finally {
            this.f24782b.a();
        }
    }

    public String toString() {
        return "Task[" + N.a(this.f24784c) + '@' + N.b(this.f24784c) + ", " + this.f24781a + ", " + this.f24782b + ']';
    }
}
