package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B0 f18731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B0 f18732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B0 f18733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final B0 f18734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final B0 f18735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final B0 f18736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final B0 f18737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final B0 f18738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final B0 f18739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final B0 f18740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ B0[] f18741n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f18742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f18743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18744c;

    static {
        B0 b8 = new B0("VOID", 0, Void.class, Void.class, null);
        f18731d = b8;
        Class cls = Integer.TYPE;
        B0 b9 = new B0("INT", 1, cls, Integer.class, 0);
        f18732e = b9;
        B0 b10 = new B0("LONG", 2, Long.TYPE, Long.class, 0L);
        f18733f = b10;
        B0 b11 = new B0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f18734g = b11;
        B0 b12 = new B0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f18735h = b12;
        B0 b13 = new B0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f18736i = b13;
        B0 b14 = new B0("STRING", 6, String.class, String.class, "");
        f18737j = b14;
        B0 b15 = new B0("BYTE_STRING", 7, S.class, S.class, S.f18819b);
        f18738k = b15;
        B0 b16 = new B0("ENUM", 8, cls, Integer.class, null);
        f18739l = b16;
        B0 b17 = new B0("MESSAGE", 9, Object.class, Object.class, null);
        f18740m = b17;
        f18741n = new B0[]{b8, b9, b10, b11, b12, b13, b14, b15, b16, b17};
    }

    public B0(String str, int i8, Class cls, Class cls2, Object obj) {
        super(str, i8);
        this.f18742a = cls;
        this.f18743b = cls2;
        this.f18744c = obj;
    }

    public static B0[] values() {
        return (B0[]) f18741n.clone();
    }

    public final Class a() {
        return this.f18743b;
    }
}
