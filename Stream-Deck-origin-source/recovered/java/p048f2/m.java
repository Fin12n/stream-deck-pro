package p048f2;

import kotlin.jvm.internal.t;
import p044e7.InterfaceC2260f;
import p044e7.O;
import p044e7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f21746a;

    public m() {
        I i8 = I.f21570b;
        t.e(i8, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f21746a = O.a(i8);
    }

    public final E a() {
        return (E) this.f21746a.getValue();
    }

    public final InterfaceC2260f b() {
        return this.f21746a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public final E c(E newState) {
        Object value;
        E e8;
        t.g(newState, "newState");
        x xVar = this.f21746a;
        do {
            value = xVar.getValue();
            e8 = (E) value;
            if (e8 instanceof y ? true : t.c(e8, I.f21570b)) {
                e8 = newState;
            } else if (e8 instanceof C2304g) {
                if (newState.a() > e8.a()) {
                    e8 = newState;
                }
            } else if (!(e8 instanceof s)) {
                throw new C6.m();
            }
        } while (!xVar.b(value, e8));
        return e8;
    }
}
