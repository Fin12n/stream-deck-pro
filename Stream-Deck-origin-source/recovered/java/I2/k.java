package I2;

import Z6.w;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f3760f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f3761g = new k(0, 0, 0, "");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f3762h = new k(0, 1, 0, "");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f3763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k f3764j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C6.j f3769e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final k a() {
            return k.f3762h;
        }

        public final k b(String str) {
            String strGroup;
            if (str != null && !w.b0(str)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                    int i8 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    if (strGroup2 != null) {
                        int i9 = Integer.parseInt(strGroup2);
                        String strGroup3 = matcher.group(3);
                        if (strGroup3 != null) {
                            int i10 = Integer.parseInt(strGroup3);
                            String description = matcher.group(4) != null ? matcher.group(4) : "";
                            t.f(description, "description");
                            return new k(i8, i9, i10, description, null);
                        }
                    }
                }
            }
            return null;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BigInteger invoke() {
            return BigInteger.valueOf(k.this.d()).shiftLeft(32).or(BigInteger.valueOf(k.this.e())).shiftLeft(32).or(BigInteger.valueOf(k.this.j()));
        }
    }

    static {
        k kVar = new k(1, 0, 0, "");
        f3763i = kVar;
        f3764j = kVar;
    }

    public /* synthetic */ k(int i8, int i9, int i10, String str, AbstractC2633k abstractC2633k) {
        this(i8, i9, i10, str);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(k other) {
        t.g(other, "other");
        return c().compareTo(other.c());
    }

    public final BigInteger c() {
        Object value = this.f3769e.getValue();
        t.f(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public final int d() {
        return this.f3765a;
    }

    public final int e() {
        return this.f3766b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f3765a == kVar.f3765a && this.f3766b == kVar.f3766b && this.f3767c == kVar.f3767c;
    }

    public int hashCode() {
        return ((((527 + this.f3765a) * 31) + this.f3766b) * 31) + this.f3767c;
    }

    public final int j() {
        return this.f3767c;
    }

    public String toString() {
        String str;
        if (w.b0(this.f3768d)) {
            str = "";
        } else {
            str = '-' + this.f3768d;
        }
        return this.f3765a + com.amazon.a.a.o.c.a.b.f16789a + this.f3766b + com.amazon.a.a.o.c.a.b.f16789a + this.f3767c + str;
    }

    public k(int i8, int i9, int i10, String str) {
        this.f3765a = i8;
        this.f3766b = i9;
        this.f3767c = i10;
        this.f3768d = str;
        this.f3769e = C6.k.b(new b());
    }
}
