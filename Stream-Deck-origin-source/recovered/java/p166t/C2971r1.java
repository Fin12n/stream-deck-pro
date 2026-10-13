package p166t;

import p174u.n;

/* JADX INFO: renamed from: t.r1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2971r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33854a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f33855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33856c;

    public C2971r1(n nVar, int i8) {
        this.f33855b = nVar;
        this.f33856c = i8;
    }

    public int a() {
        int i8;
        synchronized (this.f33854a) {
            i8 = this.f33856c;
        }
        return i8;
    }

    public void b(int i8) {
        synchronized (this.f33854a) {
            this.f33856c = i8;
        }
    }
}
