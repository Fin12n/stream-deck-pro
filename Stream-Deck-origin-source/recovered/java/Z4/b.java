package Z4;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f12902a = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f12903b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Z4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class EnumC0322b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnumC0322b f12904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EnumC0322b f12905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumC0322b[] f12906c;

        /* JADX INFO: renamed from: Z4.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public final enum a extends EnumC0322b {
            public a(String str, int i8) {
                super(str, i8);
            }

            @Override // Z4.b.EnumC0322b
            public boolean a() {
                return !b.c();
            }
        }

        /* JADX INFO: renamed from: Z4.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public final enum C0323b extends EnumC0322b {
            public C0323b(String str, int i8) {
                super(str, i8);
            }

            @Override // Z4.b.EnumC0322b
            public boolean a() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f12904a = aVar;
            C0323b c0323b = new C0323b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f12905b = c0323b;
            f12906c = new EnumC0322b[]{aVar, c0323b};
        }

        public EnumC0322b(String str, int i8) {
            super(str, i8);
        }

        public static EnumC0322b valueOf(String str) {
            return (EnumC0322b) Enum.valueOf(EnumC0322b.class, str);
        }

        public static EnumC0322b[] values() {
            return (EnumC0322b[]) f12906c.clone();
        }

        public abstract boolean a();
    }

    public static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f12902a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return Z4.a.a() || f12903b.get();
    }
}
