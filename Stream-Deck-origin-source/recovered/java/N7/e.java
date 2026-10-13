package N7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class e implements L7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile L7.a f7520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f7521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Method f7522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public M7.a f7523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Queue f7524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7525g;

    public e(String str, Queue<M7.d> queue, boolean z8) {
        this.f7519a = str;
        this.f7524f = queue;
        this.f7525g = z8;
    }

    @Override // L7.a
    public void a(String str) {
        c().a(str);
    }

    @Override // L7.a
    public void b(String str) {
        c().b(str);
    }

    public L7.a c() {
        if (this.f7520b != null) {
            return this.f7520b;
        }
        return this.f7525g ? b.f7517b : d();
    }

    public final L7.a d() {
        if (this.f7523e == null) {
            this.f7523e = new M7.a(this, this.f7524f);
        }
        return this.f7523e;
    }

    public boolean e() {
        Boolean bool = this.f7521c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f7522d = this.f7520b.getClass().getMethod("log", M7.c.class);
            this.f7521c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f7521c = Boolean.FALSE;
        }
        return this.f7521c.booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f7519a.equals(((e) obj).f7519a);
    }

    public boolean f() {
        return this.f7520b instanceof b;
    }

    public boolean g() {
        return this.f7520b == null;
    }

    @Override // L7.a
    public String getName() {
        return this.f7519a;
    }

    public void h(M7.c cVar) {
        if (e()) {
            try {
                this.f7522d.invoke(this.f7520b, cVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public int hashCode() {
        return this.f7519a.hashCode();
    }

    public void i(L7.a aVar) {
        this.f7520b = aVar;
    }
}
