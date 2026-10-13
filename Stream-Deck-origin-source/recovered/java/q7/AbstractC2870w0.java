package q7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: q7.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2870w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o7.f[] f32158a = new o7.f[0];

    public static final Set a(o7.f fVar) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        if (fVar instanceof InterfaceC2852n) {
            return ((InterfaceC2852n) fVar).b();
        }
        HashSet hashSet = new HashSet(fVar.f());
        int iF = fVar.f();
        for (int i8 = 0; i8 < iF; i8++) {
            hashSet.add(fVar.g(i8));
        }
        return hashSet;
    }

    public static final o7.f[] b(List list) {
        o7.f[] fVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (o7.f[]) list.toArray(new o7.f[0])) == null) ? f32158a : fVarArr;
    }

    public static final X6.d c(X6.m mVar) {
        kotlin.jvm.internal.t.g(mVar, "<this>");
        X6.f fVarF = mVar.f();
        if (fVarF instanceof X6.d) {
            return (X6.d) fVarF;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + fVarF);
    }

    public static final String d(X6.d dVar) {
        kotlin.jvm.internal.t.g(dVar, "<this>");
        String strD = dVar.d();
        if (strD == null) {
            strD = "<local class name not available>";
        }
        return e(strD);
    }

    public static final String e(String className) {
        kotlin.jvm.internal.t.g(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final Void f(X6.d dVar) {
        kotlin.jvm.internal.t.g(dVar, "<this>");
        throw new p116m7.j(d(dVar));
    }

    public static final X6.m g(X6.n nVar) {
        kotlin.jvm.internal.t.g(nVar, "<this>");
        X6.m mVarC = nVar.c();
        if (mVarC != null) {
            return mVarC;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + nVar.c()).toString());
    }
}
