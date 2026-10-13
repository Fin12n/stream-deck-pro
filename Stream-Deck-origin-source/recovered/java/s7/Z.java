package s7;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f33248a = D6.T.g(p125n7.a.w(C6.y.f1460b).getDescriptor(), p125n7.a.x(C6.A.f1408b).getDescriptor(), p125n7.a.v(C6.w.f1455b).getDescriptor(), p125n7.a.y(C6.D.f1414b).getDescriptor());

    public static final boolean a(o7.f fVar) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        return fVar.isInline() && kotlin.jvm.internal.t.c(fVar, r7.k.q());
    }

    public static final boolean b(o7.f fVar) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        return fVar.isInline() && f33248a.contains(fVar);
    }
}
