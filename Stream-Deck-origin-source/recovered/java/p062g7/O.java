package p062g7;

import G6.g;
import kotlin.jvm.internal.t;
import p017b7.T0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f23830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f23831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T0[] f23832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23833d;

    public O(g gVar, int i8) {
        this.f23830a = gVar;
        this.f23831b = new Object[i8];
        this.f23832c = new T0[i8];
    }

    public final void a(T0 t8, Object obj) {
        Object[] objArr = this.f23831b;
        int i8 = this.f23833d;
        objArr[i8] = obj;
        T0[] t0Arr = this.f23832c;
        this.f23833d = i8 + 1;
        t.e(t8, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        t0Arr[i8] = t8;
    }

    public final void b(g gVar) {
        int length = this.f23832c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i8 = length - 1;
            T0 t8 = this.f23832c[length];
            t.d(t8);
            t8.O0(gVar, this.f23831b[length]);
            if (i8 < 0) {
                return;
            } else {
                length = i8;
            }
        }
    }
}
