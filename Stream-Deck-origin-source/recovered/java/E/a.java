package E;

import A.AbstractC0890p0;
import A.D0;
import A.J;
import A.T0;
import H.I;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends C.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0088a f1960i = new C0088a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final J f1961j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J f1962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f1963h;

    /* JADX INFO: renamed from: E.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0088a {
        public /* synthetic */ C0088a(AbstractC2633k abstractC2633k) {
            this();
        }

        public C0088a() {
        }
    }

    static {
        J SDR = J.f88d;
        t.f(SDR, "SDR");
        f1961j = SDR;
    }

    public a(J dynamicRange) {
        t.g(dynamicRange, "dynamicRange");
        this.f1962g = dynamicRange;
        this.f1963h = b.DYNAMIC_RANGE;
    }

    @Override // C.b
    public b c() {
        return this.f1963h;
    }

    @Override // C.b
    public boolean d(I cameraInfoInternal, D0 sessionConfig) {
        t.g(cameraInfoInternal, "cameraInfoInternal");
        t.g(sessionConfig, "sessionConfig");
        Set setC = cameraInfoInternal.c();
        t.f(setC, "getSupportedDynamicRanges(...)");
        AbstractC0890p0.a("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + setC + ", this = " + this);
        if (!setC.contains(this.f1962g)) {
            return false;
        }
        for (T0 t8 : sessionConfig.k()) {
            Set setA = t8.A(cameraInfoInternal);
            AbstractC0890p0.a("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + setA + ", this = " + this + ", useCases = " + t8);
            if (setA != null && !setA.contains(this.f1962g)) {
                return false;
            }
        }
        return true;
    }

    public final J f() {
        return this.f1962g;
    }

    public String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.f1962g + ')';
    }
}
