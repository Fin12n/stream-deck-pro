package p215z0;

import C6.C0920i;
import K0.b;
import R6.a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T0 f38877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f38878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38880d;

    public n1(T0 t8, P p8) {
        this.f38877a = t8;
        this.f38878b = p8;
        this.f38879c = t8.G();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b next() {
        Object obj;
        ArrayList arrayListC = this.f38878b.c();
        if (arrayListC != null) {
            int i8 = this.f38880d;
            this.f38880d = i8 + 1;
            obj = arrayListC.get(i8);
        } else {
            obj = null;
        }
        if (obj instanceof C3147d) {
            return new U0(this.f38877a, ((C3147d) obj).a(), this.f38879c);
        }
        if (obj instanceof P) {
            return new o1(this.f38877a, (P) obj);
        }
        AbstractC3169o.v("Unexpected group information structure");
        throw new C0920i();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList arrayListC = this.f38878b.c();
        return arrayListC != null && this.f38880d < arrayListC.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
