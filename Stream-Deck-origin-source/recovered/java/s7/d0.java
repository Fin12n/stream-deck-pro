package s7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d0 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.J f33270a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.internal.J j8) {
            super(1);
            this.f33270a = j8;
        }

        public final void b(r7.j it) {
            kotlin.jvm.internal.t.g(it, "it");
            this.f33270a.f28779a = it;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((r7.j) obj);
            return C6.G.f1419a;
        }
    }

    public static final boolean b(o7.f fVar) {
        return (fVar.e() instanceof o7.e) || fVar.e() == o7.j.b.f31003a;
    }

    public static final r7.j c(r7.c json, Object obj, p116m7.k serializer) {
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(serializer, "serializer");
        kotlin.jvm.internal.J j8 = new kotlin.jvm.internal.J();
        new N(json, new a(j8)).n(serializer, obj);
        Object obj2 = j8.f28779a;
        if (obj2 != null) {
            return (r7.j) obj2;
        }
        kotlin.jvm.internal.t.t("result");
        return null;
    }
}
