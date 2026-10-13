package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
public final class G2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G2 f17953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G2 f17954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G2 f17955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final G2 f17956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final G2 f17957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final G2 f17958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final G2 f17959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final G2 f17960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final G2 f17961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final G2 f17962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final G2 f17963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final G2 f17964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final G2 f17965n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final G2 f17966o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final G2 f17967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final G2 f17968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final G2 f17969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final G2 f17970s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ G2[] f17971t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H2 f17972a;

    static {
        G2 g8 = new G2("DOUBLE", 0, H2.DOUBLE, 1);
        f17953b = g8;
        G2 g9 = new G2("FLOAT", 1, H2.FLOAT, 5);
        f17954c = g9;
        H2 h8 = H2.LONG;
        G2 g10 = new G2("INT64", 2, h8, 0);
        f17955d = g10;
        G2 g11 = new G2("UINT64", 3, h8, 0);
        f17956e = g11;
        H2 h9 = H2.INT;
        G2 g12 = new G2("INT32", 4, h9, 0);
        f17957f = g12;
        G2 g13 = new G2("FIXED64", 5, h8, 1);
        f17958g = g13;
        G2 g14 = new G2("FIXED32", 6, h9, 5);
        f17959h = g14;
        G2 g15 = new G2("BOOL", 7, H2.BOOLEAN, 0);
        f17960i = g15;
        G2 g16 = new G2("STRING", 8, H2.STRING, 2);
        f17961j = g16;
        H2 h10 = H2.MESSAGE;
        G2 g17 = new G2("GROUP", 9, h10, 3);
        f17962k = g17;
        G2 g18 = new G2("MESSAGE", 10, h10, 2);
        f17963l = g18;
        G2 g19 = new G2("BYTES", 11, H2.BYTE_STRING, 2);
        f17964m = g19;
        G2 g20 = new G2("UINT32", 12, h9, 0);
        f17965n = g20;
        G2 g21 = new G2("ENUM", 13, H2.ENUM, 0);
        f17966o = g21;
        G2 g22 = new G2("SFIXED32", 14, h9, 5);
        f17967p = g22;
        G2 g23 = new G2("SFIXED64", 15, h8, 1);
        f17968q = g23;
        G2 g24 = new G2("SINT32", 16, h9, 0);
        f17969r = g24;
        G2 g25 = new G2("SINT64", 17, h8, 0);
        f17970s = g25;
        f17971t = new G2[]{g8, g9, g10, g11, g12, g13, g14, g15, g16, g17, g18, g19, g20, g21, g22, g23, g24, g25};
    }

    public G2(String str, int i8, H2 h8, int i9) {
        super(str, i8);
        this.f17972a = h8;
    }

    public static G2[] values() {
        return (G2[]) f17971t.clone();
    }

    public final H2 a() {
        return this.f17972a;
    }
}
