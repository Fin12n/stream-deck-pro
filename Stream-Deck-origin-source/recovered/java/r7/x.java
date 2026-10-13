package r7;

import io.sentry.exception.uXy.SZCvugJaXc;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements p116m7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f32597a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.f f32598b = a.f32599b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements o7.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f32599b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f32600c = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o7.f f32601a = p125n7.a.k(p125n7.a.J(O.f28784a), l.f32576a).getDescriptor();

        @Override // o7.f
        public String a() {
            return f32600c;
        }

        @Override // o7.f
        public boolean c() {
            return this.f32601a.c();
        }

        @Override // o7.f
        public o7.j e() {
            return this.f32601a.e();
        }

        @Override // o7.f
        public int f() {
            return this.f32601a.f();
        }

        @Override // o7.f
        public String g(int i8) {
            return this.f32601a.g(i8);
        }

        @Override // o7.f
        public List getAnnotations() {
            return this.f32601a.getAnnotations();
        }

        @Override // o7.f
        public List h(int i8) {
            return this.f32601a.h(i8);
        }

        @Override // o7.f
        public o7.f i(int i8) {
            return this.f32601a.i(i8);
        }

        @Override // o7.f
        public boolean isInline() {
            return this.f32601a.isInline();
        }

        @Override // o7.f
        public boolean j(int i8) {
            return this.f32601a.j(i8);
        }

        @Override // o7.f
        public int d(String str) {
            kotlin.jvm.internal.t.g(str, SZCvugJaXc.yzyyX);
            return this.f32601a.d(str);
        }
    }

    @Override // p116m7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w deserialize(p7.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        m.g(decoder);
        return new w((Map) p125n7.a.k(p125n7.a.J(O.f28784a), l.f32576a).deserialize(decoder));
    }

    @Override // p116m7.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(p7.f encoder, w value) {
        kotlin.jvm.internal.t.g(encoder, "encoder");
        kotlin.jvm.internal.t.g(value, "value");
        m.h(encoder);
        p125n7.a.k(p125n7.a.J(O.f28784a), l.f32576a).serialize(encoder, value);
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public o7.f getDescriptor() {
        return f32598b;
    }
}
