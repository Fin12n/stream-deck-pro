package q7;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: q7.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2845j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SoftReference f32121a = new SoftReference(null);

    public final synchronized Object a(Function0 factory) {
        kotlin.jvm.internal.t.g(factory, "factory");
        Object obj = this.f32121a.get();
        if (obj != null) {
            return obj;
        }
        Object objInvoke = factory.invoke();
        this.f32121a = new SoftReference(objInvoke);
        return objInvoke;
    }
}
