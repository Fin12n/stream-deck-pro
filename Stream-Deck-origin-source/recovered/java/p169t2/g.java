package p169t2;

import X6.d;
import androidx.lifecycle.InterfaceC1724g;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f34129a = new g();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements r2.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34130a = new a();
    }

    public final p153r2.a a(S owner) {
        t.g(owner, "owner");
        return owner instanceof InterfaceC1724g ? ((InterfaceC1724g) owner).g() : p153r2.a.C0703a.f32334b;
    }

    public final P.c b(S owner) {
        t.g(owner, "owner");
        return owner instanceof InterfaceC1724g ? ((InterfaceC1724g) owner).f() : c.f34123b;
    }

    public final String c(d modelClass) {
        t.g(modelClass, "modelClass");
        String strA = h.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final O d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
