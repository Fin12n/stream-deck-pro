package p035d7;

import G6.g;
import Q6.k;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.t;
import p017b7.b1;
import p062g7.D;
import p062g7.y;
import p221z6.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f19946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f19947f;

    public l(long j8, l lVar, e eVar, int i8) {
        super(j8, lVar, i8);
        this.f19946e = eVar;
        this.f19947f = new AtomicReferenceArray(f.f19919b * 2);
    }

    public final Object A(int i8) {
        return z().get(i8 * 2);
    }

    public final Object B(int i8) {
        return z().get((i8 * 2) + 1);
    }

    public final void C(int i8, boolean z8) {
        if (z8) {
            y().d1((this.f23815c * ((long) f.f19919b)) + ((long) i8));
        }
        t();
    }

    public final Object D(int i8) {
        Object objA = A(i8);
        w(i8);
        return objA;
    }

    public final void E(int i8, Object obj) {
        z().set(i8 * 2, obj);
    }

    public final void F(int i8, Object obj) {
        z().set((i8 * 2) + 1, obj);
    }

    public final void G(int i8, Object obj) {
        E(i8, obj);
    }

    @Override // p062g7.D
    public int r() {
        return f.f19919b;
    }

    @Override // p062g7.D
    public void s(int i8, Throwable th, g gVar) throws IllegalAccessException, InvocationTargetException {
        k kVar;
        k kVar2;
        int i9 = f.f19919b;
        boolean z8 = i8 >= i9;
        if (z8) {
            i8 -= i9;
        }
        Object objA = A(i8);
        while (true) {
            Object objB = B(i8);
            if ((objB instanceof b1) || (objB instanceof z)) {
                if (v(i8, objB, z8 ? f.f19927j : f.f19928k)) {
                    w(i8);
                    C(i8, !z8);
                    if (!z8 || (kVar = y().f19895b) == null) {
                        return;
                    }
                    y.b(kVar, objA, gVar);
                    return;
                }
            } else {
                if (objB == f.f19927j || objB == f.f19928k) {
                    break;
                }
                if (objB != f.f19924g && objB != f.f19923f) {
                    if (objB == f.f19926i || objB == f.f19921d || objB == f.z()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objB).toString());
                }
            }
        }
        w(i8);
        if (!z8 || (kVar2 = y().f19895b) == null) {
            return;
        }
        y.b(kVar2, objA, gVar);
    }

    public final boolean v(int i8, Object obj, Object obj2) {
        return c.a(z(), (i8 * 2) + 1, obj, obj2);
    }

    public final void w(int i8) {
        E(i8, null);
    }

    public final Object x(int i8, Object obj) {
        return z().getAndSet((i8 * 2) + 1, obj);
    }

    public final e y() {
        e eVar = this.f19946e;
        t.d(eVar);
        return eVar;
    }

    public final /* synthetic */ AtomicReferenceArray z() {
        return this.f19947f;
    }
}
