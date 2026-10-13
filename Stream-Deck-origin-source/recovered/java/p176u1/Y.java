package p176u1;

import p128o1.C2739d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34417a = a.f34418a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f34418a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Y f34419b = new Y() { // from class: u1.X
            @Override // p176u1.Y
            public final W a(C2739d c2739d) {
                return Y.a.b(c2739d);
            }
        };

        public static final W b(C2739d c2739d) {
            return new W(c2739d, D.f34350a.a());
        }

        public final Y c() {
            return f34419b;
        }
    }

    W a(C2739d c2739d);
}
