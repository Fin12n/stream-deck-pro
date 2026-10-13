package p115m6;

import C6.r;
import H6.c;
import I6.d;
import M6.eLZq.eGwOBWCdOTaKus;
import io.ktor.utils.io.g;
import p205x6.k;
import p205x6.y;

/* JADX INFO: renamed from: m6.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2697g {

    /* JADX INFO: renamed from: m6.g$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f30075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30076b;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f30075a = obj;
            this.f30076b |= Integer.MIN_VALUE;
            return AbstractC2697g.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object a(g gVar, G6.d dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f30076b;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f30076b = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object objA = aVar2.f30075a;
        Object objF = c.f();
        int i9 = aVar2.f30076b;
        if (i9 == 0) {
            r.b(objA);
            aVar2.f30076b = 1;
            objA = g.b.a(gVar, 0L, aVar2, 1, null);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException(eGwOBWCdOTaKus.enXnzP);
            }
            r.b(objA);
        }
        return y.c((k) objA, 0, 1, null);
    }
}
