package r7;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f32539a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32540b = a.f32541b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements o7.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f32541b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f32542c = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o7.f f32543a = p125n7.a.h(l.f32576a).getDescriptor();

        @Override // o7.f
        public String a() {
            return f32542c;
        }

        @Override // o7.f
        public boolean c() {
            return this.f32543a.c();
        }

        @Override // o7.f
        public int d(String name) {
            kotlin.jvm.internal.t.g(name, "name");
            return this.f32543a.d(name);
        }

        @Override // o7.f
        public o7.j e() {
            return this.f32543a.e();
        }

        @Override // o7.f
        public int f() {
            return this.f32543a.f();
        }

        @Override // o7.f
        public String g(int i8) {
            return this.f32543a.g(i8);
        }

        @Override // o7.f
        public List getAnnotations() {
            return this.f32543a.getAnnotations();
        }

        @Override // o7.f
        public List h(int i8) {
            return this.f32543a.h(i8);
        }

        @Override // o7.f
        public o7.f i(int i8) {
            return this.f32543a.i(i8);
        }

        @Override // o7.f
        public boolean isInline() {
            return this.f32543a.isInline();
        }

        @Override // o7.f
        public boolean j(int i8) {
            return this.f32543a.j(i8);
        }
    }

    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        m.g(decoder);
        return new d((List) p125n7.a.h(l.f32576a).deserialize(decoder));
    }

    @Override // p116m7.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(p7.f encoder, d value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        m.h(encoder);
        p125n7.a.h(l.f32576a).serialize(encoder, value);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32540b;
    }
}
