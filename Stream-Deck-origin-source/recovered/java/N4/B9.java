package N4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B9 extends F9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6233c;

    public /* synthetic */ B9(String str, boolean z8, int i8, A9 a9) {
        this.f6231a = str;
        this.f6232b = z8;
        this.f6233c = i8;
    }

    @Override // N4.F9
    public final int a() {
        return this.f6233c;
    }

    @Override // N4.F9
    public final String b() {
        return this.f6231a;
    }

    @Override // N4.F9
    public final boolean c() {
        return this.f6232b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F9) {
            F9 f9 = (F9) obj;
            if (this.f6231a.equals(f9.b()) && this.f6232b == f9.c() && this.f6233c == f9.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f6231a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f6232b ? 1237 : 1231)) * 1000003) ^ this.f6233c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f6231a + ", enableFirelog=" + this.f6232b + ", firelogEventType=" + this.f6233c + "}";
    }
}
