package O5;

import java.io.File;
import kotlin.jvm.internal.t;
import p017b7.F;
import p017b7.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static final a a(File directory, F dispatcher) {
        t.g(directory, "directory");
        t.g(dispatcher, "dispatcher");
        return new c(new f(directory, dispatcher));
    }

    public static /* synthetic */ a b(File file, F f8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f8 = Z.b();
        }
        return a(file, f8);
    }
}
