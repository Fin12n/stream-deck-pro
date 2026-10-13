package J5;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements G6.g.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4340b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G6.g f4341a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements G6.g.c {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public j(G6.g callContext) {
        t.g(callContext, "callContext");
        this.f4341a = callContext;
    }

    @Override // G6.g.b, G6.g
    public G6.g.b A(G6.g.c cVar) {
        return G6.g.b.a.b(this, cVar);
    }

    @Override // G6.g
    public G6.g P1(G6.g gVar) {
        return G6.g.b.a.d(this, gVar);
    }

    public final G6.g a() {
        return this.f4341a;
    }

    @Override // G6.g.b
    public G6.g.c getKey() {
        return f4340b;
    }

    @Override // G6.g.b, G6.g
    public G6.g j(G6.g.c cVar) {
        return G6.g.b.a.c(this, cVar);
    }

    @Override // G6.g.b, G6.g
    public Object t(Object obj, Q6.o oVar) {
        return G6.g.b.a.a(this, obj, oVar);
    }
}
