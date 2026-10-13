package p191w0;

import D6.r;
import I0.j;
import I0.l;
import Q6.k;
import Q6.o;
import W6.n;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3185w0;
import p215z0.InterfaceC3158i0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class T0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f35693d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f35694e = I0.a.a(a.f35698a, b.f35699a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3158i0 f35695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3158i0 f35696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3158i0 f35697c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35698a = new a();

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(l lVar, T0 t8) {
            return r.q(Float.valueOf(t8.c()), Float.valueOf(t8.b()), Float.valueOf(t8.a()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35699a = new b();

        public b() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final T0 invoke(List list) {
            return new T0(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public c() {
        }
    }

    public T0(float f8, float f9, float f10) {
        this.f35695a = AbstractC3185w0.a(f8);
        this.f35696b = AbstractC3185w0.a(f10);
        this.f35697c = AbstractC3185w0.a(f9);
    }

    public final float a() {
        return this.f35696b.b();
    }

    public final float b() {
        return this.f35697c.b();
    }

    public final float c() {
        return this.f35695a.b();
    }

    public final float d() {
        if (c() == 0.0f) {
            return 0.0f;
        }
        return 1 - (n.j(c() - a(), c(), 0.0f) / c());
    }
}
