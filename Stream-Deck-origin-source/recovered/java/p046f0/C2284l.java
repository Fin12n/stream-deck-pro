package p046f0;

import L0.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p056g1.p0;
import p110m1.h;
import p110m1.x;

/* JADX INFO: renamed from: f0.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2284l extends i.c implements p0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f21481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f21482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Function0 f21483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f21484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Function0 f21485s;

    /* JADX INFO: renamed from: f0.l$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            C2284l.this.f21483q.invoke();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: f0.l$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            Function0 function0 = C2284l.this.f21485s;
            if (function0 != null) {
                function0.invoke();
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ C2284l(boolean z8, String str, h hVar, Function0 function0, String str2, Function0 function1, AbstractC2633k abstractC2633k) {
        this(z8, str, hVar, function0, str2, function1);
    }

    @Override // p056g1.p0
    public void Q(x xVar) {
        h hVar = this.f21482p;
        if (hVar != null) {
            t.d(hVar);
            p110m1.u.S(xVar, hVar.n());
        }
        p110m1.u.u(xVar, this.f21481o, new a());
        if (this.f21485s != null) {
            p110m1.u.y(xVar, this.f21484r, new b());
        }
        if (this.f21480n) {
            return;
        }
        p110m1.u.k(xVar);
    }

    public final void f2(boolean z8, String str, h hVar, Function0 function0, String str2, Function0 function1) {
        this.f21480n = z8;
        this.f21481o = str;
        this.f21482p = hVar;
        this.f21483q = function0;
        this.f21484r = str2;
        this.f21485s = function1;
    }

    @Override // p056g1.p0
    public boolean k1() {
        return true;
    }

    public C2284l(boolean z8, String str, h hVar, Function0 function0, String str2, Function0 function1) {
        this.f21480n = z8;
        this.f21481o = str;
        this.f21482p = hVar;
        this.f21483q = function0;
        this.f21484r = str2;
        this.f21485s = function1;
    }
}
