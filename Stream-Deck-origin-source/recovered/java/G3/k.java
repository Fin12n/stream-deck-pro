package G3;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2754b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f2755c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f2756a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public k() {
        UUID uuidRandomUUID = UUID.randomUUID();
        t.f(uuidRandomUUID, "randomUUID(...)");
        this.f2756a = uuidRandomUUID;
        a aVar = f2754b;
        String string = uuidRandomUUID.toString();
        t.f(string, "toString(...)");
        V3.f.a(l.a(aVar, string));
    }

    public final UUID a() {
        return this.f2756a;
    }
}
