package p052f6;

import C6.r;
import H6.c;
import I6.d;
import io.ktor.utils.io.g;
import io.ktor.utils.io.j;
import p035d7.q;
import p043e6.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f22245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f22246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22247e;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22246d = obj;
            this.f22247e |= Integer.MIN_VALUE;
            return v.a(null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(n nVar, g gVar, j jVar, x xVar, G6.g gVar2, G6.d dVar) throws A {
        a aVar;
        n nVar2;
        t tVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f22247e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f22247e = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f22246d;
        Object objF = c.f();
        int i9 = aVar.f22247e;
        try {
            if (i9 == 0) {
                r.b(obj);
                t tVar2 = new t(gVar, jVar, xVar, gVar2);
                aVar.f22243a = nVar;
                aVar.f22244b = gVar2;
                aVar.f22245c = tVar2;
                aVar.f22247e = 1;
                if (tVar2.z(aVar) == objF) {
                    return objF;
                }
                nVar2 = nVar;
                tVar = tVar2;
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = (t) aVar.f22245c;
                gVar2 = (G6.g) aVar.f22244b;
                nVar2 = (n) aVar.f22243a;
                r.b(obj);
            }
            return new G(tVar.u(), tVar.w(), nVar2, gVar2);
        } catch (q e8) {
            throw new A("Negotiation failed due to EOS", e8);
        }
    }
}
