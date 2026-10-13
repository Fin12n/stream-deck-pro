package I2;

import C6.m;
import D6.C0934n;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f3747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f3748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f3749g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3750a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3750a = iArr;
        }
    }

    @Override // I2.h
    public Object a() throws l {
        int i8 = a.f3750a[this.f3748f.ordinal()];
        if (i8 == 1) {
            throw this.f3749g;
        }
        if (i8 == 2) {
            this.f3747e.a(this.f3745c, b(this.f3744b, this.f3746d));
            return null;
        }
        if (i8 == 3) {
            return null;
        }
        throw new m();
    }

    @Override // I2.h
    public h c(String message, Q6.k condition) {
        t.g(message, "message");
        t.g(condition, "condition");
        return this;
    }

    public f(Object value, String tag, String message, g gVar, j verificationMode) {
        t.g(value, "value");
        t.g(tag, "tag");
        t.g(message, "message");
        t.g(gVar, uYOhHhTXuF.dNXDOAKTjQT);
        t.g(verificationMode, "verificationMode");
        this.f3744b = value;
        this.f3745c = tag;
        this.f3746d = message;
        this.f3747e = gVar;
        this.f3748f = verificationMode;
        l lVar = new l(b(value, message));
        StackTraceElement[] stackTrace = lVar.getStackTrace();
        t.f(stackTrace, "stackTrace");
        lVar.setStackTrace((StackTraceElement[]) C0934n.K(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.f3749g = lVar;
    }
}
