package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class L extends P.e implements P.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application f15236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P.c f15237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f15238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC1726i f15239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p217z2.d f15240f;

    public L() {
        this.f15237c = new P.a();
    }

    @Override // androidx.lifecycle.P.c
    public O a(Class modelClass) {
        kotlin.jvm.internal.t.g(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.P.c
    public O c(Class modelClass, p153r2.a extras) {
        kotlin.jvm.internal.t.g(modelClass, "modelClass");
        kotlin.jvm.internal.t.g(extras, "extras");
        String str = (String) extras.a(P.d.f15255d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(I.f15227a) == null || extras.a(I.f15228b) == null) {
            if (this.f15239e != null) {
                return e(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(P.a.f15249h);
        boolean zIsAssignableFrom = C1718a.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? M.c(modelClass, M.f15242b) : M.c(modelClass, M.f15241a);
        if (constructorC == null) {
            return this.f15237c.c(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? M.d(modelClass, constructorC, I.a(extras)) : M.d(modelClass, constructorC, application, I.a(extras));
    }

    @Override // androidx.lifecycle.P.e
    public void d(O viewModel) {
        kotlin.jvm.internal.t.g(viewModel, "viewModel");
        if (this.f15239e != null) {
            p217z2.d dVar = this.f15240f;
            kotlin.jvm.internal.t.d(dVar);
            AbstractC1726i abstractC1726i = this.f15239e;
            kotlin.jvm.internal.t.d(abstractC1726i);
            C1725h.a(viewModel, dVar, abstractC1726i);
        }
    }

    public final O e(String key, Class cls) {
        O oD;
        Application application;
        kotlin.jvm.internal.t.g(key, "key");
        kotlin.jvm.internal.t.g(cls, yOZfxp.IoXTQOgMpkoxiME);
        AbstractC1726i abstractC1726i = this.f15239e;
        if (abstractC1726i == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = C1718a.class.isAssignableFrom(cls);
        Constructor constructorC = (!zIsAssignableFrom || this.f15236b == null) ? M.c(cls, M.f15242b) : M.c(cls, M.f15241a);
        if (constructorC == null) {
            return this.f15236b != null ? this.f15237c.a(cls) : P.d.f15253b.a().a(cls);
        }
        p217z2.d dVar = this.f15240f;
        kotlin.jvm.internal.t.d(dVar);
        H hB = C1725h.b(dVar, abstractC1726i, key, this.f15238d);
        if (!zIsAssignableFrom || (application = this.f15236b) == null) {
            oD = M.d(cls, constructorC, hB.c());
        } else {
            kotlin.jvm.internal.t.d(application);
            oD = M.d(cls, constructorC, application, hB.c());
        }
        oD.a("androidx.lifecycle.savedstate.vm.tag", hB);
        return oD;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public L(Application application, p217z2.f owner) {
        this(application, owner, null);
        kotlin.jvm.internal.t.g(owner, "owner");
    }

    public L(Application application, p217z2.f owner, Bundle bundle) {
        P.a aVar;
        kotlin.jvm.internal.t.g(owner, "owner");
        this.f15240f = owner.l();
        this.f15239e = owner.w();
        this.f15238d = bundle;
        this.f15236b = application;
        if (application != null) {
            aVar = P.a.f15247f.a(application);
        } else {
            aVar = new P.a();
        }
        this.f15237c = aVar;
    }
}
