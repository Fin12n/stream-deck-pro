package F5;

import A5.m;
import D6.r;
import D6.z;
import Q6.k;
import Q6.o;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f2420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f2421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f2422c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f2423a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar) {
            super(2);
            this.f2423a = oVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o invoke(A5.h addSideEffect, Object obj) {
            t.g(addSideEffect, "$this$addSideEffect");
            return this.f2423a;
        }
    }

    public i(m key, k factory) {
        t.g(key, "key");
        t.g(factory, "factory");
        this.f2420a = key;
        this.f2421b = factory;
        this.f2422c = r.n();
    }

    @Override // F5.j
    public String a() {
        return A5.b.g();
    }

    @Override // F5.j
    public boolean b() {
        return !this.f2422c.isEmpty();
    }

    @Override // F5.j
    public d c(A5.h graph) {
        t.g(graph, "graph");
        return new f(graph, this);
    }

    public final i d(o sideEffect) {
        t.g(sideEffect, "sideEffect");
        this.f2422c = z.C0(this.f2422c, sideEffect);
        return this;
    }

    public final k e() {
        return this.f2421b;
    }

    public final List f() {
        return this.f2422c;
    }

    public final i g(o callback) {
        t.g(callback, "callback");
        return d(new a(callback));
    }

    @Override // F5.j
    public m getKey() {
        return this.f2420a;
    }
}
