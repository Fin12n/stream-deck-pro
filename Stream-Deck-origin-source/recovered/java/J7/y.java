package J7;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f4437a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4438b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f4439c = new x(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference[] f4441e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4440d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i8 = 0; i8 < iHighestOneBit; i8++) {
            atomicReferenceArr[i8] = new AtomicReference();
        }
        f4441e = atomicReferenceArr;
    }

    public static final void b(x segment) {
        kotlin.jvm.internal.t.g(segment, "segment");
        if (segment.f4435f != null || segment.f4436g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f4433d) {
            return;
        }
        AtomicReference atomicReferenceA = f4437a.a();
        x xVar = f4439c;
        x xVar2 = (x) atomicReferenceA.getAndSet(xVar);
        if (xVar2 == xVar) {
            return;
        }
        int i8 = xVar2 != null ? xVar2.f4432c : 0;
        if (i8 >= f4438b) {
            atomicReferenceA.set(xVar2);
            return;
        }
        segment.f4435f = xVar2;
        segment.f4431b = 0;
        segment.f4432c = i8 + 8192;
        atomicReferenceA.set(segment);
    }

    public static final x c() {
        AtomicReference atomicReferenceA = f4437a.a();
        x xVar = f4439c;
        x xVar2 = (x) atomicReferenceA.getAndSet(xVar);
        if (xVar2 == xVar) {
            return new x();
        }
        if (xVar2 == null) {
            atomicReferenceA.set(null);
            return new x();
        }
        atomicReferenceA.set(xVar2.f4435f);
        xVar2.f4435f = null;
        xVar2.f4432c = 0;
        return xVar2;
    }

    public final AtomicReference a() {
        return f4441e[(int) (Thread.currentThread().getId() & (((long) f4440d) - 1))];
    }
}
