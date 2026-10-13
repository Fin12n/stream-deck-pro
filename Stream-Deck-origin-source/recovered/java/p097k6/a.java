package p097k6;

import D6.z;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f28694a;

    static {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(f.class, f.class.getClassLoader());
        t.f(serviceLoaderLoad, "load(it, it.classLoader)");
        f28694a = z.R0(serviceLoaderLoad);
    }

    public static final List a() {
        return f28694a;
    }
}
