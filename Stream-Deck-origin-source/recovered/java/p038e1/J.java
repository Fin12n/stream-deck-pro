package p038e1;

import D6.M;
import Q6.k;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface J extends InterfaceC2244o {
    static /* synthetic */ I X0(J j8, int i8, int i9, Map map, k kVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i10 & 4) != 0) {
            map = M.g();
        }
        return j8.b1(i8, i9, map, kVar);
    }

    I b1(int i8, int i9, Map map, k kVar);
}
