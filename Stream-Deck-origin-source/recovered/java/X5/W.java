package X5;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class W {
    public static final String a(T t8) {
        kotlin.jvm.internal.t.g(t8, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append(b(t8));
        if (t8.m() == 0 || t8.m() == t8.l().d()) {
            sb.append(t8.g());
        } else {
            sb.append(Q.i(t8));
        }
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String b(T t8) {
        kotlin.jvm.internal.t.g(t8, "<this>");
        StringBuilder sb = new StringBuilder();
        Q.g(sb, t8.f(), t8.c());
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
