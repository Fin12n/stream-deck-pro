package r7;

import C6.G;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f32576a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32577b = o7.i.d("kotlinx.serialization.json.JsonElement", o7.d.b.f30970a, new o7.f[0], a.f32578a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32578a = new a();

        /* JADX INFO: renamed from: r7.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0722a extends kotlin.jvm.internal.u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0722a f32579a = new C0722a();

            public C0722a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o7.f invoke() {
                return z.f32602a.getDescriptor();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends kotlin.jvm.internal.u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f32580a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o7.f invoke() {
                return v.f32593a.getDescriptor();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends kotlin.jvm.internal.u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f32581a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o7.f invoke() {
                return r.f32588a.getDescriptor();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d extends kotlin.jvm.internal.u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f32582a = new d();

            public d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o7.f invoke() {
                return x.f32597a.getDescriptor();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class e extends kotlin.jvm.internal.u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f32583a = new e();

            public e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o7.f invoke() {
                return r7.e.f32539a.getDescriptor();
            }
        }

        public a() {
            super(1);
        }

        public final void b(o7.a buildSerialDescriptor) {
            kotlin.jvm.internal.t.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
            o7.a.b(buildSerialDescriptor, "JsonPrimitive", m.f(C0722a.f32579a), null, false, 12, null);
            o7.a.b(buildSerialDescriptor, "JsonNull", m.f(b.f32580a), null, false, 12, null);
            o7.a.b(buildSerialDescriptor, "JsonLiteral", m.f(c.f32581a), null, false, 12, null);
            o7.a.b(buildSerialDescriptor, "JsonObject", m.f(d.f32582a), null, false, 12, null);
            o7.a.b(buildSerialDescriptor, "JsonArray", m.f(e.f32583a), null, false, 12, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((o7.a) obj);
            return G.f1419a;
        }
    }

    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public j deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return m.d(decoder).m();
    }

    @Override // p116m7.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(p7.f encoder, j value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        m.h(encoder);
        if (value instanceof y) {
            encoder.n(z.f32602a, value);
        } else if (value instanceof w) {
            encoder.n(x.f32597a, value);
        } else if (value instanceof d) {
            encoder.n(e.f32539a, value);
        }
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32577b;
    }
}
