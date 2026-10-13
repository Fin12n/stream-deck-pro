package M4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class A extends E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5531c;

    public /* synthetic */ A(String str, boolean z8, int i8, AbstractC1071z abstractC1071z) {
        this.f5529a = str;
        this.f5530b = z8;
        this.f5531c = i8;
    }

    @Override // M4.E
    public final int a() {
        return this.f5531c;
    }

    @Override // M4.E
    public final String b() {
        return this.f5529a;
    }

    @Override // M4.E
    public final boolean c() {
        return this.f5530b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof E) {
            E e8 = (E) obj;
            if (this.f5529a.equals(e8.b()) && this.f5530b == e8.c() && this.f5531c == e8.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f5529a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f5530b ? 1237 : 1231)) * 1000003) ^ this.f5531c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f5529a + ", enableFirelog=" + this.f5530b + ", firelogEventType=" + this.f5531c + "}";
    }
}
