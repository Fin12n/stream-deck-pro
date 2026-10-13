package A5;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f810d;

    public /* synthetic */ a(Class cls, boolean z8, String str, AbstractC2633k abstractC2633k) {
        this(cls, z8, str);
    }

    public final Class a() {
        return this.f807a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public boolean equals(Object obj) {
        boolean zD;
        if (obj instanceof m) {
            m mVar = (m) obj;
            String strMo13getQualifieribIqLKo = mVar.mo13getQualifieribIqLKo();
            String strMo13getQualifieribIqLKo2 = mo13getQualifieribIqLKo();
            if (strMo13getQualifieribIqLKo == null) {
                if (strMo13getQualifieribIqLKo2 == null) {
                    zD = true;
                } else {
                    zD = false;
                }
            } else if (strMo13getQualifieribIqLKo2 == null) {
                zD = false;
            } else {
                zD = j.d(strMo13getQualifieribIqLKo, strMo13getQualifieribIqLKo2);
            }
            if (zD && typeEquals(mVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // A5.m
    /* JADX INFO: renamed from: getQualifier-ibIqLKo, reason: not valid java name */
    public String mo13getQualifieribIqLKo() {
        return this.f809c;
    }

    public int hashCode() {
        if (this.f810d == 0) {
            n nVar = n.f854a;
            Class cls = this.f807a;
            String strMo13getQualifieribIqLKo = mo13getQualifieribIqLKo();
            this.f810d = nVar.c(cls, strMo13getQualifieribIqLKo != null ? j.a(strMo13getQualifieribIqLKo) : null);
        }
        return this.f810d;
    }

    @Override // A5.m
    public boolean isOptional() {
        return this.f808b;
    }

    public String toString() {
        String name = this.f807a.getName();
        String strMo13getQualifieribIqLKo = mo13getQualifieribIqLKo();
        return "TypeKey(" + name + ", qualifier = " + (strMo13getQualifieribIqLKo == null ? "null" : j.f(strMo13getQualifieribIqLKo)) + ", isOptional = " + isOptional() + ")";
    }

    @Override // A5.m
    public boolean typeEquals(m other) {
        t.g(other, "other");
        if (other == this) {
            return true;
        }
        if (other instanceof g) {
            return n.f854a.a(this.f807a, ((g) other).getType());
        }
        if (other instanceof a) {
            return t.c(((a) other).f807a, this.f807a);
        }
        return false;
    }

    public a(Class type, boolean z8, String str) {
        t.g(type, "type");
        this.f807a = type;
        this.f808b = z8;
        this.f809c = str;
    }

    public /* synthetic */ a(Class cls, boolean z8, String str, int i8, AbstractC2633k abstractC2633k) {
        this(cls, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? null : str, null);
    }
}
