package H;

import D6.C0938s;
import android.util.Size;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f3061e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h1 f3062f = h1.DEFAULT;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b[] f3063g = {b.f3072e, b.f3074g, b.f3075h, b.f3077j, b.f3078k, b.f3071d};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map f3064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f3065i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f3066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f3067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f3068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3069d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ j1 c(a aVar, d dVar, b bVar, h1 h1Var, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                h1Var = j1.f3062f;
            }
            return aVar.b(dVar, bVar, h1Var);
        }

        public static /* synthetic */ j1 g(a aVar, int i8, Size size, k1 k1Var, int i9, c cVar, h1 h1Var, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                i9 = 0;
            }
            int i11 = i9;
            if ((i10 & 16) != 0) {
                cVar = c.CAPTURE_SESSION_TABLES;
            }
            c cVar2 = cVar;
            if ((i10 & 32) != 0) {
                h1Var = j1.f3062f;
            }
            return aVar.f(i8, size, k1Var, i11, cVar2, h1Var);
        }

        public final j1 a(d type, b size) {
            kotlin.jvm.internal.t.g(type, "type");
            kotlin.jvm.internal.t.g(size, "size");
            return c(this, type, size, null, 4, null);
        }

        public final j1 b(d type, b size, h1 streamUseCase) {
            kotlin.jvm.internal.t.g(type, "type");
            kotlin.jvm.internal.t.g(size, "size");
            kotlin.jvm.internal.t.g(streamUseCase, "streamUseCase");
            return new j1(type, size, streamUseCase);
        }

        public final d d(int i8) {
            d dVar = (d) j1.f3065i.get(Integer.valueOf(i8));
            return dVar == null ? d.PRIV : dVar;
        }

        public final j1 e(int i8, Size size, k1 surfaceSizeDefinition) {
            kotlin.jvm.internal.t.g(size, "size");
            kotlin.jvm.internal.t.g(surfaceSizeDefinition, "surfaceSizeDefinition");
            return g(this, i8, size, surfaceSizeDefinition, 0, null, null, 56, null);
        }

        public final j1 f(int i8, Size size, k1 surfaceSizeDefinition, int i9, c configSource, h1 streamUseCase) {
            kotlin.jvm.internal.t.g(size, "size");
            kotlin.jvm.internal.t.g(surfaceSizeDefinition, "surfaceSizeDefinition");
            kotlin.jvm.internal.t.g(configSource, "configSource");
            kotlin.jvm.internal.t.g(streamUseCase, "streamUseCase");
            d dVarD = d(i8);
            b bVar = b.f3084q;
            int iB = P.d.b(size);
            if (i9 == 1) {
                if (iB <= P.d.b(surfaceSizeDefinition.m(i8))) {
                    bVar = b.f3072e;
                } else if (iB <= P.d.b(surfaceSizeDefinition.k(i8))) {
                    bVar = b.f3076i;
                }
            } else if (configSource == c.FEATURE_COMBINATION_TABLE) {
                Size sizeG = surfaceSizeDefinition.g(i8);
                for (b bVar2 : j1.f3063g) {
                    if (kotlin.jvm.internal.t.c(size, bVar2.c())) {
                        bVar = bVar2;
                        break;
                    }
                }
                if (bVar == b.f3084q && kotlin.jvm.internal.t.c(size, sizeG)) {
                    bVar = b.f3080m;
                }
            } else if (iB <= P.d.b(surfaceSizeDefinition.b())) {
                bVar = b.f3070c;
            } else if (iB <= P.d.b(surfaceSizeDefinition.i())) {
                bVar = b.f3073f;
            } else if (iB <= P.d.b(surfaceSizeDefinition.j())) {
                bVar = b.f3079l;
            } else {
                Size sizeG2 = surfaceSizeDefinition.g(i8);
                Size sizeO = surfaceSizeDefinition.o(i8);
                if ((sizeG2 == null || iB <= P.d.b(sizeG2)) && i9 != 2) {
                    bVar = b.f3080m;
                } else if (sizeO != null && iB <= P.d.b(sizeO)) {
                    bVar = b.f3083p;
                }
            }
            return b(dVarD, bVar, streamUseCase);
        }

        public a() {
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f3073f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f3079l;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final /* synthetic */ b[] f3085r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final /* synthetic */ J6.a f3086s;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Size f3088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f3070c = new b("VGA", 0, 0, new Size(640, 480));

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f3071d = new b("X_VGA", 1, 1, new Size(1024, 768));

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f3072e = new b("S720P_16_9", 2, 2, new Size(1280, 720));

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f3074g = new b("S1080P_4_3", 4, 4, new Size(1440, 1080));

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f3075h = new b("S1080P_16_9", 5, 5, new Size(1920, 1080));

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f3076i = new b("S1440P_4_3", 6, 6, new Size(1920, 1440));

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f3077j = new b("S1440P_16_9", 7, 7, new Size(2560, 1440));

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f3078k = new b("UHD", 8, 8, new Size(3840, 2160));

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f3080m = new b("MAXIMUM", 10, 10, null, 2, null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f3081n = new b("MAXIMUM_4_3", 11, 11, null, 2, null);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f3082o = new b("MAXIMUM_16_9", 12, 12, null, 2, null);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f3083p = new b("ULTRA_MAXIMUM", 13, 13, null, 2, null);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final b f3084q = new b("NOT_SUPPORT", 14, 14, null, 2, null);

        static {
            int i8 = 2;
            AbstractC2633k abstractC2633k = null;
            Size size = null;
            f3073f = new b("PREVIEW", 3, 3, size, i8, abstractC2633k);
            f3079l = new b("RECORD", 9, 9, size, i8, abstractC2633k);
            b[] bVarArrA = a();
            f3085r = bVarArrA;
            f3086s = J6.b.a(bVarArrA);
        }

        public b(String str, int i8, int i9, Size size) {
            super(str, i8);
            this.f3087a = i9;
            this.f3088b = size;
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{f3070c, f3071d, f3072e, f3073f, f3074g, f3075h, f3076i, f3077j, f3078k, f3079l, f3080m, f3081n, f3082o, f3083p, f3084q};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f3085r.clone();
        }

        public final int b() {
            return this.f3087a;
        }

        public final Size c() {
            return this.f3088b;
        }

        public /* synthetic */ b(String str, int i8, int i9, Size size, int i10, AbstractC2633k abstractC2633k) {
            this(str, i8, i9, (i10 & 2) != 0 ? null : size);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum c {
        FEATURE_COMBINATION_TABLE,
        CAPTURE_SESSION_TABLES;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ J6.a f3092d = J6.b.a(a());
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum d {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ J6.a f3099g = J6.b.a(a());
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3100a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f3073f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f3079l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f3080m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f3081n.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.f3082o.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.f3083p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.f3084q.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f3100a = iArr;
        }
    }

    static {
        Map mapJ = D6.M.j(C6.v.a(d.YUV, 35), C6.v.a(d.JPEG, 256), C6.v.a(d.JPEG_R, 4101), C6.v.a(d.RAW, 32), C6.v.a(d.PRIV, 34));
        f3064h = mapJ;
        Set<Map.Entry> setEntrySet = mapJ.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(W6.n.d(D6.L.d(C0938s.y(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (d) entry.getKey());
        }
        f3065i = linkedHashMap;
    }

    public j1(d configType, b configSize, h1 streamUseCase) {
        kotlin.jvm.internal.t.g(configType, "configType");
        kotlin.jvm.internal.t.g(configSize, "configSize");
        kotlin.jvm.internal.t.g(streamUseCase, "streamUseCase");
        this.f3066a = configType;
        this.f3067b = configSize;
        this.f3068c = streamUseCase;
        Integer num = (Integer) f3064h.get(configType);
        this.f3069d = num != null ? num.intValue() : 0;
    }

    public static final j1 c(d dVar, b bVar) {
        return f3061e.a(dVar, bVar);
    }

    public static final j1 d(d dVar, b bVar, h1 h1Var) {
        return f3061e.b(dVar, bVar, h1Var);
    }

    public static final d f(int i8) {
        return f3061e.d(i8);
    }

    public static final j1 k(int i8, Size size, k1 k1Var) {
        return f3061e.e(i8, size, k1Var);
    }

    public static final j1 l(int i8, Size size, k1 k1Var, int i9, c cVar, h1 h1Var) {
        return f3061e.f(i8, size, k1Var, i9, cVar, h1Var);
    }

    public final b e() {
        return this.f3067b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.f3066a == j1Var.f3066a && this.f3067b == j1Var.f3067b && this.f3068c == j1Var.f3068c;
    }

    public final int g() {
        return this.f3069d;
    }

    public final Size h(k1 definition) {
        Size sizeI;
        kotlin.jvm.internal.t.g(definition, "definition");
        switch (e.f3100a[this.f3067b.ordinal()]) {
            case 1:
                sizeI = definition.i();
                break;
            case 2:
                sizeI = definition.j();
                break;
            case 3:
                sizeI = definition.g(this.f3069d);
                break;
            case 4:
                sizeI = definition.e(this.f3069d);
                break;
            case 5:
                sizeI = definition.c(this.f3069d);
                break;
            case 6:
                sizeI = definition.o(this.f3069d);
                break;
            case 7:
                throw new IllegalStateException("Not supported config size");
            default:
                sizeI = this.f3067b.c();
                break;
        }
        kotlin.jvm.internal.t.d(sizeI);
        return sizeI;
    }

    public int hashCode() {
        return (((this.f3066a.hashCode() * 31) + this.f3067b.hashCode()) * 31) + this.f3068c.hashCode();
    }

    public final h1 i() {
        return this.f3068c;
    }

    public final boolean j(j1 other) {
        h1 h1Var;
        kotlin.jvm.internal.t.g(other, "other");
        if (other.f3067b.b() > this.f3067b.b() || other.f3066a != this.f3066a) {
            return false;
        }
        h1 h1Var2 = this.f3068c;
        h1 h1Var3 = h1.DEFAULT;
        return h1Var2 == h1Var3 || (h1Var = other.f3068c) == h1Var3 || h1Var == h1Var2;
    }

    public String toString() {
        return "SurfaceConfig(configType=" + this.f3066a + ", configSize=" + this.f3067b + ", streamUseCase=" + this.f3068c + ')';
    }

    public /* synthetic */ j1(d dVar, b bVar, h1 h1Var, int i8, AbstractC2633k abstractC2633k) {
        this(dVar, bVar, (i8 & 4) != 0 ? f3062f : h1Var);
    }
}
