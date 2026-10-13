package A5;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g<R> implements m {
    private int _hashCode;
    private final boolean isOptional;
    private final String qualifier;
    private final Type type;

    public /* synthetic */ g(boolean z8, String str, AbstractC2633k abstractC2633k) {
        this(z8, str);
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
    /* JADX INFO: renamed from: getQualifier-ibIqLKo */
    public String mo13getQualifieribIqLKo() {
        return this.qualifier;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        if (this._hashCode == 0) {
            int iD = n.f854a.d(this.type);
            this._hashCode = iD;
            int i8 = iD * 31;
            String strMo13getQualifieribIqLKo = mo13getQualifieribIqLKo();
            this._hashCode = i8 + (strMo13getQualifieribIqLKo != null ? j.e(strMo13getQualifieribIqLKo) : 0);
        }
        return this._hashCode;
    }

    @Override // A5.m
    public boolean isOptional() {
        return this.isOptional;
    }

    public String toString() {
        Type type = this.type;
        String strMo13getQualifieribIqLKo = mo13getQualifieribIqLKo();
        return "GenericClassTypeKey(" + type + ", " + (strMo13getQualifieribIqLKo == null ? "null" : j.f(strMo13getQualifieribIqLKo)) + ")";
    }

    @Override // A5.m
    public boolean typeEquals(m other) {
        t.g(other, "other");
        if (other == this) {
            return true;
        }
        if (other instanceof a) {
            return n.f854a.a(((a) other).a(), this.type);
        }
        if (other instanceof g) {
            return n.f854a.a(this.type, ((g) other).type);
        }
        return false;
    }

    public g(boolean z8, String str) {
        this.isOptional = z8;
        this.qualifier = str;
        Type genericSuperclass = getClass().getGenericSuperclass();
        t.e(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        t.f(type, "get(...)");
        this.type = type;
    }

    public /* synthetic */ g(boolean z8, String str, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? null : str, null);
    }
}
