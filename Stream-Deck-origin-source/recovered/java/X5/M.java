package X5;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class M extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(String urlString, Throwable cause) {
        super("Fail to parse url: " + urlString, cause);
        kotlin.jvm.internal.t.g(urlString, "urlString");
        kotlin.jvm.internal.t.g(cause, "cause");
    }
}
