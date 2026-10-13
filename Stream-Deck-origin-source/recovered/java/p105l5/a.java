package p105l5;

import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29212a;

    public a(String str, int i8) {
        super(AbstractC3207p.f(str, "Provided message must not be empty."));
        this.f29212a = i8;
    }

    public int a() {
        return this.f29212a;
    }

    public a(String str, int i8, Throwable th) {
        super(AbstractC3207p.f(str, "Provided message must not be empty."), th);
        this.f29212a = i8;
    }
}
