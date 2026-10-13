package q7;

import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: q7.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2876z0 {
    public static final int a(o7.f fVar, o7.f[] typeParams) {
        kotlin.jvm.internal.t.g(fVar, uYOhHhTXuF.mxiR);
        kotlin.jvm.internal.t.g(typeParams, "typeParams");
        int iHashCode = (fVar.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable iterableA = o7.h.a(fVar);
        Iterator it = iterableA.iterator();
        int iHashCode2 = 1;
        int i8 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i9 = i8 * 31;
            String strA = ((o7.f) it.next()).a();
            if (strA != null) {
                iHashCode3 = strA.hashCode();
            }
            i8 = i9 + iHashCode3;
        }
        Iterator it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i10 = iHashCode2 * 31;
            o7.j jVarE = ((o7.f) it2.next()).e();
            iHashCode2 = i10 + (jVarE != null ? jVarE.hashCode() : 0);
        }
        return (((iHashCode * 31) + i8) * 31) + iHashCode2;
    }
}
