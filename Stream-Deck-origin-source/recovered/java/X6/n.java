package X6;

import R0.pkXL.Oitvkwcwn;
import Z.JTT.ryTuoS;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12042c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f12043d = new n(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f12044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f12045b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final n a(m type) {
            t.g(type, "type");
            return new n(o.INVARIANT, type);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12046a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12046a = iArr;
        }
    }

    public final o a() {
        return this.f12044a;
    }

    public final m b() {
        return this.f12045b;
    }

    public final m c() {
        return this.f12045b;
    }

    public final o d() {
        return this.f12044a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f12044a == nVar.f12044a && t.c(this.f12045b, nVar.f12045b);
    }

    public int hashCode() {
        o oVar = this.f12044a;
        int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        m mVar = this.f12045b;
        return iHashCode + (mVar != null ? mVar.hashCode() : 0);
    }

    public String toString() {
        o oVar = this.f12044a;
        int i8 = oVar == null ? -1 : b.f12046a[oVar.ordinal()];
        if (i8 == -1) {
            return "*";
        }
        if (i8 == 1) {
            return String.valueOf(this.f12045b);
        }
        if (i8 == 2) {
            return "in " + this.f12045b;
        }
        if (i8 != 3) {
            throw new C6.m();
        }
        return Oitvkwcwn.NXcXS + this.f12045b;
    }

    public n(o oVar, m mVar) {
        boolean z8;
        String str;
        this.f12044a = oVar;
        this.f12045b = mVar;
        if (oVar == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 == (mVar == null)) {
            return;
        }
        if (oVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + oVar + ryTuoS.WSTYfXnsBPsL;
        }
        throw new IllegalArgumentException(str.toString());
    }
}
