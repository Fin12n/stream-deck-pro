package q7;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: q7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2826a implements p116m7.b {
    public /* synthetic */ AbstractC2826a(AbstractC2633k abstractC2633k) {
        this();
    }

    public static /* synthetic */ void i(AbstractC2826a abstractC2826a, p7.c cVar, int i8, Object obj, boolean z8, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i9 & 8) != 0) {
            z8 = true;
        }
        abstractC2826a.h(cVar, i8, obj, z8);
    }

    public abstract Object a();

    public abstract int b(Object obj);

    public abstract void c(Object obj, int i8);

    public abstract Iterator d(Object obj);

    public Object deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return f(decoder, null);
    }

    public abstract int e(Object obj);

    public final Object f(p7.e decoder, Object obj) {
        Object objA;
        kotlin.jvm.internal.t.g(decoder, "decoder");
        if (obj == null || (objA = k(obj)) == null) {
            objA = a();
        }
        Object obj2 = objA;
        int iB = b(obj2);
        p7.c cVarB = decoder.b(getDescriptor());
        if (!cVarB.x()) {
            while (true) {
                int iE = cVarB.E(getDescriptor());
                if (iE == -1) {
                    break;
                }
                i(this, cVarB, iB + iE, obj2, false, 8, null);
            }
        } else {
            g(cVarB, obj2, iB, j(cVarB, obj2));
        }
        cVarB.c(getDescriptor());
        return l(obj2);
    }

    public abstract void g(p7.c cVar, Object obj, int i8, int i9);

    public abstract void h(p7.c cVar, int i8, Object obj, boolean z8);

    public final int j(p7.c cVar, Object obj) {
        int iR = cVar.r(getDescriptor());
        c(obj, iR);
        return iR;
    }

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);

    public AbstractC2826a() {
    }
}
