package C6;

import D6.iIQ.BmWxZhjGfw;
import kotlin.jvm.internal.P;

/* JADX INFO: renamed from: C6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C0915d extends AbstractC0914c implements G6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q6.p f1424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public G6.d f1426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1427d;

    @Override // C6.AbstractC0914c
    public Object a(Object obj, G6.d dVar) {
        kotlin.jvm.internal.t.e(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f1426c = dVar;
        this.f1425b = obj;
        Object objF = H6.c.f();
        if (objF == H6.c.f()) {
            I6.h.c(dVar);
        }
        return objF;
    }

    public final Object b() {
        while (true) {
            Object obj = this.f1427d;
            G6.d dVar = this.f1426c;
            if (dVar == null) {
                r.b(obj);
                return obj;
            }
            if (q.d(AbstractC0913b.f1423a, obj)) {
                try {
                    Q6.p pVar = this.f1424a;
                    Object obj2 = this.f1425b;
                    Object objE = !(pVar instanceof I6.a) ? H6.b.e(pVar, this, obj2, dVar) : ((Q6.p) P.e(pVar, 3)).invoke(this, obj2, dVar);
                    if (objE != H6.c.f()) {
                        dVar.resumeWith(q.b(objE));
                    }
                } catch (Throwable th) {
                    q.a aVar = q.f1441b;
                    dVar.resumeWith(q.b(r.a(th)));
                }
            } else {
                this.f1427d = AbstractC0913b.f1423a;
                dVar.resumeWith(obj);
            }
        }
    }

    @Override // G6.d
    public G6.g getContext() {
        return G6.h.f2820a;
    }

    @Override // G6.d
    public void resumeWith(Object obj) {
        this.f1426c = null;
        this.f1427d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0915d(Q6.p block, Object obj) {
        super(null);
        kotlin.jvm.internal.t.g(block, "block");
        this.f1424a = block;
        this.f1425b = obj;
        kotlin.jvm.internal.t.e(this, BmWxZhjGfw.DeTOhAVw);
        this.f1426c = this;
        this.f1427d = AbstractC0913b.f1423a;
    }
}
