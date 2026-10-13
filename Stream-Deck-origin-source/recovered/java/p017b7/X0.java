package p017b7;

import C6.r;
import H6.c;
import I6.d;
import I6.h;
import Q6.o;
import kotlin.jvm.internal.J;
import p071h7.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class X0 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f15925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f15926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f15927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f15928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15929e;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f15928d = obj;
            this.f15929e |= Integer.MIN_VALUE;
            return X0.e(0L, null, this);
        }
    }

    public static final V0 a(long j8, T t8, InterfaceC1815v0 interfaceC1815v0) {
        return new V0("Timed out waiting for " + j8 + " ms", interfaceC1815v0);
    }

    public static final Object b(W0 w8, o oVar) {
        AbstractC1823z0.k(w8, U.c(w8.f23813d.getContext()).o(w8.f15924e, w8, w8.getContext()));
        return b.c(w8, w8, oVar);
    }

    public static final Object c(long j8, o oVar, G6.d dVar) {
        if (j8 <= 0) {
            throw new V0("Timed out immediately");
        }
        Object objB = b(new W0(j8, dVar), oVar);
        if (objB == c.f()) {
            h.c(dVar);
        }
        return objB;
    }

    public static final Object d(long j8, o oVar, G6.d dVar) {
        return c(U.d(j8), oVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(long j8, o oVar, G6.d dVar) {
        a aVar;
        J j9;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f15929e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f15929e = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f15928d;
        Object objF = c.f();
        int i9 = aVar.f15929e;
        if (i9 == 0) {
            r.b(obj);
            if (j8 <= 0) {
                return null;
            }
            J j10 = new J();
            try {
                aVar.f15926b = oVar;
                aVar.f15927c = j10;
                aVar.f15925a = j8;
                aVar.f15929e = 1;
                W0 w8 = new W0(j8, aVar);
                j10.f28779a = w8;
                Object objB = b(w8, oVar);
                if (objB == c.f()) {
                    h.c(aVar);
                }
                return objB == objF ? objF : objB;
            } catch (V0 e8) {
                e = e8;
                j9 = j10;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j9 = (J) aVar.f15927c;
            try {
                r.b(obj);
                return obj;
            } catch (V0 e9) {
                e = e9;
            }
        }
        if (e.f15922a == j9.f28779a) {
            return null;
        }
        throw e;
    }
}
