package J0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f3924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f3925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map.Entry f3927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map.Entry f3928e;

    public D(x xVar, Iterator<? extends Map.Entry<Object, Object>> it) {
        this.f3924a = xVar;
        this.f3925b = it;
        this.f3926c = xVar.d();
        d();
    }

    public final void d() {
        this.f3927d = this.f3928e;
        this.f3928e = this.f3925b.hasNext() ? (Map.Entry) this.f3925b.next() : null;
    }

    public final Map.Entry e() {
        return this.f3927d;
    }

    public final x f() {
        return this.f3924a;
    }

    public final Map.Entry g() {
        return this.f3928e;
    }

    public final boolean hasNext() {
        return this.f3928e != null;
    }

    public final void remove() {
        if (f().d() != this.f3926c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f3927d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.f3924a.remove(entry.getKey());
        this.f3927d = null;
        C6.G g8 = C6.G.f1419a;
        this.f3926c = f().d();
    }
}
