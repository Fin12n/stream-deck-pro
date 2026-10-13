package C6;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {
    public static final Object a(Throwable exception) {
        kotlin.jvm.internal.t.g(exception, "exception");
        return new q.b(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof q.b) {
            throw ((q.b) obj).f1443a;
        }
    }
}
