package D6;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class G implements Iterable, R6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f1927a;

    public G(Function0 iteratorFactory) {
        kotlin.jvm.internal.t.g(iteratorFactory, "iteratorFactory");
        this.f1927a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new H((Iterator) this.f1927a.invoke());
    }
}
