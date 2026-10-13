package p106l6;

import X6.d;
import X6.m;
import X6.n;
import kotlin.jvm.internal.t;
import p181u6.a;
import p181u6.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static final a a(a aVar) {
        t.g(aVar, "<this>");
        m mVarA = aVar.a();
        t.d(mVarA);
        m mVarC = ((n) mVarA.e().get(0)).c();
        t.d(mVarC);
        X6.f fVarF = mVarC.f();
        t.e(fVarF, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        return new a((d) fVarF, b.a(mVarC), mVarC);
    }
}
