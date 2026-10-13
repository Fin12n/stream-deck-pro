package o7;

import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f30966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X6.d f30967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30968c;

    public c(f original, X6.d kClass) {
        t.g(original, "original");
        t.g(kClass, "kClass");
        this.f30966a = original;
        this.f30967b = kClass;
        this.f30968c = original.a() + '<' + kClass.d() + '>';
    }

    @Override // o7.f
    public String a() {
        return this.f30968c;
    }

    @Override // o7.f
    public boolean c() {
        return this.f30966a.c();
    }

    @Override // o7.f
    public int d(String name) {
        t.g(name, "name");
        return this.f30966a.d(name);
    }

    @Override // o7.f
    public j e() {
        return this.f30966a.e();
    }

    public boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && t.c(this.f30966a, cVar.f30966a) && t.c(cVar.f30967b, this.f30967b);
    }

    @Override // o7.f
    public int f() {
        return this.f30966a.f();
    }

    @Override // o7.f
    public String g(int i8) {
        return this.f30966a.g(i8);
    }

    @Override // o7.f
    public List getAnnotations() {
        return this.f30966a.getAnnotations();
    }

    @Override // o7.f
    public List h(int i8) {
        return this.f30966a.h(i8);
    }

    public int hashCode() {
        return (this.f30967b.hashCode() * 31) + a().hashCode();
    }

    @Override // o7.f
    public f i(int i8) {
        return this.f30966a.i(i8);
    }

    @Override // o7.f
    public boolean isInline() {
        return this.f30966a.isInline();
    }

    @Override // o7.f
    public boolean j(int i8) {
        return this.f30966a.j(i8);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f30967b + ", original: " + this.f30966a + ')';
    }
}
