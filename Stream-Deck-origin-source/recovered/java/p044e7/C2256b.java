package p044e7;

import C6.G;
import C6.r;
import G6.g;
import G6.h;
import H6.c;
import I6.d;
import Q6.o;
import kotlin.jvm.internal.AbstractC2633k;
import p035d7.v;
import p053f7.e;

/* JADX INFO: renamed from: e7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2256b extends C2258d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f20974e;

    /* JADX INFO: renamed from: e7.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f20976b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20978d;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f20976b = obj;
            this.f20978d |= Integer.MIN_VALUE;
            return C2256b.this.h(null, this);
        }
    }

    public /* synthetic */ C2256b(o oVar, g gVar, int i8, p035d7.d dVar, int i9, AbstractC2633k abstractC2633k) {
        this(oVar, (i9 & 2) != 0 ? h.f2820a : gVar, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? p035d7.d.SUSPEND : dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p044e7.C2258d, p053f7.e
    public Object h(v vVar, G6.d dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f20978d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f20978d = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f20976b;
        Object objF = c.f();
        int i9 = aVar.f20978d;
        if (i9 == 0) {
            r.b(obj);
            aVar.f20975a = vVar;
            aVar.f20978d = 1;
            if (super.h(vVar, aVar) == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (v) aVar.f20975a;
            r.b(obj);
        }
        if (vVar.n()) {
            return G.f1419a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // p044e7.C2258d, p053f7.e
    public e i(g gVar, int i8, p035d7.d dVar) {
        return new C2256b(this.f20974e, gVar, i8, dVar);
    }

    public C2256b(o oVar, g gVar, int i8, p035d7.d dVar) {
        super(oVar, gVar, i8, dVar);
        this.f20974e = oVar;
    }
}
