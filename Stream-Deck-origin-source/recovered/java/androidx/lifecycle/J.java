package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class J implements z2.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p217z2.d f15230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f15232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C6.j f15233d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ S f15234a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(S s8) {
            super(0);
            this.f15234a = s8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K invoke() {
            return I.e(this.f15234a);
        }
    }

    public J(p217z2.d savedStateRegistry, S viewModelStoreOwner) {
        kotlin.jvm.internal.t.g(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.t.g(viewModelStoreOwner, "viewModelStoreOwner");
        this.f15230a = savedStateRegistry;
        this.f15233d = C6.k.b(new a(viewModelStoreOwner));
    }

    @Override // z2.d.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f15232c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().e().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((F) entry.getValue()).c().a();
            if (!kotlin.jvm.internal.t.c(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f15231b = false;
        return bundle;
    }

    public final Bundle b(String key) {
        kotlin.jvm.internal.t.g(key, "key");
        d();
        Bundle bundle = this.f15232c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f15232c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f15232c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.f15232c = null;
        }
        return bundle2;
    }

    public final K c() {
        return (K) this.f15233d.getValue();
    }

    public final void d() {
        if (this.f15231b) {
            return;
        }
        Bundle bundleB = this.f15230a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f15232c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleB != null) {
            bundle.putAll(bundleB);
        }
        this.f15232c = bundle;
        this.f15231b = true;
        c();
    }
}
