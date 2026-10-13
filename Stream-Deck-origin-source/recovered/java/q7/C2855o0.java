package q7;

import C6.C0920i;
import java.util.List;

/* JADX INFO: renamed from: q7.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2855o0 implements o7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2855o0 f32129a = new C2855o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o7.j f32130b = o7.k.d.f31007a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f32131c = "kotlin.Nothing";

    @Override // o7.f
    public String a() {
        return f32131c;
    }

    public final Void b() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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

    @Override // o7.f
    public o7.j e() {
        return f32130b;
    }

    public boolean equals(Object obj) {
        return this == obj;
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

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
