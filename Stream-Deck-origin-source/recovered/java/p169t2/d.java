package p169t2;

import androidx.lifecycle.O;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.t;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f34124a = new d();

    public final O a(Class modelClass) throws InvocationTargetException {
        String str = RaiWHuj.UyguYAFzSmDhTps;
        t.g(modelClass, "modelClass");
        try {
            Object objNewInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
            t.f(objNewInstance, "{\n            modelClass…).newInstance()\n        }");
            return (O) objNewInstance;
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(str + modelClass, e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException(str + modelClass, e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(str + modelClass, e10);
        }
    }
}
