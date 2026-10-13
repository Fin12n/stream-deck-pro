package p209y2;

import com.amazon.a.a.o.b.f;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f38237a = new String[0];

    public static final void a(StringBuilder builder, int i8) {
        t.g(builder, "builder");
        for (int i9 = 0; i9 < i8; i9++) {
            builder.append("?");
            if (i9 < i8 - 1) {
                builder.append(f.f16777a);
            }
        }
    }

    public static final StringBuilder b() {
        return new StringBuilder();
    }
}
