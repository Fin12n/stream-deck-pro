package p079i6;

import C6.j;
import C6.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f24741a = k.b(a.f24742a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24742a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p079i6.a invoke() {
            p079i6.a.C0568a c0568a = p079i6.a.f24737c;
            String property = System.getProperty("java.version");
            t.f(property, "getProperty(\"java.version\")");
            return c0568a.a(property);
        }
    }

    public static final p079i6.a a() {
        return (p079i6.a) f24741a.getValue();
    }
}
