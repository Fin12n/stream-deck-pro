package p037e0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f19999a = new C2225v(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B f20000b = new C2225v(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B f20001c = new C2225v(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B f20002d = new B() { // from class: e0.C
        @Override // p037e0.B
        public final float a(float f8) {
            return D.b(f8);
        }
    };

    public static final B c() {
        return f20001c;
    }

    public static final B d() {
        return f19999a;
    }

    public static final B e() {
        return f20002d;
    }

    public static final B f() {
        return f20000b;
    }

    public static final float b(float f8) {
        return f8;
    }
}
