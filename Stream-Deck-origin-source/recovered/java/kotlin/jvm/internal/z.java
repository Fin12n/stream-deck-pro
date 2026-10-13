package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements InterfaceC2630h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f28817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28818b;

    public z(Class<?> jClass, String moduleName) {
        t.g(jClass, "jClass");
        t.g(moduleName, "moduleName");
        this.f28817a = jClass;
        this.f28818b = moduleName;
    }

    public boolean equals(Object obj) {
        return (obj instanceof z) && t.c(h(), ((z) obj).h());
    }

    @Override // kotlin.jvm.internal.InterfaceC2630h
    public Class h() {
        return this.f28817a;
    }

    public int hashCode() {
        return h().hashCode();
    }

    public String toString() {
        return h().toString() + " (Kotlin reflection is not available)";
    }
}
