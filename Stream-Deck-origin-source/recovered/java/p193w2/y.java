package p193w2;

import G6.e;
import G6.g;
import Q6.o;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class y implements g.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f36917c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f36918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f36919b = new AtomicInteger(0);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements g.c {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public y(e eVar) {
        this.f36918a = eVar;
    }

    @Override // G6.g.b, G6.g
    public g.b A(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    @Override // G6.g
    public g P1(g gVar) {
        return g.b.a.d(this, gVar);
    }

    public final e a() {
        return this.f36918a;
    }

    @Override // G6.g.b
    public g.c getKey() {
        return f36917c;
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
