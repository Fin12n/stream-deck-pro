package q7;

import C6.C0920i;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class E0 implements o7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o7.e f32020b;

    public E0(String serialName, o7.e kind) {
        kotlin.jvm.internal.t.g(serialName, "serialName");
        kotlin.jvm.internal.t.g(kind, "kind");
        this.f32019a = serialName;
        this.f32020b = kind;
    }

    private final Void b() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // o7.f
    public String a() {
        return this.f32019a;
    }

    @Override // o7.f
    public boolean c() {
        return o7.f.a.c(this);
    }

    @Override // o7.f
    public int d(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        b();
        throw new C0920i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e8 = (E0) obj;
        return kotlin.jvm.internal.t.c(a(), e8.a()) && kotlin.jvm.internal.t.c(e(), e8.e());
    }

    @Override // o7.f
    public int f() {
        return 0;
    }

    @Override // o7.f
    public String g(int i8) {
        b();
        throw new C0920i();
    }

    @Override // o7.f
    public List getAnnotations() {
        return o7.f.a.a(this);
    }

    @Override // o7.f
    public List h(int i8) {
        b();
        throw new C0920i();
    }

    public int hashCode() {
        return a().hashCode() + (e().hashCode() * 31);
    }

    @Override // o7.f
    public o7.f i(int i8) {
        b();
        throw new C0920i();
    }

    @Override // o7.f
    public boolean isInline() {
        return o7.f.a.b(this);
    }

    @Override // o7.f
    public boolean j(int i8) {
        b();
        throw new C0920i();
    }

    @Override // o7.f
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public o7.e e() {
        return this.f32020b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + a() + ')';
    }
}
