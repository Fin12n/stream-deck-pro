package com.google.protobuf;

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
public final class D {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f19103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D f19104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D f19105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final D f19106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D f19107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final D f19108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final D f19109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final D f19110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final D f19111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final D f19112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ D[] f19113n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f19114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f19115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f19116c;

    static {
        D d8 = new D("VOID", 0, Void.class, Void.class, null);
        f19103d = d8;
        Class cls = Integer.TYPE;
        D d9 = new D("INT", 1, cls, Integer.class, 0);
        f19104e = d9;
        D d10 = new D("LONG", 2, Long.TYPE, Long.class, 0L);
        f19105f = d10;
        D d11 = new D("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f19106g = d11;
        D d12 = new D("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f19107h = d12;
        D d13 = new D("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f19108i = d13;
        D d14 = new D("STRING", 6, String.class, String.class, "");
        f19109j = d14;
        D d15 = new D("BYTE_STRING", 7, AbstractC2097h.class, AbstractC2097h.class, AbstractC2097h.f19285b);
        f19110k = d15;
        D d16 = new D("ENUM", 8, cls, Integer.class, null);
        f19111l = d16;
        D d17 = new D("MESSAGE", 9, Object.class, Object.class, null);
        f19112m = d17;
        f19113n = new D[]{d8, d9, d10, d11, d12, d13, d14, d15, d16, d17};
    }

    public D(String str, int i8, Class cls, Class cls2, Object obj) {
        super(str, i8);
        this.f19114a = cls;
        this.f19115b = cls2;
        this.f19116c = obj;
    }

    public static D valueOf(String str) {
        return (D) java.lang.Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f19113n.clone();
    }

    public Class a() {
        return this.f19115b;
    }
}
