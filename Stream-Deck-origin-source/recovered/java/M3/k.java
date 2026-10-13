package M3;

import com.elgato.vsd2.Messages;
import p017b7.J;
import p035d7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface k extends J {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static /* synthetic */ Object a(k kVar, String str, d dVar, G6.d dVar2, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i8 & 1) != 0) {
                str = null;
            }
            if ((i8 & 2) != 0) {
                dVar = null;
            }
            return kVar.D1(str, dVar, dVar2);
        }
    }

    Object D1(String str, d dVar, G6.d dVar2);

    x c();

    Object k1(Messages.ClientMessage clientMessage, G6.d dVar);
}
