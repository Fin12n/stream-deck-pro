package p011b1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: b1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1757e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15737b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1757e() {
        boolean z8 = false;
        this(z8, z8, 3, null);
    }

    public final boolean a() {
        return this.f15737b;
    }

    public final boolean b() {
        return this.f15736a;
    }

    public final void c(boolean z8) {
        this.f15737b = z8;
    }

    public final void d(boolean z8) {
        this.f15736a = z8;
    }

    public C1757e(boolean z8, boolean z9) {
        this.f15736a = z8;
        this.f15737b = z9;
    }

    public /* synthetic */ C1757e(boolean z8, boolean z9, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? false : z9);
    }
}
