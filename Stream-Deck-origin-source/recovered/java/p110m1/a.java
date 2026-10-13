package p110m1;

import C6.InterfaceC0919h;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0919h f29490b;

    public a(String str, InterfaceC0919h interfaceC0919h) {
        this.f29489a = str;
        this.f29490b = interfaceC0919h;
    }

    public final InterfaceC0919h a() {
        return this.f29490b;
    }

    public final String b() {
        return this.f29489a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.c(this.f29489a, aVar.f29489a) && t.c(this.f29490b, aVar.f29490b);
    }

    public int hashCode() {
        String str = this.f29489a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC0919h interfaceC0919h = this.f29490b;
        return iHashCode + (interfaceC0919h != null ? interfaceC0919h.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f29489a + ", action=" + this.f29490b + ')';
    }
}
