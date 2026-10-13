package p052f6;

import C6.r;
import G6.g;
import H6.c;
import I6.d;
import Q6.k;
import io.ktor.utils.io.j;
import java.io.IOException;
import p043e6.i;
import p043e6.n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22250c;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f22249b = obj;
            this.f22250c |= Integer.MIN_VALUE;
            return w.b(null, null, null, this);
        }
    }

    public static final Object a(i iVar, g gVar, k kVar, G6.d dVar) {
        y yVar = new y();
        kVar.invoke(yVar);
        return b(iVar, gVar, yVar.a(), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object b(i iVar, g gVar, x xVar, G6.d dVar) throws IOException {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f22250c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f22250c = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object objA = aVar2.f22249b;
        Object objF = c.f();
        int i9 = aVar2.f22250c;
        try {
            if (i9 == 0) {
                r.b(objA);
                n nVarC = iVar.c();
                io.ktor.utils.io.g gVarA = iVar.a();
                j jVarB = iVar.b();
                aVar2.f22248a = iVar;
                aVar2.f22250c = 1;
                objA = v.a(nVarC, gVarA, jVarB, xVar, gVar, aVar2);
                if (objA == objF) {
                    return objF;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = (i) aVar2.f22248a;
                r.b(objA);
            }
            return (n) objA;
        } catch (Throwable th) {
            iVar.a().f(th);
            iVar.b().d(th);
            iVar.c().close();
            throw th;
        }
    }
}
