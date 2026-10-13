package q7;

import I0.mIk.efuWFSeiT;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Q {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p116m7.b f32056a;

        public a(p116m7.b bVar) {
            this.f32056a = bVar;
        }

        @Override // q7.K
        public p116m7.b[] childSerializers() {
            return new p116m7.b[]{this.f32056a};
        }

        @Override // p116m7.a
        public Object deserialize(p7.e decoder) {
            kotlin.jvm.internal.t.g(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // p116m7.k
        public void serialize(p7.f encoder, Object obj) {
            kotlin.jvm.internal.t.g(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // q7.K
        public p116m7.b[] typeParametersSerializers() {
            return K.a.a(this);
        }

        @Override // p116m7.b, p116m7.k, p116m7.a
        public o7.f getDescriptor() {
            throw new IllegalStateException(efuWFSeiT.hDnvYQjqh);
        }
    }

    public static final o7.f a(String name, p116m7.b primitiveSerializer) {
        kotlin.jvm.internal.t.g(name, "name");
        kotlin.jvm.internal.t.g(primitiveSerializer, "primitiveSerializer");
        return new P(name, new a(primitiveSerializer));
    }
}
