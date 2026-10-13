package X5;

import com.revenuecat.purchases.common.Constants;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class K {
    public static final void b(Appendable appendable, String str, String str2) throws IOException {
        appendable.append("://");
        appendable.append(str);
        if (!Z6.w.F0(str2, '/', false, 2, null)) {
            appendable.append('/');
        }
        appendable.append(str2);
    }

    public static final void c(Appendable appendable, String str, String str2) throws IOException {
        appendable.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        appendable.append(str);
        appendable.append(str2);
    }

    public static final Appendable d(I i8, Appendable appendable) throws IOException {
        appendable.append(i8.o().e());
        String strE = i8.o().e();
        if (kotlin.jvm.internal.t.c(strE, "file")) {
            b(appendable, i8.j(), f(i8));
            return appendable;
        }
        if (kotlin.jvm.internal.t.c(strE, "mailto")) {
            c(appendable, g(i8), i8.j());
            return appendable;
        }
        appendable.append("://");
        appendable.append(e(i8));
        Q.e(appendable, f(i8), i8.e(), i8.p());
        if (i8.d().length() > 0) {
            appendable.append('#');
            appendable.append(i8.d());
        }
        return appendable;
    }

    public static final String e(I i8) {
        kotlin.jvm.internal.t.g(i8, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append(g(i8));
        sb.append(i8.j());
        if (i8.n() != 0 && i8.n() != i8.o().d()) {
            sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb.append(String.valueOf(i8.n()));
        }
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String f(I i8) {
        kotlin.jvm.internal.t.g(i8, "<this>");
        return h(i8.g());
    }

    public static final String g(I i8) {
        kotlin.jvm.internal.t.g(i8, "<this>");
        StringBuilder sb = new StringBuilder();
        Q.g(sb, i8.h(), i8.f());
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String h(List list) {
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            return ((CharSequence) D6.z.i0(list)).length() == 0 ? "/" : (String) D6.z.i0(list);
        }
        return D6.z.r0(list, "/", null, null, 0, null, null, 62, null);
    }

    public static final void i(I i8, String str, String str2, Integer num, String str3, Q6.k block) {
        kotlin.jvm.internal.t.g(i8, "<this>");
        kotlin.jvm.internal.t.g(block, "block");
        if (str != null) {
            i8.y(O.f11759c.a(str));
        }
        if (str2 != null) {
            i8.w(str2);
        }
        if (num != null) {
            i8.x(num.intValue());
        }
        if (str3 != null) {
            j(i8, str3);
        }
        block.invoke(i8);
    }

    public static final void j(I i8, String value) {
        List listD;
        kotlin.jvm.internal.t.g(i8, "<this>");
        kotlin.jvm.internal.t.g(value, "value");
        if (Z6.w.b0(value)) {
            listD = D6.r.n();
        } else {
            listD = kotlin.jvm.internal.t.c(value, "/") ? N.d() : D6.z.U0(Z6.w.z0(value, new char[]{'/'}, false, 0, 6, null));
        }
        i8.u(listD);
    }
}
