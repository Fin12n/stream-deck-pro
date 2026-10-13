package U6;

import java.util.Random;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends U6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f10242c = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // U6.a
    public Random j() {
        Object obj = this.f10242c.get();
        t.f(obj, "get(...)");
        return (Random) obj;
    }
}
