package p009b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f15452b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f15453c;

    public B(boolean z8) {
        this.f15451a = z8;
    }

    public final void a(InterfaceC1740c cancellable) {
        t.g(cancellable, "cancellable");
        this.f15452b.add(cancellable);
    }

    public final Function0 b() {
        return this.f15453c;
    }

    public abstract void d();

    public void e(C1739b backEvent) {
        t.g(backEvent, "backEvent");
    }

    public void f(C1739b backEvent) {
        t.g(backEvent, "backEvent");
    }

    public final boolean g() {
        return this.f15451a;
    }

    public final void h() {
        Iterator it = this.f15452b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1740c) it.next()).cancel();
        }
    }

    public final void i(InterfaceC1740c cancellable) {
        t.g(cancellable, "cancellable");
        this.f15452b.remove(cancellable);
    }

    public final void j(boolean z8) {
        this.f15451a = z8;
        Function0 function0 = this.f15453c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void k(Function0 function0) {
        this.f15453c = function0;
    }

    public void c() {
    }
}
