package p040e3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p004a3.C1705k;
import p017b7.AbstractC1816w;
import p017b7.InterfaceC1812u;
import p215z0.InterfaceC3164l0;
import p215z0.g1;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1812u f20695a = AbstractC1816w.b(null, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3164l0 f20696b = l1.e(null, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3164l0 f20697c = l1.e(null, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q1 f20698d = g1.d(new c());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1 f20699e = g1.d(new a());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q1 f20700f = g1.d(new b());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q1 f20701g = g1.d(new d());

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((l.this.getValue() == null && l.this.o() == null) ? false : true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(l.this.o() != null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(l.this.getValue() == null && l.this.o() == null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(l.this.getValue() != null);
        }
    }

    public boolean A() {
        return ((Boolean) this.f20701g.getValue()).booleanValue();
    }

    public final void B(Throwable th) {
        this.f20697c.setValue(th);
    }

    public final void C(C1705k c1705k) {
        this.f20696b.setValue(c1705k);
    }

    public final synchronized void c(C1705k composition) {
        t.g(composition, "composition");
        if (s()) {
            return;
        }
        C(composition);
        this.f20695a.r1(composition);
    }

    public final synchronized void e(Throwable error) {
        t.g(error, "error");
        if (s()) {
            return;
        }
        B(error);
        this.f20695a.v(error);
    }

    public Throwable o() {
        return (Throwable) this.f20697c.getValue();
    }

    @Override // p215z0.q1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C1705k getValue() {
        return (C1705k) this.f20696b.getValue();
    }

    public boolean s() {
        return ((Boolean) this.f20699e.getValue()).booleanValue();
    }
}
