package M3;

import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface g {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final M3.a f5151a;

        public final M3.a a() {
            return this.f5151a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.t.c(this.f5151a, ((a) obj).f5151a);
        }

        public int hashCode() {
            return this.f5151a.hashCode();
        }

        public String toString() {
            return "Closed(reason=" + this.f5151a + ")";
        }

        public a(M3.a aVar) {
            kotlin.jvm.internal.t.g(aVar, GOKsbdzhLhXAMt.HozB);
            this.f5151a = aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5152a = new b();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 2101987936;
        }

        public String toString() {
            return "Connecting";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f5153a = new c();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 579148623;
        }

        public String toString() {
            return "Handshake";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f5154a = new d();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -572364420;
        }

        public String toString() {
            return "Idle";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f5155a = new e();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -555096837;
        }

        public String toString() {
            return "Ready";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f5156a = new f();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 1686283150;
        }

        public String toString() {
            return "Unauthenticated";
        }
    }

    /* JADX INFO: renamed from: M3.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0186g implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0186g f5157a = new C0186g();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0186g);
        }

        public int hashCode() {
            return -634958205;
        }

        public String toString() {
            return "VirtualDeviceOpen";
        }
    }
}
