package p153r2;

import P6.a;
import X6.d;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final O a(P.c factory, d modelClass, a extras) {
        t.g(factory, "factory");
        t.g(modelClass, "modelClass");
        t.g(extras, "extras");
        try {
            try {
                return factory.b(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return factory.a(a.a(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return factory.c(a.a(modelClass), extras);
        }
    }
}
