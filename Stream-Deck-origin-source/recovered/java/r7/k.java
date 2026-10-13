package r7;

import C6.C0920i;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.O;
import p201x2.vAk.hJroAgFztiMK;
import q7.Q;
import s7.C2917y;
import s7.a0;
import s7.b0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o7.f f32575a = Q.a("kotlinx.serialization.json.JsonUnquotedLiteral", p125n7.a.J(O.f28784a));

    public static final y a(Boolean bool) {
        return bool == null ? u.INSTANCE : new q(bool, false, null, 4, null);
    }

    public static final y b(Number number) {
        return number == null ? u.INSTANCE : new q(number, false, null, 4, null);
    }

    public static final y c(String str) {
        return str == null ? u.INSTANCE : new q(str, true, null, 4, null);
    }

    public static final Void d(j jVar, String str) {
        throw new IllegalArgumentException("Element " + K.b(jVar.getClass()) + " is not a " + str);
    }

    public static final Boolean f(y yVar) {
        kotlin.jvm.internal.t.g(yVar, "<this>");
        return b0.d(yVar.c());
    }

    public static final String g(y yVar) {
        kotlin.jvm.internal.t.g(yVar, "<this>");
        if (yVar instanceof u) {
            return null;
        }
        return yVar.c();
    }

    public static final double h(y yVar) {
        kotlin.jvm.internal.t.g(yVar, "<this>");
        return Double.parseDouble(yVar.c());
    }

    public static final Double i(y yVar) {
        kotlin.jvm.internal.t.g(yVar, "<this>");
        return Z6.t.j(yVar.c());
    }

    public static final float j(y yVar) {
        kotlin.jvm.internal.t.g(yVar, "<this>");
        return Float.parseFloat(yVar.c());
    }

    public static final Float k(y yVar) {
        kotlin.jvm.internal.t.g(yVar, "<this>");
        return Z6.t.k(yVar.c());
    }

    public static final int l(y yVar) {
        kotlin.jvm.internal.t.g(yVar, "<this>");
        try {
            long jM = new a0(yVar.c()).m();
            if (-2147483648L <= jM && jM <= 2147483647L) {
                return (int) jM;
            }
            throw new NumberFormatException(yVar.c() + " is not an Int");
        } catch (C2917y e8) {
            throw new NumberFormatException(e8.getMessage());
        }
    }

    public static final Integer m(y yVar) {
        Long lValueOf;
        kotlin.jvm.internal.t.g(yVar, "<this>");
        try {
            lValueOf = Long.valueOf(new a0(yVar.c()).m());
        } catch (C2917y unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final d n(j jVar) {
        kotlin.jvm.internal.t.g(jVar, "<this>");
        d dVar = jVar instanceof d ? (d) jVar : null;
        if (dVar != null) {
            return dVar;
        }
        d(jVar, "JsonArray");
        throw new C0920i();
    }

    public static final w o(j jVar) {
        kotlin.jvm.internal.t.g(jVar, "<this>");
        w wVar = jVar instanceof w ? (w) jVar : null;
        if (wVar != null) {
            return wVar;
        }
        d(jVar, "JsonObject");
        throw new C0920i();
    }

    public static final y p(j jVar) {
        kotlin.jvm.internal.t.g(jVar, "<this>");
        y yVar = jVar instanceof y ? (y) jVar : null;
        if (yVar != null) {
            return yVar;
        }
        d(jVar, "JsonPrimitive");
        throw new C0920i();
    }

    public static final o7.f q() {
        return f32575a;
    }

    public static final long r(y yVar) {
        kotlin.jvm.internal.t.g(yVar, "<this>");
        try {
            return new a0(yVar.c()).m();
        } catch (C2917y e8) {
            throw new NumberFormatException(e8.getMessage());
        }
    }

    public static final Long s(y yVar) {
        kotlin.jvm.internal.t.g(yVar, "<this>");
        try {
            return Long.valueOf(new a0(yVar.c()).m());
        } catch (C2917y unused) {
            return null;
        }
    }

    public static final boolean e(y yVar) {
        kotlin.jvm.internal.t.g(yVar, hJroAgFztiMK.OyJASUDmi);
        Boolean boolD = b0.d(yVar.c());
        if (boolD != null) {
            return boolD.booleanValue();
        }
        throw new IllegalStateException(yVar + " does not represent a Boolean");
    }
}
