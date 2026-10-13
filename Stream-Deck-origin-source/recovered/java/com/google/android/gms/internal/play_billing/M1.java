package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
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
public final class M1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M1 f18777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M1 f18778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M1 f18779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final M1 f18780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final M1 f18781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final M1 f18782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final M1 f18783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final M1 f18784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final M1 f18785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final M1 f18786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final M1 f18787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final M1 f18788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final M1 f18789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final M1 f18790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final M1 f18791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final M1 f18792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final M1 f18793r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final M1 f18794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ M1[] f18795t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N1 f18796a;

    static {
        M1 m8 = new M1("DOUBLE", 0, N1.DOUBLE, 1);
        f18777b = m8;
        M1 m9 = new M1("FLOAT", 1, N1.FLOAT, 5);
        f18778c = m9;
        N1 n8 = N1.LONG;
        M1 m10 = new M1("INT64", 2, n8, 0);
        f18779d = m10;
        M1 m11 = new M1("UINT64", 3, n8, 0);
        f18780e = m11;
        N1 n9 = N1.INT;
        M1 m12 = new M1("INT32", 4, n9, 0);
        f18781f = m12;
        M1 m13 = new M1("FIXED64", 5, n8, 1);
        f18782g = m13;
        M1 m14 = new M1("FIXED32", 6, n9, 5);
        f18783h = m14;
        M1 m15 = new M1("BOOL", 7, N1.BOOLEAN, 0);
        f18784i = m15;
        M1 m16 = new M1("STRING", 8, N1.STRING, 2);
        f18785j = m16;
        N1 n10 = N1.MESSAGE;
        M1 m17 = new M1("GROUP", 9, n10, 3);
        f18786k = m17;
        M1 m18 = new M1("MESSAGE", 10, n10, 2);
        f18787l = m18;
        M1 m19 = new M1("BYTES", 11, N1.BYTE_STRING, 2);
        f18788m = m19;
        M1 m20 = new M1("UINT32", 12, n9, 0);
        f18789n = m20;
        M1 m21 = new M1("ENUM", 13, N1.ENUM, 0);
        f18790o = m21;
        M1 m22 = new M1("SFIXED32", 14, n9, 5);
        f18791p = m22;
        M1 m23 = new M1("SFIXED64", 15, n8, 1);
        f18792q = m23;
        M1 m24 = new M1("SINT32", 16, n9, 0);
        f18793r = m24;
        M1 m25 = new M1("SINT64", 17, n8, 0);
        f18794s = m25;
        f18795t = new M1[]{m8, m9, m10, m11, m12, m13, m14, m15, m16, m17, m18, m19, m20, m21, m22, m23, m24, m25};
    }

    public M1(String str, int i8, N1 n8, int i9) {
        super(str, i8);
        this.f18796a = n8;
    }

    public static M1[] values() {
        return (M1[]) f18795t.clone();
    }

    public final N1 a() {
        return this.f18796a;
    }
}
