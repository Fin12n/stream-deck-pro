package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1968v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC1968v1 f18671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC1968v1 f18672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC1968v1 f18673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC1968v1 f18674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC1968v1 f18675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC1968v1 f18676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC1968v1 f18677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final EnumC1968v1 f18678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final EnumC1968v1 f18679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final EnumC1968v1 f18680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC1968v1[] f18681l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f18682a;

    static {
        EnumC1968v1 enumC1968v1 = new EnumC1968v1("VOID", 0, Void.class, Void.class, null);
        f18671b = enumC1968v1;
        Class cls = Integer.TYPE;
        EnumC1968v1 enumC1968v2 = new EnumC1968v1("INT", 1, cls, Integer.class, 0);
        f18672c = enumC1968v2;
        EnumC1968v1 enumC1968v3 = new EnumC1968v1("LONG", 2, Long.TYPE, Long.class, 0L);
        f18673d = enumC1968v3;
        EnumC1968v1 enumC1968v4 = new EnumC1968v1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f18674e = enumC1968v4;
        EnumC1968v1 enumC1968v5 = new EnumC1968v1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f18675f = enumC1968v5;
        EnumC1968v1 enumC1968v6 = new EnumC1968v1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f18676g = enumC1968v6;
        EnumC1968v1 enumC1968v7 = new EnumC1968v1("STRING", 6, String.class, String.class, "");
        f18677h = enumC1968v7;
        EnumC1968v1 enumC1968v8 = new EnumC1968v1("BYTE_STRING", 7, J0.class, J0.class, J0.f17985b);
        f18678i = enumC1968v8;
        EnumC1968v1 enumC1968v9 = new EnumC1968v1("ENUM", 8, cls, Integer.class, null);
        f18679j = enumC1968v9;
        EnumC1968v1 enumC1968v10 = new EnumC1968v1("MESSAGE", 9, Object.class, Object.class, null);
        f18680k = enumC1968v10;
        f18681l = new EnumC1968v1[]{enumC1968v1, enumC1968v2, enumC1968v3, enumC1968v4, enumC1968v5, enumC1968v6, enumC1968v7, enumC1968v8, enumC1968v9, enumC1968v10};
    }

    public EnumC1968v1(String str, int i8, Class cls, Class cls2, Object obj) {
        super(str, i8);
        this.f18682a = cls2;
    }

    public static EnumC1968v1[] values() {
        return (EnumC1968v1[]) f18681l.clone();
    }

    public final Class a() {
        return this.f18682a;
    }
}
