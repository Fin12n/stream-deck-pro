package p017b7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: b7.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C1822z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15994b = AtomicIntegerFieldUpdater.newUpdater(C1822z.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f15995a;

    public C1822z(Throwable th, boolean z8) {
        this.f15995a = th;
        this._handled$volatile = z8 ? 1 : 0;
    }

    public final boolean a() {
        return f15994b.get(this) != 0;
    }

    public final boolean c() {
        return f15994b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return N.a(this) + '[' + this.f15995a + ']';
    }

    public /* synthetic */ C1822z(Throwable th, boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this(th, (i8 & 2) != 0 ? false : z8);
    }
}
