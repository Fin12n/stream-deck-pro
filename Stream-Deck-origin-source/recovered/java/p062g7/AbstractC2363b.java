package p062g7;

import F1.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: g7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2363b extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23835a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2363b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = AbstractC2362a.f23834a;

    @Override // p062g7.z
    public final Object a(Object obj) {
        Object objC = f23835a.get(this);
        if (objC == AbstractC2362a.f23834a) {
            objC = c(e(obj));
        }
        b(obj, objC);
        return objC;
    }

    public abstract void b(Object obj, Object obj2);

    public final Object c(Object obj) {
        Object obj2 = f23835a.get(this);
        Object obj3 = AbstractC2362a.f23834a;
        if (obj2 != obj3) {
            return obj2;
        }
        return b.a(f23835a, this, obj3, obj) ? obj : f23835a.get(this);
    }

    public abstract Object e(Object obj);
}
