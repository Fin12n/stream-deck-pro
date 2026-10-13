package O4;

import V.ocy.SVzBK;

/* JADX INFO: renamed from: O4.o5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1477o5 extends AbstractC1504s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8381c;

    public /* synthetic */ C1477o5(String str, boolean z8, int i8, AbstractC1463m5 abstractC1463m5) {
        this.f8379a = str;
        this.f8380b = z8;
        this.f8381c = i8;
    }

    @Override // O4.AbstractC1504s5
    public final int a() {
        return this.f8381c;
    }

    @Override // O4.AbstractC1504s5
    public final String b() {
        return this.f8379a;
    }

    @Override // O4.AbstractC1504s5
    public final boolean c() {
        return this.f8380b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1504s5) {
            AbstractC1504s5 abstractC1504s5 = (AbstractC1504s5) obj;
            if (this.f8379a.equals(abstractC1504s5.b()) && this.f8380b == abstractC1504s5.c() && this.f8381c == abstractC1504s5.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8379a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f8380b ? 1237 : 1231)) * 1000003) ^ this.f8381c;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f8379a + ", enableFirelog=" + this.f8380b + SVzBK.slIYf + this.f8381c + "}";
    }
}
