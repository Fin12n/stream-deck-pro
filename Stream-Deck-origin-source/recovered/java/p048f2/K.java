package p048f2;

import G6.g;
import Q6.o;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class K implements g.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21572c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f21573d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f21574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2309l f21575b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: f2.K$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0507a implements g.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0507a f21576a = new C0507a();
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public K(K k8, C2309l instance) {
        t.g(instance, "instance");
        this.f21574a = k8;
        this.f21575b = instance;
    }

    @Override // G6.g.b, G6.g
    public g.b A(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // G6.g
    public g P1(g gVar) {
        return g.b.a.d(this, gVar);
    }

    public final void a(InterfaceC2307j candidate) {
        t.g(candidate, "candidate");
        if (this.f21575b == candidate) {
            throw new IllegalStateException(f21573d.toString());
        }
        K k8 = this.f21574a;
        if (k8 != null) {
            k8.a(candidate);
        }
    }

    @Override // G6.g.b
    public g.c getKey() {
        return a.C0507a.f21576a;
    }

    @Override // G6.g.b, G6.g
    public g j(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // G6.g.b, G6.g
    public Object t(Object obj, o oVar) {
        return g.b.a.a(this, obj, oVar);
    }
}
