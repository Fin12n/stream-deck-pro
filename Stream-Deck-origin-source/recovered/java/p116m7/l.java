package p116m7;

import Q6.k;
import Q6.o;
import X6.f;
import X6.m;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import q7.AbstractC2854o;
import q7.InterfaceC2866u0;
import q7.J0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J0 f30142a = AbstractC2854o.a(c.f30150a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J0 f30143b = AbstractC2854o.a(d.f30151a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC2866u0 f30144c = AbstractC2854o.b(a.f30146a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC2866u0 f30145d = AbstractC2854o.b(b.f30148a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30146a = new a();

        /* JADX INFO: renamed from: m7.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0652a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f30147a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0652a(List list) {
                super(0);
                this.f30147a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f invoke() {
                return ((m) this.f30147a.get(0)).f();
            }
        }

        public a() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p116m7.b invoke(X6.d clazz, List types) {
            t.g(clazz, "clazz");
            t.g(types, "types");
            List listF = m.f(t7.d.a(), types, true);
            t.d(listF);
            return m.a(clazz, listF, new C0652a(types));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30148a = new b();

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f30149a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list) {
                super(0);
                this.f30149a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f invoke() {
                return ((m) this.f30149a.get(0)).f();
            }
        }

        public b() {
            super(2);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p116m7.b invoke(X6.d clazz, List types) {
            p116m7.b bVarU;
            t.g(clazz, "clazz");
            t.g(types, "types");
            List listF = m.f(t7.d.a(), types, true);
            t.d(listF);
            p116m7.b bVarA = m.a(clazz, listF, new a(types));
            if (bVarA == null || (bVarU = p125n7.a.u(bVarA)) == null) {
                return null;
            }
            return bVarU;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f30150a = new c();

        public c() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p116m7.b invoke(X6.d it) {
            t.g(it, "it");
            return m.d(it);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f30151a = new d();

        public d() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p116m7.b invoke(X6.d it) {
            p116m7.b bVarU;
            t.g(it, "it");
            p116m7.b bVarD = m.d(it);
            if (bVarD == null || (bVarU = p125n7.a.u(bVarD)) == null) {
                return null;
            }
            return bVarU;
        }
    }

    public static final p116m7.b a(X6.d clazz, boolean z8) {
        t.g(clazz, "clazz");
        if (z8) {
            return f30143b.a(clazz);
        }
        p116m7.b bVarA = f30142a.a(clazz);
        if (bVarA != null) {
            return bVarA;
        }
        return null;
    }

    public static final Object b(X6.d clazz, List types, boolean z8) {
        t.g(clazz, "clazz");
        t.g(types, "types");
        return !z8 ? f30144c.a(clazz, types) : f30145d.a(clazz, types);
    }
}
