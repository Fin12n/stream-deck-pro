package T6;

import X6.l;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9934a;

    public b(Object obj) {
        this.f9934a = obj;
    }

    @Override // T6.c
    public Object a(Object obj, l property) {
        t.g(property, "property");
        return this.f9934a;
    }

    @Override // T6.c
    public void b(Object obj, l property, Object obj2) {
        t.g(property, "property");
        Object obj3 = this.f9934a;
        if (d(property, obj3, obj2)) {
            this.f9934a = obj2;
            c(property, obj3, obj2);
        }
    }

    public void c(l property, Object obj, Object obj2) {
        t.g(property, "property");
    }

    public boolean d(l property, Object obj, Object obj2) {
        t.g(property, "property");
        return true;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f9934a + ')';
    }
}
