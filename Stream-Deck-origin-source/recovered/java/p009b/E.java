package p009b;

import Q6.k;
import androidx.lifecycle.InterfaceC1733p;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends B {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k f15480d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z8, k kVar) {
            super(z8);
            this.f15480d = kVar;
        }

        @Override // p009b.B
        public void d() {
            this.f15480d.invoke(this);
        }
    }

    public static final B a(C c8, InterfaceC1733p interfaceC1733p, boolean z8, k onBackPressed) {
        t.g(c8, "<this>");
        t.g(onBackPressed, "onBackPressed");
        a aVar = new a(z8, onBackPressed);
        if (interfaceC1733p != null) {
            c8.h(interfaceC1733p, aVar);
            return aVar;
        }
        c8.i(aVar);
        return aVar;
    }

    public static /* synthetic */ B b(C c8, InterfaceC1733p interfaceC1733p, boolean z8, k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC1733p = null;
        }
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return a(c8, interfaceC1733p, z8, kVar);
    }
}
