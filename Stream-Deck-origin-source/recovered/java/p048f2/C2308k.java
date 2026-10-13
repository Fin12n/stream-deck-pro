package p048f2;

import D6.C0937q;
import D6.r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import p017b7.J;
import p017b7.K;
import p017b7.S0;
import p017b7.Z;
import p057g2.a;
import p057g2.b;

/* JADX INFO: renamed from: f2.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2308k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2308k f21599a = new C2308k();

    public static /* synthetic */ InterfaceC2307j c(C2308k c2308k, B b8, b bVar, List list, J j8, Function0 function0, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            bVar = null;
        }
        if ((i8 & 4) != 0) {
            list = r.n();
        }
        if ((i8 & 8) != 0) {
            j8 = K.a(Z.b().P1(S0.b(null, 1, null)));
        }
        return c2308k.a(b8, bVar, list, j8, function0);
    }

    public final InterfaceC2307j a(B serializer, b bVar, List migrations, J scope, Function0 produceFile) {
        t.g(serializer, "serializer");
        t.g(migrations, "migrations");
        t.g(scope, "scope");
        t.g(produceFile, "produceFile");
        return b(new p(serializer, null, produceFile, 2, null), bVar, migrations, scope);
    }

    public final InterfaceC2307j b(F storage, b bVar, List migrations, J scope) {
        t.g(storage, "storage");
        t.g(migrations, "migrations");
        t.g(scope, "scope");
        InterfaceC2303f aVar = bVar;
        if (bVar == null) {
            aVar = new a();
        }
        return new C2309l(storage, C0937q.e(C2306i.f21581a.b(migrations)), aVar, scope);
    }
}
