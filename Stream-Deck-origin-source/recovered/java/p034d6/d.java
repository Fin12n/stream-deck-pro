package p034d6;

import F1.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19853a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new e(8);

    public final boolean a(Object element) {
        t.g(element, "element");
        while (true) {
            e eVar = (e) this._cur;
            int iA = eVar.a(element);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                b.a(f19853a, this, eVar, eVar.h());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            e eVar = (e) this._cur;
            if (eVar.d()) {
                return;
            } else {
                b.a(f19853a, this, eVar, eVar.h());
            }
        }
    }

    public final boolean c() {
        return ((e) this._cur).f();
    }

    public final Object d() {
        while (true) {
            e eVar = (e) this._cur;
            Object objI = eVar.i();
            if (objI != e.f19857g) {
                return objI;
            }
            b.a(f19853a, this, eVar, eVar.h());
        }
    }
}
