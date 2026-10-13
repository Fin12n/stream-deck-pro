package p109m0;

import Q6.k;

/* JADX INFO: renamed from: m0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2666d {

    /* JADX INFO: renamed from: m0.d$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f29375c;

        public a(int i8, int i9, Object obj) {
            this.f29373a = i8;
            this.f29374b = i9;
            this.f29375c = obj;
            if (i8 < 0) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i8).toString());
            }
            if (i9 > 0) {
                return;
            }
            throw new IllegalArgumentException(("size should be >0, but was " + i9).toString());
        }

        public final int a() {
            return this.f29374b;
        }

        public final int b() {
            return this.f29373a;
        }

        public final Object c() {
            return this.f29375c;
        }
    }

    void a(int i8, int i9, k kVar);

    a get(int i8);

    int k();
}
