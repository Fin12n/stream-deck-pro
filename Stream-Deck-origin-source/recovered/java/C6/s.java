package C6;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements j, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f1444d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1445e = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Function0 f1446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f1447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1448c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public s(Function0 initializer) {
        kotlin.jvm.internal.t.g(initializer, "initializer");
        this.f1446a = initializer;
        C c8 = C.f1413a;
        this.f1447b = c8;
        this.f1448c = c8;
    }

    @Override // C6.j
    public Object getValue() {
        Object obj = this.f1447b;
        C c8 = C.f1413a;
        if (obj != c8) {
            return obj;
        }
        Function0 function0 = this.f1446a;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            if (F1.b.a(f1445e, this, c8, objInvoke)) {
                this.f1446a = null;
                return objInvoke;
            }
        }
        return this.f1447b;
    }

    @Override // C6.j
    public boolean isInitialized() {
        return this.f1447b != C.f1413a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
