package p037e0;

import Q6.k;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: e0.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2214j {
    public static final AbstractC2221q b(j0 j0Var, Object obj) {
        if (obj == null) {
            return null;
        }
        return (AbstractC2221q) j0Var.a().invoke(obj);
    }

    public static final K c(A a8, W w8, long j8) {
        return new K(a8, w8, j8, (AbstractC2633k) null);
    }

    public static /* synthetic */ K d(A a8, W w8, long j8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            w8 = W.Restart;
        }
        if ((i8 & 4) != 0) {
            j8 = b0.c(0, 0, 2, null);
        }
        return c(a8, w8, j8);
    }

    public static final O e(k kVar) {
        O.b bVar = new O.b();
        kVar.invoke(bVar);
        return new O(bVar);
    }

    public static final a0 f(float f8, float f9, Object obj) {
        return new a0(f8, f9, obj);
    }

    public static /* synthetic */ a0 g(float f8, float f9, Object obj, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            f8 = 1.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 1500.0f;
        }
        if ((i8 & 4) != 0) {
            obj = null;
        }
        return f(f8, f9, obj);
    }

    public static final i0 h(int i8, int i9, B b8) {
        return new i0(i8, i9, b8);
    }

    public static /* synthetic */ i0 i(int i8, int i9, B b8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = RCHTTPStatusCodes.UNSUCCESSFUL;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            b8 = D.d();
        }
        return h(i8, i9, b8);
    }
}
