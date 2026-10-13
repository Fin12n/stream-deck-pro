package G0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2601a;

    public b() {
        this(0, 1, null);
    }

    public final int a() {
        return this.f2601a;
    }

    public final void b(int i8) {
        this.f2601a += i8;
    }

    public final void c(int i8) {
        this.f2601a = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f2601a == ((b) obj).f2601a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f2601a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f2601a + ')';
    }

    public b(int i8) {
        this.f2601a = i8;
    }

    public /* synthetic */ b(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 0 : i8);
    }
}
