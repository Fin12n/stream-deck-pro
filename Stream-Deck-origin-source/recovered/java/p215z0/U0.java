package p215z0;

import K0.b;
import R6.a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class U0 implements b, Iterable, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T0 f38679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38681c;

    public U0(T0 t8, int i8, int i9) {
        this.f38679a = t8;
        this.f38680b = i8;
        this.f38681c = i9;
    }

    private final void c() {
        if (this.f38679a.G() != this.f38681c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        c();
        P pO = this.f38679a.O(this.f38680b);
        if (pO != null) {
            return new n1(this.f38679a, pO);
        }
        T0 t8 = this.f38679a;
        int i8 = this.f38680b;
        return new N(t8, i8 + 1, i8 + V0.I(t8.y(), this.f38680b));
    }

    public /* synthetic */ U0(T0 t8, int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this(t8, i8, (i10 & 4) != 0 ? t8.G() : i9);
    }
}
