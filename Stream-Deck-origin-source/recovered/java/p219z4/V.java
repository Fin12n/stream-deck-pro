package p219z4;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f39112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39113b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3194c f39114c;

    public V(AbstractC3194c abstractC3194c, Object obj) {
        this.f39114c = abstractC3194c;
        this.f39112a = obj;
    }

    public abstract void a(Object obj);

    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f39112a;
                if (this.f39113b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f39113b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f39112a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f39114c.f39148r) {
            this.f39114c.f39148r.remove(this);
        }
    }
}
