package X5;

/* JADX INFO: renamed from: X5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1672a extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1672a(String value) {
        super("Bad Content-Type format: " + value);
        kotlin.jvm.internal.t.g(value, "value");
    }
}
