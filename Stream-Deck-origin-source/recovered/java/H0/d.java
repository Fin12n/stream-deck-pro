package H0;

import Z6.C1694a;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3326a;

    public d() {
        this(0, 1, null);
    }

    public final int a() {
        return this.f3326a;
    }

    public final void b(int i8) {
        this.f3326a = i8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.f3326a);
        sb.append(")@");
        String string = Integer.toString(hashCode(), C1694a.a(16));
        t.f(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        return sb.toString();
    }

    public d(int i8) {
        this.f3326a = i8;
    }

    public /* synthetic */ d(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 0 : i8);
    }
}
