package X5;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String headerName, int i8) {
        super("Header name '" + headerName + "' contains illegal character '" + headerName.charAt(i8) + "' (code " + (headerName.charAt(i8) & 255) + ')');
        kotlin.jvm.internal.t.g(headerName, "headerName");
        this.f12039a = headerName;
        this.f12040b = i8;
    }
}
