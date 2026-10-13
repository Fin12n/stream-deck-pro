package r7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p {
    public static final c a(c from, Q6.k builderAction) {
        kotlin.jvm.internal.t.g(from, "from");
        kotlin.jvm.internal.t.g(builderAction, "builderAction");
        f fVar = new f(from);
        builderAction.invoke(fVar);
        return new o(fVar.a(), fVar.b());
    }

    public static /* synthetic */ c b(c cVar, Q6.k kVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            cVar = c.f32534d;
        }
        return a(cVar, kVar);
    }
}
