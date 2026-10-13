package q7;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class H0 implements o7.f, InterfaceC2852n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.f f32031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f32033c;

    public H0(o7.f original) {
        kotlin.jvm.internal.t.g(original, "original");
        this.f32031a = original;
        this.f32032b = original.a() + '?';
        this.f32033c = AbstractC2870w0.a(original);
    }

    @Override // o7.f
    public String a() {
        return this.f32032b;
    }

    @Override // q7.InterfaceC2852n
    public Set b() {
        return this.f32033c;
    }

    @Override // o7.f
    public boolean c() {
        return true;
    }

    @Override // o7.f
    public int d(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        return this.f32031a.d(name);
    }

    @Override // o7.f
    public o7.j e() {
        return this.f32031a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H0) && kotlin.jvm.internal.t.c(this.f32031a, ((H0) obj).f32031a);
    }

    @Override // o7.f
    public int f() {
        return this.f32031a.f();
    }

    @Override // o7.f
    public String g(int i8) {
        return this.f32031a.g(i8);
    }

    @Override // o7.f
    public List getAnnotations() {
        return this.f32031a.getAnnotations();
    }

    @Override // o7.f
    public List h(int i8) {
        return this.f32031a.h(i8);
    }

    public int hashCode() {
        return this.f32031a.hashCode() * 31;
    }

    @Override // o7.f
    public o7.f i(int i8) {
        return this.f32031a.i(i8);
    }

    @Override // o7.f
    public boolean isInline() {
        return this.f32031a.isInline();
    }

    @Override // o7.f
    public boolean j(int i8) {
        return this.f32031a.j(i8);
    }

    public final o7.f k() {
        return this.f32031a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32031a);
        sb.append('?');
        return sb.toString();
    }
}
