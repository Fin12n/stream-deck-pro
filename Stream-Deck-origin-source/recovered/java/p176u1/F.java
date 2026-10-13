package p176u1;

import Z6.v;
import kotlin.jvm.internal.AbstractC2633k;
import p128o1.C2739d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class F implements Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f34359b;

    public F() {
        this((char) 0, 1, null);
    }

    @Override // p176u1.Y
    public W a(C2739d c2739d) {
        return new W(new C2739d(v.z(String.valueOf(this.f34359b), c2739d.i().length()), null, null, 6, null), D.f34350a.a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F) && this.f34359b == ((F) obj).f34359b;
    }

    public int hashCode() {
        return Character.hashCode(this.f34359b);
    }

    public F(char c8) {
        this.f34359b = c8;
    }

    public /* synthetic */ F(char c8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? (char) 8226 : c8);
    }
}
