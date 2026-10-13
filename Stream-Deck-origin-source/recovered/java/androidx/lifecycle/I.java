package androidx.lifecycle;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r2.a.b f15227a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r2.a.b f15228b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r2.a.b f15229c = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements r2.a.b {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements r2.a.b {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements r2.a.b {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements P.c {
        @Override // androidx.lifecycle.P.c
        public O c(Class modelClass, p153r2.a extras) {
            kotlin.jvm.internal.t.g(modelClass, "modelClass");
            kotlin.jvm.internal.t.g(extras, "extras");
            return new K();
        }
    }

    public static final F a(p153r2.a aVar) {
        kotlin.jvm.internal.t.g(aVar, "<this>");
        p217z2.f fVar = (p217z2.f) aVar.a(f15227a);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        S s8 = (S) aVar.a(f15228b);
        if (s8 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f15229c);
        String str = (String) aVar.a(P.d.f15255d);
        if (str != null) {
            return b(fVar, s8, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    public static final F b(p217z2.f fVar, S s8, String str, Bundle bundle) {
        J jD = d(fVar);
        K kE = e(s8);
        F f8 = (F) kE.e().get(str);
        if (f8 != null) {
            return f8;
        }
        F fA = F.f15216f.a(jD.b(str), bundle);
        kE.e().put(str, fA);
        return fA;
    }

    public static final void c(p217z2.f fVar) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        AbstractC1726i.b bVarB = fVar.w().b();
        if (bVarB != AbstractC1726i.b.INITIALIZED && bVarB != AbstractC1726i.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.l().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            J j8 = new J(fVar.l(), (S) fVar);
            fVar.l().h("androidx.lifecycle.internal.SavedStateHandlesProvider", j8);
            fVar.w().a(new G(j8));
        }
    }

    public static final J d(p217z2.f fVar) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        z2.d.c cVarC = fVar.l().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        J j8 = cVarC instanceof J ? (J) cVarC : null;
        if (j8 != null) {
            return j8;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final K e(S s8) {
        kotlin.jvm.internal.t.g(s8, "<this>");
        return (K) new P(s8, new d()).c("androidx.lifecycle.internal.SavedStateHandlesVM", K.class);
    }
}
