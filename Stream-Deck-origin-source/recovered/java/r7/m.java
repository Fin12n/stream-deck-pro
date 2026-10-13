package r7;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements o7.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6.j f32584a;

        public a(Function0 function0) {
            this.f32584a = C6.k.b(function0);
        }

        @Override // o7.f
        public String a() {
            return b().a();
        }

        public final o7.f b() {
            return (o7.f) this.f32584a.getValue();
        }

        @Override // o7.f
        public boolean c() {
            return o7.f.a.c(this);
        }

        @Override // o7.f
        public int d(String name) {
            kotlin.jvm.internal.t.g(name, "name");
            return b().d(name);
        }

        @Override // o7.f
        public o7.j e() {
            return b().e();
        }

        @Override // o7.f
        public int f() {
            return b().f();
        }

        @Override // o7.f
        public String g(int i8) {
            return b().g(i8);
        }

        @Override // o7.f
        public List getAnnotations() {
            return o7.f.a.a(this);
        }

        @Override // o7.f
        public List h(int i8) {
            return b().h(i8);
        }

        @Override // o7.f
        public o7.f i(int i8) {
            return b().i(i8);
        }

        @Override // o7.f
        public boolean isInline() {
            return o7.f.a.b(this);
        }

        @Override // o7.f
        public boolean j(int i8) {
            return b().j(i8);
        }
    }

    public static final i d(p7.e eVar) {
        kotlin.jvm.internal.t.g(eVar, "<this>");
        i iVar = eVar instanceof i ? (i) eVar : null;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + K.b(eVar.getClass()));
    }

    public static final n e(p7.f fVar) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        n nVar = fVar instanceof n ? (n) fVar : null;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + K.b(fVar.getClass()));
    }

    public static final o7.f f(Function0 function0) {
        return new a(function0);
    }

    public static final void g(p7.e eVar) {
        d(eVar);
    }

    public static final void h(p7.f fVar) {
        e(fVar);
    }
}
