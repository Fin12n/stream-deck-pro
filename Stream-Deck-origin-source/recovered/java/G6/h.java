package G6;

import Q6.o;
import java.io.Serializable;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f2820a = new h();

    @Override // G6.g
    public g.b A(g.c key) {
        t.g(key, "key");
        return null;
    }

    @Override // G6.g
    public g P1(g context) {
        t.g(context, "context");
        return context;
    }

    public int hashCode() {
        return 0;
    }

    @Override // G6.g
    public g j(g.c key) {
        t.g(key, "key");
        return this;
    }

    @Override // G6.g
    public Object t(Object obj, o operation) {
        t.g(operation, "operation");
        return obj;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
