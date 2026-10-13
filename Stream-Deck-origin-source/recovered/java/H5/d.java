package H5;

import C6.r;
import p205x6.k;
import p205x6.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f3563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3565c;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f3564b = obj;
            this.f3565c |= Integer.MIN_VALUE;
            return d.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object a(b bVar, G6.d dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f3565c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f3565c = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object objA = aVar2.f3564b;
        Object objF = H6.c.f();
        int i9 = aVar2.f3565c;
        if (i9 == 0) {
            r.b(objA);
            io.ktor.utils.io.g gVarB = bVar.g().b();
            aVar2.f3563a = bVar;
            aVar2.f3565c = 1;
            objA = io.ktor.utils.io.g.b.a(gVarB, 0L, aVar2, 1, null);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) aVar2.f3563a;
            r.b(objA);
        }
        return new e(bVar.d(), bVar.f(), bVar.g(), y.c((k) objA, 0, 1, null));
    }
}
