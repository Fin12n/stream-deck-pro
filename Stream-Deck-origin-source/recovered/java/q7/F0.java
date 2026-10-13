package q7;

import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C2626d;
import kotlin.jvm.internal.C2627e;
import kotlin.jvm.internal.C2629g;
import kotlin.jvm.internal.C2634l;
import kotlin.jvm.internal.C2635m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f32026a = D6.M.j(C6.v.a(kotlin.jvm.internal.K.b(String.class), p125n7.a.J(kotlin.jvm.internal.O.f28784a)), C6.v.a(kotlin.jvm.internal.K.b(Character.TYPE), p125n7.a.D(C2629g.f28804a)), C6.v.a(kotlin.jvm.internal.K.b(char[].class), p125n7.a.d()), C6.v.a(kotlin.jvm.internal.K.b(Double.TYPE), p125n7.a.E(C2634l.f28813a)), C6.v.a(kotlin.jvm.internal.K.b(double[].class), p125n7.a.e()), C6.v.a(kotlin.jvm.internal.K.b(Float.TYPE), p125n7.a.F(C2635m.f28814a)), C6.v.a(kotlin.jvm.internal.K.b(float[].class), p125n7.a.f()), C6.v.a(kotlin.jvm.internal.K.b(Long.TYPE), p125n7.a.H(kotlin.jvm.internal.v.f28816a)), C6.v.a(kotlin.jvm.internal.K.b(long[].class), p125n7.a.i()), C6.v.a(kotlin.jvm.internal.K.b(C6.A.class), p125n7.a.x(C6.A.f1408b)), C6.v.a(kotlin.jvm.internal.K.b(C6.B.class), p125n7.a.s()), C6.v.a(kotlin.jvm.internal.K.b(Integer.TYPE), p125n7.a.G(kotlin.jvm.internal.s.f28815a)), C6.v.a(kotlin.jvm.internal.K.b(int[].class), p125n7.a.g()), C6.v.a(kotlin.jvm.internal.K.b(C6.y.class), p125n7.a.w(C6.y.f1460b)), C6.v.a(kotlin.jvm.internal.K.b(C6.z.class), p125n7.a.r()), C6.v.a(kotlin.jvm.internal.K.b(Short.TYPE), p125n7.a.I(kotlin.jvm.internal.M.f28782a)), C6.v.a(kotlin.jvm.internal.K.b(short[].class), p125n7.a.o()), C6.v.a(kotlin.jvm.internal.K.b(C6.D.class), p125n7.a.y(C6.D.f1414b)), C6.v.a(kotlin.jvm.internal.K.b(C6.E.class), p125n7.a.t()), C6.v.a(kotlin.jvm.internal.K.b(Byte.TYPE), p125n7.a.C(C2627e.f28802a)), C6.v.a(kotlin.jvm.internal.K.b(byte[].class), p125n7.a.c()), C6.v.a(kotlin.jvm.internal.K.b(C6.w.class), p125n7.a.v(C6.w.f1455b)), C6.v.a(kotlin.jvm.internal.K.b(C6.x.class), p125n7.a.q()), C6.v.a(kotlin.jvm.internal.K.b(Boolean.TYPE), p125n7.a.B(C2626d.f28801a)), C6.v.a(kotlin.jvm.internal.K.b(boolean[].class), p125n7.a.b()), C6.v.a(kotlin.jvm.internal.K.b(C6.G.class), p125n7.a.z(C6.G.f1419a)), C6.v.a(kotlin.jvm.internal.K.b(Void.class), p125n7.a.l()), C6.v.a(kotlin.jvm.internal.K.b(p008a7.a.class), p125n7.a.A(p008a7.a.f13446b)));

    public static final o7.f a(String serialName, o7.e kind) {
        kotlin.jvm.internal.t.g(serialName, "serialName");
        kotlin.jvm.internal.t.g(kind, "kind");
        d(serialName);
        return new E0(serialName, kind);
    }

    public static final p116m7.b b(X6.d dVar) {
        kotlin.jvm.internal.t.g(dVar, "<this>");
        return (p116m7.b) f32026a.get(dVar);
    }

    public static final String c(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? Z6.b.f(cCharAt) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        kotlin.jvm.internal.t.f(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    public static final void d(String str) {
        Iterator it = f32026a.keySet().iterator();
        while (it.hasNext()) {
            String strD = ((X6.d) it.next()).d();
            kotlin.jvm.internal.t.d(strD);
            String strC = c(strD);
            if (Z6.v.v(str, "kotlin." + strC, true) || Z6.v.v(str, strC, true)) {
                throw new IllegalArgumentException(Z6.o.f("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + c(strC) + LYdqVGvOGMNr.Vryoxcj));
            }
        }
    }
}
