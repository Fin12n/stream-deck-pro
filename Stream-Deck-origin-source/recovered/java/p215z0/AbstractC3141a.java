package p215z0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: z0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3141a implements InterfaceC3149e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38727b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f38728c;

    public AbstractC3141a(Object obj) {
        this.f38726a = obj;
        this.f38728c = obj;
    }

    @Override // p215z0.InterfaceC3149e
    public Object b() {
        return this.f38728c;
    }

    @Override // p215z0.InterfaceC3149e
    public final void clear() {
        this.f38727b.clear();
        l(this.f38726a);
        k();
    }

    @Override // p215z0.InterfaceC3149e
    public void d(Object obj) {
        this.f38727b.add(b());
        l(obj);
    }

    @Override // p215z0.InterfaceC3149e
    public void g() {
        if (this.f38727b.isEmpty()) {
            throw new IllegalStateException("empty stack");
        }
        List list = this.f38727b;
        l(list.remove(list.size() - 1));
    }

    public final Object j() {
        return this.f38726a;
    }

    public abstract void k();

    public void l(Object obj) {
        this.f38728c = obj;
    }
}
