package s7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f0 {
    public static final o7.f a(o7.f fVar, t7.c module) {
        o7.f fVarA;
        kotlin.jvm.internal.t.g(fVar, "<this>");
        kotlin.jvm.internal.t.g(module, "module");
        if (!kotlin.jvm.internal.t.c(fVar.e(), o7.j.a.f31002a)) {
            return fVar.isInline() ? a(fVar.i(0), module) : fVar;
        }
        o7.f fVarB = o7.b.b(module, fVar);
        return (fVarB == null || (fVarA = a(fVarB, module)) == null) ? fVar : fVarA;
    }

    public static final e0 b(r7.c cVar, o7.f desc) {
        kotlin.jvm.internal.t.g(cVar, "<this>");
        kotlin.jvm.internal.t.g(desc, "desc");
        o7.j jVarE = desc.e();
        if (jVarE instanceof o7.d) {
            return e0.POLY_OBJ;
        }
        if (kotlin.jvm.internal.t.c(jVarE, o7.k.b.f31005a)) {
            return e0.LIST;
        }
        if (!kotlin.jvm.internal.t.c(jVarE, o7.k.c.f31006a)) {
            return e0.OBJ;
        }
        o7.f fVarA = a(desc.i(0), cVar.a());
        o7.j jVarE2 = fVarA.e();
        if ((jVarE2 instanceof o7.e) || kotlin.jvm.internal.t.c(jVarE2, o7.j.b.f31003a)) {
            return e0.MAP;
        }
        if (cVar.e().b()) {
            return e0.LIST;
        }
        throw C.d(fVarA);
    }
}
