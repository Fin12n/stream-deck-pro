package p133o6;

import D6.M;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f30958a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "current");
    private volatile /* synthetic */ Object current = M.g();

    public final Object a(Object key) {
        t.g(key, "key");
        return ((Map) this.current).get(key);
    }
}
