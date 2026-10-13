package B0;

import android.util.SparseArray;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f895a;

    public c(SparseArray sparseArray) {
        this.f895a = sparseArray;
    }

    public final Object a(int i8) {
        return this.f895a.get(i8);
    }

    public final void b(int i8, Object obj) {
        this.f895a.put(i8, obj);
    }

    public c(int i8) {
        this(new SparseArray(i8));
    }

    public /* synthetic */ c(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 10 : i8);
    }
}
