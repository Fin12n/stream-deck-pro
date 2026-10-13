package p014b4;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15847a;

    public c() {
        this(false, 1, null);
    }

    public final boolean a() {
        return this.f15847a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f15847a == ((c) obj).f15847a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f15847a);
    }

    public String toString() {
        return "ThemeInfo(isDarkTheme=" + this.f15847a + ")";
    }

    public c(boolean z8) {
        this.f15847a = z8;
    }

    public /* synthetic */ c(boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8);
    }
}
