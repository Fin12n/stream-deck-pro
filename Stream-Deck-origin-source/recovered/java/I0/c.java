package I0;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.L0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements l, L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f3682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f3683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f3686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g.a f3687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f3688g = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            j jVar = c.this.f3682a;
            c cVar = c.this;
            Object obj = cVar.f3685d;
            if (obj != null) {
                return jVar.b(cVar, obj);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    }

    public c(j jVar, g gVar, String str, Object obj, Object[] objArr) {
        this.f3682a = jVar;
        this.f3683b = gVar;
        this.f3684c = str;
        this.f3685d = obj;
        this.f3686e = objArr;
    }

    @Override // I0.l
    public boolean a(Object obj) {
        g gVar = this.f3683b;
        return gVar == null || gVar.a(obj);
    }

    @Override // p215z0.L0
    public void b() {
        g.a aVar = this.f3687f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // p215z0.L0
    public void c() {
        g.a aVar = this.f3687f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // p215z0.L0
    public void d() {
        h();
    }

    public final Object g(Object[] objArr) {
        if (Arrays.equals(objArr, this.f3686e)) {
            return this.f3685d;
        }
        return null;
    }

    public final void h() {
        g gVar = this.f3683b;
        if (this.f3687f == null) {
            if (gVar != null) {
                b.c(gVar, this.f3688g.invoke());
                this.f3687f = gVar.d(this.f3684c, this.f3688g);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.f3687f + ") is not null").toString());
    }

    public final void i(j jVar, g gVar, String str, Object obj, Object[] objArr) {
        boolean z8;
        boolean z9 = true;
        if (this.f3683b != gVar) {
            this.f3683b = gVar;
            z8 = true;
        } else {
            z8 = false;
        }
        if (t.c(this.f3684c, str)) {
            z9 = z8;
        } else {
            this.f3684c = str;
        }
        this.f3682a = jVar;
        this.f3685d = obj;
        this.f3686e = objArr;
        g.a aVar = this.f3687f;
        if (aVar == null || !z9) {
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.f3687f = null;
        h();
    }
}
