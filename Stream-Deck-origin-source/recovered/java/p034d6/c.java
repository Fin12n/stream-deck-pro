package p034d6;

import C6.m;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.x;
import p017b7.InterfaceC1795l;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f19846a = new e(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater[] f19847b;
    private volatile InterfaceC1795l acceptHandlerReference;
    private volatile InterfaceC1795l connectHandlerReference;
    private volatile InterfaceC1795l readHandlerReference;
    private volatile InterfaceC1795l writeHandlerReference;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e {
        public /* synthetic */ e(AbstractC2633k abstractC2633k) {
            this();
        }

        public final AtomicReferenceFieldUpdater b(p034d6.f fVar) {
            return c.f19847b[fVar.ordinal()];
        }

        public e() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19852a;

        static {
            int[] iArr = new int[p034d6.f.values().length];
            try {
                iArr[p034d6.f.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p034d6.f.f19867g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p034d6.f.ACCEPT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p034d6.f.CONNECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19852a = iArr;
        }
    }

    static {
        X6.c cVar;
        p034d6.f[] fVarArrA = p034d6.f.f19862b.a();
        ArrayList arrayList = new ArrayList(fVarArrA.length);
        for (p034d6.f fVar : fVarArrA) {
            int i8 = f.f19852a[fVar.ordinal()];
            if (i8 == 1) {
                cVar = new x() { // from class: d6.c.a
                    @Override // kotlin.jvm.internal.x, X6.k
                    public Object get(Object obj) {
                        return ((c) obj).readHandlerReference;
                    }
                };
            } else if (i8 == 2) {
                cVar = new x() { // from class: d6.c.b
                    @Override // kotlin.jvm.internal.x, X6.k
                    public Object get(Object obj) {
                        return ((c) obj).writeHandlerReference;
                    }
                };
            } else if (i8 == 3) {
                cVar = new x() { // from class: d6.c.c
                    @Override // kotlin.jvm.internal.x, X6.k
                    public Object get(Object obj) {
                        return ((c) obj).acceptHandlerReference;
                    }
                };
            } else {
                if (i8 != 4) {
                    throw new m();
                }
                cVar = new x() { // from class: d6.c.d
                    @Override // kotlin.jvm.internal.x, X6.k
                    public Object get(Object obj) {
                        return ((c) obj).connectHandlerReference;
                    }
                };
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(c.class, InterfaceC1795l.class, cVar.getName());
            t.e(atomicReferenceFieldUpdaterNewUpdater, "null cannot be cast to non-null type java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.ktor.network.selector.InterestSuspensionsMap, kotlinx.coroutines.CancellableContinuation<kotlin.Unit>?>");
            arrayList.add(atomicReferenceFieldUpdaterNewUpdater);
        }
        f19847b = (AtomicReferenceFieldUpdater[]) arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
    }

    public final InterfaceC1795l g(int i8) {
        return (InterfaceC1795l) f19847b[i8].getAndSet(this, null);
    }

    public final InterfaceC1795l h(p034d6.f interest) {
        t.g(interest, "interest");
        return (InterfaceC1795l) f19846a.b(interest).getAndSet(this, null);
    }

    public String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }

    public final void f(p034d6.f interest, InterfaceC1795l continuation) {
        t.g(interest, "interest");
        t.g(continuation, "continuation");
        if (F1.b.a(f19846a.b(interest), this, null, continuation)) {
            return;
        }
        throw new IllegalStateException("Handler for " + interest.name() + QhsKALGiniuQ.Xglr);
    }
}
