package p062g7;

import F1.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23864a = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public s(boolean z8) {
        this._cur$volatile = new t(8, z8);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23864a;
        while (true) {
            t tVar = (t) atomicReferenceFieldUpdater.get(this);
            int iA = tVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                b.a(f23864a, this, tVar, tVar.l());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23864a;
        while (true) {
            t tVar = (t) atomicReferenceFieldUpdater.get(this);
            if (tVar.d()) {
                return;
            } else {
                b.a(f23864a, this, tVar, tVar.l());
            }
        }
    }

    public final int c() {
        return ((t) f23864a.get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23864a;
        while (true) {
            t tVar = (t) atomicReferenceFieldUpdater.get(this);
            Object objM = tVar.m();
            if (objM != t.f23868h) {
                return objM;
            }
            b.a(f23864a, this, tVar, tVar.l());
        }
    }
}
