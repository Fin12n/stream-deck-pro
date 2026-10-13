package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1725h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1725h f15285a = new C1725h();

    /* JADX INFO: renamed from: androidx.lifecycle.h$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements z2.d.a {
        @Override // z2.d.a
        public void a(p217z2.f owner) {
            kotlin.jvm.internal.t.g(owner, "owner");
            if (!(owner instanceof S)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            Q qK = ((S) owner).k();
            p217z2.d dVarL = owner.l();
            Iterator it = qK.c().iterator();
            while (it.hasNext()) {
                O oB = qK.b((String) it.next());
                kotlin.jvm.internal.t.d(oB);
                C1725h.a(oB, dVarL, owner.w());
            }
            if (qK.c().isEmpty()) {
                return;
            }
            dVarL.i(a.class);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.h$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC1730m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1726i f15286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p217z2.d f15287b;

        public b(AbstractC1726i abstractC1726i, p217z2.d dVar) {
            this.f15286a = abstractC1726i;
            this.f15287b = dVar;
        }

        @Override // androidx.lifecycle.InterfaceC1730m
        public void j(InterfaceC1733p source, AbstractC1726i.a event) {
            kotlin.jvm.internal.t.g(source, "source");
            kotlin.jvm.internal.t.g(event, "event");
            if (event == AbstractC1726i.a.ON_START) {
                this.f15286a.d(this);
                this.f15287b.i(a.class);
            }
        }
    }

    public static final void a(O viewModel, p217z2.d registry, AbstractC1726i lifecycle) {
        kotlin.jvm.internal.t.g(viewModel, "viewModel");
        kotlin.jvm.internal.t.g(registry, "registry");
        kotlin.jvm.internal.t.g(lifecycle, "lifecycle");
        H h8 = (H) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (h8 == null || h8.o()) {
            return;
        }
        h8.b(registry, lifecycle);
        f15285a.c(registry, lifecycle);
    }

    public static final H b(p217z2.d registry, AbstractC1726i lifecycle, String str, Bundle bundle) {
        kotlin.jvm.internal.t.g(registry, "registry");
        kotlin.jvm.internal.t.g(lifecycle, "lifecycle");
        kotlin.jvm.internal.t.d(str);
        H h8 = new H(str, F.f15216f.a(registry.b(str), bundle));
        h8.b(registry, lifecycle);
        f15285a.c(registry, lifecycle);
        return h8;
    }

    public final void c(p217z2.d dVar, AbstractC1726i abstractC1726i) {
        AbstractC1726i.b bVarB = abstractC1726i.b();
        if (bVarB == AbstractC1726i.b.INITIALIZED || bVarB.b(AbstractC1726i.b.STARTED)) {
            dVar.i(a.class);
        } else {
            abstractC1726i.a(new b(abstractC1726i, dVar));
        }
    }
}
