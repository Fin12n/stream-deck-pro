package q7;

/* JADX INFO: renamed from: q7.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2862s0 extends X {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o7.f f32151c;

    /* JADX INFO: renamed from: q7.s0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p116m7.b f32152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p116m7.b f32153b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p116m7.b bVar, p116m7.b bVar2) {
            super(1);
            this.f32152a = bVar;
            this.f32153b = bVar2;
        }

        public final void b(o7.a buildClassSerialDescriptor) {
            kotlin.jvm.internal.t.g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            o7.a.b(buildClassSerialDescriptor, "first", this.f32152a.getDescriptor(), null, false, 12, null);
            o7.a.b(buildClassSerialDescriptor, "second", this.f32153b.getDescriptor(), null, false, 12, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((o7.a) obj);
            return C6.G.f1419a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2862s0(p116m7.b keySerializer, p116m7.b valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.t.g(keySerializer, "keySerializer");
        kotlin.jvm.internal.t.g(valueSerializer, "valueSerializer");
        this.f32151c = o7.i.b("kotlin.Pair", new o7.f[0], new a(keySerializer, valueSerializer));
    }

    @Override // q7.X
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object a(C6.o oVar) {
        kotlin.jvm.internal.t.g(oVar, "<this>");
        return oVar.c();
    }

    @Override // q7.X
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Object c(C6.o oVar) {
        kotlin.jvm.internal.t.g(oVar, "<this>");
        return oVar.d();
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return this.f32151c;
    }

    @Override // q7.X
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C6.o e(Object obj, Object obj2) {
        return C6.v.a(obj, obj2);
    }
}
