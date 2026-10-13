package Z5;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p221z6.g f12926a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends p221z6.f {
        @Override // p221z6.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public char[] b0() {
            return new char[2048];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends p221z6.d {
        public b() {
            super(4096);
        }

        @Override // p221z6.d
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public char[] t() {
            return new char[2048];
        }
    }

    static {
        f12926a = c.a() ? new a() : new b();
    }

    public static final p221z6.g a() {
        return f12926a;
    }
}
