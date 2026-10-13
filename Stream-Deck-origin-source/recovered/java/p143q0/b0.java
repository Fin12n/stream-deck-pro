package p143q0;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p176u1.M;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f31575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f31576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f31578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31579f;

    public b0() {
        this(0, 1, null);
    }

    public static /* synthetic */ void f(b0 b0Var, M m8, long j8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = d0.a();
        }
        b0Var.e(m8, j8);
    }

    public final void a() {
        this.f31579f = true;
    }

    public final void b(M m8) {
        M mB;
        this.f31579f = false;
        a aVar = this.f31575b;
        if (t.c(m8, aVar != null ? aVar.b() : null)) {
            return;
        }
        String strH = m8.h();
        a aVar2 = this.f31575b;
        if (t.c(strH, (aVar2 == null || (mB = aVar2.b()) == null) ? null : mB.h())) {
            a aVar3 = this.f31575b;
            if (aVar3 == null) {
                return;
            }
            aVar3.d(m8);
            return;
        }
        this.f31575b = new a(this.f31575b, m8);
        this.f31576c = null;
        int length = this.f31577d + m8.h().length();
        this.f31577d = length;
        if (length > this.f31574a) {
            d();
        }
    }

    public final M c() {
        a aVar = this.f31576c;
        if (aVar == null) {
            return null;
        }
        this.f31576c = aVar.a();
        this.f31575b = new a(this.f31575b, aVar.b());
        this.f31577d += aVar.b().h().length();
        return aVar.b();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public final void d() {
        a aVarA;
        a aVarA2 = this.f31575b;
        if ((aVarA2 != null ? aVarA2.a() : null) == null) {
            return;
        }
        while (true) {
            if (aVarA2 == null) {
                aVarA = null;
            } else {
                a aVarA3 = aVarA2.a();
                if (aVarA3 != null) {
                    aVarA = aVarA3.a();
                } else {
                    aVarA = null;
                }
            }
            if (aVarA == null) {
                break;
            } else {
                aVarA2 = aVarA2.a();
            }
        }
        if (aVarA2 == null) {
            return;
        }
        aVarA2.c(null);
    }

    public final void e(M m8, long j8) {
        if (!this.f31579f) {
            Long l8 = this.f31578e;
            if (j8 <= (l8 != null ? l8.longValue() : 0L) + ((long) c0.a())) {
                return;
            }
        }
        this.f31578e = Long.valueOf(j8);
        b(m8);
    }

    public final M g() {
        a aVarA;
        a aVar = this.f31575b;
        if (aVar == null || (aVarA = aVar.a()) == null) {
            return null;
        }
        this.f31575b = aVarA;
        this.f31577d -= aVar.b().h().length();
        this.f31576c = new a(this.f31576c, aVar.b());
        return aVarA.b();
    }

    public b0(int i8) {
        this.f31574a = i8;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f31580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public M f31581b;

        public a(a aVar, M m8) {
            this.f31580a = aVar;
            this.f31581b = m8;
        }

        public final a a() {
            return this.f31580a;
        }

        public final M b() {
            return this.f31581b;
        }

        public final void c(a aVar) {
            this.f31580a = aVar;
        }

        public final void d(M m8) {
            this.f31581b = m8;
        }

        public /* synthetic */ a(a aVar, M m8, int i8, AbstractC2633k abstractC2633k) {
            this((i8 & 1) != 0 ? null : aVar, m8);
        }
    }

    public /* synthetic */ b0(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 100000 : i8);
    }
}
