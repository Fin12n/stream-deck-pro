package O3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import p044e7.M;
import p044e7.O;
import p044e7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f7561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f7562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f7563c;

    public b(d stringProvider) {
        t.g(stringProvider, "stringProvider");
        this.f7561a = stringProvider;
        x xVarA = O.a(null);
        this.f7562b = xVarA;
        this.f7563c = xVarA;
    }

    public final void a() {
        Function0 function0C;
        a aVar = (a) this.f7562b.getValue();
        if (aVar != null && (function0C = aVar.c()) != null) {
            function0C.invoke();
        }
        this.f7562b.setValue(null);
    }

    public final M b() {
        return this.f7563c;
    }

    public final d c() {
        return this.f7561a;
    }

    public final void d(a viewData) {
        t.g(viewData, "viewData");
        this.f7562b.setValue(viewData);
    }
}
