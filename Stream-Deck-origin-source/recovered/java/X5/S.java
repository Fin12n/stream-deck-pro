package X5;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class S extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(String header) {
        super("Header(s) " + header + " are controlled by the engine and cannot be set explicitly");
        kotlin.jvm.internal.t.g(header, "header");
    }
}
