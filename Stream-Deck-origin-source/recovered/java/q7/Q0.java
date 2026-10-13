package q7;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Q0 implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p116m7.b f32057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p116m7.b f32058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p116m7.b f32059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o7.f f32060d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {
        public a() {
            super(1);
        }

        public final void b(o7.a buildClassSerialDescriptor) {
            kotlin.jvm.internal.t.g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            o7.a.b(buildClassSerialDescriptor, "first", Q0.this.f32057a.getDescriptor(), null, false, 12, null);
            o7.a.b(buildClassSerialDescriptor, "second", Q0.this.f32058b.getDescriptor(), null, false, 12, null);
            o7.a.b(buildClassSerialDescriptor, "third", Q0.this.f32059c.getDescriptor(), null, false, 12, null);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((o7.a) obj);
            return C6.G.f1419a;
        }
    }

    public Q0(p116m7.b aSerializer, p116m7.b bSerializer, p116m7.b cSerializer) {
        kotlin.jvm.internal.t.g(aSerializer, "aSerializer");
        kotlin.jvm.internal.t.g(bSerializer, "bSerializer");
        kotlin.jvm.internal.t.g(cSerializer, "cSerializer");
        this.f32057a = aSerializer;
        this.f32058b = bSerializer;
        this.f32059c = cSerializer;
        this.f32060d = o7.i.b("kotlin.Triple", new o7.f[0], new a());
    }

    public final C6.u d(p7.c cVar) {
        Object objC = p7.c.a.c(cVar, getDescriptor(), 0, this.f32057a, null, 8, null);
        Object objC2 = p7.c.a.c(cVar, getDescriptor(), 1, this.f32058b, null, 8, null);
        Object objC3 = p7.c.a.c(cVar, getDescriptor(), 2, this.f32059c, null, 8, null);
        cVar.c(getDescriptor());
        return new C6.u(objC, objC2, objC3);
    }

    public final C6.u e(p7.c cVar) {
        Object objC = R0.f32062a;
        Object objC2 = R0.f32062a;
        Object objC3 = R0.f32062a;
        while (true) {
            int iE = cVar.E(getDescriptor());
            if (iE == -1) {
                cVar.c(getDescriptor());
                if (objC == R0.f32062a) {
                    throw new p116m7.j("Element 'first' is missing");
                }
                if (objC2 == R0.f32062a) {
                    throw new p116m7.j("Element 'second' is missing");
                }
                if (objC3 != R0.f32062a) {
                    return new C6.u(objC, objC2, objC3);
                }
                throw new p116m7.j("Element 'third' is missing");
            }
            if (iE == 0) {
                objC = p7.c.a.c(cVar, getDescriptor(), 0, this.f32057a, null, 8, null);
            } else if (iE == 1) {
                objC2 = p7.c.a.c(cVar, getDescriptor(), 1, this.f32058b, null, 8, null);
            } else {
                if (iE != 2) {
                    throw new p116m7.j("Unexpected index " + iE);
                }
                objC3 = p7.c.a.c(cVar, getDescriptor(), 2, this.f32059c, null, 8, null);
            }
        }
    }

    @Override // p116m7.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C6.u deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        p7.c cVarB = decoder.b(getDescriptor());
        return cVarB.x() ? d(cVarB) : e(cVarB);
    }

    @Override // p116m7.k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void serialize(p7.f encoder, C6.u value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        p7.d dVarB = encoder.b(getDescriptor());
        dVarB.i(getDescriptor(), 0, this.f32057a, value.d());
        dVarB.i(getDescriptor(), 1, this.f32058b, value.e());
        dVarB.i(getDescriptor(), 2, this.f32059c, value.f());
        dVarB.c(getDescriptor());
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return this.f32060d;
    }
}
